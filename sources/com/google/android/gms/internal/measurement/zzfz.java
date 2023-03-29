package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzfz extends zzfx {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfz() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfx
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfx
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzia.zzf(obj, j);
        if (list instanceof zzfu) {
            unmodifiableList = ((zzfu) list).i_();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgz) && (list instanceof zzfk)) {
                zzfk zzfkVar = (zzfk) list;
                if (zzfkVar.zza()) {
                    zzfkVar.j_();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzia.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzfv zzfvVar;
        List<L> arrayList;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            if (zzc instanceof zzfu) {
                arrayList = new zzfv(i);
            } else if ((zzc instanceof zzgz) && (zzc instanceof zzfk)) {
                arrayList = ((zzfk) zzc).zza(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzia.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(zzc.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzc.size() + i);
            arrayList2.addAll(zzc);
            zzia.zza(obj, j, arrayList2);
            zzfvVar = arrayList2;
        } else if (zzc instanceof zzhz) {
            zzfv zzfvVar2 = new zzfv(zzc.size() + i);
            zzfvVar2.addAll((zzhz) zzc);
            zzia.zza(obj, j, zzfvVar2);
            zzfvVar = zzfvVar2;
        } else if ((zzc instanceof zzgz) && (zzc instanceof zzfk)) {
            zzfk zzfkVar = (zzfk) zzc;
            if (zzfkVar.zza()) {
                return zzc;
            }
            zzfk zza2 = zzfkVar.zza(zzc.size() + i);
            zzia.zza(obj, j, zza2);
            return zza2;
        } else {
            return zzc;
        }
        return zzfvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzfx
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzia.zza(obj, j, zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzia.zzf(obj, j);
    }
}
