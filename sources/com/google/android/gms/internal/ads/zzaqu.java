package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaqu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqu> CREATOR = new zzaqt();
    private final ApplicationInfo applicationInfo;
    private final int versionCode;
    private final zzazz zzbmo;
    private final zzum zzbmp;
    private final float zzbpk;
    private final String zzbsc;
    private final String zzcgc;
    private final boolean zzdez;
    private final zzaci zzdhc;
    private final List<String> zzdhd;
    private final int zzdji;
    private final int zzdjj;
    private final Bundle zzdlw;
    private final zzuj zzdlx;
    private final PackageInfo zzdly;
    private final String zzdlz;
    private final String zzdma;
    private final Bundle zzdmb;
    private final int zzdmc;
    private final Bundle zzdmd;
    private final boolean zzdme;
    private final String zzdmf;
    private final long zzdmg;
    private final String zzdmh;
    private final List<String> zzdmi;
    private final String zzdmj;
    private final List<String> zzdmk;
    private final long zzdml;
    private final String zzdmm;
    private final float zzdmn;
    private final int zzdmo;
    private final int zzdmp;
    private final boolean zzdmq;
    private final boolean zzdmr;
    private final String zzdms;
    private final boolean zzdmt;
    private final String zzdmu;
    private final int zzdmv;
    private final Bundle zzdmw;
    private final String zzdmx;
    private final zzxr zzdmy;
    private final boolean zzdmz;
    private final Bundle zzdna;
    private final String zzdnb;
    private final String zzdnc;
    private final String zzdnd;
    private final boolean zzdne;
    private final List<Integer> zzdnf;
    private final String zzdng;
    private final List<String> zzdnh;
    private final int zzdni;
    private final boolean zzdnj;
    private final boolean zzdnk;
    private final boolean zzdnl;
    private final ArrayList<String> zzdnm;
    private final String zzdnn;
    private final zzahm zzdno;
    private final String zzdnp;
    private final Bundle zzdnq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqu(int i, Bundle bundle, zzuj zzujVar, zzum zzumVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzazz zzazzVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzaci zzaciVar, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzxr zzxrVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzahm zzahmVar, String str17, Bundle bundle6) {
        List<String> unmodifiableList;
        List<String> unmodifiableList2;
        this.versionCode = i;
        this.zzdlw = bundle;
        this.zzdlx = zzujVar;
        this.zzbmp = zzumVar;
        this.zzbsc = str;
        this.applicationInfo = applicationInfo;
        this.zzdly = packageInfo;
        this.zzdlz = str2;
        this.zzdma = str3;
        this.zzcgc = str4;
        this.zzbmo = zzazzVar;
        this.zzdmb = bundle2;
        this.zzdmc = i2;
        this.zzdhd = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.zzdmk = unmodifiableList;
        this.zzdmd = bundle3;
        this.zzdme = z;
        this.zzdji = i3;
        this.zzdjj = i4;
        this.zzbpk = f;
        this.zzdmf = str5;
        this.zzdmg = j;
        this.zzdmh = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.zzdmi = unmodifiableList2;
        this.zzdmj = str7;
        this.zzdhc = zzaciVar;
        this.zzdml = j2;
        this.zzdmm = str8;
        this.zzdmn = f2;
        this.zzdmt = z2;
        this.zzdmo = i5;
        this.zzdmp = i6;
        this.zzdmq = z3;
        this.zzdmr = z4;
        this.zzdms = str9;
        this.zzdmu = str10;
        this.zzdez = z5;
        this.zzdmv = i7;
        this.zzdmw = bundle4;
        this.zzdmx = str11;
        this.zzdmy = zzxrVar;
        this.zzdmz = z6;
        this.zzdna = bundle5;
        this.zzdnb = str12;
        this.zzdnc = str13;
        this.zzdnd = str14;
        this.zzdne = z7;
        this.zzdnf = list4;
        this.zzdng = str15;
        this.zzdnh = list5;
        this.zzdni = i8;
        this.zzdnj = z8;
        this.zzdnk = z9;
        this.zzdnl = z10;
        this.zzdnm = arrayList;
        this.zzdnn = str16;
        this.zzdno = zzahmVar;
        this.zzdnp = str17;
        this.zzdnq = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdlw, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdlx, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbmp, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbsc, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.applicationInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdly, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdlz, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdma, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzcgc, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzbmo, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzdmb, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdmc);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzdhd, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzdmd, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzdme);
        SafeParcelWriter.writeInt(parcel, 18, this.zzdji);
        SafeParcelWriter.writeInt(parcel, 19, this.zzdjj);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzbpk);
        SafeParcelWriter.writeString(parcel, 21, this.zzdmf, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzdmg);
        SafeParcelWriter.writeString(parcel, 26, this.zzdmh, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzdmi, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzdmj, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzdhc, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzdmk, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzdml);
        SafeParcelWriter.writeString(parcel, 33, this.zzdmm, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzdmn);
        SafeParcelWriter.writeInt(parcel, 35, this.zzdmo);
        SafeParcelWriter.writeInt(parcel, 36, this.zzdmp);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzdmq);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdmr);
        SafeParcelWriter.writeString(parcel, 39, this.zzdms, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzdmt);
        SafeParcelWriter.writeString(parcel, 41, this.zzdmu, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdez);
        SafeParcelWriter.writeInt(parcel, 43, this.zzdmv);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzdmw, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdmx, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzdmy, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdmz);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdna, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzdnb, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzdnc, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzdnd, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzdne);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzdnf, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzdng, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzdnh, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzdni);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdnj);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzdnk);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzdnl);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzdnm, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzdnn, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzdno, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzdnp, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzdnq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
