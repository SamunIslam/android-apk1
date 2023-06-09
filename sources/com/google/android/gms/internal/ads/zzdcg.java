package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcg implements zzdak<zzdcd> {
    private ApplicationInfo applicationInfo;
    private boolean zzdpf;
    private ScheduledExecutorService zzfky;
    private zzalc zzgmy;

    public zzdcg(zzalc zzalcVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.zzgmy = zzalcVar;
        this.zzfky = scheduledExecutorService;
        this.zzdpf = z;
        this.applicationInfo = applicationInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdcd> zzaqa() {
        if (!zzabc.zzcvn.get().booleanValue()) {
            return zzdqw.immediateFailedFuture(new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.zzdpf) {
            return zzdqw.immediateFailedFuture(new Exception("Auto Collect Location is false."));
        }
        return zzdqw.zzb(zzdqw.zza(this.zzgmy.zza(this.applicationInfo), ((Long) zzvj.zzpv().zzd(zzzz.zzcpg)).longValue(), TimeUnit.MILLISECONDS, this.zzfky), zzdcf.zzdsc, zzbab.zzdzr);
    }
}
