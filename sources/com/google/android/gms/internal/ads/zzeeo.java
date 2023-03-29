package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeeo extends zzeel<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeeo(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeel
    public final void zzbcj() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbgq(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzhj = zzhj(i);
                if (((zzebv) zzhj.getKey()).zzbel()) {
                    zzhj.setValue(Collections.unmodifiableList((List) zzhj.getValue()));
                }
            }
            Iterator it = zzbgr().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((zzebv) entry.getKey()).zzbel()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbcj();
    }
}
