package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.util.zzt;
import com.google.android.gms.dynamic.zzd;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
public class zzlx implements Callable<zzpb> {
    static long zzQl = TimeUnit.SECONDS.toMillis(60);
    private final Context mContext;
    private final zzlw zzGN;
    private final zzaw zzGP;
    private final com.google.android.gms.internal.zzpb.zza zzPR;
    private int zzPY;
    private final zzpv zzQu;
    private final zzs zzQv;
    private boolean zzQw;
    private List<String> zzQx;
    private JSONObject zzQy;
    private String zzQz;
    private final Object zzrJ = new Object();
    private final zzgl zzsn;

    public interface zza<T extends com.google.android.gms.internal.zzha.zza> {
        T zza(zzlx com_google_android_gms_internal_zzlx, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException;
    }

    class zzb {
        public zzid zzQU;

        zzb(zzlx com_google_android_gms_internal_zzlx) {
        }
    }

    public zzlx(Context context, zzs com_google_android_gms_ads_internal_zzs, zzpv com_google_android_gms_internal_zzpv, zzaw com_google_android_gms_internal_zzaw, com.google.android.gms.internal.zzpb.zza com_google_android_gms_internal_zzpb_zza, zzgl com_google_android_gms_internal_zzgl) {
        this.mContext = context;
        this.zzQv = com_google_android_gms_ads_internal_zzs;
        this.zzQu = com_google_android_gms_internal_zzpv;
        this.zzPR = com_google_android_gms_internal_zzpb_zza;
        this.zzGP = com_google_android_gms_internal_zzaw;
        this.zzsn = com_google_android_gms_internal_zzgl;
        this.zzGN = zza(context, com_google_android_gms_internal_zzpb_zza, com_google_android_gms_ads_internal_zzs, com_google_android_gms_internal_zzaw);
        this.zzGN.zziT();
        this.zzQw = false;
        this.zzPY = -2;
        this.zzQx = null;
        this.zzQz = null;
    }

    private com.google.android.gms.internal.zzha.zza zza(zza com_google_android_gms_internal_zzlx_zza, JSONObject jSONObject, String str) throws ExecutionException, InterruptedException, JSONException {
        if (zzjf() || com_google_android_gms_internal_zzlx_zza == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
        String[] zzd = zzd(jSONObject2, "impression_tracking_urls");
        this.zzQx = zzd == null ? null : Arrays.asList(zzd);
        this.zzQy = jSONObject2.optJSONObject("active_view");
        this.zzQz = jSONObject.optString("debug_signals");
        com.google.android.gms.internal.zzha.zza zza = com_google_android_gms_internal_zzlx_zza.zza(this, jSONObject);
        if (zza == null) {
            zzqf.m9e("Failed to retrieve ad assets.");
            return null;
        }
        zza.zzb(new zzhb(this.mContext, this.zzQv, this.zzGN, this.zzGP, jSONObject, zza, this.zzPR.zzTi.zzvn, str));
        return zza;
    }

    private zzqm<zzgu> zza(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        final String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            zza(0, z);
            return new zzqk(null);
        } else if (z2) {
            return new zzqk(new zzgu(null, Uri.parse(string), optDouble));
        } else {
            final boolean z3 = z;
            return this.zzQu.zza(string, new com.google.android.gms.internal.zzpv.zza<zzgu>(this) {
                final /* synthetic */ zzlx zzQD;

                @TargetApi(19)
                public zzgu zzg(InputStream inputStream) {
                    Bitmap decodeStream;
                    Options options = new Options();
                    options.inDensity = (int) (160.0d * optDouble);
                    if (!optBoolean) {
                        options.inPreferredConfig = Config.RGB_565;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    } catch (Throwable e) {
                        zzqf.zzb("Error grabbing image.", e);
                        decodeStream = null;
                    }
                    if (decodeStream == null) {
                        this.zzQD.zza(2, z3);
                        return null;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (zzt.zzzl() && zzpk.zzkI()) {
                        int width = decodeStream.getWidth();
                        int height = decodeStream.getHeight();
                        zzpk.m28v("Decoded image w: " + width + " h:" + height + " bytes: " + decodeStream.getAllocationByteCount() + " time: " + (uptimeMillis2 - uptimeMillis) + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
                    }
                    return new zzgu(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(string), optDouble);
                }

                @TargetApi(19)
                public /* synthetic */ Object zzh(InputStream inputStream) {
                    return zzg(inputStream);
                }

                public zzgu zzjh() {
                    this.zzQD.zza(2, z3);
                    return null;
                }

                public /* synthetic */ Object zzji() {
                    return zzjh();
                }
            });
        }
    }

    private void zza(com.google.android.gms.internal.zzha.zza com_google_android_gms_internal_zzha_zza) {
        if (com_google_android_gms_internal_zzha_zza instanceof zzgx) {
            final zzgx com_google_android_gms_internal_zzgx = (zzgx) com_google_android_gms_internal_zzha_zza;
            zzb com_google_android_gms_internal_zzlx_zzb = new zzb(this);
            final zzid c10993 = new zzid(this) {
                final /* synthetic */ zzlx zzQD;

                public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
                    this.zzQD.zzb(com_google_android_gms_internal_zzgx, (String) map.get("asset"));
                }
            };
            com_google_android_gms_internal_zzlx_zzb.zzQU = c10993;
            this.zzGN.zza(new com.google.android.gms.internal.zzlw.zza(this) {
                public void zze(zzjj com_google_android_gms_internal_zzjj) {
                    com_google_android_gms_internal_zzjj.zza("/nativeAdCustomClick", c10993);
                }
            });
        }
    }

    private JSONObject zzaH(final String str) throws ExecutionException, InterruptedException, TimeoutException, JSONException {
        if (zzjf()) {
            return null;
        }
        final zzqj com_google_android_gms_internal_zzqj = new zzqj();
        final zzb com_google_android_gms_internal_zzlx_zzb = new zzb(this);
        this.zzGN.zza(new com.google.android.gms.internal.zzlw.zza(this) {
            final /* synthetic */ zzlx zzQD;

            public void zze(final zzjj com_google_android_gms_internal_zzjj) {
                zzid c10971 = new zzid(this) {
                    final /* synthetic */ C10981 zzQE;

                    public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
                        try {
                            JSONObject jSONObject;
                            int i;
                            String str = (String) map.get("success");
                            String str2 = (String) map.get("failure");
                            if (TextUtils.isEmpty(str2)) {
                                jSONObject = new JSONObject(str);
                                i = 1;
                            } else {
                                jSONObject = new JSONObject(str2);
                                i = 0;
                            }
                            if (str.equals(jSONObject.optString("ads_id", ""))) {
                                com_google_android_gms_internal_zzjj.zzb("/nativeAdPreProcess", com_google_android_gms_internal_zzlx_zzb.zzQU);
                                if (i != 0) {
                                    JSONArray optJSONArray = jSONObject.optJSONArray("ads");
                                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                                        this.zzQE.zzQD.zzU(3);
                                        com_google_android_gms_internal_zzqj.zzh(null);
                                        return;
                                    }
                                    com_google_android_gms_internal_zzqj.zzh(optJSONArray.getJSONObject(0));
                                    return;
                                }
                                this.zzQE.zzQD.zzU(0);
                                zzac.zza(this.zzQE.zzQD.zzjf(), (Object) "Unable to set the ad state error!");
                                com_google_android_gms_internal_zzqj.zzh(null);
                            }
                        } catch (Throwable e) {
                            zzqf.zzb("Malformed native JSON response.", e);
                        }
                    }
                };
                com_google_android_gms_internal_zzlx_zzb.zzQU = c10971;
                com_google_android_gms_internal_zzjj.zza("/nativeAdPreProcess", c10971);
                try {
                    JSONObject jSONObject = new JSONObject(this.zzQD.zzPR.zzWm.body);
                    jSONObject.put("ads_id", str);
                    com_google_android_gms_internal_zzjj.zza("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
                } catch (Throwable e) {
                    zzqf.zzc("Exception occurred while invoking javascript", e);
                    com_google_android_gms_internal_zzqj.zzh(null);
                }
            }

            public void zzjd() {
                com_google_android_gms_internal_zzqj.zzh(null);
            }
        });
        return (JSONObject) com_google_android_gms_internal_zzqj.get(zzQl, TimeUnit.MILLISECONDS);
    }

    private zzpb zzb(com.google.android.gms.internal.zzha.zza com_google_android_gms_internal_zzha_zza) {
        int i;
        synchronized (this.zzrJ) {
            i = this.zzPY;
            if (com_google_android_gms_internal_zzha_zza == null && this.zzPY == -2) {
                i = 0;
            }
        }
        return new zzpb(this.zzPR.zzTi.zzRy, null, this.zzPR.zzWm.zzKF, i, this.zzPR.zzWm.zzKG, this.zzQx, this.zzPR.zzWm.orientation, this.zzPR.zzWm.zzKL, this.zzPR.zzTi.zzRB, false, null, null, null, null, null, 0, this.zzPR.zzvr, this.zzPR.zzWm.zzSm, this.zzPR.zzWg, this.zzPR.zzWh, this.zzPR.zzWm.zzSs, this.zzQy, i != -2 ? null : com_google_android_gms_internal_zzha_zza, null, null, null, this.zzPR.zzWm.zzSF, this.zzPR.zzWm.zzSG, null, this.zzPR.zzWm.zzKI, this.zzQz);
    }

    static zzqw zzb(zzqm<zzqw> com_google_android_gms_internal_zzqm_com_google_android_gms_internal_zzqw) {
        Throwable e;
        try {
            return (zzqw) com_google_android_gms_internal_zzqm_com_google_android_gms_internal_zzqw.get((long) ((Integer) zzgd.zzEs.get()).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e2) {
            zzqf.zzc("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            e2 = e3;
            zzqf.zzc("Exception occurred while waiting for video to load", e2);
        } catch (TimeoutException e4) {
            e2 = e4;
            zzqf.zzc("Exception occurred while waiting for video to load", e2);
        } catch (CancellationException e5) {
            e2 = e5;
            zzqf.zzc("Exception occurred while waiting for video to load", e2);
        }
        return null;
    }

    private Integer zzb(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    private void zzb(zzhn com_google_android_gms_internal_zzhn, String str) {
        try {
            zzhr zzz = this.zzQv.zzz(com_google_android_gms_internal_zzhn.getCustomTemplateId());
            if (zzz != null) {
                zzz.zza(com_google_android_gms_internal_zzhn, str);
            }
        } catch (Throwable e) {
            zzqf.zzc(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    private String[] zzd(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private static List<Drawable> zzh(List<zzgu> list) throws RemoteException {
        List<Drawable> arrayList = new ArrayList();
        for (zzgu zzfP : list) {
            arrayList.add((Drawable) zzd.zzF(zzfP.zzfP()));
        }
        return arrayList;
    }

    public /* synthetic */ Object call() throws Exception {
        return zzje();
    }

    public void zzU(int i) {
        synchronized (this.zzrJ) {
            this.zzQw = true;
            this.zzPY = i;
        }
    }

    zzlw zza(Context context, com.google.android.gms.internal.zzpb.zza com_google_android_gms_internal_zzpb_zza, zzs com_google_android_gms_ads_internal_zzs, zzaw com_google_android_gms_internal_zzaw) {
        return new zzlw(context, com_google_android_gms_internal_zzpb_zza, com_google_android_gms_ads_internal_zzs, com_google_android_gms_internal_zzaw);
    }

    zzly zza(Context context, zzaw com_google_android_gms_internal_zzaw, com.google.android.gms.internal.zzpb.zza com_google_android_gms_internal_zzpb_zza, zzgl com_google_android_gms_internal_zzgl, zzs com_google_android_gms_ads_internal_zzs) {
        return new zzly(context, com_google_android_gms_internal_zzaw, com_google_android_gms_internal_zzpb_zza, com_google_android_gms_internal_zzgl, com_google_android_gms_ads_internal_zzs);
    }

    public zzqm<zzgu> zza(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, z, z2);
    }

    public List<zzqm<zzgu>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List<zzqm<zzgu>> arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            zza(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(zza(jSONObject2, z, z2));
        }
        return arrayList;
    }

    public Future<zzgu> zza(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, optBoolean, z);
    }

    public void zza(int i, boolean z) {
        if (z) {
            zzU(i);
        }
    }

    protected zza zzc(JSONObject jSONObject) throws ExecutionException, InterruptedException, JSONException, TimeoutException {
        if (zzjf() || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.zzPR.zzTi.zzvF != null ? this.zzPR.zzTi.zzvF.zzHa : false;
        boolean z2 = this.zzPR.zzTi.zzvF != null ? this.zzPR.zzTi.zzvF.zzHc : false;
        if ("2".equals(string)) {
            return new zzlz(z, z2);
        }
        if ("1".equals(string)) {
            return new zzma(z, z2);
        }
        if ("3".equals(string)) {
            final String string2 = jSONObject.getString("custom_template_id");
            final zzqj com_google_android_gms_internal_zzqj = new zzqj();
            zzpo.zzXC.post(new Runnable(this) {
                final /* synthetic */ zzlx zzQD;

                public void run() {
                    com_google_android_gms_internal_zzqj.zzh((zzhs) this.zzQD.zzQv.zzcu().get(string2));
                }
            });
            if (com_google_android_gms_internal_zzqj.get(zzQl, TimeUnit.MILLISECONDS) != null) {
                return new zzmb(z);
            }
            string2 = "No handler for custom template: ";
            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
            zzqf.m9e(valueOf.length() != 0 ? string2.concat(valueOf) : new String(string2));
        } else {
            zzU(0);
        }
        return null;
    }

    public zzqm<zzqw> zzc(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new zzqk(null);
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            return zza(this.mContext, this.zzGP, this.zzPR, this.zzsn, this.zzQv).zze(optJSONObject);
        }
        zzqf.zzbh("Required field 'vast_xml' is missing");
        return new zzqk(null);
    }

    public zzqm<zzgs> zzd(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new zzqk(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        final int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        final int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        final int i = (this.zzPR.zzTi.zzvF == null || this.zzPR.zzTi.zzvF.versionCode < 2) ? 1 : this.zzPR.zzTi.zzvF.zzHd;
        final boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
        }
        final String str = optString;
        final Integer num = zzb2;
        final Integer num2 = zzb;
        final int i2 = optInt;
        return zzql.zza(zzql.zzo(arrayList), new com.google.android.gms.internal.zzql.zza<List<zzgu>, zzgs>(this) {
            public /* synthetic */ Object apply(Object obj) {
                return zzj((List) obj);
            }

            public zzgs zzj(List<zzgu> list) {
                zzgs com_google_android_gms_internal_zzgs;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            com_google_android_gms_internal_zzgs = new zzgs(str, zzlx.zzh(list), num, num2, i2 > 0 ? Integer.valueOf(i2) : null, optInt3 + optInt2, i, optBoolean);
                            return com_google_android_gms_internal_zzgs;
                        }
                    } catch (Throwable e) {
                        zzqf.zzb("Could not get attribution icon", e);
                        return null;
                    }
                }
                com_google_android_gms_internal_zzgs = null;
                return com_google_android_gms_internal_zzgs;
            }
        });
    }

    public zzpb zzje() {
        try {
            this.zzGN.zziU();
            String zzjg = zzjg();
            JSONObject zzaH = zzaH(zzjg);
            com.google.android.gms.internal.zzha.zza zza = zza(zzc(zzaH), zzaH, zzjg);
            zza(zza);
            return zzb(zza);
        } catch (CancellationException e) {
            if (!this.zzQw) {
                zzU(0);
            }
            return zzb(null);
        } catch (ExecutionException e2) {
            if (this.zzQw) {
                zzU(0);
            }
            return zzb(null);
        } catch (InterruptedException e3) {
            if (this.zzQw) {
                zzU(0);
            }
            return zzb(null);
        } catch (Throwable e4) {
            zzqf.zzc("Malformed native JSON response.", e4);
            if (this.zzQw) {
                zzU(0);
            }
            return zzb(null);
        } catch (Throwable e42) {
            zzqf.zzc("Timeout when loading native ad.", e42);
            if (this.zzQw) {
                zzU(0);
            }
            return zzb(null);
        }
    }

    public boolean zzjf() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzQw;
        }
        return z;
    }

    String zzjg() {
        return UUID.randomUUID().toString();
    }
}
