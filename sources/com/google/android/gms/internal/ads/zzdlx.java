package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdlx implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final Object lock = new Object();
    private boolean zzgbr = false;
    private boolean zzgbs = false;
    private final zzdmr zzhbn;
    private final zzdmm zzhbo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlx(Context context, Looper looper, zzdmm zzdmmVar) {
        this.zzhbo = zzdmmVar;
        this.zzhbn = new zzdmr(context, looper, this, this, 12800000);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaul() {
        synchronized (this.lock) {
            if (!this.zzgbr) {
                this.zzgbr = true;
                this.zzhbn.checkAvailabilityAndConnect();
            }
        }
    }

    private final void zzaot() {
        synchronized (this.lock) {
            if (this.zzhbn.isConnected() || this.zzhbn.isConnecting()) {
                this.zzhbn.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.lock) {
            if (this.zzgbs) {
                return;
            }
            this.zzgbs = true;
            try {
                this.zzhbn.zzaux().zza(new zzdmp(this.zzhbo.toByteArray()));
                zzaot();
            } catch (Exception unused) {
                zzaot();
            } catch (Throwable th) {
                zzaot();
                throw th;
            }
        }
    }
}
