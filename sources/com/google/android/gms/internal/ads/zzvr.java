package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzvr extends IInterface {
    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoading() throws RemoteException;

    void zza(zzuj zzujVar, int i) throws RemoteException;

    void zzb(zzuj zzujVar) throws RemoteException;

    String zzkh() throws RemoteException;
}
