package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.internal.zzbow.zzb;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseApp.zza;
import com.google.firebase.auth.GetTokenResult;
import java.util.concurrent.ScheduledExecutorService;

public class zzbnt implements zzbow {
    private final ScheduledExecutorService zzcax;
    private final FirebaseApp zzcay;

    public zzbnt(@NonNull FirebaseApp firebaseApp, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.zzcay = firebaseApp;
        this.zzcax = scheduledExecutorService;
    }

    private zza zzb(final zzb com_google_android_gms_internal_zzbow_zzb) {
        return new zza(this) {
            final /* synthetic */ zzbnt zzcaB;

            public void zzb(@NonNull final zzbtj com_google_android_gms_internal_zzbtj) {
                this.zzcaB.zzcax.execute(new Runnable(this) {
                    final /* synthetic */ C09573 zzcaC;

                    public void run() {
                        com_google_android_gms_internal_zzbow_zzb.zziU(com_google_android_gms_internal_zzbtj.getToken());
                    }
                });
            }
        };
    }

    public void zza(zzb com_google_android_gms_internal_zzbow_zzb) {
        this.zzcay.zza(zzb(com_google_android_gms_internal_zzbow_zzb));
    }

    public void zza(boolean z, @NonNull final zzbow.zza com_google_android_gms_internal_zzbow_zza) {
        this.zzcay.getToken(z).addOnSuccessListener(this.zzcax, new OnSuccessListener<GetTokenResult>(this) {
            public /* synthetic */ void onSuccess(Object obj) {
                zza((GetTokenResult) obj);
            }

            public void zza(GetTokenResult getTokenResult) {
                com_google_android_gms_internal_zzbow_zza.zziL(getTokenResult.getToken());
            }
        }).addOnFailureListener(this.zzcax, new OnFailureListener(this) {
            private boolean zza(Exception exception) {
                return (exception instanceof FirebaseApiNotAvailableException) || (exception instanceof zzbtk);
            }

            public void onFailure(@NonNull Exception exception) {
                if (zza(exception)) {
                    com_google_android_gms_internal_zzbow_zza.zziL(null);
                } else {
                    com_google_android_gms_internal_zzbow_zza.onError(exception.getMessage());
                }
            }
        });
    }
}
