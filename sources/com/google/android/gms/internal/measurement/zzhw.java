package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
final class zzhw extends zzhu<zzhx, zzhx> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final boolean zza(zzhd zzhdVar) {
        return false;
    }

    /* renamed from: zza  reason: avoid collision after fix types in other method */
    private static void zza2(Object obj, zzhx zzhxVar) {
        ((zzfd) obj).zzb = zzhxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final void zzd(Object obj) {
        ((zzfd) obj).zzb.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ int zzf(zzhx zzhxVar) {
        return zzhxVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ int zze(zzhx zzhxVar) {
        return zzhxVar.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ zzhx zzc(zzhx zzhxVar, zzhx zzhxVar2) {
        zzhx zzhxVar3 = zzhxVar;
        zzhx zzhxVar4 = zzhxVar2;
        return zzhxVar4.equals(zzhx.zza()) ? zzhxVar3 : zzhx.zza(zzhxVar3, zzhxVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ void zzb(zzhx zzhxVar, zzir zzirVar) throws IOException {
        zzhxVar.zza(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ void zza(zzhx zzhxVar, zzir zzirVar) throws IOException {
        zzhxVar.zzb(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ void zzb(Object obj, zzhx zzhxVar) {
        zza2(obj, zzhxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ zzhx zzc(Object obj) {
        zzhx zzhxVar = ((zzfd) obj).zzb;
        if (zzhxVar == zzhx.zza()) {
            zzhx zzb = zzhx.zzb();
            zza2(obj, zzb);
            return zzb;
        }
        return zzhxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ zzhx zzb(Object obj) {
        return ((zzfd) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ void zza(Object obj, zzhx zzhxVar) {
        zza2(obj, zzhxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* synthetic */ zzhx zza(zzhx zzhxVar) {
        zzhx zzhxVar2 = zzhxVar;
        zzhxVar2.zzc();
        return zzhxVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ zzhx zza() {
        return zzhx.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* synthetic */ void zza(zzhx zzhxVar, int i, zzhx zzhxVar2) {
        zzhxVar.zza((i << 3) | 3, zzhxVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ void zza(zzhx zzhxVar, int i, zzdv zzdvVar) {
        zzhxVar.zza((i << 3) | 2, zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* synthetic */ void zzb(zzhx zzhxVar, int i, long j) {
        zzhxVar.zza((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    final /* synthetic */ void zza(zzhx zzhxVar, int i, int i2) {
        zzhxVar.zza((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* synthetic */ void zza(zzhx zzhxVar, int i, long j) {
        zzhxVar.zza(i << 3, Long.valueOf(j));
    }
}
