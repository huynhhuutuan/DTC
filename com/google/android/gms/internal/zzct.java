package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzme
public class zzct implements OnGlobalLayoutListener, OnScrollChangedListener {
    protected final Object zzrJ = new Object();
    private boolean zzuo = false;
    private zzpz zzvT;
    private final Context zzwi;
    private final WeakReference<zzpb> zzwk;
    private WeakReference<ViewTreeObserver> zzwl;
    private final zzda zzwm;
    protected final zzcr zzwn;
    private final WindowManager zzwo;
    private final PowerManager zzwp;
    private final KeyguardManager zzwq;
    @Nullable
    private zzcu zzwr;
    private boolean zzws;
    private boolean zzwt = false;
    private boolean zzwu;
    private boolean zzwv;
    private boolean zzww;
    @Nullable
    BroadcastReceiver zzwx;
    private final HashSet<Object> zzwy = new HashSet();
    private final HashSet<zzcx> zzwz = new HashSet();

    class C05291 extends BroadcastReceiver {
        final /* synthetic */ zzct zzwA;

        C05291(zzct com_google_android_gms_internal_zzct) {
            this.zzwA = com_google_android_gms_internal_zzct;
        }

        public void onReceive(Context context, Intent intent) {
            this.zzwA.zzk(3);
        }
    }

    public static class zza implements zzda {
        private WeakReference<zzha> zzwB;

        public zza(zzha com_google_android_gms_internal_zzha) {
            this.zzwB = new WeakReference(com_google_android_gms_internal_zzha);
        }

        @Nullable
        public View zzdS() {
            zzha com_google_android_gms_internal_zzha = (zzha) this.zzwB.get();
            return com_google_android_gms_internal_zzha != null ? com_google_android_gms_internal_zzha.zzgc() : null;
        }

        public boolean zzdT() {
            return this.zzwB.get() == null;
        }

        public zzda zzdU() {
            return new zzb((zzha) this.zzwB.get());
        }
    }

    public static class zzb implements zzda {
        private zzha zzwC;

        public zzb(zzha com_google_android_gms_internal_zzha) {
            this.zzwC = com_google_android_gms_internal_zzha;
        }

        public View zzdS() {
            return this.zzwC != null ? this.zzwC.zzgc() : null;
        }

        public boolean zzdT() {
            return this.zzwC == null;
        }

        public zzda zzdU() {
            return this;
        }
    }

    public static class zzc implements zzda {
        @Nullable
        private final View mView;
        @Nullable
        private final zzpb zzwD;

        public zzc(View view, zzpb com_google_android_gms_internal_zzpb) {
            this.mView = view;
            this.zzwD = com_google_android_gms_internal_zzpb;
        }

        public View zzdS() {
            return this.mView;
        }

        public boolean zzdT() {
            return this.zzwD == null || this.mView == null;
        }

        public zzda zzdU() {
            return this;
        }
    }

    public static class zzd implements zzda {
        private final WeakReference<View> zzwE;
        private final WeakReference<zzpb> zzwF;

        public zzd(View view, zzpb com_google_android_gms_internal_zzpb) {
            this.zzwE = new WeakReference(view);
            this.zzwF = new WeakReference(com_google_android_gms_internal_zzpb);
        }

        public View zzdS() {
            return (View) this.zzwE.get();
        }

        public boolean zzdT() {
            return this.zzwE.get() == null || this.zzwF.get() == null;
        }

        public zzda zzdU() {
            return new zzc((View) this.zzwE.get(), (zzpb) this.zzwF.get());
        }
    }

    public zzct(Context context, zzeg com_google_android_gms_internal_zzeg, zzpb com_google_android_gms_internal_zzpb, zzqh com_google_android_gms_internal_zzqh, zzda com_google_android_gms_internal_zzda) {
        this.zzwk = new WeakReference(com_google_android_gms_internal_zzpb);
        this.zzwm = com_google_android_gms_internal_zzda;
        this.zzwl = new WeakReference(null);
        this.zzwu = true;
        this.zzww = false;
        this.zzvT = new zzpz(200);
        this.zzwn = new zzcr(UUID.randomUUID().toString(), com_google_android_gms_internal_zzqh, com_google_android_gms_internal_zzeg.zzzy, com_google_android_gms_internal_zzpb.zzWa, com_google_android_gms_internal_zzpb.zzdD(), com_google_android_gms_internal_zzeg.zzzB);
        this.zzwo = (WindowManager) context.getSystemService("window");
        this.zzwp = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.zzwq = (KeyguardManager) context.getSystemService("keyguard");
        this.zzwi = context;
    }

    protected void destroy() {
        synchronized (this.zzrJ) {
            zzdL();
            zzdG();
            this.zzwu = false;
            zzdI();
            zzdN();
        }
    }

    boolean isScreenOn() {
        return this.zzwp.isScreenOn();
    }

    public void onGlobalLayout() {
        zzk(2);
    }

    public void onScrollChanged() {
        zzk(1);
    }

    public void pause() {
        synchronized (this.zzrJ) {
            this.zzuo = true;
            zzk(3);
        }
    }

    public void resume() {
        synchronized (this.zzrJ) {
            this.zzuo = false;
            zzk(3);
        }
    }

    public void stop() {
        synchronized (this.zzrJ) {
            this.zzwt = true;
            zzk(3);
        }
    }

    protected int zza(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    JSONObject zza(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    protected void zza(View view, Map<String, String> map) {
        zzk(3);
    }

    public void zza(zzcu com_google_android_gms_internal_zzcu) {
        synchronized (this.zzrJ) {
            this.zzwr = com_google_android_gms_internal_zzcu;
        }
    }

    public void zza(zzcx com_google_android_gms_internal_zzcx) {
        if (this.zzwz.isEmpty()) {
            zzdF();
            zzk(3);
        }
        this.zzwz.add(com_google_android_gms_internal_zzcx);
        try {
            com_google_android_gms_internal_zzcx.zzc(zza(zzd(this.zzwm.zzdS())), false);
        } catch (Throwable e) {
            zzqf.zzb("Skipping measurement update for new client.", e);
        }
    }

    void zza(zzcx com_google_android_gms_internal_zzcx, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.zzwn.zzdC());
        zzqf.zzbf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzb(com_google_android_gms_internal_zzcx);
    }

    protected void zza(JSONObject jSONObject, boolean z) {
        try {
            zzb(zza(jSONObject), z);
        } catch (Throwable th) {
            zzqf.zzb("Skipping active view message.", th);
        }
    }

    public void zzb(zzcx com_google_android_gms_internal_zzcx) {
        this.zzwz.remove(com_google_android_gms_internal_zzcx);
        com_google_android_gms_internal_zzcx.zzdW();
        if (this.zzwz.isEmpty()) {
            destroy();
        }
    }

    void zzb(zzqw com_google_android_gms_internal_zzqw, Map<String, String> map) {
        zza(com_google_android_gms_internal_zzqw.getView(), (Map) map);
    }

    protected void zzb(JSONObject jSONObject, boolean z) {
        Iterator it = new ArrayList(this.zzwz).iterator();
        while (it.hasNext()) {
            ((zzcx) it.next()).zzc(jSONObject, z);
        }
    }

    boolean zzb(@Nullable Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        boolean z = !TextUtils.isEmpty(str) && str.equals(this.zzwn.zzdC());
        return z;
    }

    void zzc(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            zzj(z);
        }
    }

    protected JSONObject zzd(@Nullable View view) throws JSONException {
        if (view == null) {
            return zzdP();
        }
        boolean isAttachedToWindow = zzw.zzcO().isAttachedToWindow(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            zzqf.zzb("Failure getting view location.", e);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.zzwo.getDefaultDisplay().getWidth();
        rect2.bottom = this.zzwo.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject zzdM = zzdM();
        zzdM.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", isAttachedToWindow).put("viewBox", new JSONObject().put("top", zza(rect2.top, displayMetrics)).put("bottom", zza(rect2.bottom, displayMetrics)).put("left", zza(rect2.left, displayMetrics)).put("right", zza(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", zza(rect.top, displayMetrics)).put("bottom", zza(rect.bottom, displayMetrics)).put("left", zza(rect.left, displayMetrics)).put("right", zza(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", zza(rect3.top, displayMetrics)).put("bottom", zza(rect3.bottom, displayMetrics)).put("left", zza(rect3.left, displayMetrics)).put("right", zza(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", zza(rect4.top, displayMetrics)).put("bottom", zza(rect4.bottom, displayMetrics)).put("left", zza(rect4.left, displayMetrics)).put("right", zza(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", zza(rect5.top, displayMetrics)).put("bottom", zza(rect5.bottom, displayMetrics)).put("left", zza(rect5.left, displayMetrics)).put("right", zza(rect5.right, displayMetrics))).put("screenDensity", (double) displayMetrics.density).put("isVisible", zzw.zzcM().zza(view, this.zzwp, this.zzwq));
        return zzdM;
    }

    protected void zzdF() {
        synchronized (this.zzrJ) {
            if (this.zzwx != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.zzwx = new C05291(this);
            this.zzwi.registerReceiver(this.zzwx, intentFilter);
        }
    }

    protected void zzdG() {
        synchronized (this.zzrJ) {
            if (this.zzwx != null) {
                try {
                    this.zzwi.unregisterReceiver(this.zzwx);
                } catch (Throwable e) {
                    zzqf.zzb("Failed trying to unregister the receiver", e);
                } catch (Throwable e2) {
                    zzw.zzcQ().zza(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                }
                this.zzwx = null;
            }
        }
    }

    public void zzdH() {
        synchronized (this.zzrJ) {
            if (this.zzwu) {
                this.zzwv = true;
                try {
                    zza(zzdQ(), true);
                } catch (Throwable e) {
                    zzqf.zzb("JSON failure while processing active view data.", e);
                } catch (Throwable e2) {
                    zzqf.zzb("Failure while processing active view data.", e2);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.zzwn.zzdC());
                zzqf.zzbf(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    protected void zzdI() {
        if (this.zzwr != null) {
            this.zzwr.zza(this);
        }
    }

    public boolean zzdJ() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzwu;
        }
        return z;
    }

    protected void zzdK() {
        View zzdS = this.zzwm.zzdU().zzdS();
        if (zzdS != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzwl.get();
            ViewTreeObserver viewTreeObserver2 = zzdS.getViewTreeObserver();
            if (viewTreeObserver2 != viewTreeObserver) {
                zzdL();
                if (!this.zzws || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                    this.zzws = true;
                    viewTreeObserver2.addOnScrollChangedListener(this);
                    viewTreeObserver2.addOnGlobalLayoutListener(this);
                }
                this.zzwl = new WeakReference(viewTreeObserver2);
            }
        }
    }

    protected void zzdL() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzwl.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    protected JSONObject zzdM() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.zzwn.zzdA()).put("activeViewJSON", this.zzwn.zzdB()).put("timestamp", zzw.zzcS().elapsedRealtime()).put("adFormat", this.zzwn.zzdz()).put("hashCode", this.zzwn.zzdC()).put("isMraid", this.zzwn.zzdD()).put("isStopped", this.zzwt).put("isPaused", this.zzuo).put("isScreenOn", isScreenOn()).put("isNative", this.zzwn.zzdE()).put("appMuted", zzw.zzcM().zzcs()).put("appVolume", (double) zzw.zzcM().zzcq()).put("deviceVolume", (double) zzw.zzcM().zzS(this.zzwi));
        return jSONObject;
    }

    protected void zzdN() {
        Iterator it = new ArrayList(this.zzwz).iterator();
        while (it.hasNext()) {
            zzb((zzcx) it.next());
        }
    }

    protected boolean zzdO() {
        Iterator it = this.zzwz.iterator();
        while (it.hasNext()) {
            if (((zzcx) it.next()).zzdV()) {
                return true;
            }
        }
        return false;
    }

    protected JSONObject zzdP() throws JSONException {
        return zzdM().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
    }

    protected JSONObject zzdQ() throws JSONException {
        JSONObject zzdM = zzdM();
        zzdM.put("doneReasonCode", "u");
        return zzdM;
    }

    public zzcr zzdR() {
        return this.zzwn;
    }

    protected void zzj(boolean z) {
        Iterator it = this.zzwy.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void zzk(int r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = 1;
        r3 = r7.zzrJ;
        monitor-enter(r3);
        r2 = r7.zzdO();	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x000f;
    L_0x000b:
        r2 = r7.zzwu;	 Catch:{ all -> 0x0041 }
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
    L_0x0010:
        return;
    L_0x0011:
        r2 = r7.zzwm;	 Catch:{ all -> 0x0041 }
        r4 = r2.zzdS();	 Catch:{ all -> 0x0041 }
        if (r4 == 0) goto L_0x0044;
    L_0x0019:
        r2 = com.google.android.gms.ads.internal.zzw.zzcM();	 Catch:{ all -> 0x0041 }
        r5 = r7.zzwp;	 Catch:{ all -> 0x0041 }
        r6 = r7.zzwq;	 Catch:{ all -> 0x0041 }
        r2 = r2.zza(r4, r5, r6);	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0044;
    L_0x0027:
        r2 = new android.graphics.Rect;	 Catch:{ all -> 0x0041 }
        r2.<init>();	 Catch:{ all -> 0x0041 }
        r5 = 0;
        r2 = r4.getGlobalVisibleRect(r2, r5);	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0044;
    L_0x0033:
        r2 = r1;
    L_0x0034:
        r5 = r7.zzwm;	 Catch:{ all -> 0x0041 }
        r5 = r5.zzdT();	 Catch:{ all -> 0x0041 }
        if (r5 == 0) goto L_0x0046;
    L_0x003c:
        r7.zzdH();	 Catch:{ all -> 0x0041 }
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        throw r0;
    L_0x0044:
        r2 = r0;
        goto L_0x0034;
    L_0x0046:
        if (r8 != r1) goto L_0x0049;
    L_0x0048:
        r0 = r1;
    L_0x0049:
        if (r0 == 0) goto L_0x0059;
    L_0x004b:
        r0 = r7.zzvT;	 Catch:{ all -> 0x0041 }
        r0 = r0.tryAcquire();	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x0059;
    L_0x0053:
        r0 = r7.zzww;	 Catch:{ all -> 0x0041 }
        if (r2 != r0) goto L_0x0059;
    L_0x0057:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0059:
        if (r2 != 0) goto L_0x0063;
    L_0x005b:
        r0 = r7.zzww;	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x0063;
    L_0x005f:
        if (r8 != r1) goto L_0x0063;
    L_0x0061:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0063:
        r0 = r7.zzd(r4);	 Catch:{ JSONException -> 0x007c, RuntimeException -> 0x0075 }
        r1 = 0;
        r7.zza(r0, r1);	 Catch:{ JSONException -> 0x007c, RuntimeException -> 0x0075 }
        r7.zzww = r2;	 Catch:{ JSONException -> 0x007c, RuntimeException -> 0x0075 }
    L_0x006d:
        r7.zzdK();	 Catch:{ all -> 0x0041 }
        r7.zzdI();	 Catch:{ all -> 0x0041 }
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        goto L_0x0010;
    L_0x0075:
        r0 = move-exception;
    L_0x0076:
        r1 = "Active view update failed.";
        com.google.android.gms.internal.zzqf.zza(r1, r0);	 Catch:{ all -> 0x0041 }
        goto L_0x006d;
    L_0x007c:
        r0 = move-exception;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzct.zzk(int):void");
    }
}
