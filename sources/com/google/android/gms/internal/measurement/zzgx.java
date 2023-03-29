package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzgx {
    private static final zzgv zza = zzc();
    private static final zzgv zzb = new zzgu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgv zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgv zzb() {
        return zzb;
    }

    private static zzgv zzc() {
        try {
            return (zzgv) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
