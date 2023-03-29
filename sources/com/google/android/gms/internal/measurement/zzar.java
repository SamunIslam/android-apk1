package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
/* loaded from: classes.dex */
public final class zzar extends zzx.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzk zzd;
    private final /* synthetic */ zzx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzx zzxVar, Bundle bundle, zzk zzkVar) {
        super(zzxVar);
        this.zze = zzxVar;
        this.zzc = bundle;
        this.zzd = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws RemoteException {
        zzm zzmVar;
        zzmVar = this.zze.zzr;
        zzmVar.performAction(this.zzc, this.zzd, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    protected final void zzb() {
        this.zzd.zza((Bundle) null);
    }
}
