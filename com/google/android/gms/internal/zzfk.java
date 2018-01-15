package com.google.android.gms.internal;

import android.os.RemoteException;

public class zzfk extends com.google.android.gms.internal.zzer.zza {
    private zzep zztk;

    private class zza extends com.google.android.gms.internal.zzeq.zza {
        final /* synthetic */ zzfk zzAC;

        class C05411 implements Runnable {
            final /* synthetic */ zza zzAD;

            C05411(zza com_google_android_gms_internal_zzfk_zza) {
                this.zzAD = com_google_android_gms_internal_zzfk_zza;
            }

            public void run() {
                if (this.zzAD.zzAC.zztk != null) {
                    try {
                        this.zzAD.zzAC.zztk.onAdFailedToLoad(1);
                    } catch (Throwable e) {
                        zzqf.zzc("Could not notify onAdFailedToLoad event.", e);
                    }
                }
            }
        }

        private zza(zzfk com_google_android_gms_internal_zzfk) {
            this.zzAC = com_google_android_gms_internal_zzfk;
        }

        public String getMediationAdapterClassName() throws RemoteException {
            return null;
        }

        public boolean isLoading() throws RemoteException {
            return false;
        }

        public void zzf(zzec com_google_android_gms_internal_zzec) throws RemoteException {
            zzqf.m9e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
            zzqe.zzYP.post(new C05411(this));
        }
    }

    public void zza(zzhc com_google_android_gms_internal_zzhc) throws RemoteException {
    }

    public void zza(zzhp com_google_android_gms_internal_zzhp) throws RemoteException {
    }

    public void zza(zzhq com_google_android_gms_internal_zzhq) throws RemoteException {
    }

    public void zza(String str, zzhs com_google_android_gms_internal_zzhs, zzhr com_google_android_gms_internal_zzhr) throws RemoteException {
    }

    public void zzb(zzep com_google_android_gms_internal_zzep) throws RemoteException {
        this.zztk = com_google_android_gms_internal_zzep;
    }

    public void zzb(zzex com_google_android_gms_internal_zzex) throws RemoteException {
    }

    public zzeq zzck() throws RemoteException {
        return new zza();
    }
}
