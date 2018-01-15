package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzcn extends zzdg {
    private static final String ID = zzah.REGEX.toString();
    private static final String zzbHt = zzai.IGNORE_CASE.toString();

    public zzcn() {
        super(ID);
    }

    protected boolean zza(String str, String str2, Map<String, zza> map) {
        try {
            return Pattern.compile(str2, zzdl.zzi((zza) map.get(zzbHt)).booleanValue() ? 66 : 64).matcher(str).find();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
