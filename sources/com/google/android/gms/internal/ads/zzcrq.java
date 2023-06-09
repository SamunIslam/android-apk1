package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcrq implements zzcnk<zzanv, zzcot> {
    private final zzcsx zzghn;

    public zzcrq(zzcsx zzcsxVar) {
        this.zzghn = zzcsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final zzcnl<zzanv, zzcot> zzf(String str, JSONObject jSONObject) throws zzdhk {
        zzanv zzgn = this.zzghn.zzgn(str);
        if (zzgn == null) {
            return null;
        }
        return new zzcnl<>(zzgn, new zzcot(), str);
    }
}
