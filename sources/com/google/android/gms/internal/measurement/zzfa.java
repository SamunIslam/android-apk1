package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
enum zzfa {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean zze;

    zzfa(boolean z) {
        this.zze = z;
    }
}
