package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzji.zzc;
import com.google.android.gms.internal.zzqp.zza;
import com.google.android.gms.internal.zzqp.zzb;
import java.util.Map;
import org.json.JSONObject;

@zzme
public class zzcw implements zzcx {
    private final zzct zzwG;
    private final zzid zzwI = new C10135(this);
    private final zzid zzwJ = new C10146(this);
    private final zzid zzwK = new C10157(this);
    private zzc zzwM;
    private boolean zzwN;
    private final zzid zzwO = new C10168(this);

    class C10091 implements zzqp.zzc<zzjj> {
        final /* synthetic */ zzcw zzwP;

        C10091(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zzb(zzjj com_google_android_gms_internal_zzjj) {
            this.zzwP.zzwN = true;
            this.zzwP.zzc(com_google_android_gms_internal_zzjj);
        }

        public /* synthetic */ void zzd(Object obj) {
            zzb((zzjj) obj);
        }
    }

    class C10102 implements zza {
        final /* synthetic */ zzcw zzwP;

        C10102(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void run() {
            this.zzwP.zzwG.zzb(this.zzwP);
        }
    }

    class C10124 implements zzqp.zzc<zzjj> {
        final /* synthetic */ zzcw zzwP;

        C10124(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zzb(zzjj com_google_android_gms_internal_zzjj) {
            this.zzwP.zzd(com_google_android_gms_internal_zzjj);
        }

        public /* synthetic */ void zzd(Object obj) {
            zzb((zzjj) obj);
        }
    }

    class C10135 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C10135(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                this.zzwP.zzwG.zzb(com_google_android_gms_internal_zzqw, (Map) map);
            }
        }
    }

    class C10146 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C10146(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                this.zzwP.zzwG.zza(this.zzwP, (Map) map);
            }
        }
    }

    class C10157 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C10157(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                this.zzwP.zzwG.zzc(map);
            }
        }
    }

    class C10168 implements zzid {
        final /* synthetic */ zzcw zzwP;

        C10168(zzcw com_google_android_gms_internal_zzcw) {
            this.zzwP = com_google_android_gms_internal_zzcw;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzwP.zzwG.zzb((Map) map)) {
                zzic.zzHS.zza(com_google_android_gms_internal_zzqw, map);
            }
        }
    }

    public zzcw(zzct com_google_android_gms_internal_zzct, zzji com_google_android_gms_internal_zzji) {
        this.zzwG = com_google_android_gms_internal_zzct;
        this.zzwM = com_google_android_gms_internal_zzji.zzgO();
        this.zzwM.zza(new C10091(this), new C10102(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.zzwG.zzdR().zzdC());
        zzqf.zzbf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    void zzc(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zza("/updateActiveView", this.zzwI);
        com_google_android_gms_internal_zzjj.zza("/untrackActiveViewUnit", this.zzwJ);
        com_google_android_gms_internal_zzjj.zza("/visibilityChanged", this.zzwK);
        if (zzw.zzdl().zzjQ()) {
            com_google_android_gms_internal_zzjj.zza("/logScionEvent", this.zzwO);
        }
    }

    public void zzc(final JSONObject jSONObject, boolean z) {
        this.zzwM.zza(new zzqp.zzc<zzjj>(this) {
            public void zzb(zzjj com_google_android_gms_internal_zzjj) {
                com_google_android_gms_internal_zzjj.zza("AFMA_updateActiveView", jSONObject);
            }

            public /* synthetic */ void zzd(Object obj) {
                zzb((zzjj) obj);
            }
        }, new zzb());
    }

    void zzd(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zzb("/visibilityChanged", this.zzwK);
        com_google_android_gms_internal_zzjj.zzb("/untrackActiveViewUnit", this.zzwJ);
        com_google_android_gms_internal_zzjj.zzb("/updateActiveView", this.zzwI);
        if (zzw.zzdl().zzjQ()) {
            com_google_android_gms_internal_zzjj.zzb("/logScionEvent", this.zzwO);
        }
    }

    public boolean zzdV() {
        return this.zzwN;
    }

    public void zzdW() {
        this.zzwM.zza(new C10124(this), new zzb());
        this.zzwM.release();
    }
}
