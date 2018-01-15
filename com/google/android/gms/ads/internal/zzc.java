package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgl;
import com.google.android.gms.internal.zzgm;
import com.google.android.gms.internal.zzgo;
import com.google.android.gms.internal.zzgp;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzpb.zza;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqh;
import com.google.android.gms.internal.zzqw;
import java.util.Map;

@zzme
public abstract class zzc extends zzb implements zzi, zzkx {

    class C08911 implements zzid {
        final /* synthetic */ zzc zzsH;

        C08911(zzc com_google_android_gms_ads_internal_zzc) {
            this.zzsH = com_google_android_gms_ads_internal_zzc;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (this.zzsH.zzss.zzvs != null) {
                this.zzsH.zzsu.zza(this.zzsH.zzss.zzvr, this.zzsH.zzss.zzvs, com_google_android_gms_internal_zzqw.getView(), (zzjj) com_google_android_gms_internal_zzqw);
            } else {
                zzqf.zzbh("Request to enable ActiveView before adState is available.");
            }
        }
    }

    public zzc(Context context, zzeg com_google_android_gms_internal_zzeg, String str, zzka com_google_android_gms_internal_zzka, zzqh com_google_android_gms_internal_zzqh, zze com_google_android_gms_ads_internal_zze) {
        super(context, com_google_android_gms_internal_zzeg, str, com_google_android_gms_internal_zzka, com_google_android_gms_internal_zzqh, com_google_android_gms_ads_internal_zze);
    }

    protected zzqw zza(zza com_google_android_gms_internal_zzpb_zza, @Nullable zzf com_google_android_gms_ads_internal_zzf, @Nullable zzot com_google_android_gms_internal_zzot) {
        zzqw com_google_android_gms_internal_zzqw = null;
        View nextView = this.zzss.zzvo.getNextView();
        if (nextView instanceof zzqw) {
            com_google_android_gms_internal_zzqw = (zzqw) nextView;
            if (((Boolean) zzgd.zzCI.get()).booleanValue()) {
                zzqf.zzbf("Reusing webview...");
                com_google_android_gms_internal_zzqw.zza(this.zzss.zzqn, this.zzss.zzvr, this.zzsn);
            } else {
                com_google_android_gms_internal_zzqw.destroy();
                com_google_android_gms_internal_zzqw = null;
            }
        }
        if (com_google_android_gms_internal_zzqw == null) {
            if (nextView != null) {
                this.zzss.zzvo.removeView(nextView);
            }
            com_google_android_gms_internal_zzqw = zzw.zzcN().zza(this.zzss.zzqn, this.zzss.zzvr, false, false, this.zzss.zzvm, this.zzss.zzvn, this.zzsn, this, this.zzsv);
            if (this.zzss.zzvr.zzzA == null) {
                zzb(com_google_android_gms_internal_zzqw.getView());
            }
        }
        zzjj com_google_android_gms_internal_zzjj = com_google_android_gms_internal_zzqw;
        com_google_android_gms_internal_zzjj.zzlv().zza(this, this, this, this, false, this, null, com_google_android_gms_ads_internal_zzf, this, com_google_android_gms_internal_zzot);
        zza(com_google_android_gms_internal_zzjj);
        com_google_android_gms_internal_zzjj.zzbj(com_google_android_gms_internal_zzpb_zza.zzTi.zzRL);
        return com_google_android_gms_internal_zzjj;
    }

    public void zza(int i, int i2, int i3, int i4) {
        zzbI();
    }

    public void zza(zzgp com_google_android_gms_internal_zzgp) {
        zzac.zzdj("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzss.zzvI = com_google_android_gms_internal_zzgp;
    }

    protected void zza(zzjj com_google_android_gms_internal_zzjj) {
        com_google_android_gms_internal_zzjj.zza("/trackActiveViewUnit", new C08911(this));
    }

    protected void zza(final zza com_google_android_gms_internal_zzpb_zza, final zzgl com_google_android_gms_internal_zzgl) {
        if (com_google_android_gms_internal_zzpb_zza.errorCode != -2) {
            zzpo.zzXC.post(new Runnable(this) {
                final /* synthetic */ zzc zzsH;

                public void run() {
                    this.zzsH.zzb(new zzpb(com_google_android_gms_internal_zzpb_zza, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (com_google_android_gms_internal_zzpb_zza.zzvr != null) {
            this.zzss.zzvr = com_google_android_gms_internal_zzpb_zza.zzvr;
        }
        if (!com_google_android_gms_internal_zzpb_zza.zzWm.zzSn || com_google_android_gms_internal_zzpb_zza.zzWm.zzzD) {
            zzpo.zzXC.post(new Runnable(this, null) {
                final /* synthetic */ zzc zzsH;

                public void run() {
                    if (com_google_android_gms_internal_zzpb_zza.zzWm.zzSw && this.zzsH.zzss.zzvI != null) {
                        String str = null;
                        if (com_google_android_gms_internal_zzpb_zza.zzWm.zzNJ != null) {
                            str = zzw.zzcM().zzaX(com_google_android_gms_internal_zzpb_zza.zzWm.zzNJ);
                        }
                        zzgo com_google_android_gms_internal_zzgm = new zzgm(this.zzsH, str, com_google_android_gms_internal_zzpb_zza.zzWm.body);
                        this.zzsH.zzss.zzvO = 1;
                        try {
                            this.zzsH.zzsq = false;
                            this.zzsH.zzss.zzvI.zza(com_google_android_gms_internal_zzgm);
                            return;
                        } catch (Throwable e) {
                            zzqf.zzc("Could not call the onCustomRenderedAdLoadedListener.", e);
                            this.zzsH.zzsq = true;
                        }
                    }
                    final zzf com_google_android_gms_ads_internal_zzf = new zzf(this.zzsH.zzss.zzqn, com_google_android_gms_internal_zzpb_zza);
                    zzqw zza = this.zzsH.zza(com_google_android_gms_internal_zzpb_zza, com_google_android_gms_ads_internal_zzf, null);
                    zza.setOnTouchListener(new OnTouchListener(this) {
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            com_google_android_gms_ads_internal_zzf.recordClick();
                            return false;
                        }
                    });
                    zza.setOnClickListener(new OnClickListener(this) {
                        public void onClick(View view) {
                            com_google_android_gms_ads_internal_zzf.recordClick();
                        }
                    });
                    this.zzsH.zzss.zzvO = 0;
                    this.zzsH.zzss.zzvq = zzw.zzcL().zza(this.zzsH.zzss.zzqn, this.zzsH, com_google_android_gms_internal_zzpb_zza, this.zzsH.zzss.zzvm, zza, this.zzsH.zzsz, this.zzsH, com_google_android_gms_internal_zzgl);
                }
            });
            return;
        }
        this.zzss.zzvO = 0;
        this.zzss.zzvq = zzw.zzcL().zza(this.zzss.zzqn, this, com_google_android_gms_internal_zzpb_zza, this.zzss.zzvm, null, this.zzsz, this, com_google_android_gms_internal_zzgl);
    }

    protected boolean zza(@Nullable zzpb com_google_android_gms_internal_zzpb, zzpb com_google_android_gms_internal_zzpb2) {
        if (this.zzss.zzdq() && this.zzss.zzvo != null) {
            this.zzss.zzvo.zzdw().zzbb(com_google_android_gms_internal_zzpb2.zzSs);
        }
        return super.zza(com_google_android_gms_internal_zzpb, com_google_android_gms_internal_zzpb2);
    }

    public void zzbZ() {
        onAdClicked();
    }

    public void zzc(View view) {
        this.zzss.zzvN = view;
        zzb(new zzpb(this.zzss.zzvt, null, null, null, null, null, null, null));
    }

    public void zzca() {
        recordImpression();
        zzbE();
    }

    public void zzcb() {
        zzbG();
    }
}
