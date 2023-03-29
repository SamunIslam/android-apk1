package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzhe {
    private static final Class<?> zza = zzd();
    private static final zzhu<?, ?> zzb = zza(false);
    private static final zzhu<?, ?> zzc = zza(true);
    private static final zzhu<?, ?> zzd = new zzhw();

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzfd.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzg(i, list, z);
    }

    public static void zzb(int i, List<Float> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzf(i, list, z);
    }

    public static void zzc(int i, List<Long> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Long> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zze(i, list, z);
    }

    public static void zzg(int i, List<Long> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzl(i, list, z);
    }

    public static void zzh(int i, List<Integer> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zza(i, list, z);
    }

    public static void zzi(int i, List<Integer> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzir zzirVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzi(i, list, z);
    }

    public static void zza(int i, List<String> list, zzir zzirVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zza(i, list);
    }

    public static void zzb(int i, List<zzdv> list, zzir zzirVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzb(i, list);
    }

    public static void zza(int i, List<?> list, zzir zzirVar, zzhc zzhcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zza(i, list, zzhcVar);
    }

    public static void zzb(int i, List<?> list, zzir zzirVar, zzhc zzhcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzirVar.zzb(i, list, zzhcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgb) {
            zzgb zzgbVar = (zzgb) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zzd(zzgbVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgb) {
            zzgb zzgbVar = (zzgb) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zze(zzgbVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgb) {
            zzgb zzgbVar = (zzgb) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zzf(zzgbVar.zzb(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzff) {
            zzff zzffVar = (zzff) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zzk(zzffVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zzk(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzff) {
            zzff zzffVar = (zzff) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zzf(zzffVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zzf(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzff) {
            zzff zzffVar = (zzff) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zzg(zzffVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zzg(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzff) {
            zzff zzffVar = (zzff) list;
            i = 0;
            while (i2 < size) {
                i += zzek.zzh(zzffVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzek.zzh(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzek.zze(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzek.zzi(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzek.zzg(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzek.zzb(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list) {
        int zzb2;
        int zzb3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzek.zze(i) * size;
        if (list instanceof zzfu) {
            zzfu zzfuVar = (zzfu) list;
            while (i2 < size) {
                Object zzb4 = zzfuVar.zzb(i2);
                if (zzb4 instanceof zzdv) {
                    zzb3 = zzek.zzb((zzdv) zzb4);
                } else {
                    zzb3 = zzek.zzb((String) zzb4);
                }
                zze += zzb3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzdv) {
                    zzb2 = zzek.zzb((zzdv) obj);
                } else {
                    zzb2 = zzek.zzb((String) obj);
                }
                zze += zzb2;
                i2++;
            }
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, Object obj, zzhc zzhcVar) {
        if (obj instanceof zzfs) {
            return zzek.zza(i, (zzfs) obj);
        }
        return zzek.zzb(i, (zzgn) obj, zzhcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, List<?> list, zzhc zzhcVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzek.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzfs) {
                zza2 = zzek.zza((zzfs) obj);
            } else {
                zza2 = zzek.zza((zzgn) obj, zzhcVar);
            }
            zze += zza2;
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzdv> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzek.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzek.zzb(list.get(i2));
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, List<zzgn> list, zzhc zzhcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzek.zzc(i, list.get(i3), zzhcVar);
        }
        return i2;
    }

    public static zzhu<?, ?> zza() {
        return zzb;
    }

    public static zzhu<?, ?> zzb() {
        return zzc;
    }

    public static zzhu<?, ?> zzc() {
        return zzd;
    }

    private static zzhu<?, ?> zza(boolean z) {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzhu) zze.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zza(zzgg zzggVar, T t, T t2, long j) {
        zzia.zza(t, j, zzggVar.zza(zzia.zzf(t, j), zzia.zzf(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends zzev<FT>> void zza(zzes<FT> zzesVar, T t, T t2) {
        zzet<FT> zza2 = zzesVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzesVar.zzb(t).zza(zza2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zza(zzhu<UT, UB> zzhuVar, T t, T t2) {
        zzhuVar.zza(t, zzhuVar.zzc(zzhuVar.zzb(t), zzhuVar.zzb(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, List<Integer> list, zzfj zzfjVar, UB ub, zzhu<UT, UB> zzhuVar) {
        if (zzfjVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfjVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzhuVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfjVar.zza(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzhuVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zza(int i, int i2, UB ub, zzhu<UT, UB> zzhuVar) {
        if (ub == null) {
            ub = zzhuVar.zza();
        }
        zzhuVar.zza((zzhu<UT, UB>) ub, i, i2);
        return ub;
    }
}
