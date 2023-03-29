package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public enum zzio {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzdv.zza),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzj;

    zzio(Object obj) {
        this.zzj = obj;
    }
}
