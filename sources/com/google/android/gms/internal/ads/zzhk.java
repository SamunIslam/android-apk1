package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public interface zzhk extends zzgv {
    void disable();

    int getState();

    int getTrackType();

    boolean isReady();

    void setIndex(int i);

    void start() throws zzgq;

    void stop() throws zzgq;

    void zza(zzhm zzhmVar, zzhf[] zzhfVarArr, zzmt zzmtVar, long j, boolean z, long j2) throws zzgq;

    void zza(zzhf[] zzhfVarArr, zzmt zzmtVar, long j) throws zzgq;

    void zzb(long j, long j2) throws zzgq;

    void zzdm(long j) throws zzgq;

    zzhn zzdy();

    zzol zzdz();

    zzmt zzea();

    boolean zzeb();

    void zzec();

    boolean zzed();

    void zzee() throws IOException;

    boolean zzfd();
}
