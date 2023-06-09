package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzast extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzast> CREATOR = new zzasw();
    public final String zzbsc;
    public final zzuj zzdlx;

    public zzast(zzuj zzujVar, String str) {
        this.zzdlx = zzujVar;
        this.zzbsc = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdlx, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbsc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
