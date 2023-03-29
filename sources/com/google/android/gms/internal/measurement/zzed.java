package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzed {
    private final zzek zza;
    private final byte[] zzb;

    private zzed(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzek.zza(bArr);
    }

    public final zzdv zza() {
        this.zza.zzb();
        return new zzef(this.zzb);
    }

    public final zzek zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzed(int i, zzdu zzduVar) {
        this(i);
    }
}
