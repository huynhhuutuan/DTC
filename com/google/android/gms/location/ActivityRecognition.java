package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzaru;
import com.google.android.gms.internal.zzash;

public class ActivityRecognition {
    public static final Api<NoOptions> API = new Api("ActivityRecognition.API", zzaie, zzaid);
    public static final ActivityRecognitionApi ActivityRecognitionApi = new zzaru();
    public static final String CLIENT_NAME = "activity_recognition";
    private static final zzf<zzash> zzaid = new zzf();
    private static final com.google.android.gms.common.api.Api.zza<zzash, NoOptions> zzaie = new C12111();

    class C12111 extends com.google.android.gms.common.api.Api.zza<zzash, NoOptions> {
        C12111() {
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzq(context, looper, com_google_android_gms_common_internal_zzg, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzash zzq(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzash(context, looper, connectionCallbacks, onConnectionFailedListener, ActivityRecognition.CLIENT_NAME);
        }
    }

    public static abstract class zza<R extends Result> extends com.google.android.gms.internal.zzaad.zza<R, zzash> {
        public zza(GoogleApiClient googleApiClient) {
            super(ActivityRecognition.API, googleApiClient);
        }

        public /* synthetic */ void setResult(Object obj) {
            super.zzb((Result) obj);
        }
    }

    private ActivityRecognition() {
    }
}
