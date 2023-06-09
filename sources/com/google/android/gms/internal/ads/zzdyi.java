package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdyi implements zzdss {
    private final SecretKey zzhqc;
    private final int zzhqd;
    private byte[] zzhqe;
    private byte[] zzhqf;

    private static Cipher zzbbv() throws GeneralSecurityException {
        return zzdzi.zzhrs.zzho("AES/ECB/NoPadding");
    }

    public zzdyi(byte[] bArr, int i) throws GeneralSecurityException {
        zzdzy.zzfj(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        }
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
        this.zzhqc = new SecretKeySpec(bArr, "AES");
        this.zzhqd = i;
        Cipher zzbbv = zzbbv();
        zzbbv.init(1, this.zzhqc);
        byte[] zzq = zzdyp.zzq(zzbbv.doFinal(new byte[16]));
        this.zzhqe = zzq;
        this.zzhqf = zzdyp.zzq(zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzdss
    public final byte[] zzm(byte[] bArr) throws GeneralSecurityException {
        byte[] zzd;
        Cipher zzbbv = zzbbv();
        zzbbv.init(1, this.zzhqc);
        double length = bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            zzd = zzdys.zza(bArr, (max - 1) << 4, this.zzhqe, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            zzd = zzdys.zzd(copyOf, this.zzhqf);
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr2 = zzbbv.doFinal(zzdys.zza(bArr2, 0, bArr, i << 4, 16));
        }
        byte[] zzd2 = zzdys.zzd(zzd, bArr2);
        byte[] bArr3 = new byte[this.zzhqd];
        System.arraycopy(zzbbv.doFinal(zzd2), 0, bArr3, 0, this.zzhqd);
        return bArr3;
    }
}
