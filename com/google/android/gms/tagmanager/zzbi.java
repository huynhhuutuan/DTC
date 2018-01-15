package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
import com.google.android.gms.tagmanager.zzm.zza;

@TargetApi(12)
class zzbi<K, V> implements zzl<K, V> {
    private LruCache<K, V> zzbGJ;

    zzbi(int i, final zza<K, V> com_google_android_gms_tagmanager_zzm_zza_K__V) {
        this.zzbGJ = new LruCache<K, V>(this, i) {
            protected int sizeOf(K k, V v) {
                return com_google_android_gms_tagmanager_zzm_zza_K__V.sizeOf(k, v);
            }
        };
    }

    public V get(K k) {
        return this.zzbGJ.get(k);
    }

    public void zzh(K k, V v) {
        this.zzbGJ.put(k, v);
    }
}
