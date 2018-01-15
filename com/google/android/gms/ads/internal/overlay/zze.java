package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzpj;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzpr;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqx;
import java.util.Collections;
import java.util.Map;

@zzme
public class zze extends com.google.android.gms.internal.zzkz.zza implements zzv {
    static final int zzNf = Color.argb(0, 0, 0, 0);
    private final Activity mActivity;
    zzqw zzIs;
    AdOverlayInfoParcel zzNg;
    zzc zzNh;
    zzp zzNi;
    boolean zzNj = false;
    FrameLayout zzNk;
    CustomViewCallback zzNl;
    boolean zzNm = false;
    boolean zzNn = false;
    zzb zzNo;
    boolean zzNp = false;
    int zzNq = 0;
    zzm zzNr;
    private final Object zzNs = new Object();
    private Runnable zzNt;
    private boolean zzNu;
    private boolean zzNv;
    private boolean zzNw = false;
    private boolean zzNx = false;
    private boolean zzNy = true;

    class C03482 implements Runnable {
        final /* synthetic */ zze zzNz;

        C03482(zze com_google_android_gms_ads_internal_overlay_zze) {
            this.zzNz = com_google_android_gms_ads_internal_overlay_zze;
        }

        public void run() {
            this.zzNz.zzhI();
        }
    }

    @zzme
    private static final class zza extends Exception {
        public zza(String str) {
            super(str);
        }
    }

    @zzme
    static class zzb extends RelativeLayout {
        boolean zzNA;
        zzpr zzvX;

        public zzb(Context context, String str, String str2) {
            super(context);
            this.zzvX = new zzpr(context, str);
            this.zzvX.zzba(str2);
        }

        void disable() {
            this.zzNA = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.zzNA) {
                this.zzvX.zzg(motionEvent);
            }
            return false;
        }
    }

    @zzme
    public static class zzc {
        public final int index;
        public final ViewGroup parent;
        public final LayoutParams zzNB;
        public final Context zzqn;

        public zzc(zzqw com_google_android_gms_internal_zzqw) throws zza {
            this.zzNB = com_google_android_gms_internal_zzqw.getLayoutParams();
            ViewParent parent = com_google_android_gms_internal_zzqw.getParent();
            this.zzqn = com_google_android_gms_internal_zzqw.zzls();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new zza("Could not get the parent of the WebView for an overlay.");
            }
            this.parent = (ViewGroup) parent;
            this.index = this.parent.indexOfChild(com_google_android_gms_internal_zzqw.getView());
            this.parent.removeView(com_google_android_gms_internal_zzqw.getView());
            com_google_android_gms_internal_zzqw.zzK(true);
        }
    }

    class C08901 implements com.google.android.gms.internal.zzqx.zza {
        C08901(zze com_google_android_gms_ads_internal_overlay_zze) {
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, boolean z) {
            com_google_android_gms_internal_zzqw.zzhK();
        }
    }

    @zzme
    private class zzd extends zzpj {
        final /* synthetic */ zze zzNz;

        private zzd(zze com_google_android_gms_ads_internal_overlay_zze) {
            this.zzNz = com_google_android_gms_ads_internal_overlay_zze;
        }

        public void onStop() {
        }

        public void zzco() {
            Bitmap zza = zzw.zzdh().zza(Integer.valueOf(this.zzNz.zzNg.zzNQ.zztP));
            if (zza != null) {
                final Drawable zza2 = zzw.zzcO().zza(this.zzNz.mActivity, zza, this.zzNz.zzNg.zzNQ.zztN, this.zzNz.zzNg.zzNQ.zztO);
                zzpo.zzXC.post(new Runnable(this) {
                    final /* synthetic */ zzd zzND;

                    public void run() {
                        this.zzND.zzNz.mActivity.getWindow().setBackgroundDrawable(zza2);
                    }
                });
            }
        }
    }

    public zze(Activity activity) {
        this.mActivity = activity;
        this.zzNr = new zzt();
    }

    public void close() {
        this.zzNq = 2;
        this.mActivity.finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onBackPressed() {
        this.zzNq = 0;
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        this.mActivity.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.zzNm = z;
        try {
            this.zzNg = AdOverlayInfoParcel.zzb(this.mActivity.getIntent());
            if (this.zzNg == null) {
                throw new zza("Could not get info for ad overlay.");
            }
            if (this.zzNg.zzvn.zzYX > 7500000) {
                this.zzNq = 3;
            }
            if (this.mActivity.getIntent() != null) {
                this.zzNy = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzNg.zzNQ != null) {
                this.zzNn = this.zzNg.zzNQ.zztK;
            } else {
                this.zzNn = false;
            }
            if (((Boolean) zzgd.zzEa.get()).booleanValue() && this.zzNn && this.zzNg.zzNQ.zztP != -1) {
                new zzd().zziP();
            }
            if (bundle == null) {
                if (this.zzNg.zzNG != null && this.zzNy) {
                    this.zzNg.zzNG.zzbO();
                }
                if (!(this.zzNg.zzNN == 1 || this.zzNg.zzNF == null)) {
                    this.zzNg.zzNF.onAdClicked();
                }
            }
            this.zzNo = new zzb(this.mActivity, this.zzNg.zzNP, this.zzNg.zzvn.zzba);
            this.zzNo.setId(1000);
            switch (this.zzNg.zzNN) {
                case 1:
                    zzA(false);
                    return;
                case 2:
                    this.zzNh = new zzc(this.zzNg.zzNH);
                    zzA(false);
                    return;
                case 3:
                    zzA(true);
                    return;
                case 4:
                    if (this.zzNm) {
                        this.zzNq = 3;
                        this.mActivity.finish();
                        return;
                    } else if (!zzw.zzcJ().zza(this.mActivity, this.zzNg.zzNE, this.zzNg.zzNM)) {
                        this.zzNq = 3;
                        this.mActivity.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new zza("Could not determine ad overlay type.");
            }
        } catch (zza e) {
            zzqf.zzbh(e.getMessage());
            this.zzNq = 3;
            this.mActivity.finish();
        }
    }

    public void onDestroy() {
        if (this.zzIs != null) {
            this.zzNo.removeView(this.zzIs.getView());
        }
        zzhH();
    }

    public void onPause() {
        zzhD();
        if (this.zzNg.zzNG != null) {
            this.zzNg.zzNG.onPause();
        }
        if (!(((Boolean) zzgd.zzFu.get()).booleanValue() || this.zzIs == null || (this.mActivity.isFinishing() && this.zzNh != null))) {
            zzw.zzcO().zzl(this.zzIs);
        }
        zzhH();
    }

    public void onRestart() {
    }

    public void onResume() {
        if (this.zzNg != null && this.zzNg.zzNN == 4) {
            if (this.zzNm) {
                this.zzNq = 3;
                this.mActivity.finish();
            } else {
                this.zzNm = true;
            }
        }
        if (this.zzNg.zzNG != null) {
            this.zzNg.zzNG.onResume();
        }
        if (!((Boolean) zzgd.zzFu.get()).booleanValue()) {
            if (this.zzIs == null || this.zzIs.isDestroyed()) {
                zzqf.zzbh("The webview does not exist. Ignoring action.");
            } else {
                zzw.zzcO().zzm(this.zzIs);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzNm);
    }

    public void onStart() {
        if (!((Boolean) zzgd.zzFu.get()).booleanValue()) {
            return;
        }
        if (this.zzIs == null || this.zzIs.isDestroyed()) {
            zzqf.zzbh("The webview does not exist. Ignoring action.");
        } else {
            zzw.zzcO().zzm(this.zzIs);
        }
    }

    public void onStop() {
        if (((Boolean) zzgd.zzFu.get()).booleanValue() && this.zzIs != null && (!this.mActivity.isFinishing() || this.zzNh == null)) {
            zzw.zzcO().zzl(this.zzIs);
        }
        zzhH();
    }

    public void setRequestedOrientation(int i) {
        this.mActivity.setRequestedOrientation(i);
    }

    protected void zzA(boolean z) throws zza {
        if (!this.zzNv) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window = this.mActivity.getWindow();
        if (window == null) {
            throw new zza("Invalid activity, no window available.");
        }
        boolean zza = (zzt.isAtLeastN() && ((Boolean) zzgd.zzFt.get()).booleanValue()) ? zzw.zzcM().zza(this.mActivity, this.mActivity.getResources().getConfiguration()) : true;
        Object obj = (this.zzNg.zzNQ == null || !this.zzNg.zzNQ.zztL) ? null : 1;
        if (!(this.zzNn && obj == null) && zza) {
            window.setFlags(1024, 1024);
        }
        zzqx zzlv = this.zzNg.zzNH.zzlv();
        boolean zzdD = zzlv != null ? zzlv.zzdD() : false;
        this.zzNp = false;
        if (zzdD) {
            if (this.zzNg.orientation == zzw.zzcO().zzkQ()) {
                this.zzNp = this.mActivity.getResources().getConfiguration().orientation == 1;
            } else if (this.zzNg.orientation == zzw.zzcO().zzkR()) {
                this.zzNp = this.mActivity.getResources().getConfiguration().orientation == 2;
            }
        }
        zzqf.zzbf("Delay onShow to next orientation change: " + this.zzNp);
        setRequestedOrientation(this.zzNg.orientation);
        if (zzw.zzcO().zza(window)) {
            zzqf.zzbf("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.zzNn) {
            this.zzNo.setBackgroundColor(zzNf);
        } else {
            this.zzNo.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.mActivity.setContentView(this.zzNo);
        zzbo();
        if (z) {
            this.zzIs = zzw.zzcN().zza(this.mActivity, this.zzNg.zzNH.zzbC(), true, zzdD, null, this.zzNg.zzvn, null, null, this.zzNg.zzNH.zzby());
            this.zzIs.zzlv().zza(null, null, this.zzNg.zzNI, this.zzNg.zzNM, true, this.zzNg.zzNO, null, this.zzNg.zzNH.zzlv().zzlN(), null, null);
            this.zzIs.zzlv().zza(new C08901(this));
            if (this.zzNg.url != null) {
                this.zzIs.loadUrl(this.zzNg.url);
            } else if (this.zzNg.zzNL != null) {
                this.zzIs.loadDataWithBaseURL(this.zzNg.zzNJ, this.zzNg.zzNL, "text/html", "UTF-8", null);
            } else {
                throw new zza("No URL or HTML to display in ad overlay.");
            }
            if (this.zzNg.zzNH != null) {
                this.zzNg.zzNH.zzc(this);
            }
        } else {
            this.zzIs = this.zzNg.zzNH;
            this.zzIs.setContext(this.mActivity);
        }
        this.zzIs.zzb(this);
        ViewParent parent = this.zzIs.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.zzIs.getView());
        }
        if (this.zzNn) {
            this.zzIs.zzlM();
        }
        this.zzNo.addView(this.zzIs.getView(), -1, -1);
        if (!(z || this.zzNp)) {
            zzhK();
        }
        zzz(zzdD);
        if (this.zzIs.zzlw()) {
            zza(zzdD, true);
        }
        com.google.android.gms.ads.internal.zze zzby = this.zzIs.zzby();
        zzn com_google_android_gms_ads_internal_overlay_zzn = zzby != null ? zzby.zzsO : null;
        if (com_google_android_gms_ads_internal_overlay_zzn != null) {
            this.zzNr = com_google_android_gms_ads_internal_overlay_zzn.zza(this.mActivity, this.zzIs, this.zzNo);
        } else {
            zzqf.zzbh("Appstreaming controller is null.");
        }
    }

    protected void zzM(int i) {
        this.zzIs.zzM(i);
    }

    public void zza(View view, CustomViewCallback customViewCallback) {
        this.zzNk = new FrameLayout(this.mActivity);
        this.zzNk.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzNk.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzNk);
        zzbo();
        this.zzNl = customViewCallback;
        this.zzNj = true;
    }

    public void zza(boolean z, boolean z2) {
        if (this.zzNi != null) {
            this.zzNi.zza(z, z2);
        }
    }

    public void zzbo() {
        this.zzNv = true;
    }

    public void zzg(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
    }

    public void zzhD() {
        if (this.zzNg != null && this.zzNj) {
            setRequestedOrientation(this.zzNg.orientation);
        }
        if (this.zzNk != null) {
            this.mActivity.setContentView(this.zzNo);
            zzbo();
            this.zzNk.removeAllViews();
            this.zzNk = null;
        }
        if (this.zzNl != null) {
            this.zzNl.onCustomViewHidden();
            this.zzNl = null;
        }
        this.zzNj = false;
    }

    public void zzhE() {
        this.zzNq = 1;
        this.mActivity.finish();
    }

    public boolean zzhF() {
        boolean z = true;
        this.zzNq = 0;
        if (this.zzIs != null) {
            if (!this.zzIs.zzlB()) {
                z = false;
            }
            if (!z) {
                this.zzIs.zza("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    public void zzhG() {
        this.zzNo.removeView(this.zzNi);
        zzz(true);
    }

    protected void zzhH() {
        if (this.mActivity.isFinishing() && !this.zzNw) {
            this.zzNw = true;
            if (this.zzIs != null) {
                zzM(this.zzNq);
                synchronized (this.zzNs) {
                    if (!this.zzNu && this.zzIs.zzlH()) {
                        this.zzNt = new C03482(this);
                        zzpo.zzXC.postDelayed(this.zzNt, ((Long) zzgd.zzCY.get()).longValue());
                        return;
                    }
                }
            }
            zzhI();
        }
    }

    void zzhI() {
        if (!this.zzNx) {
            this.zzNx = true;
            if (this.zzIs != null) {
                this.zzNo.removeView(this.zzIs.getView());
                if (this.zzNh != null) {
                    this.zzIs.setContext(this.zzNh.zzqn);
                    this.zzIs.zzK(false);
                    this.zzNh.parent.addView(this.zzIs.getView(), this.zzNh.index, this.zzNh.zzNB);
                    this.zzNh = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzIs.setContext(this.mActivity.getApplicationContext());
                }
                this.zzIs = null;
            }
            if (this.zzNg != null && this.zzNg.zzNG != null) {
                this.zzNg.zzNG.zzbN();
            }
        }
    }

    public void zzhJ() {
        if (this.zzNp) {
            this.zzNp = false;
            zzhK();
        }
    }

    protected void zzhK() {
        this.zzIs.zzhK();
    }

    public void zzhL() {
        this.zzNo.disable();
    }

    public void zzhM() {
        synchronized (this.zzNs) {
            this.zzNu = true;
            if (this.zzNt != null) {
                zzpo.zzXC.removeCallbacks(this.zzNt);
                zzpo.zzXC.post(this.zzNt);
            }
        }
    }

    public void zzo(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzgd.zzFt.get()).booleanValue() && zzt.isAtLeastN()) {
            if (zzw.zzcM().zza(this.mActivity, (Configuration) com.google.android.gms.dynamic.zzd.zzF(iObjectWrapper))) {
                this.mActivity.getWindow().addFlags(1024);
                this.mActivity.getWindow().clearFlags(2048);
                return;
            }
            this.mActivity.getWindow().addFlags(2048);
            this.mActivity.getWindow().clearFlags(1024);
        }
    }

    public void zzz(boolean z) {
        int intValue = ((Integer) zzgd.zzFv.get()).intValue();
        zza com_google_android_gms_ads_internal_overlay_zzp_zza = new zza();
        com_google_android_gms_ads_internal_overlay_zzp_zza.size = 50;
        com_google_android_gms_ads_internal_overlay_zzp_zza.paddingLeft = z ? intValue : 0;
        com_google_android_gms_ads_internal_overlay_zzp_zza.paddingRight = z ? 0 : intValue;
        com_google_android_gms_ads_internal_overlay_zzp_zza.paddingTop = 0;
        com_google_android_gms_ads_internal_overlay_zzp_zza.paddingBottom = intValue;
        this.zzNi = new zzp(this.mActivity, com_google_android_gms_ads_internal_overlay_zzp_zza, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.zzNi.zza(z, this.zzNg.zzNK);
        this.zzNo.addView(this.zzNi, layoutParams);
    }
}
