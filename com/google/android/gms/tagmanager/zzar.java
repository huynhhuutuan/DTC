package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class zzar extends zzam {
    private static final String ID = zzah.HASH.toString();
    private static final String zzbGj = zzai.ARG0.toString();
    private static final String zzbGl = zzai.INPUT_FORMAT.toString();
    private static final String zzbGp = zzai.ALGORITHM.toString();

    public zzar() {
        super(ID, zzbGj);
    }

    private byte[] zzf(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        zza com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGj);
        if (com_google_android_gms_internal_zzak_zza == null || com_google_android_gms_internal_zzak_zza == zzdl.zzRQ()) {
            return zzdl.zzRQ();
        }
        byte[] bytes;
        String zze = zzdl.zze(com_google_android_gms_internal_zzak_zza);
        com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGp);
        String zze2 = com_google_android_gms_internal_zzak_zza == null ? CommonUtils.MD5_INSTANCE : zzdl.zze(com_google_android_gms_internal_zzak_zza);
        com_google_android_gms_internal_zzak_zza = (zza) map.get(zzbGl);
        Object zze3 = com_google_android_gms_internal_zzak_zza == null ? "text" : zzdl.zze(com_google_android_gms_internal_zzak_zza);
        if ("text".equals(zze3)) {
            bytes = zze.getBytes();
        } else if ("base16".equals(zze3)) {
            bytes = zzk.zzgR(zze);
        } else {
            zze2 = "Hash: unknown input format: ";
            String valueOf = String.valueOf(zze3);
            zzbo.m11e(valueOf.length() != 0 ? zze2.concat(valueOf) : new String(zze2));
            return zzdl.zzRQ();
        }
        try {
            return zzdl.zzR(zzk.zzq(zzf(zze2, bytes)));
        } catch (NoSuchAlgorithmException e) {
            zze = "Hash: unknown algorithm: ";
            valueOf = String.valueOf(zze2);
            zzbo.m11e(valueOf.length() != 0 ? zze.concat(valueOf) : new String(zze));
            return zzdl.zzRQ();
        }
    }
}
