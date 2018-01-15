package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.zznu.zza;

public class zzfo extends zza {
    private zznw zzAF;

    class C05431 implements Runnable {
        final /* synthetic */ zzfo zzAG;

        C05431(zzfo com_google_android_gms_internal_zzfo) {
            this.zzAG = com_google_android_gms_internal_zzfo;
        }

        public void run() {
            if (this.zzAG.zzAF != null) {
                try {
                    this.zzAG.zzAF.onRewardedVideoAdFailedToLoad(1);
                } catch (Throwable e) {
                    zzqf.zzc("Could not notify onRewardedVideoAdFailedToLoad event.", e);
                }
            }
        }
    }

    public void destroy() throws RemoteException {
    }

    public boolean isLoaded() throws RemoteException {
        return false;
    }

    public void pause() throws RemoteException {
    }

    public void resume() throws RemoteException {
    }

    public void setUserId(String str) throws RemoteException {
    }

    public void show() throws RemoteException {
    }

    public void zza(zznw com_google_android_gms_internal_zznw) throws RemoteException {
        this.zzAF = com_google_android_gms_internal_zznw;
    }

    public void zza(zzoa com_google_android_gms_internal_zzoa) throws RemoteException {
        zzqf.m9e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzqe.zzYP.post(new C05431(this));
    }

    public void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
