package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
abstract class zzhu<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zza();

    abstract T zza(B b);

    abstract void zza(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzdv zzdvVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzir zzirVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzhd zzhdVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzb(Object obj);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t, zzir zzirVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzc(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zze(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzf(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzhd zzhdVar) throws IOException {
        int zzb = zzhdVar.zzb();
        int i = zzb >>> 3;
        int i2 = zzb & 7;
        if (i2 == 0) {
            zza((zzhu<T, B>) b, i, zzhdVar.zzg());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzhdVar.zzi());
            return true;
        } else if (i2 == 2) {
            zza((zzhu<T, B>) b, i, zzhdVar.zzn());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zza((zzhu<T, B>) b, i, zzhdVar.zzj());
                    return true;
                }
                throw zzfn.zzf();
            }
            return false;
        } else {
            B zza = zza();
            int i3 = 4 | (i << 3);
            while (zzhdVar.zza() != Integer.MAX_VALUE && zza((zzhu<T, B>) zza, zzhdVar)) {
            }
            if (i3 != zzhdVar.zzb()) {
                throw zzfn.zze();
            }
            zza((zzhu<T, B>) b, i, (int) zza((zzhu<T, B>) zza));
            return true;
        }
    }
}
