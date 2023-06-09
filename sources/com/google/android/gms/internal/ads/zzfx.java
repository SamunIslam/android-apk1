package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzfx {
    private static final String TAG = zzfx.class.getSimpleName();
    private final String className;
    private final String zzaau;
    private final Class<?>[] zzaax;
    private final zzeo zzvp;
    private final int zzaav = 2;
    private volatile Method zzaaw = null;
    private CountDownLatch zzaay = new CountDownLatch(1);

    public zzfx(zzeo zzeoVar, String str, String str2, Class<?>... clsArr) {
        this.zzvp = zzeoVar;
        this.className = str;
        this.zzaau = str2;
        this.zzaax = clsArr;
        zzeoVar.zzch().submit(new zzga(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdb() {
        try {
            Class loadClass = this.zzvp.zzci().loadClass(zzb(this.zzvp.zzck(), this.className));
            if (loadClass == null) {
                return;
            }
            this.zzaaw = loadClass.getMethod(zzb(this.zzvp.zzck(), this.zzaau), this.zzaax);
            if (this.zzaaw == null) {
            }
        } catch (zzdy unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.zzaay.countDown();
        }
    }

    private final String zzb(byte[] bArr, String str) throws zzdy, UnsupportedEncodingException {
        return new String(this.zzvp.zzcj().zza(bArr, str), "UTF-8");
    }

    public final Method zzdc() {
        if (this.zzaaw != null) {
            return this.zzaaw;
        }
        try {
            if (this.zzaay.await(2L, TimeUnit.SECONDS)) {
                return this.zzaaw;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
