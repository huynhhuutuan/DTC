package com.google.android.gms.internal;

import com.google.android.gms.internal.zzag.zza;
import java.lang.reflect.InvocationTargetException;

public class zzbx extends zzca {
    public zzbx(zzbd com_google_android_gms_internal_zzbd, String str, String str2, zza com_google_android_gms_internal_zzag_zza, int i, int i2) {
        super(com_google_android_gms_internal_zzbd, str, str2, com_google_android_gms_internal_zzag_zza, i, i2);
    }

    protected void zzbd() throws IllegalAccessException, InvocationTargetException {
        this.zzqV.zzbK = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.zzre.invoke(null, new Object[]{this.zzpz.getApplicationContext()})).booleanValue();
        synchronized (this.zzqV) {
            if (booleanValue) {
                this.zzqV.zzbK = Integer.valueOf(1);
            } else {
                this.zzqV.zzbK = Integer.valueOf(0);
            }
        }
    }
}
