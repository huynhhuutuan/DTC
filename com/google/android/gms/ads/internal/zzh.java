package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzji;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzpd;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzqp.zzb;
import com.google.android.gms.internal.zzqp.zzc;
import com.google.android.gms.internal.zzqw;
import java.util.Map;
import org.json.JSONObject;

@zzme
public class zzh {
    private Context mContext;
    private final Object zzrJ = new Object();

    private static boolean zza(@Nullable zzpd com_google_android_gms_internal_zzpd) {
        if (com_google_android_gms_internal_zzpd == null) {
            return true;
        }
        boolean z = (((zzw.zzcS().currentTimeMillis() - com_google_android_gms_internal_zzpd.zzkb()) > ((Long) zzgd.zzEL.get()).longValue() ? 1 : ((zzw.zzcS().currentTimeMillis() - com_google_android_gms_internal_zzpd.zzkb()) == ((Long) zzgd.zzEL.get()).longValue() ? 0 : -1)) > 0) || !com_google_android_gms_internal_zzpd.zzkc();
        return z;
    }

    public void zza(Context context, zzqh com_google_android_gms_internal_zzqh, String str, zzpd com_google_android_gms_internal_zzpd) {
        zza(context, com_google_android_gms_internal_zzqh, false, com_google_android_gms_internal_zzpd, com_google_android_gms_internal_zzpd != null ? null : com_google_android_gms_internal_zzpd.zzke(), str, null);
    }

    public void zza(Context context, zzqh com_google_android_gms_internal_zzqh, String str, @Nullable Runnable runnable) {
        zza(context, com_google_android_gms_internal_zzqh, true, null, str, null, runnable);
    }

    void zza(Context context, zzqh com_google_android_gms_internal_zzqh, boolean z, @Nullable zzpd com_google_android_gms_internal_zzpd, String str, @Nullable String str2, @Nullable Runnable runnable) {
        if (!zza(com_google_android_gms_internal_zzpd)) {
            return;
        }
        if (context == null) {
            zzqf.zzbh("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzqf.zzbh("App settings could not be fetched. Required parameters missing");
        } else {
            this.mContext = context;
            final zzji zzd = zzw.zzcM().zzd(context, com_google_android_gms_internal_zzqh);
            final Runnable runnable2 = runnable;
            final zzid c08941 = new zzid(this) {
                final /* synthetic */ zzh zzsZ;

                public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
                    com_google_android_gms_internal_zzqw.zzb("/appSettingsFetched", (zzid) this);
                    synchronized (this.zzsZ.zzrJ) {
                        if (map != null) {
                            if ("true".equalsIgnoreCase((String) map.get("isSuccessful"))) {
                                zzw.zzcQ().zzn(this.zzsZ.mContext, (String) map.get("appSettingsJson"));
                                try {
                                    if (runnable2 != null) {
                                        runnable2.run();
                                    }
                                } catch (Throwable th) {
                                    zzw.zzcQ().zza(th, "ConfigLoader.maybeFetchNewAppSettings");
                                    zzqf.zzc("ConfigLoader post task failed.", th);
                                }
                            }
                        }
                    }
                }
            };
            final String str3 = str;
            final String str4 = str2;
            final boolean z2 = z;
            final Context context2 = context;
            zzpo.zzXC.post(new Runnable(this) {

                class C08951 implements zzc<zzjj> {
                    final /* synthetic */ C03702 zztg;

                    C08951(C03702 c03702) {
                        this.zztg = c03702;
                    }

                    public void zzb(zzjj com_google_android_gms_internal_zzjj) {
                        com_google_android_gms_internal_zzjj.zza("/appSettingsFetched", c08941);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (!TextUtils.isEmpty(str3)) {
                                jSONObject.put("app_id", str3);
                            } else if (!TextUtils.isEmpty(str4)) {
                                jSONObject.put("ad_unit_id", str4);
                            }
                            jSONObject.put("is_init", z2);
                            jSONObject.put("pn", context2.getPackageName());
                            com_google_android_gms_internal_zzjj.zza("AFMA_fetchAppSettings", jSONObject);
                        } catch (Throwable e) {
                            com_google_android_gms_internal_zzjj.zzb("/appSettingsFetched", c08941);
                            zzqf.zzb("Error requesting application settings", e);
                        }
                    }

                    public /* synthetic */ void zzd(Object obj) {
                        zzb((zzjj) obj);
                    }
                }

                public void run() {
                    zzd.zzgO().zza(new C08951(this), new zzb());
                }
            });
        }
    }
}
