package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.zzbop.zza;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseApp.zzb;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.connection.idl.zzc;
import com.google.firebase.database.connection.idl.zze;
import io.fabric.sdk.android.services.events.EventsFilesManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class zzbnv implements zzbpi {
    private final Set<String> zzcaD = new HashSet();
    private final FirebaseApp zzcay;
    private final Context zzqo;

    public zzbnv(FirebaseApp firebaseApp) {
        this.zzcay = firebaseApp;
        if (this.zzcay == null) {
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
            Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
        }
        this.zzqo = this.zzcay.getApplicationContext();
    }

    public zzbop zza(zzbpa com_google_android_gms_internal_zzbpa, zzbol com_google_android_gms_internal_zzbol, zzbon com_google_android_gms_internal_zzbon, zza com_google_android_gms_internal_zzbop_zza) {
        final zzbop zza = zze.zza(this.zzqo, new zzc(com_google_android_gms_internal_zzbon, com_google_android_gms_internal_zzbpa.zzYd(), null, com_google_android_gms_internal_zzbpa.zzXt(), FirebaseDatabase.getSdkVersion(), com_google_android_gms_internal_zzbpa.zzkn()), com_google_android_gms_internal_zzbol, com_google_android_gms_internal_zzbop_zza);
        this.zzcay.zza(new zzb(this) {
            public void zzat(boolean z) {
                if (z) {
                    zza.interrupt("app_in_background");
                } else {
                    zza.resume("app_in_background");
                }
            }
        });
        return zza;
    }

    public zzbow zza(ScheduledExecutorService scheduledExecutorService) {
        return new zzbnt(this.zzcay, scheduledExecutorService);
    }

    public zzbpe zza(zzbpa com_google_android_gms_internal_zzbpa) {
        return new zzbnu();
    }

    public zzbql zza(zzbpa com_google_android_gms_internal_zzbpa, String str) {
        String zzYB = com_google_android_gms_internal_zzbpa.zzYB();
        String stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(zzYB).length()).append(str).append(EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR).append(zzYB).toString();
        if (this.zzcaD.contains(stringBuilder)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(zzYB).length() + 47).append("SessionPersistenceKey '").append(zzYB).append("' has already been used.").toString());
        }
        this.zzcaD.add(stringBuilder);
        return new zzbqi(com_google_android_gms_internal_zzbpa, new zzbnw(this.zzqo, com_google_android_gms_internal_zzbpa, stringBuilder), new zzbqj(com_google_android_gms_internal_zzbpa.zzYy()));
    }

    public zzbro zza(zzbpa com_google_android_gms_internal_zzbpa, zzbro.zza com_google_android_gms_internal_zzbro_zza, List<String> list) {
        return new zzbrl(com_google_android_gms_internal_zzbro_zza, list);
    }

    public zzbpm zzb(zzbpa com_google_android_gms_internal_zzbpa) {
        final zzbrn zziV = com_google_android_gms_internal_zzbpa.zziV("RunLoop");
        return new zzbsy(this) {
            final /* synthetic */ zzbnv zzcaF;

            public void zzj(final Throwable th) {
                final String zzl = zzbsy.zzl(th);
                zziV.zzd(zzl, th);
                new Handler(this.zzcaF.zzqo.getMainLooper()).post(new Runnable(this) {
                    public void run() {
                        throw new RuntimeException(zzl, th);
                    }
                });
                zzXs().shutdownNow();
            }
        };
    }

    public String zzc(zzbpa com_google_android_gms_internal_zzbpa) {
        return VERSION.SDK_INT + "/Android";
    }
}
