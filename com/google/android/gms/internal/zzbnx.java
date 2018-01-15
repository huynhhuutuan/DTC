package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbny.zza.zza;
import com.google.android.gms.internal.zzbod.zzb;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzbnx<K, V> extends zzbny<K, V> {
    private final K[] zzcaQ;
    private final V[] zzcaR;
    private final Comparator<K> zzcaS;

    public zzbnx(Comparator<K> comparator) {
        this.zzcaQ = new Object[0];
        this.zzcaR = new Object[0];
        this.zzcaS = comparator;
    }

    private zzbnx(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.zzcaQ = kArr;
        this.zzcaR = vArr;
        this.zzcaS = comparator;
    }

    public static <A, B, C> zzbnx<A, C> zza(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzbny_zza_zza_A__B, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        size = 0;
        for (Object next : list) {
            objArr[size] = next;
            objArr2[size] = map.get(com_google_android_gms_internal_zzbny_zza_zza_A__B.zzak(next));
            size++;
        }
        return new zzbnx(comparator, objArr, objArr2);
    }

    public static <K, V> zzbnx<K, V> zza(Map<K, V> map, Comparator<K> comparator) {
        return zza(new ArrayList(map.keySet()), map, zzbny.zza.zzWV(), comparator);
    }

    private static <T> T[] zza(T[] tArr, int i) {
        int length = tArr.length - 1;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, i);
        System.arraycopy(tArr, i + 1, obj, i, length - i);
        return obj;
    }

    private static <T> T[] zza(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, i);
        obj[i] = t;
        System.arraycopy(tArr, i, obj, i + 1, (length - i) - 1);
        return obj;
    }

    private int zzai(K k) {
        int i = 0;
        while (i < this.zzcaQ.length && this.zzcaS.compare(this.zzcaQ[i], k) < 0) {
            i++;
        }
        return i;
    }

    private int zzaj(K k) {
        int i = 0;
        Object[] objArr = this.zzcaQ;
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (this.zzcaS.compare(k, objArr[i2]) == 0) {
                return i;
            }
            i2++;
            i++;
        }
        return -1;
    }

    private static <T> T[] zzb(T[] tArr, int i, T t) {
        int length = tArr.length;
        Object obj = new Object[length];
        System.arraycopy(tArr, 0, obj, 0, length);
        obj[i] = t;
        return obj;
    }

    private Iterator<Entry<K, V>> zze(final int i, final boolean z) {
        return new Iterator<Entry<K, V>>(this) {
            int zzcaT = i;
            final /* synthetic */ zzbnx zzcaW;

            public boolean hasNext() {
                return z ? this.zzcaT >= 0 : this.zzcaT < this.zzcaW.zzcaQ.length;
            }

            public Entry<K, V> next() {
                Object obj = this.zzcaW.zzcaQ[this.zzcaT];
                Object obj2 = this.zzcaW.zzcaR[this.zzcaT];
                this.zzcaT = z ? this.zzcaT - 1 : this.zzcaT + 1;
                return new SimpleImmutableEntry(obj, obj2);
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    public boolean containsKey(K k) {
        return zzaj(k) != -1;
    }

    public V get(K k) {
        int zzaj = zzaj(k);
        return zzaj != -1 ? this.zzcaR[zzaj] : null;
    }

    public Comparator<K> getComparator() {
        return this.zzcaS;
    }

    public boolean isEmpty() {
        return this.zzcaQ.length == 0;
    }

    public Iterator<Entry<K, V>> iterator() {
        return zze(0, false);
    }

    public int size() {
        return this.zzcaQ.length;
    }

    public K zzWS() {
        return this.zzcaQ.length > 0 ? this.zzcaQ[0] : null;
    }

    public K zzWT() {
        return this.zzcaQ.length > 0 ? this.zzcaQ[this.zzcaQ.length - 1] : null;
    }

    public Iterator<Entry<K, V>> zzWU() {
        return zze(this.zzcaQ.length - 1, true);
    }

    public void zza(zzb<K, V> com_google_android_gms_internal_zzbod_zzb_K__V) {
        for (int i = 0; i < this.zzcaQ.length; i++) {
            com_google_android_gms_internal_zzbod_zzb_K__V.zzj(this.zzcaQ[i], this.zzcaR[i]);
        }
    }

    public zzbny<K, V> zzag(K k) {
        int zzaj = zzaj(k);
        if (zzaj == -1) {
            return this;
        }
        return new zzbnx(this.zzcaS, zza(this.zzcaQ, zzaj), zza(this.zzcaR, zzaj));
    }

    public K zzah(K k) {
        int zzaj = zzaj(k);
        if (zzaj != -1) {
            return zzaj > 0 ? this.zzcaQ[zzaj - 1] : null;
        } else {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
    }

    public zzbny<K, V> zzi(K k, V v) {
        int zzaj = zzaj(k);
        if (zzaj != -1) {
            if (this.zzcaQ[zzaj] == k && this.zzcaR[zzaj] == v) {
                return this;
            }
            return new zzbnx(this.zzcaS, zzb(this.zzcaQ, zzaj, k), zzb(this.zzcaR, zzaj, v));
        } else if (this.zzcaQ.length > 25) {
            Map hashMap = new HashMap(this.zzcaQ.length + 1);
            for (zzaj = 0; zzaj < this.zzcaQ.length; zzaj++) {
                hashMap.put(this.zzcaQ[zzaj], this.zzcaR[zzaj]);
            }
            hashMap.put(k, v);
            return zzbog.zzc(hashMap, this.zzcaS);
        } else {
            zzaj = zzai(k);
            return new zzbnx(this.zzcaS, zza(this.zzcaQ, zzaj, k), zza(this.zzcaR, zzaj, v));
        }
    }
}
