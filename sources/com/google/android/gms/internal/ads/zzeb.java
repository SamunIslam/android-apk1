package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzeb implements zzei {
    private final /* synthetic */ Activity val$activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(zzea zzeaVar, Activity activity) {
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.val$activity);
    }
}
