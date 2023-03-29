package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzhi extends zzho {
    private final /* synthetic */ zzhh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzhi(zzhh zzhhVar) {
        super(zzhhVar, null);
        this.zza = zzhhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzho, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzhj(this.zza, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhi(zzhh zzhhVar, zzhg zzhgVar) {
        this(zzhhVar);
    }
}
