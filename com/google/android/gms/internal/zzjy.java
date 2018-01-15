package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@zzme
public class zzjy implements zzjp {
    private final Context mContext;
    private final zzjr zzKY;
    private final boolean zzLa;
    private final zzmk zzLo;
    private final long zzLp;
    private final long zzLq;
    private boolean zzLs = false;
    private List<zzjv> zzLu = new ArrayList();
    private zzju zzLy;
    private final Object zzrJ = new Object();
    private final zzgl zzsn;
    private final zzka zzsz;
    private final boolean zzwf;

    public zzjy(Context context, zzmk com_google_android_gms_internal_zzmk, zzka com_google_android_gms_internal_zzka, zzjr com_google_android_gms_internal_zzjr, boolean z, boolean z2, long j, long j2, zzgl com_google_android_gms_internal_zzgl) {
        this.mContext = context;
        this.zzLo = com_google_android_gms_internal_zzmk;
        this.zzsz = com_google_android_gms_internal_zzka;
        this.zzKY = com_google_android_gms_internal_zzjr;
        this.zzwf = z;
        this.zzLa = z2;
        this.zzLp = j;
        this.zzLq = j2;
        this.zzsn = com_google_android_gms_internal_zzgl;
    }

    public void cancel() {
        synchronized (this.zzrJ) {
            this.zzLs = true;
            if (this.zzLy != null) {
                this.zzLy.cancel();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.zzjv zzd(java.util.List<com.google.android.gms.internal.zzjq> r22) {
        /*
        r21 = this;
        r2 = "Starting mediation.";
        com.google.android.gms.internal.zzqf.zzbf(r2);
        r15 = new java.util.ArrayList;
        r15.<init>();
        r0 = r21;
        r2 = r0.zzsn;
        r16 = r2.zzfB();
        r17 = r22.iterator();
    L_0x0016:
        r2 = r17.hasNext();
        if (r2 == 0) goto L_0x0133;
    L_0x001c:
        r7 = r17.next();
        r7 = (com.google.android.gms.internal.zzjq) r7;
        r3 = "Trying mediation network: ";
        r2 = r7.zzKo;
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x0066;
    L_0x0030:
        r2 = r3.concat(r2);
    L_0x0034:
        com.google.android.gms.internal.zzqf.zzbg(r2);
        r2 = r7.zzKp;
        r18 = r2.iterator();
    L_0x003d:
        r2 = r18.hasNext();
        if (r2 == 0) goto L_0x0016;
    L_0x0043:
        r4 = r18.next();
        r4 = (java.lang.String) r4;
        r0 = r21;
        r2 = r0.zzsn;
        r19 = r2.zzfB();
        r0 = r21;
        r0 = r0.zzrJ;
        r20 = r0;
        monitor-enter(r20);
        r0 = r21;
        r2 = r0.zzLs;	 Catch:{ all -> 0x010a }
        if (r2 == 0) goto L_0x006c;
    L_0x005e:
        r2 = new com.google.android.gms.internal.zzjv;	 Catch:{ all -> 0x010a }
        r3 = -1;
        r2.<init>(r3);	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
    L_0x0065:
        return r2;
    L_0x0066:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x0034;
    L_0x006c:
        r2 = new com.google.android.gms.internal.zzju;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r3 = r0.mContext;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r5 = r0.zzsz;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r6 = r0.zzKY;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r8 = r0.zzLo;	 Catch:{ all -> 0x010a }
        r8 = r8.zzRy;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r9 = r0.zzLo;	 Catch:{ all -> 0x010a }
        r9 = r9.zzvr;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r10 = r0.zzLo;	 Catch:{ all -> 0x010a }
        r10 = r10.zzvn;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r11 = r0.zzwf;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r12 = r0.zzLa;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r13 = r0.zzLo;	 Catch:{ all -> 0x010a }
        r13 = r13.zzvF;	 Catch:{ all -> 0x010a }
        r0 = r21;
        r14 = r0.zzLo;	 Catch:{ all -> 0x010a }
        r14 = r14.zzvK;	 Catch:{ all -> 0x010a }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r0.zzLy = r2;	 Catch:{ all -> 0x010a }
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        r0 = r21;
        r2 = r0.zzLy;
        r0 = r21;
        r8 = r0.zzLp;
        r0 = r21;
        r10 = r0.zzLq;
        r2 = r2.zza(r8, r10);
        r0 = r21;
        r3 = r0.zzLu;
        r3.add(r2);
        r3 = r2.zzLh;
        if (r3 != 0) goto L_0x010d;
    L_0x00c3:
        r3 = "Adapter succeeded.";
        com.google.android.gms.internal.zzqf.zzbf(r3);
        r0 = r21;
        r3 = r0.zzsn;
        r5 = "mediation_network_succeed";
        r3.zzh(r5, r4);
        r3 = r15.isEmpty();
        if (r3 != 0) goto L_0x00e6;
    L_0x00d7:
        r0 = r21;
        r3 = r0.zzsn;
        r4 = "mediation_networks_fail";
        r5 = ",";
        r5 = android.text.TextUtils.join(r5, r15);
        r3.zzh(r4, r5);
    L_0x00e6:
        r0 = r21;
        r3 = r0.zzsn;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mls";
        r4[r5] = r6;
        r0 = r19;
        r3.zza(r0, r4);
        r0 = r21;
        r3 = r0.zzsn;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "ttm";
        r4[r5] = r6;
        r0 = r16;
        r3.zza(r0, r4);
        goto L_0x0065;
    L_0x010a:
        r2 = move-exception;
        monitor-exit(r20);	 Catch:{ all -> 0x010a }
        throw r2;
    L_0x010d:
        r15.add(r4);
        r0 = r21;
        r3 = r0.zzsn;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = "mlf";
        r4[r5] = r6;
        r0 = r19;
        r3.zza(r0, r4);
        r3 = r2.zzLj;
        if (r3 == 0) goto L_0x003d;
    L_0x0125:
        r3 = com.google.android.gms.internal.zzpo.zzXC;
        r4 = new com.google.android.gms.internal.zzjy$1;
        r0 = r21;
        r4.<init>(r0, r2);
        r3.post(r4);
        goto L_0x003d;
    L_0x0133:
        r2 = r15.isEmpty();
        if (r2 != 0) goto L_0x0148;
    L_0x0139:
        r0 = r21;
        r2 = r0.zzsn;
        r3 = "mediation_networks_fail";
        r4 = ",";
        r4 = android.text.TextUtils.join(r4, r15);
        r2.zzh(r3, r4);
    L_0x0148:
        r2 = new com.google.android.gms.internal.zzjv;
        r3 = 1;
        r2.<init>(r3);
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjy.zzd(java.util.List):com.google.android.gms.internal.zzjv");
    }

    public List<zzjv> zzgU() {
        return this.zzLu;
    }
}
