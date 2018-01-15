package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zzi;
import com.google.android.gms.internal.zzaaf;
import com.google.android.gms.internal.zzaj.zzj;
import com.google.android.gms.internal.zzbje;

public class zzp extends zzaaf<ContainerHolder> {
    private final Context mContext;
    private final String zzbEY;
    private long zzbFd;
    private final TagManager zzbFk;
    private final zzd zzbFn;
    private final zzcl zzbFo;
    private final int zzbFp;
    private final zzq zzbFq;
    private zzf zzbFr;
    private zzbje zzbFs;
    private volatile zzo zzbFt;
    private volatile boolean zzbFu;
    private zzj zzbFv;
    private String zzbFw;
    private zze zzbFx;
    private zza zzbFy;
    private final Looper zzrs;
    private final com.google.android.gms.common.util.zze zzuP;

    class C07031 {
    }

    interface zza {
        boolean zzb(Container container);
    }

    class C11462 implements com.google.android.gms.tagmanager.zzo.zza {
        final /* synthetic */ zzp zzbFz;

        C11462(zzp com_google_android_gms_tagmanager_zzp) {
            this.zzbFz = com_google_android_gms_tagmanager_zzp;
        }

        public String zzQg() {
            return this.zzbFz.zzQg();
        }

        public void zzQi() {
            zzbo.zzbh("Refresh ignored: container loaded as default only.");
        }

        public void zzgW(String str) {
            this.zzbFz.zzgW(str);
        }
    }

    private class zzb implements zzbn<com.google.android.gms.internal.zzbjd.zza> {
        final /* synthetic */ zzp zzbFz;

        private zzb(zzp com_google_android_gms_tagmanager_zzp) {
            this.zzbFz = com_google_android_gms_tagmanager_zzp;
        }

        public /* synthetic */ void onSuccess(Object obj) {
            zza((com.google.android.gms.internal.zzbjd.zza) obj);
        }

        public void zza(com.google.android.gms.internal.zzbjd.zza com_google_android_gms_internal_zzbjd_zza) {
            zzj com_google_android_gms_internal_zzaj_zzj;
            if (com_google_android_gms_internal_zzbjd_zza.zzbNj != null) {
                com_google_android_gms_internal_zzaj_zzj = com_google_android_gms_internal_zzbjd_zza.zzbNj;
            } else {
                com.google.android.gms.internal.zzaj.zzf com_google_android_gms_internal_zzaj_zzf = com_google_android_gms_internal_zzbjd_zza.zzlr;
                com_google_android_gms_internal_zzaj_zzj = new zzj();
                com_google_android_gms_internal_zzaj_zzj.zzlr = com_google_android_gms_internal_zzaj_zzf;
                com_google_android_gms_internal_zzaj_zzj.zzlq = null;
                com_google_android_gms_internal_zzaj_zzj.zzls = com_google_android_gms_internal_zzaj_zzf.version;
            }
            this.zzbFz.zza(com_google_android_gms_internal_zzaj_zzj, com_google_android_gms_internal_zzbjd_zza.zzbNi, true);
        }

        public void zza(com.google.android.gms.tagmanager.zzbn.zza com_google_android_gms_tagmanager_zzbn_zza) {
            if (!this.zzbFz.zzbFu) {
                this.zzbFz.zzay(0);
            }
        }
    }

    private class zzc implements zzbn<zzj> {
        final /* synthetic */ zzp zzbFz;

        private zzc(zzp com_google_android_gms_tagmanager_zzp) {
            this.zzbFz = com_google_android_gms_tagmanager_zzp;
        }

        public /* synthetic */ void onSuccess(Object obj) {
            zzb((zzj) obj);
        }

        public void zza(com.google.android.gms.tagmanager.zzbn.zza com_google_android_gms_tagmanager_zzbn_zza) {
            if (com_google_android_gms_tagmanager_zzbn_zza == com.google.android.gms.tagmanager.zzbn.zza.SERVER_UNAVAILABLE_ERROR) {
                this.zzbFz.zzbFq.zzQr();
            }
            synchronized (this.zzbFz) {
                if (!this.zzbFz.isReady()) {
                    if (this.zzbFz.zzbFt != null) {
                        this.zzbFz.zzb(this.zzbFz.zzbFt);
                    } else {
                        this.zzbFz.zzb(this.zzbFz.zzbN(Status.zzazA));
                    }
                }
            }
            this.zzbFz.zzay(this.zzbFz.zzbFq.zzQq());
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void zzb(com.google.android.gms.internal.zzaj.zzj r6) {
            /*
            r5 = this;
            r0 = r5.zzbFz;
            r0 = r0.zzbFq;
            r0.zzQs();
            r1 = r5.zzbFz;
            monitor-enter(r1);
            r0 = r6.zzlr;	 Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x003a;
        L_0x0010:
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r0 = r0.zzbFv;	 Catch:{ all -> 0x0077 }
            r0 = r0.zzlr;	 Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0030;
        L_0x001a:
            r0 = "Current resource is null; network resource is also null";
            com.google.android.gms.tagmanager.zzbo.m11e(r0);	 Catch:{ all -> 0x0077 }
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r0 = r0.zzbFq;	 Catch:{ all -> 0x0077 }
            r2 = r0.zzQq();	 Catch:{ all -> 0x0077 }
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r0.zzay(r2);	 Catch:{ all -> 0x0077 }
            monitor-exit(r1);	 Catch:{ all -> 0x0077 }
        L_0x002f:
            return;
        L_0x0030:
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r0 = r0.zzbFv;	 Catch:{ all -> 0x0077 }
            r0 = r0.zzlr;	 Catch:{ all -> 0x0077 }
            r6.zzlr = r0;	 Catch:{ all -> 0x0077 }
        L_0x003a:
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r2 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r2 = r2.zzuP;	 Catch:{ all -> 0x0077 }
            r2 = r2.currentTimeMillis();	 Catch:{ all -> 0x0077 }
            r4 = 0;
            r0.zza(r6, r2, r4);	 Catch:{ all -> 0x0077 }
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r2 = r0.zzbFd;	 Catch:{ all -> 0x0077 }
            r0 = 58;
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0077 }
            r4.<init>(r0);	 Catch:{ all -> 0x0077 }
            r0 = "setting refresh time to current time: ";
            r0 = r4.append(r0);	 Catch:{ all -> 0x0077 }
            r0 = r0.append(r2);	 Catch:{ all -> 0x0077 }
            r0 = r0.toString();	 Catch:{ all -> 0x0077 }
            com.google.android.gms.tagmanager.zzbo.m12v(r0);	 Catch:{ all -> 0x0077 }
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r0 = r0.zzQm();	 Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0075;
        L_0x0070:
            r0 = r5.zzbFz;	 Catch:{ all -> 0x0077 }
            r0.zza(r6);	 Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r1);	 Catch:{ all -> 0x0077 }
            goto L_0x002f;
        L_0x0077:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0077 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzp.zzc.zzb(com.google.android.gms.internal.zzaj$zzj):void");
        }
    }

    private class zzd implements com.google.android.gms.tagmanager.zzo.zza {
        final /* synthetic */ zzp zzbFz;

        private zzd(zzp com_google_android_gms_tagmanager_zzp) {
            this.zzbFz = com_google_android_gms_tagmanager_zzp;
        }

        public String zzQg() {
            return this.zzbFz.zzQg();
        }

        public void zzQi() {
            if (this.zzbFz.zzbFo.zzpV()) {
                this.zzbFz.zzay(0);
            }
        }

        public void zzgW(String str) {
            this.zzbFz.zzgW(str);
        }
    }

    interface zze extends Releasable {
        void zza(zzbn<zzj> com_google_android_gms_tagmanager_zzbn_com_google_android_gms_internal_zzaj_zzj);

        void zzf(long j, String str);

        void zzgZ(String str);
    }

    interface zzf extends Releasable {
        void zzQo();

        void zza(zzbn<com.google.android.gms.internal.zzbjd.zza> com_google_android_gms_tagmanager_zzbn_com_google_android_gms_internal_zzbjd_zza);

        void zzb(com.google.android.gms.internal.zzbjd.zza com_google_android_gms_internal_zzbjd_zza);

        com.google.android.gms.internal.zzbjf.zzc zznz(int i);
    }

    zzp(Context context, TagManager tagManager, Looper looper, String str, int i, zzf com_google_android_gms_tagmanager_zzp_zzf, zze com_google_android_gms_tagmanager_zzp_zze, zzbje com_google_android_gms_internal_zzbje, com.google.android.gms.common.util.zze com_google_android_gms_common_util_zze, zzcl com_google_android_gms_tagmanager_zzcl, zzq com_google_android_gms_tagmanager_zzq) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.mContext = context;
        this.zzbFk = tagManager;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.zzrs = looper;
        this.zzbEY = str;
        this.zzbFp = i;
        this.zzbFr = com_google_android_gms_tagmanager_zzp_zzf;
        this.zzbFx = com_google_android_gms_tagmanager_zzp_zze;
        this.zzbFs = com_google_android_gms_internal_zzbje;
        this.zzbFn = new zzd();
        this.zzbFv = new zzj();
        this.zzuP = com_google_android_gms_common_util_zze;
        this.zzbFo = com_google_android_gms_tagmanager_zzcl;
        this.zzbFq = com_google_android_gms_tagmanager_zzq;
        if (zzQm()) {
            zzgW(zzcj.zzRd().zzRf());
        }
    }

    public zzp(Context context, TagManager tagManager, Looper looper, String str, int i, zzt com_google_android_gms_tagmanager_zzt) {
        zzcv com_google_android_gms_tagmanager_zzcv = new zzcv(context, str);
        zzcu com_google_android_gms_tagmanager_zzcu = new zzcu(context, str, com_google_android_gms_tagmanager_zzt);
        Context context2 = context;
        TagManager tagManager2 = tagManager;
        Looper looper2 = looper;
        String str2 = str;
        int i2 = i;
        zzcv com_google_android_gms_tagmanager_zzcv2 = com_google_android_gms_tagmanager_zzcv;
        zzcu com_google_android_gms_tagmanager_zzcu2 = com_google_android_gms_tagmanager_zzcu;
        this(context2, tagManager2, looper2, str2, i2, com_google_android_gms_tagmanager_zzcv2, com_google_android_gms_tagmanager_zzcu2, new zzbje(context), zzi.zzzc(), new zzbm(1, 5, 900000, 5000, "refreshing", zzi.zzzc()), new zzq(context, str));
        this.zzbFs.zzig(com_google_android_gms_tagmanager_zzt.zzQu());
    }

    private boolean zzQm() {
        zzcj zzRd = zzcj.zzRd();
        return (zzRd.zzRe() == zza.CONTAINER || zzRd.zzRe() == zza.CONTAINER_DEBUG) && this.zzbEY.equals(zzRd.getContainerId());
    }

    private synchronized void zza(zzj com_google_android_gms_internal_zzaj_zzj) {
        if (this.zzbFr != null) {
            com.google.android.gms.internal.zzbjd.zza com_google_android_gms_internal_zzbjd_zza = new com.google.android.gms.internal.zzbjd.zza();
            com_google_android_gms_internal_zzbjd_zza.zzbNi = this.zzbFd;
            com_google_android_gms_internal_zzbjd_zza.zzlr = new com.google.android.gms.internal.zzaj.zzf();
            com_google_android_gms_internal_zzbjd_zza.zzbNj = com_google_android_gms_internal_zzaj_zzj;
            this.zzbFr.zzb(com_google_android_gms_internal_zzbjd_zza);
        }
    }

    private synchronized void zza(zzj com_google_android_gms_internal_zzaj_zzj, long j, boolean z) {
        if (z) {
            boolean z2 = this.zzbFu;
        }
        if (!(isReady() && this.zzbFt == null)) {
            this.zzbFv = com_google_android_gms_internal_zzaj_zzj;
            this.zzbFd = j;
            long zzQp = this.zzbFq.zzQp();
            zzay(Math.max(0, Math.min(zzQp, (this.zzbFd + zzQp) - this.zzuP.currentTimeMillis())));
            Container container = new Container(this.mContext, this.zzbFk.getDataLayer(), this.zzbEY, j, com_google_android_gms_internal_zzaj_zzj);
            if (this.zzbFt == null) {
                this.zzbFt = new zzo(this.zzbFk, this.zzrs, container, this.zzbFn);
            } else {
                this.zzbFt.zza(container);
            }
            if (!isReady() && this.zzbFy.zzb(container)) {
                zzb(this.zzbFt);
            }
        }
    }

    private void zzaR(final boolean z) {
        this.zzbFr.zza(new zzb());
        this.zzbFx.zza(new zzc());
        com.google.android.gms.internal.zzbjf.zzc zznz = this.zzbFr.zznz(this.zzbFp);
        if (zznz != null) {
            this.zzbFt = new zzo(this.zzbFk, this.zzrs, new Container(this.mContext, this.zzbFk.getDataLayer(), this.zzbEY, 0, zznz), this.zzbFn);
        }
        this.zzbFy = new zza(this) {
            private Long zzbFA;
            final /* synthetic */ zzp zzbFz;

            private long zzQn() {
                if (this.zzbFA == null) {
                    this.zzbFA = Long.valueOf(this.zzbFz.zzbFq.zzQp());
                }
                return this.zzbFA.longValue();
            }

            public boolean zzb(Container container) {
                return z ? container.getLastRefreshTime() + zzQn() >= this.zzbFz.zzuP.currentTimeMillis() : !container.isDefault();
            }
        };
        if (zzQm()) {
            this.zzbFx.zzf(0, "");
        } else {
            this.zzbFr.zzQo();
        }
    }

    private synchronized void zzay(long j) {
        if (this.zzbFx == null) {
            zzbo.zzbh("Refresh requested, but no network load scheduler.");
        } else {
            this.zzbFx.zzf(j, this.zzbFv.zzls);
        }
    }

    synchronized String zzQg() {
        return this.zzbFw;
    }

    public void zzQj() {
        com.google.android.gms.internal.zzbjf.zzc zznz = this.zzbFr.zznz(this.zzbFp);
        if (zznz != null) {
            zzb(new zzo(this.zzbFk, this.zzrs, new Container(this.mContext, this.zzbFk.getDataLayer(), this.zzbEY, 0, zznz), new C11462(this)));
        } else {
            String str = "Default was requested, but no default container was found";
            zzbo.m11e(str);
            zzb(zzbN(new Status(10, str, null)));
        }
        this.zzbFx = null;
        this.zzbFr = null;
    }

    public void zzQk() {
        zzaR(false);
    }

    public void zzQl() {
        zzaR(true);
    }

    protected ContainerHolder zzbN(Status status) {
        if (this.zzbFt != null) {
            return this.zzbFt;
        }
        if (status == Status.zzazA) {
            zzbo.m11e("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    protected /* synthetic */ Result zzc(Status status) {
        return zzbN(status);
    }

    synchronized void zzgW(String str) {
        this.zzbFw = str;
        if (this.zzbFx != null) {
            this.zzbFx.zzgZ(str);
        }
    }
}
