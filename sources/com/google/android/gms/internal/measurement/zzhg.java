package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public final class zzhg extends zzhh<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhg(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzb = zzb(i);
                if (((zzev) zzb.getKey()).zzd()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((zzev) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
