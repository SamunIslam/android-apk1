package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbjh implements zzegz<zzdly> {
    private final zzehm<Context> zzenp;

    public zzbjh(zzehm<Context> zzehmVar) {
        this.zzenp = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzdly) zzehf.zza(new zzdly(this.zzenp.get(), com.google.android.gms.ads.internal.zzq.zzlk().zzxx()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
