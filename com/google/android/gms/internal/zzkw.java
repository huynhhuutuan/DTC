package com.google.android.gms.internal;

import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import org.json.JSONObject;

@zzme
public class zzkw {
    private final zzqw zzIs;
    private final String zzMF;

    public zzkw(zzqw com_google_android_gms_internal_zzqw) {
        this(com_google_android_gms_internal_zzqw, "");
    }

    public zzkw(zzqw com_google_android_gms_internal_zzqw, String str) {
        this.zzIs = com_google_android_gms_internal_zzqw;
        this.zzMF = str;
    }

    public void zza(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zzIs.zzb("onScreenInfoChanged", new JSONObject().put(SettingsJsonConstants.ICON_WIDTH_KEY, i).put(SettingsJsonConstants.ICON_HEIGHT_KEY, i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (Throwable e) {
            zzqf.zzb("Error occured while obtaining screen information.", e);
        }
    }

    public void zzaA(String str) {
        try {
            this.zzIs.zzb("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (Throwable e) {
            zzqf.zzb("Error occured while dispatching ready Event.", e);
        }
    }

    public void zzaB(String str) {
        try {
            this.zzIs.zzb("onStateChanged", new JSONObject().put("state", str));
        } catch (Throwable e) {
            zzqf.zzb("Error occured while dispatching state change.", e);
        }
    }

    public void zzaz(String str) {
        try {
            this.zzIs.zzb("onError", new JSONObject().put(SettingsJsonConstants.PROMPT_MESSAGE_KEY, str).put("action", this.zzMF));
        } catch (Throwable e) {
            zzqf.zzb("Error occurred while dispatching error event.", e);
        }
    }

    public void zzb(int i, int i2, int i3, int i4) {
        try {
            this.zzIs.zzb("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put(SettingsJsonConstants.ICON_WIDTH_KEY, i3).put(SettingsJsonConstants.ICON_HEIGHT_KEY, i4));
        } catch (Throwable e) {
            zzqf.zzb("Error occured while dispatching size change.", e);
        }
    }

    public void zzc(int i, int i2, int i3, int i4) {
        try {
            this.zzIs.zzb("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put(SettingsJsonConstants.ICON_WIDTH_KEY, i3).put(SettingsJsonConstants.ICON_HEIGHT_KEY, i4));
        } catch (Throwable e) {
            zzqf.zzb("Error occured while dispatching default position.", e);
        }
    }
}
