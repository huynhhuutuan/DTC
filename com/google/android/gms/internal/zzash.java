package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.zzt;

public class zzash extends zzarv {
    private final zzasg zzbkO;

    private static final class zza extends com.google.android.gms.internal.zzasd.zza {
        private com.google.android.gms.internal.zzaad.zzb<Status> zzbkP;

        public zza(com.google.android.gms.internal.zzaad.zzb<Status> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status) {
            this.zzbkP = com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status;
        }

        public void zza(int i, PendingIntent pendingIntent) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
        }

        public void zza(int i, String[] strArr) {
            if (this.zzbkP == null) {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            }
            this.zzbkP.setResult(LocationStatusCodes.zzkt(LocationStatusCodes.zzks(i)));
            this.zzbkP = null;
        }

        public void zzb(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
        }
    }

    private static final class zzb extends com.google.android.gms.internal.zzasd.zza {
        private com.google.android.gms.internal.zzaad.zzb<Status> zzbkP;

        public zzb(com.google.android.gms.internal.zzaad.zzb<Status> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status) {
            this.zzbkP = com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status;
        }

        private void zzkx(int i) {
            if (this.zzbkP == null) {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
                return;
            }
            this.zzbkP.setResult(LocationStatusCodes.zzkt(LocationStatusCodes.zzks(i)));
            this.zzbkP = null;
        }

        public void zza(int i, PendingIntent pendingIntent) {
            zzkx(i);
        }

        public void zza(int i, String[] strArr) {
            Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
        }

        public void zzb(int i, String[] strArr) {
            zzkx(i);
        }
    }

    private static final class zzc extends com.google.android.gms.internal.zzasf.zza {
        private com.google.android.gms.internal.zzaad.zzb<LocationSettingsResult> zzbkP;

        public zzc(com.google.android.gms.internal.zzaad.zzb<LocationSettingsResult> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_location_LocationSettingsResult) {
            zzac.zzb(com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_location_LocationSettingsResult != null, (Object) "listener can't be null.");
            this.zzbkP = com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_location_LocationSettingsResult;
        }

        public void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
            this.zzbkP.setResult(locationSettingsResult);
            this.zzbkP = null;
        }
    }

    public zzash(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, zzg.zzaS(context));
    }

    public zzash(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzg com_google_android_gms_common_internal_zzg) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, com_google_android_gms_common_internal_zzg);
        this.zzbkO = new zzasg(context, this.zzbkx);
    }

    public void disconnect() {
        synchronized (this.zzbkO) {
            if (isConnected()) {
                try {
                    this.zzbkO.removeAllListeners();
                    this.zzbkO.zzIp();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    public Location getLastLocation() {
        return this.zzbkO.getLastLocation();
    }

    public LocationAvailability zzIo() {
        return this.zzbkO.zzIo();
    }

    public void zza(long j, PendingIntent pendingIntent) throws RemoteException {
        zzxC();
        zzac.zzw(pendingIntent);
        zzac.zzb(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((zzase) zzxD()).zza(j, true, pendingIntent);
    }

    public void zza(PendingIntent pendingIntent, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkO.zza(pendingIntent, com_google_android_gms_internal_zzasc);
    }

    public void zza(com.google.android.gms.internal.zzabh.zzb<LocationListener> com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationListener, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkO.zza((com.google.android.gms.internal.zzabh.zzb) com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationListener, com_google_android_gms_internal_zzasc);
    }

    public void zza(zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkO.zza(com_google_android_gms_internal_zzasc);
    }

    public void zza(zzasi com_google_android_gms_internal_zzasi, zzabh<LocationCallback> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        synchronized (this.zzbkO) {
            this.zzbkO.zza(com_google_android_gms_internal_zzasi, (zzabh) com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback, com_google_android_gms_internal_zzasc);
        }
    }

    public void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, com.google.android.gms.internal.zzaad.zzb<Status> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        zzxC();
        zzac.zzb((Object) geofencingRequest, (Object) "geofencingRequest can't be null.");
        zzac.zzb((Object) pendingIntent, (Object) "PendingIntent must be specified.");
        zzac.zzb((Object) com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzase) zzxD()).zza(geofencingRequest, pendingIntent, new zza(com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status));
    }

    public void zza(LocationRequest locationRequest, PendingIntent pendingIntent, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkO.zza(locationRequest, pendingIntent, com_google_android_gms_internal_zzasc);
    }

    public void zza(LocationRequest locationRequest, zzabh<LocationListener> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        synchronized (this.zzbkO) {
            this.zzbkO.zza(locationRequest, (zzabh) com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener, com_google_android_gms_internal_zzasc);
        }
    }

    public void zza(LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.zzaad.zzb<LocationSettingsResult> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_location_LocationSettingsResult, String str) throws RemoteException {
        boolean z = true;
        zzxC();
        zzac.zzb(locationSettingsRequest != null, (Object) "locationSettingsRequest can't be null nor empty.");
        if (com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_location_LocationSettingsResult == null) {
            z = false;
        }
        zzac.zzb(z, (Object) "listener can't be null.");
        ((zzase) zzxD()).zza(locationSettingsRequest, new zzc(com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_location_LocationSettingsResult), str);
    }

    public void zza(zzt com_google_android_gms_location_zzt, com.google.android.gms.internal.zzaad.zzb<Status> com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        zzxC();
        zzac.zzb((Object) com_google_android_gms_location_zzt, (Object) "removeGeofencingRequest can't be null.");
        zzac.zzb((Object) com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status, (Object) "ResultHolder not provided.");
        ((zzase) zzxD()).zza(com_google_android_gms_location_zzt, new zzb(com_google_android_gms_internal_zzaad_zzb_com_google_android_gms_common_api_Status));
    }

    public void zzaH(boolean z) throws RemoteException {
        this.zzbkO.zzaH(z);
    }

    public void zzb(com.google.android.gms.internal.zzabh.zzb<LocationCallback> com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationCallback, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkO.zzb(com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationCallback, com_google_android_gms_internal_zzasc);
    }

    public void zzc(PendingIntent pendingIntent) throws RemoteException {
        zzxC();
        zzac.zzw(pendingIntent);
        ((zzase) zzxD()).zzc(pendingIntent);
    }

    public void zzd(Location location) throws RemoteException {
        this.zzbkO.zzd(location);
    }
}
