package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzduq implements zzdsi {
    private final zzdsu<zzdsi> zzhkw;

    public zzduq(zzdsu<zzdsi> zzdsuVar) {
        this.zzhkw = zzdsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzdys.zza(this.zzhkw.zzaxh().zzaxg(), this.zzhkw.zzaxh().zzaxd().zzc(bArr, bArr2));
    }
}
