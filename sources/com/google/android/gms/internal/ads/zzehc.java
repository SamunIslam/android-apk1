package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzehc<T> implements zzegt<T>, zzegz<T> {
    private static final zzehc<Object> zzijh = new zzehc<>(null);
    private final T zzdyi;

    public static <T> zzegz<T> zzbb(T t) {
        return new zzehc(zzehf.zza(t, "instance cannot be null"));
    }

    public static <T> zzegz<T> zzbc(T t) {
        if (t == null) {
            return zzijh;
        }
        return new zzehc(t);
    }

    private zzehc(T t) {
        this.zzdyi = t;
    }

    @Override // com.google.android.gms.internal.ads.zzegt, com.google.android.gms.internal.ads.zzehm
    public final T get() {
        return this.zzdyi;
    }
}
