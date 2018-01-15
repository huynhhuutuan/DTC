package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbrj.zza;

public class zzbrh implements zzbrj {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbrh.class.desiredAssertionStatus());
    private final zzbrw zzcie;

    public zzbrh(zzbrw com_google_android_gms_internal_zzbrw) {
        this.zzcie = com_google_android_gms_internal_zzbrw;
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zzbph com_google_android_gms_internal_zzbph, zza com_google_android_gms_internal_zzbrj_zza, zzbrg com_google_android_gms_internal_zzbrg) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzbrx.zzb(this.zzcie)) {
            zzbsc zzWH = com_google_android_gms_internal_zzbrx.zzWH();
            zzbsc zzm = zzWH.zzm(com_google_android_gms_internal_zzbrq);
            if (zzm.zzO(com_google_android_gms_internal_zzbph).equals(com_google_android_gms_internal_zzbsc.zzO(com_google_android_gms_internal_zzbph)) && zzm.isEmpty() == com_google_android_gms_internal_zzbsc.isEmpty()) {
                return com_google_android_gms_internal_zzbrx;
            }
            if (com_google_android_gms_internal_zzbrg != null) {
                if (com_google_android_gms_internal_zzbsc.isEmpty()) {
                    if (zzWH.zzk(com_google_android_gms_internal_zzbrq)) {
                        com_google_android_gms_internal_zzbrg.zza(zzbqw.zzd(com_google_android_gms_internal_zzbrq, zzm));
                    } else if (!($assertionsDisabled || zzWH.zzaaM())) {
                        throw new AssertionError("A child remove without an old child only makes sense on a leaf node");
                    }
                } else if (zzm.isEmpty()) {
                    com_google_android_gms_internal_zzbrg.zza(zzbqw.zzc(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc));
                } else {
                    com_google_android_gms_internal_zzbrg.zza(zzbqw.zza(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc, zzm));
                }
            }
            return (zzWH.zzaaM() && com_google_android_gms_internal_zzbsc.isEmpty()) ? com_google_android_gms_internal_zzbrx : com_google_android_gms_internal_zzbrx.zzh(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
        } else {
            throw new AssertionError("The index must match the filter");
        }
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrx com_google_android_gms_internal_zzbrx2, zzbrg com_google_android_gms_internal_zzbrg) {
        if ($assertionsDisabled || com_google_android_gms_internal_zzbrx2.zzb(this.zzcie)) {
            if (com_google_android_gms_internal_zzbrg != null) {
                for (zzbsb com_google_android_gms_internal_zzbsb : com_google_android_gms_internal_zzbrx.zzWH()) {
                    if (!com_google_android_gms_internal_zzbrx2.zzWH().zzk(com_google_android_gms_internal_zzbsb.zzabi())) {
                        com_google_android_gms_internal_zzbrg.zza(zzbqw.zzd(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH()));
                    }
                }
                if (!com_google_android_gms_internal_zzbrx2.zzWH().zzaaM()) {
                    for (zzbsb com_google_android_gms_internal_zzbsb2 : com_google_android_gms_internal_zzbrx2.zzWH()) {
                        if (com_google_android_gms_internal_zzbrx.zzWH().zzk(com_google_android_gms_internal_zzbsb2.zzabi())) {
                            zzbsc zzm = com_google_android_gms_internal_zzbrx.zzWH().zzm(com_google_android_gms_internal_zzbsb2.zzabi());
                            if (!zzm.equals(com_google_android_gms_internal_zzbsb2.zzWH())) {
                                com_google_android_gms_internal_zzbrg.zza(zzbqw.zza(com_google_android_gms_internal_zzbsb2.zzabi(), com_google_android_gms_internal_zzbsb2.zzWH(), zzm));
                            }
                        } else {
                            com_google_android_gms_internal_zzbrg.zza(zzbqw.zzc(com_google_android_gms_internal_zzbsb2.zzabi(), com_google_android_gms_internal_zzbsb2.zzWH()));
                        }
                    }
                }
            }
            return com_google_android_gms_internal_zzbrx2;
        }
        throw new AssertionError("Can't use IndexedNode that doesn't have filter's index");
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbsc com_google_android_gms_internal_zzbsc) {
        return com_google_android_gms_internal_zzbrx.zzWH().isEmpty() ? com_google_android_gms_internal_zzbrx : com_google_android_gms_internal_zzbrx.zzo(com_google_android_gms_internal_zzbsc);
    }

    public zzbrw zzaai() {
        return this.zzcie;
    }

    public zzbrj zzaay() {
        return this;
    }

    public boolean zzaaz() {
        return false;
    }
}
