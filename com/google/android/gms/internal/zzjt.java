package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.internal.zzkc.zza;

@zzme
public final class zzjt extends zza {
    private zzjv.zza zzKU;
    private zzjs zzKV;
    private final Object zzrJ = new Object();

    public void onAdClicked() {
        synchronized (this.zzrJ) {
            if (this.zzKV != null) {
                this.zzKV.zzbP();
            }
        }
    }

    public void onAdClosed() {
        synchronized (this.zzrJ) {
            if (this.zzKV != null) {
                this.zzKV.zzbQ();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.zzrJ) {
            if (this.zzKU != null) {
                this.zzKU.zzF(i == 3 ? 1 : 2);
                this.zzKU = null;
            }
        }
    }

    public void onAdImpression() {
        synchronized (this.zzrJ) {
            if (this.zzKV != null) {
                this.zzKV.zzbU();
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.zzrJ) {
            if (this.zzKV != null) {
                this.zzKV.zzbR();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdLoaded() {
        /*
        r3 = this;
        r1 = r3.zzrJ;
        monitor-enter(r1);
        r0 = r3.zzKU;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.zzKU;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.zzF(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.zzKU = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.zzKV;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.zzKV;	 Catch:{ all -> 0x001d }
        r0.zzbT();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjt.onAdLoaded():void");
    }

    public void onAdOpened() {
        synchronized (this.zzrJ) {
            if (this.zzKV != null) {
                this.zzKV.zzbS();
            }
        }
    }

    public void zza(@Nullable zzjs com_google_android_gms_internal_zzjs) {
        synchronized (this.zzrJ) {
            this.zzKV = com_google_android_gms_internal_zzjs;
        }
    }

    public void zza(zzjv.zza com_google_android_gms_internal_zzjv_zza) {
        synchronized (this.zzrJ) {
            this.zzKU = com_google_android_gms_internal_zzjv_zza;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zza(com.google.android.gms.internal.zzkd r4) {
        /*
        r3 = this;
        r1 = r3.zzrJ;
        monitor-enter(r1);
        r0 = r3.zzKU;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.zzKU;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.zza(r2, r4);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.zzKU = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.zzKV;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.zzKV;	 Catch:{ all -> 0x001d }
        r0.zzbT();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjt.zza(com.google.android.gms.internal.zzkd):void");
    }
}
