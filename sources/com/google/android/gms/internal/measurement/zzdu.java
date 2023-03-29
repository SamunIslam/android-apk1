package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzdu extends zzdw {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzdv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdu(zzdv zzdvVar) {
        this.zzc = zzdvVar;
        this.zzb = this.zzc.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzea
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
