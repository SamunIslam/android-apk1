package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzegy {
    private static int zzhv(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static <T> List<T> zzhs(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> HashSet<T> zzht(int i) {
        return new HashSet<>(zzhv(i));
    }

    public static <K, V> LinkedHashMap<K, V> zzhu(int i) {
        return new LinkedHashMap<>(zzhv(i));
    }
}
