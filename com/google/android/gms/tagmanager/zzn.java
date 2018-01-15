package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzn extends zzam {
    private static final String ID = zzah.CONSTANT.toString();
    private static final String VALUE = zzai.VALUE.toString();

    public zzn() {
        super(ID, VALUE);
    }

    public static String zzQc() {
        return ID;
    }

    public static String zzQd() {
        return VALUE;
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        return (zza) map.get(VALUE);
    }
}
