package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
public class zzmx extends zzpj {
    private static zzji zzQn = null;
    static final long zzSV = TimeUnit.SECONDS.toMillis(10);
    static boolean zzSW = false;
    private static zzie zzSX = null;
    private static zzii zzSY = null;
    private static zzid zzSZ = null;
    private static final Object zztX = new Object();
    private final Context mContext;
    private final Object zzPU = new Object();
    private final com.google.android.gms.internal.zzmf.zza zzRl;
    private final com.google.android.gms.internal.zzmk.zza zzRm;
    private com.google.android.gms.internal.zzji.zzc zzTa;

    class C06083 implements Runnable {
        final /* synthetic */ zzmx zzTb;

        C06083(zzmx com_google_android_gms_internal_zzmx) {
            this.zzTb = com_google_android_gms_internal_zzmx;
        }

        public void run() {
            if (this.zzTb.zzTa != null) {
                this.zzTb.zzTa.release();
                this.zzTb.zzTa = null;
            }
        }
    }

    public static class zza implements zzpt<zzjf> {
        public void zza(zzjf com_google_android_gms_internal_zzjf) {
            zzmx.zzc(com_google_android_gms_internal_zzjf);
        }

        public /* synthetic */ void zzd(Object obj) {
            zza((zzjf) obj);
        }
    }

    public static class zzb implements zzpt<zzjf> {
        public void zza(zzjf com_google_android_gms_internal_zzjf) {
            zzmx.zzb(com_google_android_gms_internal_zzjf);
        }

        public /* synthetic */ void zzd(Object obj) {
            zza((zzjf) obj);
        }
    }

    public static class zzc implements zzid {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = (String) map.get("request_id");
            String str2 = "Invalid request: ";
            String valueOf = String.valueOf((String) map.get("errors"));
            zzqf.zzbh(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            zzmx.zzSY.zzac(str);
        }
    }

    public zzmx(Context context, com.google.android.gms.internal.zzmk.zza com_google_android_gms_internal_zzmk_zza, com.google.android.gms.internal.zzmf.zza com_google_android_gms_internal_zzmf_zza) {
        super(true);
        this.zzRl = com_google_android_gms_internal_zzmf_zza;
        this.mContext = context;
        this.zzRm = com_google_android_gms_internal_zzmk_zza;
        synchronized (zztX) {
            if (!zzSW) {
                zzSY = new zzii();
                zzSX = new zzie(context.getApplicationContext(), com_google_android_gms_internal_zzmk_zza.zzvn);
                zzSZ = new zzc();
                zzQn = new zzji(this.mContext.getApplicationContext(), this.zzRm.zzvn, (String) zzgd.zzBh.get(), new zzb(), new zza());
                zzSW = true;
            }
        }
    }

    private JSONObject zza(zzmk com_google_android_gms_internal_zzmk, String str) {
        Throwable e;
        Object obj;
        Info advertisingIdInfo;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = com_google_android_gms_internal_zzmk.zzRy.extras.getBundle("sdk_less_server_data");
        if (bundle != null) {
            zzni com_google_android_gms_internal_zzni;
            try {
                com_google_android_gms_internal_zzni = (zzni) zzw.zzcV().zzA(this.mContext).get();
            } catch (Throwable e2) {
                zzqf.zzc("Error grabbing device info: ", e2);
                obj = jSONObject;
            }
            JSONObject zza = zznd.zza(this.mContext, new zzna().zzf(com_google_android_gms_internal_zzmk).zza(com_google_android_gms_internal_zzni));
            if (zza != null) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
                } catch (IOException e3) {
                    e2 = e3;
                    zzqf.zzc("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzw.zzcM().zzQ(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e4) {
                    e2 = e4;
                    zzqf.zzc("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzw.zzcM().zzQ(hashMap);
                    return jSONObject;
                } catch (GooglePlayServicesNotAvailableException e5) {
                    e2 = e5;
                    zzqf.zzc("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzw.zzcM().zzQ(hashMap);
                    return jSONObject;
                } catch (GooglePlayServicesRepairableException e6) {
                    e2 = e6;
                    zzqf.zzc("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", zza);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzw.zzcM().zzQ(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("request_param", zza);
                hashMap.put("data", bundle);
                if (advertisingIdInfo != null) {
                    hashMap.put("adid", advertisingIdInfo.getId());
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                    }
                    hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                }
                try {
                    jSONObject = zzw.zzcM().zzQ(hashMap);
                } catch (JSONException e7) {
                }
            }
        }
        return jSONObject;
    }

    protected static void zzb(zzjf com_google_android_gms_internal_zzjf) {
        com_google_android_gms_internal_zzjf.zza("/loadAd", zzSY);
        com_google_android_gms_internal_zzjf.zza("/fetchHttpRequest", zzSX);
        com_google_android_gms_internal_zzjf.zza("/invalidRequest", zzSZ);
    }

    protected static void zzc(zzjf com_google_android_gms_internal_zzjf) {
        com_google_android_gms_internal_zzjf.zzb("/loadAd", zzSY);
        com_google_android_gms_internal_zzjf.zzb("/fetchHttpRequest", zzSX);
        com_google_android_gms_internal_zzjf.zzb("/invalidRequest", zzSZ);
    }

    private zzmn zze(zzmk com_google_android_gms_internal_zzmk) {
        final String zzkL = zzw.zzcM().zzkL();
        final JSONObject zza = zza(com_google_android_gms_internal_zzmk, zzkL);
        if (zza == null) {
            return new zzmn(0);
        }
        long elapsedRealtime = zzw.zzcS().elapsedRealtime();
        Future zzab = zzSY.zzab(zzkL);
        zzqe.zzYP.post(new Runnable(this) {
            final /* synthetic */ zzmx zzTb;

            class C11091 implements com.google.android.gms.internal.zzqp.zzc<zzjj> {
                final /* synthetic */ C06072 zzTe;

                C11091(C06072 c06072) {
                    this.zzTe = c06072;
                }

                public void zzb(zzjj com_google_android_gms_internal_zzjj) {
                    try {
                        com_google_android_gms_internal_zzjj.zza("AFMA_getAdapterLessMediationAd", zza);
                    } catch (Throwable e) {
                        zzqf.zzb("Error requesting an ad url", e);
                        zzmx.zzSY.zzac(zzkL);
                    }
                }

                public /* synthetic */ void zzd(Object obj) {
                    zzb((zzjj) obj);
                }
            }

            class C11102 implements com.google.android.gms.internal.zzqp.zza {
                final /* synthetic */ C06072 zzTe;

                C11102(C06072 c06072) {
                    this.zzTe = c06072;
                }

                public void run() {
                    zzmx.zzSY.zzac(zzkL);
                }
            }

            public void run() {
                this.zzTb.zzTa = zzmx.zzQn.zzgO();
                this.zzTb.zzTa.zza(new C11091(this), new C11102(this));
            }
        });
        try {
            JSONObject jSONObject = (JSONObject) zzab.get(zzSV - (zzw.zzcS().elapsedRealtime() - elapsedRealtime), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzmn(-1);
            }
            zzmn zza2 = zznd.zza(this.mContext, com_google_android_gms_internal_zzmk, jSONObject.toString());
            return (zza2.errorCode == -3 || !TextUtils.isEmpty(zza2.body)) ? zza2 : new zzmn(3);
        } catch (CancellationException e) {
            return new zzmn(-1);
        } catch (InterruptedException e2) {
            return new zzmn(-1);
        } catch (TimeoutException e3) {
            return new zzmn(2);
        } catch (ExecutionException e4) {
            return new zzmn(0);
        }
    }

    public void onStop() {
        synchronized (this.zzPU) {
            zzqe.zzYP.post(new C06083(this));
        }
    }

    public void zzco() {
        zzqf.zzbf("SdkLessAdLoaderBackgroundTask started.");
        String zzF = zzw.zzdl().zzF(this.mContext);
        zzmk com_google_android_gms_internal_zzmk = new zzmk(this.zzRm, -1, zzw.zzdl().zzD(this.mContext), zzw.zzdl().zzE(this.mContext), zzF);
        zzw.zzdl().zzh(this.mContext, zzF);
        zzmn zze = zze(com_google_android_gms_internal_zzmk);
        zzmk com_google_android_gms_internal_zzmk2 = com_google_android_gms_internal_zzmk;
        zzjr com_google_android_gms_internal_zzjr = null;
        zzeg com_google_android_gms_internal_zzeg = null;
        final com.google.android.gms.internal.zzpb.zza com_google_android_gms_internal_zzpb_zza = new com.google.android.gms.internal.zzpb.zza(com_google_android_gms_internal_zzmk2, zze, com_google_android_gms_internal_zzjr, com_google_android_gms_internal_zzeg, zze.errorCode, zzw.zzcS().elapsedRealtime(), zze.zzSr, null);
        zzqe.zzYP.post(new Runnable(this) {
            final /* synthetic */ zzmx zzTb;

            public void run() {
                this.zzTb.zzRl.zza(com_google_android_gms_internal_zzpb_zza);
                if (this.zzTb.zzTa != null) {
                    this.zzTb.zzTa.release();
                    this.zzTb.zzTa = null;
                }
            }
        });
    }
}
