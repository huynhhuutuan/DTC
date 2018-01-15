package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzm;
import java.util.LinkedList;
import java.util.List;

@zzme
class zzix {
    private final List<zza> zzth = new LinkedList();

    interface zza {
        void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException;
    }

    class C12021 extends com.google.android.gms.internal.zzep.zza {
        final /* synthetic */ zzix zzIN;

        class C10631 implements zza {
            C10631(C12021 c12021) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdClosed();
                }
            }
        }

        class C10653 implements zza {
            C10653(C12021 c12021) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdLeftApplication();
                }
            }
        }

        class C10664 implements zza {
            C10664(C12021 c12021) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdLoaded();
                }
            }
        }

        class C10675 implements zza {
            C10675(C12021 c12021) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zztk != null) {
                    com_google_android_gms_internal_zziy.zztk.onAdOpened();
                }
            }
        }

        C12021(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onAdClosed() throws RemoteException {
            this.zzIN.zzth.add(new C10631(this));
        }

        public void onAdFailedToLoad(final int i) throws RemoteException {
            this.zzIN.zzth.add(new zza(this) {
                public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                    if (com_google_android_gms_internal_zziy.zztk != null) {
                        com_google_android_gms_internal_zziy.zztk.onAdFailedToLoad(i);
                    }
                }
            });
            zzpk.m28v("Pooled interstitial failed to load.");
        }

        public void onAdLeftApplication() throws RemoteException {
            this.zzIN.zzth.add(new C10653(this));
        }

        public void onAdLoaded() throws RemoteException {
            this.zzIN.zzth.add(new C10664(this));
            zzpk.m28v("Pooled interstitial loaded.");
        }

        public void onAdOpened() throws RemoteException {
            this.zzIN.zzth.add(new C10675(this));
        }
    }

    class C12032 extends com.google.android.gms.internal.zzev.zza {
        final /* synthetic */ zzix zzIN;

        C12032(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onAppEvent(final String str, final String str2) throws RemoteException {
            this.zzIN.zzth.add(new zza(this) {
                public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                    if (com_google_android_gms_internal_zziy.zzIV != null) {
                        com_google_android_gms_internal_zziy.zzIV.onAppEvent(str, str2);
                    }
                }
            });
        }
    }

    class C12043 extends com.google.android.gms.internal.zzle.zza {
        final /* synthetic */ zzix zzIN;

        C12043(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void zza(final zzld com_google_android_gms_internal_zzld) throws RemoteException {
            this.zzIN.zzth.add(new zza(this) {
                public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                    if (com_google_android_gms_internal_zziy.zzIW != null) {
                        com_google_android_gms_internal_zziy.zzIW.zza(com_google_android_gms_internal_zzld);
                    }
                }
            });
        }
    }

    class C12054 extends com.google.android.gms.internal.zzgp.zza {
        final /* synthetic */ zzix zzIN;

        C12054(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void zza(final zzgo com_google_android_gms_internal_zzgo) throws RemoteException {
            this.zzIN.zzth.add(new zza(this) {
                public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                    if (com_google_android_gms_internal_zziy.zzIX != null) {
                        com_google_android_gms_internal_zziy.zzIX.zza(com_google_android_gms_internal_zzgo);
                    }
                }
            });
        }
    }

    class C12065 extends com.google.android.gms.internal.zzeo.zza {
        final /* synthetic */ zzix zzIN;

        class C10711 implements zza {
            C10711(C12065 c12065) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIY != null) {
                    com_google_android_gms_internal_zziy.zzIY.onAdClicked();
                }
            }
        }

        C12065(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onAdClicked() throws RemoteException {
            this.zzIN.zzth.add(new C10711(this));
        }
    }

    class C12076 extends com.google.android.gms.internal.zznw.zza {
        final /* synthetic */ zzix zzIN;

        class C10721 implements zza {
            C10721(C12076 c12076) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdLoaded();
                }
            }
        }

        class C10732 implements zza {
            C10732(C12076 c12076) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdOpened();
                }
            }
        }

        class C10743 implements zza {
            C10743(C12076 c12076) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoStarted();
                }
            }
        }

        class C10754 implements zza {
            C10754(C12076 c12076) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdClosed();
                }
            }
        }

        class C10776 implements zza {
            C10776(C12076 c12076) {
            }

            public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                if (com_google_android_gms_internal_zziy.zzIZ != null) {
                    com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdLeftApplication();
                }
            }
        }

        C12076(zzix com_google_android_gms_internal_zzix) {
            this.zzIN = com_google_android_gms_internal_zzix;
        }

        public void onRewardedVideoAdClosed() throws RemoteException {
            this.zzIN.zzth.add(new C10754(this));
        }

        public void onRewardedVideoAdFailedToLoad(final int i) throws RemoteException {
            this.zzIN.zzth.add(new zza(this) {
                public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                    if (com_google_android_gms_internal_zziy.zzIZ != null) {
                        com_google_android_gms_internal_zziy.zzIZ.onRewardedVideoAdFailedToLoad(i);
                    }
                }
            });
        }

        public void onRewardedVideoAdLeftApplication() throws RemoteException {
            this.zzIN.zzth.add(new C10776(this));
        }

        public void onRewardedVideoAdLoaded() throws RemoteException {
            this.zzIN.zzth.add(new C10721(this));
        }

        public void onRewardedVideoAdOpened() throws RemoteException {
            this.zzIN.zzth.add(new C10732(this));
        }

        public void onRewardedVideoStarted() throws RemoteException {
            this.zzIN.zzth.add(new C10743(this));
        }

        public void zza(final zznt com_google_android_gms_internal_zznt) throws RemoteException {
            this.zzIN.zzth.add(new zza(this) {
                public void zzb(zziy com_google_android_gms_internal_zziy) throws RemoteException {
                    if (com_google_android_gms_internal_zziy.zzIZ != null) {
                        com_google_android_gms_internal_zziy.zzIZ.zza(com_google_android_gms_internal_zznt);
                    }
                }
            });
        }
    }

    zzix() {
    }

    void zza(final zziy com_google_android_gms_internal_zziy) {
        Handler handler = zzpo.zzXC;
        for (final zza com_google_android_gms_internal_zzix_zza : this.zzth) {
            handler.post(new Runnable(this) {
                public void run() {
                    try {
                        com_google_android_gms_internal_zzix_zza.zzb(com_google_android_gms_internal_zziy);
                    } catch (Throwable e) {
                        zzqf.zzc("Could not propagate interstitial ad event.", e);
                    }
                }
            });
        }
        this.zzth.clear();
    }

    void zzc(zzm com_google_android_gms_ads_internal_zzm) {
        com_google_android_gms_ads_internal_zzm.zza(new C12021(this));
        com_google_android_gms_ads_internal_zzm.zza(new C12032(this));
        com_google_android_gms_ads_internal_zzm.zza(new C12043(this));
        com_google_android_gms_ads_internal_zzm.zza(new C12054(this));
        com_google_android_gms_ads_internal_zzm.zza(new C12065(this));
        com_google_android_gms_ads_internal_zzm.zza(new C12076(this));
    }
}
