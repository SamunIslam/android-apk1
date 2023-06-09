package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzall {
    private final long zzdet;
    private final String zzdfn;
    private final String zzdfo;
    public final List<String> zzdfp;
    private final String zzdfq;
    private final String zzdfr;
    private final List<String> zzdfs;
    private final List<String> zzdft;
    private final List<String> zzdfu;
    private final List<String> zzdfv;
    private final List<String> zzdfw;
    public final String zzdfx;
    private final List<String> zzdfy;
    private final List<String> zzdfz;
    private final List<String> zzdga;
    private final String zzdgb;
    private final String zzdgc;
    private final String zzdgd;
    private final String zzdge;
    private final String zzdgf;
    private final List<String> zzdgg;
    private final String zzdgh;
    public final String zzdgi;

    public zzall(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.zzdfo = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zzdfp = Collections.unmodifiableList(arrayList);
        this.zzdfq = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdfs = zzaln.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdft = zzaln.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdfu = zzaln.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdfw = zzaln.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdfy = zzaln.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdga = zzaln.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdfz = zzaln.zza(jSONObject, "video_reward_urls");
        this.zzdgb = jSONObject.optString("transaction_id");
        this.zzdgc = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzq.zzlo();
            list = zzaln.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzdfv = list;
        this.zzdfn = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.zzdfx = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.zzdfr = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.zzdgd = jSONObject.optString("html_template", null);
        this.zzdge = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.zzdgf = optJSONObject3 != null ? optJSONObject3.toString() : null;
        com.google.android.gms.ads.internal.zzq.zzlo();
        this.zzdgg = zzaln.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.zzdgh = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.zzdgi = jSONObject.optString("response_type", null);
        this.zzdet = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
