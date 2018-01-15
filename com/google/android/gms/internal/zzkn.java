package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

@zzme
public final class zzkn<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzkc zzLE;

    class C05731 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05731(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdClicked();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClicked.", e);
            }
        }
    }

    class C05742 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05742(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdOpened();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
            }
        }
    }

    class C05753 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05753(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdLoaded();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
            }
        }
    }

    class C05764 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05764(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdClosed();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
            }
        }
    }

    class C05786 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05786(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdLeftApplication();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLeftApplication.", e);
            }
        }
    }

    class C05797 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05797(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdOpened();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
            }
        }
    }

    class C05808 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05808(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdLoaded();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
            }
        }
    }

    class C05819 implements Runnable {
        final /* synthetic */ zzkn zzLK;

        C05819(zzkn com_google_android_gms_internal_zzkn) {
            this.zzLK = com_google_android_gms_internal_zzkn;
        }

        public void run() {
            try {
                this.zzLK.zzLE.onAdClosed();
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
            }
        }
    }

    public zzkn(zzkc com_google_android_gms_internal_zzkc) {
        this.zzLE = com_google_android_gms_internal_zzkc;
    }

    public void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onClick.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdClicked();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClicked.", e);
                return;
            }
        }
        zzqf.zzbh("onClick must be called on the main UI thread.");
        zzqe.zzYP.post(new C05731(this));
    }

    public void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onDismissScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdClosed();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
                return;
            }
        }
        zzqf.zzbh("onDismissScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C05764(this));
    }

    public void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onDismissScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdClosed();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdClosed.", e);
                return;
            }
        }
        zzqf.zzbh("onDismissScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C05819(this));
    }

    public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, final ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        zzqf.zzbf(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdFailedToLoad(zzko.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzqf.zzbh("onFailedToReceiveAd must be called on the main UI thread.");
        zzqe.zzYP.post(new Runnable(this) {
            final /* synthetic */ zzkn zzLK;

            public void run() {
                try {
                    this.zzLK.zzLE.onAdFailedToLoad(zzko.zza(errorCode));
                } catch (Throwable e) {
                    zzqf.zzc("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, final ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        zzqf.zzbf(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdFailedToLoad(zzko.zza(errorCode));
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzqf.zzbh("onFailedToReceiveAd must be called on the main UI thread.");
        zzqe.zzYP.post(new Runnable(this) {
            final /* synthetic */ zzkn zzLK;

            public void run() {
                try {
                    this.zzLK.zzLE.onAdFailedToLoad(zzko.zza(errorCode));
                } catch (Throwable e) {
                    zzqf.zzc("Could not call onAdFailedToLoad.", e);
                }
            }
        });
    }

    public void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onLeaveApplication.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzqf.zzbh("onLeaveApplication must be called on the main UI thread.");
        zzqe.zzYP.post(new C05786(this));
    }

    public void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onLeaveApplication.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLeftApplication();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLeftApplication.", e);
                return;
            }
        }
        zzqf.zzbh("onLeaveApplication must be called on the main UI thread.");
        zzqe.zzYP.post(new Runnable(this) {
            final /* synthetic */ zzkn zzLK;

            {
                this.zzLK = r1;
            }

            public void run() {
                try {
                    this.zzLK.zzLE.onAdLeftApplication();
                } catch (Throwable e) {
                    zzqf.zzc("Could not call onAdLeftApplication.", e);
                }
            }
        });
    }

    public void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onPresentScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdOpened();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
                return;
            }
        }
        zzqf.zzbh("onPresentScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C05797(this));
    }

    public void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onPresentScreen.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdOpened();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdOpened.", e);
                return;
            }
        }
        zzqf.zzbh("onPresentScreen must be called on the main UI thread.");
        zzqe.zzYP.post(new C05742(this));
    }

    public void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzqf.zzbf("Adapter called onReceivedAd.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzqf.zzbh("onReceivedAd must be called on the main UI thread.");
        zzqe.zzYP.post(new C05808(this));
    }

    public void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzqf.zzbf("Adapter called onReceivedAd.");
        if (zzel.zzeT().zzlj()) {
            try {
                this.zzLE.onAdLoaded();
                return;
            } catch (Throwable e) {
                zzqf.zzc("Could not call onAdLoaded.", e);
                return;
            }
        }
        zzqf.zzbh("onReceivedAd must be called on the main UI thread.");
        zzqe.zzYP.post(new C05753(this));
    }
}
