package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbod.zza;

public class zzboe<K, V> extends zzbof<K, V> {
    zzboe(K k, V v) {
        super(k, v, zzboc.zzXa(), zzboc.zzXa());
    }

    zzboe(K k, V v, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2) {
        super(k, v, com_google_android_gms_internal_zzbod_K__V, com_google_android_gms_internal_zzbod_K__V2);
    }

    protected zza zzWY() {
        return zza.RED;
    }

    public boolean zzWZ() {
        return true;
    }

    protected zzbof<K, V> zza(K k, V v, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2) {
        Object key;
        Object value;
        zzbod zzXb;
        zzbod zzXc;
        if (k == null) {
            key = getKey();
        }
        if (v == null) {
            value = getValue();
        }
        if (com_google_android_gms_internal_zzbod_K__V == null) {
            zzXb = zzXb();
        }
        if (com_google_android_gms_internal_zzbod_K__V2 == null) {
            zzXc = zzXc();
        }
        return new zzboe(key, value, zzXb, zzXc);
    }
}
