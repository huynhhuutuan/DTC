package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzai;
import com.google.android.gms.internal.zzak.zza;
import com.google.android.gms.internal.zzbjf;
import com.google.android.gms.internal.zzbjf.zzc;
import com.google.android.gms.internal.zzbjf.zzd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class zzbh {
    private static zza zzK(Object obj) throws JSONException {
        return zzdl.zzR(zzL(obj));
    }

    static Object zzL(Object obj) throws JSONException {
        if (obj instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        } else if (JSONObject.NULL.equals(obj)) {
            throw new RuntimeException("JSON nulls are not supported");
        } else if (!(obj instanceof JSONObject)) {
            return obj;
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            Map hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, zzL(jSONObject.get(str)));
            }
            return hashMap;
        }
    }

    public static zzc zzhl(String str) throws JSONException {
        zza zzK = zzK(new JSONObject(str));
        zzd zzTx = zzc.zzTx();
        for (int i = 0; i < zzK.zzlv.length; i++) {
            zzTx.zzc(zzbjf.zza.zzTv().zzb(zzai.INSTANCE_NAME.toString(), zzK.zzlv[i]).zzb(zzai.FUNCTION.toString(), zzdl.zzhw(zzn.zzQc())).zzb(zzn.zzQd(), zzK.zzlw[i]).zzTw());
        }
        return zzTx.zzTz();
    }
}
