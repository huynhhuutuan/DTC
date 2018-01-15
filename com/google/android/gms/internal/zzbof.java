package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbod.zza;
import com.google.android.gms.internal.zzbod.zzb;
import java.util.Comparator;

public abstract class zzbof<K, V> implements zzbod<K, V> {
    private final V value;
    private final K zzcbg;
    private zzbod<K, V> zzcbh;
    private final zzbod<K, V> zzcbi;

    zzbof(K k, V v, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2) {
        zzbod zzXa;
        zzbod zzXa2;
        this.zzcbg = k;
        this.value = v;
        if (com_google_android_gms_internal_zzbod_K__V == null) {
            zzXa = zzboc.zzXa();
        }
        this.zzcbh = zzXa;
        if (com_google_android_gms_internal_zzbod_K__V2 == null) {
            zzXa2 = zzboc.zzXa();
        }
        this.zzcbi = zzXa2;
    }

    private zzbod<K, V> zzXg() {
        if (this.zzcbh.isEmpty()) {
            return zzboc.zzXa();
        }
        if (!(zzXb().zzWZ() || zzXb().zzXb().zzWZ())) {
            this = zzXh();
        }
        return zza(null, null, ((zzbof) this.zzcbh).zzXg(), null).zzXj();
    }

    private zzbof<K, V> zzXh() {
        zzbof<K, V> zzXm = zzXm();
        return zzXm.zzXc().zzXb().zzWZ() ? zzXm.zza(null, null, null, ((zzbof) zzXm.zzXc()).zzXl()).zzXk().zzXm() : zzXm;
    }

    private zzbof<K, V> zzXi() {
        zzbof<K, V> zzXm = zzXm();
        return zzXm.zzXb().zzXb().zzWZ() ? zzXm.zzXl().zzXm() : zzXm;
    }

    private zzbof<K, V> zzXj() {
        zzbof<K, V> zzXk;
        if (this.zzcbi.zzWZ() && !this.zzcbh.zzWZ()) {
            zzXk = zzXk();
        }
        if (zzXk.zzcbh.zzWZ() && ((zzbof) zzXk.zzcbh).zzcbh.zzWZ()) {
            zzXk = zzXk.zzXl();
        }
        return (zzXk.zzcbh.zzWZ() && zzXk.zzcbi.zzWZ()) ? zzXk.zzXm() : zzXk;
    }

    private zzbof<K, V> zzXk() {
        return (zzbof) this.zzcbi.zza(null, null, zzWY(), (zzbof) zza(null, null, zza.RED, null, ((zzbof) this.zzcbi).zzcbh), null);
    }

    private zzbof<K, V> zzXl() {
        return (zzbof) this.zzcbh.zza(null, null, zzWY(), null, (zzbof) zza(null, null, zza.RED, ((zzbof) this.zzcbh).zzcbi, null));
    }

    private zzbof<K, V> zzXm() {
        return (zzbof) zza(null, null, zza((zzbod) this), this.zzcbh.zza(null, null, zza(this.zzcbh), null, null), this.zzcbi.zza(null, null, zza(this.zzcbi), null, null));
    }

    private static zza zza(zzbod com_google_android_gms_internal_zzbod) {
        return com_google_android_gms_internal_zzbod.zzWZ() ? zza.BLACK : zza.RED;
    }

    public K getKey() {
        return this.zzcbg;
    }

    public V getValue() {
        return this.value;
    }

    public boolean isEmpty() {
        return false;
    }

    protected abstract zza zzWY();

    public zzbod<K, V> zzXb() {
        return this.zzcbh;
    }

    public zzbod<K, V> zzXc() {
        return this.zzcbi;
    }

    public zzbod<K, V> zzXd() {
        return this.zzcbh.isEmpty() ? this : this.zzcbh.zzXd();
    }

    public zzbod<K, V> zzXe() {
        return this.zzcbi.isEmpty() ? this : this.zzcbi.zzXe();
    }

    public int zzXf() {
        return (this.zzcbh.zzXf() + 1) + this.zzcbi.zzXf();
    }

    public /* synthetic */ zzbod zza(Object obj, Object obj2, zza com_google_android_gms_internal_zzbod_zza, zzbod com_google_android_gms_internal_zzbod, zzbod com_google_android_gms_internal_zzbod2) {
        return zzb(obj, obj2, com_google_android_gms_internal_zzbod_zza, com_google_android_gms_internal_zzbod, com_google_android_gms_internal_zzbod2);
    }

    public zzbod<K, V> zza(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.zzcbg);
        zzbof zza = compare < 0 ? zza(null, null, this.zzcbh.zza(k, v, comparator), null) : compare == 0 ? zza(k, v, null, null) : zza(null, null, null, this.zzcbi.zza(k, v, comparator));
        return zza.zzXj();
    }

    public zzbod<K, V> zza(K k, Comparator<K> comparator) {
        zzbof zza;
        if (comparator.compare(k, this.zzcbg) < 0) {
            if (!(this.zzcbh.isEmpty() || this.zzcbh.zzWZ() || ((zzbof) this.zzcbh).zzcbh.zzWZ())) {
                this = zzXh();
            }
            zza = zza(null, null, this.zzcbh.zza(k, comparator), null);
        } else {
            if (this.zzcbh.zzWZ()) {
                this = zzXl();
            }
            if (!(this.zzcbi.isEmpty() || this.zzcbi.zzWZ() || ((zzbof) this.zzcbi).zzcbh.zzWZ())) {
                this = zzXi();
            }
            if (comparator.compare(k, this.zzcbg) == 0) {
                if (this.zzcbi.isEmpty()) {
                    return zzboc.zzXa();
                }
                zzbod zzXd = this.zzcbi.zzXd();
                this = zza(zzXd.getKey(), zzXd.getValue(), null, ((zzbof) this.zzcbi).zzXg());
            }
            zza = zza(null, null, null, this.zzcbi.zza(k, comparator));
        }
        return zza.zzXj();
    }

    protected abstract zzbof<K, V> zza(K k, V v, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2);

    public void zza(zzb<K, V> com_google_android_gms_internal_zzbod_zzb_K__V) {
        this.zzcbh.zza(com_google_android_gms_internal_zzbod_zzb_K__V);
        com_google_android_gms_internal_zzbod_zzb_K__V.zzj(this.zzcbg, this.value);
        this.zzcbi.zza(com_google_android_gms_internal_zzbod_zzb_K__V);
    }

    public zzbof<K, V> zzb(K k, V v, zza com_google_android_gms_internal_zzbod_zza, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V, zzbod<K, V> com_google_android_gms_internal_zzbod_K__V2) {
        Object obj;
        Object obj2;
        zzbod com_google_android_gms_internal_zzbod;
        zzbod com_google_android_gms_internal_zzbod2;
        if (k == null) {
            obj = this.zzcbg;
        }
        if (v == null) {
            obj2 = this.value;
        }
        if (com_google_android_gms_internal_zzbod_K__V == null) {
            com_google_android_gms_internal_zzbod = this.zzcbh;
        }
        if (com_google_android_gms_internal_zzbod_K__V2 == null) {
            com_google_android_gms_internal_zzbod2 = this.zzcbi;
        }
        return com_google_android_gms_internal_zzbod_zza == zza.RED ? new zzboe(obj, obj2, com_google_android_gms_internal_zzbod, com_google_android_gms_internal_zzbod2) : new zzbob(obj, obj2, com_google_android_gms_internal_zzbod, com_google_android_gms_internal_zzbod2);
    }

    void zzb(zzbod<K, V> com_google_android_gms_internal_zzbod_K__V) {
        this.zzcbh = com_google_android_gms_internal_zzbod_K__V;
    }
}
