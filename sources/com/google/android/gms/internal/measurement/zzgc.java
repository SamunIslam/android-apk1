package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzgc implements zzgk {
    private zzgk[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzgk... zzgkVarArr) {
        this.zza = zzgkVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzgk
    public final boolean zza(Class<?> cls) {
        for (zzgk zzgkVar : this.zza) {
            if (zzgkVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgk
    public final zzgl zzb(Class<?> cls) {
        zzgk[] zzgkVarArr;
        for (zzgk zzgkVar : this.zza) {
            if (zzgkVar.zza(cls)) {
                return zzgkVar.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
