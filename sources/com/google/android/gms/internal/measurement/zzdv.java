package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zzdv implements Serializable, Iterable<Byte> {
    public static final zzdv zza = new zzef(zzfe.zzb);
    private static final zzeb zzb;
    private static final Comparator<zzdv> zzd;
    private int zzc = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract int zza();

    protected abstract int zza(int i, int i2, int i3);

    public abstract zzdv zza(int i, int i2);

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzds zzdsVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract boolean zzc();

    public static zzdv zza(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new zzef(zzb.zza(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdv zza(byte[] bArr) {
        return new zzef(bArr);
    }

    public static zzdv zza(String str) {
        return new zzef(str.getBytes(zzfe.zza));
    }

    public final String zzb() {
        return zza() == 0 ? "" : zza(zzfe.zza);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zza2 = zza();
            i = zza(zza2, 0, zza2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzed zzc(int i) {
        return new zzed(i, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzdu(this);
    }

    static {
        zzb = zzdo.zza() ? new zzee(null) : new zzdz(null);
        zzd = new zzdx();
    }
}
