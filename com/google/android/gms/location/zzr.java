package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;

public class zzr implements Creator<LocationSettingsResult> {
    static void zza(LocationSettingsResult locationSettingsResult, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zza(parcel, 1, locationSettingsResult.getStatus(), i, false);
        zzc.zza(parcel, 2, locationSettingsResult.getLocationSettingsStates(), i, false);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgQ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzkq(i);
    }

    public LocationSettingsResult zzgQ(Parcel parcel) {
        LocationSettingsStates locationSettingsStates = null;
        int zzaY = zzb.zzaY(parcel);
        Status status = null;
        while (parcel.dataPosition() < zzaY) {
            Status status2;
            LocationSettingsStates locationSettingsStates2;
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    LocationSettingsStates locationSettingsStates3 = locationSettingsStates;
                    status2 = (Status) zzb.zza(parcel, zzaX, Status.CREATOR);
                    locationSettingsStates2 = locationSettingsStates3;
                    break;
                case 2:
                    locationSettingsStates2 = (LocationSettingsStates) zzb.zza(parcel, zzaX, LocationSettingsStates.CREATOR);
                    status2 = status;
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    locationSettingsStates2 = locationSettingsStates;
                    status2 = status;
                    break;
            }
            status = status2;
            locationSettingsStates = locationSettingsStates2;
        }
        if (parcel.dataPosition() == zzaY) {
            return new LocationSettingsResult(status, locationSettingsStates);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }

    public LocationSettingsResult[] zzkq(int i) {
        return new LocationSettingsResult[i];
    }
}
