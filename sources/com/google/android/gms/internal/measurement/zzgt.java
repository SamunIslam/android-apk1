package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzgt<T> implements zzhc<T> {
    private final zzgn zza;
    private final zzhu<?, ?> zzb;
    private final boolean zzc;
    private final zzes<?> zzd;

    private zzgt(zzhu<?, ?> zzhuVar, zzes<?> zzesVar, zzgn zzgnVar) {
        this.zzb = zzhuVar;
        this.zzc = zzesVar.zza(zzgnVar);
        this.zzd = zzesVar;
        this.zza = zzgnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzgt<T> zza(zzhu<?, ?> zzhuVar, zzes<?> zzesVar, zzgn zzgnVar) {
        return new zzgt<>(zzhuVar, zzesVar, zzgnVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final T zza() {
        return (T) this.zza.zzbq().zzt();
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final boolean zza(T t, T t2) {
        if (this.zzb.zzb(t).equals(this.zzb.zzb(t2))) {
            if (this.zzc) {
                return this.zzd.zza(t).equals(this.zzd.zza(t2));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final int zza(T t) {
        int hashCode = this.zzb.zzb(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zzb(T t, T t2) {
        zzhe.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzhe.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zza(T t, zzir zzirVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzev zzevVar = (zzev) next.getKey();
            if (zzevVar.zzc() != zzio.MESSAGE || zzevVar.zzd() || zzevVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzfq) {
                zzirVar.zza(zzevVar.zza(), (Object) ((zzfq) next).zza().zzc());
            } else {
                zzirVar.zza(zzevVar.zza(), next.getValue());
            }
        }
        zzhu<?, ?> zzhuVar = this.zzb;
        zzhuVar.zzb((zzhu<?, ?>) zzhuVar.zzb(t), zzirVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzhc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.zzdq r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzfd r0 = (com.google.android.gms.internal.measurement.zzfd) r0
            com.google.android.gms.internal.measurement.zzhx r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzhx r2 = com.google.android.gms.internal.measurement.zzhx.zza()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.measurement.zzhx r1 = com.google.android.gms.internal.measurement.zzhx.zzb()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.measurement.zzfd$zzb r10 = (com.google.android.gms.internal.measurement.zzfd.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.measurement.zzdr.zza(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.measurement.zzes<?> r12 = r9.zzd
            com.google.android.gms.internal.measurement.zzeq r0 = r14.zzd
            com.google.android.gms.internal.measurement.zzgn r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzfd$zze r0 = (com.google.android.gms.internal.measurement.zzfd.zze) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.zzdr.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.measurement.zzgy.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.measurement.zzdr.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdr.zza(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdr.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.measurement.zzdv r2 = (com.google.android.gms.internal.measurement.zzdv) r2
            goto L53
        L72:
            com.google.android.gms.internal.measurement.zzgy.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.measurement.zzdr.zza(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.measurement.zzes<?> r0 = r9.zzd
            com.google.android.gms.internal.measurement.zzeq r5 = r14.zzd
            com.google.android.gms.internal.measurement.zzgn r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzfd$zze r0 = (com.google.android.gms.internal.measurement.zzfd.zze) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.measurement.zzdr.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.measurement.zzfn r10 = com.google.android.gms.internal.measurement.zzfn.zzg()
            goto Lad
        Lac:
            throw r10
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgt.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdq):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zza(T t, zzhd zzhdVar, zzeq zzeqVar) throws IOException {
        boolean z;
        zzhu<?, ?> zzhuVar = this.zzb;
        zzes<?> zzesVar = this.zzd;
        Object zzc = zzhuVar.zzc(t);
        zzet<?> zzb = zzesVar.zzb(t);
        do {
            try {
                if (zzhdVar.zza() == Integer.MAX_VALUE) {
                    return;
                }
                int zzb2 = zzhdVar.zzb();
                if (zzb2 == 11) {
                    int i = 0;
                    Object obj = null;
                    zzdv zzdvVar = null;
                    while (zzhdVar.zza() != Integer.MAX_VALUE) {
                        int zzb3 = zzhdVar.zzb();
                        if (zzb3 == 16) {
                            i = zzhdVar.zzo();
                            obj = zzesVar.zza(zzeqVar, this.zza, i);
                        } else if (zzb3 == 26) {
                            if (obj != null) {
                                zzesVar.zza(zzhdVar, obj, zzeqVar, zzb);
                            } else {
                                zzdvVar = zzhdVar.zzn();
                            }
                        } else if (!zzhdVar.zzc()) {
                            break;
                        }
                    }
                    if (zzhdVar.zzb() != 12) {
                        throw zzfn.zze();
                    } else if (zzdvVar != null) {
                        if (obj != null) {
                            zzesVar.zza(zzdvVar, obj, zzeqVar, zzb);
                        } else {
                            zzhuVar.zza((zzhu<?, ?>) zzc, i, zzdvVar);
                        }
                    }
                } else if ((zzb2 & 7) == 2) {
                    Object zza = zzesVar.zza(zzeqVar, this.zza, zzb2 >>> 3);
                    if (zza != null) {
                        zzesVar.zza(zzhdVar, zza, zzeqVar, zzb);
                    } else {
                        z = zzhuVar.zza((zzhu<?, ?>) zzc, zzhdVar);
                        continue;
                    }
                } else {
                    z = zzhdVar.zzc();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzhuVar.zzb((Object) t, (T) zzc);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final void zzc(T t) {
        this.zzb.zzd(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final int zzb(T t) {
        zzhu<?, ?> zzhuVar = this.zzb;
        int zze = zzhuVar.zze(zzhuVar.zzb(t)) + 0;
        return this.zzc ? zze + this.zzd.zza(t).zzg() : zze;
    }
}
