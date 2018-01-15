package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.internal.zzase.zza;

public class zzarv extends zzl<zzase> {
    private final String zzbkw;
    protected final zzaso<zzase> zzbkx = new C09441(this);

    class C09441 implements zzaso<zzase> {
        final /* synthetic */ zzarv zzbky;

        C09441(zzarv com_google_android_gms_internal_zzarv) {
            this.zzbky = com_google_android_gms_internal_zzarv;
        }

        public zzase zzIm() throws DeadObjectException {
            return (zzase) this.zzbky.zzxD();
        }

        public void zzxC() {
            this.zzbky.zzxC();
        }

        public /* synthetic */ IInterface zzxD() throws DeadObjectException {
            return zzIm();
        }
    }

    public zzarv(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzg com_google_android_gms_common_internal_zzg) {
        super(context, looper, 23, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzbkw = str;
    }

    protected zzase zzdf(IBinder iBinder) {
        return zza.zzdi(iBinder);
    }

    protected String zzeA() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected String zzez() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected /* synthetic */ IInterface zzh(IBinder iBinder) {
        return zzdf(iBinder);
    }

    protected Bundle zzqL() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzbkw);
        return bundle;
    }
}
