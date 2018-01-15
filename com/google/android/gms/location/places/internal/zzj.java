package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.zzasu;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzf;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.location.places.zzp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public interface zzj extends IInterface {

    public static abstract class zza extends Binder implements zzj {

        private static class zza implements zzj {
            private IBinder zzrk;

            zza(IBinder iBinder) {
                this.zzrk = iBinder;
            }

            public IBinder asBinder() {
                return this.zzrk;
            }

            public void zza(AddPlaceRequest addPlaceRequest, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (addPlaceRequest != null) {
                        obtain.writeInt(1);
                        addPlaceRequest.writeToParcel(obtain, 0);
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
                    this.zzrk.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(PlaceReport placeReport, zzz com_google_android_gms_location_places_internal_zzz) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zzrk.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zzrk.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzasu != null ? com_google_android_gms_internal_zzasu.asBinder() : null);
                    this.zzrk.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzf com_google_android_gms_location_places_zzf, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zzrk.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzm com_google_android_gms_location_places_zzm, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zzrk.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(zzp com_google_android_gms_location_places_zzp, LatLngBounds latLngBounds, List<String> list, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (com_google_android_gms_location_places_zzp != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_zzp.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringList(list);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(LatLng latLng, PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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
                    this.zzrk.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(LatLng latLng, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
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
                    this.zzrk.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
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
                    this.zzrk.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, int i2, int i3, zzz com_google_android_gms_location_places_internal_zzz, zzk com_google_android_gms_location_places_internal_zzk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzk != null ? com_google_android_gms_location_places_internal_zzk.asBinder() : null);
                    this.zzrk.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, int i, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzz com_google_android_gms_location_places_internal_zzz, zzk com_google_android_gms_location_places_internal_zzk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzk != null ? com_google_android_gms_location_places_internal_zzk.asBinder() : null);
                    this.zzrk.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
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

            public void zza(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (autocompleteFilter != null) {
                        obtain.writeInt(1);
                        autocompleteFilter.writeToParcel(obtain, 0);
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
                    this.zzrk.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzasu != null ? com_google_android_gms_internal_zzasu.asBinder() : null);
                    this.zzrk.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(String str, String str2, String str3, zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzasu != null ? com_google_android_gms_internal_zzasu.asBinder() : null);
                    this.zzrk.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zza(List<String> list, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeStringList(list);
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

            public void zzb(PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zzrk.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.zzrk.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_internal_zzasu != null ? com_google_android_gms_internal_zzasu.asBinder() : null);
                    this.zzrk.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzb(List<String> list, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeStringList(list);
                    if (com_google_android_gms_location_places_internal_zzz != null) {
                        obtain.writeInt(1);
                        com_google_android_gms_location_places_internal_zzz.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(com_google_android_gms_location_places_internal_zzl != null ? com_google_android_gms_location_places_internal_zzl.asBinder() : null);
                    this.zzrk.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzj zzdm(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzj)) ? new zza(iBinder) : (zzj) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            zzz com_google_android_gms_location_places_internal_zzz = null;
            int readInt;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    LatLngBounds latLngBounds = parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null;
                    readInt = parcel.readInt();
                    String readString = parcel.readString();
                    PlaceFilter placeFilter = parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_location_places_internal_zzz = (zzz) zzz.CREATOR.createFromParcel(parcel);
                    }
                    zza(latLngBounds, readInt, readString, placeFilter, com_google_android_gms_location_places_internal_zzz, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zzb(parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readString(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.createStringArrayList(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (zzp) zzp.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (zzm) zzm.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (zzf) zzf.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zzb(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readString(), parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (AutocompleteFilter) AutocompleteFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (AddPlaceRequest) AddPlaceRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (PlaceReport) PlaceReport.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.zzasu.zza.zzdq(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zzb(parcel.createStringArrayList(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readString(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzk.zza.zzdn(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String readString2 = parcel.readString();
                    readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        com_google_android_gms_location_places_internal_zzz = (zzz) zzz.CREATOR.createFromParcel(parcel);
                    }
                    zza(readString2, readInt, readInt2, readInt3, com_google_android_gms_location_places_internal_zzz, com.google.android.gms.location.places.internal.zzk.zza.zzdn(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.zzasu.zza.zzdq(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zza(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.zzasu.zza.zzdq(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zzb(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.internal.zzasu.zza.zzdq(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    zzb(parcel.readInt() != 0 ? (zzz) zzz.CREATOR.createFromParcel(parcel) : null, com.google.android.gms.location.places.internal.zzl.zza.zzdo(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void zza(AddPlaceRequest addPlaceRequest, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(PlaceReport placeReport, zzz com_google_android_gms_location_places_internal_zzz) throws RemoteException;

    void zza(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException;

    void zza(zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException;

    void zza(zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(zzf com_google_android_gms_location_places_zzf, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException;

    void zza(zzm com_google_android_gms_location_places_zzm, zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException;

    void zza(zzp com_google_android_gms_location_places_zzp, LatLngBounds latLngBounds, List<String> list, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(LatLng latLng, PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(LatLng latLng, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(String str, int i, int i2, int i3, zzz com_google_android_gms_location_places_internal_zzz, zzk com_google_android_gms_location_places_internal_zzk) throws RemoteException;

    void zza(String str, int i, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(String str, zzz com_google_android_gms_location_places_internal_zzz, zzk com_google_android_gms_location_places_internal_zzk) throws RemoteException;

    void zza(String str, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zza(String str, String str2, zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException;

    void zza(String str, String str2, String str3, zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException;

    void zza(List<String> list, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zzb(PlaceFilter placeFilter, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zzb(zzz com_google_android_gms_location_places_internal_zzz, PendingIntent pendingIntent) throws RemoteException;

    void zzb(zzz com_google_android_gms_location_places_internal_zzz, zzasu com_google_android_gms_internal_zzasu) throws RemoteException;

    void zzb(zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;

    void zzb(List<String> list, zzz com_google_android_gms_location_places_internal_zzz, zzl com_google_android_gms_location_places_internal_zzl) throws RemoteException;
}
