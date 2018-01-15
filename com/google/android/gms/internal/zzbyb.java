package com.google.android.gms.internal;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

public class zzbyb extends CustomTabsServiceConnection {
    private WeakReference<zzbyc> zzcvV;

    public zzbyb(zzbyc com_google_android_gms_internal_zzbyc) {
        this.zzcvV = new WeakReference(com_google_android_gms_internal_zzbyc);
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbyc com_google_android_gms_internal_zzbyc = (zzbyc) this.zzcvV.get();
        if (com_google_android_gms_internal_zzbyc != null) {
            com_google_android_gms_internal_zzbyc.zza(customTabsClient);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zzbyc com_google_android_gms_internal_zzbyc = (zzbyc) this.zzcvV.get();
        if (com_google_android_gms_internal_zzbyc != null) {
            com_google_android_gms_internal_zzbyc.zzfI();
        }
    }
}
