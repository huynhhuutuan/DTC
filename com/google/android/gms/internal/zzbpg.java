package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbop.zza;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

enum zzbpg implements zzbpi {
    INSTANCE;

    public zzbop zza(zzbpa com_google_android_gms_internal_zzbpa, zzbol com_google_android_gms_internal_zzbol, zzbon com_google_android_gms_internal_zzbon, zza com_google_android_gms_internal_zzbop_zza) {
        return new zzboq(com_google_android_gms_internal_zzbpa.zzYx(), com_google_android_gms_internal_zzbon, com_google_android_gms_internal_zzbop_zza);
    }

    public zzbow zza(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    public zzbpe zza(zzbpa com_google_android_gms_internal_zzbpa) {
        return new zzbpu(Executors.defaultThreadFactory(), zzbpt.zzcgp);
    }

    public zzbql zza(zzbpa com_google_android_gms_internal_zzbpa, String str) {
        return null;
    }

    public zzbro zza(zzbpa com_google_android_gms_internal_zzbpa, zzbro.zza com_google_android_gms_internal_zzbro_zza, List<String> list) {
        return new zzbrm(com_google_android_gms_internal_zzbro_zza, list);
    }

    public zzbpm zzb(zzbpa com_google_android_gms_internal_zzbpa) {
        final zzbrn zziV = com_google_android_gms_internal_zzbpa.zziV("RunLoop");
        return new zzbsy(this) {
            public void zzj(Throwable th) {
                zziV.zzd(zzbsy.zzl(th), th);
            }
        };
    }

    public String zzc(zzbpa com_google_android_gms_internal_zzbpa) {
        String property = System.getProperty("java.vm.name", "Unknown JVM");
        String property2 = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder((String.valueOf(property2).length() + 1) + String.valueOf(property).length()).append(property2).append("/").append(property).toString();
    }
}
