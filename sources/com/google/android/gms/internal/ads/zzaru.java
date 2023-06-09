package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaru {
    private WeakHashMap<Context, zzarw> zzdqs = new WeakHashMap<>();

    public final Future<zzars> zzx(Context context) {
        return zzbab.zzdzr.zzd(new zzart(this, context));
    }
}
