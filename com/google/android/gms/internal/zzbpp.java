package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class zzbpp {
    private zzbsc zzcfH = null;
    private Map<zzbrq, zzbpp> zzcfI = null;

    public interface zza {
        void zza(zzbrq com_google_android_gms_internal_zzbrq, zzbpp com_google_android_gms_internal_zzbpp);
    }

    public interface zzb {
        void zzf(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc);
    }

    public void zza(final zzbph com_google_android_gms_internal_zzbph, final zzb com_google_android_gms_internal_zzbpp_zzb) {
        if (this.zzcfH != null) {
            com_google_android_gms_internal_zzbpp_zzb.zzf(com_google_android_gms_internal_zzbph, this.zzcfH);
        } else {
            zza(new zza(this) {
                public void zza(zzbrq com_google_android_gms_internal_zzbrq, zzbpp com_google_android_gms_internal_zzbpp) {
                    com_google_android_gms_internal_zzbpp.zza(com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbrq), com_google_android_gms_internal_zzbpp_zzb);
                }
            });
        }
    }

    public void zza(zza com_google_android_gms_internal_zzbpp_zza) {
        if (this.zzcfI != null) {
            for (Entry entry : this.zzcfI.entrySet()) {
                com_google_android_gms_internal_zzbpp_zza.zza((zzbrq) entry.getKey(), (zzbpp) entry.getValue());
            }
        }
    }

    public void zzh(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            this.zzcfH = com_google_android_gms_internal_zzbsc;
            this.zzcfI = null;
        } else if (this.zzcfH != null) {
            this.zzcfH = this.zzcfH.zzl(com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbsc);
        } else {
            if (this.zzcfI == null) {
                this.zzcfI = new HashMap();
            }
            zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
            if (!this.zzcfI.containsKey(zzYR)) {
                this.zzcfI.put(zzYR, new zzbpp());
            }
            ((zzbpp) this.zzcfI.get(zzYR)).zzh(com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbsc);
        }
    }

    public boolean zzr(final zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            this.zzcfH = null;
            this.zzcfI = null;
            return true;
        } else if (this.zzcfH != null) {
            if (this.zzcfH.zzaaM()) {
                return false;
            }
            zzbrr com_google_android_gms_internal_zzbrr = (zzbrr) this.zzcfH;
            this.zzcfH = null;
            com_google_android_gms_internal_zzbrr.zza(new com.google.android.gms.internal.zzbrr.zza(this) {
                final /* synthetic */ zzbpp zzcfJ;

                public void zzb(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
                    this.zzcfJ.zzh(com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbrq), com_google_android_gms_internal_zzbsc);
                }
            });
            return zzr(com_google_android_gms_internal_zzbph);
        } else if (this.zzcfI == null) {
            return true;
        } else {
            zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
            zzbph zzYS = com_google_android_gms_internal_zzbph.zzYS();
            if (this.zzcfI.containsKey(zzYR) && ((zzbpp) this.zzcfI.get(zzYR)).zzr(zzYS)) {
                this.zzcfI.remove(zzYR);
            }
            if (!this.zzcfI.isEmpty()) {
                return false;
            }
            this.zzcfI = null;
            return true;
        }
    }
}
