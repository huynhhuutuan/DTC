package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.gms.tagmanager.zzbo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class zzbjh implements zzbji {
    private HttpURLConnection zzbMt;
    private InputStream zzbMu = null;

    zzbjh() {
    }

    private InputStream zzd(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            return httpURLConnection.getInputStream();
        }
        String str = "Bad response: " + responseCode;
        if (responseCode == 404) {
            throw new FileNotFoundException(str);
        } else if (responseCode == 503) {
            throw new zzbjk(str);
        } else {
            throw new IOException(str);
        }
    }

    private void zze(HttpURLConnection httpURLConnection) {
        try {
            if (this.zzbMu != null) {
                this.zzbMu.close();
            }
        } catch (Throwable e) {
            Throwable th = e;
            String str = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ";
            String valueOf = String.valueOf(th.getMessage());
            zzbo.zzb(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zze(this.zzbMt);
    }

    public InputStream zzhX(String str) throws IOException {
        this.zzbMt = zzhY(str);
        this.zzbMu = zzd(this.zzbMt);
        return this.zzbMu;
    }

    HttpURLConnection zzhY(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        return httpURLConnection;
    }
}
