package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzha implements zzgl {
    private final zzgn zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzha(zzgn zzgnVar, String str, Object[] objArr) {
        this.zza = zzgnVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final zzgn zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final int zza() {
        return (this.zzd & 1) == 1 ? zzfd.zzd.zzh : zzfd.zzd.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzgl
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }
}
