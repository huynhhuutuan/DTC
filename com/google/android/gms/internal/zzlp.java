package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

@zzme
public abstract class zzlp extends zzpj {
    protected final Context mContext;
    protected final com.google.android.gms.internal.zzlq.zza zzPQ;
    protected final com.google.android.gms.internal.zzpb.zza zzPR;
    protected zzmn zzPS;
    protected final Object zzPU = new Object();
    protected final Object zzrJ = new Object();

    class C05921 implements Runnable {
        final /* synthetic */ zzlp zzPX;

        C05921(zzlp com_google_android_gms_internal_zzlp) {
            this.zzPX = com_google_android_gms_internal_zzlp;
        }

        public void run() {
            this.zzPX.onStop();
        }
    }

    protected static final class zza extends Exception {
        private final int zzPY;

        public zza(String str, int i) {
            super(str);
            this.zzPY = i;
        }

        public int getErrorCode() {
            return this.zzPY;
        }
    }

    protected zzlp(Context context, com.google.android.gms.internal.zzpb.zza com_google_android_gms_internal_zzpb_zza, com.google.android.gms.internal.zzlq.zza com_google_android_gms_internal_zzlq_zza) {
        super(true);
        this.mContext = context;
        this.zzPR = com_google_android_gms_internal_zzpb_zza;
        this.zzPS = com_google_android_gms_internal_zzpb_zza.zzWm;
        this.zzPQ = com_google_android_gms_internal_zzlq_zza;
    }

    public void onStop() {
    }

    protected abstract zzpb zzR(int i);

    public void zzco() {
        int errorCode;
        synchronized (this.zzrJ) {
            zzqf.zzbf("AdRendererBackgroundTask started.");
            int i = this.zzPR.errorCode;
            try {
                zzh(SystemClock.elapsedRealtime());
            } catch (zza e) {
                errorCode = e.getErrorCode();
                if (errorCode == 3 || errorCode == -1) {
                    zzqf.zzbg(e.getMessage());
                } else {
                    zzqf.zzbh(e.getMessage());
                }
                if (this.zzPS == null) {
                    this.zzPS = new zzmn(errorCode);
                } else {
                    this.zzPS = new zzmn(errorCode, this.zzPS.zzKL);
                }
                zzpo.zzXC.post(new C05921(this));
                i = errorCode;
            }
            final zzpb zzR = zzR(i);
            zzpo.zzXC.post(new Runnable(this) {
                final /* synthetic */ zzlp zzPX;

                public void run() {
                    synchronized (this.zzPX.zzrJ) {
                        this.zzPX.zzn(zzR);
                    }
                }
            });
        }
    }

    protected abstract void zzh(long j) throws zza;

    protected void zzn(zzpb com_google_android_gms_internal_zzpb) {
        this.zzPQ.zzb(com_google_android_gms_internal_zzpb);
    }
}
