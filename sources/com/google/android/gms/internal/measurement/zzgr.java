package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzgr<T> implements zzhc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzia.zzc();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgn zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final zzgv zzo;
    private final zzfx zzp;
    private final zzhu<?, ?> zzq;
    private final zzes<?> zzr;
    private final zzgg zzs;

    private zzgr(int[] iArr, Object[] objArr, int i, int i2, zzgn zzgnVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgv zzgvVar, zzfx zzfxVar, zzhu<?, ?> zzhuVar, zzes<?> zzesVar, zzgg zzggVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgnVar instanceof zzfd;
        this.zzj = z;
        this.zzh = zzesVar != null && zzesVar.zza(zzgnVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzgvVar;
        this.zzp = zzfxVar;
        this.zzq = zzhuVar;
        this.zzr = zzesVar;
        this.zzg = zzgnVar;
        this.zzs = zzggVar;
    }

    private static boolean zzf(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzgr<T> zza(Class<T> cls, zzgl zzglVar, zzgv zzgvVar, zzfx zzfxVar, zzhu<?, ?> zzhuVar, zzes<?> zzesVar, zzgg zzggVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzha zzhaVar;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field zza2;
        int i23;
        char charAt11;
        int i24;
        Field zza3;
        Field zza4;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        if (zzglVar instanceof zzha) {
            zzha zzhaVar2 = (zzha) zzglVar;
            int i29 = 0;
            boolean z2 = zzhaVar2.zza() == zzfd.zzd.zzi;
            String zzd = zzhaVar2.zzd();
            int length = zzd.length();
            int charAt17 = zzd.charAt(0);
            if (charAt17 >= 55296) {
                int i30 = charAt17 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i = i31 + 1;
                    charAt16 = zzd.charAt(i31);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i30 |= (charAt16 & 8191) << i32;
                    i32 += 13;
                    i31 = i;
                }
                charAt17 = i30 | (charAt16 << i32);
            } else {
                i = 1;
            }
            int i33 = i + 1;
            int charAt18 = zzd.charAt(i);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i28 = i33 + 1;
                    charAt15 = zzd.charAt(i33);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i34 |= (charAt15 & 8191) << i35;
                    i35 += 13;
                    i33 = i28;
                }
                charAt18 = i34 | (charAt15 << i35);
                i33 = i28;
            }
            if (charAt18 == 0) {
                iArr = zza;
                i6 = 0;
                i3 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
            } else {
                int i36 = i33 + 1;
                int charAt19 = zzd.charAt(i33);
                if (charAt19 >= 55296) {
                    int i37 = charAt19 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt10 = zzd.charAt(i36);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i37 |= (charAt10 & 8191) << i38;
                        i38 += 13;
                        i36 = i14;
                    }
                    charAt19 = i37 | (charAt10 << i38);
                    i36 = i14;
                }
                int i39 = i36 + 1;
                int charAt20 = zzd.charAt(i36);
                if (charAt20 >= 55296) {
                    int i40 = charAt20 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt9 = zzd.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i13;
                    }
                    charAt20 = i40 | (charAt9 << i41);
                    i39 = i13;
                }
                int i42 = i39 + 1;
                charAt = zzd.charAt(i39);
                if (charAt >= 55296) {
                    int i43 = charAt & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt8 = zzd.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i12;
                    }
                    charAt = i43 | (charAt8 << i44);
                    i42 = i12;
                }
                int i45 = i42 + 1;
                int charAt21 = zzd.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt7 = zzd.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i11;
                    }
                    charAt21 = i46 | (charAt7 << i47);
                    i45 = i11;
                }
                int i48 = i45 + 1;
                charAt2 = zzd.charAt(i45);
                if (charAt2 >= 55296) {
                    int i49 = charAt2 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt6 = zzd.charAt(i48);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i10;
                    }
                    charAt2 = i49 | (charAt6 << i50);
                    i48 = i10;
                }
                int i51 = i48 + 1;
                int charAt22 = zzd.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt5 = zzd.charAt(i51);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i52 |= (charAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i9;
                    }
                    charAt22 = i52 | (charAt5 << i53);
                    i51 = i9;
                }
                int i54 = i51 + 1;
                int charAt23 = zzd.charAt(i51);
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt4 = zzd.charAt(i56);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i8;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i2 = i8;
                } else {
                    i2 = i54;
                }
                int i58 = i2 + 1;
                int charAt24 = zzd.charAt(i2);
                if (charAt24 >= 55296) {
                    int i59 = charAt24 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i7 = i60 + 1;
                        charAt3 = zzd.charAt(i60);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i59 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i7;
                    }
                    charAt24 = i59 | (charAt3 << i61);
                    i58 = i7;
                }
                int i62 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i62;
                i5 = charAt24;
                i29 = charAt19;
                i33 = i58;
                int i63 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i6 = i63;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzhaVar2.zze();
            Class<?> cls3 = zzhaVar2.zzc().getClass();
            int i64 = i33;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i65 = i5 + i6;
            int i66 = i5;
            int i67 = i64;
            int i68 = i65;
            int i69 = 0;
            int i70 = 0;
            while (i67 < length) {
                int i71 = i67 + 1;
                int charAt25 = zzd.charAt(i67);
                int i72 = length;
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt14 = zzd.charAt(i74);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i73 |= (charAt14 & 8191) << i75;
                        i75 += 13;
                        i74 = i27;
                        i5 = i15;
                    }
                    charAt25 = i73 | (charAt14 << i75);
                    i16 = i27;
                } else {
                    i15 = i5;
                    i16 = i71;
                }
                int i76 = i16 + 1;
                int charAt26 = zzd.charAt(i16);
                if (charAt26 >= 55296) {
                    int i77 = charAt26 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        charAt13 = zzd.charAt(i78);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i79;
                        i79 += 13;
                        i78 = i26;
                        z2 = z;
                    }
                    charAt26 = i77 | (charAt13 << i79);
                    i17 = i26;
                } else {
                    z = z2;
                    i17 = i76;
                }
                int i80 = charAt26 & 255;
                int i81 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i69] = i70;
                    i69++;
                }
                int i82 = charAt;
                if (i80 >= 51) {
                    int i83 = i17 + 1;
                    int charAt27 = zzd.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i84 = charAt27 & 8191;
                        int i85 = 13;
                        while (true) {
                            i25 = i83 + 1;
                            charAt12 = zzd.charAt(i83);
                            if (charAt12 < c) {
                                break;
                            }
                            i84 |= (charAt12 & 8191) << i85;
                            i85 += 13;
                            i83 = i25;
                            c = 55296;
                        }
                        charAt27 = i84 | (charAt12 << i85);
                        i83 = i25;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 == 9 || i86 == 17) {
                        objArr[((i70 / 3) << 1) + 1] = zze[i4];
                        i4++;
                    } else if (i86 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i70 / 3) << 1) + 1] = zze[i4];
                        i4++;
                    }
                    int i88 = charAt27 << 1;
                    Object obj = zze[i88];
                    if (obj instanceof Field) {
                        zza3 = (Field) obj;
                    } else {
                        zza3 = zza(cls3, (String) obj);
                        zze[i88] = zza3;
                    }
                    zzhaVar = zzhaVar2;
                    String str2 = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza3);
                    int i89 = i88 + 1;
                    Object obj2 = zze[i89];
                    if (obj2 instanceof Field) {
                        zza4 = (Field) obj2;
                    } else {
                        zza4 = zza(cls3, (String) obj2);
                        zze[i89] = zza4;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i87;
                    str = str2;
                    i22 = 0;
                    i21 = (int) unsafe.objectFieldOffset(zza4);
                    i20 = i29;
                } else {
                    zzhaVar = zzhaVar2;
                    String str3 = zzd;
                    int i90 = i4 + 1;
                    Field zza5 = zza(cls3, (String) zze[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i18 = 1;
                        objArr[((i70 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i18 = 1;
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = zze[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i18 = 1;
                            if ((charAt17 & 1) == 1) {
                                i24 = i90 + 1;
                                objArr[((i70 / 3) << 1) + 1] = zze[i90];
                            }
                        } else {
                            if (i80 == 50) {
                                int i91 = i66 + 1;
                                iArr[i66] = i70;
                                int i92 = (i70 / 3) << 1;
                                int i93 = i90 + 1;
                                objArr[i92] = zze[i90];
                                if ((charAt26 & 2048) != 0) {
                                    i90 = i93 + 1;
                                    objArr[i92 + 1] = zze[i93];
                                    i66 = i91;
                                } else {
                                    i90 = i93;
                                    i18 = 1;
                                    i66 = i91;
                                }
                            }
                            i18 = 1;
                        }
                        i90 = i24;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt17 & 1) != i18 || i80 > 17) {
                        i19 = i90;
                        i20 = i29;
                        cls2 = cls3;
                        str = str3;
                        i21 = 0;
                        i22 = 0;
                    } else {
                        int i94 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i95 = charAt28 & 8191;
                            int i96 = 13;
                            while (true) {
                                i23 = i94 + 1;
                                charAt11 = str.charAt(i94);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i95 |= (charAt11 & 8191) << i96;
                                i96 += 13;
                                i94 = i23;
                            }
                            charAt28 = i95 | (charAt11 << i96);
                            i94 = i23;
                        }
                        int i97 = (i29 << 1) + (charAt28 / 32);
                        Object obj3 = zze[i97];
                        i19 = i90;
                        if (obj3 instanceof Field) {
                            zza2 = (Field) obj3;
                        } else {
                            zza2 = zza(cls3, (String) obj3);
                            zze[i97] = zza2;
                        }
                        i20 = i29;
                        cls2 = cls3;
                        i21 = (int) unsafe.objectFieldOffset(zza2);
                        i22 = charAt28 % 32;
                        i17 = i94;
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                int i98 = i70 + 1;
                iArr2[i70] = charAt25;
                int i99 = i98 + 1;
                iArr2[i98] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i80 << 20);
                i70 = i99 + 1;
                iArr2[i99] = (i22 << 20) | i21;
                i29 = i20;
                zzd = str;
                i67 = i17;
                cls3 = cls2;
                i3 = i81;
                length = i72;
                i5 = i15;
                z2 = z;
                charAt = i82;
                i4 = i19;
                zzhaVar2 = zzhaVar;
            }
            return new zzgr<>(iArr2, objArr, charAt, i3, zzhaVar2.zzc(), z2, false, iArr, i5, i65, zzgvVar, zzfxVar, zzhuVar, zzesVar, zzggVar);
        }
        ((zzhr) zzglVar).zza();
        int i100 = zzfd.zzd.zzi;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzia.zze(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzia.zze(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.zzhe.zza(com.google.android.gms.internal.measurement.zzia.zzf(r10, r6), com.google.android.gms.internal.measurement.zzia.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.zzhe.zza(com.google.android.gms.internal.measurement.zzia.zzf(r10, r6), com.google.android.gms.internal.measurement.zzia.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzia.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zza(r10, r6) == com.google.android.gms.internal.measurement.zzia.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzia.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zza(r10, r6) == com.google.android.gms.internal.measurement.zzia.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zza(r10, r6) == com.google.android.gms.internal.measurement.zzia.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zza(r10, r6) == com.google.android.gms.internal.measurement.zzia.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.zzhe.zza(com.google.android.gms.internal.measurement.zzia.zzf(r10, r6), com.google.android.gms.internal.measurement.zzia.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.zzhe.zza(com.google.android.gms.internal.measurement.zzia.zzf(r10, r6), com.google.android.gms.internal.measurement.zzia.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.zzhe.zza(com.google.android.gms.internal.measurement.zzia.zzf(r10, r6), com.google.android.gms.internal.measurement.zzia.zzf(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzia.zzc(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zza(r10, r6) == com.google.android.gms.internal.measurement.zzia.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzia.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zza(r10, r6) == com.google.android.gms.internal.measurement.zzia.zza(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzia.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.zzia.zzb(r10, r6) == com.google.android.gms.internal.measurement.zzia.zzb(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzia.zzd(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzia.zzd(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.measurement.zzhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgr.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final int zza(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzd = zzd(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzd;
            int i5 = 37;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzfe.zza(Double.doubleToLongBits(zzia.zze(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzia.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzfe.zza(zzia.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzfe.zza(zzia.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzia.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzfe.zza(zzia.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzia.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzfe.zza(zzia.zzc(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzia.zzf(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zzf = zzia.zzf(t, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzia.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzia.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzia.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzia.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzfe.zza(zzia.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzia.zza(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzfe.zza(zzia.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zzf2 = zzia.zzf(t, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zza2 = zzia.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzia.zzf(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(Double.doubleToLongBits(zzb(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzc(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(zzf(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzia.zzf(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzia.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzia.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzd(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzfe.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzgr<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzia.zzf(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzq.zzb(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzr.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zzb(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzd = zzd(i);
            long j = 1048575 & zzd;
            int i2 = this.zzc[i];
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza(t, j, zzia.zze(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zzd(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zzb(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zzb(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zza(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zzb(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zza(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza(t, j, zzia.zzc(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza(t, j, zzia.zzf(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza(t, j, zzia.zzf(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zza(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zza(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zza(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zzb(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zza(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzgr<T>) t2, i)) {
                        zzia.zza((Object) t, j, zzia.zzb(t2, j));
                        zzb((zzgr<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    zzhe.zza(this.zzs, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzgr<T>) t2, i2, i)) {
                        zzia.zza(t, j, zzia.zzf(t2, j));
                        zzb((zzgr<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzgr<T>) t2, i2, i)) {
                        zzia.zza(t, j, zzia.zzf(t2, j));
                        zzb((zzgr<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzj) {
            return;
        }
        zzhe.zza(this.zzq, t, t2);
        if (this.zzh) {
            zzhe.zza(this.zzr, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzd = zzd(i) & 1048575;
        if (zza((zzgr<T>) t2, i)) {
            Object zzf = zzia.zzf(t, zzd);
            Object zzf2 = zzia.zzf(t2, zzd);
            if (zzf != null && zzf2 != null) {
                zzia.zza(t, zzd, zzfe.zza(zzf, zzf2));
                zzb((zzgr<T>) t, i);
            } else if (zzf2 != null) {
                zzia.zza(t, zzd, zzf2);
                zzb((zzgr<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzd = zzd(i);
        int i2 = this.zzc[i];
        long j = zzd & 1048575;
        if (zza((zzgr<T>) t2, i2, i)) {
            Object zzf = zzia.zzf(t, j);
            Object zzf2 = zzia.zzf(t2, j);
            if (zzf != null && zzf2 != null) {
                zzia.zza(t, j, zzfe.zza(zzf, zzf2));
                zzb((zzgr<T>) t, i2, i);
            } else if (zzf2 != null) {
                zzia.zza(t, j, zzf2);
                zzb((zzgr<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzhc
    public final int zzb(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        int zzb2;
        int zzj;
        int zzh;
        int zzi;
        int zze;
        int zzg;
        int zzb3;
        int zzi2;
        int zze2;
        int zzg2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzj) {
            Unsafe unsafe = zzb;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzc.length) {
                int zzd2 = zzd(i5);
                int i7 = (zzd2 & i3) >>> 20;
                int i8 = this.zzc[i5];
                long j2 = zzd2 & 1048575;
                int i9 = (i7 < zzey.DOUBLE_LIST_PACKED.zza() || i7 > zzey.SINT64_LIST_PACKED.zza()) ? 0 : this.zzc[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 1:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 2:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzd(i8, zzia.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 3:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zze(i8, zzia.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 4:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzf(i8, zzia.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 5:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 6:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 7:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 8:
                        if (zza((zzgr<T>) t, i5)) {
                            Object zzf = zzia.zzf(t, j2);
                            if (zzf instanceof zzdv) {
                                zzb3 = zzek.zzc(i8, (zzdv) zzf);
                                break;
                            } else {
                                zzb3 = zzek.zzb(i8, (String) zzf);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 9:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzhe.zza(i8, zzia.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 10:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzc(i8, (zzdv) zzia.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 11:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzg(i8, zzia.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 12:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzk(i8, zzia.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 13:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 14:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 15:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzh(i8, zzia.zza(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 16:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzf(i8, zzia.zzb(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 17:
                        if (zza((zzgr<T>) t, i5)) {
                            zzb3 = zzek.zzc(i8, (zzgn) zzia.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 18:
                        zzb3 = zzhe.zzi(i8, zza(t, j2), false);
                        break;
                    case 19:
                        zzb3 = zzhe.zzh(i8, zza(t, j2), false);
                        break;
                    case 20:
                        zzb3 = zzhe.zza(i8, (List<Long>) zza(t, j2), false);
                        break;
                    case 21:
                        zzb3 = zzhe.zzb(i8, (List<Long>) zza(t, j2), false);
                        break;
                    case 22:
                        zzb3 = zzhe.zze(i8, zza(t, j2), false);
                        break;
                    case 23:
                        zzb3 = zzhe.zzi(i8, zza(t, j2), false);
                        break;
                    case 24:
                        zzb3 = zzhe.zzh(i8, zza(t, j2), false);
                        break;
                    case 25:
                        zzb3 = zzhe.zzj(i8, zza(t, j2), false);
                        break;
                    case 26:
                        zzb3 = zzhe.zza(i8, zza(t, j2));
                        break;
                    case 27:
                        zzb3 = zzhe.zza(i8, zza(t, j2), zza(i5));
                        break;
                    case 28:
                        zzb3 = zzhe.zzb(i8, zza(t, j2));
                        break;
                    case 29:
                        zzb3 = zzhe.zzf(i8, zza(t, j2), false);
                        break;
                    case 30:
                        zzb3 = zzhe.zzd(i8, zza(t, j2), false);
                        break;
                    case 31:
                        zzb3 = zzhe.zzh(i8, zza(t, j2), false);
                        break;
                    case 32:
                        zzb3 = zzhe.zzi(i8, zza(t, j2), false);
                        break;
                    case 33:
                        zzb3 = zzhe.zzg(i8, zza(t, j2), false);
                        break;
                    case 34:
                        zzb3 = zzhe.zzc(i8, zza(t, j2), false);
                        break;
                    case 35:
                        zzi2 = zzhe.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 36:
                        zzi2 = zzhe.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 37:
                        zzi2 = zzhe.zza((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 38:
                        zzi2 = zzhe.zzb((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 39:
                        zzi2 = zzhe.zze((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 40:
                        zzi2 = zzhe.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 41:
                        zzi2 = zzhe.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 42:
                        zzi2 = zzhe.zzj((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 43:
                        zzi2 = zzhe.zzf((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 44:
                        zzi2 = zzhe.zzd((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 45:
                        zzi2 = zzhe.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 46:
                        zzi2 = zzhe.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 47:
                        zzi2 = zzhe.zzg((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 48:
                        zzi2 = zzhe.zzc((List) unsafe.getObject(t, j2));
                        if (zzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zze2 = zzek.zze(i8);
                            zzg2 = zzek.zzg(zzi2);
                            zzb3 = zze2 + zzg2 + zzi2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 49:
                        zzb3 = zzhe.zzb(i8, (List<zzgn>) zza(t, j2), zza(i5));
                        break;
                    case 50:
                        zzb3 = this.zzs.zza(i8, zzia.zzf(t, j2), zzb(i5));
                        break;
                    case 51:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 52:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 53:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzd(i8, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 54:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zze(i8, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 55:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzf(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 56:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 57:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 58:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 59:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            Object zzf2 = zzia.zzf(t, j2);
                            if (zzf2 instanceof zzdv) {
                                zzb3 = zzek.zzc(i8, (zzdv) zzf2);
                                break;
                            } else {
                                zzb3 = zzek.zzb(i8, (String) zzf2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 60:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzhe.zza(i8, zzia.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 61:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzc(i8, (zzdv) zzia.zzf(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 62:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzg(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 63:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzk(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 64:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 65:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 66:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzh(i8, zzd(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 67:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzf(i8, zze(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 68:
                        if (zza((zzgr<T>) t, i8, i5)) {
                            zzb3 = zzek.zzc(i8, (zzgn) zzia.zzf(t, j2), zza(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    default:
                        i5 += 3;
                        i3 = 267386880;
                }
                i6 += zzb3;
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza((zzhu) this.zzq, (Object) t);
        }
        Unsafe unsafe2 = zzb;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzc.length) {
            int zzd3 = zzd(i11);
            int[] iArr = this.zzc;
            int i14 = iArr[i11];
            int i15 = (zzd3 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & 1048575;
                i2 = i4 << (i16 >>> 20);
                if (i17 != i10) {
                    i13 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i = i16;
            } else {
                i = (!this.zzk || i15 < zzey.DOUBLE_LIST_PACKED.zza() || i15 > zzey.SINT64_LIST_PACKED.zza()) ? 0 : this.zzc[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzd3 & 1048575;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzek.zzb(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzek.zzb(i14, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzek.zzd(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzek.zze(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzek.zzf(i14, unsafe2.getInt(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzek.zzg(i14, 0L);
                        i12 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i2) != 0) {
                        i12 += zzek.zzi(i14, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i13 & i2) != 0) {
                        i12 += zzek.zzb(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzdv) {
                            zzb2 = zzek.zzc(i14, (zzdv) object);
                        } else {
                            zzb2 = zzek.zzb(i14, (String) object);
                        }
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzhe.zza(i14, unsafe2.getObject(t, j3), zza(i11));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzc(i14, (zzdv) unsafe2.getObject(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzg(i14, unsafe2.getInt(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzk(i14, unsafe2.getInt(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i2) != 0) {
                        zzj = zzek.zzj(i14, 0);
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzh(i14, 0L);
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzh(i14, unsafe2.getInt(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzf(i14, unsafe2.getLong(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i2) != 0) {
                        zzb2 = zzek.zzc(i14, (zzgn) unsafe2.getObject(t, j3), zza(i11));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb2 = zzhe.zzi(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzb2;
                    j = 0;
                    break;
                case 19:
                    zzh = zzhe.zzh(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 20:
                    zzh = zzhe.zza(i14, (List<Long>) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 21:
                    zzh = zzhe.zzb(i14, (List<Long>) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 22:
                    zzh = zzhe.zze(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 23:
                    zzh = zzhe.zzi(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 24:
                    zzh = zzhe.zzh(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 25:
                    zzh = zzhe.zzj(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 26:
                    zzb2 = zzhe.zza(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzb2;
                    j = 0;
                    break;
                case 27:
                    zzb2 = zzhe.zza(i14, (List<?>) unsafe2.getObject(t, j3), zza(i11));
                    i12 += zzb2;
                    j = 0;
                    break;
                case 28:
                    zzb2 = zzhe.zzb(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzb2;
                    j = 0;
                    break;
                case 29:
                    zzb2 = zzhe.zzf(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzb2;
                    j = 0;
                    break;
                case 30:
                    zzh = zzhe.zzd(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 31:
                    zzh = zzhe.zzh(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 32:
                    zzh = zzhe.zzi(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 33:
                    zzh = zzhe.zzg(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 34:
                    zzh = zzhe.zzc(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzh;
                    j = 0;
                    break;
                case 35:
                    zzi = zzhe.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 36:
                    zzi = zzhe.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 37:
                    zzi = zzhe.zza((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 38:
                    zzi = zzhe.zzb((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 39:
                    zzi = zzhe.zze((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 40:
                    zzi = zzhe.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 41:
                    zzi = zzhe.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 42:
                    zzi = zzhe.zzj((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 43:
                    zzi = zzhe.zzf((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 44:
                    zzi = zzhe.zzd((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 45:
                    zzi = zzhe.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 46:
                    zzi = zzhe.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 47:
                    zzi = zzhe.zzg((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 48:
                    zzi = zzhe.zzc((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zze = zzek.zze(i14);
                        zzg = zzek.zzg(zzi);
                        zzj = zze + zzg + zzi;
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 49:
                    zzb2 = zzhe.zzb(i14, (List) unsafe2.getObject(t, j3), zza(i11));
                    i12 += zzb2;
                    j = 0;
                    break;
                case 50:
                    zzb2 = this.zzs.zza(i14, unsafe2.getObject(t, j3), zzb(i11));
                    i12 += zzb2;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzb(i14, 0.0d);
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzj = zzek.zzb(i14, 0.0f);
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzd(i14, zze(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zze(i14, zze(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzf(i14, zzd(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzg(i14, 0L);
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzj = zzek.zzi(i14, 0);
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzj = zzek.zzb(i14, true);
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzdv) {
                            zzb2 = zzek.zzc(i14, (zzdv) object2);
                        } else {
                            zzb2 = zzek.zzb(i14, (String) object2);
                        }
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzhe.zza(i14, unsafe2.getObject(t, j3), zza(i11));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzc(i14, (zzdv) unsafe2.getObject(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzg(i14, zzd(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzk(i14, zzd(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzj = zzek.zzj(i14, 0);
                        i12 += zzj;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzh(i14, 0L);
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzh(i14, zzd(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzf(i14, zze(t, j3));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzgr<T>) t, i14, i11)) {
                        zzb2 = zzek.zzc(i14, (zzgn) unsafe2.getObject(t, j3), zza(i11));
                        i12 += zzb2;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i11 += 3;
            i4 = 1;
        }
        int i18 = 0;
        int zza2 = i12 + zza((zzhu) this.zzq, (Object) t);
        if (this.zzh) {
            zzet<?> zza3 = this.zzr.zza(t);
            for (int i19 = 0; i19 < zza3.zza.zzc(); i19++) {
                Map.Entry<?, Object> zzb4 = zza3.zza.zzb(i19);
                i18 += zzet.zza((zzev) zzb4.getKey(), zzb4.getValue());
            }
            for (Map.Entry<?, Object> entry : zza3.zza.zzd()) {
                i18 += zzet.zza((zzev) entry.getKey(), entry.getValue());
            }
            return zza2 + i18;
        }
        return zza2;
    }

    private static <UT, UB> int zza(zzhu<UT, UB> zzhuVar, T t) {
        return zzhuVar.zzf(zzhuVar.zzb(t));
    }

    private static List<?> zza(Object obj, long j) {
        return (List) zzia.zzf(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.measurement.zzhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r14, com.google.android.gms.internal.measurement.zzir r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgr.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzir):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(T r19, com.google.android.gms.internal.measurement.zzir r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgr.zzb(java.lang.Object, com.google.android.gms.internal.measurement.zzir):void");
    }

    private final <K, V> void zza(zzir zzirVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzirVar.zza(i, this.zzs.zzf(zzb(i2)), this.zzs.zzb(obj));
        }
    }

    private static <UT, UB> void zza(zzhu<UT, UB> zzhuVar, T t, zzir zzirVar) throws IOException {
        zzhuVar.zza((zzhu<UT, UB>) zzhuVar.zzb(t), zzirVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zza(T t, zzhd zzhdVar, zzeq zzeqVar) throws IOException {
        if (zzeqVar == null) {
            throw null;
        }
        zzhu zzhuVar = this.zzq;
        zzes<?> zzesVar = this.zzr;
        zzet<?> zzetVar = null;
        Object obj = null;
        while (true) {
            try {
                int zza2 = zzhdVar.zza();
                int zzg = zzg(zza2);
                if (zzg >= 0) {
                    int zzd = zzd(zzg);
                    switch ((267386880 & zzd) >>> 20) {
                        case 0:
                            zzia.zza(t, zzd & 1048575, zzhdVar.zzd());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 1:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zze());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 2:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzg());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 3:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzf());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 4:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzh());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 5:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzi());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 6:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzj());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 7:
                            zzia.zza(t, zzd & 1048575, zzhdVar.zzk());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 8:
                            zza(t, zzd, zzhdVar);
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 9:
                            if (zza((zzgr<T>) t, zzg)) {
                                long j = zzd & 1048575;
                                zzia.zza(t, j, zzfe.zza(zzia.zzf(t, j), zzhdVar.zza(zza(zzg), zzeqVar)));
                                break;
                            } else {
                                zzia.zza(t, zzd & 1048575, zzhdVar.zza(zza(zzg), zzeqVar));
                                zzb((zzgr<T>) t, zzg);
                                continue;
                            }
                        case 10:
                            zzia.zza(t, zzd & 1048575, zzhdVar.zzn());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 11:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzo());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 12:
                            int zzp = zzhdVar.zzp();
                            zzfj zzc = zzc(zzg);
                            if (zzc != null && !zzc.zza(zzp)) {
                                obj = zzhe.zza(zza2, zzp, obj, zzhuVar);
                                break;
                            }
                            zzia.zza((Object) t, zzd & 1048575, zzp);
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 13:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzq());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 14:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzr());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 15:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzs());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 16:
                            zzia.zza((Object) t, zzd & 1048575, zzhdVar.zzt());
                            zzb((zzgr<T>) t, zzg);
                            continue;
                        case 17:
                            if (zza((zzgr<T>) t, zzg)) {
                                long j2 = zzd & 1048575;
                                zzia.zza(t, j2, zzfe.zza(zzia.zzf(t, j2), zzhdVar.zzb(zza(zzg), zzeqVar)));
                                break;
                            } else {
                                zzia.zza(t, zzd & 1048575, zzhdVar.zzb(zza(zzg), zzeqVar));
                                zzb((zzgr<T>) t, zzg);
                                continue;
                            }
                        case 18:
                            zzhdVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 19:
                            zzhdVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 20:
                            zzhdVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 21:
                            zzhdVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 22:
                            zzhdVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 23:
                            zzhdVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 24:
                            zzhdVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 25:
                            zzhdVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 26:
                            if (zzf(zzd)) {
                                zzhdVar.zzj(this.zzp.zza(t, zzd & 1048575));
                                break;
                            } else {
                                zzhdVar.zzi(this.zzp.zza(t, zzd & 1048575));
                                continue;
                            }
                        case 27:
                            zzhdVar.zza(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzeqVar);
                            continue;
                        case 28:
                            zzhdVar.zzk(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 29:
                            zzhdVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza3 = this.zzp.zza(t, zzd & 1048575);
                            zzhdVar.zzm(zza3);
                            obj = zzhe.zza(zza2, zza3, zzc(zzg), obj, zzhuVar);
                            continue;
                        case 31:
                            zzhdVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 32:
                            zzhdVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 33:
                            zzhdVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 34:
                            zzhdVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 35:
                            zzhdVar.zza(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 36:
                            zzhdVar.zzb(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 37:
                            zzhdVar.zzd(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 38:
                            zzhdVar.zzc(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 39:
                            zzhdVar.zze(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 40:
                            zzhdVar.zzf(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 41:
                            zzhdVar.zzg(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 42:
                            zzhdVar.zzh(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 43:
                            zzhdVar.zzl(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza4 = this.zzp.zza(t, zzd & 1048575);
                            zzhdVar.zzm(zza4);
                            obj = zzhe.zza(zza2, zza4, zzc(zzg), obj, zzhuVar);
                            continue;
                        case 45:
                            zzhdVar.zzn(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 46:
                            zzhdVar.zzo(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 47:
                            zzhdVar.zzp(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 48:
                            zzhdVar.zzq(this.zzp.zza(t, zzd & 1048575));
                            continue;
                        case 49:
                            zzhdVar.zzb(this.zzp.zza(t, zzd & 1048575), zza(zzg), zzeqVar);
                            continue;
                        case 50:
                            Object zzb2 = zzb(zzg);
                            long zzd2 = zzd(zzg) & 1048575;
                            Object zzf = zzia.zzf(t, zzd2);
                            if (zzf == null) {
                                zzf = this.zzs.zze(zzb2);
                                zzia.zza(t, zzd2, zzf);
                            } else if (this.zzs.zzc(zzf)) {
                                Object zze = this.zzs.zze(zzb2);
                                this.zzs.zza(zze, zzf);
                                zzia.zza(t, zzd2, zze);
                                zzf = zze;
                            }
                            zzhdVar.zza(this.zzs.zza(zzf), this.zzs.zzf(zzb2), zzeqVar);
                            continue;
                        case 51:
                            zzia.zza(t, zzd & 1048575, Double.valueOf(zzhdVar.zzd()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 52:
                            zzia.zza(t, zzd & 1048575, Float.valueOf(zzhdVar.zze()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 53:
                            zzia.zza(t, zzd & 1048575, Long.valueOf(zzhdVar.zzg()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 54:
                            zzia.zza(t, zzd & 1048575, Long.valueOf(zzhdVar.zzf()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 55:
                            zzia.zza(t, zzd & 1048575, Integer.valueOf(zzhdVar.zzh()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 56:
                            zzia.zza(t, zzd & 1048575, Long.valueOf(zzhdVar.zzi()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 57:
                            zzia.zza(t, zzd & 1048575, Integer.valueOf(zzhdVar.zzj()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 58:
                            zzia.zza(t, zzd & 1048575, Boolean.valueOf(zzhdVar.zzk()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 59:
                            zza(t, zzd, zzhdVar);
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 60:
                            if (zza((zzgr<T>) t, zza2, zzg)) {
                                long j3 = zzd & 1048575;
                                zzia.zza(t, j3, zzfe.zza(zzia.zzf(t, j3), zzhdVar.zza(zza(zzg), zzeqVar)));
                            } else {
                                zzia.zza(t, zzd & 1048575, zzhdVar.zza(zza(zzg), zzeqVar));
                                zzb((zzgr<T>) t, zzg);
                            }
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 61:
                            zzia.zza(t, zzd & 1048575, zzhdVar.zzn());
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 62:
                            zzia.zza(t, zzd & 1048575, Integer.valueOf(zzhdVar.zzo()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 63:
                            int zzp2 = zzhdVar.zzp();
                            zzfj zzc2 = zzc(zzg);
                            if (zzc2 != null && !zzc2.zza(zzp2)) {
                                obj = zzhe.zza(zza2, zzp2, obj, zzhuVar);
                                break;
                            }
                            zzia.zza(t, zzd & 1048575, Integer.valueOf(zzp2));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 64:
                            zzia.zza(t, zzd & 1048575, Integer.valueOf(zzhdVar.zzq()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 65:
                            zzia.zza(t, zzd & 1048575, Long.valueOf(zzhdVar.zzr()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 66:
                            zzia.zza(t, zzd & 1048575, Integer.valueOf(zzhdVar.zzs()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 67:
                            zzia.zza(t, zzd & 1048575, Long.valueOf(zzhdVar.zzt()));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        case 68:
                            zzia.zza(t, zzd & 1048575, zzhdVar.zzb(zza(zzg), zzeqVar));
                            zzb((zzgr<T>) t, zza2, zzg);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzhuVar.zza();
                                } catch (zzfm unused) {
                                    zzhuVar.zza(zzhdVar);
                                    if (obj == null) {
                                        obj = zzhuVar.zzc(t);
                                    }
                                    if (!zzhuVar.zza((zzhu) obj, zzhdVar)) {
                                        for (int i = this.zzm; i < this.zzn; i++) {
                                            obj = zza((Object) t, this.zzl[i], (int) obj, (zzhu<UT, int>) zzhuVar);
                                        }
                                        if (obj != null) {
                                            zzhuVar.zzb((Object) t, (T) obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzhuVar.zza((zzhu) obj, zzhdVar)) {
                                for (int i2 = this.zzm; i2 < this.zzn; i2++) {
                                    obj = zza((Object) t, this.zzl[i2], (int) obj, (zzhu<UT, int>) zzhuVar);
                                }
                                if (obj != null) {
                                    zzhuVar.zzb((Object) t, (T) obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zza2 == Integer.MAX_VALUE) {
                    for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                        obj = zza((Object) t, this.zzl[i3], (int) obj, (zzhu<UT, int>) zzhuVar);
                    }
                    if (obj != null) {
                        zzhuVar.zzb((Object) t, (T) obj);
                        return;
                    }
                    return;
                } else {
                    Object zza5 = !this.zzh ? null : zzesVar.zza(zzeqVar, this.zzg, zza2);
                    if (zza5 != null) {
                        if (zzetVar == null) {
                            zzetVar = zzesVar.zzb(t);
                        }
                        zzet<?> zzetVar2 = zzetVar;
                        obj = zzesVar.zza(zzhdVar, zza5, zzeqVar, zzetVar2, obj, zzhuVar);
                        zzetVar = zzetVar2;
                    } else {
                        zzhuVar.zza(zzhdVar);
                        if (obj == null) {
                            obj = zzhuVar.zzc(t);
                        }
                        if (!zzhuVar.zza((zzhu) obj, zzhdVar)) {
                            for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                                obj = zza((Object) t, this.zzl[i4], (int) obj, (zzhu<UT, int>) zzhuVar);
                            }
                            if (obj != null) {
                                zzhuVar.zzb((Object) t, (T) obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzm; i5 < this.zzn; i5++) {
                    obj = zza((Object) t, this.zzl[i5], (int) obj, (zzhu<UT, int>) zzhuVar);
                }
                if (obj != null) {
                    zzhuVar.zzb((Object) t, (T) obj);
                }
                throw th;
            }
        }
    }

    private static zzhx zze(Object obj) {
        zzfd zzfdVar = (zzfd) obj;
        zzhx zzhxVar = zzfdVar.zzb;
        if (zzhxVar == zzhx.zza()) {
            zzhx zzb2 = zzhx.zzb();
            zzfdVar.zzb = zzb2;
            return zzb2;
        }
        return zzhxVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzil zzilVar, Class<?> cls, zzdq zzdqVar) throws IOException {
        switch (zzgq.zza[zzilVar.ordinal()]) {
            case 1:
                int zzb2 = zzdr.zzb(bArr, i, zzdqVar);
                zzdqVar.zzc = Boolean.valueOf(zzdqVar.zzb != 0);
                return zzb2;
            case 2:
                return zzdr.zze(bArr, i, zzdqVar);
            case 3:
                zzdqVar.zzc = Double.valueOf(zzdr.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzdqVar.zzc = Integer.valueOf(zzdr.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzdqVar.zzc = Long.valueOf(zzdr.zzb(bArr, i));
                return i + 8;
            case 8:
                zzdqVar.zzc = Float.valueOf(zzdr.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza2 = zzdr.zza(bArr, i, zzdqVar);
                zzdqVar.zzc = Integer.valueOf(zzdqVar.zza);
                return zza2;
            case 12:
            case 13:
                int zzb3 = zzdr.zzb(bArr, i, zzdqVar);
                zzdqVar.zzc = Long.valueOf(zzdqVar.zzb);
                return zzb3;
            case 14:
                return zzdr.zza(zzgy.zza().zza((Class) cls), bArr, i, i2, zzdqVar);
            case 15:
                int zza3 = zzdr.zza(bArr, i, zzdqVar);
                zzdqVar.zzc = Integer.valueOf(zzeh.zze(zzdqVar.zza));
                return zza3;
            case 16:
                int zzb4 = zzdr.zzb(bArr, i, zzdqVar);
                zzdqVar.zzc = Long.valueOf(zzeh.zza(zzdqVar.zzb));
                return zzb4;
            case 17:
                return zzdr.zzd(bArr, i, zzdqVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0236 -> B:116:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:67:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e8 -> B:96:0x01e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.zzdq r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgr.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzdq):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzdq zzdqVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzb2 = zzb(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzs.zzc(object)) {
            Object zze = this.zzs.zze(zzb2);
            this.zzs.zza(zze, object);
            unsafe.putObject(t, j, zze);
            object = zze;
        }
        zzge<?, ?> zzf = this.zzs.zzf(zzb2);
        Map<?, ?> zza2 = this.zzs.zza(object);
        int zza3 = zzdr.zza(bArr, i, zzdqVar);
        int i4 = zzdqVar.zza;
        if (i4 < 0 || i4 > i2 - zza3) {
            throw zzfn.zza();
        }
        int i5 = i4 + zza3;
        Object obj = (K) zzf.zzb;
        Object obj2 = (V) zzf.zzd;
        while (zza3 < i5) {
            int i6 = zza3 + 1;
            int i7 = bArr[zza3];
            if (i7 < 0) {
                i6 = zzdr.zza(i7, bArr, i6, zzdqVar);
                i7 = zzdqVar.zza;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzf.zza.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzf.zza, (Class<?>) null, zzdqVar);
                    obj = (K) zzdqVar.zzc;
                } else {
                    zza3 = zzdr.zza(i7, bArr, i8, i2, zzdqVar);
                }
            } else {
                if (i9 == 2 && i10 == zzf.zzc.zzb()) {
                    zza3 = zza(bArr, i8, i2, zzf.zzc, zzf.zzd.getClass(), zzdqVar);
                    obj2 = zzdqVar.zzc;
                }
                zza3 = zzdr.zza(i7, bArr, i8, i2, zzdqVar);
            }
        }
        if (zza3 != i5) {
            throw zzfn.zzg();
        }
        zza2.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzdq zzdqVar) throws IOException {
        int zzb2;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzdr.zzc(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzdr.zzd(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb2 = zzdr.zzb(bArr, i, zzdqVar);
                    unsafe.putObject(t, j, Long.valueOf(zzdqVar.zzb));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb2 = zzdr.zza(bArr, i, zzdqVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzdqVar.zza));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzdr.zzb(bArr, i)));
                    zzb2 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzdr.zza(bArr, i)));
                    zzb2 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb2 = zzdr.zzb(bArr, i, zzdqVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzdqVar.zzb != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza2 = zzdr.zza(bArr, i, zzdqVar);
                    int i9 = zzdqVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzid.zza(bArr, zza2, zza2 + i9)) {
                        throw zzfn.zzh();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza2, i9, zzfe.zza));
                        zza2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza3 = zzdr.zza(zza(i8), bArr, i, i2, zzdqVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzdqVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzfe.zza(object, zzdqVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza3;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb2 = zzdr.zze(bArr, i, zzdqVar);
                    unsafe.putObject(t, j, zzdqVar.zzc);
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza4 = zzdr.zza(bArr, i, zzdqVar);
                    int i10 = zzdqVar.zza;
                    zzfj zzc = zzc(i8);
                    if (zzc == null || zzc.zza(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb2 = zza4;
                        unsafe.putInt(t, j2, i4);
                        return zzb2;
                    }
                    zze(t).zza(i3, Long.valueOf(i10));
                    return zza4;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb2 = zzdr.zza(bArr, i, zzdqVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzeh.zze(zzdqVar.zza)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb2 = zzdr.zzb(bArr, i, zzdqVar);
                    unsafe.putObject(t, j, Long.valueOf(zzeh.zza(zzdqVar.zzb)));
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb2 = zzdr.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdqVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzdqVar.zzc);
                    } else {
                        unsafe.putObject(t, j, zzfe.zza(object2, zzdqVar.zzc));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb2;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzhc zza(int i) {
        int i2 = (i / 3) << 1;
        zzhc zzhcVar = (zzhc) this.zzd[i2];
        if (zzhcVar != null) {
            return zzhcVar;
        }
        zzhc<T> zza2 = zzgy.zza().zza((Class) ((Class) this.zzd[i2 + 1]));
        this.zzd[i2] = zza2;
        return zza2;
    }

    private final Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final zzfj zzc(int i) {
        return (zzfj) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzdq zzdqVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzgr<T> zzgrVar;
        int i5;
        byte b;
        int i6;
        int zzg;
        int i7;
        int i8;
        int i9;
        int i10;
        T t3;
        zzdq zzdqVar2;
        int i11;
        int i12;
        int i13;
        zzdq zzdqVar3;
        int i14;
        zzdq zzdqVar4;
        int i15;
        int i16;
        zzdq zzdqVar5;
        int i17;
        int i18;
        int i19;
        zzgr<T> zzgrVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i20 = i2;
        int i21 = i3;
        zzdq zzdqVar6 = zzdqVar;
        Unsafe unsafe2 = zzb;
        int i22 = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                byte b2 = bArr2[i22];
                if (b2 < 0) {
                    i6 = zzdr.zza(b2, bArr2, i28, zzdqVar6);
                    b = zzdqVar6.zza;
                } else {
                    b = b2;
                    i6 = i28;
                }
                int i29 = b >>> 3;
                int i30 = b & 7;
                if (i29 > i23) {
                    zzg = zzgrVar2.zza(i29, i24 / 3);
                } else {
                    zzg = zzgrVar2.zzg(i29);
                }
                int i31 = zzg;
                if (i31 == -1) {
                    i7 = i29;
                    i8 = i6;
                    i9 = b;
                    unsafe = unsafe2;
                    i4 = i21;
                    i10 = 0;
                } else {
                    int[] iArr = zzgrVar2.zzc;
                    int i32 = iArr[i31 + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = b;
                    long j = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[i31 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i27) {
                            if (i27 != -1) {
                                unsafe2.putInt(t4, i27, i26);
                            }
                            i26 = unsafe2.getInt(t4, i37);
                            i27 = i37;
                        }
                        switch (i33) {
                            case 0:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                i15 = i6;
                                if (i30 == 1) {
                                    zzia.zza(t4, j, zzdr.zzc(bArr2, i15));
                                    i22 = i15 + 8;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                i15 = i6;
                                if (i30 == 5) {
                                    zzia.zza((Object) t4, j, zzdr.zzd(bArr2, i15));
                                    i22 = i15 + 4;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                i15 = i6;
                                if (i30 == 0) {
                                    int zzb2 = zzdr.zzb(bArr2, i15, zzdqVar);
                                    unsafe2.putLong(t, j, zzdqVar.zzb);
                                    i26 |= i36;
                                    i22 = zzb2;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar;
                                    i27 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                i15 = i6;
                                if (i30 == 0) {
                                    i22 = zzdr.zza(bArr2, i15, zzdqVar4);
                                    unsafe2.putInt(t4, j, zzdqVar4.zza);
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                if (i30 == 1) {
                                    i14 = i27;
                                    i15 = i6;
                                    unsafe2.putLong(t, j, zzdr.zzb(bArr2, i6));
                                    i22 = i15 + 8;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar5 = zzdqVar;
                                if (i30 == 5) {
                                    unsafe2.putInt(t4, j, zzdr.zza(bArr2, i6));
                                    i22 = i6 + 4;
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar5 = zzdqVar;
                                if (i30 == 0) {
                                    int zzb3 = zzdr.zzb(bArr2, i6, zzdqVar5);
                                    zzia.zza(t4, j, zzdqVar5.zzb != 0);
                                    i26 |= i36;
                                    i22 = zzb3;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar5 = zzdqVar;
                                if (i30 == 2) {
                                    if ((i32 & 536870912) == 0) {
                                        i22 = zzdr.zzc(bArr2, i6, zzdqVar5);
                                    } else {
                                        i22 = zzdr.zzd(bArr2, i6, zzdqVar5);
                                    }
                                    unsafe2.putObject(t4, j, zzdqVar5.zzc);
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar5 = zzdqVar;
                                if (i30 == 2) {
                                    i16 = i2;
                                    i22 = zzdr.zza(zzgrVar2.zza(i11), bArr2, i6, i16, zzdqVar5);
                                    if ((i26 & i36) == 0) {
                                        unsafe2.putObject(t4, j, zzdqVar5.zzc);
                                    } else {
                                        unsafe2.putObject(t4, j, zzfe.zza(unsafe2.getObject(t4, j), zzdqVar5.zzc));
                                    }
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                if (i30 == 2) {
                                    i22 = zzdr.zze(bArr2, i6, zzdqVar4);
                                    unsafe2.putObject(t4, j, zzdqVar4.zzc);
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                if (i30 != 0) {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    i22 = zzdr.zza(bArr2, i6, zzdqVar4);
                                    int i38 = zzdqVar4.zza;
                                    zzfj zzc = zzgrVar2.zzc(i11);
                                    if (zzc == null || zzc.zza(i38)) {
                                        unsafe2.putInt(t4, j, i38);
                                        i26 |= i36;
                                        i25 = i13;
                                        i24 = i11;
                                        i23 = i12;
                                        zzdqVar6 = zzdqVar4;
                                        i20 = i2;
                                        i21 = i3;
                                        break;
                                    } else {
                                        zze(t).zza(i13, Long.valueOf(i38));
                                        i25 = i13;
                                        i24 = i11;
                                        i23 = i12;
                                        zzdqVar6 = zzdqVar4;
                                        i20 = i2;
                                        i21 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzdqVar4 = zzdqVar;
                                if (i30 == 0) {
                                    i22 = zzdr.zza(bArr2, i6, zzdqVar4);
                                    unsafe2.putInt(t4, j, zzeh.zze(zzdqVar4.zza));
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                if (i30 == 0) {
                                    bArr2 = bArr;
                                    int zzb4 = zzdr.zzb(bArr2, i6, zzdqVar);
                                    zzdqVar4 = zzdqVar;
                                    unsafe2.putLong(t, j, zzeh.zza(zzdqVar.zzb));
                                    i26 |= i36;
                                    i22 = zzb4;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzdqVar6 = zzdqVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i30 == 3) {
                                    i22 = zzdr.zza(zzgrVar2.zza(i31), bArr, i6, i2, (i29 << 3) | 4, zzdqVar);
                                    if ((i26 & i36) == 0) {
                                        zzdqVar3 = zzdqVar;
                                        unsafe2.putObject(t4, j, zzdqVar3.zzc);
                                    } else {
                                        zzdqVar3 = zzdqVar;
                                        unsafe2.putObject(t4, j, zzfe.zza(unsafe2.getObject(t4, j), zzdqVar3.zzc));
                                    }
                                    i26 |= i36;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i25 = i34;
                                    i24 = i31;
                                    i23 = i29;
                                    i21 = i3;
                                    zzdqVar6 = zzdqVar3;
                                    break;
                                } else {
                                    i11 = i31;
                                    i12 = i29;
                                    i13 = i34;
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                i15 = i6;
                                i8 = i15;
                                i10 = i11;
                                unsafe = unsafe2;
                                i7 = i12;
                                i27 = i14;
                                i9 = i13;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i39 = i27;
                        int i40 = i6;
                        bArr2 = bArr;
                        zzdq zzdqVar7 = zzdqVar6;
                        if (i33 != 27) {
                            i17 = i26;
                            if (i33 <= 49) {
                                i7 = i29;
                                i19 = i34;
                                i10 = i31;
                                unsafe = unsafe2;
                                i22 = zza((zzgr<T>) t, bArr, i40, i2, i34, i29, i30, i31, i32, i33, j, zzdqVar);
                                if (i22 == i40) {
                                    i4 = i3;
                                    i8 = i22;
                                } else {
                                    zzgrVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i21 = i3;
                                    zzdqVar6 = zzdqVar;
                                    i27 = i39;
                                    i24 = i10;
                                    i26 = i17;
                                    i23 = i7;
                                    i25 = i19;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i7 = i29;
                                i18 = i40;
                                i19 = i34;
                                i10 = i31;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i22 = zza((zzgr<T>) t, bArr, i18, i2, i19, i7, i30, i32, i33, j, i10, zzdqVar);
                                    if (i22 != i18) {
                                        zzgrVar2 = this;
                                        t4 = t;
                                        i20 = i2;
                                        i21 = i3;
                                        i25 = i19;
                                        i23 = i7;
                                        i27 = i39;
                                        i24 = i10;
                                        i26 = i17;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        zzdqVar6 = zzdqVar;
                                    }
                                } else if (i30 == 2) {
                                    i22 = zza((zzgr<T>) t, bArr, i18, i2, i10, j, zzdqVar);
                                    if (i22 != i18) {
                                        zzgrVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i20 = i2;
                                        i21 = i3;
                                        zzdqVar6 = zzdqVar;
                                        i27 = i39;
                                        i24 = i10;
                                        i26 = i17;
                                        i23 = i7;
                                        i25 = i19;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i8 = i18;
                                }
                                i4 = i3;
                                i8 = i22;
                            }
                        } else if (i30 == 2) {
                            zzfk zzfkVar = (zzfk) unsafe2.getObject(t4, j);
                            if (!zzfkVar.zza()) {
                                int size = zzfkVar.size();
                                zzfkVar = zzfkVar.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, zzfkVar);
                            }
                            i22 = zzdr.zza(zzgrVar2.zza(i31), i34, bArr, i40, i2, zzfkVar, zzdqVar);
                            i21 = i3;
                            i23 = i29;
                            i25 = i34;
                            i24 = i31;
                            zzdqVar6 = zzdqVar7;
                            i27 = i39;
                            i26 = i26;
                            i20 = i2;
                        } else {
                            i17 = i26;
                            i7 = i29;
                            i18 = i40;
                            i19 = i34;
                            i10 = i31;
                            unsafe = unsafe2;
                            i4 = i3;
                            i8 = i18;
                        }
                        i27 = i39;
                        i26 = i17;
                        i9 = i19;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzdqVar2 = zzdqVar;
                        if (zzdqVar2.zzd != zzeq.zza()) {
                            int i41 = i7;
                            if (zzdqVar2.zzd.zza(this.zzg, i41) == null) {
                                i22 = zzdr.zza(i9, bArr, i8, i2, zze(t), zzdqVar);
                                t4 = t;
                                i20 = i2;
                                i25 = i9;
                                zzgrVar2 = this;
                                zzdqVar6 = zzdqVar2;
                                i23 = i41;
                                i24 = i10;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i21 = i4;
                            } else {
                                zzfd.zzb zzbVar = (zzfd.zzb) t;
                                zzbVar.zza();
                                zzet<Object> zzetVar = zzbVar.zzc;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        zzdqVar2 = zzdqVar;
                    }
                    i22 = zzdr.zza(i9, bArr, i8, i2, zze(t), zzdqVar);
                    i25 = i9;
                    zzgrVar2 = this;
                    zzdqVar6 = zzdqVar2;
                    i23 = i7;
                    t4 = t3;
                    i24 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i20 = i2;
                    i21 = i4;
                } else {
                    i5 = -1;
                    zzgrVar = this;
                    t2 = t;
                    i22 = i8;
                    i25 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i21;
                t2 = t4;
                zzgrVar = zzgrVar2;
                i5 = -1;
            }
        }
        if (i27 != i5) {
            unsafe.putInt(t2, i27, i26);
        }
        zzhx zzhxVar = null;
        for (int i42 = zzgrVar.zzm; i42 < zzgrVar.zzn; i42++) {
            zzhxVar = (zzhx) zzgrVar.zza((Object) t2, zzgrVar.zzl[i42], (int) zzhxVar, (zzhu<UT, int>) zzgrVar.zzq);
        }
        if (zzhxVar != null) {
            zzgrVar.zzq.zzb((Object) t2, (T) zzhxVar);
        }
        if (i4 == 0) {
            if (i22 != i2) {
                throw zzfn.zzg();
            }
        } else if (i22 > i2 || i25 != i4) {
            throw zzfn.zzg();
        }
        return i22;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.zzdq r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgr.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdq):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long zzd = zzd(this.zzl[i2]) & 1048575;
            Object zzf = zzia.zzf(t, zzd);
            if (zzf != null) {
                zzia.zza(t, zzd, this.zzs.zzd(zzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzhu<UT, UB> zzhuVar) {
        zzfj zzc;
        int i2 = this.zzc[i];
        Object zzf = zzia.zzf(obj, zzd(i) & 1048575);
        return (zzf == null || (zzc = zzc(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zza(zzf), zzc, (zzfj) ub, (zzhu<UT, zzfj>) zzhuVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzfj zzfjVar, UB ub, zzhu<UT, UB> zzhuVar) {
        zzge<?, ?> zzf = this.zzs.zzf(zzb(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzfjVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzhuVar.zza();
                }
                zzed zzc = zzdv.zzc(zzgf.zza(zzf, next.getKey(), next.getValue()));
                try {
                    zzgf.zza(zzc.zzb(), zzf, next.getKey(), next.getValue());
                    zzhuVar.zza((zzhu<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.zzhc] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.zzhc] */
    @Override // com.google.android.gms.internal.measurement.zzhc
    public final boolean zzd(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t).zzf();
            }
            int i5 = this.zzl[i3];
            int i6 = this.zzc[i5];
            int zzd = zzd(i5);
            if (this.zzj) {
                i = 0;
            } else {
                int i7 = this.zzc[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzb.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & zzd) != 0) && !zza((zzgr<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzd) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((zzgr<T>) t, i5, i4, i) && !zza(t, zzd, zza(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzgr<T>) t, i6, i5) && !zza(t, zzd, zza(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzb2 = this.zzs.zzb(zzia.zzf(t, zzd & 1048575));
                            if (!zzb2.isEmpty()) {
                                if (this.zzs.zzf(zzb(i5)).zzc.zza() == zzio.MESSAGE) {
                                    zzhc<T> zzhcVar = 0;
                                    Iterator<?> it = zzb2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzhcVar == null) {
                                            zzhcVar = zzgy.zza().zza((Class) next.getClass());
                                        }
                                        boolean zzd2 = zzhcVar.zzd(next);
                                        zzhcVar = zzhcVar;
                                        if (!zzd2) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzia.zzf(t, zzd & 1048575);
                if (!list.isEmpty()) {
                    ?? zza2 = zza(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zza2.zzd(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzhc zzhcVar) {
        return zzhcVar.zzd(zzia.zzf(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzir zzirVar) throws IOException {
        if (obj instanceof String) {
            zzirVar.zza(i, (String) obj);
        } else {
            zzirVar.zza(i, (zzdv) obj);
        }
    }

    private final void zza(Object obj, int i, zzhd zzhdVar) throws IOException {
        if (zzf(i)) {
            zzia.zza(obj, i & 1048575, zzhdVar.zzm());
        } else if (this.zzi) {
            zzia.zza(obj, i & 1048575, zzhdVar.zzl());
        } else {
            zzia.zza(obj, i & 1048575, zzhdVar.zzn());
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((Double) zzia.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((Float) zzia.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((Integer) zzia.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((Long) zzia.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((Boolean) zzia.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzgr<T>) t, i) == zza((zzgr<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzj) {
            return zza((zzgr<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzj) {
            int zzd = zzd(i);
            long j = zzd & 1048575;
            switch ((zzd & 267386880) >>> 20) {
                case 0:
                    return zzia.zze(t, j) != 0.0d;
                case 1:
                    return zzia.zzd(t, j) != 0.0f;
                case 2:
                    return zzia.zzb(t, j) != 0;
                case 3:
                    return zzia.zzb(t, j) != 0;
                case 4:
                    return zzia.zza(t, j) != 0;
                case 5:
                    return zzia.zzb(t, j) != 0;
                case 6:
                    return zzia.zza(t, j) != 0;
                case 7:
                    return zzia.zzc(t, j);
                case 8:
                    Object zzf = zzia.zzf(t, j);
                    if (zzf instanceof String) {
                        return !((String) zzf).isEmpty();
                    } else if (zzf instanceof zzdv) {
                        return !zzdv.zza.equals(zzf);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zzia.zzf(t, j) != null;
                case 10:
                    return !zzdv.zza.equals(zzia.zzf(t, j));
                case 11:
                    return zzia.zza(t, j) != 0;
                case 12:
                    return zzia.zza(t, j) != 0;
                case 13:
                    return zzia.zza(t, j) != 0;
                case 14:
                    return zzia.zzb(t, j) != 0;
                case 15:
                    return zzia.zza(t, j) != 0;
                case 16:
                    return zzia.zzb(t, j) != 0;
                case 17:
                    return zzia.zzf(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zze = zze(i);
        return (zzia.zza(t, (long) (zze & 1048575)) & (1 << (zze >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzj) {
            return;
        }
        int zze = zze(i);
        long j = zze & 1048575;
        zzia.zza((Object) t, j, zzia.zza(t, j) | (1 << (zze >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzia.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzia.zza((Object) t, zze(i2) & 1048575, i);
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }

    private final int zzb(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
