package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaws extends zzawn {
    private Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaws(Context context) {
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzawn
    public final void zzup() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zzvf);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzawr.zzc("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        zzazq.zzar(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        zzawr.zzfc(sb.toString());
    }
}
