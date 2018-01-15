package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.zzd;
import com.google.firebase.analytics.FirebaseAnalytics.Event;

@zzme
public class zzek {
    private final Object zzrJ = new Object();
    private zzew zzzG;
    private final zzeb zzzH;
    private final zzea zzzI;
    private final zzfj zzzJ;
    private final zzht zzzK;
    private final zzny zzzL;
    private final zzlk zzzM;
    private final zzky zzzN;

    @VisibleForTesting
    abstract class zza<T> {
        final /* synthetic */ zzek zzzQ;

        zza(zzek com_google_android_gms_internal_zzek) {
            this.zzzQ = com_google_android_gms_internal_zzek;
        }

        @Nullable
        protected abstract T zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException;

        @Nullable
        protected abstract T zzeJ() throws RemoteException;

        @Nullable
        protected final T zzeQ() {
            T t = null;
            zzew zza = this.zzzQ.zzeH();
            if (zza == null) {
                zzqf.zzbh("ClientApi class cannot be loaded.");
            } else {
                try {
                    t = zzb(zza);
                } catch (Throwable e) {
                    zzqf.zzc("Cannot invoke local loader using ClientApi class", e);
                }
            }
            return t;
        }

        @Nullable
        protected final T zzeR() {
            try {
                return zzeJ();
            } catch (Throwable e) {
                zzqf.zzc("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public zzek(zzeb com_google_android_gms_internal_zzeb, zzea com_google_android_gms_internal_zzea, zzfj com_google_android_gms_internal_zzfj, zzht com_google_android_gms_internal_zzht, zzny com_google_android_gms_internal_zzny, zzlk com_google_android_gms_internal_zzlk, zzky com_google_android_gms_internal_zzky) {
        this.zzzH = com_google_android_gms_internal_zzeb;
        this.zzzI = com_google_android_gms_internal_zzea;
        this.zzzJ = com_google_android_gms_internal_zzfj;
        this.zzzK = com_google_android_gms_internal_zzht;
        this.zzzL = com_google_android_gms_internal_zzny;
        this.zzzM = com_google_android_gms_internal_zzlk;
        this.zzzN = com_google_android_gms_internal_zzky;
    }

    private static boolean zza(Activity activity, String str) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra(str)) {
            return intent.getBooleanExtra(str, false);
        }
        zzqf.m9e("useClientJar flag not found in activity intent extras.");
        return false;
    }

    private void zzc(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzel.zzeT().zza(context, null, "gmob-apps", bundle, true);
    }

    @Nullable
    private static zzew zzeG() {
        try {
            Object newInstance = zzek.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return com.google.android.gms.internal.zzew.zza.asInterface((IBinder) newInstance);
            }
            zzqf.zzbh("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            zzqf.zzc("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    private zzew zzeH() {
        zzew com_google_android_gms_internal_zzew;
        synchronized (this.zzrJ) {
            if (this.zzzG == null) {
                this.zzzG = zzeG();
            }
            com_google_android_gms_internal_zzew = this.zzzG;
        }
        return com_google_android_gms_internal_zzew;
    }

    public zzet zza(final Context context, final zzeg com_google_android_gms_internal_zzeg, final String str) {
        return (zzet) zza(context, false, new zza<zzet>(this) {
            final /* synthetic */ zzek zzzQ;

            public zzet zza(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createSearchAdManager(zzd.zzA(context), com_google_android_gms_internal_zzeg, str, 10298000);
            }

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zza(com_google_android_gms_internal_zzew);
            }

            public zzet zzeI() {
                zzet zza = this.zzzQ.zzzH.zza(context, com_google_android_gms_internal_zzeg, str, null, 3);
                if (zza != null) {
                    return zza;
                }
                this.zzzQ.zzc(context, Event.SEARCH);
                return new zzfl();
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeI();
            }
        });
    }

    public zzet zza(Context context, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka) {
        final Context context2 = context;
        final zzeg com_google_android_gms_internal_zzeg2 = com_google_android_gms_internal_zzeg;
        final String str2 = str;
        final zzka com_google_android_gms_internal_zzka2 = com_google_android_gms_internal_zzka;
        return (zzet) zza(context, false, new zza<zzet>(this) {
            final /* synthetic */ zzek zzzQ;

            public zzet zza(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createBannerAdManager(zzd.zzA(context2), com_google_android_gms_internal_zzeg2, str2, com_google_android_gms_internal_zzka2, 10298000);
            }

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zza(com_google_android_gms_internal_zzew);
            }

            public zzet zzeI() {
                zzet zza = this.zzzQ.zzzH.zza(context2, com_google_android_gms_internal_zzeg2, str2, com_google_android_gms_internal_zzka2, 1);
                if (zza != null) {
                    return zza;
                }
                this.zzzQ.zzc(context2, "banner");
                return new zzfl();
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeI();
            }
        });
    }

    public zzhh zza(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2) {
        return (zzhh) zza(context, false, new zza<zzhh>(this) {
            final /* synthetic */ zzek zzzQ;

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zze(com_google_android_gms_internal_zzew);
            }

            public zzhh zze(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createNativeAdViewDelegate(zzd.zzA(frameLayout), zzd.zzA(frameLayout2));
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeM();
            }

            public zzhh zzeM() {
                zzhh zzb = this.zzzQ.zzzK.zzb(context, frameLayout, frameLayout2);
                if (zzb != null) {
                    return zzb;
                }
                this.zzzQ.zzc(context, "native_ad_view_delegate");
                return new zzfn();
            }
        });
    }

    public zznu zza(final Context context, final zzka com_google_android_gms_internal_zzka) {
        return (zznu) zza(context, false, new zza<zznu>(this) {
            final /* synthetic */ zzek zzzQ;

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zzf(com_google_android_gms_internal_zzew);
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeN();
            }

            public zznu zzeN() {
                zznu zzb = this.zzzQ.zzzL.zzb(context, com_google_android_gms_internal_zzka);
                if (zzb != null) {
                    return zzb;
                }
                this.zzzQ.zzc(context, "rewarded_video");
                return new zzfo();
            }

            public zznu zzf(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createRewardedVideoAd(zzd.zzA(context), com_google_android_gms_internal_zzka, 10298000);
            }
        });
    }

    @VisibleForTesting
    <T> T zza(Context context, boolean z, zza<T> com_google_android_gms_internal_zzek_zza_T) {
        if (!(z || zzel.zzeT().zzaf(context))) {
            zzqf.zzbf("Google Play Services is not available");
            z = true;
        }
        T zzeQ;
        if (z) {
            zzeQ = com_google_android_gms_internal_zzek_zza_T.zzeQ();
            return zzeQ == null ? com_google_android_gms_internal_zzek_zza_T.zzeR() : zzeQ;
        } else {
            zzeQ = com_google_android_gms_internal_zzek_zza_T.zzeR();
            return zzeQ == null ? com_google_android_gms_internal_zzek_zza_T.zzeQ() : zzeQ;
        }
    }

    public zzer zzb(final Context context, final String str, final zzka com_google_android_gms_internal_zzka) {
        return (zzer) zza(context, false, new zza<zzer>(this) {
            final /* synthetic */ zzek zzzQ;

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zzc(com_google_android_gms_internal_zzew);
            }

            public zzer zzc(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createAdLoaderBuilder(zzd.zzA(context), str, com_google_android_gms_internal_zzka, 10298000);
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeK();
            }

            public zzer zzeK() {
                zzer zza = this.zzzQ.zzzI.zza(context, str, com_google_android_gms_internal_zzka);
                if (zza != null) {
                    return zza;
                }
                this.zzzQ.zzc(context, "native_ad");
                return new zzfk();
            }
        });
    }

    public zzet zzb(Context context, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka) {
        final Context context2 = context;
        final zzeg com_google_android_gms_internal_zzeg2 = com_google_android_gms_internal_zzeg;
        final String str2 = str;
        final zzka com_google_android_gms_internal_zzka2 = com_google_android_gms_internal_zzka;
        return (zzet) zza(context, false, new zza<zzet>(this) {
            final /* synthetic */ zzek zzzQ;

            public zzet zza(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createInterstitialAdManager(zzd.zzA(context2), com_google_android_gms_internal_zzeg2, str2, com_google_android_gms_internal_zzka2, 10298000);
            }

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zza(com_google_android_gms_internal_zzew);
            }

            public zzet zzeI() {
                zzet zza = this.zzzQ.zzzH.zza(context2, com_google_android_gms_internal_zzeg2, str2, com_google_android_gms_internal_zzka2, 2);
                if (zza != null) {
                    return zza;
                }
                this.zzzQ.zzc(context2, "interstitial");
                return new zzfl();
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeI();
            }
        });
    }

    @Nullable
    public zzlf zzb(final Activity activity) {
        return (zzlf) zza((Context) activity, zza(activity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new zza<zzlf>(this) {
            final /* synthetic */ zzek zzzQ;

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zzg(com_google_android_gms_internal_zzew);
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeO();
            }

            public zzlf zzeO() {
                zzlf zzg = this.zzzQ.zzzM.zzg(activity);
                if (zzg != null) {
                    return zzg;
                }
                this.zzzQ.zzc(activity, "iap");
                return null;
            }

            public zzlf zzg(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createInAppPurchaseManager(zzd.zzA(activity));
            }
        });
    }

    @Nullable
    public zzkz zzc(final Activity activity) {
        return (zzkz) zza((Context) activity, zza(activity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new zza<zzkz>(this) {
            final /* synthetic */ zzek zzzQ;

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zzh(com_google_android_gms_internal_zzew);
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeP();
            }

            public zzkz zzeP() {
                zzkz zzf = this.zzzQ.zzzN.zzf(activity);
                if (zzf != null) {
                    return zzf;
                }
                this.zzzQ.zzc(activity, "ad_overlay");
                return null;
            }

            public zzkz zzh(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.createAdOverlay(zzd.zzA(activity));
            }
        });
    }

    public zzey zzl(final Context context) {
        return (zzey) zza(context, false, new zza<zzey>(this) {
            final /* synthetic */ zzek zzzQ;

            public /* synthetic */ Object zzb(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return zzd(com_google_android_gms_internal_zzew);
            }

            public zzey zzd(zzew com_google_android_gms_internal_zzew) throws RemoteException {
                return com_google_android_gms_internal_zzew.getMobileAdsSettingsManagerWithClientJarVersion(zzd.zzA(context), 10298000);
            }

            public /* synthetic */ Object zzeJ() throws RemoteException {
                return zzeL();
            }

            public zzey zzeL() {
                zzey zzm = this.zzzQ.zzzJ.zzm(context);
                if (zzm != null) {
                    return zzm;
                }
                this.zzzQ.zzc(context, "mobile_ads_settings");
                return new zzfm();
            }
        });
    }
}
