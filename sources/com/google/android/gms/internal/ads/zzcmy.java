package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zztf;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmy {
    private static final SparseArray<zztf.zzo.zzc> zzgdw;
    private final zzbqc zzfls;
    private final zzcmv zzgbg;
    private final TelephonyManager zzgdt;
    private final zzcmp zzgdu;
    private zztp zzgdv;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmy(Context context, zzbqc zzbqcVar, zzcmv zzcmvVar, zzcmp zzcmpVar) {
        this.zzvf = context;
        this.zzfls = zzbqcVar;
        this.zzgbg = zzcmvVar;
        this.zzgdu = zzcmpVar;
        this.zzgdt = (TelephonyManager) context.getSystemService("phone");
    }

    private static zztp zzbk(boolean z) {
        return z ? zztp.ENUM_TRUE : zztp.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zztf.zzm zzk(Bundle bundle) {
        zztf.zzm.zza zzaVar;
        zztf.zzm.zzb zzof = zztf.zzm.zzof();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzgdv = zztp.ENUM_TRUE;
        } else {
            this.zzgdv = zztp.ENUM_FALSE;
            if (i == 0) {
                zzof.zzb(zztf.zzm.zzc.CELL);
            } else if (i == 1) {
                zzof.zzb(zztf.zzm.zzc.WIFI);
            } else {
                zzof.zzb(zztf.zzm.zzc.NETWORKTYPE_UNSPECIFIED);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzaVar = zztf.zzm.zza.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzaVar = zztf.zzm.zza.THREE_G;
                    break;
                case 13:
                    zzaVar = zztf.zzm.zza.LTE;
                    break;
                default:
                    zzaVar = zztf.zzm.zza.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzof.zzb(zzaVar);
        }
        return (zztf.zzm) ((zzecd) zzof.zzbet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zztf.zzo.zzc zzl(Bundle bundle) {
        return zzgdw.get(zzdhj.zza(zzdhj.zza(bundle, "device"), "network").getInt("active_network_state", -1), zztf.zzo.zzc.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zztf.zzc.zza> zzm(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto Ld
            java.util.List r7 = (java.util.List) r7
            goto L17
        Ld:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L3d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L24:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L24
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L24
        L38:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L41
        L3d:
            java.util.List r7 = java.util.Collections.emptyList()
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L4a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L80;
                case -1052618729: goto L76;
                case -239580146: goto L6c;
                case 604727084: goto L62;
                default: goto L61;
            }
        L61:
            goto L89
        L62:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 1
            goto L89
        L6c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 3
            goto L89
        L76:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 2
            goto L89
        L80:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L89
            r2 = 0
        L89:
            if (r2 == 0) goto L9d
            if (r2 == r6) goto L9a
            if (r2 == r5) goto L97
            if (r2 == r4) goto L94
            com.google.android.gms.internal.ads.zztf$zzc$zza r1 = com.google.android.gms.internal.ads.zztf.zzc.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L9f
        L94:
            com.google.android.gms.internal.ads.zztf$zzc$zza r1 = com.google.android.gms.internal.ads.zztf.zzc.zza.REWARD_BASED_VIDEO_AD
            goto L9f
        L97:
            com.google.android.gms.internal.ads.zztf$zzc$zza r1 = com.google.android.gms.internal.ads.zztf.zzc.zza.NATIVE_APP_INSTALL
            goto L9f
        L9a:
            com.google.android.gms.internal.ads.zztf$zzc$zza r1 = com.google.android.gms.internal.ads.zztf.zzc.zza.INTERSTITIAL
            goto L9f
        L9d:
            com.google.android.gms.internal.ads.zztf$zzc$zza r1 = com.google.android.gms.internal.ads.zztf.zzc.zza.BANNER
        L9f:
            r0.add(r1)
            goto L4a
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmy.zzm(android.os.Bundle):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] zza(boolean z, ArrayList<zztf.zzc.zza> arrayList, zztf.zzm zzmVar, zztf.zzo.zzc zzcVar) {
        return ((zztf.zzo.zza) ((zzecd) zztf.zzo.zza.zzol().zzf(arrayList).zzh(zzbk(com.google.android.gms.ads.internal.zzq.zzky().zzb(this.zzvf.getContentResolver()) != 0)).zzi(com.google.android.gms.ads.internal.zzq.zzky().zza(this.zzvf, this.zzgdt)).zzev(this.zzgbg.zzaoy()).zzew(this.zzgbg.zzapa()).zzci(this.zzgbg.getResponseCode()).zzb(zzcVar).zzb(zzmVar).zzj(this.zzgdv).zzf(zzbk(z)).zzeu(com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis()).zzg(zzbk(com.google.android.gms.ads.internal.zzq.zzky().zza(this.zzvf.getContentResolver()) != 0)).zzbet())).toByteArray();
    }

    public final void zzbl(boolean z) {
        zzdqw.zza(this.zzfls.zzaik(), new zzcnb(this, z), zzbab.zzdzw);
    }

    static {
        SparseArray<zztf.zzo.zzc> sparseArray = new SparseArray<>();
        zzgdw = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zztf.zzo.zzc.CONNECTED);
        zzgdw.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zztf.zzo.zzc.CONNECTING);
        zzgdw.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zztf.zzo.zzc.CONNECTING);
        zzgdw.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zztf.zzo.zzc.CONNECTING);
        zzgdw.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zztf.zzo.zzc.DISCONNECTING);
        zzgdw.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zztf.zzo.zzc.DISCONNECTED);
        zzgdw.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zztf.zzo.zzc.DISCONNECTED);
        zzgdw.put(NetworkInfo.DetailedState.FAILED.ordinal(), zztf.zzo.zzc.DISCONNECTED);
        zzgdw.put(NetworkInfo.DetailedState.IDLE.ordinal(), zztf.zzo.zzc.DISCONNECTED);
        zzgdw.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zztf.zzo.zzc.DISCONNECTED);
        zzgdw.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zztf.zzo.zzc.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzgdw.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zztf.zzo.zzc.CONNECTING);
        }
        zzgdw.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zztf.zzo.zzc.CONNECTING);
    }
}
