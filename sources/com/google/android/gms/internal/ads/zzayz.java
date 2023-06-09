package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayz extends zzawn {
    private final String url;
    private final zzbaa zzdyh;

    public zzayz(Context context, String str, String str2) {
        this(str2, com.google.android.gms.ads.internal.zzq.zzkw().zzr(context, str));
    }

    private zzayz(String str, String str2) {
        this.zzdyh = new zzbaa(str2);
        this.url = str;
    }

    @Override // com.google.android.gms.internal.ads.zzawn
    public final void zzup() {
        this.zzdyh.zzeq(this.url);
    }
}
