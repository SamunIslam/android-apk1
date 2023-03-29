package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdpd extends zzdpp<T> {
    private boolean zzhfo;
    private final /* synthetic */ Object zzhfp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpd(Object obj) {
        this.zzhfp = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzhfo;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (this.zzhfo) {
            throw new NoSuchElementException();
        }
        this.zzhfo = true;
        return this.zzhfp;
    }
}
