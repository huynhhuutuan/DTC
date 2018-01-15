package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.zzac;

@zzme
public class zzpw {
    private Handler mHandler = null;
    private HandlerThread zzYy = null;
    private int zzYz = 0;
    private final Object zzrJ = new Object();

    class C06411 implements Runnable {
        final /* synthetic */ zzpw zzYA;

        C06411(zzpw com_google_android_gms_internal_zzpw) {
            this.zzYA = com_google_android_gms_internal_zzpw;
        }

        public void run() {
            synchronized (this.zzYA.zzrJ) {
                zzpk.m28v("Suspending the looper thread");
                while (this.zzYA.zzYz == 0) {
                    try {
                        this.zzYA.zzrJ.wait();
                        zzpk.m28v("Looper thread resumed");
                    } catch (InterruptedException e) {
                        zzpk.m28v("Looper thread interrupted.");
                    }
                }
            }
        }
    }

    public Looper zzlb() {
        Looper looper;
        synchronized (this.zzrJ) {
            if (this.zzYz != 0) {
                zzac.zzb(this.zzYy, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.zzYy == null) {
                zzpk.m28v("Starting the looper thread.");
                this.zzYy = new HandlerThread("LooperProvider");
                this.zzYy.start();
                this.mHandler = new Handler(this.zzYy.getLooper());
                zzpk.m28v("Looper thread started.");
            } else {
                zzpk.m28v("Resuming the looper thread");
                this.zzrJ.notifyAll();
            }
            this.zzYz++;
            looper = this.zzYy.getLooper();
        }
        return looper;
    }

    public void zzlc() {
        synchronized (this.zzrJ) {
            zzac.zzb(this.zzYz > 0, (Object) "Invalid state: release() called more times than expected.");
            int i = this.zzYz - 1;
            this.zzYz = i;
            if (i == 0) {
                this.mHandler.post(new C06411(this));
            }
        }
    }
}
