package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzgy {
    private static final zzgy zza = new zzgy();
    private final ConcurrentMap<Class<?>, zzhc<?>> zzc = new ConcurrentHashMap();
    private final zzhf zzb = new zzga();

    public static zzgy zza() {
        return zza;
    }

    public final <T> zzhc<T> zza(Class<T> cls) {
        zzfe.zza(cls, "messageType");
        zzhc<T> zzhcVar = (zzhc<T>) this.zzc.get(cls);
        if (zzhcVar == null) {
            zzhc<T> zza2 = this.zzb.zza(cls);
            zzfe.zza(cls, "messageType");
            zzfe.zza(zza2, "schema");
            zzhc<T> zzhcVar2 = (zzhc<T>) this.zzc.putIfAbsent(cls, zza2);
            return zzhcVar2 != null ? zzhcVar2 : zza2;
        }
        return zzhcVar;
    }

    public final <T> zzhc<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzgy() {
    }
}
