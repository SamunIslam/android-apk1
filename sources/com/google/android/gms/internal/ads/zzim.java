package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzim implements zzhv {
    private int[] zzall;
    private boolean zzalm;
    private int[] zzaln;
    private boolean zzalp;
    private ByteBuffer zzalo = zzaig;
    private ByteBuffer zzakn = zzaig;
    private int zzags = -1;
    private int zzalk = -1;

    @Override // com.google.android.gms.internal.ads.zzhv
    public final int zzfj() {
        return 2;
    }

    public final void zzb(int[] iArr) {
        this.zzall = iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final boolean zzb(int i, int i2, int i3) throws zzhu {
        boolean z = !Arrays.equals(this.zzall, this.zzaln);
        int[] iArr = this.zzall;
        this.zzaln = iArr;
        if (iArr == null) {
            this.zzalm = false;
            return z;
        } else if (i3 != 2) {
            throw new zzhu(i, i2, i3);
        } else {
            if (!z && this.zzalk == i && this.zzags == i2) {
                return false;
            }
            this.zzalk = i;
            this.zzags = i2;
            this.zzalm = i2 != this.zzaln.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.zzaln;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 >= i2) {
                    throw new zzhu(i, i2, i3);
                }
                this.zzalm = (i5 != i4) | this.zzalm;
                i4++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final boolean isActive() {
        return this.zzalm;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final int zzfi() {
        int[] iArr = this.zzaln;
        return iArr == null ? this.zzags : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void zzi(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.zzags * 2)) * this.zzaln.length) << 1;
        if (this.zzalo.capacity() < length) {
            this.zzalo = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.zzalo.clear();
        }
        while (position < limit) {
            for (int i : this.zzaln) {
                this.zzalo.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.zzags << 1;
        }
        byteBuffer.position(limit);
        this.zzalo.flip();
        this.zzakn = this.zzalo;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void zzfk() {
        this.zzalp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final ByteBuffer zzfl() {
        ByteBuffer byteBuffer = this.zzakn;
        this.zzakn = zzaig;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final boolean zzfd() {
        return this.zzalp && this.zzakn == zzaig;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void flush() {
        this.zzakn = zzaig;
        this.zzalp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzhv
    public final void reset() {
        flush();
        this.zzalo = zzaig;
        this.zzags = -1;
        this.zzalk = -1;
        this.zzaln = null;
        this.zzalm = false;
    }
}
