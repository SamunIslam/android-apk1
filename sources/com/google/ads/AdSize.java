package com.google.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    private final com.google.android.gms.ads.AdSize zzdi;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zzdi = adSize;
    }

    public final boolean isCustomAdSize() {
        return false;
    }

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    private AdSize(int i, int i2, String str) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdSize) {
            return this.zzdi.equals(((AdSize) obj).zzdi);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdi.hashCode();
    }

    public final int getWidth() {
        return this.zzdi.getWidth();
    }

    public final int getHeight() {
        return this.zzdi.getHeight();
    }

    public final boolean isFullWidth() {
        return this.zzdi.isFullWidth();
    }

    public final boolean isAutoHeight() {
        return this.zzdi.isAutoHeight();
    }

    public final String toString() {
        return this.zzdi.toString();
    }

    public final int getWidthInPixels(Context context) {
        return this.zzdi.getWidthInPixels(context);
    }

    public final int getHeightInPixels(Context context) {
        return this.zzdi.getHeightInPixels(context);
    }

    public final boolean isSizeAppropriate(int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        float f = i;
        float f2 = width;
        if (f > f2 * 1.25f || f < f2 * 0.8f) {
            return false;
        }
        float f3 = i2;
        float f4 = height;
        return f3 <= 1.25f * f4 && f3 >= f4 * 0.8f;
    }

    public final AdSize findBestSize(AdSize... adSizeArr) {
        int width;
        int height;
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        float f = 0.0f;
        int width2 = getWidth();
        int height2 = getHeight();
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (width * height) / (width2 * height2);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }
}
