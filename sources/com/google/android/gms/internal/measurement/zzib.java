package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzib implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzhz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzib(zzhz zzhzVar) {
        zzfu zzfuVar;
        this.zzb = zzhzVar;
        zzfuVar = this.zzb.zza;
        this.zza = zzfuVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }
}
