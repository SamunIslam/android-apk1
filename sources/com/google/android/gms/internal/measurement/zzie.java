package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
abstract class zzie {
    abstract int zza(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i, int i2) throws zzfn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
