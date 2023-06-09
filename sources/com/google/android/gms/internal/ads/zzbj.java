package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbj extends zzegi {
    private ByteBuffer zzcs;

    public zzbj(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    public final void zzg(ByteBuffer byteBuffer) {
        this.zzcs = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
