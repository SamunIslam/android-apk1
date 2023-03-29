package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcpw extends zzano {
    private zzcnl<zzanv, zzcot> zzgey;
    private final /* synthetic */ zzcpu zzggg;

    private zzcpw(zzcpu zzcpuVar, zzcnl<zzanv, zzcot> zzcnlVar) {
        this.zzggg = zzcpuVar;
        this.zzgey = zzcnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanp
    public final void zza(zzame zzameVar) throws RemoteException {
        zzcpu.zza(this.zzggg, zzameVar);
        this.zzgey.zzgel.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzanp
    public final void zzdo(String str) throws RemoteException {
        this.zzgey.zzgel.zzc(0, str);
    }
}
