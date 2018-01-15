package com.google.android.gms.internal;

import com.google.android.gms.internal.zzag.zza;
import java.lang.reflect.InvocationTargetException;

public class zzbj extends zzca {
    private static volatile String zzqR = null;
    private static final Object zzqS = new Object();

    public zzbj(zzbd com_google_android_gms_internal_zzbd, String str, String str2, zza com_google_android_gms_internal_zzag_zza, int i, int i2) {
        super(com_google_android_gms_internal_zzbd, str, str2, com_google_android_gms_internal_zzag_zza, i, i2);
    }

    protected void zzbd() throws IllegalAccessException, InvocationTargetException {
        this.zzqV.zzbw = "E";
        if (zzqR == null) {
            synchronized (zzqS) {
                if (zzqR == null) {
                    zzqR = (String) this.zzre.invoke(null, new Object[]{this.zzpz.getContext()});
                }
            }
        }
        synchronized (this.zzqV) {
            this.zzqV.zzbw = zzam.zza(zzqR.getBytes(), true);
        }
    }
}
