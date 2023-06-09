package com.google.android.gms.internal.ads;

import com.marutiappsolution.tipsforsonylive.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzabt {
    public static zzaaz<Long> zzcxn = zzaaz.zzb("gads:dynamite_load:fail:sample_rate", 10000L);
    public static zzaaz<Boolean> zzcxo = zzaaz.zzf("gads:report_dynamite_crash_in_background_thread", false);
    public static zzaaz<String> zzcxp = zzaaz.zzi("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME);
    public static zzaaz<String> zzcxq = zzaaz.zzi("gads:sdk_crash_report_class_prefix", "com.google.");
    public static zzaaz<Boolean> zzcxr = zzaaz.zzf("gads:sdk_crash_report_enabled", false);
    public static zzaaz<Boolean> zzcxs = zzaaz.zzf("gads:sdk_crash_report_full_stacktrace", false);
    public static zzaaz<Double> zzcxt = zzaaz.zzb("gads:trapped_exception_sample_rate", 0.01d);
}
