package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface MediationAdCallback {
    void onAdClosed();

    void onAdOpened();

    void reportAdClicked();

    void reportAdImpression();
}
