package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzatc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatc> CREATOR = new zzatb();
    public final String type;
    public final int zzdqy;

    public zzatc(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzatc(String str, int i) {
        this.type = str;
        this.zzdqy = i;
    }

    public static zzatc zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzatc(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.type, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdqy);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzatc)) {
            zzatc zzatcVar = (zzatc) obj;
            if (Objects.equal(this.type, zzatcVar.type) && Objects.equal(Integer.valueOf(this.zzdqy), Integer.valueOf(zzatcVar.zzdqy))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.type, Integer.valueOf(this.zzdqy));
    }
}
