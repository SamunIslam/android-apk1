package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.zzazw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class NativeContentAdView extends NativeAdView {
    public NativeContentAdView(Context context) {
        super(context);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void setHeadlineView(View view) {
        super.zza(NativeContentAd.ASSET_HEADLINE, view);
    }

    public final void setBodyView(View view) {
        super.zza(NativeContentAd.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        super.zza(NativeContentAd.ASSET_CALL_TO_ACTION, view);
    }

    public final void setAdvertiserView(View view) {
        super.zza(NativeContentAd.ASSET_ADVERTISER, view);
    }

    public final void setImageView(View view) {
        super.zza(NativeContentAd.ASSET_IMAGE, view);
    }

    public final void setLogoView(View view) {
        super.zza(NativeContentAd.ASSET_LOGO, view);
    }

    public final void setMediaView(MediaView mediaView) {
        super.zza(NativeContentAd.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final View getHeadlineView() {
        return super.zzbl(NativeContentAd.ASSET_HEADLINE);
    }

    public final View getBodyView() {
        return super.zzbl(NativeContentAd.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return super.zzbl(NativeContentAd.ASSET_CALL_TO_ACTION);
    }

    public final View getAdvertiserView() {
        return super.zzbl(NativeContentAd.ASSET_ADVERTISER);
    }

    public final View getImageView() {
        return super.zzbl(NativeContentAd.ASSET_IMAGE);
    }

    public final View getLogoView() {
        return super.zzbl(NativeContentAd.ASSET_LOGO);
    }

    public final MediaView getMediaView() {
        View zzbl = super.zzbl(NativeContentAd.ASSET_MEDIA_VIDEO);
        if (zzbl instanceof MediaView) {
            return (MediaView) zzbl;
        }
        if (zzbl != null) {
            zzazw.zzed("View is not an instance of MediaView");
            return null;
        }
        return null;
    }
}
