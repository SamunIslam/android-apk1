package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpe extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    private zzdns zzaes;
    private final int[] zzbig;
    private SurfaceTexture zzbih;
    private Error zzbii;
    private RuntimeException zzbij;
    private zzpc zzbik;

    public zzpe() {
        super("dummySurface");
        this.zzbig = new int[1];
    }

    public final zzpc zzm(boolean z) {
        boolean z2;
        start();
        this.zzaes = new zzdns(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.zzaes.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.zzbik == null && this.zzbij == null && this.zzbii == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzbij;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzbii;
        if (error != null) {
            throw error;
        }
        return this.zzbik;
    }

    public final void release() {
        this.zzaes.sendEmptyMessage(3);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzaes.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.zzbih.updateTexImage();
                    return true;
                } else if (i != 3) {
                    return true;
                } else {
                    try {
                        this.zzbih.release();
                        this.zzbik = null;
                        this.zzbih = null;
                        GLES20.glDeleteTextures(1, this.zzbig, 0);
                    } catch (Throwable th) {
                        try {
                            Log.e("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    zzoh.checkState(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr = new int[2];
                    zzoh.checkState(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    zzoh.checkState(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    zzoh.checkState(eglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    zzoh.checkState(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    zzoh.checkState(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.zzbig, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.zzbig[0]);
                    this.zzbih = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.zzbik = new zzpc(this, this.zzbih, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.zzbij = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.zzbii = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
