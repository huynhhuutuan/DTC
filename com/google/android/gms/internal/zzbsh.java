package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class zzbsh {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzbsh.class.desiredAssertionStatus());
    private final zzbph zzcjL;
    private final zzbph zzcjM;
    private final zzbsc zzcjN;

    public zzbsh(zzbor com_google_android_gms_internal_zzbor) {
        zzbph com_google_android_gms_internal_zzbph = null;
        List zzXV = com_google_android_gms_internal_zzbor.zzXV();
        this.zzcjL = zzXV != null ? new zzbph(zzXV) : null;
        List zzXW = com_google_android_gms_internal_zzbor.zzXW();
        if (zzXW != null) {
            com_google_android_gms_internal_zzbph = new zzbph(zzXW);
        }
        this.zzcjM = com_google_android_gms_internal_zzbph;
        this.zzcjN = zzbsd.zzat(com_google_android_gms_internal_zzbor.zzXX());
    }

    private zzbsc zzb(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc2) {
        Object obj = 1;
        int zzj = this.zzcjL == null ? 1 : com_google_android_gms_internal_zzbph.zzj(this.zzcjL);
        int zzj2 = this.zzcjM == null ? -1 : com_google_android_gms_internal_zzbph.zzj(this.zzcjM);
        Object obj2 = (this.zzcjL == null || !com_google_android_gms_internal_zzbph.zzi(this.zzcjL)) ? null : 1;
        if (this.zzcjM == null || !com_google_android_gms_internal_zzbph.zzi(this.zzcjM)) {
            obj = null;
        }
        if (zzj > 0 && zzj2 < 0 && r1 == null) {
            return com_google_android_gms_internal_zzbsc2;
        }
        if (zzj > 0 && r1 != null && com_google_android_gms_internal_zzbsc2.zzaaM()) {
            return com_google_android_gms_internal_zzbsc2;
        }
        if (zzj <= 0 || zzj2 != 0) {
            if (obj2 != null || r1 != null) {
                Collection hashSet = new HashSet();
                for (zzbsb zzabi : com_google_android_gms_internal_zzbsc) {
                    hashSet.add(zzabi.zzabi());
                }
                for (zzbsb zzabi2 : com_google_android_gms_internal_zzbsc2) {
                    hashSet.add(zzabi2.zzabi());
                }
                List<zzbrq> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!(com_google_android_gms_internal_zzbsc2.zzaaN().isEmpty() && com_google_android_gms_internal_zzbsc.zzaaN().isEmpty())) {
                    arrayList.add(zzbrq.zzaaH());
                }
                zzbsc com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc;
                for (zzbrq com_google_android_gms_internal_zzbrq : arrayList) {
                    zzbsc zzm = com_google_android_gms_internal_zzbsc.zzm(com_google_android_gms_internal_zzbrq);
                    zzbsc zzb = zzb(com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbrq), com_google_android_gms_internal_zzbsc.zzm(com_google_android_gms_internal_zzbrq), com_google_android_gms_internal_zzbsc2.zzm(com_google_android_gms_internal_zzbrq));
                    com_google_android_gms_internal_zzbsc3 = zzb != zzm ? com_google_android_gms_internal_zzbsc3.zze(com_google_android_gms_internal_zzbrq, zzb) : com_google_android_gms_internal_zzbsc3;
                }
                return com_google_android_gms_internal_zzbsc3;
            } else if ($assertionsDisabled || zzj2 > 0 || zzj <= 0) {
                return com_google_android_gms_internal_zzbsc;
            } else {
                throw new AssertionError();
            }
        } else if (!$assertionsDisabled && r1 == null) {
            throw new AssertionError();
        } else if ($assertionsDisabled || !com_google_android_gms_internal_zzbsc2.zzaaM()) {
            return com_google_android_gms_internal_zzbsc.zzaaM() ? zzbrv.zzaaY() : com_google_android_gms_internal_zzbsc;
        } else {
            throw new AssertionError();
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzcjL);
        String valueOf2 = String.valueOf(this.zzcjM);
        String valueOf3 = String.valueOf(this.zzcjN);
        return new StringBuilder(((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("RangeMerge{optExclusiveStart=").append(valueOf).append(", optInclusiveEnd=").append(valueOf2).append(", snap=").append(valueOf3).append("}").toString();
    }

    public zzbsc zzr(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzb(zzbph.zzYO(), com_google_android_gms_internal_zzbsc, this.zzcjN);
    }
}
