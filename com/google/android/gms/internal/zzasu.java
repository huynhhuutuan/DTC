package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzasu extends IInterface {

    public static abstract class zza extends Binder implements zzasu {

        private static class zza implements zzasu {
            private IBinder zzrk;

            zza(IBinder iBinder) {
                this.zzrk = iBinder;
            }

            public IBinder asBinder() {
                return this.zzrk;
            }

            public void zza(zzass com_google_android_gms_internal_zzass) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (com_google_android_gms_internal_zzass != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzass.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzrk.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zzb(zzass com_google_android_gms_internal_zzass) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (com_google_android_gms_internal_zzass != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzass.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzrk.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void zzc(zzass com_google_android_gms_internal_zzass) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (com_google_android_gms_internal_zzass != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzass.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzrk.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static zzasu zzdq(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzasu)) ? new zza(iBinder) : (zzasu) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzass com_google_android_gms_internal_zzass = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_internal_zzass = (zzass) zzass.CREATOR.createFromParcel(parcel);
                    }
                    zza(com_google_android_gms_internal_zzass);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_internal_zzass = (zzass) zzass.CREATOR.createFromParcel(parcel);
                    }
                    zzb(com_google_android_gms_internal_zzass);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_internal_zzass = (zzass) zzass.CREATOR.createFromParcel(parcel);
                    }
                    zzc(com_google_android_gms_internal_zzass);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(zzass com_google_android_gms_internal_zzass) throws RemoteException;

    void zzb(zzass com_google_android_gms_internal_zzass) throws RemoteException;

    void zzc(zzass com_google_android_gms_internal_zzass) throws RemoteException;
}
