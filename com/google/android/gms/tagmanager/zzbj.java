package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class zzbj extends zzam {
    private static final String ID = zzah.LANGUAGE.toString();

    public zzbj() {
        super(ID, new String[0]);
    }

    public /* bridge */ /* synthetic */ String zzQK() {
        return super.zzQK();
    }

    public /* bridge */ /* synthetic */ Set zzQL() {
        return super.zzQL();
    }

    public boolean zzQa() {
        return false;
    }

    public zza zzZ(Map<String, zza> map) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return zzdl.zzRQ();
        }
        String language = locale.getLanguage();
        return language == null ? zzdl.zzRQ() : zzdl.zzR(language.toLowerCase());
    }
}
