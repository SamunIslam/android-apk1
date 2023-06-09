package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzaod implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {
    private final /* synthetic */ zzalv zzdhr;
    private final /* synthetic */ zzanj zzdht;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaod(zzaoa zzaoaVar, zzanj zzanjVar, zzalv zzalvVar) {
        this.zzdht = zzanjVar;
        this.zzdhr = zzalvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        if (mediationBannerAd == null) {
            zzazw.zzfc("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdht.zzdo("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazw.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdht.zzx(ObjectWrapper.wrap(mediationBannerAd.getView()));
        } catch (RemoteException e2) {
            zzazw.zzc("", e2);
        }
        return new zzaog(this.zzdhr);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdht.zzdo(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
