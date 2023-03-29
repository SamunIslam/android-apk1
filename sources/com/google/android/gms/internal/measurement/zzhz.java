package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzhz extends AbstractList<String> implements zzfu, RandomAccess {
    private final zzfu zza;

    public zzhz(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzfu
    public final zzfu i_() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzfu
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfu
    public final void zza(zzdv zzdvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzhy(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzib(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzfu
    public final List<?> zzb() {
        return this.zza.zzb();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }
}
