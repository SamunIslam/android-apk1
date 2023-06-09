package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzdan implements zzdah<Bundle> {
    private final boolean zzdqh;
    private final boolean zzdqi;
    private final String zzdqj;
    private final boolean zzdqk;
    private final boolean zzdql;
    private final boolean zzdqm;
    private final String zzdqn;
    private final String zzdqo;
    private final String zzdqp;
    private final boolean zzdqq;
    private final ArrayList<String> zzgor;
    private final String zzgos;
    private final String zzgot;
    private final long zzgou;

    public zzdan(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.zzdqh = z;
        this.zzdqi = z2;
        this.zzdqj = str;
        this.zzdqk = z3;
        this.zzdql = z4;
        this.zzdqm = z5;
        this.zzdqn = str2;
        this.zzgor = arrayList;
        this.zzdqo = str3;
        this.zzdqp = str4;
        this.zzgos = str5;
        this.zzdqq = z6;
        this.zzgot = str6;
        this.zzgou = j;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.zzdqh);
        bundle2.putBoolean("coh", this.zzdqi);
        bundle2.putString("gl", this.zzdqj);
        bundle2.putBoolean("simulator", this.zzdqk);
        bundle2.putBoolean("is_latchsky", this.zzdql);
        bundle2.putBoolean("is_sidewinder", this.zzdqm);
        bundle2.putString("hl", this.zzdqn);
        if (!this.zzgor.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.zzgor);
        }
        bundle2.putString("mv", this.zzdqo);
        bundle2.putString("submodel", this.zzgot);
        Bundle zza = zzdhj.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        zza.putString("build", this.zzgos);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcom)).booleanValue()) {
            zza.putLong("remaining_data_partition_space", this.zzgou);
        }
        Bundle zza2 = zzdhj.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzdqq);
        if (TextUtils.isEmpty(this.zzdqp)) {
            return;
        }
        Bundle zza3 = zzdhj.zza(zza, "play_store");
        zza.putBundle("play_store", zza3);
        zza3.putString("package_version", this.zzdqp);
    }
}
