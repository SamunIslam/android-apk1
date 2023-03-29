package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzgi {
    private static final zzgg zza = zzc();
    private static final zzgg zzb = new zzgj();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgg zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgg zzb() {
        return zzb;
    }

    private static zzgg zzc() {
        try {
            return (zzgg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
