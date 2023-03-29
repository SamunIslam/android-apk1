package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzev;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzet<T extends zzev<T>> {
    private static final zzet zzd = new zzet(true);
    final zzhh<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzet() {
        this.zza = zzhh.zza(16);
    }

    private zzet(boolean z) {
        this(zzhh.zza(0));
        zzb();
    }

    private zzet(zzhh<T, Object> zzhhVar) {
        this.zza = zzhhVar;
        zzb();
    }

    public static <T extends zzev<T>> zzet<T> zza() {
        return zzd;
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzet) {
            return this.zza.equals(((zzet) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzft(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzft(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        return obj instanceof zzfo ? zzfo.zza() : obj;
    }

    private final void zzb(T t, Object obj) {
        if (t.zzd()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            zza(t.zzb(), obj);
        }
        if (obj instanceof zzfo) {
            this.zzc = true;
        }
        this.zza.zza((zzhh<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfh) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzfo) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzil r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzfe.zza(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzew.zza
            com.google.android.gms.internal.measurement.zzio r2 = r2.zza()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzgn
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfo
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzfh
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzdv
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L4e
        L4d:
            throw r2
        L4e:
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzet.zza(com.google.android.gms.internal.measurement.zzil, java.lang.Object):void");
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza((Map.Entry) this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            if (!zza((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzev<T>> boolean zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == zzio.MESSAGE) {
            if (key.zzd()) {
                for (zzgn zzgnVar : (List) entry.getValue()) {
                    if (!zzgnVar.h_()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgn) {
                    if (!((zzgn) value).h_()) {
                        return false;
                    }
                } else if (value instanceof zzfo) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzet<T> zzetVar) {
        for (int i = 0; i < zzetVar.zza.zzc(); i++) {
            zzb(zzetVar.zza.zzb(i));
        }
        for (Map.Entry<T, Object> entry : zzetVar.zza.zzd()) {
            zzb(entry);
        }
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzgs) {
            return ((zzgs) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzgn zzu;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzfo) {
            value = zzfo.zza();
        }
        if (key.zzd()) {
            Object zza = zza((zzet<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zza(obj));
            }
            this.zza.zza((zzhh<T, Object>) key, (T) zza);
        } else if (key.zzc() == zzio.MESSAGE) {
            Object zza2 = zza((zzet<T>) key);
            if (zza2 == null) {
                this.zza.zza((zzhh<T, Object>) key, (T) zza(value));
                return;
            }
            if (zza2 instanceof zzgs) {
                zzu = key.zza((zzgs) zza2, (zzgs) value);
            } else {
                zzu = key.zza(((zzgn) zza2).zzbp(), (zzgn) value).zzu();
            }
            this.zza.zza((zzhh<T, Object>) key, (T) zzu);
        } else {
            this.zza.zza((zzhh<T, Object>) key, (T) zza(value));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzek zzekVar, zzil zzilVar, int i, Object obj) throws IOException {
        if (zzilVar == zzil.zzj) {
            zzgn zzgnVar = (zzgn) obj;
            zzfe.zza(zzgnVar);
            zzekVar.zza(i, 3);
            zzgnVar.zza(zzekVar);
            zzekVar.zza(i, 4);
            return;
        }
        zzekVar.zza(i, zzilVar.zzb());
        switch (zzew.zzb[zzilVar.ordinal()]) {
            case 1:
                zzekVar.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzekVar.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzekVar.zza(((Long) obj).longValue());
                return;
            case 4:
                zzekVar.zza(((Long) obj).longValue());
                return;
            case 5:
                zzekVar.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzekVar.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzekVar.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzekVar.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgn) obj).zza(zzekVar);
                return;
            case 10:
                zzekVar.zza((zzgn) obj);
                return;
            case 11:
                if (obj instanceof zzdv) {
                    zzekVar.zza((zzdv) obj);
                    return;
                } else {
                    zzekVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzdv) {
                    zzekVar.zza((zzdv) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzekVar.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzekVar.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzekVar.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzekVar.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzekVar.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzekVar.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfh) {
                    zzekVar.zza(((zzfh) obj).zza());
                    return;
                } else {
                    zzekVar.zza(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            i += zzc(entry);
        }
        return i;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzio.MESSAGE && !key.zzd() && !key.zze()) {
            if (value instanceof zzfo) {
                return zzek.zzb(entry.getKey().zza(), (zzfo) value);
            }
            return zzek.zzb(entry.getKey().zza(), (zzgn) value);
        }
        return zza((zzev<?>) key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzil zzilVar, int i, Object obj) {
        int zze = zzek.zze(i);
        if (zzilVar == zzil.zzj) {
            zzfe.zza((zzgn) obj);
            zze <<= 1;
        }
        return zze + zzb(zzilVar, obj);
    }

    private static int zzb(zzil zzilVar, Object obj) {
        switch (zzew.zzb[zzilVar.ordinal()]) {
            case 1:
                return zzek.zzb(((Double) obj).doubleValue());
            case 2:
                return zzek.zzb(((Float) obj).floatValue());
            case 3:
                return zzek.zzd(((Long) obj).longValue());
            case 4:
                return zzek.zze(((Long) obj).longValue());
            case 5:
                return zzek.zzf(((Integer) obj).intValue());
            case 6:
                return zzek.zzg(((Long) obj).longValue());
            case 7:
                return zzek.zzi(((Integer) obj).intValue());
            case 8:
                return zzek.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzek.zzc((zzgn) obj);
            case 10:
                if (obj instanceof zzfo) {
                    return zzek.zza((zzfo) obj);
                }
                return zzek.zzb((zzgn) obj);
            case 11:
                if (obj instanceof zzdv) {
                    return zzek.zzb((zzdv) obj);
                }
                return zzek.zzb((String) obj);
            case 12:
                if (obj instanceof zzdv) {
                    return zzek.zzb((zzdv) obj);
                }
                return zzek.zzb((byte[]) obj);
            case 13:
                return zzek.zzg(((Integer) obj).intValue());
            case 14:
                return zzek.zzj(((Integer) obj).intValue());
            case 15:
                return zzek.zzh(((Long) obj).longValue());
            case 16:
                return zzek.zzh(((Integer) obj).intValue());
            case 17:
                return zzek.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfh) {
                    return zzek.zzk(((zzfh) obj).zza());
                }
                return zzek.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzev<?> zzevVar, Object obj) {
        zzil zzb = zzevVar.zzb();
        int zza = zzevVar.zza();
        if (zzevVar.zzd()) {
            int i = 0;
            if (zzevVar.zze()) {
                for (Object obj2 : (List) obj) {
                    i += zzb(zzb, obj2);
                }
                return zzek.zze(zza) + i + zzek.zzl(i);
            }
            for (Object obj3 : (List) obj) {
                i += zza(zzb, zza, obj3);
            }
            return i;
        }
        return zza(zzb, zza, obj);
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzet zzetVar = new zzet();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb = this.zza.zzb(i);
            zzetVar.zzb((zzet) zzb.getKey(), zzb.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzd()) {
            zzetVar.zzb((zzet) entry.getKey(), entry.getValue());
        }
        zzetVar.zzc = this.zzc;
        return zzetVar;
    }
}
