package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzqo implements Application.ActivityLifecycleCallbacks {
    private Activity zzaad;
    private Runnable zzbqk;
    private long zzbql;
    private Context zzvf;
    private final Object lock = new Object();
    private boolean foreground = true;
    private boolean zzbqh = false;
    private final List<zzqq> zzbqi = new ArrayList();
    private final List<zzrb> zzbqj = new ArrayList();
    private boolean zzyw = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzyw) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            setActivity((Activity) context);
        }
        this.zzvf = application;
        this.zzbql = ((Long) zzvj.zzpv().zzd(zzzz.zzclo)).longValue();
        this.zzyw = true;
    }

    public final void zza(zzqq zzqqVar) {
        synchronized (this.lock) {
            this.zzbqi.add(zzqqVar);
        }
    }

    public final void zzb(zzqq zzqqVar) {
        synchronized (this.lock) {
            this.zzbqi.remove(zzqqVar);
        }
    }

    public final Activity getActivity() {
        return this.zzaad;
    }

    public final Context getContext() {
        return this.zzvf;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzbqh = false;
        boolean z = !this.foreground;
        this.foreground = true;
        if (this.zzbqk != null) {
            zzaxa.zzdwf.removeCallbacks(this.zzbqk);
        }
        synchronized (this.lock) {
            for (zzrb zzrbVar : this.zzbqj) {
                try {
                    zzrbVar.onActivityResumed(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzazw.zzc("", e);
                }
            }
            if (z) {
                for (zzqq zzqqVar : this.zzbqi) {
                    try {
                        zzqqVar.zzp(true);
                    } catch (Exception e2) {
                        zzazw.zzc("", e2);
                    }
                }
            } else {
                zzawr.zzed("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.lock) {
            for (zzrb zzrbVar : this.zzbqj) {
                try {
                    zzrbVar.onActivityPaused(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzazw.zzc("", e);
                }
            }
        }
        this.zzbqh = true;
        if (this.zzbqk != null) {
            zzaxa.zzdwf.removeCallbacks(this.zzbqk);
        }
        zzdns zzdnsVar = zzaxa.zzdwf;
        zzqn zzqnVar = new zzqn(this);
        this.zzbqk = zzqnVar;
        zzdnsVar.postDelayed(zzqnVar, this.zzbql);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.lock) {
            if (this.zzaad == null) {
                return;
            }
            if (this.zzaad.equals(activity)) {
                this.zzaad = null;
            }
            Iterator<zzrb> it = this.zzbqj.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().zza(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzazw.zzc("", e);
                }
            }
        }
    }

    private final void setActivity(Activity activity) {
        synchronized (this.lock) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zzaad = activity;
            }
        }
    }
}
