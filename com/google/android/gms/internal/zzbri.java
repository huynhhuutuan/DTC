package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbrj.zza;
import java.util.Iterator;

public class zzbri implements zzbrj {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbri.class.desiredAssertionStatus());
    private final int limit;
    private final zzbrk zzciI;
    private final boolean zzciJ;
    private final zzbrw zzcie;

    public zzbri(zzbrb com_google_android_gms_internal_zzbrb) {
        this.zzciI = new zzbrk(com_google_android_gms_internal_zzbrb);
        this.zzcie = com_google_android_gms_internal_zzbrb.zzaai();
        this.limit = com_google_android_gms_internal_zzbrb.getLimit();
        this.zzciJ = !com_google_android_gms_internal_zzbrb.zzaak();
    }

    private zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zza com_google_android_gms_internal_zzbrj_zza, zzbrg com_google_android_gms_internal_zzbrg) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzbrx.zzWH().getChildCount() == this.limit) {
            zzbsb com_google_android_gms_internal_zzbsb = new zzbsb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
            zzbsb zzabd = this.zzciJ ? com_google_android_gms_internal_zzbrx.zzabd() : com_google_android_gms_internal_zzbrx.zzabe();
            boolean zza = this.zzciI.zza(com_google_android_gms_internal_zzbsb);
            if (com_google_android_gms_internal_zzbrx.zzWH().zzk(com_google_android_gms_internal_zzbrq)) {
                zzbsc zzm = com_google_android_gms_internal_zzbrx.zzWH().zzm(com_google_android_gms_internal_zzbrq);
                zzbsb zza2 = com_google_android_gms_internal_zzbrj_zza.zza(this.zzcie, zzabd, this.zzciJ);
                while (zza2 != null && (zza2.zzabi().equals(com_google_android_gms_internal_zzbrq) || com_google_android_gms_internal_zzbrx.zzWH().zzk(zza2.zzabi()))) {
                    zza2 = com_google_android_gms_internal_zzbrj_zza.zza(this.zzcie, zza2, this.zzciJ);
                }
                Object obj = (!zza || com_google_android_gms_internal_zzbsc.isEmpty() || (zza2 == null ? 1 : this.zzcie.zza(zza2, com_google_android_gms_internal_zzbsb, this.zzciJ)) < 0) ? null : 1;
                if (obj != null) {
                    if (com_google_android_gms_internal_zzbrg != null) {
                        com_google_android_gms_internal_zzbrg.zza(zzbqw.zza(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc, zzm));
                    }
                    return com_google_android_gms_internal_zzbrx.zzh(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
                }
                if (com_google_android_gms_internal_zzbrg != null) {
                    com_google_android_gms_internal_zzbrg.zza(zzbqw.zzd(com_google_android_gms_internal_zzbrq, zzm));
                }
                com_google_android_gms_internal_zzbrx = com_google_android_gms_internal_zzbrx.zzh(com_google_android_gms_internal_zzbrq, zzbrv.zzaaY());
                obj = (zza2 == null || !this.zzciI.zza(zza2)) ? null : 1;
                if (obj == null) {
                    return com_google_android_gms_internal_zzbrx;
                }
                if (com_google_android_gms_internal_zzbrg != null) {
                    com_google_android_gms_internal_zzbrg.zza(zzbqw.zzc(zza2.zzabi(), zza2.zzWH()));
                }
                return com_google_android_gms_internal_zzbrx.zzh(zza2.zzabi(), zza2.zzWH());
            } else if (com_google_android_gms_internal_zzbsc.isEmpty() || !zza || this.zzcie.zza(zzabd, com_google_android_gms_internal_zzbsb, this.zzciJ) < 0) {
                return com_google_android_gms_internal_zzbrx;
            } else {
                if (com_google_android_gms_internal_zzbrg != null) {
                    com_google_android_gms_internal_zzbrg.zza(zzbqw.zzd(zzabd.zzabi(), zzabd.zzWH()));
                    com_google_android_gms_internal_zzbrg.zza(zzbqw.zzc(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc));
                }
                return com_google_android_gms_internal_zzbrx.zzh(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc).zzh(zzabd.zzabi(), zzbrv.zzaaY());
            }
        }
        throw new AssertionError();
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zzbph com_google_android_gms_internal_zzbph, zza com_google_android_gms_internal_zzbrj_zza, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbsc zzaaY = !this.zzciI.zza(new zzbsb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc)) ? zzbrv.zzaaY() : com_google_android_gms_internal_zzbsc;
        return com_google_android_gms_internal_zzbrx.zzWH().zzm(com_google_android_gms_internal_zzbrq).equals(zzaaY) ? com_google_android_gms_internal_zzbrx : com_google_android_gms_internal_zzbrx.zzWH().getChildCount() < this.limit ? this.zzciI.zzaay().zza(com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, zzaaY, com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbrj_zza, com_google_android_gms_internal_zzbrg) : zza(com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, zzaaY, com_google_android_gms_internal_zzbrj_zza, com_google_android_gms_internal_zzbrg);
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrx com_google_android_gms_internal_zzbrx2, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbrx zza;
        if (com_google_android_gms_internal_zzbrx2.zzWH().zzaaM() || com_google_android_gms_internal_zzbrx2.zzWH().isEmpty()) {
            zza = zzbrx.zza(zzbrv.zzaaY(), this.zzcie);
        } else {
            Object zzaaA;
            Iterator it;
            int i;
            zzbrx zzo = com_google_android_gms_internal_zzbrx2.zzo(zzbsg.zzabk());
            if (this.zzciJ) {
                Iterator zzWU = com_google_android_gms_internal_zzbrx2.zzWU();
                Object zzaaB = this.zzciI.zzaaB();
                zzaaA = this.zzciI.zzaaA();
                it = zzWU;
                i = -1;
            } else {
                Iterator it2 = com_google_android_gms_internal_zzbrx2.iterator();
                zzbsb zzaaA2 = this.zzciI.zzaaA();
                zzbsb zzaaB2 = this.zzciI.zzaaB();
                zzbsb com_google_android_gms_internal_zzbsb = zzaaA2;
                i = 1;
                it = it2;
            }
            int i2 = 0;
            zza = zzo;
            Object obj = null;
            while (it.hasNext()) {
                int i3;
                zzbrx com_google_android_gms_internal_zzbrx3;
                zzbsb com_google_android_gms_internal_zzbsb2 = (zzbsb) it.next();
                if (obj == null && this.zzcie.compare(r5, com_google_android_gms_internal_zzbsb2) * i <= 0) {
                    obj = 1;
                }
                Object obj2 = (obj == null || i2 >= this.limit || this.zzcie.compare(com_google_android_gms_internal_zzbsb2, zzaaA) * i > 0) ? null : 1;
                if (obj2 != null) {
                    i3 = i2 + 1;
                    com_google_android_gms_internal_zzbrx3 = zza;
                } else {
                    zza = zza.zzh(com_google_android_gms_internal_zzbsb2.zzabi(), zzbrv.zzaaY());
                    i3 = i2;
                    com_google_android_gms_internal_zzbrx3 = zza;
                }
                zza = com_google_android_gms_internal_zzbrx3;
                i2 = i3;
            }
        }
        return this.zzciI.zzaay().zza(com_google_android_gms_internal_zzbrx, zza, com_google_android_gms_internal_zzbrg);
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbsc com_google_android_gms_internal_zzbsc) {
        return com_google_android_gms_internal_zzbrx;
    }

    public zzbrw zzaai() {
        return this.zzcie;
    }

    public zzbrj zzaay() {
        return this.zzciI.zzaay();
    }

    public boolean zzaaz() {
        return true;
    }
}
