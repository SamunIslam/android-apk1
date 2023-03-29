package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzdy extends zzef {
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdy(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzef, com.google.android.gms.internal.measurement.zzdv
    public final byte zza(int i) {
        int zza = zza();
        if (((zza - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(zza);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.zzb[this.zzc + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzef, com.google.android.gms.internal.measurement.zzdv
    public final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzef, com.google.android.gms.internal.measurement.zzdv
    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzef
    protected final int zze() {
        return this.zzc;
    }
}
