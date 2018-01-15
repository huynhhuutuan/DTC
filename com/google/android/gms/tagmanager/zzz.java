package com.google.android.gms.tagmanager;

import android.util.Log;

public class zzz implements zzbp {
    private int zzafc = 5;

    public void mo3443e(String str) {
        if (this.zzafc <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void setLogLevel(int i) {
        this.zzafc = i;
    }

    public void mo3445v(String str) {
        if (this.zzafc <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }

    public void zzb(String str, Throwable th) {
        if (this.zzafc <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    public void zzbf(String str) {
        if (this.zzafc <= 3) {
            Log.d("GoogleTagManager", str);
        }
    }

    public void zzbg(String str) {
        if (this.zzafc <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void zzbh(String str) {
        if (this.zzafc <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void zzc(String str, Throwable th) {
        if (this.zzafc <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }
}
