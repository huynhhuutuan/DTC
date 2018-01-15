package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzak extends zzam {
    private static final String ID = zzah.EVENT.toString();
    private final zzcx zzbFa;

    public zzak(zzcx com_google_android_gms_tagmanager_zzcx) {
        super(ID, new String[0]);
        this.zzbFa = com_google_android_gms_tagmanager_zzcx;
    }

    public boolean zzQa() {
        return false;
    }

    public zza zzZ(Map<String, zza> map) {
        String zzRn = this.zzbFa.zzRn();
        return zzRn == null ? zzdl.zzRQ() : zzdl.zzR(zzRn);
    }
}
