package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public enum zzdwi implements zzecf {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    private static final zzeci<zzdwi> zzeh = new zzeci<zzdwi>() { // from class: com.google.android.gms.internal.ads.zzdwh
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzecf
    public final int zzw() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    public static zzdwi zzes(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                }
                return COMPRESSED;
            }
            return UNCOMPRESSED;
        }
        return UNKNOWN_FORMAT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zzw());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    zzdwi(int i) {
        this.value = i;
    }
}
