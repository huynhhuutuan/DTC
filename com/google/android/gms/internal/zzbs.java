package com.google.android.gms.internal;

import com.google.android.gms.internal.zzag.zza;
import java.lang.reflect.InvocationTargetException;

public class zzbs extends zzca {
    private static volatile String zzbb = null;
    private static final Object zzqS = new Object();

    public zzbs(zzbd com_google_android_gms_internal_zzbd, String str, String str2, zza com_google_android_gms_internal_zzag_zza, int i, int i2) {
        super(com_google_android_gms_internal_zzbd, str, str2, com_google_android_gms_internal_zzag_zza, i, i2);
    }

    protected void zzbd() throws IllegalAccessException, InvocationTargetException {
        this.zzqV.zzbb = "E";
        if (zzbb == null) {
            synchronized (zzqS) {
                if (zzbb == null) {
                    zzbb = (String) this.zzre.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzqV) {
            this.zzqV.zzbb = zzbb;
        }
    }
}
