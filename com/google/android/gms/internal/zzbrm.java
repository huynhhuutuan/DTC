package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbro.zza;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zzbrm implements zzbro {
    private final Set<String> zzciN;
    private final zza zzciO;

    public zzbrm(zza com_google_android_gms_internal_zzbro_zza, List<String> list) {
        if (list != null) {
            this.zzciN = new HashSet(list);
        } else {
            this.zzciN = null;
        }
        this.zzciO = com_google_android_gms_internal_zzbro_zza;
    }

    public zza zzYd() {
        return this.zzciO;
    }

    protected String zza(zza com_google_android_gms_internal_zzbro_zza, String str, String str2, long j) {
        String valueOf = String.valueOf(new Date(j).toString());
        String valueOf2 = String.valueOf(com_google_android_gms_internal_zzbro_zza);
        return new StringBuilder((((String.valueOf(valueOf).length() + 6) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(" [").append(valueOf2).append("] ").append(str).append(": ").append(str2).toString();
    }

    protected boolean zza(zza com_google_android_gms_internal_zzbro_zza, String str) {
        return com_google_android_gms_internal_zzbro_zza.ordinal() >= this.zzciO.ordinal() && (this.zzciN == null || com_google_android_gms_internal_zzbro_zza.ordinal() > zza.DEBUG.ordinal() || this.zzciN.contains(str));
    }

    protected void zzau(String str, String str2) {
        System.err.println(str2);
    }

    protected void zzav(String str, String str2) {
        System.out.println(str2);
    }

    protected void zzaw(String str, String str2) {
        System.out.println(str2);
    }

    protected void zzax(String str, String str2) {
        System.out.println(str2);
    }

    public void zzb(zza com_google_android_gms_internal_zzbro_zza, String str, String str2, long j) {
        if (zza(com_google_android_gms_internal_zzbro_zza, str)) {
            String zza = zza(com_google_android_gms_internal_zzbro_zza, str, str2, j);
            switch (com_google_android_gms_internal_zzbro_zza) {
                case ERROR:
                    zzau(str, zza);
                    return;
                case WARN:
                    zzav(str, zza);
                    return;
                case INFO:
                    zzaw(str, zza);
                    return;
                case DEBUG:
                    zzax(str, zza);
                    return;
                default:
                    throw new RuntimeException("Should not reach here!");
            }
        }
    }
}
