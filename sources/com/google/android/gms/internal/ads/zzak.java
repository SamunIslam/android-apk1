package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzak implements zzn {
    private static final boolean DEBUG = zzag.DEBUG;
    @Deprecated
    private final zzau zzbu;
    private final zzah zzbv;
    private final zzaj zzbw;

    public zzak(zzah zzahVar) {
        this(zzahVar, new zzaj(4096));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzak(zzah zzahVar, zzaj zzajVar) {
        this.zzbv = zzahVar;
        this.zzbu = zzahVar;
        this.zzbw = zzajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    @Override // com.google.android.gms.internal.ads.zzn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzo zzc(com.google.android.gms.internal.ads.zzq<?> r22) throws com.google.android.gms.internal.ads.zzae {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzak.zzc(com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzo");
    }

    private static void zza(String str, zzq<?> zzqVar, zzae zzaeVar) throws zzae {
        zzad zzj = zzqVar.zzj();
        int zzi = zzqVar.zzi();
        try {
            zzj.zza(zzaeVar);
            zzqVar.zzb(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzi)));
        } catch (zzae e) {
            zzqVar.zzb(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzi)));
            throw e;
        }
    }

    private final byte[] zza(InputStream inputStream, int i) throws IOException, zzac {
        zzay zzayVar = new zzay(this.zzbw, i);
        try {
            if (inputStream == null) {
                throw new zzac();
            }
            byte[] zzc = this.zzbw.zzc(1024);
            while (true) {
                int read = inputStream.read(zzc);
                if (read == -1) {
                    break;
                }
                zzayVar.write(zzc, 0, read);
            }
            byte[] byteArray = zzayVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    zzag.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzbw.zza(zzc);
            zzayVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzag.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzbw.zza(null);
            zzayVar.close();
            throw th;
        }
    }
}
