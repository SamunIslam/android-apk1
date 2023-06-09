package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdyk implements zzdzs {
    private static final ThreadLocal<Cipher> zzhqg = new zzdyj();
    private final SecretKeySpec zzhqh;
    private final int zzhqi;
    private final int zzhqj;

    public zzdyk(byte[] bArr, int i) throws GeneralSecurityException {
        zzdzy.zzfj(bArr.length);
        this.zzhqh = new SecretKeySpec(bArr, "AES");
        int blockSize = zzhqg.get().getBlockSize();
        this.zzhqj = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzhqi = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdzs
    public final byte[] zzo(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzhqi;
        if (length > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.zzhqi;
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] zzfi = zzdzt.zzfi(i);
        System.arraycopy(zzfi, 0, bArr2, 0, this.zzhqi);
        int length2 = bArr.length;
        int i3 = this.zzhqi;
        Cipher cipher = zzhqg.get();
        byte[] bArr3 = new byte[this.zzhqj];
        System.arraycopy(zzfi, 0, bArr3, 0, this.zzhqi);
        cipher.init(1, this.zzhqh, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length2, bArr2, i3) == length2) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
