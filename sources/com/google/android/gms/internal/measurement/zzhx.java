package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzhx {
    private static final zzhx zza = new zzhx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public static zzhx zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhx zzb() {
        return new zzhx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhx zza(zzhx zzhxVar, zzhx zzhxVar2) {
        int i = zzhxVar.zzb + zzhxVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhxVar.zzc, i);
        System.arraycopy(zzhxVar2.zzc, 0, copyOf, zzhxVar.zzb, zzhxVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhxVar.zzd, i);
        System.arraycopy(zzhxVar2.zzd, 0, copyOf2, zzhxVar.zzb, zzhxVar2.zzb);
        return new zzhx(i, copyOf, copyOf2, true);
    }

    private zzhx() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhx(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public final void zzc() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzir zzirVar) throws IOException {
        if (zzirVar.zza() == zzfd.zzd.zzk) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzirVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzirVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    public final void zzb(zzir zzirVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzirVar.zza() == zzfd.zzd.zzj) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzirVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzirVar);
        }
    }

    private static void zza(int i, Object obj, zzir zzirVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzirVar.zza(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzirVar.zzd(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzirVar.zza(i2, (zzdv) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzirVar.zzd(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfn.zzf());
        } else if (zzirVar.zza() == zzfd.zzd.zzj) {
            zzirVar.zza(i2);
            ((zzhx) obj).zzb(zzirVar);
            zzirVar.zzb(i2);
        } else {
            zzirVar.zzb(i2);
            ((zzhx) obj).zzb(zzirVar);
            zzirVar.zza(i2);
        }
    }

    public final int zzd() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzek.zzd(this.zzc[i3] >>> 3, (zzdv) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final int zze() {
        int zze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzek.zze(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzek.zzg(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzek.zzc(i5, (zzdv) this.zzd[i3]);
            } else if (i6 == 3) {
                zze = (zzek.zze(i5) << 1) + ((zzhx) this.zzd[i3]).zze();
            } else if (i6 == 5) {
                zze = zzek.zzi(i5, ((Integer) this.zzd[i3]).intValue());
            } else {
                throw new IllegalStateException(zzfn.zzf());
            }
            i2 += zze;
        }
        this.zze = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzhx)) {
            zzhx zzhxVar = (zzhx) obj;
            int i = this.zzb;
            if (i == zzhxVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzhxVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhxVar.zzd;
                    int i3 = this.zzb;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgo.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.zzb;
        if (i2 == this.zzc.length) {
            int i3 = this.zzb + (i2 < 4 ? 8 : i2 >> 1);
            this.zzc = Arrays.copyOf(this.zzc, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
        int[] iArr = this.zzc;
        int i4 = this.zzb;
        iArr[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }
}
