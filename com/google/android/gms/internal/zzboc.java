package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbod.zza;
import com.google.android.gms.internal.zzbod.zzb;
import java.util.Comparator;

public class zzboc<K, V> implements zzbod<K, V> {
    private static final zzboc zzcbc = new zzboc();

    private zzboc() {
    }

    public static <K, V> zzboc<K, V> zzXa() {
        return zzcbc;
    }

    public K getKey() {
        return null;
    }

    public V getValue() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean zzWZ() {
        return false;
    }

    public zzbod<K, V> zzXb() {
        return this;
    }

    public zzbod<K, V> zzXc() {
        return this;
    }

    public zzbod<K, V> zzXd() {
        return this;
    }

    public zzbod<K, V> zzXe() {
        return this;
    }

    public int zzXf() {
        return 0;
    }

    public zzbod<K, V> zza(K k, V v, zza com_google_android_gms_internal_zzbod_zza, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2) {
        return this;
    }

    public zzbod<K, V> zza(K k, V v, Comparator<K> comparator) {
        return new zzboe(k, v);
    }

    public zzbod<K, V> zza(K k, Comparator<K> comparator) {
        return this;
    }

    public void zza(zzb<K, V> com_google_android_gms_internal_zzbod_zzb_K__V) {
    }
}
