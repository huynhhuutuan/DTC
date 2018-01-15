package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbod.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzbog<K, V> extends zzbny<K, V> {
    private Comparator<K> zzcaS;
    private zzbod<K, V> zzcbj;

    private static class zza<A, B, C> {
        private final Map<B, C> values;
        private final List<A> zzcbk;
        private final com.google.android.gms.internal.zzbny.zza.zza<A, B> zzcbl;
        private zzbof<A, C> zzcbm;
        private zzbof<A, C> zzcbn;

        static class zza implements Iterable<zzb> {
            private final int length;
            private long value;

            class C04811 implements Iterator<zzb> {
                private int zzcbo = (this.zzcbp.length - 1);
                final /* synthetic */ zza zzcbp;

                C04811(zza com_google_android_gms_internal_zzbog_zza_zza) {
                    this.zzcbp = com_google_android_gms_internal_zzbog_zza_zza;
                }

                public boolean hasNext() {
                    return this.zzcbo >= 0;
                }

                public /* synthetic */ Object next() {
                    return zzXn();
                }

                public void remove() {
                }

                public zzb zzXn() {
                    boolean z = true;
                    long zzb = this.zzcbp.value & ((long) (1 << this.zzcbo));
                    zzb com_google_android_gms_internal_zzbog_zza_zzb = new zzb();
                    if (zzb != 0) {
                        z = false;
                    }
                    com_google_android_gms_internal_zzbog_zza_zzb.zzcbq = z;
                    com_google_android_gms_internal_zzbog_zza_zzb.zzcbr = (int) Math.pow(2.0d, (double) this.zzcbo);
                    this.zzcbo--;
                    return com_google_android_gms_internal_zzbog_zza_zzb;
                }
            }

            public zza(int i) {
                int i2 = i + 1;
                this.length = (int) Math.floor(Math.log((double) i2) / Math.log(2.0d));
                this.value = ((long) i2) & (((long) Math.pow(2.0d, (double) this.length)) - 1);
            }

            public Iterator<zzb> iterator() {
                return new C04811(this);
            }
        }

        static class zzb {
            public boolean zzcbq;
            public int zzcbr;

            zzb() {
            }
        }

        private zza(List<A> list, Map<B, C> map, com.google.android.gms.internal.zzbny.zza.zza<A, B> com_google_android_gms_internal_zzbny_zza_zza_A__B) {
            this.zzcbk = list;
            this.values = map;
            this.zzcbl = com_google_android_gms_internal_zzbny_zza_zza_A__B;
        }

        private zzbod<A, C> zzF(int i, int i2) {
            if (i2 == 0) {
                return zzboc.zzXa();
            }
            if (i2 == 1) {
                Object obj = this.zzcbk.get(i);
                return new zzbob(obj, zzap(obj), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            zzbod zzF = zzF(i, i3);
            zzbod zzF2 = zzF(i4 + 1, i3);
            obj = this.zzcbk.get(i4);
            return new zzbob(obj, zzap(obj), zzF, zzF2);
        }

        private void zza(com.google.android.gms.internal.zzbod.zza com_google_android_gms_internal_zzbod_zza, int i, int i2) {
            zzbod zzF = zzF(i2 + 1, i - 1);
            Object obj = this.zzcbk.get(i2);
            Object com_google_android_gms_internal_zzboe = com_google_android_gms_internal_zzbod_zza == com.google.android.gms.internal.zzbod.zza.RED ? new zzboe(obj, zzap(obj), null, zzF) : new zzbob(obj, zzap(obj), null, zzF);
            if (this.zzcbm == null) {
                this.zzcbm = com_google_android_gms_internal_zzboe;
                this.zzcbn = com_google_android_gms_internal_zzboe;
                return;
            }
            this.zzcbn.zzb(com_google_android_gms_internal_zzboe);
            this.zzcbn = com_google_android_gms_internal_zzboe;
        }

        private C zzap(A a) {
            return this.values.get(this.zzcbl.zzak(a));
        }

        public static <A, B, C> zzbog<A, C> zzc(List<A> list, Map<B, C> map, com.google.android.gms.internal.zzbny.zza.zza<A, B> com_google_android_gms_internal_zzbny_zza_zza_A__B, Comparator<A> comparator) {
            zza com_google_android_gms_internal_zzbog_zza = new zza(list, map, com_google_android_gms_internal_zzbny_zza_zza_A__B);
            Collections.sort(list, comparator);
            Iterator it = new zza(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                int i;
                zzb com_google_android_gms_internal_zzbog_zza_zzb = (zzb) it.next();
                size -= com_google_android_gms_internal_zzbog_zza_zzb.zzcbr;
                if (com_google_android_gms_internal_zzbog_zza_zzb.zzcbq) {
                    com_google_android_gms_internal_zzbog_zza.zza(com.google.android.gms.internal.zzbod.zza.BLACK, com_google_android_gms_internal_zzbog_zza_zzb.zzcbr, size);
                    i = size;
                } else {
                    com_google_android_gms_internal_zzbog_zza.zza(com.google.android.gms.internal.zzbod.zza.BLACK, com_google_android_gms_internal_zzbog_zza_zzb.zzcbr, size);
                    size -= com_google_android_gms_internal_zzbog_zza_zzb.zzcbr;
                    com_google_android_gms_internal_zzbog_zza.zza(com.google.android.gms.internal.zzbod.zza.RED, com_google_android_gms_internal_zzbog_zza_zzb.zzcbr, size);
                    i = size;
                }
                size = i;
            }
            return new zzbog(com_google_android_gms_internal_zzbog_zza.zzcbm == null ? zzboc.zzXa() : com_google_android_gms_internal_zzbog_zza.zzcbm, comparator);
        }
    }

    private zzbog(zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, Comparator<K> comparator) {
        this.zzcbj = com_google_android_gms_internal_zzbod_K__V;
        this.zzcaS = comparator;
    }

    private zzbod<K, V> zzao(K k) {
        zzbod<K, V> com_google_android_gms_internal_zzbod_K__V = this.zzcbj;
        while (!com_google_android_gms_internal_zzbod_K__V.isEmpty()) {
            int compare = this.zzcaS.compare(k, com_google_android_gms_internal_zzbod_K__V.getKey());
            if (compare < 0) {
                com_google_android_gms_internal_zzbod_K__V = com_google_android_gms_internal_zzbod_K__V.zzXb();
            } else if (compare == 0) {
                return com_google_android_gms_internal_zzbod_K__V;
            } else {
                com_google_android_gms_internal_zzbod_K__V = com_google_android_gms_internal_zzbod_K__V.zzXc();
            }
        }
        return null;
    }

    public static <A, B, C> zzbog<A, C> zzc(List<A> list, Map<B, C> map, com.google.android.gms.internal.zzbny.zza.zza<A, B> com_google_android_gms_internal_zzbny_zza_zza_A__B, Comparator<A> comparator) {
        return zza.zzc(list, map, com_google_android_gms_internal_zzbny_zza_zza_A__B, comparator);
    }

    public static <A, B> zzbog<A, B> zzc(Map<A, B> map, Comparator<A> comparator) {
        return zza.zzc(new ArrayList(map.keySet()), map, com.google.android.gms.internal.zzbny.zza.zzWV(), comparator);
    }

    public boolean containsKey(K k) {
        return zzao(k) != null;
    }

    public V get(K k) {
        zzbod zzao = zzao(k);
        return zzao != null ? zzao.getValue() : null;
    }

    public Comparator<K> getComparator() {
        return this.zzcaS;
    }

    public boolean isEmpty() {
        return this.zzcbj.isEmpty();
    }

    public Iterator<Entry<K, V>> iterator() {
        return new zzbnz(this.zzcbj, null, this.zzcaS, false);
    }

    public int size() {
        return this.zzcbj.zzXf();
    }

    public K zzWS() {
        return this.zzcbj.zzXd().getKey();
    }

    public K zzWT() {
        return this.zzcbj.zzXe().getKey();
    }

    public Iterator<Entry<K, V>> zzWU() {
        return new zzbnz(this.zzcbj, null, this.zzcaS, true);
    }

    public void zza(zzb<K, V> com_google_android_gms_internal_zzbod_zzb_K__V) {
        this.zzcbj.zza(com_google_android_gms_internal_zzbod_zzb_K__V);
    }

    public zzbny<K, V> zzag(K k) {
        if (!containsKey(k)) {
            return this;
        }
        return new zzbog(this.zzcbj.zza(k, this.zzcaS).zza(null, null, com.google.android.gms.internal.zzbod.zza.BLACK, null, null), this.zzcaS);
    }

    public K zzah(K k) {
        zzbod com_google_android_gms_internal_zzbod = this.zzcbj;
        zzbod com_google_android_gms_internal_zzbod2 = null;
        while (!com_google_android_gms_internal_zzbod.isEmpty()) {
            int compare = this.zzcaS.compare(k, com_google_android_gms_internal_zzbod.getKey());
            if (compare == 0) {
                if (com_google_android_gms_internal_zzbod.zzXb().isEmpty()) {
                    return com_google_android_gms_internal_zzbod2 != null ? com_google_android_gms_internal_zzbod2.getKey() : null;
                } else {
                    com_google_android_gms_internal_zzbod2 = com_google_android_gms_internal_zzbod.zzXb();
                    while (!com_google_android_gms_internal_zzbod2.zzXc().isEmpty()) {
                        com_google_android_gms_internal_zzbod2 = com_google_android_gms_internal_zzbod2.zzXc();
                    }
                    return com_google_android_gms_internal_zzbod2.getKey();
                }
            } else if (compare < 0) {
                com_google_android_gms_internal_zzbod = com_google_android_gms_internal_zzbod.zzXb();
            } else {
                zzbod com_google_android_gms_internal_zzbod3 = com_google_android_gms_internal_zzbod;
                com_google_android_gms_internal_zzbod = com_google_android_gms_internal_zzbod.zzXc();
                com_google_android_gms_internal_zzbod2 = com_google_android_gms_internal_zzbod3;
            }
        }
        String valueOf = String.valueOf(k);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Couldn't find predecessor key of non-present key: ").append(valueOf).toString());
    }

    public zzbny<K, V> zzi(K k, V v) {
        return new zzbog(this.zzcbj.zza(k, v, this.zzcaS).zza(null, null, com.google.android.gms.internal.zzbod.zza.BLACK, null, null), this.zzcaS);
    }
}
