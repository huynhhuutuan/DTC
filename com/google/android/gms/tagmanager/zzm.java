package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class zzm<K, V> {
    final zza<K, V> zzbEX = new C11451(this);

    public interface zza<K, V> {
        int sizeOf(K k, V v);
    }

    class C11451 implements zza<K, V> {
        C11451(zzm com_google_android_gms_tagmanager_zzm) {
        }

        public int sizeOf(K k, V v) {
            return 1;
        }
    }

    public zzl<K, V> zza(int i, zza<K, V> com_google_android_gms_tagmanager_zzm_zza_K__V) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        zzzz();
        return new zzbi(i, com_google_android_gms_tagmanager_zzm_zza_K__V);
    }

    int zzzz() {
        return VERSION.SDK_INT;
    }
}
