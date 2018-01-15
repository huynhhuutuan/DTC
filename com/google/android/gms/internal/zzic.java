package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zzw;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
public final class zzic {
    public static final zzid zzHD = new C10541();
    public static final zzid zzHE = new C10629();
    public static final zzid zzHF = new zzid() {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            PackageManager packageManager = com_google_android_gms_internal_zzqw.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            Object optString2 = jSONObject2.optString("u");
                            Object optString3 = jSONObject2.optString("i");
                            Object optString4 = jSONObject2.optString("m");
                            Object optString5 = jSONObject2.optString("p");
                            Object optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            try {
                                jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                            } catch (Throwable e) {
                                zzqf.zzb("Error constructing openable urls response.", e);
                            }
                        } catch (Throwable e2) {
                            zzqf.zzb("Error parsing the intent data.", e2);
                        }
                    }
                    com_google_android_gms_internal_zzqw.zzb("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    com_google_android_gms_internal_zzqw.zzb("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                com_google_android_gms_internal_zzqw.zzb("openableIntents", new JSONObject());
            }
        }
    };
    public static final zzid zzHG = new zzid() {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                zzqf.zzbh("URL missing from click GMSG.");
                return;
            }
            Uri zza;
            String zzF;
            Uri parse = Uri.parse(str);
            try {
                zzaw zzlx = com_google_android_gms_internal_zzqw.zzlx();
                if (zzlx != null && zzlx.zzc(parse)) {
                    zza = zzlx.zza(parse, com_google_android_gms_internal_zzqw.getContext(), com_google_android_gms_internal_zzqw.getView());
                    if (zzw.zzdl().zzjU() && TextUtils.isEmpty(zza.getQueryParameter("fbs_aeid"))) {
                        zzF = zzw.zzdl().zzF(com_google_android_gms_internal_zzqw.getContext());
                        zza = zzw.zzcM().zza(zza, "fbs_aeid", zzF);
                        zzw.zzdl().zzf(com_google_android_gms_internal_zzqw.getContext(), zzF);
                    }
                    new zzpy(com_google_android_gms_internal_zzqw.getContext(), com_google_android_gms_internal_zzqw.zzly().zzba, zza.toString()).zziP();
                }
            } catch (zzax e) {
                String str2 = "Unable to append parameter to URL: ";
                str = String.valueOf(str);
                zzqf.zzbh(str.length() != 0 ? str2.concat(str) : new String(str2));
            }
            zza = parse;
            zzF = zzw.zzdl().zzF(com_google_android_gms_internal_zzqw.getContext());
            zza = zzw.zzcM().zza(zza, "fbs_aeid", zzF);
            zzw.zzdl().zzf(com_google_android_gms_internal_zzqw.getContext(), zzF);
            new zzpy(com_google_android_gms_internal_zzqw.getContext(), com_google_android_gms_internal_zzqw.zzly().zzba, zza.toString()).zziP();
        }
    };
    public static final zzid zzHH = new zzid() {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            zze zzlt = com_google_android_gms_internal_zzqw.zzlt();
            if (zzlt != null) {
                zzlt.close();
                return;
            }
            zzlt = com_google_android_gms_internal_zzqw.zzlu();
            if (zzlt != null) {
                zzlt.close();
            } else {
                zzqf.zzbh("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    };
    public static final zzid zzHI = new zzid() {
        private void zzd(zzqw com_google_android_gms_internal_zzqw) {
            zzqf.zzbg("Received support message, responding.");
            com.google.android.gms.ads.internal.zze zzby = com_google_android_gms_internal_zzqw.zzby();
            if (!(zzby == null || zzby.zzsO == null)) {
                com_google_android_gms_internal_zzqw.getContext();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", "checkSupport");
                jSONObject.put("supports", false);
                com_google_android_gms_internal_zzqw.zzb("appStreaming", jSONObject);
            } catch (Throwable th) {
                zzw.zzcQ().zza(th, "DefaultGmsgHandlers.processCheckSupportsMessage");
            }
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if ("checkSupport".equals(map.get("action"))) {
                zzd(com_google_android_gms_internal_zzqw);
                return;
            }
            zze zzlt = com_google_android_gms_internal_zzqw.zzlt();
            if (zzlt != null) {
                zzlt.zzg(com_google_android_gms_internal_zzqw, map);
            }
        }
    };
    public static final zzid zzHJ = new zzid() {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            com_google_android_gms_internal_zzqw.zzL("1".equals(map.get("custom_close")));
        }
    };
    public static final zzid zzHK = new zzid() {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                zzqf.zzbh("URL missing from httpTrack GMSG.");
            } else {
                new zzpy(com_google_android_gms_internal_zzqw.getContext(), com_google_android_gms_internal_zzqw.zzly().zzba, str).zziP();
            }
        }
    };
    public static final zzid zzHL = new zzid() {
        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = "Received log message: ";
            String valueOf = String.valueOf((String) map.get("string"));
            zzqf.zzbg(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    };
    public static final zzid zzHM = new C10552();
    public static final zzid zzHN = new C10563();
    public static final zzid zzHO = new C10574();
    public static final zzid zzHP = new C10585();
    public static final zzid zzHQ = new zzio();
    public static final zzid zzHR = new zzip();
    public static final zzid zzHS = new zzij();
    public static final zzid zzHT = new zzit();
    public static final zzid zzHU = new zzib();
    public static final zzim zzHV = new zzim();
    public static final zzid zzHW = new C10596();
    public static final zzid zzHX = new C10607();
    public static final zzid zzHY = new C10618();

    class C10541 implements zzid {
        C10541() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        }
    }

    class C10552 implements zzid {
        C10552() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            zzgy zzlL = com_google_android_gms_internal_zzqw.zzlL();
            if (zzlL != null) {
                zzlL.zzfX();
            }
        }
    }

    class C10563 implements zzid {
        C10563() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = (String) map.get("ty");
            String str2 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt((String) map.get("tx"));
                int parseInt2 = Integer.parseInt(str);
                int parseInt3 = Integer.parseInt(str2);
                zzaw zzlx = com_google_android_gms_internal_zzqw.zzlx();
                if (zzlx != null) {
                    zzlx.zzT().zza(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                zzqf.zzbh("Could not parse touch parameters from gmsg.");
            }
        }
    }

    class C10574 implements zzid {
        C10574() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (((Boolean) zzgd.zzDD.get()).booleanValue()) {
                com_google_android_gms_internal_zzqw.zzM(!Boolean.parseBoolean((String) map.get("disabled")));
            }
        }
    }

    class C10585 implements zzid {
        C10585() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = (String) map.get("action");
            if ("pause".equals(str)) {
                com_google_android_gms_internal_zzqw.zzbV();
            } else if ("resume".equals(str)) {
                com_google_android_gms_internal_zzqw.zzbW();
            }
        }
    }

    class C10596 implements zzid {
        C10596() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                com_google_android_gms_internal_zzqw.zzlv().zzlU();
            } else if (map.keySet().contains("stop")) {
                com_google_android_gms_internal_zzqw.zzlv().zzlV();
            } else if (map.keySet().contains("cancel")) {
                com_google_android_gms_internal_zzqw.zzlv().zzlW();
            }
        }
    }

    class C10607 implements zzid {
        C10607() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                com_google_android_gms_internal_zzqw.zzN(true);
            }
            if (map.keySet().contains("stop")) {
                com_google_android_gms_internal_zzqw.zzN(false);
            }
        }
    }

    class C10618 implements zzid {
        C10618() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            com_google_android_gms_internal_zzqw.zza("locationReady", zzw.zzcM().zza((View) com_google_android_gms_internal_zzqw, (WindowManager) com_google_android_gms_internal_zzqw.getContext().getSystemService("window")));
            zzqf.zzbh("GET LOCATION COMPILED");
        }
    }

    class C10629 implements zzid {
        C10629() {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                zzqf.zzbh("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            Map hashMap = new HashMap();
            PackageManager packageManager = com_google_android_gms_internal_zzqw.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            com_google_android_gms_internal_zzqw.zza("openableURLs", hashMap);
        }
    }
}
