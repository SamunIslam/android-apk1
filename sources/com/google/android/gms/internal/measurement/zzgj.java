package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzgj implements zzgg {
    @Override // com.google.android.gms.internal.measurement.zzgg
    public final Map<?, ?> zza(Object obj) {
        return (zzgh) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final zzge<?, ?> zzf(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final Map<?, ?> zzb(Object obj) {
        return (zzgh) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final boolean zzc(Object obj) {
        return !((zzgh) obj).zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final Object zzd(Object obj) {
        ((zzgh) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final Object zze(Object obj) {
        return zzgh.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final Object zza(Object obj, Object obj2) {
        zzgh zzghVar = (zzgh) obj;
        zzgh zzghVar2 = (zzgh) obj2;
        if (!zzghVar2.isEmpty()) {
            if (!zzghVar.zzd()) {
                zzghVar = zzghVar.zzb();
            }
            zzghVar.zza(zzghVar2);
        }
        return zzghVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final int zza(int i, Object obj, Object obj2) {
        zzgh zzghVar = (zzgh) obj;
        if (zzghVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzghVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
