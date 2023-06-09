package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzadt implements NativeCustomTemplateAd {
    private static WeakHashMap<IBinder, zzadt> zzczf = new WeakHashMap<>();
    private final VideoController zzcgy = new VideoController();
    private final zzado zzczg;
    private final MediaView zzczh;
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzczi;

    private zzadt(zzado zzadoVar) {
        Context context;
        this.zzczg = zzadoVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzadoVar.zzse());
        } catch (RemoteException | NullPointerException e) {
            zzazw.zzc("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.zzczg.zzp(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzazw.zzc("", e2);
            }
        }
        this.zzczh = mediaView;
    }

    public static zzadt zza(zzado zzadoVar) {
        synchronized (zzczf) {
            zzadt zzadtVar = zzczf.get(zzadoVar.asBinder());
            if (zzadtVar != null) {
                return zzadtVar;
            }
            zzadt zzadtVar2 = new zzadt(zzadoVar);
            zzczf.put(zzadoVar.asBinder(), zzadtVar2);
            return zzadtVar2;
        }
    }

    public final zzado zzsi() {
        return this.zzczg;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.zzczg.zzcv(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzacs zzcw = this.zzczg.zzcw(str);
            if (zzcw != null) {
                return new zzacx(zzcw);
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzxl videoController = this.zzczg.getVideoController();
            if (videoController != null) {
                this.zzcgy.zza(videoController);
            }
        } catch (RemoteException e) {
            zzazw.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcgy;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.zzczh;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zzczg.getAvailableAssetNames();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.zzczg.getCustomTemplateId();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.zzczg.performClick(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.zzczg.recordImpression();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzczi == null && this.zzczg.zzsf()) {
                this.zzczi = new zzaco(this.zzczg);
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
        return this.zzczi;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.zzczg.destroy();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
