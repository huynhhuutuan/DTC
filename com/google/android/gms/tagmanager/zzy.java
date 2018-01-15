package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.List;
import java.util.Map;

class zzy extends zzdj {
    private static final String ID = zzah.DATA_LAYER_WRITE.toString();
    private static final String VALUE = zzai.VALUE.toString();
    private static final String zzbFZ = zzai.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final DataLayer zzbEZ;

    public zzy(DataLayer dataLayer) {
        super(ID, VALUE);
        this.zzbEZ = dataLayer;
    }

    private void zza(zza com_google_android_gms_internal_zzak_zza) {
        if (com_google_android_gms_internal_zzak_zza != null && com_google_android_gms_internal_zzak_zza != zzdl.zzRK()) {
            String zze = zzdl.zze(com_google_android_gms_internal_zzak_zza);
            if (zze != zzdl.zzRP()) {
                this.zzbEZ.zzha(zze);
            }
        }
    }

    private void zzb(zza com_google_android_gms_internal_zzak_zza) {
        if (com_google_android_gms_internal_zzak_zza != null && com_google_android_gms_internal_zzak_zza != zzdl.zzRK()) {
            Object zzj = zzdl.zzj(com_google_android_gms_internal_zzak_zza);
            if (zzj instanceof List) {
                for (Object zzj2 : (List) zzj2) {
                    if (zzj2 instanceof Map) {
                        this.zzbEZ.push((Map) zzj2);
                    }
                }
            }
        }
    }

    public void zzab(Map<String, zza> map) {
        zzb((zza) map.get(VALUE));
        zza((zza) map.get(zzbFZ));
    }
}
