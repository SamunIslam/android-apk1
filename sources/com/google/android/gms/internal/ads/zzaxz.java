package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaxz implements Runnable {
    final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzdwx;
    private final /* synthetic */ boolean zzdwy;
    private final /* synthetic */ boolean zzdwz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxz(zzaya zzayaVar, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzdwx = str;
        this.zzdwy = z;
        this.zzdwz = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context);
        builder.setMessage(this.zzdwx);
        if (this.zzdwy) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.zzdwz) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzayc(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
