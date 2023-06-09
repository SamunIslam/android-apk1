package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayy {
    private HandlerThread zzdyf = null;
    private Handler handler = null;
    private int zzdyg = 0;
    private final Object lock = new Object();

    public final Looper zzxx() {
        Looper looper;
        synchronized (this.lock) {
            if (this.zzdyg == 0) {
                if (this.zzdyf == null) {
                    zzawr.zzeg("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.zzdyf = handlerThread;
                    handlerThread.start();
                    this.handler = new zzdns(this.zzdyf.getLooper());
                    zzawr.zzeg("Looper thread started.");
                } else {
                    zzawr.zzeg("Resuming the looper thread");
                    this.lock.notifyAll();
                }
            } else {
                Preconditions.checkNotNull(this.zzdyf, "Invalid state: mHandlerThread should already been initialized.");
            }
            this.zzdyg++;
            looper = this.zzdyf.getLooper();
        }
        return looper;
    }

    public final Handler getHandler() {
        return this.handler;
    }
}
