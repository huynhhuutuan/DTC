package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;

public class zzbsg {
    public static zzbsc zzabk() {
        return zzbrv.zzaaY();
    }

    public static zzbsc zzau(Object obj) {
        zzbsc zzat = zzbsd.zzat(obj);
        if (zzat instanceof zzbsa) {
            zzat = new zzbru(Double.valueOf((double) ((Long) zzat.getValue()).longValue()), zzabk());
        }
        if (zzq(zzat)) {
            return zzat;
        }
        throw new DatabaseException("Invalid Firebase Database priority (must be a string, double, ServerValue, or null)");
    }

    public static boolean zzq(zzbsc com_google_android_gms_internal_zzbsc) {
        return com_google_android_gms_internal_zzbsc.zzaaN().isEmpty() && (com_google_android_gms_internal_zzbsc.isEmpty() || (com_google_android_gms_internal_zzbsc instanceof zzbru) || (com_google_android_gms_internal_zzbsc instanceof zzbsi) || (com_google_android_gms_internal_zzbsc instanceof zzbrt));
    }
}
