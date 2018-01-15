package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONObject;

@zzme
public class zzcv implements zzcx {
    private final zzct zzwG;
    private final zzjj zzwH;
    private final zzid zzwI = new C10061(this);
    private final zzid zzwJ = new C10072(this);
    private final zzid zzwK = new C10083(this);

    class C10061 implements zzid {
        final /* synthetic */ zzcv zzwL;

        C10061(zzcv com_google_android_gms_internal_zzcv) {
            this.zzwL = com_google_android_gms_internal_zzcv;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            this.zzwL.zzwG.zzb(com_google_android_gms_internal_zzqw, (Map) map);
        }
    }

    class C10072 implements zzid {
        final /* synthetic */ zzcv zzwL;

        C10072(zzcv com_google_android_gms_internal_zzcv) {
            this.zzwL = com_google_android_gms_internal_zzcv;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            this.zzwL.zzwG.zza(this.zzwL, (Map) map);
        }
    }

    class C10083 implements zzid {
        final /* synthetic */ zzcv zzwL;

        C10083(zzcv com_google_android_gms_internal_zzcv) {
            this.zzwL = com_google_android_gms_internal_zzcv;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            this.zzwL.zzwG.zzc(map);
        }
    }

    public zzcv(zzct com_google_android_gms_internal_zzct, zzjj com_google_android_gms_internal_zzjj) {
        this.zzwG = com_google_android_gms_internal_zzct;
        this.zzwH = com_google_android_gms_internal_zzjj;
        zzc(this.zzwH);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.zzwG.zzdR().zzdC());
        zzqf.zzbf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    void zzc(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zza("/updateActiveView", this.zzwI);
        com_google_android_gms_internal_zzjj.zza("/untrackActiveViewUnit", this.zzwJ);
        com_google_android_gms_internal_zzjj.zza("/visibilityChanged", this.zzwK);
    }

    public void zzc(JSONObject jSONObject, boolean z) {
        if (z) {
            this.zzwG.zzb((zzcx) this);
        } else {
            this.zzwH.zza("AFMA_updateActiveView", jSONObject);
        }
    }

    void zzd(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zzb("/visibilityChanged", this.zzwK);
        com_google_android_gms_internal_zzjj.zzb("/untrackActiveViewUnit", this.zzwJ);
        com_google_android_gms_internal_zzjj.zzb("/updateActiveView", this.zzwI);
    }

    public boolean zzdV() {
        return true;
    }

    public void zzdW() {
        zzd(this.zzwH);
    }
}
