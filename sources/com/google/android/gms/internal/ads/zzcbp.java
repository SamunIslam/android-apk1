package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbp implements zzegz<zzcaf> {
    private final zzehm<zzcbk> zzeyg;
    private final zzcbm zzfum;

    public zzcbp(zzcbm zzcbmVar, zzehm<zzcbk> zzehmVar) {
        this.zzfum = zzcbmVar;
        this.zzeyg = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcaf) zzehf.zza(this.zzeyg.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
