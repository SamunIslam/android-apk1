package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zznl {
    public final int length;
    private int zzahb;
    private final zznj[] zzbfe;

    public zznl(zznj... zznjVarArr) {
        this.zzbfe = zznjVarArr;
        this.length = zznjVarArr.length;
    }

    public final zznj zzba(int i) {
        return this.zzbfe[i];
    }

    public final zznj[] zzil() {
        return (zznj[]) this.zzbfe.clone();
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = Arrays.hashCode(this.zzbfe) + 527;
        }
        return this.zzahb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbfe, ((zznl) obj).zzbfe);
    }
}
