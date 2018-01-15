package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.zzah;
import com.google.android.gms.internal.zzak.zza;
import java.util.Map;

class zzab extends zzam {
    private static final String ID = zzah.DEVICE_ID.toString();
    private final Context mContext;

    public zzab(Context context) {
        super(ID, new String[0]);
        this.mContext = context;
    }

    public boolean zzQa() {
        return true;
    }

    public zza zzZ(Map<String, zza> map) {
        String zzbU = zzbU(this.mContext);
        return zzbU == null ? zzdl.zzRQ() : zzdl.zzR(zzbU);
    }

    protected String zzbU(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }
}
