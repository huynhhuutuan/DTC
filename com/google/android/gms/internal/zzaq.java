package com.google.android.gms.internal;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.gms.internal.zzaf.zza;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

public class zzaq {
    private static final ConditionVariable zzpA = new ConditionVariable();
    protected static volatile zzzk zzpB = null;
    private static volatile Random zzpD = null;
    protected volatile Boolean zzpC;
    private zzbd zzpz;

    class C04221 implements Runnable {
        final /* synthetic */ zzaq zzpE;

        C04221(zzaq com_google_android_gms_internal_zzaq) {
            this.zzpE = com_google_android_gms_internal_zzaq;
        }

        public void run() {
            if (this.zzpE.zzpC == null) {
                synchronized (zzaq.zzpA) {
                    if (this.zzpE.zzpC != null) {
                        return;
                    }
                    boolean booleanValue = ((Boolean) zzgd.zzDN.get()).booleanValue();
                    if (booleanValue) {
                        try {
                            zzaq.zzpB = new zzzk(this.zzpE.zzpz.getContext(), "ADSHIELD", null);
                        } catch (Throwable th) {
                            booleanValue = false;
                        }
                    }
                    this.zzpE.zzpC = Boolean.valueOf(booleanValue);
                    zzaq.zzpA.open();
                }
            }
        }
    }

    public zzaq(zzbd com_google_android_gms_internal_zzbd) {
        this.zzpz = com_google_android_gms_internal_zzbd;
        zza(com_google_android_gms_internal_zzbd.zzaI());
    }

    private static Random zzR() {
        if (zzpD == null) {
            synchronized (zzaq.class) {
                if (zzpD == null) {
                    zzpD = new Random();
                }
            }
        }
        return zzpD;
    }

    private void zza(Executor executor) {
        executor.execute(new C04221(this));
    }

    public int zzQ() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : zzR().nextInt();
        } catch (RuntimeException e) {
            return zzR().nextInt();
        }
    }

    public void zza(int i, int i2, long j) throws IOException {
        try {
            zzpA.block();
            if (this.zzpC.booleanValue() && zzpB != null && this.zzpz.zzaO()) {
                zzbxt com_google_android_gms_internal_zzaf_zza = new zza();
                com_google_android_gms_internal_zzaf_zza.zzaS = this.zzpz.getContext().getPackageName();
                com_google_android_gms_internal_zzaf_zza.zzaT = Long.valueOf(j);
                zzzk.zza zzm = zzpB.zzm(zzbxt.zzf(com_google_android_gms_internal_zzaf_zza));
                zzm.zzcr(i2);
                zzm.zzcq(i);
                zzm.zze(this.zzpz.zzaM());
            }
        } catch (Exception e) {
        }
    }
}
