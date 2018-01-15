package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaj.zzj;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class zzcu implements zze {
    private boolean mClosed;
    private final Context mContext;
    private final String zzbEY;
    private String zzbFw;
    private final ScheduledExecutorService zzbHA;
    private final zza zzbHB;
    private ScheduledFuture<?> zzbHC;
    private zzbn<zzj> zzbHx;
    private zzt zzbHy;

    interface zza {
        zzct zza(zzt com_google_android_gms_tagmanager_zzt);
    }

    interface zzb {
        ScheduledExecutorService zzRk();
    }

    class C11361 implements zzb {
        C11361(zzcu com_google_android_gms_tagmanager_zzcu) {
        }

        public ScheduledExecutorService zzRk() {
            return Executors.newSingleThreadScheduledExecutor();
        }
    }

    class C11372 implements zza {
        final /* synthetic */ zzcu zzbHD;

        C11372(zzcu com_google_android_gms_tagmanager_zzcu) {
            this.zzbHD = com_google_android_gms_tagmanager_zzcu;
        }

        public zzct zza(zzt com_google_android_gms_tagmanager_zzt) {
            return new zzct(this.zzbHD.mContext, this.zzbHD.zzbEY, com_google_android_gms_tagmanager_zzt);
        }
    }

    public zzcu(Context context, String str, zzt com_google_android_gms_tagmanager_zzt) {
        this(context, str, com_google_android_gms_tagmanager_zzt, null, null);
    }

    zzcu(Context context, String str, zzt com_google_android_gms_tagmanager_zzt, zzb com_google_android_gms_tagmanager_zzcu_zzb, zza com_google_android_gms_tagmanager_zzcu_zza) {
        this.zzbHy = com_google_android_gms_tagmanager_zzt;
        this.mContext = context;
        this.zzbEY = str;
        if (com_google_android_gms_tagmanager_zzcu_zzb == null) {
            com_google_android_gms_tagmanager_zzcu_zzb = new C11361(this);
        }
        this.zzbHA = com_google_android_gms_tagmanager_zzcu_zzb.zzRk();
        if (com_google_android_gms_tagmanager_zzcu_zza == null) {
            this.zzbHB = new C11372(this);
        } else {
            this.zzbHB = com_google_android_gms_tagmanager_zzcu_zza;
        }
    }

    private synchronized void zzRj() {
        if (this.mClosed) {
            throw new IllegalStateException("called method after closed");
        }
    }

    private zzct zzhp(String str) {
        zzct zza = this.zzbHB.zza(this.zzbHy);
        zza.zza(this.zzbHx);
        zza.zzgZ(this.zzbFw);
        zza.zzho(str);
        return zza;
    }

    public synchronized void release() {
        zzRj();
        if (this.zzbHC != null) {
            this.zzbHC.cancel(false);
        }
        this.zzbHA.shutdown();
        this.mClosed = true;
    }

    public synchronized void zza(zzbn<zzj> com_google_android_gms_tagmanager_zzbn_com_google_android_gms_internal_zzaj_zzj) {
        zzRj();
        this.zzbHx = com_google_android_gms_tagmanager_zzbn_com_google_android_gms_internal_zzaj_zzj;
    }

    public synchronized void zzf(long j, String str) {
        String str2 = this.zzbEY;
        zzbo.m12v(new StringBuilder(String.valueOf(str2).length() + 55).append("loadAfterDelay: containerId=").append(str2).append(" delay=").append(j).toString());
        zzRj();
        if (this.zzbHx == null) {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        if (this.zzbHC != null) {
            this.zzbHC.cancel(false);
        }
        this.zzbHC = this.zzbHA.schedule(zzhp(str), j, TimeUnit.MILLISECONDS);
    }

    public synchronized void zzgZ(String str) {
        zzRj();
        this.zzbFw = str;
    }
}
