package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzcm extends zzam {
    private static final String ID = zzah.REGEX_GROUP.toString();
    private static final String zzbHr = zzai.ARG0.toString();
    private static final String zzbHs = zzai.ARG1.toString();
    private static final String zzbHt = zzai.IGNORE_CASE.toString();
    private static final String zzbHu = zzai.GROUP.toString();

    public zzcm() {
        super(ID, zzbHr, zzbHs);
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbHr);
        zza com_google_android_gms_internal_zzak_zza2 = (zza) map.get(zzbHs);
        if (com_google_android_gms_internal_zzak_zza == null || com_google_android_gms_internal_zzak_zza == zzdl.zzRQ() || com_google_android_gms_internal_zzak_zza2 == null || com_google_android_gms_internal_zzak_zza2 == zzdl.zzRQ()) {
            return zzdl.zzRQ();
        }
        int intValue;
        int i = 64;
        if (zzdl.zzi((zza) map.get(zzbHt)).booleanValue()) {
            i = 66;
        }
        zza com_google_android_gms_internal_zzak_zza3 = (zza) map.get(zzbHu);
        if (com_google_android_gms_internal_zzak_zza3 != null) {
            Long zzg = zzdl.zzg(com_google_android_gms_internal_zzak_zza3);
            if (zzg == zzdl.zzRL()) {
                return zzdl.zzRQ();
            }
            intValue = zzg.intValue();
            if (intValue < 0) {
                return zzdl.zzRQ();
            }
        }
        intValue = 1;
        try {
            CharSequence zze = zzdl.zze(com_google_android_gms_internal_zzak_zza);
            Object obj = null;
            Matcher matcher = Pattern.compile(zzdl.zze(com_google_android_gms_internal_zzak_zza2), i).matcher(zze);
            if (matcher.find() && matcher.groupCount() >= intValue) {
                obj = matcher.group(intValue);
            }
            return obj == null ? zzdl.zzRQ() : zzdl.zzR(obj);
        } catch (PatternSyntaxException e) {
            return zzdl.zzRQ();
        }
    }
}
