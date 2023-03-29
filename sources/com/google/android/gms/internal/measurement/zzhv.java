package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzhv extends RuntimeException {
    private final List<String> zza;

    public zzhv(zzgn zzgnVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }
}
