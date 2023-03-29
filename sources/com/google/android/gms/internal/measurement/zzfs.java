package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public class zzfs {
    private static final zzeq zza = zzeq.zza();
    private zzdv zzb;
    private volatile zzgn zzc;
    private volatile zzdv zzd;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfs) {
            zzfs zzfsVar = (zzfs) obj;
            zzgn zzgnVar = this.zzc;
            zzgn zzgnVar2 = zzfsVar.zzc;
            if (zzgnVar == null && zzgnVar2 == null) {
                return zzc().equals(zzfsVar.zzc());
            }
            if (zzgnVar == null || zzgnVar2 == null) {
                if (zzgnVar != null) {
                    return zzgnVar.equals(zzfsVar.zzb(zzgnVar.zzv()));
                }
                return zzb(zzgnVar2.zzv()).equals(zzgnVar2);
            }
            return zzgnVar.equals(zzgnVar2);
        }
        return false;
    }

    private final zzgn zzb(zzgn zzgnVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzgnVar;
                        this.zzd = zzdv.zza;
                    } catch (zzfn unused) {
                        this.zzc = zzgnVar;
                        this.zzd = zzdv.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public final zzgn zza(zzgn zzgnVar) {
        zzgn zzgnVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzgnVar;
        return zzgnVar2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzbl();
        }
        return 0;
    }

    public final zzdv zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzdv.zza;
            } else {
                this.zzd = this.zzc.zzbg();
            }
            return this.zzd;
        }
    }
}
