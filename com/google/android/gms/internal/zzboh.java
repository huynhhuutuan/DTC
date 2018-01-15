package com.google.android.gms.internal;

import java.util.Comparator;

public class zzboh<A extends Comparable<A>> implements Comparator<A> {
    private static zzboh zzcbs = new zzboh();

    private zzboh() {
    }

    public static <T extends Comparable<T>> zzboh<T> zzh(Class<T> cls) {
        return zzcbs;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return zza((Comparable) obj, (Comparable) obj2);
    }

    public int zza(A a, A a2) {
        return a.compareTo(a2);
    }
}
