package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzf.zzc;
import com.google.android.gms.internal.zzdd.zzb;

@zzme
public class zzdo {
    @Nullable
    private Context mContext;
    private final Object zzrJ = new Object();
    private final Runnable zzyG = new C05371(this);
    @Nullable
    private zzdr zzyH;
    @Nullable
    private zzdv zzyI;

    class C05371 implements Runnable {
        final /* synthetic */ zzdo zzyJ;

        C05371(zzdo com_google_android_gms_internal_zzdo) {
            this.zzyJ = com_google_android_gms_internal_zzdo;
        }

        public void run() {
            this.zzyJ.disconnect();
        }
    }

    class C10242 implements zzb {
        final /* synthetic */ zzdo zzyJ;

        C10242(zzdo com_google_android_gms_internal_zzdo) {
            this.zzyJ = com_google_android_gms_internal_zzdo;
        }

        public void zzk(boolean z) {
            if (z) {
                this.zzyJ.connect();
            } else {
                this.zzyJ.disconnect();
            }
        }
    }

    class C10253 implements zzf.zzb {
        final /* synthetic */ zzdo zzyJ;

        C10253(zzdo com_google_android_gms_internal_zzdo) {
            this.zzyJ = com_google_android_gms_internal_zzdo;
        }

        public void onConnected(@Nullable Bundle bundle) {
            synchronized (this.zzyJ.zzrJ) {
                try {
                    this.zzyJ.zzyI = this.zzyJ.zzyH.zzeB();
                } catch (Throwable e) {
                    zzqf.zzb("Unable to obtain a cache service instance.", e);
                    this.zzyJ.disconnect();
                }
                this.zzyJ.zzrJ.notifyAll();
            }
        }

        public void onConnectionSuspended(int i) {
            synchronized (this.zzyJ.zzrJ) {
                this.zzyJ.zzyI = null;
                this.zzyJ.zzrJ.notifyAll();
            }
        }
    }

    class C10264 implements zzc {
        final /* synthetic */ zzdo zzyJ;

        C10264(zzdo com_google_android_gms_internal_zzdo) {
            this.zzyJ = com_google_android_gms_internal_zzdo;
        }

        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            synchronized (this.zzyJ.zzrJ) {
                this.zzyJ.zzyI = null;
                if (this.zzyJ.zzyH != null) {
                    this.zzyJ.zzyH = null;
                    zzw.zzdc().zzlc();
                }
                this.zzyJ.zzrJ.notifyAll();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void connect() {
        /*
        r3 = this;
        r1 = r3.zzrJ;
        monitor-enter(r1);
        r0 = r3.mContext;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.zzyH;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = new com.google.android.gms.internal.zzdo$3;	 Catch:{ all -> 0x0024 }
        r0.<init>(r3);	 Catch:{ all -> 0x0024 }
        r2 = new com.google.android.gms.internal.zzdo$4;	 Catch:{ all -> 0x0024 }
        r2.<init>(r3);	 Catch:{ all -> 0x0024 }
        r0 = r3.zza(r0, r2);	 Catch:{ all -> 0x0024 }
        r3.zzyH = r0;	 Catch:{ all -> 0x0024 }
        r0 = r3.zzyH;	 Catch:{ all -> 0x0024 }
        r0.zzxz();	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        goto L_0x000c;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdo.connect():void");
    }

    private void disconnect() {
        synchronized (this.zzrJ) {
            if (this.zzyH == null) {
                return;
            }
            if (this.zzyH.isConnected() || this.zzyH.isConnecting()) {
                this.zzyH.disconnect();
            }
            this.zzyH = null;
            this.zzyI = null;
            Binder.flushPendingCommands();
            zzw.zzdc().zzlc();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initialize(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = r2.zzrJ;
        monitor-enter(r1);
        r0 = r2.mContext;	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x000c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        throw r0;
    L_0x000f:
        r0 = r3.getApplicationContext();	 Catch:{ all -> 0x000c }
        r2.mContext = r0;	 Catch:{ all -> 0x000c }
        r0 = com.google.android.gms.internal.zzgd.zzFf;	 Catch:{ all -> 0x000c }
        r0 = r0.get();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r2.connect();	 Catch:{ all -> 0x000c }
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x0028:
        r0 = com.google.android.gms.internal.zzgd.zzFe;	 Catch:{ all -> 0x000c }
        r0 = r0.get();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0026;
    L_0x0036:
        r0 = new com.google.android.gms.internal.zzdo$2;	 Catch:{ all -> 0x000c }
        r0.<init>(r2);	 Catch:{ all -> 0x000c }
        r2.zza(r0);	 Catch:{ all -> 0x000c }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdo.initialize(android.content.Context):void");
    }

    public zzdp zza(zzds com_google_android_gms_internal_zzds) {
        zzdp com_google_android_gms_internal_zzdp;
        synchronized (this.zzrJ) {
            if (this.zzyI == null) {
                com_google_android_gms_internal_zzdp = new zzdp();
            } else {
                try {
                    com_google_android_gms_internal_zzdp = this.zzyI.zza(com_google_android_gms_internal_zzds);
                } catch (Throwable e) {
                    zzqf.zzb("Unable to call into cache service.", e);
                    com_google_android_gms_internal_zzdp = new zzdp();
                }
            }
        }
        return com_google_android_gms_internal_zzdp;
    }

    protected zzdr zza(zzf.zzb com_google_android_gms_common_internal_zzf_zzb, zzc com_google_android_gms_common_internal_zzf_zzc) {
        return new zzdr(this.mContext, zzw.zzdc().zzlb(), com_google_android_gms_common_internal_zzf_zzb, com_google_android_gms_common_internal_zzf_zzc);
    }

    protected void zza(zzb com_google_android_gms_internal_zzdd_zzb) {
        zzw.zzcP().zza(com_google_android_gms_internal_zzdd_zzb);
    }

    public void zzev() {
        if (((Boolean) zzgd.zzFg.get()).booleanValue()) {
            synchronized (this.zzrJ) {
                connect();
                zzw.zzcM();
                zzpo.zzXC.removeCallbacks(this.zzyG);
                zzw.zzcM();
                zzpo.zzXC.postDelayed(this.zzyG, ((Long) zzgd.zzFh.get()).longValue());
            }
        }
    }
}
