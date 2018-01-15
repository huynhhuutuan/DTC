package com.google.android.gms.internal;

import java.util.Comparator;

public interface zzbod<K, V> {

    public enum zza {
        RED,
        BLACK
    }

    public static abstract class zzb<K, V> {
        public abstract void zzj(K k, V v);
    }

    K getKey();

    V getValue();

    boolean isEmpty();

    boolean zzWZ();

    zzbod<K, V> zzXb();

    zzbod<K, V> zzXc();

    zzbod<K, V> zzXd();

    zzbod<K, V> zzXe();

    int zzXf();

    zzbod<K, V> zza(K k, V v, zza com_google_android_gms_internal_zzbod_zza, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2);

    zzbod<K, V> zza(K k, V v, Comparator<K> comparator);

    zzbod<K, V> zza(K k, Comparator<K> comparator);

    void zza(zzb<K, V> com_google_android_gms_internal_zzbod_zzb_K__V);
}
