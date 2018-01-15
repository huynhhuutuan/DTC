package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzf;
import com.google.android.gms.location.places.zzm;

public interface zzi extends IInterface {

    public static abstract class zza extends Binder implements zzi {

        private static class zza implements zzi {
            private IBinder zzrk;

            zza(IBinder iBinder) {
                this.zzrk = iBinder;
            }

            public IBinder asBinder() {
                return this.zzrk;
            }

            public void zza(PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeFilter != null) {
                        obtain.writeInt(1);
                        placeFilter.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(PlaceReport placeReport, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeReport != null) {
                        obtain.writeInt(1);
                        placeReport.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzf com_google_android_gms_location_places_zzf, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_location_places_zzf != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_zzf.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzm com_google_android_gms_location_places_zzm, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_location_places_zzm != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_zzm.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzi zzdl(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzi)) ? new zza(iBinder) : (zzi) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(parcel.readInt() != 0 ? (zzm) zzm.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(parcel.readInt() != 0 ? (zzf) zzf.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zzb(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    zza(parcel.readInt() != 0 ? (PlaceReport) PlaceReport.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(PlaceReport placeReport, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(zzf com_google_android_gms_location_places_zzf, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(zzm com_google_android_gms_location_places_zzm, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zzb(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;
}
