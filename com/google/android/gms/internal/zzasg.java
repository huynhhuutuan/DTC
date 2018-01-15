package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.internal.zzabh.zzc;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzk;
import java.util.HashMap;
import java.util.Map;

public class zzasg {
    private final Context mContext;
    private final Map<com.google.android.gms.internal.zzabh.zzb<LocationListener>, zzb> zzaWg = new HashMap();
    private ContentProviderClient zzbkI = null;
    private boolean zzbkJ = false;
    private final Map<com.google.android.gms.internal.zzabh.zzb<LocationCallback>, zza> zzbkK = new HashMap();
    private final zzaso<zzase> zzbkx;

    private static class zza extends com.google.android.gms.location.zzj.zza {
        private final zzabh<LocationCallback> zzaDf;

        zza(zzabh<LocationCallback> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback) {
            this.zzaDf = com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback;
        }

        public void onLocationAvailability(final LocationAvailability locationAvailability) {
            this.zzaDf.zza(new zzc<LocationCallback>(this) {
                public void zza(LocationCallback locationCallback) {
                    locationCallback.onLocationAvailability(locationAvailability);
                }

                public /* synthetic */ void zzs(Object obj) {
                    zza((LocationCallback) obj);
                }

                public void zzwc() {
                }
            });
        }

        public void onLocationResult(final LocationResult locationResult) {
            this.zzaDf.zza(new zzc<LocationCallback>(this) {
                public void zza(LocationCallback locationCallback) {
                    locationCallback.onLocationResult(locationResult);
                }

                public /* synthetic */ void zzs(Object obj) {
                    zza((LocationCallback) obj);
                }

                public void zzwc() {
                }
            });
        }

        public synchronized void release() {
            this.zzaDf.clear();
        }
    }

    private static class zzb extends com.google.android.gms.location.zzk.zza {
        private final zzabh<LocationListener> zzaDf;

        zzb(zzabh<LocationListener> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener) {
            this.zzaDf = com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener;
        }

        public synchronized void onLocationChanged(final Location location) {
            this.zzaDf.zza(new zzc<LocationListener>(this) {
                public void zza(LocationListener locationListener) {
                    locationListener.onLocationChanged(location);
                }

                public /* synthetic */ void zzs(Object obj) {
                    zza((LocationListener) obj);
                }

                public void zzwc() {
                }
            });
        }

        public synchronized void release() {
            this.zzaDf.clear();
        }
    }

    public zzasg(Context context, zzaso<zzase> com_google_android_gms_internal_zzaso_com_google_android_gms_internal_zzase) {
        this.mContext = context;
        this.zzbkx = com_google_android_gms_internal_zzaso_com_google_android_gms_internal_zzase;
    }

    private zzb zzf(zzabh<LocationListener> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener) {
        zzb com_google_android_gms_internal_zzasg_zzb;
        synchronized (this.zzaWg) {
            com_google_android_gms_internal_zzasg_zzb = (zzb) this.zzaWg.get(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener.zzwW());
            if (com_google_android_gms_internal_zzasg_zzb == null) {
                com_google_android_gms_internal_zzasg_zzb = new zzb(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener);
            }
            this.zzaWg.put(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener.zzwW(), com_google_android_gms_internal_zzasg_zzb);
        }
        return com_google_android_gms_internal_zzasg_zzb;
    }

    private zza zzg(zzabh<LocationCallback> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback) {
        zza com_google_android_gms_internal_zzasg_zza;
        synchronized (this.zzbkK) {
            com_google_android_gms_internal_zzasg_zza = (zza) this.zzbkK.get(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback.zzwW());
            if (com_google_android_gms_internal_zzasg_zza == null) {
                com_google_android_gms_internal_zzasg_zza = new zza(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback);
            }
            this.zzbkK.put(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback.zzwW(), com_google_android_gms_internal_zzasg_zza);
        }
        return com_google_android_gms_internal_zzasg_zza;
    }

    public Location getLastLocation() {
        this.zzbkx.zzxC();
        try {
            return ((zzase) this.zzbkx.zzxD()).zzeR(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeAllListeners() {
        try {
            synchronized (this.zzaWg) {
                for (zzk com_google_android_gms_location_zzk : this.zzaWg.values()) {
                    if (com_google_android_gms_location_zzk != null) {
                        ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(com_google_android_gms_location_zzk, null));
                    }
                }
                this.zzaWg.clear();
            }
            synchronized (this.zzbkK) {
                for (zzj com_google_android_gms_location_zzj : this.zzbkK.values()) {
                    if (com_google_android_gms_location_zzj != null) {
                        ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(com_google_android_gms_location_zzj, null));
                    }
                }
                this.zzbkK.clear();
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public LocationAvailability zzIo() {
        this.zzbkx.zzxC();
        try {
            return ((zzase) this.zzbkx.zzxD()).zzeS(this.mContext.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void zzIp() {
        if (this.zzbkJ) {
            try {
                zzaH(false);
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void zza(PendingIntent pendingIntent, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zza(zzask.zzb(pendingIntent, com_google_android_gms_internal_zzasc));
    }

    public void zza(com.google.android.gms.internal.zzabh.zzb<LocationListener> com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationListener, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        zzac.zzb((Object) com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationListener, (Object) "Invalid null listener key");
        synchronized (this.zzaWg) {
            zzk com_google_android_gms_location_zzk = (zzb) this.zzaWg.remove(com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationListener);
            if (com_google_android_gms_location_zzk != null) {
                com_google_android_gms_location_zzk.release();
                ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(com_google_android_gms_location_zzk, com_google_android_gms_internal_zzasc));
            }
        }
    }

    public void zza(zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zza(com_google_android_gms_internal_zzasc);
    }

    public void zza(zzasi com_google_android_gms_internal_zzasi, zzabh<LocationCallback> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(com_google_android_gms_internal_zzasi, zzg(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationCallback), com_google_android_gms_internal_zzasc));
    }

    public void zza(LocationRequest locationRequest, PendingIntent pendingIntent, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(zzasi.zzb(locationRequest), pendingIntent, com_google_android_gms_internal_zzasc));
    }

    public void zza(LocationRequest locationRequest, zzabh<LocationListener> com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(zzasi.zzb(locationRequest), zzf(com_google_android_gms_internal_zzabh_com_google_android_gms_location_LocationListener), com_google_android_gms_internal_zzasc));
    }

    public void zzaH(boolean z) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zzaH(z);
        this.zzbkJ = z;
    }

    public void zzb(com.google.android.gms.internal.zzabh.zzb<LocationCallback> com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationCallback, zzasc com_google_android_gms_internal_zzasc) throws RemoteException {
        this.zzbkx.zzxC();
        zzac.zzb((Object) com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationCallback, (Object) "Invalid null listener key");
        synchronized (this.zzbkK) {
            zzj com_google_android_gms_location_zzj = (zza) this.zzbkK.remove(com_google_android_gms_internal_zzabh_zzb_com_google_android_gms_location_LocationCallback);
            if (com_google_android_gms_location_zzj != null) {
                com_google_android_gms_location_zzj.release();
                ((zzase) this.zzbkx.zzxD()).zza(zzask.zza(com_google_android_gms_location_zzj, com_google_android_gms_internal_zzasc));
            }
        }
    }

    public void zzd(Location location) throws RemoteException {
        this.zzbkx.zzxC();
        ((zzase) this.zzbkx.zzxD()).zzd(location);
    }
}
