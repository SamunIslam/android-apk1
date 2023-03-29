package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzhy implements ListIterator<String> {
    private ListIterator<String> zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ zzhz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhy(zzhz zzhzVar, int i) {
        zzfu zzfuVar;
        this.zzc = zzhzVar;
        this.zzb = i;
        zzfuVar = this.zzc.zza;
        this.zza = zzfuVar.listIterator(this.zzb);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zza.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zza.next();
    }
}
