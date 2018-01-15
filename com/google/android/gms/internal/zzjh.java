package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzh;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzjf.zza;
import org.json.JSONObject;

@zzme
public class zzjh implements zzjf {
    private final zzqw zzIs;

    public zzjh(Context context, zzqh com_google_android_gms_internal_zzqh, @Nullable zzaw com_google_android_gms_internal_zzaw, zze com_google_android_gms_ads_internal_zze) {
        this.zzIs = zzw.zzcN().zza(context, new zzeg(), false, false, com_google_android_gms_internal_zzaw, com_google_android_gms_internal_zzqh, null, null, com_google_android_gms_ads_internal_zze);
        this.zzIs.getWebView().setWillNotDraw(true);
    }

    private void runOnUiThread(Runnable runnable) {
        if (zzel.zzeT().zzlj()) {
            runnable.run();
        } else {
            zzpo.zzXC.post(runnable);
        }
    }

    public void destroy() {
        this.zzIs.destroy();
    }

    public void zza(zzdx com_google_android_gms_internal_zzdx, zzh com_google_android_gms_ads_internal_overlay_zzh, zzhz com_google_android_gms_internal_zzhz, zzq com_google_android_gms_ads_internal_overlay_zzq, boolean z, zzif com_google_android_gms_internal_zzif, zzih com_google_android_gms_internal_zzih, zzf com_google_android_gms_ads_internal_zzf, zzkx com_google_android_gms_internal_zzkx) {
        this.zzIs.zzlv().zza(com_google_android_gms_internal_zzdx, com_google_android_gms_ads_internal_overlay_zzh, com_google_android_gms_internal_zzhz, com_google_android_gms_ads_internal_overlay_zzq, z, com_google_android_gms_internal_zzif, com_google_android_gms_internal_zzih, new zzf(this.zzIs.getContext(), false), com_google_android_gms_internal_zzkx, null);
    }

    public void zza(final zza com_google_android_gms_internal_zzjf_zza) {
        this.zzIs.zzlv().zza(new zzqx.zza(this) {
            public void zza(zzqw com_google_android_gms_internal_zzqw, boolean z) {
                com_google_android_gms_internal_zzjf_zza.zzgN();
            }
        });
    }

    public void zza(String str, zzid com_google_android_gms_internal_zzid) {
        this.zzIs.zzlv().zza(str, com_google_android_gms_internal_zzid);
    }

    public void zza(final String str, final JSONObject jSONObject) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzjh zzJG;

            public void run() {
                this.zzJG.zzIs.zza(str, jSONObject);
            }
        });
    }

    public void zzam(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str});
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzjh zzJG;

            public void run() {
                this.zzJG.zzIs.loadData(format, "text/html", "UTF-8");
            }
        });
    }

    public void zzan(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzjh zzJG;

            public void run() {
                this.zzJG.zzIs.loadUrl(str);
            }
        });
    }

    public void zzao(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzjh zzJG;

            public void run() {
                this.zzJG.zzIs.loadData(str, "text/html", "UTF-8");
            }
        });
    }

    public void zzb(String str, zzid com_google_android_gms_internal_zzid) {
        this.zzIs.zzlv().zzb(str, com_google_android_gms_internal_zzid);
    }

    public void zzb(String str, JSONObject jSONObject) {
        this.zzIs.zzb(str, jSONObject);
    }

    public zzjk zzgM() {
        return new zzjl(this);
    }

    public void zzj(final String str, final String str2) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzjh zzJG;

            public void run() {
                this.zzJG.zzIs.zzj(str, str2);
            }
        });
    }
}
