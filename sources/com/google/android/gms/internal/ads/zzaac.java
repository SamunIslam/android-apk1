package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaac {
    private File file;
    private String zzbnd;
    private String zzcul;
    private AtomicBoolean zzcun;
    private Context zzvf;
    private BlockingQueue<zzaam> zzcui = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> zzcuj = new LinkedHashMap<>();
    private Map<String, zzaag> zzcuk = new HashMap();
    private final HashSet<String> zzcum = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zzvf = context;
        this.zzbnd = str;
        this.zzcul = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzcun = atomicBoolean;
        atomicBoolean.set(zzabj.zzcwl.get().booleanValue());
        if (this.zzcun.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.file = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzcuj.put(entry.getKey(), entry.getValue());
        }
        zzbab.zzdzr.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzaaf
            private final zzaac zzcup;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcup = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcup.zzrg();
            }
        });
        this.zzcuk.put("action", zzaag.zzcur);
        this.zzcuk.put("ad_format", zzaag.zzcur);
        this.zzcuk.put("e", zzaag.zzcus);
    }

    public final boolean zza(zzaam zzaamVar) {
        return this.zzcui.offer(zzaamVar);
    }

    private final void zza(Map<String, String> map, String str) {
        Uri.Builder buildUpon = Uri.parse(this.zzcul).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder(buildUpon.build().toString());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&it=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        if (this.zzcun.get()) {
            File file = this.file;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(sb2.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                zzawr.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            zzawr.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    zzawr.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    zzawr.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } else {
                zzawr.zzfc("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzq.zzkw();
            zzaxa.zzb(this.zzvf, this.zzbnd, sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, zzcs(key).zzg(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final zzaag zzcs(String str) {
        zzaag zzaagVar = this.zzcuk.get(str);
        return zzaagVar != null ? zzaagVar : zzaag.zzcuq;
    }

    public final void zzct(String str) {
        if (this.zzcum.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzbnd);
        linkedHashMap.put("ue", str);
        zza(zza(this.zzcuj, linkedHashMap), "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzrg() {
        while (true) {
            try {
                zzaam take = this.zzcui.take();
                String zzrl = take.zzrl();
                if (!TextUtils.isEmpty(zzrl)) {
                    zza(zza(this.zzcuj, take.zzrm()), zzrl);
                }
            } catch (InterruptedException e) {
                zzawr.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
