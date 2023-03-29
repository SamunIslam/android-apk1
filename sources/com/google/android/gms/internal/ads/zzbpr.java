package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpr implements zzegz<zzbvt<zzbtt>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzchn> zzfhv;

    private zzbpr(zzehm<zzchn> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfhv = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzbpr zzl(zzehm<zzchn> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzbpr(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
