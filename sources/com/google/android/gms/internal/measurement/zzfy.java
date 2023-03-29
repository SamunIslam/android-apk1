package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzfy extends zzfx {
    private zzfy() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfx
    public final <L> List<L> zza(Object obj, long j) {
        zzfk zzc = zzc(obj, j);
        if (zzc.zza()) {
            return zzc;
        }
        int size = zzc.size();
        zzfk zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzia.zza(obj, j, zza);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfx
    public final void zzb(Object obj, long j) {
        zzc(obj, j).j_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.measurement.zzfk] */
    @Override // com.google.android.gms.internal.measurement.zzfx
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzfk<E> zzc = zzc(obj, j);
        zzfk<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzfk<E> zzfkVar = zzc;
        zzfkVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zza = zzc.zza();
            zzfk<E> zzfkVar2 = zzc;
            if (!zza) {
                zzfkVar2 = zzc.zza(size2 + size);
            }
            zzfkVar2.addAll(zzc2);
            zzfkVar = zzfkVar2;
        }
        if (size > 0) {
            zzc2 = zzfkVar;
        }
        zzia.zza(obj, j, zzc2);
    }

    private static <E> zzfk<E> zzc(Object obj, long j) {
        return (zzfk) zzia.zzf(obj, j);
    }
}
