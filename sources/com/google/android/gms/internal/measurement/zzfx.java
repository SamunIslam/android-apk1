package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
abstract class zzfx {
    private static final zzfx zza = new zzfz();
    private static final zzfx zzb = new zzfy();

    private zzfx() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfx zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfx zzb() {
        return zzb;
    }
}
