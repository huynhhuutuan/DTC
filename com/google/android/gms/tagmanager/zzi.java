package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzi extends zzam {
    private static final String ID = zzah.APP_VERSION_NAME.toString();
    private final Context mContext;

    public zzi(Context context) {
        super(ID, new String[0]);
        this.mContext = context;
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        try {
            return zzdl.zzR(this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionName);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(this.mContext.getPackageName());
            String valueOf2 = String.valueOf(e.getMessage());
            zzbo.m11e(new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append("Package name ").append(valueOf).append(" not found. ").append(valueOf2).toString());
            return zzdl.zzRQ();
        }
    }
}
