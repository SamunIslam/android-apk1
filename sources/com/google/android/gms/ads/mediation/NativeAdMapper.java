package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public class NativeAdMapper {
    protected View mAdChoicesContent;
    protected Bundle mExtras = new Bundle();
    protected boolean mOverrideClickHandling;
    protected boolean mOverrideImpressionRecording;
    private VideoController zzcgy;
    private View zzemj;
    private boolean zzemk;

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    @Deprecated
    public void trackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.mOverrideImpressionRecording = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.mOverrideClickHandling = z;
    }

    public final void setExtras(Bundle bundle) {
        this.mExtras = bundle;
    }

    public void setAdChoicesContent(View view) {
        this.mAdChoicesContent = view;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.mOverrideImpressionRecording;
    }

    public final boolean getOverrideClickHandling() {
        return this.mOverrideClickHandling;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public View getAdChoicesContent() {
        return this.mAdChoicesContent;
    }

    public void setMediaView(View view) {
        this.zzemj = view;
    }

    public final View zzacu() {
        return this.zzemj;
    }

    public final void zza(VideoController videoController) {
        this.zzcgy = videoController;
    }

    public final VideoController getVideoController() {
        return this.zzcgy;
    }

    public void setHasVideoContent(boolean z) {
        this.zzemk = z;
    }

    public boolean hasVideoContent() {
        return this.zzemk;
    }
}
