package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzfb implements zzgk {
    private static final zzfb zza = new zzfb();

    private zzfb() {
    }

    public static zzfb zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgk
    public final boolean zza(Class<?> cls) {
        return zzfd.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzgk
    public final zzgl zzb(Class<?> cls) {
        if (!zzfd.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzgl) zzfd.zza((Class<zzfd>) cls.asSubclass(zzfd.class)).zza(zzfd.zzd.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
