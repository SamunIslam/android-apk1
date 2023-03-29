package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyz implements zzdah<Bundle> {
    private final Bundle zzfmv;

    public zzcyz(Bundle bundle) {
        this.zzfmv = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.zzfmv;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
