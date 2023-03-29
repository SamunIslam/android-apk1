package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfd.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
/* loaded from: classes.dex */
public abstract class zzfd<MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdl<MessageType, BuilderType> {
    private static Map<Object, zzfd<?, ?>> zzd = new ConcurrentHashMap();
    protected zzhx zzb = zzhx.zza();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    /* loaded from: classes.dex */
    public static class zzc<T extends zzfd<T, ?>> extends zzdm<T> {
        private final T zza;

        public zzc(T t) {
            this.zza = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    /* loaded from: classes.dex */
    public enum zzd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzm = {1, 2};
        private static final /* synthetic */ int[] zzn = {1, 2};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    /* loaded from: classes.dex */
    public static class zze<ContainingType extends zzgn, Type> extends zzeo<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzfd<MessageType, BuilderType> implements zzgp {
        protected zzet<Object> zzc = zzet.zza();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzet<Object> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (zzet) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return zzgo.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = zzgy.zza().zza((zzgy) this).zza(this);
        return this.zza;
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zza<MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdn<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;
        private boolean zzc = false;

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            this.zza = (MessageType) messagetype.zza(zzd.zzd, null, null);
        }

        protected final void zzp() {
            if (this.zzc) {
                MessageType messagetype = (MessageType) this.zza.zza(zzd.zzd, null, null);
                zza(messagetype, this.zza);
                this.zza = messagetype;
                this.zzc = false;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzgp
        public final boolean h_() {
            return zzfd.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzgm
        /* renamed from: zzr */
        public MessageType zzt() {
            if (this.zzc) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzgy.zza().zza((zzgy) messagetype).zzc(messagetype);
            this.zzc = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.measurement.zzgm
        /* renamed from: zzs */
        public final MessageType zzu() {
            MessageType messagetype = (MessageType) zzt();
            if (messagetype.h_()) {
                return messagetype;
            }
            throw new zzhv(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzp();
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzgy.zza().zza((zzgy) messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzeq zzeqVar) throws zzfn {
            zzp();
            try {
                zzgy.zza().zza((zzgy) this.zza).zza(this.zza, bArr, 0, i2 + 0, new zzdq(zzeqVar));
                return this;
            } catch (zzfn e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzfn.zza();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: zzb */
        public final BuilderType zza(zzeh zzehVar, zzeq zzeqVar) throws IOException {
            zzp();
            try {
                zzgy.zza().zza((zzgy) this.zza).zza(this.zza, zzei.zza(zzehVar), zzeqVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdn
        protected final /* synthetic */ zzdn zza(zzdl zzdlVar) {
            return zza((zza<MessageType, BuilderType>) ((zzfd) zzdlVar));
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ zzdn zza(byte[] bArr, int i, int i2, zzeq zzeqVar) throws zzfn {
            return zzb(bArr, 0, i2, zzeqVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ zzdn zza(byte[] bArr, int i, int i2) throws zzfn {
            return zzb(bArr, 0, i2, zzeq.zza());
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        public final /* synthetic */ zzdn zzo() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzgp
        public final /* synthetic */ zzgn zzv() {
            return this.zzb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdn
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzb.zza(zzd.zze, null, null);
            zzaVar.zza((zza) ((zzfd) zzt()));
            return zzaVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzfd) zza(zzd.zzf, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return zzgy.zza().zza((zzgy) this).zza(this, (zzfd) obj);
        }
        return false;
    }

    protected final <MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzbj() {
        return (BuilderType) zza(zzd.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgp
    public final boolean h_() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbk() {
        BuilderType buildertype = (BuilderType) zza(zzd.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    final int zzbi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    final void zzc(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final void zza(zzek zzekVar) throws IOException {
        zzgy.zza().zza((zzgy) this).zza((zzhc) this, (zzir) zzen.zza(zzekVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final int zzbl() {
        if (this.zzc == -1) {
            this.zzc = zzgy.zza().zza((zzgy) this).zzb(this);
        }
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzfd<?, ?>> T zza(Class<T> cls) {
        zzfd<?, ?> zzfdVar = zzd.get(cls);
        if (zzfdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfdVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzfdVar == null) {
            zzfdVar = (T) ((zzfd) zzia.zza(cls)).zza(zzd.zzf, (Object) null, (Object) null);
            if (zzfdVar == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzfdVar);
        }
        return (T) zzfdVar;
    }

    protected static <T extends zzfd<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static Object zza(zzgn zzgnVar, String str, Object[] objArr) {
        return new zzha(zzgnVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzfd<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzd.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzgy.zza().zza((zzgy) t).zzd(t);
        if (z) {
            t.zza(zzd.zzb, zzd2 ? t : null, null);
        }
        return zzd2;
    }

    protected static zzfi zzbm() {
        return zzff.zzd();
    }

    protected static zzfl zzbn() {
        return zzgb.zzd();
    }

    protected static zzfl zza(zzfl zzflVar) {
        int size = zzflVar.size();
        return zzflVar.zzc(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzfk<E> zzbo() {
        return zzhb.zzd();
    }

    protected static <E> zzfk<E> zza(zzfk<E> zzfkVar) {
        int size = zzfkVar.size();
        return zzfkVar.zza(size == 0 ? 10 : size << 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final /* synthetic */ zzgm zzbp() {
        zza zzaVar = (zza) zza(zzd.zze, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    public final /* synthetic */ zzgm zzbq() {
        return (zza) zza(zzd.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgp
    public final /* synthetic */ zzgn zzv() {
        return (zzfd) zza(zzd.zzf, (Object) null, (Object) null);
    }
}
