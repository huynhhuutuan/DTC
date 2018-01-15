package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.zzh;
import com.google.android.gms.common.internal.zzac;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzry extends zzsa {
    private final zzsi zzadG;

    class C06645 implements Runnable {
        final /* synthetic */ zzry zzadI;

        C06645(zzry com_google_android_gms_internal_zzry) {
            this.zzadI = com_google_android_gms_internal_zzry;
        }

        public void run() {
            this.zzadI.zzadG.zznK();
        }
    }

    class C06667 implements Callable<Void> {
        final /* synthetic */ zzry zzadI;

        C06667(zzry com_google_android_gms_internal_zzry) {
            this.zzadI = com_google_android_gms_internal_zzry;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzbk();
        }

        public Void zzbk() throws Exception {
            this.zzadI.zzadG.zzoG();
            return null;
        }
    }

    public zzry(zzsc com_google_android_gms_internal_zzsc, zzsd com_google_android_gms_internal_zzsd) {
        super(com_google_android_gms_internal_zzsc);
        zzac.zzw(com_google_android_gms_internal_zzsd);
        this.zzadG = com_google_android_gms_internal_zzsd.zzj(com_google_android_gms_internal_zzsc);
    }

    void onServiceConnected() {
        zzmR();
        this.zzadG.onServiceConnected();
    }

    public void setLocalDispatchPeriod(final int i) {
        zzob();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zznU().zzg(new Runnable(this) {
            final /* synthetic */ zzry zzadI;

            public void run() {
                this.zzadI.zzadG.zzx(((long) i) * 1000);
            }
        });
    }

    public void start() {
        this.zzadG.start();
    }

    public void zzW(final boolean z) {
        zza("Network connectivity status changed", Boolean.valueOf(z));
        zznU().zzg(new Runnable(this) {
            final /* synthetic */ zzry zzadI;

            public void run() {
                this.zzadI.zzadG.zzW(z);
            }
        });
    }

    public long zza(zzse com_google_android_gms_internal_zzse) {
        zzob();
        zzac.zzw(com_google_android_gms_internal_zzse);
        zzmR();
        long zza = this.zzadG.zza(com_google_android_gms_internal_zzse, true);
        if (zza == 0) {
            this.zzadG.zzc(com_google_android_gms_internal_zzse);
        }
        return zza;
    }

    public void zza(final zzsu com_google_android_gms_internal_zzsu) {
        zzob();
        zznU().zzg(new Runnable(this) {
            final /* synthetic */ zzry zzadI;

            public void run() {
                this.zzadI.zzadG.zzb(com_google_android_gms_internal_zzsu);
            }
        });
    }

    public void zza(final zzsz com_google_android_gms_internal_zzsz) {
        zzac.zzw(com_google_android_gms_internal_zzsz);
        zzob();
        zzb("Hit delivery requested", com_google_android_gms_internal_zzsz);
        zznU().zzg(new Runnable(this) {
            final /* synthetic */ zzry zzadI;

            public void run() {
                this.zzadI.zzadG.zza(com_google_android_gms_internal_zzsz);
            }
        });
    }

    public void zza(final String str, final Runnable runnable) {
        zzac.zzh(str, "campaign param can't be empty");
        zznU().zzg(new Runnable(this) {
            final /* synthetic */ zzry zzadI;

            public void run() {
                this.zzadI.zzadG.zzbX(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    protected void zzmS() {
        this.zzadG.initialize();
    }

    public void zznK() {
        zzob();
        zznU().zzg(new C06645(this));
    }

    public void zznL() {
        zzob();
        Context context = getContext();
        if (zzth.zzak(context) && zzti.zzal(context)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            context.startService(intent);
            return;
        }
        zza(null);
    }

    public boolean zznM() {
        zzob();
        try {
            zznU().zzc(new C06667(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzd("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zze("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzd("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    public void zznN() {
        zzob();
        zzh.zzmR();
        this.zzadG.zznN();
    }

    public void zznO() {
        zzbP("Radio powered up");
        zznL();
    }

    void zznP() {
        zzmR();
        this.zzadG.zznP();
    }
}
