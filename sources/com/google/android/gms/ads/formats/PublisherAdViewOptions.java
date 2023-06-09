package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzaep;
import com.google.android.gms.internal.ads.zzuq;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwh;
import com.google.android.gms.internal.ads.zzzc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    private final boolean zzbli;
    private final zzwh zzblj;
    private AppEventListener zzblk;
    private final IBinder zzbll;

    private PublisherAdViewOptions(Builder builder) {
        this.zzbli = builder.zzbli;
        AppEventListener appEventListener = builder.zzblk;
        this.zzblk = appEventListener;
        this.zzblj = appEventListener != null ? new zzuq(this.zzblk) : null;
        this.zzbll = builder.zzblm != null ? new zzzc(builder.zzblm) : null;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzbli = false;
        private AppEventListener zzblk;
        private ShouldDelayBannerRenderingListener zzblm;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbli = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzblk = appEventListener;
            return this;
        }

        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzblm = shouldDelayBannerRenderingListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.zzbli = z;
        this.zzblj = iBinder != null ? zzwg.zze(iBinder) : null;
        this.zzbll = iBinder2;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzblk;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbli;
    }

    public final zzwh zzjt() {
        return this.zzblj;
    }

    public final zzaem zzju() {
        return zzaep.zzy(this.zzbll);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        zzwh zzwhVar = this.zzblj;
        SafeParcelWriter.writeIBinder(parcel, 2, zzwhVar == null ? null : zzwhVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzbll, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
