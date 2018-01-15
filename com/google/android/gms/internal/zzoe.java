package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzpb.zza;

@zzme
public class zzoe extends zzpj implements zzog, zzoj {
    private final Context mContext;
    private final String zzKW;
    private final zza zzPR;
    private int zzPY = 3;
    private final zzol zzVr;
    private final zzoj zzVs;
    private final String zzVt;
    private final zzjq zzVu;
    private final long zzVv;
    private int zzVw = 0;
    private zzof zzVx;
    private final Object zzrJ;

    public zzoe(Context context, String str, String str2, zzjq com_google_android_gms_internal_zzjq, zza com_google_android_gms_internal_zzpb_zza, zzol com_google_android_gms_internal_zzol, zzoj com_google_android_gms_internal_zzoj, long j) {
        this.mContext = context;
        this.zzKW = str;
        this.zzVt = str2;
        this.zzVu = com_google_android_gms_internal_zzjq;
        this.zzPR = com_google_android_gms_internal_zzpb_zza;
        this.zzVr = com_google_android_gms_internal_zzol;
        this.zzrJ = new Object();
        this.zzVs = com_google_android_gms_internal_zzoj;
        this.zzVv = j;
    }

    private void zza(zzec com_google_android_gms_internal_zzec, zzkb com_google_android_gms_internal_zzkb) {
        this.zzVr.zzjO().zza((zzoj) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzKW)) {
                com_google_android_gms_internal_zzkb.zza(com_google_android_gms_internal_zzec, this.zzVt, this.zzVu.zzKn);
            } else {
                com_google_android_gms_internal_zzkb.zzd(com_google_android_gms_internal_zzec, this.zzVt);
            }
        } catch (Throwable e) {
            zzqf.zzc("Fail to load ad from adapter.", e);
            zza(this.zzKW, 0);
        }
    }

    private void zzk(long j) {
        while (true) {
            synchronized (this.zzrJ) {
                if (this.zzVw != 0) {
                    break;
                } else if (!zzf(j)) {
                    this.zzVx = new zzof.zza().zzae(this.zzPY).zzl(zzw.zzcS().elapsedRealtime() - j).zzaP(this.zzKW).zzaQ(this.zzVu.zzKq).zzjK();
                    return;
                }
            }
        }
        this.zzVx = new zzof.zza().zzl(zzw.zzcS().elapsedRealtime() - j).zzae(1 == this.zzVw ? 6 : this.zzPY).zzaP(this.zzKW).zzaQ(this.zzVu.zzKq).zzjK();
    }

    public void onStop() {
    }

    public void zza(String str, int i) {
        synchronized (this.zzrJ) {
            this.zzVw = 2;
            this.zzPY = i;
            this.zzrJ.notify();
        }
    }

    public void zzaO(String str) {
        synchronized (this.zzrJ) {
            this.zzVw = 1;
            this.zzrJ.notify();
        }
    }

    public void zzad(int i) {
        zza(this.zzKW, 0);
    }

    public void zzco() {
        if (this.zzVr != null && this.zzVr.zzjO() != null && this.zzVr.zzjN() != null) {
            final zzoi zzjO = this.zzVr.zzjO();
            zzjO.zza(null);
            zzjO.zza((zzog) this);
            final zzec com_google_android_gms_internal_zzec = this.zzPR.zzTi.zzRy;
            final zzkb zzjN = this.zzVr.zzjN();
            try {
                if (zzjN.isInitialized()) {
                    zzqe.zzYP.post(new Runnable(this) {
                        final /* synthetic */ zzoe zzVz;

                        public void run() {
                            this.zzVz.zza(com_google_android_gms_internal_zzec, zzjN);
                        }
                    });
                } else {
                    zzqe.zzYP.post(new Runnable(this) {
                        final /* synthetic */ zzoe zzVz;

                        public void run() {
                            try {
                                zzjN.zza(zzd.zzA(this.zzVz.mContext), com_google_android_gms_internal_zzec, null, zzjO, this.zzVz.zzVt);
                            } catch (Throwable e) {
                                Throwable th = e;
                                String str = "Fail to initialize adapter ";
                                String valueOf = String.valueOf(this.zzVz.zzKW);
                                zzqf.zzc(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
                                this.zzVz.zza(this.zzVz.zzKW, 0);
                            }
                        }
                    });
                }
            } catch (Throwable e) {
                zzqf.zzc("Fail to check if adapter is initialized.", e);
                zza(this.zzKW, 0);
            }
            zzk(zzw.zzcS().elapsedRealtime());
            zzjO.zza(null);
            zzjO.zza(null);
            if (this.zzVw == 1) {
                this.zzVs.zzaO(this.zzKW);
            } else {
                this.zzVs.zza(this.zzKW, this.zzPY);
            }
        }
    }

    protected boolean zzf(long j) {
        long elapsedRealtime = this.zzVv - (zzw.zzcS().elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            this.zzPY = 4;
            return false;
        }
        try {
            this.zzrJ.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.zzPY = 5;
            return false;
        }
    }

    public zzof zzjH() {
        zzof com_google_android_gms_internal_zzof;
        synchronized (this.zzrJ) {
            com_google_android_gms_internal_zzof = this.zzVx;
        }
        return com_google_android_gms_internal_zzof;
    }

    public zzjq zzjI() {
        return this.zzVu;
    }

    public void zzjJ() {
        zza(this.zzPR.zzTi.zzRy, this.zzVr.zzjN());
    }
}
