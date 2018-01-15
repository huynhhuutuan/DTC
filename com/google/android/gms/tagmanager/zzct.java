package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzaj.zzj;
import com.google.android.gms.internal.zzbjf;
import com.google.android.gms.internal.zzbji;
import com.google.android.gms.internal.zzbjj;
import com.google.android.gms.internal.zzbjk;
import com.google.android.gms.tagmanager.zzbn.zza;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

class zzct implements Runnable {
    private final Context mContext;
    private final String zzbEY;
    private volatile String zzbFw;
    private final zzbjj zzbHv;
    private final String zzbHw;
    private zzbn<zzj> zzbHx;
    private volatile zzt zzbHy;
    private volatile String zzbHz;

    zzct(Context context, String str, zzbjj com_google_android_gms_internal_zzbjj, zzt com_google_android_gms_tagmanager_zzt) {
        this.mContext = context;
        this.zzbHv = com_google_android_gms_internal_zzbjj;
        this.zzbEY = str;
        this.zzbHy = com_google_android_gms_tagmanager_zzt;
        String valueOf = String.valueOf("/r?id=");
        String valueOf2 = String.valueOf(str);
        this.zzbHw = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        this.zzbFw = this.zzbHw;
        this.zzbHz = null;
    }

    public zzct(Context context, String str, zzt com_google_android_gms_tagmanager_zzt) {
        this(context, str, new zzbjj(), com_google_android_gms_tagmanager_zzt);
    }

    private boolean zzRg() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzbo.m12v("...no network connectivity");
        return false;
    }

    private void zzRh() {
        String str;
        String str2;
        String valueOf;
        if (zzRg()) {
            zzbo.m12v("Start loading resource from network ...");
            String zzRi = zzRi();
            zzbji zzTE = this.zzbHv.zzTE();
            InputStream inputStream = null;
            try {
                inputStream = zzTE.zzhX(zzRi);
            } catch (FileNotFoundException e) {
                str = this.zzbEY;
                zzbo.zzbh(new StringBuilder((String.valueOf(zzRi).length() + 79) + String.valueOf(str).length()).append("No data is retrieved from the given url: ").append(zzRi).append(". Make sure container_id: ").append(str).append(" is correct.").toString());
                this.zzbHx.zza(zza.SERVER_ERROR);
                zzTE.close();
                return;
            } catch (zzbjk e2) {
                str2 = "Error when loading resource for url: ";
                valueOf = String.valueOf(zzRi);
                zzbo.zzbh(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                this.zzbHx.zza(zza.SERVER_UNAVAILABLE_ERROR);
            } catch (Throwable e3) {
                valueOf = String.valueOf(e3.getMessage());
                zzbo.zzc(new StringBuilder((String.valueOf(zzRi).length() + 40) + String.valueOf(valueOf).length()).append("Error when loading resources from url: ").append(zzRi).append(" ").append(valueOf).toString(), e3);
                this.zzbHx.zza(zza.IO_ERROR);
                zzTE.close();
                return;
            } catch (Throwable th) {
                zzTE.close();
            }
            try {
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzbjf.zzc(inputStream, byteArrayOutputStream);
                zzj zzg = zzj.zzg(byteArrayOutputStream.toByteArray());
                str = String.valueOf(zzg);
                zzbo.m12v(new StringBuilder(String.valueOf(str).length() + 43).append("Successfully loaded supplemented resource: ").append(str).toString());
                if (zzg.zzlr == null && zzg.zzlq.length == 0) {
                    str2 = "No change for container: ";
                    str = String.valueOf(this.zzbEY);
                    zzbo.m12v(str.length() != 0 ? str2.concat(str) : new String(str2));
                }
                this.zzbHx.onSuccess(zzg);
                zzTE.close();
                zzbo.m12v("Load resource from network finished.");
                return;
            } catch (Throwable e32) {
                valueOf = String.valueOf(e32.getMessage());
                zzbo.zzc(new StringBuilder((String.valueOf(zzRi).length() + 51) + String.valueOf(valueOf).length()).append("Error when parsing downloaded resources from url: ").append(zzRi).append(" ").append(valueOf).toString(), e32);
                this.zzbHx.zza(zza.SERVER_ERROR);
                zzTE.close();
                return;
            }
        }
        this.zzbHx.zza(zza.NOT_AVAILABLE);
    }

    public void run() {
        if (this.zzbHx == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        zzRh();
    }

    String zzRi() {
        String valueOf = String.valueOf(this.zzbHy.zzQu());
        String str = this.zzbFw;
        String valueOf2 = String.valueOf("&v=a65833898");
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        if (!(this.zzbHz == null || this.zzbHz.trim().equals(""))) {
            valueOf = String.valueOf(valueOf);
            str = String.valueOf("&pv=");
            valueOf2 = this.zzbHz;
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        }
        if (!zzcj.zzRd().zzRe().equals(zza.CONTAINER_DEBUG)) {
            return valueOf;
        }
        str = String.valueOf(valueOf);
        valueOf = String.valueOf("&gtm_debug=x");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    void zza(zzbn<zzj> com_google_android_gms_tagmanager_zzbn_com_google_android_gms_internal_zzaj_zzj) {
        this.zzbHx = com_google_android_gms_tagmanager_zzbn_com_google_android_gms_internal_zzaj_zzj;
    }

    void zzgZ(String str) {
        if (str == null) {
            this.zzbFw = this.zzbHw;
            return;
        }
        String str2 = "Setting CTFE URL path: ";
        String valueOf = String.valueOf(str);
        zzbo.zzbf(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.zzbFw = str;
    }

    void zzho(String str) {
        String str2 = "Setting previous container version: ";
        String valueOf = String.valueOf(str);
        zzbo.zzbf(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.zzbHz = str;
    }
}
