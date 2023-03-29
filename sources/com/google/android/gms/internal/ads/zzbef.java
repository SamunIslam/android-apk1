package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbef implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzehp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbef(JsPromptResult jsPromptResult) {
        this.zzehp = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzehp.cancel();
    }
}
