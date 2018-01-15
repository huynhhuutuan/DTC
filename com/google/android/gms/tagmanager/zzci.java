package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;
import java.util.Set;

public abstract class zzci extends zzam {
    private static final String zzbGj = zzai.ARG0.toString();
    private static final String zzbHg = zzai.ARG1.toString();

    public zzci(String str) {
        super(str, zzbGj, zzbHg);
    }

    public /* bridge */ /* synthetic */ String zzQK() {
        return super.zzQK();
    }

    public /* bridge */ /* synthetic */ Set zzQL() {
        return super.zzQL();
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        for (zza com_google_android_gms_internal_zzak_zza : map.values()) {
            if (com_google_android_gms_internal_zzak_zza == zzdl.zzRQ()) {
                return zzdl.zzR(Boolean.valueOf(false));
            }
        }
        zza com_google_android_gms_internal_zzak_zza2 = (zza) map.get(zzbGj);
        zza com_google_android_gms_internal_zzak_zza3 = (zza) map.get(zzbHg);
        boolean zza = (com_google_android_gms_internal_zzak_zza2 == null || com_google_android_gms_internal_zzak_zza3 == null) ? false : zza(com_google_android_gms_internal_zzak_zza2, com_google_android_gms_internal_zzak_zza3, map);
        return zzdl.zzR(Boolean.valueOf(zza));
    }

    protected abstract boolean zza(zza com_google_android_gms_internal_zzak_zza, zza com_google_android_gms_internal_zzak_zza2, Map<String, zza> map);
}
