package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zze extends zzam {
    private static final String ID = zzah.ADWORDS_CLICK_REFERRER.toString();
    private static final String zzbEQ = zzai.COMPONENT.toString();
    private static final String zzbER = zzai.CONVERSION_ID.toString();
    private final Context zzqn;

    public zze(Context context) {
        super(ID, zzbER);
        this.zzqn = context;
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbER);
        if (com_google_android_gms_internal_zzak_zza == null) {
            return zzdl.zzRQ();
        }
        String zze = zzdl.zze(com_google_android_gms_internal_zzak_zza);
        com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbEQ);
        String zzr = zzbf.zzr(this.zzqn, zze, com_google_android_gms_internal_zzak_zza != null ? zzdl.zze(com_google_android_gms_internal_zzak_zza) : null);
        return zzr != null ? zzdl.zzR(zzr) : zzdl.zzRQ();
    }
}
