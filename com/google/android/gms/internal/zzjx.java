package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@zzme
public class zzjx implements zzjp {
    private final Context mContext;
    private final zzjr zzKY;
    private final boolean zzLa;
    private final zzmk zzLo;
    private final long zzLp;
    private final long zzLq;
    private final int zzLr;
    private boolean zzLs = false;
    private final Map<zzqm<zzjv>, zzju> zzLt = new HashMap();
    private List<zzjv> zzLu = new ArrayList();
    private final Object zzrJ = new Object();
    private final zzka zzsz;
    private final boolean zzwf;

    public zzjx(Context context, zzmk com_google_android_gms_internal_zzmk, zzka com_google_android_gms_internal_zzka, zzjr com_google_android_gms_internal_zzjr, boolean z, boolean z2, long j, long j2, int i) {
        this.mContext = context;
        this.zzLo = com_google_android_gms_internal_zzmk;
        this.zzsz = com_google_android_gms_internal_zzka;
        this.zzKY = com_google_android_gms_internal_zzjr;
        this.zzwf = z;
        this.zzLa = z2;
        this.zzLp = j;
        this.zzLq = j2;
        this.zzLr = i;
    }

    private void zza(final zzqm<zzjv> com_google_android_gms_internal_zzqm_com_google_android_gms_internal_zzjv) {
        zzpo.zzXC.post(new Runnable(this) {
            final /* synthetic */ zzjx zzLw;

            public void run() {
                for (zzqm com_google_android_gms_internal_zzqm : this.zzLw.zzLt.keySet()) {
                    if (com_google_android_gms_internal_zzqm != com_google_android_gms_internal_zzqm_com_google_android_gms_internal_zzjv) {
                        ((zzju) this.zzLw.zzLt.get(com_google_android_gms_internal_zzqm)).cancel();
                    }
                }
            }
        });
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.gms.internal.zzjv zze(java.util.List<com.google.android.gms.internal.zzqm<com.google.android.gms.internal.zzjv>> r5) {
        /*
        r4 = this;
        r2 = r4.zzrJ;
        monitor-enter(r2);
        r0 = r4.zzLs;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r1 = new com.google.android.gms.internal.zzjv;	 Catch:{ all -> 0x003c }
        r0 = -1;
        r1.<init>(r0);	 Catch:{ all -> 0x003c }
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
    L_0x000e:
        return r1;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        r2 = r5.iterator();
    L_0x0014:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x003f;
    L_0x001a:
        r0 = r2.next();
        r0 = (com.google.android.gms.internal.zzqm) r0;
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r1 = (com.google.android.gms.internal.zzjv) r1;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r3 = r4.zzLu;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        r3.add(r1);	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        if (r1 == 0) goto L_0x0014;
    L_0x002d:
        r3 = r1.zzLh;	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        if (r3 != 0) goto L_0x0014;
    L_0x0031:
        r4.zza(r0);	 Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
        goto L_0x000e;
    L_0x0035:
        r0 = move-exception;
    L_0x0036:
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.zzqf.zzc(r1, r0);
        goto L_0x0014;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = 0;
        r4.zza(r0);
        r1 = new com.google.android.gms.internal.zzjv;
        r0 = 1;
        r1.<init>(r0);
        goto L_0x000e;
    L_0x004a:
        r0 = move-exception;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjx.zze(java.util.List):com.google.android.gms.internal.zzjv");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.android.gms.internal.zzjv zzf(java.util.List<com.google.android.gms.internal.zzqm<com.google.android.gms.internal.zzjv>> r16) {
        /*
        r15 = this;
        r1 = r15.zzrJ;
        monitor-enter(r1);
        r0 = r15.zzLs;	 Catch:{ all -> 0x0080 }
        if (r0 == 0) goto L_0x000f;
    L_0x0007:
        r2 = new com.google.android.gms.internal.zzjv;	 Catch:{ all -> 0x0080 }
        r0 = -1;
        r2.<init>(r0);	 Catch:{ all -> 0x0080 }
        monitor-exit(r1);	 Catch:{ all -> 0x0080 }
    L_0x000e:
        return r2;
    L_0x000f:
        monitor-exit(r1);	 Catch:{ all -> 0x0080 }
        r4 = -1;
        r3 = 0;
        r2 = 0;
        r0 = r15.zzKY;
        r0 = r0.zzKP;
        r6 = -1;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0083;
    L_0x001d:
        r0 = r15.zzKY;
        r0 = r0.zzKP;
    L_0x0021:
        r8 = r16.iterator();
        r6 = r0;
    L_0x0026:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x00b9;
    L_0x002c:
        r0 = r8.next();
        r0 = (com.google.android.gms.internal.zzqm) r0;
        r1 = com.google.android.gms.ads.internal.zzw.zzcS();
        r10 = r1.currentTimeMillis();
        r12 = 0;
        r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x0086;
    L_0x0040:
        r1 = r0.isDone();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r1 == 0) goto L_0x0086;
    L_0x0046:
        r1 = r0.get();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r1 = (com.google.android.gms.internal.zzjv) r1;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
    L_0x004c:
        r5 = r15.zzLu;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r5.add(r1);	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r1 == 0) goto L_0x00cc;
    L_0x0053:
        r5 = r1.zzLh;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r5 != 0) goto L_0x00cc;
    L_0x0057:
        r5 = r1.zzLm;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r5 == 0) goto L_0x00cc;
    L_0x005b:
        r9 = r5.zzha();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        if (r9 <= r4) goto L_0x00cc;
    L_0x0061:
        r2 = r5.zzha();	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r14 = r1;
        r1 = r0;
        r0 = r14;
    L_0x0068:
        r3 = com.google.android.gms.ads.internal.zzw.zzcS();
        r4 = r3.currentTimeMillis();
        r4 = r4 - r10;
        r4 = r6 - r4;
        r6 = 0;
        r4 = java.lang.Math.max(r4, r6);
        r3 = r1;
        r14 = r0;
        r0 = r4;
        r4 = r2;
        r2 = r14;
    L_0x007e:
        r6 = r0;
        goto L_0x0026;
    L_0x0080:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0080 }
        throw r0;
    L_0x0083:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        goto L_0x0021;
    L_0x0086:
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r1 = r0.get(r6, r1);	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        r1 = (com.google.android.gms.internal.zzjv) r1;	 Catch:{ InterruptedException -> 0x00c6, ExecutionException -> 0x00c8, RemoteException -> 0x008f, TimeoutException -> 0x00ca }
        goto L_0x004c;
    L_0x008f:
        r0 = move-exception;
    L_0x0090:
        r1 = "Exception while processing an adapter; continuing with other adapters";
        com.google.android.gms.internal.zzqf.zzc(r1, r0);	 Catch:{ all -> 0x00a7 }
        r0 = com.google.android.gms.ads.internal.zzw.zzcS();
        r0 = r0.currentTimeMillis();
        r0 = r0 - r10;
        r0 = r6 - r0;
        r6 = 0;
        r0 = java.lang.Math.max(r0, r6);
        goto L_0x007e;
    L_0x00a7:
        r0 = move-exception;
        r1 = com.google.android.gms.ads.internal.zzw.zzcS();
        r2 = r1.currentTimeMillis();
        r2 = r2 - r10;
        r2 = r6 - r2;
        r4 = 0;
        java.lang.Math.max(r2, r4);
        throw r0;
    L_0x00b9:
        r15.zza(r3);
        if (r2 != 0) goto L_0x000e;
    L_0x00be:
        r2 = new com.google.android.gms.internal.zzjv;
        r0 = 1;
        r2.<init>(r0);
        goto L_0x000e;
    L_0x00c6:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00c8:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00ca:
        r0 = move-exception;
        goto L_0x0090;
    L_0x00cc:
        r0 = r2;
        r1 = r3;
        r2 = r4;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjx.zzf(java.util.List):com.google.android.gms.internal.zzjv");
    }

    public void cancel() {
        synchronized (this.zzrJ) {
            this.zzLs = true;
            for (zzju cancel : this.zzLt.values()) {
                cancel.cancel();
            }
        }
    }

    public zzjv zzd(List<zzjq> list) {
        zzqf.zzbf("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        List arrayList = new ArrayList();
        for (zzjq com_google_android_gms_internal_zzjq : list) {
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(com_google_android_gms_internal_zzjq.zzKo);
            zzqf.zzbg(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            for (String com_google_android_gms_internal_zzju : com_google_android_gms_internal_zzjq.zzKp) {
                final zzju com_google_android_gms_internal_zzju2 = new zzju(this.mContext, com_google_android_gms_internal_zzju, this.zzsz, this.zzKY, com_google_android_gms_internal_zzjq, this.zzLo.zzRy, this.zzLo.zzvr, this.zzLo.zzvn, this.zzwf, this.zzLa, this.zzLo.zzvF, this.zzLo.zzvK);
                zzqm zza = zzpn.zza(newCachedThreadPool, new Callable<zzjv>(this) {
                    final /* synthetic */ zzjx zzLw;

                    public /* synthetic */ Object call() throws Exception {
                        return zzhb();
                    }

                    public zzjv zzhb() throws Exception {
                        synchronized (this.zzLw.zzrJ) {
                            if (this.zzLw.zzLs) {
                                return null;
                            }
                            return com_google_android_gms_internal_zzju2.zza(this.zzLw.zzLp, this.zzLw.zzLq);
                        }
                    }
                });
                this.zzLt.put(zza, com_google_android_gms_internal_zzju2);
                arrayList.add(zza);
            }
        }
        switch (this.zzLr) {
            case 2:
                return zzf(arrayList);
            default:
                return zze(arrayList);
        }
    }

    public List<zzjv> zzgU() {
        return this.zzLu;
    }
}
