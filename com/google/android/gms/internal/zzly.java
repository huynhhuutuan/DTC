package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzpb.zza;
import com.google.android.gms.internal.zzqx.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@zzme
public class zzly {
    private final Context mContext;
    private final zzs zzGJ;
    private final zzaw zzGP;
    private final zza zzPR;
    private OnGlobalLayoutListener zzQV;
    private OnScrollChangedListener zzQW;
    private final Object zzrJ = new Object();
    private final zzgl zzsn;
    private int zzvR = -1;
    private int zzvS = -1;
    private zzpz zzvT;

    class C11052 implements zzid {
        final /* synthetic */ zzly zzQZ;

        C11052(zzly com_google_android_gms_internal_zzly) {
            this.zzQZ = com_google_android_gms_internal_zzly;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            this.zzQZ.zzGJ.zzct();
        }
    }

    public zzly(Context context, zzaw com_google_android_gms_internal_zzaw, zza com_google_android_gms_internal_zzpb_zza, zzgl com_google_android_gms_internal_zzgl, zzs com_google_android_gms_ads_internal_zzs) {
        this.mContext = context;
        this.zzGP = com_google_android_gms_internal_zzaw;
        this.zzPR = com_google_android_gms_internal_zzpb_zza;
        this.zzsn = com_google_android_gms_internal_zzgl;
        this.zzGJ = com_google_android_gms_ads_internal_zzs;
        this.zzvT = new zzpz(200);
    }

    private OnGlobalLayoutListener zza(final WeakReference<zzqw> weakReference) {
        if (this.zzQV == null) {
            this.zzQV = new OnGlobalLayoutListener(this) {
                final /* synthetic */ zzly zzQZ;

                public void onGlobalLayout() {
                    this.zzQZ.zza(weakReference, false);
                }
            };
        }
        return this.zzQV;
    }

    private void zza(WeakReference<zzqw> weakReference, boolean z) {
        if (weakReference != null) {
            zzqw com_google_android_gms_internal_zzqw = (zzqw) weakReference.get();
            if (com_google_android_gms_internal_zzqw != null && com_google_android_gms_internal_zzqw.getView() != null) {
                if (!z || this.zzvT.tryAcquire()) {
                    int[] iArr = new int[2];
                    com_google_android_gms_internal_zzqw.getView().getLocationOnScreen(iArr);
                    int zzc = zzel.zzeT().zzc(this.mContext, iArr[0]);
                    int zzc2 = zzel.zzeT().zzc(this.mContext, iArr[1]);
                    synchronized (this.zzrJ) {
                        if (!(this.zzvR == zzc && this.zzvS == zzc2)) {
                            this.zzvR = zzc;
                            this.zzvS = zzc2;
                            com_google_android_gms_internal_zzqw.zzlv().zza(this.zzvR, this.zzvS, !z);
                        }
                    }
                }
            }
        }
    }

    private OnScrollChangedListener zzb(final WeakReference<zzqw> weakReference) {
        if (this.zzQW == null) {
            this.zzQW = new OnScrollChangedListener(this) {
                final /* synthetic */ zzly zzQZ;

                public void onScrollChanged() {
                    this.zzQZ.zza(weakReference, true);
                }
            };
        }
        return this.zzQW;
    }

    private void zzj(zzqw com_google_android_gms_internal_zzqw) {
        zzqx zzlv = com_google_android_gms_internal_zzqw.zzlv();
        zzlv.zza("/video", zzic.zzHQ);
        zzlv.zza("/videoMeta", zzic.zzHR);
        zzlv.zza("/precache", zzic.zzHT);
        zzlv.zza("/delayPageLoaded", zzic.zzHW);
        zzlv.zza("/instrument", zzic.zzHU);
        zzlv.zza("/log", zzic.zzHL);
        zzlv.zza("/videoClicked", zzic.zzHM);
        zzlv.zza("/trackActiveViewUnit", new C11052(this));
    }

    public zzqm<zzqw> zze(final JSONObject jSONObject) {
        final zzqm com_google_android_gms_internal_zzqj = new zzqj();
        zzw.zzcM().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzly zzQZ;

            class C11042 implements zzqx.zza {
                final /* synthetic */ C05981 zzRa;

                C11042(C05981 c05981) {
                    this.zzRa = c05981;
                }

                public void zza(zzqw com_google_android_gms_internal_zzqw, boolean z) {
                    this.zzRa.zzQZ.zzGJ.zzcw();
                    com_google_android_gms_internal_zzqj.zzh(com_google_android_gms_internal_zzqw);
                }
            }

            public void run() {
                try {
                    final zzqw zzjj = this.zzQZ.zzjj();
                    this.zzQZ.zzGJ.zzc(zzjj);
                    WeakReference weakReference = new WeakReference(zzjj);
                    zzjj.zzlv().zza(this.zzQZ.zza(weakReference), this.zzQZ.zzb(weakReference));
                    this.zzQZ.zzj(zzjj);
                    zzjj.zzlv().zza(new zzb(this) {
                        final /* synthetic */ C05981 zzRa;

                        public void zzk(zzqw com_google_android_gms_internal_zzqw) {
                            zzjj.zza("google.afma.nativeAds.renderVideo", jSONObject);
                        }
                    });
                    zzjj.zzlv().zza(new C11042(this));
                    zzjj.loadUrl((String) zzgd.zzEl.get());
                } catch (Throwable e) {
                    zzqf.zzc("Exception occurred while getting video view", e);
                    com_google_android_gms_internal_zzqj.zzh(null);
                }
            }
        });
        return com_google_android_gms_internal_zzqj;
    }

    zzqw zzjj() {
        return zzw.zzcN().zza(this.mContext, zzeg.zzk(this.mContext), false, false, this.zzGP, this.zzPR.zzTi.zzvn, this.zzsn, null, this.zzGJ.zzby());
    }
}
