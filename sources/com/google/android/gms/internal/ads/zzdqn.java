package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdqn extends zzdqm<V> {
    private final /* synthetic */ zzdqk zzhhs;
    private final Callable<V> zzhht;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdqn(zzdqk zzdqkVar, Callable<V> callable, Executor executor) {
        super(zzdqkVar, executor);
        this.zzhhs = zzdqkVar;
        this.zzhht = (Callable) zzdoj.checkNotNull(callable);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [V, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzdre
    final V zzawn() throws Exception {
        this.zzhhr = false;
        return this.zzhht.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdqm
    final void setValue(V v) {
        this.zzhhs.set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final String zzawo() {
        return this.zzhht.toString();
    }
}
