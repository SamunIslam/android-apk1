package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfj extends zzfz {
    public zzfj(zzeo zzeoVar, String str, String str2, zzbv.zza.C0007zza c0007zza, int i, int i2) {
        super(zzeoVar, str, str2, c0007zza, i, 76);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        this.zzaam.zze(((Boolean) this.zzaaw.invoke(null, this.zzvp.getContext())).booleanValue() ? zzcd.ENUM_TRUE : zzcd.ENUM_FALSE);
    }
}
