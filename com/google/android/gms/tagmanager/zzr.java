package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzr extends zzam {
    private static final String ID = zzah.CONTAINER_VERSION.toString();
    private final String zzavB;

    public zzr(String str) {
        super(ID, new String[0]);
        this.zzavB = str;
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        return this.zzavB == null ? zzdl.zzRQ() : zzdl.zzR(this.zzavB);
    }
}
