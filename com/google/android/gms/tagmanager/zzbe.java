package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzbe extends zzam {
    private static final String ID = zzah.INSTALL_REFERRER.toString();
    private static final String zzbEQ = zzai.COMPONENT.toString();
    private final Context zzqn;

    public zzbe(Context context) {
        super(ID, new String[0]);
        this.zzqn = context;
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        String zzN = zzbf.zzN(this.zzqn, ((zza) map.get(zzbEQ)) != null ? zzdl.zze((zza) map.get(zzbEQ)) : null);
        return zzN != null ? zzdl.zzR(zzN) : zzdl.zzRQ();
    }
}
