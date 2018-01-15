package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzer extends IInterface {

    public static abstract class zza extends Binder implements zzer {

        private static class zza implements zzer {
            private IBinder zzrk;

            zza(IBinder iBinder) {
                this.zzrk = iBinder;
            }

            public IBinder asBinder() {
                return this.zzrk;
            }

            public void zza(zzhc com_google_android_gms_internal_zzhc) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (com_google_android_gms_internal_zzhc != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_internal_zzhc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzrk.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzhp com_google_android_gms_internal_zzhp) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzhp != null ? com_google_android_gms_internal_zzhp.asBinder() : null);
                    this.zzrk.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzhq com_google_android_gms_internal_zzhq) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzhq != null ? com_google_android_gms_internal_zzhq.asBinder() : null);
                    this.zzrk.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzhs com_google_android_gms_internal_zzhs, zzhr com_google_android_gms_internal_zzhr) throws RemoteException {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzhs != null ? com_google_android_gms_internal_zzhs.asBinder() : null);
                    if (com_google_android_gms_internal_zzhr != null) {
                        iBinder = com_google_android_gms_internal_zzhr.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.zzrk.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzep com_google_android_gms_internal_zzep) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzep != null ? com_google_android_gms_internal_zzep.asBinder() : null);
                    this.zzrk.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzex com_google_android_gms_internal_zzex) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzex != null ? com_google_android_gms_internal_zzex.asBinder() : null);
                    this.zzrk.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzeq zzck() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    this.zzrk.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzeq zzn = com.google.android.gms.internal.zzeq.zza.zzn(obtain2.readStrongBinder());
                    return zzn;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        }

        public static zzer zzo(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzer)) ? new zza(iBinder) : (zzer) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzhc com_google_android_gms_internal_zzhc = null;
            switch (i) {
                case 1:
                    IBinder asBinder;
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zzeq zzck = zzck();
                    parcel2.writeNoException();
                    if (zzck != null) {
                        asBinder = zzck.asBinder();
                    }
                    parcel2.writeStrongBinder(asBinder);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zzb(com.google.android.gms.internal.zzep.zza.zzm(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zza(com.google.android.gms.internal.zzhp.zza.zzH(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zza(com.google.android.gms.internal.zzhq.zza.zzI(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zza(parcel.readString(), com.google.android.gms.internal.zzhs.zza.zzK(parcel.readStrongBinder()), com.google.android.gms.internal.zzhr.zza.zzJ(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_internal_zzhc = (zzhc) zzhc.CREATOR.createFromParcel(parcel);
                    }
                    zza(com_google_android_gms_internal_zzhc);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    zzb(com.google.android.gms.internal.zzex.zza.zzt(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(zzhc com_google_android_gms_internal_zzhc) throws RemoteException;

    void zza(zzhp com_google_android_gms_internal_zzhp) throws RemoteException;

    void zza(zzhq com_google_android_gms_internal_zzhq) throws RemoteException;

    void zza(String str, zzhs com_google_android_gms_internal_zzhs, zzhr com_google_android_gms_internal_zzhr) throws RemoteException;

    void zzb(zzep com_google_android_gms_internal_zzep) throws RemoteException;

    void zzb(zzex com_google_android_gms_internal_zzex) throws RemoteException;

    zzeq zzck() throws RemoteException;
}
