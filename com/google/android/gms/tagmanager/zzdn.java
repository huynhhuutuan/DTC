package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzdn extends zzam {
    private static final String ID = zzah.UPPERCASE_STRING.toString();
    private static final String zzbGj = zzai.ARG0.toString();

    public zzdn() {
        super(ID, zzbGj);
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        return zzdl.zzR(zzdl.zze((zza) map.get(zzbGj)).toUpperCase());
    }
}
