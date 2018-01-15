package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzw extends zzam {
    private static final String ID = zzah.CUSTOM_VAR.toString();
    private static final String NAME = zzai.NAME.toString();
    private static final String zzbFO = zzai.DEFAULT_VALUE.toString();
    private final DataLayer zzbEZ;

    public zzw(DataLayer dataLayer) {
        super(ID, NAME);
        this.zzbEZ = dataLayer;
    }

    public boolean zzQa() {
        return false;
    }

    public zza zzZ(Map<String, zza> map) {
        Object obj = this.zzbEZ.get(zzdl.zze((zza) map.get(NAME)));
        if (obj != null) {
            return zzdl.zzR(obj);
        }
        zza com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbFO);
        return com_google_android_gms_internal_zzak_zza != null ? com_google_android_gms_internal_zzak_zza : zzdl.zzRQ();
    }
}
