package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdct implements zzdah {
    static final zzdah zzgof = new zzdct();

    private zzdct() {
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final void zzs(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
