package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzapf extends zzgk implements zzapg {
    public zzapf() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzapg zzag(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof zzapg) {
            return (zzapg) queryLocalInterface;
        }
        return new zzapi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                onCreate((Bundle) zzgj.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                onRestart();
                parcel2.writeNoException();
                return true;
            case 3:
                onStart();
                parcel2.writeNoException();
                return true;
            case 4:
                onResume();
                parcel2.writeNoException();
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) zzgj.zza(parcel, Bundle.CREATOR);
                onSaveInstanceState(bundle);
                parcel2.writeNoException();
                zzgj.zzb(parcel2, bundle);
                return true;
            case 7:
                onStop();
                parcel2.writeNoException();
                return true;
            case 8:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 9:
                zzdp();
                parcel2.writeNoException();
                return true;
            case 10:
                onBackPressed();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zzuh = zzuh();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, zzuh);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) zzgj.zza(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzad(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
