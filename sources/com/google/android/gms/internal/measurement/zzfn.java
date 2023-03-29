package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public class zzfn extends IOException {
    private zzgn zza;

    public zzfn(String str) {
        super(str);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zza() {
        return new zzfn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zzb() {
        return new zzfn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zzc() {
        return new zzfn("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zzd() {
        return new zzfn("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zze() {
        return new zzfn("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfm zzf() {
        return new zzfm("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zzg() {
        return new zzfn("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfn zzh() {
        return new zzfn("Protocol message had invalid UTF-8.");
    }
}
