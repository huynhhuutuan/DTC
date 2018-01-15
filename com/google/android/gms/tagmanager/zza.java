package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzi;

public class zza {
    private static Object zzbEM = new Object();
    private static zza zzbEN;
    private volatile boolean mClosed;
    private final Context mContext;
    private final Thread zzXh;
    private volatile Info zzadB;
    private volatile long zzbEG;
    private volatile long zzbEH;
    private volatile long zzbEI;
    private volatile long zzbEJ;
    private final Object zzbEK;
    private zza zzbEL;
    private final zze zzuP;

    class C06952 implements Runnable {
        final /* synthetic */ zza zzbEO;

        C06952(zza com_google_android_gms_tagmanager_zza) {
            this.zzbEO = com_google_android_gms_tagmanager_zza;
        }

        public void run() {
            this.zzbEO.zzPY();
        }
    }

    public interface zza {
        Info zzPZ();
    }

    class C11351 implements zza {
        final /* synthetic */ zza zzbEO;

        C11351(zza com_google_android_gms_tagmanager_zza) {
            this.zzbEO = com_google_android_gms_tagmanager_zza;
        }

        public Info zzPZ() {
            Info info = null;
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzbEO.mContext);
            } catch (Throwable e) {
                zzbo.zzc("IllegalStateException getting Advertising Id Info", e);
            } catch (Throwable e2) {
                zzbo.zzc("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            } catch (Throwable e22) {
                zzbo.zzc("IOException getting Ad Id Info", e22);
            } catch (Throwable e222) {
                zzbo.zzc("GooglePlayServicesNotAvailableException getting Advertising Id Info", e222);
            } catch (Throwable e2222) {
                zzbo.zzc("Unknown exception. Could not get the Advertising Id Info.", e2222);
            }
            return info;
        }
    }

    private zza(Context context) {
        this(context, null, zzi.zzzc());
    }

    public zza(Context context, zza com_google_android_gms_tagmanager_zza_zza, zze com_google_android_gms_common_util_zze) {
        this.zzbEG = 900000;
        this.zzbEH = 30000;
        this.mClosed = false;
        this.zzbEK = new Object();
        this.zzbEL = new C11351(this);
        this.zzuP = com_google_android_gms_common_util_zze;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
        if (com_google_android_gms_tagmanager_zza_zza != null) {
            this.zzbEL = com_google_android_gms_tagmanager_zza_zza;
        }
        this.zzbEI = this.zzuP.currentTimeMillis();
        this.zzXh = new Thread(new C06952(this));
    }

    private void zzPV() {
        synchronized (this) {
            try {
                zzPW();
                wait(500);
            } catch (InterruptedException e) {
            }
        }
    }

    private void zzPW() {
        if (this.zzuP.currentTimeMillis() - this.zzbEI > this.zzbEH) {
            synchronized (this.zzbEK) {
                this.zzbEK.notify();
            }
            this.zzbEI = this.zzuP.currentTimeMillis();
        }
    }

    private void zzPX() {
        if (this.zzuP.currentTimeMillis() - this.zzbEJ > 3600000) {
            this.zzadB = null;
        }
    }

    private void zzPY() {
        Process.setThreadPriority(10);
        while (true) {
            boolean z = this.mClosed;
            Info zzPZ = this.zzbEL.zzPZ();
            if (zzPZ != null) {
                this.zzadB = zzPZ;
                this.zzbEJ = this.zzuP.currentTimeMillis();
                zzbo.zzbg("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (this) {
                notifyAll();
            }
            try {
                synchronized (this.zzbEK) {
                    this.zzbEK.wait(this.zzbEG);
                }
            } catch (InterruptedException e) {
                zzbo.zzbg("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    public static zza zzbS(Context context) {
        if (zzbEN == null) {
            synchronized (zzbEM) {
                if (zzbEN == null) {
                    zzbEN = new zza(context);
                    zzbEN.start();
                }
            }
        }
        return zzbEN;
    }

    public boolean isLimitAdTrackingEnabled() {
        if (this.zzadB == null) {
            zzPV();
        } else {
            zzPW();
        }
        zzPX();
        return this.zzadB == null ? true : this.zzadB.isLimitAdTrackingEnabled();
    }

    public void start() {
        this.zzXh.start();
    }

    public String zzPU() {
        if (this.zzadB == null) {
            zzPV();
        } else {
            zzPW();
        }
        zzPX();
        return this.zzadB == null ? null : this.zzadB.getId();
    }
}
