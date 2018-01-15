package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzck extends zzam {
    private static final String ID = zzah.RANDOM.toString();
    private static final String zzbHp = zzai.MIN.toString();
    private static final String zzbHq = zzai.MAX.toString();

    public zzck() {
        super(ID, new String[0]);
    }

    public boolean zzQa() {
        return false;
    }

    public zza zzZ(Map<String, zza> map) {
        double doubleValue;
        double d;
        zza com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbHp);
        zza com_google_android_gms_internal_zzak_zza2 = (zza) map.get(zzbHq);
        if (!(com_google_android_gms_internal_zzak_zza == null || com_google_android_gms_internal_zzak_zza == zzdl.zzRQ() || com_google_android_gms_internal_zzak_zza2 == null || com_google_android_gms_internal_zzak_zza2 == zzdl.zzRQ())) {
            zzdk zzf = zzdl.zzf(com_google_android_gms_internal_zzak_zza);
            zzdk zzf2 = zzdl.zzf(com_google_android_gms_internal_zzak_zza2);
            if (!(zzf == zzdl.zzRO() || zzf2 == zzdl.zzRO())) {
                double doubleValue2 = zzf.doubleValue();
                doubleValue = zzf2.doubleValue();
                if (doubleValue2 <= doubleValue) {
                    d = doubleValue2;
                    return zzdl.zzR(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
                }
            }
        }
        doubleValue = 2.147483647E9d;
        d = 0.0d;
        return zzdl.zzR(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
    }
}
