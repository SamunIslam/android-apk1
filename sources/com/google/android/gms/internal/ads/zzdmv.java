package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdmv implements Parcelable.Creator<zzdmw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdmw[] newArray(int i) {
        return new zzdmw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdmw createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                bArr = SafeParcelReader.createByteArray(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzdmw(i, bArr);
    }
}
