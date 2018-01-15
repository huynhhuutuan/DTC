package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbrj.zza;
import java.util.Iterator;

public class zzbrk implements zzbrj {
    private final zzbrh zzciK;
    private final zzbsb zzciL;
    private final zzbsb zzciM;
    private final zzbrw zzcie;

    public zzbrk(zzbrb com_google_android_gms_internal_zzbrb) {
        this.zzciK = new zzbrh(com_google_android_gms_internal_zzbrb.zzaai());
        this.zzcie = com_google_android_gms_internal_zzbrb.zzaai();
        this.zzciL = zzd(com_google_android_gms_internal_zzbrb);
        this.zzciM = zze(com_google_android_gms_internal_zzbrb);
    }

    private static zzbsb zzd(zzbrb com_google_android_gms_internal_zzbrb) {
        if (!com_google_android_gms_internal_zzbrb.zzaaa()) {
            return com_google_android_gms_internal_zzbrb.zzaai().zzaaZ();
        }
        return com_google_android_gms_internal_zzbrb.zzaai().zzg(com_google_android_gms_internal_zzbrb.zzaac(), com_google_android_gms_internal_zzbrb.zzaab());
    }

    private static zzbsb zze(zzbrb com_google_android_gms_internal_zzbrb) {
        if (!com_google_android_gms_internal_zzbrb.zzaad()) {
            return com_google_android_gms_internal_zzbrb.zzaai().zzaba();
        }
        return com_google_android_gms_internal_zzbrb.zzaai().zzg(com_google_android_gms_internal_zzbrb.zzaaf(), com_google_android_gms_internal_zzbrb.zzaae());
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc, zzbph com_google_android_gms_internal_zzbph, zza com_google_android_gms_internal_zzbrj_zza, zzbrg com_google_android_gms_internal_zzbrg) {
        return this.zzciK.zza(com_google_android_gms_internal_zzbrx, com_google_android_gms_internal_zzbrq, !zza(new zzbsb(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc)) ? zzbrv.zzaaY() : com_google_android_gms_internal_zzbsc, com_google_android_gms_internal_zzbph, com_google_android_gms_internal_zzbrj_zza, com_google_android_gms_internal_zzbrg);
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbrx com_google_android_gms_internal_zzbrx2, zzbrg com_google_android_gms_internal_zzbrg) {
        zzbrx zza;
        if (com_google_android_gms_internal_zzbrx2.zzWH().zzaaM()) {
            zza = zzbrx.zza(zzbrv.zzaaY(), this.zzcie);
        } else {
            zzbrx zzo = com_google_android_gms_internal_zzbrx2.zzo(zzbsg.zzabk());
            Iterator it = com_google_android_gms_internal_zzbrx2.iterator();
            zza = zzo;
            while (it.hasNext()) {
                zzbsb com_google_android_gms_internal_zzbsb = (zzbsb) it.next();
                zza = !zza(com_google_android_gms_internal_zzbsb) ? zza.zzh(com_google_android_gms_internal_zzbsb.zzabi(), zzbrv.zzaaY()) : zza;
            }
        }
        return this.zzciK.zza(com_google_android_gms_internal_zzbrx, zza, com_google_android_gms_internal_zzbrg);
    }

    public zzbrx zza(zzbrx com_google_android_gms_internal_zzbrx, zzbsc com_google_android_gms_internal_zzbsc) {
        return com_google_android_gms_internal_zzbrx;
    }

    public boolean zza(zzbsb com_google_android_gms_internal_zzbsb) {
        return this.zzcie.compare(zzaaA(), com_google_android_gms_internal_zzbsb) <= 0 && this.zzcie.compare(com_google_android_gms_internal_zzbsb, zzaaB()) <= 0;
    }

    public zzbsb zzaaA() {
        return this.zzciL;
    }

    public zzbsb zzaaB() {
        return this.zzciM;
    }

    public zzbrw zzaai() {
        return this.zzcie;
    }

    public zzbrj zzaay() {
        return this.zzciK;
    }

    public boolean zzaaz() {
        return true;
    }
}
