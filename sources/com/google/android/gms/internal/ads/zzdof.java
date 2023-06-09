package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzdof {
    private static final Logger logger = Logger.getLogger(zzdof.class.getName());
    private static final zzdog zzhdv = new zza();

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private zza() {
        }
    }

    private zzdof() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzhe(@NullableDecl String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzhd(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String emptyToNull(@NullableDecl String str) {
        if (zzhd(str)) {
            return null;
        }
        return str;
    }
}
