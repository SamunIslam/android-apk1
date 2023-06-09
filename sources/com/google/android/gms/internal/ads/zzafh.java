package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafh extends zzaeq {
    private final UnifiedNativeAd.UnconfirmedClickListener zzczv;

    public zzafh(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zzczv = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void onUnconfirmedClickReceived(String str) {
        this.zzczv.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void onUnconfirmedClickCancelled() {
        this.zzczv.onUnconfirmedClickCancelled();
    }
}
