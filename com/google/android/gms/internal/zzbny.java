package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbod.zzb;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class zzbny<K, V> implements Iterable<Entry<K, V>> {

    public static class zza {
        private static final zza zzcaX = new C09611();

        public interface zza<C, D> {
            D zzak(C c);
        }

        class C09611 implements zza {
            C09611() {
            }

            public Object zzak(Object obj) {
                return obj;
            }
        }

        public static <A> zza<A, A> zzWV() {
            return zzcaX;
        }

        public static <K, V> zzbny<K, V> zza(Comparator<K> comparator) {
            return new zzbnx(comparator);
        }

        public static <A, B, C> zzbny<A, C> zzb(List<A> list, Map<B, C> map, zza<A, B> com_google_android_gms_internal_zzbny_zza_zza_A__B, Comparator<A> comparator) {
            return list.size() < 25 ? zzbnx.zza(list, map, com_google_android_gms_internal_zzbny_zza_zza_A__B, comparator) : zzbog.zzc(list, map, com_google_android_gms_internal_zzbny_zza_zza_A__B, comparator);
        }

        public static <A, B> zzbny<A, B> zzb(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? zzbnx.zza((Map) map, (Comparator) comparator) : zzbog.zzc(map, comparator);
        }
    }

    public abstract boolean containsKey(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbny)) {
            return false;
        }
        zzbny com_google_android_gms_internal_zzbny = (zzbny) obj;
        if (!getComparator().equals(com_google_android_gms_internal_zzbny.getComparator())) {
            return false;
        }
        if (size() != com_google_android_gms_internal_zzbny.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = com_google_android_gms_internal_zzbny.iterator();
        while (it.hasNext()) {
            if (!((Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract V get(K k);

    public abstract Comparator<K> getComparator();

    public int hashCode() {
        int hashCode = getComparator().hashCode();
        Iterator it = iterator();
        int i = hashCode;
        while (it.hasNext()) {
            i = ((Entry) it.next()).hashCode() + (i * 31);
        }
        return i;
    }

    public abstract boolean isEmpty();

    public abstract Iterator<Entry<K, V>> iterator();

    public abstract int size();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("{");
        Iterator it = iterator();
        Object obj = 1;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append("(");
            stringBuilder.append(entry.getKey());
            stringBuilder.append("=>");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(")");
        }
        stringBuilder.append("};");
        return stringBuilder.toString();
    }

    public abstract K zzWS();

    public abstract K zzWT();

    public abstract Iterator<Entry<K, V>> zzWU();

    public abstract void zza(zzb<K, V> com_google_android_gms_internal_zzbod_zzb_K__V);

    public abstract zzbny<K, V> zzag(K k);

    public abstract K zzah(K k);

    public abstract zzbny<K, V> zzi(K k, V v);
}
