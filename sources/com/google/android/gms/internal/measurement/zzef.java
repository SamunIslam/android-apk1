package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public class zzef extends zzec {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzef(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zzb = bArr;
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    public byte zza(int i) {
        return this.zzb[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdv
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    public final zzdv zza(int i, int i2) {
        int zzb = zzb(0, i2, zza());
        if (zzb == 0) {
            return zzdv.zza;
        }
        return new zzdy(this.zzb, zze(), zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzdv
    public final void zza(zzds zzdsVar) throws IOException {
        zzdsVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    public final boolean zzc() {
        int zze = zze();
        return zzid.zza(this.zzb, zze, zza() + zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdv) && zza() == ((zzdv) obj).zza()) {
            if (zza() == 0) {
                return true;
            }
            if (obj instanceof zzef) {
                zzef zzefVar = (zzef) obj;
                int zzd = zzd();
                int zzd2 = zzefVar.zzd();
                if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
                    return zza(zzefVar, 0, zza());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzec
    final boolean zza(zzdv zzdvVar, int i, int i2) {
        if (i2 > zzdvVar.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzdvVar.zza()) {
            int zza2 = zzdvVar.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzdvVar instanceof zzef) {
            zzef zzefVar = (zzef) zzdvVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzefVar.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzefVar.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        } else {
            return zzdvVar.zza(0, i2).equals(zza(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzdv
    protected final int zza(int i, int i2, int i3) {
        return zzfe.zza(i, this.zzb, zze(), i3);
    }
}
