package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzeq.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzhp;
import com.google.android.gms.internal.zzhq;
import com.google.android.gms.internal.zzhr;
import com.google.android.gms.internal.zzhs;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzqh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@zzme
public class zzk extends zza {
    private final Context mContext;
    private final Object zzrJ = new Object();
    private final zze zzsv;
    private final zzka zzsz;
    private final zzep zztk;
    @Nullable
    private final zzhp zztl;
    @Nullable
    private final zzhq zztm;
    private final SimpleArrayMap<String, zzhs> zztn;
    private final SimpleArrayMap<String, zzhr> zzto;
    private final zzhc zztp;
    private final List<String> zztq;
    private final zzex zztr;
    private final String zzts;
    private final zzqh zztt;
    @Nullable
    private WeakReference<zzs> zztu;

    zzk(Context context, String str, zzka com_google_android_gms_internal_zzka, zzqh com_google_android_gms_internal_zzqh, zzep com_google_android_gms_internal_zzep, zzhp com_google_android_gms_internal_zzhp, zzhq com_google_android_gms_internal_zzhq, SimpleArrayMap<String, zzhs> simpleArrayMap, SimpleArrayMap<String, zzhr> simpleArrayMap2, zzhc com_google_android_gms_internal_zzhc, zzex com_google_android_gms_internal_zzex, zze com_google_android_gms_ads_internal_zze) {
        this.mContext = context;
        this.zzts = str;
        this.zzsz = com_google_android_gms_internal_zzka;
        this.zztt = com_google_android_gms_internal_zzqh;
        this.zztk = com_google_android_gms_internal_zzep;
        this.zztm = com_google_android_gms_internal_zzhq;
        this.zztl = com_google_android_gms_internal_zzhp;
        this.zztn = simpleArrayMap;
        this.zzto = simpleArrayMap2;
        this.zztp = com_google_android_gms_internal_zzhc;
        this.zztq = zzci();
        this.zztr = com_google_android_gms_internal_zzex;
        this.zzsv = com_google_android_gms_ads_internal_zze;
    }

    private List<String> zzci() {
        List<String> arrayList = new ArrayList();
        if (this.zztm != null) {
            arrayList.add("1");
        }
        if (this.zztl != null) {
            arrayList.add("2");
        }
        if (this.zztn.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public java.lang.String getMediationAdapterClassName() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.zzrJ;
        monitor-enter(r2);
        r0 = r3.zztu;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.zztu;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzs) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.getMediationAdapterClassName();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzk.getMediationAdapterClassName():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLoading() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.zzrJ;
        monitor-enter(r2);
        r0 = r3.zztu;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.zztu;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.zzs) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.isLoading();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzk.isLoading():boolean");
    }

    protected void runOnUiThread(Runnable runnable) {
        zzpo.zzXC.post(runnable);
    }

    protected zzs zzcj() {
        return new zzs(this.mContext, this.zzsv, zzeg.zzk(this.mContext), this.zzts, this.zzsz, this.zztt);
    }

    public void zzf(final zzec com_google_android_gms_internal_zzec) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzk zztw;

            public void run() {
                synchronized (this.zztw.zzrJ) {
                    zzs zzcj = this.zztw.zzcj();
                    this.zztw.zztu = new WeakReference(zzcj);
                    zzcj.zzb(this.zztw.zztl);
                    zzcj.zzb(this.zztw.zztm);
                    zzcj.zza(this.zztw.zztn);
                    zzcj.zza(this.zztw.zztk);
                    zzcj.zzb(this.zztw.zzto);
                    zzcj.zzb(this.zztw.zzci());
                    zzcj.zzb(this.zztw.zztp);
                    zzcj.zza(this.zztw.zztr);
                    zzcj.zzb(com_google_android_gms_internal_zzec);
                }
            }
        });
    }
}
