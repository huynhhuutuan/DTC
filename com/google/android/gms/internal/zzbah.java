package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzg;

public final class zzbah {
    public static final Api<zzbaj> API = new Api("SignIn.API", zzaie, zzaid);
    public static final Api<zza> zzaKN = new Api("SignIn.INTERNAL_API", zzbEk, zzbEj);
    public static final zzf<zzbat> zzaid = new zzf();
    public static final com.google.android.gms.common.api.Api.zza<zzbat, zzbaj> zzaie = new C11921();
    public static final Scope zzakh = new Scope(Scopes.PROFILE);
    public static final Scope zzaki = new Scope("email");
    public static final zzf<zzbat> zzbEj = new zzf();
    static final com.google.android.gms.common.api.Api.zza<zzbat, zza> zzbEk = new C11932();

    class C11921 extends com.google.android.gms.common.api.Api.zza<zzbat, zzbaj> {
        C11921() {
        }

        public zzbat zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zzbaj com_google_android_gms_internal_zzbaj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzbat(context, looper, true, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zzbaj == null ? zzbaj.zzbEm : com_google_android_gms_internal_zzbaj, connectionCallbacks, onConnectionFailedListener);
        }
    }

    class C11932 extends com.google.android.gms.common.api.Api.zza<zzbat, zza> {
        C11932() {
        }

        public zzbat zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_internal_zzbah_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzbat(context, looper, false, com_google_android_gms_common_internal_zzg, com_google_android_gms_internal_zzbah_zza.zzPH(), connectionCallbacks, onConnectionFailedListener);
        }
    }

    public static class zza implements HasOptions {
        private final Bundle zzbEl;

        public Bundle zzPH() {
            return this.zzbEl;
        }
    }
}
