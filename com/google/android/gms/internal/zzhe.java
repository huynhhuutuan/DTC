package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzcy.zzb;
import com.google.android.gms.internal.zzhh.zza;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzme
public class zzhe extends zza implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    static final String[] zzHf = new String[]{"2011", "1009"};
    @Nullable
    zzha zzGA;
    private final FrameLayout zzHg;
    Map<String, WeakReference<View>> zzHh = new HashMap();
    @Nullable
    View zzHi;
    boolean zzHj = false;
    Point zzHk = new Point();
    Point zzHl = new Point();
    WeakReference<zzcy> zzHm = new WeakReference(null);
    private final Object zzrJ = new Object();
    @Nullable
    FrameLayout zzrY;

    public zzhe(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzHg = frameLayout;
        this.zzrY = frameLayout2;
        zzw.zzdk().zza(this.zzHg, (OnGlobalLayoutListener) this);
        zzw.zzdk().zza(this.zzHg, (OnScrollChangedListener) this);
        this.zzHg.setOnTouchListener(this);
        this.zzHg.setOnClickListener(this);
        zzgd.initialize(this.zzHg.getContext());
    }

    private void zza(zzhb com_google_android_gms_internal_zzhb) {
        View view;
        ViewGroup viewGroup = null;
        boolean zzfY = com_google_android_gms_internal_zzhb.zzfY();
        if (zzfY && this.zzHh != null) {
            WeakReference weakReference = (WeakReference) this.zzHh.get("1098");
            view = weakReference != null ? (View) weakReference.get() : null;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
        }
        boolean z = zzfY && viewGroup != null;
        this.zzHi = zza(com_google_android_gms_internal_zzhb, z);
        if (this.zzHi != null) {
            if (this.zzHh != null) {
                this.zzHh.put("1007", new WeakReference(this.zzHi));
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(this.zzHi);
                return;
            }
            view = zzp(com_google_android_gms_internal_zzhb.getContext());
            view.setLayoutParams(new LayoutParams(-1, -1));
            view.addView(this.zzHi);
            if (this.zzrY != null) {
                this.zzrY.addView(view);
            }
        }
    }

    private void zzb(zzhb com_google_android_gms_internal_zzhb) {
        synchronized (this.zzrJ) {
            final View zzgk = zzgk();
            if (zzgk instanceof FrameLayout) {
                com_google_android_gms_internal_zzhb.zza(zzgk, new zzgy(this) {
                    final /* synthetic */ zzhe zzHo;

                    public void zzc(MotionEvent motionEvent) {
                        this.zzHo.onTouch(null, motionEvent);
                    }

                    public void zzfX() {
                        this.zzHo.onClick(zzgk);
                    }
                });
                return;
            }
            com_google_android_gms_internal_zzhb.zzgd();
        }
    }

    private View zzgk() {
        if (this.zzHh == null) {
            return null;
        }
        for (Object obj : zzHf) {
            WeakReference weakReference = (WeakReference) this.zzHh.get(obj);
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    public void destroy() {
        synchronized (this.zzrJ) {
            if (this.zzrY != null) {
                this.zzrY.removeAllViews();
            }
            this.zzrY = null;
            this.zzHh = null;
            this.zzHi = null;
            this.zzGA = null;
            this.zzHk = null;
            this.zzHl = null;
            this.zzHm = null;
        }
    }

    int getMeasuredHeight() {
        return this.zzHg.getMeasuredHeight();
    }

    int getMeasuredWidth() {
        return this.zzHg.getMeasuredWidth();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
        r7 = this;
        r6 = r7.zzrJ;
        monitor-enter(r6);
        r0 = r7.zzGA;	 Catch:{ all -> 0x0072 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0072 }
    L_0x0008:
        return;
    L_0x0009:
        r3 = new org.json.JSONObject;	 Catch:{ all -> 0x0072 }
        r3.<init>();	 Catch:{ all -> 0x0072 }
        r0 = "x";
        r1 = r7.zzHk;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.x;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.zzC(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
        r0 = "y";
        r1 = r7.zzHk;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.y;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.zzC(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
        r0 = "start_x";
        r1 = r7.zzHl;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.x;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.zzC(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
        r0 = "start_y";
        r1 = r7.zzHl;	 Catch:{ JSONException -> 0x0075 }
        r1 = r1.y;	 Catch:{ JSONException -> 0x0075 }
        r1 = r7.zzC(r1);	 Catch:{ JSONException -> 0x0075 }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x0075 }
    L_0x0042:
        r0 = r7.zzHi;	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0089;
    L_0x0046:
        r0 = r7.zzHi;	 Catch:{ all -> 0x0072 }
        r0 = r0.equals(r8);	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0089;
    L_0x004e:
        r0 = r7.zzGA;	 Catch:{ all -> 0x0072 }
        r0 = r0 instanceof com.google.android.gms.internal.zzgz;	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x007c;
    L_0x0054:
        r0 = r7.zzGA;	 Catch:{ all -> 0x0072 }
        r0 = (com.google.android.gms.internal.zzgz) r0;	 Catch:{ all -> 0x0072 }
        r0 = r0.zzga();	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0070;
    L_0x005e:
        r0 = r7.zzGA;	 Catch:{ all -> 0x0072 }
        r0 = (com.google.android.gms.internal.zzgz) r0;	 Catch:{ all -> 0x0072 }
        r0 = r0.zzga();	 Catch:{ all -> 0x0072 }
        r2 = "1007";
        r4 = r7.zzHh;	 Catch:{ all -> 0x0072 }
        r5 = r7.zzHg;	 Catch:{ all -> 0x0072 }
        r1 = r8;
        r0.zza(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0072 }
    L_0x0070:
        monitor-exit(r6);	 Catch:{ all -> 0x0072 }
        goto L_0x0008;
    L_0x0072:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0072 }
        throw r0;
    L_0x0075:
        r0 = move-exception;
        r0 = "Unable to get click location";
        com.google.android.gms.internal.zzqf.zzbh(r0);	 Catch:{ all -> 0x0072 }
        goto L_0x0042;
    L_0x007c:
        r0 = r7.zzGA;	 Catch:{ all -> 0x0072 }
        r2 = "1007";
        r4 = r7.zzHh;	 Catch:{ all -> 0x0072 }
        r5 = r7.zzHg;	 Catch:{ all -> 0x0072 }
        r1 = r8;
        r0.zza(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0072 }
        goto L_0x0070;
    L_0x0089:
        r0 = r7.zzGA;	 Catch:{ all -> 0x0072 }
        r1 = r7.zzHh;	 Catch:{ all -> 0x0072 }
        r2 = r7.zzHg;	 Catch:{ all -> 0x0072 }
        r0.zza(r8, r1, r3, r2);	 Catch:{ all -> 0x0072 }
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhe.onClick(android.view.View):void");
    }

    public void onGlobalLayout() {
        synchronized (this.zzrJ) {
            if (this.zzHj) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.zzrY == null)) {
                    this.zzrY.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.zzHj = false;
                }
            }
            if (this.zzGA != null) {
                this.zzGA.zzd(this.zzHg, this.zzHh);
            }
        }
    }

    public void onScrollChanged() {
        synchronized (this.zzrJ) {
            if (this.zzGA != null) {
                this.zzGA.zzd(this.zzHg, this.zzHh);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.zzrJ) {
            if (this.zzGA == null) {
            } else {
                Point zze = zze(motionEvent);
                this.zzHk = zze;
                if (motionEvent.getAction() == 0) {
                    this.zzHl = zze;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation((float) zze.x, (float) zze.y);
                this.zzGA.zzd(obtain);
                obtain.recycle();
            }
        }
        return false;
    }

    int zzC(int i) {
        return zzel.zzeT().zzc(this.zzGA.getContext(), i);
    }

    public IObjectWrapper zzU(String str) {
        Object obj = null;
        synchronized (this.zzrJ) {
            if (this.zzHh == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.zzHh.get(str);
            if (weakReference != null) {
                View view = (View) weakReference.get();
            }
            IObjectWrapper zzA = zzd.zzA(obj);
            return zzA;
        }
    }

    @Nullable
    View zza(zzhb com_google_android_gms_internal_zzhb, boolean z) {
        return com_google_android_gms_internal_zzhb.zza((OnClickListener) this, z);
    }

    public void zzb(IObjectWrapper iObjectWrapper, int i) {
        if (zzw.zzdl().zzjS()) {
            zzcy com_google_android_gms_internal_zzcy = (zzcy) this.zzHm.get();
            if (com_google_android_gms_internal_zzcy != null) {
                com_google_android_gms_internal_zzcy.zzdY();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzd(java.lang.String r5, com.google.android.gms.dynamic.IObjectWrapper r6) {
        /*
        r4 = this;
        r0 = com.google.android.gms.dynamic.zzd.zzF(r6);
        r0 = (android.view.View) r0;
        r1 = r4.zzrJ;
        monitor-enter(r1);
        r2 = r4.zzHh;	 Catch:{ all -> 0x0018 }
        if (r2 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000e:
        return;
    L_0x000f:
        if (r0 != 0) goto L_0x001b;
    L_0x0011:
        r0 = r4.zzHh;	 Catch:{ all -> 0x0018 }
        r0.remove(r5);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        r2 = r4.zzHh;	 Catch:{ all -> 0x0018 }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0018 }
        r3.<init>(r0);	 Catch:{ all -> 0x0018 }
        r2.put(r5, r3);	 Catch:{ all -> 0x0018 }
        r2 = "1098";
        r2 = r2.equals(r5);	 Catch:{ all -> 0x0018 }
        if (r2 == 0) goto L_0x002f;
    L_0x002d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000e;
    L_0x002f:
        r0.setOnTouchListener(r4);	 Catch:{ all -> 0x0018 }
        r2 = 1;
        r0.setClickable(r2);	 Catch:{ all -> 0x0018 }
        r0.setOnClickListener(r4);	 Catch:{ all -> 0x0018 }
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhe.zzd(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    Point zze(MotionEvent motionEvent) {
        int[] iArr = new int[2];
        this.zzHg.getLocationOnScreen(iArr);
        return new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
    }

    public void zze(IObjectWrapper iObjectWrapper) {
        synchronized (this.zzrJ) {
            zzj(null);
            Object zzF = zzd.zzF(iObjectWrapper);
            if (zzF instanceof zzhb) {
                if (this.zzrY != null) {
                    this.zzrY.setLayoutParams(new LayoutParams(0, 0));
                    this.zzHg.requestLayout();
                }
                this.zzHj = true;
                final zzhb com_google_android_gms_internal_zzhb = (zzhb) zzF;
                if (this.zzGA != null && ((Boolean) zzgd.zzEp.get()).booleanValue()) {
                    this.zzGA.zzc(this.zzHg, this.zzHh);
                }
                zzgj();
                if ((this.zzGA instanceof zzgz) && ((zzgz) this.zzGA).zzfZ()) {
                    ((zzgz) this.zzGA).zzc(com_google_android_gms_internal_zzhb);
                } else {
                    this.zzGA = com_google_android_gms_internal_zzhb;
                    if (com_google_android_gms_internal_zzhb instanceof zzgz) {
                        ((zzgz) com_google_android_gms_internal_zzhb).zzc(null);
                    }
                }
                if (((Boolean) zzgd.zzEp.get()).booleanValue()) {
                    this.zzrY.setClickable(false);
                }
                this.zzrY.removeAllViews();
                zza(com_google_android_gms_internal_zzhb);
                com_google_android_gms_internal_zzhb.zza(this.zzHg, this.zzHh, (OnTouchListener) this, (OnClickListener) this);
                zzpo.zzXC.post(new Runnable(this) {
                    final /* synthetic */ zzhe zzHo;

                    public void run() {
                        zzqw zzgb = com_google_android_gms_internal_zzhb.zzgb();
                        if (!(zzgb == null || this.zzHo.zzrY == null)) {
                            this.zzHo.zzrY.addView(zzgb.getView());
                        }
                        if (!(com_google_android_gms_internal_zzhb instanceof zzgz)) {
                            this.zzHo.zzb(com_google_android_gms_internal_zzhb);
                        }
                    }
                });
                zzj(this.zzHg);
                zzgi();
                return;
            }
            zzqf.zzbh("Not an instance of native engine. This is most likely a transient error");
        }
    }

    void zzgi() {
        if (this.zzGA instanceof zzhb) {
            zzhb com_google_android_gms_internal_zzhb = (zzhb) this.zzGA;
            if (zzw.zzdl().zzjS() && com_google_android_gms_internal_zzhb != null && com_google_android_gms_internal_zzhb.getContext() != null) {
                zzcy com_google_android_gms_internal_zzcy = (zzcy) this.zzHm.get();
                if (com_google_android_gms_internal_zzcy == null) {
                    com_google_android_gms_internal_zzcy = new zzcy(this.zzHg.getContext(), this.zzHg);
                    this.zzHm = new WeakReference(com_google_android_gms_internal_zzcy);
                }
                com_google_android_gms_internal_zzcy.zza(com_google_android_gms_internal_zzhb.zzgg());
            }
        }
    }

    void zzgj() {
        if (this.zzGA instanceof zzhb) {
            zzhb com_google_android_gms_internal_zzhb = (zzhb) this.zzGA;
            if (zzw.zzdl().zzjS() && com_google_android_gms_internal_zzhb != null && com_google_android_gms_internal_zzhb.getContext() != null) {
                zzb zzgg = com_google_android_gms_internal_zzhb.zzgg();
                if (zzgg != null) {
                    zzgg.zzC(false);
                }
                zzcy com_google_android_gms_internal_zzcy = (zzcy) this.zzHm.get();
                if (com_google_android_gms_internal_zzcy != null && zzgg != null) {
                    com_google_android_gms_internal_zzcy.zzb(zzgg);
                }
            }
        }
    }

    void zzj(@Nullable View view) {
        if (this.zzGA != null) {
            zzha zzga = this.zzGA instanceof zzgz ? ((zzgz) this.zzGA).zzga() : this.zzGA;
            if (zzga != null) {
                zzga.zzj(view);
            }
        }
    }

    AdChoicesView zzp(Context context) {
        return new AdChoicesView(context);
    }
}
