package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.zzw;

@zzme
@TargetApi(11)
public class zzrd extends WebChromeClient {
    private final zzqw zzIs;

    class C06531 implements OnCancelListener {
        final /* synthetic */ JsResult zzaaK;

        C06531(JsResult jsResult) {
            this.zzaaK = jsResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.zzaaK.cancel();
        }
    }

    class C06542 implements OnClickListener {
        final /* synthetic */ JsResult zzaaK;

        C06542(JsResult jsResult) {
            this.zzaaK = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.zzaaK.cancel();
        }
    }

    class C06553 implements OnClickListener {
        final /* synthetic */ JsResult zzaaK;

        C06553(JsResult jsResult) {
            this.zzaaK = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.zzaaK.confirm();
        }
    }

    class C06564 implements OnCancelListener {
        final /* synthetic */ JsPromptResult zzaaL;

        C06564(JsPromptResult jsPromptResult) {
            this.zzaaL = jsPromptResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.zzaaL.cancel();
        }
    }

    class C06575 implements OnClickListener {
        final /* synthetic */ JsPromptResult zzaaL;

        C06575(JsPromptResult jsPromptResult) {
            this.zzaaL = jsPromptResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.zzaaL.cancel();
        }
    }

    class C06586 implements OnClickListener {
        final /* synthetic */ JsPromptResult zzaaL;
        final /* synthetic */ EditText zzaaM;

        C06586(JsPromptResult jsPromptResult, EditText editText) {
            this.zzaaL = jsPromptResult;
            this.zzaaM = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.zzaaL.confirm(this.zzaaM.getText().toString());
        }
    }

    static /* synthetic */ class C06597 {
        static final /* synthetic */ int[] zzaaN = new int[MessageLevel.values().length];

        static {
            try {
                zzaaN[MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                zzaaN[MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                zzaaN[MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                zzaaN[MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                zzaaN[MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public zzrd(zzqw com_google_android_gms_internal_zzqw) {
        this.zzIs = com_google_android_gms_internal_zzqw;
    }

    private final Context zza(WebView webView) {
        if (!(webView instanceof zzqw)) {
            return webView.getContext();
        }
        zzqw com_google_android_gms_internal_zzqw = (zzqw) webView;
        Context zzlr = com_google_android_gms_internal_zzqw.zzlr();
        return zzlr == null ? com_google_android_gms_internal_zzqw.getContext() : zzlr;
    }

    private static void zza(Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new C06553(jsResult)).setNegativeButton(17039360, new C06542(jsResult)).setOnCancelListener(new C06531(jsResult)).create().show();
    }

    private static void zza(Context context, Builder builder, String str, String str2, JsPromptResult jsPromptResult) {
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        View textView = new TextView(context);
        textView.setText(str);
        View editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new C06586(jsPromptResult, editText)).setNegativeButton(17039360, new C06575(jsPromptResult)).setOnCancelListener(new C06564(jsPromptResult)).create().show();
    }

    private final boolean zzml() {
        return zzw.zzcM().zze(this.zzIs.getContext(), this.zzIs.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION") || zzw.zzcM().zze(this.zzIs.getContext(), this.zzIs.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION");
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof zzqw) {
            zze zzlt = ((zzqw) webView).zzlt();
            if (zzlt == null) {
                zzqf.zzbh("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                zzlt.close();
                return;
            }
        }
        zzqf.zzbh("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String valueOf = String.valueOf(consoleMessage.message());
        String valueOf2 = String.valueOf(consoleMessage.sourceId());
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("JS: ").append(valueOf).append(" (").append(valueOf2).append(":").append(consoleMessage.lineNumber()).append(")").toString();
        if (valueOf.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C06597.zzaaN[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                zzqf.m9e(valueOf);
                break;
            case 2:
                zzqf.zzbh(valueOf);
                break;
            case 3:
            case 4:
                zzqf.zzbg(valueOf);
                break;
            case 5:
                zzqf.zzbf(valueOf);
                break;
            default:
                zzqf.zzbg(valueOf);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.zzIs.zzlv());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4) + j, 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            callback.invoke(str, zzml(), true);
        }
    }

    public final void onHideCustomView() {
        zze zzlt = this.zzIs.zzlt();
        if (zzlt == null) {
            zzqf.zzbh("Could not get ad overlay when hiding custom view.");
        } else {
            zzlt.zzhD();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = PlaybackStateCompat.ACTION_PREPARE_FROM_URI + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        zza(view, -1, customViewCallback);
    }

    protected final void zza(View view, int i, CustomViewCallback customViewCallback) {
        zze zzlt = this.zzIs.zzlt();
        if (zzlt == null) {
            zzqf.zzbh("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzlt.zza(view, customViewCallback);
        zzlt.setRequestedOrientation(i);
    }

    protected boolean zza(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            Builder builder = new Builder(context);
            builder.setTitle(str);
            if (z) {
                zza(context, builder, str2, str3, jsPromptResult);
            } else {
                zza(builder, str2, jsResult);
            }
        } catch (Throwable e) {
            zzqf.zzc("Fail to display Dialog.", e);
        }
        return true;
    }
}
