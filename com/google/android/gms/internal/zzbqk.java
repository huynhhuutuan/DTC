package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzbqk implements zzbql {
    private boolean zzcaK = false;

    private void zzWR() {
        zzbte.zzb(this.zzcaK, "Transaction expected to already be in progress.");
    }

    public List<zzbpv> zzWN() {
        return Collections.emptyList();
    }

    public void zzWQ() {
        zzWR();
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy, long j) {
        zzWR();
    }

    public void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, long j) {
        zzWR();
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, zzbsc com_google_android_gms_internal_zzbsc) {
        zzWR();
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, Set<zzbrq> set) {
        zzWR();
    }

    public void zza(zzbrc com_google_android_gms_internal_zzbrc, Set<zzbrq> set, Set<zzbrq> set2) {
        zzWR();
    }

    public void zzaD(long j) {
        zzWR();
    }

    public void zzc(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        zzWR();
    }

    public void zzd(zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        zzWR();
    }

    public zzbqu zzf(zzbrc com_google_android_gms_internal_zzbrc) {
        return new zzbqu(zzbrx.zza(zzbrv.zzaaY(), com_google_android_gms_internal_zzbrc.zzaai()), false, false);
    }

    public <T> T zzf(Callable<T> callable) {
        zzbte.zzb(!this.zzcaK, "runInTransaction called when an existing transaction is already in progress.");
        this.zzcaK = true;
        try {
            T call = callable.call();
            this.zzcaK = false;
            return call;
        } catch (Throwable th) {
            this.zzcaK = false;
        }
    }

    public void zzg(zzbrc com_google_android_gms_internal_zzbrc) {
        zzWR();
    }

    public void zzh(zzbrc com_google_android_gms_internal_zzbrc) {
        zzWR();
    }

    public void zzi(zzbrc com_google_android_gms_internal_zzbrc) {
        zzWR();
    }

    public void zzk(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        zzWR();
    }
}
