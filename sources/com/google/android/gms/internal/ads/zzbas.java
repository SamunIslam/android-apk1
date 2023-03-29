package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbas implements zzdqx<T> {
    private final /* synthetic */ zzban zzeag;
    private final /* synthetic */ zzbal zzeah;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbas(zzbaq zzbaqVar, zzban zzbanVar, zzbal zzbalVar) {
        this.zzeag = zzbanVar;
        this.zzeah = zzbalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void onSuccess(T t) {
        this.zzeag.zzh(t);
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        this.zzeah.run();
    }
}
