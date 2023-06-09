package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzok {
    private static final byte[] zzbhb = {0, 0, 0, 1};
    private static final int[] zzbhc = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzbhd = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> zze(byte[] bArr) {
        zzop zzopVar = new zzop(bArr);
        int zza = zza(zzopVar);
        int zzb = zzb(zzopVar);
        int zzbe = zzopVar.zzbe(4);
        if (zza == 5 || zza == 29) {
            zzb = zzb(zzopVar);
            if (zza(zzopVar) == 22) {
                zzbe = zzopVar.zzbe(4);
            }
        }
        int i = zzbhd[zzbe];
        zzoh.checkArgument(i != -1);
        return Pair.create(Integer.valueOf(zzb), Integer.valueOf(i));
    }

    public static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = zzbhb;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, zzbhb.length, i2);
        return bArr3;
    }

    private static int zza(zzop zzopVar) {
        int zzbe = zzopVar.zzbe(5);
        return zzbe == 31 ? zzopVar.zzbe(6) + 32 : zzbe;
    }

    private static int zzb(zzop zzopVar) {
        int zzbe = zzopVar.zzbe(4);
        if (zzbe == 15) {
            return zzopVar.zzbe(24);
        }
        zzoh.checkArgument(zzbe < 13);
        return zzbhc[zzbe];
    }
}
