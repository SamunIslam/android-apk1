package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzgf<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzek zzekVar, zzge<K, V> zzgeVar, K k, V v) throws IOException {
        zzet.zza(zzekVar, zzgeVar.zza, 1, k);
        zzet.zza(zzekVar, zzgeVar.zzc, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzge<K, V> zzgeVar, K k, V v) {
        return zzet.zza(zzgeVar.zza, 1, k) + zzet.zza(zzgeVar.zzc, 2, v);
    }
}
