package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzece extends zzeak<Integer> implements zzeck, zzeea, RandomAccess {
    private static final zzece zzhxz;
    private int size;
    private int[] zzhya;

    public static zzece zzbfe() {
        return zzhxz;
    }

    zzece() {
        this(new int[10], 0);
    }

    private zzece(int[] iArr, int i) {
        this.zzhya = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbck();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzhya;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzece)) {
            return super.equals(obj);
        }
        zzece zzeceVar = (zzece) obj;
        if (this.size != zzeceVar.size) {
            return false;
        }
        int[] iArr = zzeceVar.zzhya;
        for (int i = 0; i < this.size; i++) {
            if (this.zzhya[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzhya[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzecl
    /* renamed from: zzgv */
    public final zzeck zzfn(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzece(Arrays.copyOf(this.zzhya, i), this.size);
    }

    public final int getInt(int i) {
        zzfl(i);
        return this.zzhya[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzeck
    public final void zzgw(int i) {
        zzbck();
        int i2 = this.size;
        int[] iArr = this.zzhya;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzhya = iArr2;
        }
        int[] iArr3 = this.zzhya;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzbck();
        zzecg.checkNotNull(collection);
        if (!(collection instanceof zzece)) {
            return super.addAll(collection);
        }
        zzece zzeceVar = (zzece) collection;
        int i = zzeceVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzhya;
        if (i3 > iArr.length) {
            this.zzhya = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzeceVar.zzhya, 0, this.zzhya, this.size, zzeceVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbck();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzhya[i]))) {
                int[] iArr = this.zzhya;
                System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzfl(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
    }

    private final String zzfm(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbck();
        zzfl(i);
        int[] iArr = this.zzhya;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbck();
        zzfl(i);
        int[] iArr = this.zzhya;
        int i3 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbck();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
        int[] iArr = this.zzhya;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzhya, i, iArr2, i + 1, this.size - i);
            this.zzhya = iArr2;
        }
        this.zzhya[i] = intValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzgw(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzece zzeceVar = new zzece(new int[0], 0);
        zzhxz = zzeceVar;
        zzeceVar.zzbcj();
    }
}
