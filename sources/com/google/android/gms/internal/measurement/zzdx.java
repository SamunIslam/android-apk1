package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzdx implements Comparator<zzdv> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdv zzdvVar, zzdv zzdvVar2) {
        int zzb;
        int zzb2;
        zzdv zzdvVar3 = zzdvVar;
        zzdv zzdvVar4 = zzdvVar2;
        zzea zzeaVar = (zzea) zzdvVar3.iterator();
        zzea zzeaVar2 = (zzea) zzdvVar4.iterator();
        while (zzeaVar.hasNext() && zzeaVar2.hasNext()) {
            zzb = zzdv.zzb(zzeaVar.zza());
            zzb2 = zzdv.zzb(zzeaVar2.zza());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzdvVar3.zza(), zzdvVar4.zza());
    }
}
