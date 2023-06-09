package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzacj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zzbkq;
    private boolean zzbkr;
    private zzach zzbks;
    private ImageView.ScaleType zzbkt;
    private boolean zzbku;
    private zzacj zzbkv;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzbkr = true;
        this.zzbkq = mediaContent;
        zzach zzachVar = this.zzbks;
        if (zzachVar != null) {
            zzachVar.setMediaContent(mediaContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzach zzachVar) {
        this.zzbks = zzachVar;
        if (this.zzbkr) {
            zzachVar.setMediaContent(this.zzbkq);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbku = true;
        this.zzbkt = scaleType;
        zzacj zzacjVar = this.zzbkv;
        if (zzacjVar != null) {
            zzacjVar.setImageScaleType(scaleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzacj zzacjVar) {
        this.zzbkv = zzacjVar;
        if (this.zzbku) {
            zzacjVar.setImageScaleType(this.zzbkt);
        }
    }
}
