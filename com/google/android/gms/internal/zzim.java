package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
public class zzim implements zzid {
    private final Map<String, zza> zzIt = new HashMap();
    private final Object zzrJ = new Object();

    public interface zza {
    }

    public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        map.get("fail_reason");
        String str3 = (String) map.get("result");
        synchronized (this.zzrJ) {
            if (((zza) this.zzIt.remove(str)) == null) {
                str2 = "Received result for unexpected method invocation: ";
                str = String.valueOf(str);
                zzqf.zzbh(str.length() != 0 ? str2.concat(str) : new String(str2));
            } else if (!TextUtils.isEmpty(str2)) {
            } else if (str3 == null) {
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                } catch (JSONException e) {
                    e.getMessage();
                }
            }
        }
    }
}
