package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zzdl<MessageType extends zzdl<MessageType, BuilderType>, BuilderType extends zzdn<MessageType, BuilderType>> implements zzgn {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final zzdv zzbg() {
        try {
            zzed zzc = zzdv.zzc(zzbl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] zzbh() {
        try {
            byte[] bArr = new byte[zzbl()];
            zzek zza = zzek.zza(bArr);
            zza(zza);
            zza.zzb();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzbi() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzc(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzfe.zza(iterable);
        if (iterable instanceof zzfu) {
            List<?> zzb = ((zzfu) iterable).zzb();
            zzfu zzfuVar = (zzfu) list;
            int size = list.size();
            for (Object obj : zzb) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzfuVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzfuVar.size() - 1; size2 >= size; size2--) {
                        zzfuVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzdv) {
                    zzfuVar.zza((zzdv) obj);
                } else {
                    zzfuVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzgz) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }
}
