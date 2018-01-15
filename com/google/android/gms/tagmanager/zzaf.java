package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzaf extends zzam {
    private static final String ID = zzah.ENCODE.toString();
    private static final String zzbGj = zzai.ARG0.toString();
    private static final String zzbGk = zzai.NO_PADDING.toString();
    private static final String zzbGl = zzai.INPUT_FORMAT.toString();
    private static final String zzbGm = zzai.OUTPUT_FORMAT.toString();

    public zzaf() {
        super(ID, zzbGj);
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGj);
        if (com_google_android_gms_internal_zzak_zza == null || com_google_android_gms_internal_zzak_zza == zzdl.zzRQ()) {
            return zzdl.zzRQ();
        }
        String zze = zzdl.zze(com_google_android_gms_internal_zzak_zza);
        com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGl);
        if (com_google_android_gms_internal_zzak_zza == null) {
            Object obj = "text";
        } else {
            String zze2 = zzdl.zze(com_google_android_gms_internal_zzak_zza);
        }
        com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGm);
        if (com_google_android_gms_internal_zzak_zza == null) {
            Object obj2 = "base16";
        } else {
            String zze3 = zzdl.zze(com_google_android_gms_internal_zzak_zza);
        }
        int i = 2;
        com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGk);
        if (com_google_android_gms_internal_zzak_zza != null && zzdl.zzi(com_google_android_gms_internal_zzak_zza).booleanValue()) {
            i = 3;
        }
        try {
            byte[] bytes;
            String valueOf;
            Object zzq;
            if ("text".equals(obj)) {
                bytes = zze.getBytes();
            } else if ("base16".equals(obj)) {
                bytes = zzk.zzgR(zze);
            } else if ("base64".equals(obj)) {
                bytes = Base64.decode(zze, i);
            } else if ("base64url".equals(obj)) {
                bytes = Base64.decode(zze, i | 8);
            } else {
                zze3 = "Encode: unknown input format: ";
                valueOf = String.valueOf(obj);
                zzbo.m11e(valueOf.length() != 0 ? zze3.concat(valueOf) : new String(zze3));
                return zzdl.zzRQ();
            }
            if ("base16".equals(obj2)) {
                zzq = zzk.zzq(bytes);
            } else if ("base64".equals(obj2)) {
                zzq = Base64.encodeToString(bytes, i);
            } else if ("base64url".equals(obj2)) {
                zzq = Base64.encodeToString(bytes, i | 8);
            } else {
                zze2 = "Encode: unknown output format: ";
                valueOf = String.valueOf(obj2);
                zzbo.m11e(valueOf.length() != 0 ? zze2.concat(valueOf) : new String(zze2));
                return zzdl.zzRQ();
            }
            return zzdl.zzR(zzq);
        } catch (IllegalArgumentException e) {
            zzbo.m11e("Encode: invalid input:");
            return zzdl.zzRQ();
        }
    }
}
