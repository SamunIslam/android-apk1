package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzi uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public class zzil {
    public static final zzil zza = new zzil("DOUBLE", 0, zzio.DOUBLE, 1);
    public static final zzil zzb = new zzil("FLOAT", 1, zzio.FLOAT, 5);
    public static final zzil zzc = new zzil("INT64", 2, zzio.LONG, 0);
    public static final zzil zzd = new zzil("UINT64", 3, zzio.LONG, 0);
    public static final zzil zze = new zzil("INT32", 4, zzio.INT, 0);
    public static final zzil zzf = new zzil("FIXED64", 5, zzio.LONG, 1);
    public static final zzil zzg = new zzil("FIXED32", 6, zzio.INT, 5);
    public static final zzil zzh = new zzil("BOOL", 7, zzio.BOOLEAN, 0);
    public static final zzil zzi;
    public static final zzil zzj;
    public static final zzil zzk;
    public static final zzil zzl;
    public static final zzil zzm;
    public static final zzil zzn;
    public static final zzil zzo;
    public static final zzil zzp;
    public static final zzil zzq;
    public static final zzil zzr;
    private static final /* synthetic */ zzil[] zzu;
    private final zzio zzs;
    private final int zzt;

    public static zzil[] values() {
        return (zzil[]) zzu.clone();
    }

    private zzil(String str, int i, zzio zzioVar, int i2) {
        this.zzs = zzioVar;
        this.zzt = i2;
    }

    public final zzio zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzil(String str, int i, zzio zzioVar, int i2, zzii zziiVar) {
        this(str, i, zzioVar, i2);
    }

    static {
        final zzio zzioVar = zzio.STRING;
        zzi = new zzil("STRING", 8, zzioVar, 2) { // from class: com.google.android.gms.internal.measurement.zzik
        };
        final zzio zzioVar2 = zzio.MESSAGE;
        zzj = new zzil("GROUP", 9, zzioVar2, 3) { // from class: com.google.android.gms.internal.measurement.zzin
        };
        final zzio zzioVar3 = zzio.MESSAGE;
        zzk = new zzil("MESSAGE", 10, zzioVar3, 2) { // from class: com.google.android.gms.internal.measurement.zzim
        };
        final zzio zzioVar4 = zzio.BYTE_STRING;
        zzl = new zzil("BYTES", 11, zzioVar4, 2) { // from class: com.google.android.gms.internal.measurement.zzip
        };
        zzm = new zzil("UINT32", 12, zzio.INT, 0);
        zzn = new zzil("ENUM", 13, zzio.ENUM, 0);
        zzo = new zzil("SFIXED32", 14, zzio.INT, 5);
        zzp = new zzil("SFIXED64", 15, zzio.LONG, 1);
        zzq = new zzil("SINT32", 16, zzio.INT, 0);
        zzil zzilVar = new zzil("SINT64", 17, zzio.LONG, 0);
        zzr = zzilVar;
        zzu = new zzil[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzilVar};
    }
}
