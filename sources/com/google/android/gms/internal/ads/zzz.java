package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzz<T> {
    public final T result;
    public final zzd zzbh;
    public final zzae zzbi;
    public boolean zzbj;

    public static <T> zzz<T> zza(T t, zzd zzdVar) {
        return new zzz<>(t, zzdVar);
    }

    public static <T> zzz<T> zzd(zzae zzaeVar) {
        return new zzz<>(zzaeVar);
    }

    private zzz(T t, zzd zzdVar) {
        this.zzbj = false;
        this.result = t;
        this.zzbh = zzdVar;
        this.zzbi = null;
    }

    private zzz(zzae zzaeVar) {
        this.zzbj = false;
        this.result = null;
        this.zzbh = null;
        this.zzbi = zzaeVar;
    }
}
