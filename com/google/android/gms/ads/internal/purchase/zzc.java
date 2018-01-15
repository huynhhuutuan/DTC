package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.stats.zza;
import com.google.android.gms.internal.zzli;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzpj;
import com.google.android.gms.internal.zzpk;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzqf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzme
public class zzc extends zzpj implements ServiceConnection {
    private Context mContext;
    private zzli zzJv;
    private boolean zzPs;
    private zzb zzPt;
    private zzh zzPu;
    private List<zzf> zzPv;
    private zzk zzPw;
    private final Object zzrJ;

    public zzc(Context context, zzli com_google_android_gms_internal_zzli, zzk com_google_android_gms_ads_internal_purchase_zzk) {
        this(context, com_google_android_gms_internal_zzli, com_google_android_gms_ads_internal_purchase_zzk, new zzb(context), zzh.zzu(context.getApplicationContext()));
    }

    zzc(Context context, zzli com_google_android_gms_internal_zzli, zzk com_google_android_gms_ads_internal_purchase_zzk, zzb com_google_android_gms_ads_internal_purchase_zzb, zzh com_google_android_gms_ads_internal_purchase_zzh) {
        this.zzrJ = new Object();
        this.zzPs = false;
        this.zzPv = null;
        this.mContext = context;
        this.zzJv = com_google_android_gms_internal_zzli;
        this.zzPw = com_google_android_gms_ads_internal_purchase_zzk;
        this.zzPt = com_google_android_gms_ads_internal_purchase_zzb;
        this.zzPu = com_google_android_gms_ads_internal_purchase_zzh;
        this.zzPv = this.zzPu.zzg(10);
    }

    private void zze(long j) {
        do {
            if (!zzf(j)) {
                zzpk.m28v("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.zzPs);
    }

    private boolean zzf(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.zzrJ.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            zzqf.zzbh("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zzrJ) {
            this.zzPt.zzV(iBinder);
            zziI();
            this.zzPs = true;
            this.zzrJ.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zzqf.zzbg("In-app billing service disconnected.");
        this.zzPt.destroy();
    }

    public void onStop() {
        synchronized (this.zzrJ) {
            zza.zzyJ().zza(this.mContext, this);
            this.zzPt.destroy();
        }
    }

    protected void zza(final zzf com_google_android_gms_ads_internal_purchase_zzf, String str, String str2) {
        final Intent intent = new Intent();
        zzw.zzda();
        intent.putExtra("RESPONSE_CODE", 0);
        zzw.zzda();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        zzw.zzda();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        zzpo.zzXC.post(new Runnable(this) {
            final /* synthetic */ zzc zzPy;

            public void run() {
                try {
                    if (this.zzPy.zzPw.zza(com_google_android_gms_ads_internal_purchase_zzf.zzPH, -1, intent)) {
                        this.zzPy.zzJv.zza(new zzg(this.zzPy.mContext, com_google_android_gms_ads_internal_purchase_zzf.zzPI, true, -1, intent, com_google_android_gms_ads_internal_purchase_zzf));
                    } else {
                        this.zzPy.zzJv.zza(new zzg(this.zzPy.mContext, com_google_android_gms_ads_internal_purchase_zzf.zzPI, false, -1, intent, com_google_android_gms_ads_internal_purchase_zzf));
                    }
                } catch (RemoteException e) {
                    zzqf.zzbh("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    public void zzco() {
        synchronized (this.zzrJ) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            zza.zzyJ().zza(this.mContext, intent, (ServiceConnection) this, 1);
            zze(SystemClock.elapsedRealtime());
            zza.zzyJ().zza(this.mContext, this);
            this.zzPt.destroy();
        }
    }

    protected void zziI() {
        if (!this.zzPv.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (zzf com_google_android_gms_ads_internal_purchase_zzf : this.zzPv) {
                hashMap.put(com_google_android_gms_ads_internal_purchase_zzf.zzPI, com_google_android_gms_ads_internal_purchase_zzf);
            }
            String str = null;
            while (true) {
                Bundle zzn = this.zzPt.zzn(this.mContext.getPackageName(), str);
                if (zzn == null || zzw.zzda().zzd(zzn) != 0) {
                    break;
                }
                ArrayList stringArrayList = zzn.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = zzn.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = zzn.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String string = zzn.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        str = (String) stringArrayList.get(i);
                        String str2 = (String) stringArrayList2.get(i);
                        String str3 = (String) stringArrayList3.get(i);
                        zzf com_google_android_gms_ads_internal_purchase_zzf2 = (zzf) hashMap.get(str);
                        if (com_google_android_gms_ads_internal_purchase_zzf2.zzPH.equals(zzw.zzda().zzaE(str2))) {
                            zza(com_google_android_gms_ads_internal_purchase_zzf2, str2, str3);
                            hashMap.remove(str);
                        }
                    }
                }
                if (string == null || hashMap.isEmpty()) {
                    break;
                }
                str = string;
            }
            for (String str4 : hashMap.keySet()) {
                this.zzPu.zza((zzf) hashMap.get(str4));
            }
        }
    }
}
