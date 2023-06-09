package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqj;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqj implements zzegz<zzcqg> {
    private final zzehm<zzbgy> zzfpu;
    private final zzehm<zzbqj.zza> zzfpv;
    private final zzehm<zzbuj> zzfpw;

    public zzcqj(zzehm<zzbgy> zzehmVar, zzehm<zzbqj.zza> zzehmVar2, zzehm<zzbuj> zzehmVar3) {
        this.zzfpu = zzehmVar;
        this.zzfpv = zzehmVar2;
        this.zzfpw = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcqg(this.zzfpu.get(), this.zzfpv.get(), this.zzfpw.get());
    }
}
