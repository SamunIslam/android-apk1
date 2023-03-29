package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.zzfd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public class zzeq {
    private static volatile boolean zza = false;
    private static boolean zzb = true;
    private static volatile zzeq zzd;
    private static volatile zzeq zze;
    private final Map<zza, zzfd.zze<?, ?>> zzg;
    private static final Class<?> zzc = zzc();
    private static final zzeq zzf = new zzeq(true);

    private static Class<?> zzc() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private final Object zza;
        private final int zzb;

        zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
            }
            return false;
        }
    }

    public static zzeq zza() {
        zzeq zzeqVar = zzd;
        if (zzeqVar == null) {
            synchronized (zzeq.class) {
                zzeqVar = zzd;
                if (zzeqVar == null) {
                    zzeqVar = zzf;
                    zzd = zzeqVar;
                }
            }
        }
        return zzeqVar;
    }

    public static zzeq zzb() {
        zzeq zzeqVar = zze;
        if (zzeqVar == null) {
            synchronized (zzeq.class) {
                zzeqVar = zze;
                if (zzeqVar == null) {
                    zzeqVar = zzfc.zza(zzeq.class);
                    zze = zzeqVar;
                }
            }
        }
        return zzeqVar;
    }

    public final <ContainingType extends zzgn> zzfd.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzfd.zze<ContainingType, ?>) this.zzg.get(new zza(containingtype, i));
    }

    zzeq() {
        this.zzg = new HashMap();
    }

    private zzeq(boolean z) {
        this.zzg = Collections.emptyMap();
    }
}
