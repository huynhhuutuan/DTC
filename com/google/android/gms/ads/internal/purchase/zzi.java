package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.common.stats.zza;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzqf;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
public class zzi {
    public void zza(Context context, boolean z, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Intent intent = new Intent();
        intent.setClassName(context, InAppPurchaseActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        GInAppPurchaseManagerInfoParcel.zza(intent, gInAppPurchaseManagerInfoParcel);
        zzw.zzcM().zzb(context, intent);
    }

    public String zzaE(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("developerPayload");
            } catch (JSONException e) {
                zzqf.zzbh("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public String zzaF(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("purchaseToken");
            } catch (JSONException e) {
                zzqf.zzbh("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public int zzd(Intent intent) {
        if (intent == null) {
            return 5;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            zzqf.zzbh("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String str = "Unexpected type for intent response code. ";
            String valueOf = String.valueOf(obj.getClass().getName());
            zzqf.zzbh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 5;
        }
    }

    public int zzd(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzqf.zzbh("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String str = "Unexpected type for intent response code. ";
            String valueOf = String.valueOf(obj.getClass().getName());
            zzqf.zzbh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 5;
        }
    }

    public String zze(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    public String zzf(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_DATA_SIGNATURE");
    }

    public void zzv(final Context context) {
        zzpo.zzb(new Runnable(this) {

            class C03551 implements ServiceConnection {
                final /* synthetic */ C03561 zzPO;

                C03551(C03561 c03561) {
                    this.zzPO = c03561;
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    boolean z = false;
                    zzb com_google_android_gms_ads_internal_purchase_zzb = new zzb(context.getApplicationContext(), false);
                    com_google_android_gms_ads_internal_purchase_zzb.zzV(iBinder);
                    int zzb = com_google_android_gms_ads_internal_purchase_zzb.zzb(3, context.getPackageName(), "inapp");
                    zzpe zzcQ = zzw.zzcQ();
                    if (zzb == 0) {
                        z = true;
                    }
                    zzcQ.zzI(z);
                    zza.zzyJ().zza(context, this);
                    com_google_android_gms_ads_internal_purchase_zzb.destroy();
                }

                public void onServiceDisconnected(ComponentName componentName) {
                }
            }

            public void run() {
                ServiceConnection c03551 = new C03551(this);
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                zza.zzyJ().zza(context, intent, c03551, 1);
            }
        });
    }
}
