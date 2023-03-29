package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public enum zzeby {
    DOUBLE(0, zzeca.SCALAR, zzecq.DOUBLE),
    FLOAT(1, zzeca.SCALAR, zzecq.FLOAT),
    INT64(2, zzeca.SCALAR, zzecq.LONG),
    UINT64(3, zzeca.SCALAR, zzecq.LONG),
    INT32(4, zzeca.SCALAR, zzecq.INT),
    FIXED64(5, zzeca.SCALAR, zzecq.LONG),
    FIXED32(6, zzeca.SCALAR, zzecq.INT),
    BOOL(7, zzeca.SCALAR, zzecq.BOOLEAN),
    STRING(8, zzeca.SCALAR, zzecq.STRING),
    MESSAGE(9, zzeca.SCALAR, zzecq.MESSAGE),
    BYTES(10, zzeca.SCALAR, zzecq.BYTE_STRING),
    UINT32(11, zzeca.SCALAR, zzecq.INT),
    ENUM(12, zzeca.SCALAR, zzecq.ENUM),
    SFIXED32(13, zzeca.SCALAR, zzecq.INT),
    SFIXED64(14, zzeca.SCALAR, zzecq.LONG),
    SINT32(15, zzeca.SCALAR, zzecq.INT),
    SINT64(16, zzeca.SCALAR, zzecq.LONG),
    GROUP(17, zzeca.SCALAR, zzecq.MESSAGE),
    DOUBLE_LIST(18, zzeca.VECTOR, zzecq.DOUBLE),
    FLOAT_LIST(19, zzeca.VECTOR, zzecq.FLOAT),
    INT64_LIST(20, zzeca.VECTOR, zzecq.LONG),
    UINT64_LIST(21, zzeca.VECTOR, zzecq.LONG),
    INT32_LIST(22, zzeca.VECTOR, zzecq.INT),
    FIXED64_LIST(23, zzeca.VECTOR, zzecq.LONG),
    FIXED32_LIST(24, zzeca.VECTOR, zzecq.INT),
    BOOL_LIST(25, zzeca.VECTOR, zzecq.BOOLEAN),
    STRING_LIST(26, zzeca.VECTOR, zzecq.STRING),
    MESSAGE_LIST(27, zzeca.VECTOR, zzecq.MESSAGE),
    BYTES_LIST(28, zzeca.VECTOR, zzecq.BYTE_STRING),
    UINT32_LIST(29, zzeca.VECTOR, zzecq.INT),
    ENUM_LIST(30, zzeca.VECTOR, zzecq.ENUM),
    SFIXED32_LIST(31, zzeca.VECTOR, zzecq.INT),
    SFIXED64_LIST(32, zzeca.VECTOR, zzecq.LONG),
    SINT32_LIST(33, zzeca.VECTOR, zzecq.INT),
    SINT64_LIST(34, zzeca.VECTOR, zzecq.LONG),
    DOUBLE_LIST_PACKED(35, zzeca.PACKED_VECTOR, zzecq.DOUBLE),
    FLOAT_LIST_PACKED(36, zzeca.PACKED_VECTOR, zzecq.FLOAT),
    INT64_LIST_PACKED(37, zzeca.PACKED_VECTOR, zzecq.LONG),
    UINT64_LIST_PACKED(38, zzeca.PACKED_VECTOR, zzecq.LONG),
    INT32_LIST_PACKED(39, zzeca.PACKED_VECTOR, zzecq.INT),
    FIXED64_LIST_PACKED(40, zzeca.PACKED_VECTOR, zzecq.LONG),
    FIXED32_LIST_PACKED(41, zzeca.PACKED_VECTOR, zzecq.INT),
    BOOL_LIST_PACKED(42, zzeca.PACKED_VECTOR, zzecq.BOOLEAN),
    UINT32_LIST_PACKED(43, zzeca.PACKED_VECTOR, zzecq.INT),
    ENUM_LIST_PACKED(44, zzeca.PACKED_VECTOR, zzecq.ENUM),
    SFIXED32_LIST_PACKED(45, zzeca.PACKED_VECTOR, zzecq.INT),
    SFIXED64_LIST_PACKED(46, zzeca.PACKED_VECTOR, zzecq.LONG),
    SINT32_LIST_PACKED(47, zzeca.PACKED_VECTOR, zzecq.INT),
    SINT64_LIST_PACKED(48, zzeca.PACKED_VECTOR, zzecq.LONG),
    GROUP_LIST(49, zzeca.VECTOR, zzecq.MESSAGE),
    MAP(50, zzeca.MAP, zzecq.VOID);
    
    private static final zzeby[] zzhxf;
    private static final Type[] zzhxg = new Type[0];
    private final int id;
    private final zzecq zzhxb;
    private final zzeca zzhxc;
    private final Class<?> zzhxd;
    private final boolean zzhxe;

    zzeby(int i, zzeca zzecaVar, zzecq zzecqVar) {
        int i2;
        this.id = i;
        this.zzhxc = zzecaVar;
        this.zzhxb = zzecqVar;
        int i3 = zzebx.zzhva[zzecaVar.ordinal()];
        boolean z = true;
        if (i3 == 1) {
            this.zzhxd = zzecqVar.zzbfq();
        } else if (i3 == 2) {
            this.zzhxd = zzecqVar.zzbfq();
        } else {
            this.zzhxd = null;
        }
        this.zzhxe = (zzecaVar != zzeca.SCALAR || (i2 = zzebx.zzhvb[zzecqVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : false;
    }

    public final int id() {
        return this.id;
    }

    static {
        zzeby[] values = values();
        zzhxf = new zzeby[values.length];
        for (zzeby zzebyVar : values) {
            zzhxf[zzebyVar.id] = zzebyVar;
        }
    }
}
