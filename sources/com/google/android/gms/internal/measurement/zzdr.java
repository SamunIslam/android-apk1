package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzdr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzdq zzdqVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzdqVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzdqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzdq zzdqVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzdqVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzdqVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdqVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdqVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdqVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzdq zzdqVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzdqVar.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzdqVar.zzb = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzdq zzdqVar) throws zzfn {
        int zza = zza(bArr, i, zzdqVar);
        int i2 = zzdqVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdqVar.zzc = "";
                return zza;
            }
            zzdqVar.zzc = new String(bArr, zza, i2, zzfe.zza);
            return zza + i2;
        }
        throw zzfn.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzdq zzdqVar) throws zzfn {
        int zza = zza(bArr, i, zzdqVar);
        int i2 = zzdqVar.zza;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzdqVar.zzc = "";
                return zza;
            }
            zzdqVar.zzc = zzid.zzb(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfn.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i, zzdq zzdqVar) throws zzfn {
        int zza = zza(bArr, i, zzdqVar);
        int i2 = zzdqVar.zza;
        if (i2 < 0) {
            throw zzfn.zzb();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzdqVar.zzc = zzdv.zza;
                return zza;
            }
            zzdqVar.zzc = zzdv.zza(bArr, zza, i2);
            return zza + i2;
        }
        throw zzfn.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzhc zzhcVar, byte[] bArr, int i, int i2, zzdq zzdqVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzdqVar);
            i4 = zzdqVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzfn.zza();
        }
        Object zza = zzhcVar.zza();
        int i6 = i4 + i5;
        zzhcVar.zza(zza, bArr, i5, i6, zzdqVar);
        zzhcVar.zzc(zza);
        zzdqVar.zzc = zza;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzhc zzhcVar, byte[] bArr, int i, int i2, int i3, zzdq zzdqVar) throws IOException {
        zzgr zzgrVar = (zzgr) zzhcVar;
        Object zza = zzgrVar.zza();
        int zza2 = zzgrVar.zza((zzgr) zza, bArr, i, i2, i3, zzdqVar);
        zzgrVar.zzc((zzgr) zza);
        zzdqVar.zzc = zza;
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzfk<?> zzfkVar, zzdq zzdqVar) {
        zzff zzffVar = (zzff) zzfkVar;
        int zza = zza(bArr, i2, zzdqVar);
        zzffVar.zzd(zzdqVar.zza);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdqVar);
            if (i != zzdqVar.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzdqVar);
            zzffVar.zzd(zzdqVar.zza);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzfk<?> zzfkVar, zzdq zzdqVar) throws IOException {
        zzff zzffVar = (zzff) zzfkVar;
        int zza = zza(bArr, i, zzdqVar);
        int i2 = zzdqVar.zza + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzdqVar);
            zzffVar.zzd(zzdqVar.zza);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzfn.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzhc<?> zzhcVar, int i, byte[] bArr, int i2, int i3, zzfk<?> zzfkVar, zzdq zzdqVar) throws IOException {
        int zza = zza(zzhcVar, bArr, i2, i3, zzdqVar);
        zzfkVar.add(zzdqVar.zzc);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzdqVar);
            if (i != zzdqVar.zza) {
                break;
            }
            zza = zza(zzhcVar, bArr, zza2, i3, zzdqVar);
            zzfkVar.add(zzdqVar.zzc);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzhx zzhxVar, zzdq zzdqVar) throws zzfn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzdqVar);
                zzhxVar.zza(i, Long.valueOf(zzdqVar.zzb));
                return zzb;
            } else if (i4 == 1) {
                zzhxVar.zza(i, Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzdqVar);
                int i5 = zzdqVar.zza;
                if (i5 < 0) {
                    throw zzfn.zzb();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzhxVar.zza(i, zzdv.zza);
                    } else {
                        zzhxVar.zza(i, zzdv.zza(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzfn.zza();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzhxVar.zza(i, Integer.valueOf(zza(bArr, i2)));
                    return i2 + 4;
                }
                throw zzfn.zzd();
            } else {
                zzhx zzb2 = zzhx.zzb();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzdqVar);
                    int i8 = zzdqVar.zza;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzb2, zzdqVar);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzfn.zzg();
                }
                zzhxVar.zza(i, zzb2);
                return i2;
            }
        }
        throw zzfn.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzdq zzdqVar) throws zzfn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzfn.zzd();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zza(bArr, i2, zzdqVar);
                            i6 = zzdqVar.zza;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzdqVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzfn.zzg();
                        }
                        return i2;
                    }
                    return zza(bArr, i2, zzdqVar) + zzdqVar.zza;
                }
                return i2 + 8;
            }
            return zzb(bArr, i2, zzdqVar);
        }
        throw zzfn.zzd();
    }
}
