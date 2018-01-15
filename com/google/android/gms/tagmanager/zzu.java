package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class zzu extends zzam {
    private static final String ID = zzah.FUNCTION_CALL.toString();
    private static final String zzbES = zzai.ADDITIONAL_PARAMS.toString();
    private static final String zzbFD = zzai.FUNCTION_CALL_NAME.toString();
    private final zza zzbFE;

    public interface zza {
        Object zze(String str, Map<String, Object> map);
    }

    public zzu(zza com_google_android_gms_tagmanager_zzu_zza) {
        super(ID, zzbFD);
        this.zzbFE = com_google_android_gms_tagmanager_zzu_zza;
    }

    public boolean zzQa() {
        return false;
    }

    public com.google.android.gms.internal.zzak.zza zzZ(Map<String, com.google.android.gms.internal.zzak.zza> map) {
        String zze = zzdl.zze((com.google.android.gms.internal.zzak.zza) map.get(zzbFD));
        Map hashMap = new HashMap();
        com.google.android.gms.internal.zzak.zza com_google_android_gms_internal_zzak_zza = (com.google.android.gms.internal.zzak.zza) map.get(zzbES);
        if (com_google_android_gms_internal_zzak_zza != null) {
            Object zzj = zzdl.zzj(com_google_android_gms_internal_zzak_zza);
            if (zzj instanceof Map) {
                for (Entry entry : ((Map) zzj).entrySet()) {
                    hashMap.put(entry.getKey().toString(), entry.getValue());
                }
            } else {
                zzbo.zzbh("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return zzdl.zzRQ();
            }
        }
        try {
            return zzdl.zzR(this.zzbFE.zze(zze, hashMap));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbo.zzbh(new StringBuilder((String.valueOf(zze).length() + 34) + String.valueOf(valueOf).length()).append("Custom macro/tag ").append(zze).append(" threw exception ").append(valueOf).toString());
            return zzdl.zzRQ();
        }
    }
}
