package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class zzbrx implements Iterable<zzbsb> {
    private static final zzboa<zzbsb> zzcjt = new zzboa(Collections.emptyList(), null);
    private final zzbrw zzcie;
    private final zzbsc zzcju;
    private zzboa<zzbsb> zzcjv;

    private zzbrx(zzbsc com_google_android_gms_internal_zzbsc, zzbrw com_google_android_gms_internal_zzbrw) {
        this.zzcie = com_google_android_gms_internal_zzbrw;
        this.zzcju = com_google_android_gms_internal_zzbsc;
        this.zzcjv = null;
    }

    private zzbrx(zzbsc com_google_android_gms_internal_zzbsc, zzbrw com_google_android_gms_internal_zzbrw, zzboa<zzbsb> com_google_android_gms_internal_zzboa_com_google_android_gms_internal_zzbsb) {
        this.zzcie = com_google_android_gms_internal_zzbrw;
        this.zzcju = com_google_android_gms_internal_zzbsc;
        this.zzcjv = com_google_android_gms_internal_zzboa_com_google_android_gms_internal_zzbsb;
    }

    public static zzbrx zza(zzbsc com_google_android_gms_internal_zzbsc, zzbrw com_google_android_gms_internal_zzbrw) {
        return new zzbrx(com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbrw);
    }

    private void zzabc() {
        if (this.zzcjv != null) {
            return;
        }
        if (this.zzcie.equals(zzbry.zzabf())) {
            this.zzcjv = zzcjt;
            return;
        }
        List arrayList = new ArrayList();
        Object obj = null;
        for (zzbsb com_google_android_gms_internal_zzbsb : this.zzcju) {
            obj = (obj != null || this.zzcie.zzm(com_google_android_gms_internal_zzbsb.zzWH())) ? 1 : null;
            arrayList.add(new zzbsb(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH()));
        }
        if (obj != null) {
            this.zzcjv = new zzboa(arrayList, this.zzcie);
        } else {
            this.zzcjv = zzcjt;
        }
    }

    public static zzbrx zzn(zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbrx(com_google_android_gms_internal_zzbsc, zzbsf.zzabj());
    }

    public Iterator<zzbsb> iterator() {
        zzabc();
        return this.zzcjv == zzcjt ? this.zzcju.iterator() : this.zzcjv.iterator();
    }

    public zzbsc zzWH() {
        return this.zzcju;
    }

    public Iterator<zzbsb> zzWU() {
        zzabc();
        return this.zzcjv == zzcjt ? this.zzcju.zzWU() : this.zzcjv.zzWU();
    }

    public zzbrq zza(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zzbrw com_google_android_gms_internal_zzbrw) {
        if (this.zzcie.equals(zzbry.zzabf()) || this.zzcie.equals(com_google_android_gms_internal_zzbrw)) {
            zzabc();
            if (this.zzcjv == zzcjt) {
                return this.zzcju.zzl(com_google_android_gms_internal_zzbrq);
            }
            zzbsb com_google_android_gms_internal_zzbsb = (zzbsb) this.zzcjv.zzan(new zzbsb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc));
            return com_google_android_gms_internal_zzbsb != null ? com_google_android_gms_internal_zzbsb.zzabi() : null;
        } else {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
    }

    public zzbsb zzabd() {
        if (!(this.zzcju instanceof zzbrr)) {
            return null;
        }
        zzabc();
        if (this.zzcjv != zzcjt) {
            return (zzbsb) this.zzcjv.zzWW();
        }
        zzbrq zzaaO = ((zzbrr) this.zzcju).zzaaO();
        return new zzbsb(zzaaO, this.zzcju.zzm(zzaaO));
    }

    public zzbsb zzabe() {
        if (!(this.zzcju instanceof zzbrr)) {
            return null;
        }
        zzabc();
        if (this.zzcjv != zzcjt) {
            return (zzbsb) this.zzcjv.zzWX();
        }
        zzbrq zzaaP = ((zzbrr) this.zzcju).zzaaP();
        return new zzbsb(zzaaP, this.zzcju.zzm(zzaaP));
    }

    public boolean zzb(zzbrw com_google_android_gms_internal_zzbrw) {
        return this.zzcie.equals(com_google_android_gms_internal_zzbrw);
    }

    public zzbrx zzh(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        zzbsc zze = this.zzcju.zze(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
        if (this.zzcjv == zzcjt && !this.zzcie.zzm(com_google_android_gms_internal_zzbsc)) {
            return new zzbrx(zze, this.zzcie, zzcjt);
        }
        if (this.zzcjv == null || this.zzcjv == zzcjt) {
            return new zzbrx(zze, this.zzcie, null);
        }
        zzboa zzal = this.zzcjv.zzal(new zzbsb(com_google_android_gms_internal_zzbrq, this.zzcju.zzm(com_google_android_gms_internal_zzbrq)));
        if (!com_google_android_gms_internal_zzbsc.isEmpty()) {
            zzal = zzal.zzam(new zzbsb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc));
        }
        return new zzbrx(zze, this.zzcie, zzal);
    }

    public zzbrx zzo(zzbsc com_google_android_gms_internal_zzbsc) {
        return new zzbrx(this.zzcju.zzg(com_google_android_gms_internal_zzbsc), this.zzcie, this.zzcjv);
    }
}
