package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzck;
import com.google.android.gms.internal.zzcl;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzel;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzfa;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgp;
import com.google.android.gms.internal.zzle;
import com.google.android.gms.internal.zzli;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zznw;
import com.google.android.gms.internal.zzpn;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzqh;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzme
public class zzv extends com.google.android.gms.internal.zzet.zza {
    private final Context mContext;
    @Nullable
    private zzep zztk;
    private final zzqh zztt;
    private final zzeg zzus;
    private final Future<zzck> zzut = zzcC();
    private final zzb zzuu;
    @Nullable
    private WebView zzuv = new WebView(this.mContext);
    @Nullable
    private zzck zzuw;
    private AsyncTask<Void, Void, String> zzux;

    class C03801 extends WebViewClient {
        final /* synthetic */ zzv zzuy;

        C03801(zzv com_google_android_gms_ads_internal_zzv) {
            this.zzuy = com_google_android_gms_ads_internal_zzv;
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (this.zzuy.zztk != null) {
                try {
                    this.zzuy.zztk.onAdFailedToLoad(0);
                } catch (Throwable e) {
                    zzqf.zzc("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith(this.zzuy.zzcB())) {
                return false;
            }
            if (str.startsWith((String) zzgd.zzEO.get())) {
                if (this.zzuy.zztk != null) {
                    try {
                        this.zzuy.zztk.onAdFailedToLoad(3);
                    } catch (Throwable e) {
                        zzqf.zzc("Could not call AdListener.onAdFailedToLoad().", e);
                    }
                }
                this.zzuy.zzj(0);
                return true;
            } else if (str.startsWith((String) zzgd.zzEP.get())) {
                if (this.zzuy.zztk != null) {
                    try {
                        this.zzuy.zztk.onAdFailedToLoad(0);
                    } catch (Throwable e2) {
                        zzqf.zzc("Could not call AdListener.onAdFailedToLoad().", e2);
                    }
                }
                this.zzuy.zzj(0);
                return true;
            } else if (str.startsWith((String) zzgd.zzEQ.get())) {
                if (this.zzuy.zztk != null) {
                    try {
                        this.zzuy.zztk.onAdLoaded();
                    } catch (Throwable e22) {
                        zzqf.zzc("Could not call AdListener.onAdLoaded().", e22);
                    }
                }
                this.zzuy.zzj(this.zzuy.zzA(str));
                return true;
            } else if (str.startsWith("gmsg://")) {
                return true;
            } else {
                if (this.zzuy.zztk != null) {
                    try {
                        this.zzuy.zztk.onAdLeftApplication();
                    } catch (Throwable e222) {
                        zzqf.zzc("Could not call AdListener.onAdLeftApplication().", e222);
                    }
                }
                this.zzuy.zzC(this.zzuy.zzB(str));
                return true;
            }
        }
    }

    class C03812 implements OnTouchListener {
        final /* synthetic */ zzv zzuy;

        C03812(zzv com_google_android_gms_ads_internal_zzv) {
            this.zzuy = com_google_android_gms_ads_internal_zzv;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.zzuy.zzuw != null) {
                try {
                    this.zzuy.zzuw.zza(motionEvent);
                } catch (Throwable e) {
                    zzqf.zzc("Unable to process ad data", e);
                }
            }
            return false;
        }
    }

    class C03823 implements Callable<zzck> {
        final /* synthetic */ zzv zzuy;

        C03823(zzv com_google_android_gms_ads_internal_zzv) {
            this.zzuy = com_google_android_gms_ads_internal_zzv;
        }

        public /* synthetic */ Object call() throws Exception {
            return zzcD();
        }

        public zzck zzcD() throws Exception {
            return new zzck(this.zzuy.zztt.zzba, this.zzuy.mContext, false);
        }
    }

    private class zza extends AsyncTask<Void, Void, String> {
        final /* synthetic */ zzv zzuy;

        private zza(zzv com_google_android_gms_ads_internal_zzv) {
            this.zzuy = com_google_android_gms_ads_internal_zzv;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return zza((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            zzD((String) obj);
        }

        protected void zzD(String str) {
            if (this.zzuy.zzuv != null && str != null) {
                this.zzuy.zzuv.loadUrl(str);
            }
        }

        protected String zza(Void... voidArr) {
            Throwable e;
            try {
                this.zzuy.zzuw = (zzck) this.zzuy.zzut.get(((Long) zzgd.zzET.get()).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                zzqf.zzc("Failed to load ad data", e);
            } catch (ExecutionException e3) {
                e = e3;
                zzqf.zzc("Failed to load ad data", e);
            } catch (TimeoutException e4) {
                zzqf.zzbh("Timed out waiting for ad data");
            }
            return this.zzuy.zzcA();
        }
    }

    private static class zzb {
        private final Map<String, String> zzuA = new TreeMap();
        private String zzuB;
        private String zzuC;
        private final String zzuz;

        public zzb(String str) {
            this.zzuz = str;
        }

        public String getQuery() {
            return this.zzuB;
        }

        public void zza(zzec com_google_android_gms_internal_zzec, zzqh com_google_android_gms_internal_zzqh) {
            this.zzuB = com_google_android_gms_internal_zzec.zzza.zzAT;
            Bundle bundle = com_google_android_gms_internal_zzec.zzzd != null ? com_google_android_gms_internal_zzec.zzzd.getBundle(AdMobAdapter.class.getName()) : null;
            if (bundle != null) {
                String str = (String) zzgd.zzES.get();
                for (String str2 : bundle.keySet()) {
                    if (str.equals(str2)) {
                        this.zzuC = bundle.getString(str2);
                    } else if (str2.startsWith("csa_")) {
                        this.zzuA.put(str2.substring("csa_".length()), bundle.getString(str2));
                    }
                }
                this.zzuA.put("SDKVersion", com_google_android_gms_internal_zzqh.zzba);
            }
        }

        public String zzcE() {
            return this.zzuC;
        }

        public String zzcF() {
            return this.zzuz;
        }

        public Map<String, String> zzcG() {
            return this.zzuA;
        }
    }

    public zzv(Context context, zzeg com_google_android_gms_internal_zzeg, String str, zzqh com_google_android_gms_internal_zzqh) {
        this.mContext = context;
        this.zztt = com_google_android_gms_internal_zzqh;
        this.zzus = com_google_android_gms_internal_zzeg;
        this.zzuu = new zzb(str);
        zzcz();
    }

    private String zzB(String str) {
        if (this.zzuw == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzuw.zzd(parse, this.mContext);
        } catch (Throwable e) {
            zzqf.zzc("Unable to process ad data", e);
        } catch (Throwable e2) {
            zzqf.zzc("Unable to parse ad click url", e2);
        }
        return parse.toString();
    }

    private void zzC(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.mContext.startActivity(intent);
    }

    private Future<zzck> zzcC() {
        return zzpn.zza(new C03823(this));
    }

    private void zzcz() {
        zzj(0);
        this.zzuv.setVerticalScrollBarEnabled(false);
        this.zzuv.getSettings().setJavaScriptEnabled(true);
        this.zzuv.setWebViewClient(new C03801(this));
        this.zzuv.setOnTouchListener(new C03812(this));
    }

    public void destroy() throws RemoteException {
        zzac.zzdj("destroy must be called on the main UI thread.");
        this.zzux.cancel(true);
        this.zzut.cancel(true);
        this.zzuv.destroy();
        this.zzuv = null;
    }

    @Nullable
    public String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public boolean isLoading() throws RemoteException {
        return false;
    }

    public boolean isReady() throws RemoteException {
        return false;
    }

    public void pause() throws RemoteException {
        zzac.zzdj("pause must be called on the main UI thread.");
    }

    public void resume() throws RemoteException {
        zzac.zzdj("resume must be called on the main UI thread.");
    }

    public void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    public void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void stopLoading() throws RemoteException {
    }

    int zzA(String str) {
        int i = 0;
        Object queryParameter = Uri.parse(str).getQueryParameter(SettingsJsonConstants.ICON_HEIGHT_KEY);
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                i = zzel.zzeT().zzb(this.mContext, Integer.parseInt(queryParameter));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    public void zza(zzeg com_google_android_gms_internal_zzeg) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public void zza(zzeo com_google_android_gms_internal_zzeo) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzep com_google_android_gms_internal_zzep) throws RemoteException {
        this.zztk = com_google_android_gms_internal_zzep;
    }

    public void zza(zzev com_google_android_gms_internal_zzev) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzex com_google_android_gms_internal_zzex) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzfc com_google_android_gms_internal_zzfc) {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzft com_google_android_gms_internal_zzft) {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzgp com_google_android_gms_internal_zzgp) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzle com_google_android_gms_internal_zzle) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zzli com_google_android_gms_internal_zzli, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public void zza(zznw com_google_android_gms_internal_zznw) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    public boolean zzb(zzec com_google_android_gms_internal_zzec) throws RemoteException {
        zzac.zzb(this.zzuv, (Object) "This Search Ad has already been torn down");
        this.zzuu.zza(com_google_android_gms_internal_zzec, this.zztt);
        this.zzux = new zza().execute(new Void[0]);
        return true;
    }

    public IObjectWrapper zzbB() throws RemoteException {
        zzac.zzdj("getAdFrame must be called on the main UI thread.");
        return zzd.zzA(this.zzuv);
    }

    public zzeg zzbC() throws RemoteException {
        return this.zzus;
    }

    public void zzbE() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Nullable
    public zzfa zzbF() {
        return null;
    }

    String zzcA() {
        String valueOf;
        Uri zzc;
        Throwable e;
        String valueOf2;
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) zzgd.zzER.get());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzuu.getQuery());
        builder.appendQueryParameter("pubId", this.zzuu.zzcF());
        Map zzcG = this.zzuu.zzcG();
        for (String valueOf3 : zzcG.keySet()) {
            builder.appendQueryParameter(valueOf3, (String) zzcG.get(valueOf3));
        }
        Uri build = builder.build();
        if (this.zzuw != null) {
            try {
                zzc = this.zzuw.zzc(build, this.mContext);
            } catch (zzcl e2) {
                e = e2;
                zzqf.zzc("Unable to process ad data", e);
                zzc = build;
                valueOf2 = String.valueOf(zzcB());
                valueOf3 = String.valueOf(zzc.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            } catch (RemoteException e3) {
                e = e3;
                zzqf.zzc("Unable to process ad data", e);
                zzc = build;
                valueOf2 = String.valueOf(zzcB());
                valueOf3 = String.valueOf(zzc.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            }
            valueOf2 = String.valueOf(zzcB());
            valueOf3 = String.valueOf(zzc.getEncodedQuery());
            return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
        }
        zzc = build;
        valueOf2 = String.valueOf(zzcB());
        valueOf3 = String.valueOf(zzc.getEncodedQuery());
        return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
    }

    String zzcB() {
        String str;
        CharSequence zzcE = this.zzuu.zzcE();
        if (TextUtils.isEmpty(zzcE)) {
            str = "www.google.com";
        } else {
            CharSequence charSequence = zzcE;
        }
        String valueOf = String.valueOf("https://");
        String str2 = (String) zzgd.zzER.get();
        return new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(str).append(str2).toString();
    }

    void zzj(int i) {
        if (this.zzuv != null) {
            this.zzuv.setLayoutParams(new LayoutParams(-1, i));
        }
    }
}
