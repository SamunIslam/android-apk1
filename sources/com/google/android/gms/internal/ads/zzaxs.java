package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaxs {
    private boolean zzdmt = false;
    private float zzdmn = 1.0f;

    public final synchronized void setAppVolume(float f) {
        this.zzdmn = f;
    }

    public final synchronized float zzqb() {
        if (zzxs()) {
            return this.zzdmn;
        }
        return 1.0f;
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzdmt = z;
    }

    public final synchronized boolean zzqc() {
        return this.zzdmt;
    }

    private final synchronized boolean zzxs() {
        return this.zzdmn >= 0.0f;
    }

    public static float zzbg(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }
}
