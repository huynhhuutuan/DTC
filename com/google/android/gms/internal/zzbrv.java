package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbsc.zza;
import java.util.Collections;
import java.util.Iterator;

public class zzbrv extends zzbrr implements zzbsc {
    private static final zzbrv zzcjs = new zzbrv();

    private zzbrv() {
    }

    public static zzbrv zzaaY() {
        return zzcjs;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzh((zzbsc) obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzbrv) {
            return true;
        }
        boolean z = (obj instanceof zzbsc) && ((zzbsc) obj).isEmpty() && zzaaN().equals(((zzbsc) obj).zzaaN());
        return z;
    }

    public int getChildCount() {
        return 0;
    }

    public Object getValue() {
        return null;
    }

    public Object getValue(boolean z) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator<zzbsb> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        return "<Empty Node>";
    }

    public zzbsc zzO(zzbph com_google_android_gms_internal_zzbph) {
        return this;
    }

    public Iterator<zzbsb> zzWU() {
        return Collections.emptyList().iterator();
    }

    public String zza(zza com_google_android_gms_internal_zzbsc_zza) {
        return "";
    }

    public String zzaaL() {
        return "";
    }

    public boolean zzaaM() {
        return false;
    }

    public zzbsc zzaaN() {
        return this;
    }

    public zzbsc zze(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return (com_google_android_gms_internal_zzbsc.isEmpty() || com_google_android_gms_internal_zzbrq.zzaaJ()) ? this : new zzbrr().zze(com_google_android_gms_internal_zzbrq, com_google_android_gms_internal_zzbsc);
    }

    public /* synthetic */ zzbsc zzg(zzbsc com_google_android_gms_internal_zzbsc) {
        return zzl(com_google_android_gms_internal_zzbsc);
    }

    public int zzh(zzbsc com_google_android_gms_internal_zzbsc) {
        return com_google_android_gms_internal_zzbsc.isEmpty() ? 0 : -1;
    }

    public boolean zzk(zzbrq com_google_android_gms_internal_zzbrq) {
        return false;
    }

    public zzbrq zzl(zzbrq com_google_android_gms_internal_zzbrq) {
        return null;
    }

    public zzbrv zzl(zzbsc com_google_android_gms_internal_zzbsc) {
        return this;
    }

    public zzbsc zzl(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return com_google_android_gms_internal_zzbsc;
        }
        zzbrq zzYR = com_google_android_gms_internal_zzbph.zzYR();
        return zze(zzYR, zzm(zzYR).zzl(com_google_android_gms_internal_zzbph.zzYS(), com_google_android_gms_internal_zzbsc));
    }

    public zzbsc zzm(zzbrq com_google_android_gms_internal_zzbrq) {
        return this;
    }
}
