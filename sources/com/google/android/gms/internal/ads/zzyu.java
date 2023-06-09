package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzyu extends zzasj {
    private zzasn zzchy;

    @Override // com.google.android.gms.internal.ads.zzask
    public final void destroy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void pause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void resume() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void setAppPackageName(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void setCustomData(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void show() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzasi zzasiVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzwc zzwcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final zzxg zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final boolean zzqu() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzast zzastVar) throws RemoteException {
        zzazw.zzfa("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazm.zzzn.post(new zzyx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzasn zzasnVar) throws RemoteException {
        this.zzchy = zzasnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }
}
