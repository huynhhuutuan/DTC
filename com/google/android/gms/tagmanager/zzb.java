package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzb extends zzam {
    private static final String ID = zzah.ADVERTISER_ID.toString();
    private final zza zzbEP;

    public zzb(Context context) {
        this(zza.zzbS(context));
    }

    zzb(zza com_google_android_gms_tagmanager_zza) {
        super(ID, new String[0]);
        this.zzbEP = com_google_android_gms_tagmanager_zza;
        this.zzbEP.zzPU();
    }

    public boolean zzQa() {
        return false;
    }

    public zza zzZ(Map<String, zza> map) {
        String zzPU = this.zzbEP.zzPU();
        return zzPU == null ? zzdl.zzRQ() : zzdl.zzR(zzPU);
    }
}
