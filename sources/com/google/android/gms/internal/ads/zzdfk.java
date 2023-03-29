package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdfk implements zzdej {
    static final zzdej zzgrd = new zzdfk();

    private zzdfk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzr(Object obj) {
        ((AdMetadataListener) obj).onAdMetadataChanged();
    }
}
