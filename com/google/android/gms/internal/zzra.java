package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.zzt;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
class zzra extends WebView implements OnGlobalLayoutListener, DownloadListener, zzqw {
    @Nullable
    private final zzaw zzGP;
    private int zzMB = -1;
    private int zzMC = -1;
    private int zzMy = -1;
    private int zzMz = -1;
    private String zzOV = "";
    private zzgj zzOW;
    private Boolean zzWO;
    private final zza zzZZ;
    private final zzu zzaaa;
    private zzqx zzaab;
    private zze zzaac;
    private boolean zzaad;
    private boolean zzaae;
    private boolean zzaaf;
    private boolean zzaag;
    private int zzaah;
    private boolean zzaai = true;
    boolean zzaaj = false;
    private zzrb zzaak;
    private boolean zzaal;
    private boolean zzaam;
    private zzgy zzaan;
    private int zzaao;
    private int zzaap;
    private zzgj zzaaq;
    private zzgj zzaar;
    private zzgk zzaas;
    private WeakReference<OnClickListener> zzaat;
    private zze zzaau;
    private boolean zzaav;
    private Map<String, zzis> zzaaw;
    private final Object zzrJ = new Object();
    private final com.google.android.gms.ads.internal.zze zzsv;
    private final zzqh zztt;
    private zzeg zzus;
    private zzqd zzvY;
    private final WindowManager zzwo;

    class C06502 implements Runnable {
        final /* synthetic */ zzra zzaax;

        C06502(zzra com_google_android_gms_internal_zzra) {
            this.zzaax = com_google_android_gms_internal_zzra;
        }

        public void run() {
            super.destroy();
        }
    }

    @zzme
    public static class zza extends MutableContextWrapper {
        private Activity zzYJ;
        private Context zzaay;
        private Context zzwi;

        public zza(Context context) {
            super(context);
            setBaseContext(context);
        }

        public Object getSystemService(String str) {
            return this.zzaay.getSystemService(str);
        }

        public void setBaseContext(Context context) {
            this.zzwi = context.getApplicationContext();
            this.zzYJ = context instanceof Activity ? (Activity) context : null;
            this.zzaay = context;
            super.setBaseContext(this.zzwi);
        }

        public void startActivity(Intent intent) {
            if (this.zzYJ != null) {
                this.zzYJ.startActivity(intent);
                return;
            }
            intent.setFlags(268435456);
            this.zzwi.startActivity(intent);
        }

        public Activity zzlr() {
            return this.zzYJ;
        }

        public Context zzls() {
            return this.zzaay;
        }
    }

    class C11231 implements zzid {
        final /* synthetic */ zzra zzaax;

        C11231(zzra com_google_android_gms_internal_zzra) {
            this.zzaax = com_google_android_gms_internal_zzra;
        }

        public void zza(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
            if (map != null) {
                String str = (String) map.get(SettingsJsonConstants.ICON_HEIGHT_KEY);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        int parseInt = Integer.parseInt(str);
                        synchronized (this.zzaax.zzrJ) {
                            if (this.zzaax.zzaap != parseInt) {
                                this.zzaax.zzaap = parseInt;
                                this.zzaax.requestLayout();
                            }
                        }
                    } catch (Throwable e) {
                        zzqf.zzc("Exception occurred while getting webview content height", e);
                    }
                }
            }
        }
    }

    protected zzra(zza com_google_android_gms_internal_zzra_zza, zzeg com_google_android_gms_internal_zzeg, boolean z, boolean z2, @Nullable zzaw com_google_android_gms_internal_zzaw, zzqh com_google_android_gms_internal_zzqh, zzgl com_google_android_gms_internal_zzgl, zzu com_google_android_gms_ads_internal_zzu, com.google.android.gms.ads.internal.zze com_google_android_gms_ads_internal_zze) {
        super(com_google_android_gms_internal_zzra_zza);
        this.zzZZ = com_google_android_gms_internal_zzra_zza;
        this.zzus = com_google_android_gms_internal_zzeg;
        this.zzaaf = z;
        this.zzaah = -1;
        this.zzGP = com_google_android_gms_internal_zzaw;
        this.zztt = com_google_android_gms_internal_zzqh;
        this.zzaaa = com_google_android_gms_ads_internal_zzu;
        this.zzsv = com_google_android_gms_ads_internal_zze;
        this.zzwo = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzw.zzcM().zza((Context) com_google_android_gms_internal_zzra_zza, com_google_android_gms_internal_zzqh.zzba, settings);
        zzw.zzcO().zza(getContext(), settings);
        setDownloadListener(this);
        zzmg();
        if (zzt.zzzj()) {
            addJavascriptInterface(new zzrc(this), "googleAdsJsInterface");
        }
        zzt.zzze();
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzvY = new zzqd(this.zzZZ.zzlr(), this, this, null);
        zzd(com_google_android_gms_internal_zzgl);
        zzw.zzcO().zzW(com_google_android_gms_internal_zzra_zza);
    }

    private void zzP(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    static zzra zzb(Context context, zzeg com_google_android_gms_internal_zzeg, boolean z, boolean z2, @Nullable zzaw com_google_android_gms_internal_zzaw, zzqh com_google_android_gms_internal_zzqh, zzgl com_google_android_gms_internal_zzgl, zzu com_google_android_gms_ads_internal_zzu, com.google.android.gms.ads.internal.zze com_google_android_gms_ads_internal_zze) {
        return new zzra(new zza(context), com_google_android_gms_internal_zzeg, z, z2, com_google_android_gms_internal_zzaw, com_google_android_gms_internal_zzqh, com_google_android_gms_internal_zzgl, com_google_android_gms_ads_internal_zzu, com_google_android_gms_ads_internal_zze);
    }

    private void zzd(zzgl com_google_android_gms_internal_zzgl) {
        zzmk();
        this.zzaas = new zzgk(new zzgl(true, "make_wv", this.zzus.zzzy));
        this.zzaas.zzfA().zzc(com_google_android_gms_internal_zzgl);
        this.zzOW = zzgh.zzb(this.zzaas.zzfA());
        this.zzaas.zza("native:view_create", this.zzOW);
        this.zzaar = null;
        this.zzaaq = null;
    }

    private void zzkC() {
        synchronized (this.zzrJ) {
            if (!this.zzaav) {
                this.zzaav = true;
                zzw.zzcQ().zzkC();
            }
        }
    }

    private void zzmc() {
        synchronized (this.zzrJ) {
            this.zzWO = zzw.zzcQ().zzkq();
            if (this.zzWO == null) {
                try {
                    evaluateJavascript("(function(){})()", null);
                    zza(Boolean.valueOf(true));
                } catch (IllegalStateException e) {
                    zza(Boolean.valueOf(false));
                }
            }
        }
    }

    private void zzmd() {
        zzgh.zza(this.zzaas.zzfA(), this.zzOW, "aeh2");
    }

    private void zzme() {
        zzgh.zza(this.zzaas.zzfA(), this.zzOW, "aebb2");
    }

    private void zzmg() {
        synchronized (this.zzrJ) {
            if (this.zzaaf || this.zzus.zzzz) {
                int i = VERSION.SDK_INT;
                zzqf.zzbf("Enabling hardware acceleration on an overlay.");
                zzmi();
            } else if (VERSION.SDK_INT < 18) {
                zzqf.zzbf("Disabling hardware acceleration on an AdView.");
                zzmh();
            } else {
                zzqf.zzbf("Enabling hardware acceleration on an AdView.");
                zzmi();
            }
        }
    }

    private void zzmh() {
        synchronized (this.zzrJ) {
            if (!this.zzaag) {
                zzw.zzcO().zzu(this);
            }
            this.zzaag = true;
        }
    }

    private void zzmi() {
        synchronized (this.zzrJ) {
            if (this.zzaag) {
                zzw.zzcO().zzt(this);
            }
            this.zzaag = false;
        }
    }

    private void zzmj() {
        synchronized (this.zzrJ) {
            this.zzaaw = null;
        }
    }

    private void zzmk() {
        if (this.zzaas != null) {
            zzgl zzfA = this.zzaas.zzfA();
            if (zzfA != null && zzw.zzcQ().zzkk() != null) {
                zzw.zzcQ().zzkk().zza(zzfA);
            }
        }
    }

    public void destroy() {
        synchronized (this.zzrJ) {
            zzmk();
            this.zzvY.zzlf();
            if (this.zzaac != null) {
                this.zzaac.close();
                this.zzaac.onDestroy();
                this.zzaac = null;
            }
            this.zzaab.reset();
            if (this.zzaae) {
                return;
            }
            zzw.zzdj().zze(this);
            zzmj();
            this.zzaae = true;
            zzpk.m28v("Initiating WebView self destruct sequence in 3...");
            this.zzaab.zzlS();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(19)
    public void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r1 = r2.zzrJ;
        monitor-enter(r1);
        r0 = r2.isDestroyed();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.internal.zzqf.zzbh(r0);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        r4.onReceiveValue(r0);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0015:
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0015;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzra.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this.zzrJ) {
                if (!this.zzaae) {
                    this.zzaab.reset();
                    zzw.zzdj().zze(this);
                    zzmj();
                    zzkC();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public String getRequestId() {
        String str;
        synchronized (this.zzrJ) {
            str = this.zzOV;
        }
        return str;
    }

    public int getRequestedOrientation() {
        int i;
        synchronized (this.zzrJ) {
            i = this.zzaah;
        }
        return i;
    }

    public View getView() {
        return this;
    }

    public WebView getWebView() {
        return this;
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaae;
        }
        return z;
    }

    public void loadData(String str, String str2, String str3) {
        synchronized (this.zzrJ) {
            if (isDestroyed()) {
                zzqf.zzbh("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.zzrJ) {
            if (isDestroyed()) {
                zzqf.zzbh("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public void loadUrl(String str) {
        synchronized (this.zzrJ) {
            if (isDestroyed()) {
                zzqf.zzbh("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable th) {
                    zzw.zzcQ().zza(th, "AdWebViewImpl.loadUrl");
                    zzqf.zzc("Could not call loadUrl. ", th);
                }
            }
        }
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        synchronized (this.zzrJ) {
            super.onAttachedToWindow();
            if (!isDestroyed()) {
                this.zzvY.onAttachedToWindow();
            }
            boolean z2 = this.zzaal;
            if (zzlv() == null || !zzlv().zzlO()) {
                z = z2;
            } else if (!this.zzaam) {
                OnGlobalLayoutListener zzlP = zzlv().zzlP();
                if (zzlP != null) {
                    zzw.zzdk().zza(getView(), zzlP);
                }
                OnScrollChangedListener zzlQ = zzlv().zzlQ();
                if (zzlQ != null) {
                    zzw.zzdk().zza(getView(), zzlQ);
                }
                this.zzaam = true;
            }
            zzP(z);
        }
    }

    protected void onDetachedFromWindow() {
        synchronized (this.zzrJ) {
            if (!isDestroyed()) {
                this.zzvY.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzaam && zzlv() != null && zzlv().zzlO() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener zzlP = zzlv().zzlP();
                if (zzlP != null) {
                    zzw.zzcO().zza(getViewTreeObserver(), zzlP);
                }
                OnScrollChangedListener zzlQ = zzlv().zzlQ();
                if (zzlQ != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(zzlQ);
                }
                this.zzaam = false;
            }
        }
        zzP(false);
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzw.zzcM().zzb(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            zzqf.zzbf(new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (zzlv() != null && zzlv().zzlZ() != null) {
                    zzlv().zzlZ().zzce();
                }
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) zzgd.zzCK.get()).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if ((motionEvent.getActionMasked() == 8 ? 1 : 0) != 0 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void onGlobalLayout() {
        boolean zzmb = zzmb();
        zze zzlt = zzlt();
        if (zzlt != null && zzmb) {
            zzlt.zzhJ();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.zzrJ;
        monitor-enter(r4);
        r1 = r9.isDestroyed();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
    L_0x0018:
        return;
    L_0x0019:
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x001f:
        r1 = r9.zzaaf;	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x0023:
        r1 = r9.zzus;	 Catch:{ all -> 0x002e }
        r1 = r1.zzzB;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0031;
    L_0x0029:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r1 = r9.zzus;	 Catch:{ all -> 0x002e }
        r1 = r1.zzzC;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0082;
    L_0x0037:
        r0 = com.google.android.gms.internal.zzgd.zzEy;	 Catch:{ all -> 0x002e }
        r0 = r0.get();	 Catch:{ all -> 0x002e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x002e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x004b;
    L_0x0045:
        r0 = com.google.android.gms.common.util.zzt.zzzj();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x0050;
    L_0x004b:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0050:
        r0 = "/contentHeight";
        r1 = r9.zzmf();	 Catch:{ all -> 0x002e }
        r9.zza(r0, r1);	 Catch:{ all -> 0x002e }
        r0 = "(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();";
        r9.zzbm(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.zzZZ;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r2 = r9.zzaap;	 Catch:{ all -> 0x002e }
        switch(r2) {
            case -1: goto L_0x007d;
            default: goto L_0x0073;
        };	 Catch:{ all -> 0x002e }
    L_0x0073:
        r2 = r9.zzaap;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r0 = r0 * r2;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
    L_0x0078:
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x007d:
        r0 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        goto L_0x0078;
    L_0x0082:
        r1 = r9.zzus;	 Catch:{ all -> 0x002e }
        r1 = r1.zzzz;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x00a0;
    L_0x0088:
        r0 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x002e }
        r0.<init>();	 Catch:{ all -> 0x002e }
        r1 = r9.zzwo;	 Catch:{ all -> 0x002e }
        r1 = r1.getDefaultDisplay();	 Catch:{ all -> 0x002e }
        r1.getMetrics(r0);	 Catch:{ all -> 0x002e }
        r1 = r0.widthPixels;	 Catch:{ all -> 0x002e }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x00a0:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x002e }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        if (r2 == r6) goto L_0x00b4;
    L_0x00b2:
        if (r2 != r8) goto L_0x014b;
    L_0x00b4:
        r2 = r3;
    L_0x00b5:
        if (r5 == r6) goto L_0x00b9;
    L_0x00b7:
        if (r5 != r8) goto L_0x00ba;
    L_0x00b9:
        r0 = r1;
    L_0x00ba:
        r5 = r9.zzus;	 Catch:{ all -> 0x002e }
        r5 = r5.widthPixels;	 Catch:{ all -> 0x002e }
        if (r5 > r2) goto L_0x00c6;
    L_0x00c0:
        r2 = r9.zzus;	 Catch:{ all -> 0x002e }
        r2 = r2.heightPixels;	 Catch:{ all -> 0x002e }
        if (r2 <= r0) goto L_0x0135;
    L_0x00c6:
        r0 = r9.zzZZ;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r2 = r9.zzus;	 Catch:{ all -> 0x002e }
        r2 = r2.widthPixels;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x002e }
        r5 = r9.zzus;	 Catch:{ all -> 0x002e }
        r5 = r5.heightPixels;	 Catch:{ all -> 0x002e }
        r5 = (float) r5;	 Catch:{ all -> 0x002e }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x002e }
        r3 = (float) r3;	 Catch:{ all -> 0x002e }
        r3 = r3 / r0;
        r3 = (int) r3;	 Catch:{ all -> 0x002e }
        r1 = (float) r1;	 Catch:{ all -> 0x002e }
        r0 = r1 / r0;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r6.<init>(r1);	 Catch:{ all -> 0x002e }
        r1 = "Not enough space to show ad. Needs ";
        r1 = r6.append(r1);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x002e }
        r2 = " dp, but only has ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r3);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r0 = r1.append(r0);	 Catch:{ all -> 0x002e }
        r1 = " dp.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x002e }
        r0 = r0.toString();	 Catch:{ all -> 0x002e }
        com.google.android.gms.internal.zzqf.zzbh(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x012d;
    L_0x0129:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x012d:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
    L_0x0132:
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0135:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x013f;
    L_0x013b:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x013f:
        r0 = r9.zzus;	 Catch:{ all -> 0x002e }
        r0 = r0.widthPixels;	 Catch:{ all -> 0x002e }
        r1 = r9.zzus;	 Catch:{ all -> 0x002e }
        r1 = r1.heightPixels;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        goto L_0x0132;
    L_0x014b:
        r2 = r0;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzra.onMeasure(int, int):void");
    }

    public void onPause() {
        if (!isDestroyed()) {
            try {
                zzt.zzze();
                super.onPause();
            } catch (Throwable e) {
                zzqf.zzb("Could not pause webview.", e);
            }
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            try {
                zzt.zzze();
                super.onResume();
            } catch (Throwable e) {
                zzqf.zzb("Could not resume webview.", e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (zzlv().zzlO()) {
            synchronized (this.zzrJ) {
                if (this.zzaan != null) {
                    this.zzaan.zzc(motionEvent);
                }
            }
        } else if (this.zzGP != null) {
            this.zzGP.zza(motionEvent);
        }
        return isDestroyed() ? false : super.onTouchEvent(motionEvent);
    }

    public void setContext(Context context) {
        this.zzZZ.setBaseContext(context);
        this.zzvY.zzl(this.zzZZ.zzlr());
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.zzaat = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public void setRequestedOrientation(int i) {
        synchronized (this.zzrJ) {
            this.zzaah = i;
            if (this.zzaac != null) {
                this.zzaac.setRequestedOrientation(this.zzaah);
            }
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzqx) {
            this.zzaab = (zzqx) webViewClient;
        }
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                zzqf.zzb("Could not stop loading webview.", e);
            }
        }
    }

    public void zzK(boolean z) {
        synchronized (this.zzrJ) {
            this.zzaaf = z;
            zzmg();
        }
    }

    public void zzL(boolean z) {
        synchronized (this.zzrJ) {
            if (this.zzaac != null) {
                this.zzaac.zza(this.zzaab.zzdD(), z);
            } else {
                this.zzaad = z;
            }
        }
    }

    public void zzM(int i) {
        if (i == 0) {
            zzme();
        }
        zzmd();
        if (this.zzaas.zzfA() != null) {
            this.zzaas.zzfA().zzh("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zztt.zzba);
        zza("onhide", hashMap);
    }

    public void zzM(boolean z) {
        synchronized (this.zzrJ) {
            this.zzaai = z;
        }
    }

    public void zzN(boolean z) {
        synchronized (this.zzrJ) {
            this.zzaao = (z ? 1 : -1) + this.zzaao;
            if (this.zzaao <= 0 && this.zzaac != null) {
                this.zzaac.zzhM();
            }
        }
    }

    public void zza(Context context, zzeg com_google_android_gms_internal_zzeg, zzgl com_google_android_gms_internal_zzgl) {
        synchronized (this.zzrJ) {
            this.zzvY.zzlf();
            setContext(context);
            this.zzaac = null;
            this.zzus = com_google_android_gms_internal_zzeg;
            this.zzaaf = false;
            this.zzaad = false;
            this.zzOV = "";
            this.zzaah = -1;
            zzw.zzcO().zzm(this);
            loadUrl("about:blank");
            this.zzaab.reset();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.zzaai = true;
            this.zzaaj = false;
            this.zzaak = null;
            zzd(com_google_android_gms_internal_zzgl);
            this.zzaal = false;
            this.zzaao = 0;
            zzw.zzdj().zze(this);
            zzmj();
        }
    }

    public void zza(com.google.android.gms.internal.zzcy.zza com_google_android_gms_internal_zzcy_zza) {
        synchronized (this.zzrJ) {
            this.zzaal = com_google_android_gms_internal_zzcy_zza.zzxl;
        }
        zzP(com_google_android_gms_internal_zzcy_zza.zzxl);
    }

    public void zza(zzeg com_google_android_gms_internal_zzeg) {
        synchronized (this.zzrJ) {
            this.zzus = com_google_android_gms_internal_zzeg;
            requestLayout();
        }
    }

    public void zza(zzrb com_google_android_gms_internal_zzrb) {
        synchronized (this.zzrJ) {
            if (this.zzaak != null) {
                zzqf.m9e("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.zzaak = com_google_android_gms_internal_zzrb;
        }
    }

    void zza(Boolean bool) {
        synchronized (this.zzrJ) {
            this.zzWO = bool;
        }
        zzw.zzcQ().zza(bool);
    }

    @TargetApi(19)
    protected void zza(String str, ValueCallback<String> valueCallback) {
        synchronized (this.zzrJ) {
            if (isDestroyed()) {
                zzqf.zzbh("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                evaluateJavascript(str, valueCallback);
            }
        }
    }

    public void zza(String str, zzid com_google_android_gms_internal_zzid) {
        if (this.zzaab != null) {
            this.zzaab.zza(str, com_google_android_gms_internal_zzid);
        }
    }

    public void zza(String str, Map<String, ?> map) {
        try {
            zzb(str, zzw.zzcM().zzQ((Map) map));
        } catch (JSONException e) {
            zzqf.zzbh("Could not convert parameters to JSON.");
        }
    }

    public void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzj(str, jSONObject.toString());
    }

    public void zzb(zze com_google_android_gms_ads_internal_overlay_zze) {
        synchronized (this.zzrJ) {
            this.zzaac = com_google_android_gms_ads_internal_overlay_zze;
        }
    }

    public void zzb(zzgy com_google_android_gms_internal_zzgy) {
        synchronized (this.zzrJ) {
            this.zzaan = com_google_android_gms_internal_zzgy;
        }
    }

    public void zzb(String str, zzid com_google_android_gms_internal_zzid) {
        if (this.zzaab != null) {
            this.zzaab.zzb(str, com_google_android_gms_internal_zzid);
        }
    }

    public void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        String str2 = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        zzqf.zzbf(jSONObject2.length() != 0 ? str2.concat(jSONObject2) : new String(str2));
        zzbm(stringBuilder.toString());
    }

    public zzeg zzbC() {
        zzeg com_google_android_gms_internal_zzeg;
        synchronized (this.zzrJ) {
            com_google_android_gms_internal_zzeg = this.zzus;
        }
        return com_google_android_gms_internal_zzeg;
    }

    public void zzbV() {
        synchronized (this.zzrJ) {
            this.zzaaj = true;
            if (this.zzaaa != null) {
                this.zzaaa.zzbV();
            }
        }
    }

    public void zzbW() {
        synchronized (this.zzrJ) {
            this.zzaaj = false;
            if (this.zzaaa != null) {
                this.zzaaa.zzbW();
            }
        }
    }

    public void zzbi(String str) {
        synchronized (this.zzrJ) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                zzw.zzcQ().zza(th, "AdWebViewImpl.loadUrlUnsafe");
                zzqf.zzc("Could not call loadUrl. ", th);
            }
        }
    }

    public void zzbj(String str) {
        synchronized (this.zzrJ) {
            if (str == null) {
                str = "";
            }
            this.zzOV = str;
        }
    }

    protected void zzbl(String str) {
        synchronized (this.zzrJ) {
            if (isDestroyed()) {
                zzqf.zzbh("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    protected void zzbm(String str) {
        if (zzt.zzzl()) {
            if (zzkq() == null) {
                zzmc();
            }
            if (zzkq().booleanValue()) {
                zza(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            zzbl(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        str2 = "javascript:";
        valueOf = String.valueOf(str);
        zzbl(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public com.google.android.gms.ads.internal.zze zzby() {
        return this.zzsv;
    }

    public void zzc(zze com_google_android_gms_ads_internal_overlay_zze) {
        synchronized (this.zzrJ) {
            this.zzaau = com_google_android_gms_ads_internal_overlay_zze;
        }
    }

    public void zzhK() {
        if (this.zzaaq == null) {
            zzgh.zza(this.zzaas.zzfA(), this.zzOW, "aes2");
            this.zzaaq = zzgh.zzb(this.zzaas.zzfA());
            this.zzaas.zza("native:view_show", this.zzaaq);
        }
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zztt.zzba);
        zza("onshow", hashMap);
    }

    public void zzj(String str, String str2) {
        zzbm(new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length()).append(str).append("(").append(str2).append(");").toString());
    }

    Boolean zzkq() {
        Boolean bool;
        synchronized (this.zzrJ) {
            bool = this.zzWO;
        }
        return bool;
    }

    public void zzlA() {
        synchronized (this.zzrJ) {
            zzpk.m28v("Destroying WebView!");
            zzkC();
            zzpo.zzXC.post(new C06502(this));
        }
    }

    public boolean zzlB() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaai;
        }
        return z;
    }

    public boolean zzlC() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaaj;
        }
        return z;
    }

    public zzqv zzlD() {
        return null;
    }

    public zzgj zzlE() {
        return this.zzOW;
    }

    public zzgk zzlF() {
        return this.zzaas;
    }

    public zzrb zzlG() {
        zzrb com_google_android_gms_internal_zzrb;
        synchronized (this.zzrJ) {
            com_google_android_gms_internal_zzrb = this.zzaak;
        }
        return com_google_android_gms_internal_zzrb;
    }

    public boolean zzlH() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaao > 0;
        }
        return z;
    }

    public void zzlI() {
        this.zzvY.zzle();
    }

    public void zzlJ() {
        if (this.zzaar == null) {
            this.zzaar = zzgh.zzb(this.zzaas.zzfA());
            this.zzaas.zza("native:view_load", this.zzaar);
        }
    }

    public OnClickListener zzlK() {
        return (OnClickListener) this.zzaat.get();
    }

    public zzgy zzlL() {
        zzgy com_google_android_gms_internal_zzgy;
        synchronized (this.zzrJ) {
            com_google_android_gms_internal_zzgy = this.zzaan;
        }
        return com_google_android_gms_internal_zzgy;
    }

    public void zzlM() {
        setBackgroundColor(0);
    }

    public void zzlp() {
        zzmd();
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.zztt.zzba);
        zza("onhide", hashMap);
    }

    public void zzlq() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzw.zzcM().zzcs()));
        hashMap.put("app_volume", String.valueOf(zzw.zzcM().zzcq()));
        hashMap.put("device_volume", String.valueOf(zzw.zzcM().zzS(getContext())));
        zza("volume", hashMap);
    }

    public Activity zzlr() {
        return this.zzZZ.zzlr();
    }

    public Context zzls() {
        return this.zzZZ.zzls();
    }

    public zze zzlt() {
        zze com_google_android_gms_ads_internal_overlay_zze;
        synchronized (this.zzrJ) {
            com_google_android_gms_ads_internal_overlay_zze = this.zzaac;
        }
        return com_google_android_gms_ads_internal_overlay_zze;
    }

    public zze zzlu() {
        zze com_google_android_gms_ads_internal_overlay_zze;
        synchronized (this.zzrJ) {
            com_google_android_gms_ads_internal_overlay_zze = this.zzaau;
        }
        return com_google_android_gms_ads_internal_overlay_zze;
    }

    public zzqx zzlv() {
        return this.zzaab;
    }

    public boolean zzlw() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaad;
        }
        return z;
    }

    public zzaw zzlx() {
        return this.zzGP;
    }

    public zzqh zzly() {
        return this.zztt;
    }

    public boolean zzlz() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzaaf;
        }
        return z;
    }

    public boolean zzmb() {
        if (!zzlv().zzdD() && !zzlv().zzlO()) {
            return false;
        }
        int i;
        int i2;
        DisplayMetrics zza = zzw.zzcM().zza(this.zzwo);
        int zzb = zzel.zzeT().zzb(zza, zza.widthPixels);
        int zzb2 = zzel.zzeT().zzb(zza, zza.heightPixels);
        Activity zzlr = zzlr();
        if (zzlr == null || zzlr.getWindow() == null) {
            i = zzb2;
            i2 = zzb;
        } else {
            int[] zzh = zzw.zzcM().zzh(zzlr);
            i2 = zzel.zzeT().zzb(zza, zzh[0]);
            i = zzel.zzeT().zzb(zza, zzh[1]);
        }
        if (this.zzMy == zzb && this.zzMz == zzb2 && this.zzMB == i2 && this.zzMC == i) {
            return false;
        }
        boolean z = (this.zzMy == zzb && this.zzMz == zzb2) ? false : true;
        this.zzMy = zzb;
        this.zzMz = zzb2;
        this.zzMB = i2;
        this.zzMC = i;
        new zzkw(this).zza(zzb, zzb2, i2, i, zza.density, this.zzwo.getDefaultDisplay().getRotation());
        return z;
    }

    zzid zzmf() {
        return new C11231(this);
    }
}
