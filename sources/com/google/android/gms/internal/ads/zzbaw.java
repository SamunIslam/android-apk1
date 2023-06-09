package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzbaw {
    private final WeakReference<View> zzeaz;

    public zzbaw(View view) {
        this.zzeaz = new WeakReference<>(view);
    }

    protected abstract void zza(ViewTreeObserver viewTreeObserver);

    protected abstract void zzb(ViewTreeObserver viewTreeObserver);

    public final void attach() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            zza(viewTreeObserver);
        }
    }

    public final void detach() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            zzb(viewTreeObserver);
        }
    }

    private final ViewTreeObserver getViewTreeObserver() {
        ViewTreeObserver viewTreeObserver;
        View view = this.zzeaz.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
