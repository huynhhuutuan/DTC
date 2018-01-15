package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;
import com.google.android.gms.common.internal.safeparcel.zzc;
import java.util.List;

public class zzml implements Creator<zzmk> {
    static void zza(zzmk com_google_android_gms_internal_zzmk, Parcel parcel, int i) {
        int zzaZ = zzc.zzaZ(parcel);
        zzc.zzc(parcel, 1, com_google_android_gms_internal_zzmk.versionCode);
        zzc.zza(parcel, 2, com_google_android_gms_internal_zzmk.zzRx, false);
        zzc.zza(parcel, 3, com_google_android_gms_internal_zzmk.zzRy, i, false);
        zzc.zza(parcel, 4, com_google_android_gms_internal_zzmk.zzvr, i, false);
        zzc.zza(parcel, 5, com_google_android_gms_internal_zzmk.zzvl, false);
        zzc.zza(parcel, 6, com_google_android_gms_internal_zzmk.applicationInfo, i, false);
        zzc.zza(parcel, 7, com_google_android_gms_internal_zzmk.zzRz, i, false);
        zzc.zza(parcel, 8, com_google_android_gms_internal_zzmk.zzRA, false);
        zzc.zza(parcel, 9, com_google_android_gms_internal_zzmk.zzRB, false);
        zzc.zza(parcel, 10, com_google_android_gms_internal_zzmk.zzRC, false);
        zzc.zza(parcel, 11, com_google_android_gms_internal_zzmk.zzvn, i, false);
        zzc.zza(parcel, 12, com_google_android_gms_internal_zzmk.zzRD, false);
        zzc.zzc(parcel, 13, com_google_android_gms_internal_zzmk.zzRE);
        zzc.zzb(parcel, 14, com_google_android_gms_internal_zzmk.zzvK, false);
        zzc.zza(parcel, 15, com_google_android_gms_internal_zzmk.zzRF, false);
        zzc.zza(parcel, 16, com_google_android_gms_internal_zzmk.zzRG);
        zzc.zzc(parcel, 18, com_google_android_gms_internal_zzmk.zzRH);
        zzc.zzc(parcel, 19, com_google_android_gms_internal_zzmk.zzRI);
        zzc.zza(parcel, 20, com_google_android_gms_internal_zzmk.zzxk);
        zzc.zza(parcel, 21, com_google_android_gms_internal_zzmk.zzRJ, false);
        zzc.zza(parcel, 25, com_google_android_gms_internal_zzmk.zzRK);
        zzc.zza(parcel, 26, com_google_android_gms_internal_zzmk.zzRL, false);
        zzc.zzb(parcel, 27, com_google_android_gms_internal_zzmk.zzRM, false);
        zzc.zza(parcel, 28, com_google_android_gms_internal_zzmk.zzvk, false);
        zzc.zza(parcel, 29, com_google_android_gms_internal_zzmk.zzvF, i, false);
        zzc.zzb(parcel, 30, com_google_android_gms_internal_zzmk.zzRN, false);
        zzc.zza(parcel, 31, com_google_android_gms_internal_zzmk.zzRO);
        zzc.zza(parcel, 32, com_google_android_gms_internal_zzmk.zzRP, i, false);
        zzc.zza(parcel, 33, com_google_android_gms_internal_zzmk.zzRQ, false);
        zzc.zza(parcel, 34, com_google_android_gms_internal_zzmk.zzRR);
        zzc.zzc(parcel, 35, com_google_android_gms_internal_zzmk.zzRS);
        zzc.zzc(parcel, 36, com_google_android_gms_internal_zzmk.zzRT);
        zzc.zza(parcel, 37, com_google_android_gms_internal_zzmk.zzRU);
        zzc.zza(parcel, 38, com_google_android_gms_internal_zzmk.zzRV);
        zzc.zza(parcel, 39, com_google_android_gms_internal_zzmk.zzRW, false);
        zzc.zza(parcel, 40, com_google_android_gms_internal_zzmk.zzRX);
        zzc.zza(parcel, 41, com_google_android_gms_internal_zzmk.zzRY, false);
        zzc.zza(parcel, 42, com_google_android_gms_internal_zzmk.zzKJ);
        zzc.zzc(parcel, 43, com_google_android_gms_internal_zzmk.zzRZ);
        zzc.zza(parcel, 44, com_google_android_gms_internal_zzmk.zzSa, false);
        zzc.zza(parcel, 45, com_google_android_gms_internal_zzmk.zzSb, false);
        zzc.zza(parcel, 46, com_google_android_gms_internal_zzmk.zzvH, i, false);
        zzc.zza(parcel, 47, com_google_android_gms_internal_zzmk.zzSc);
        zzc.zza(parcel, 48, com_google_android_gms_internal_zzmk.zzSd, false);
        zzc.zza(parcel, 49, com_google_android_gms_internal_zzmk.zzSe, false);
        zzc.zza(parcel, 50, com_google_android_gms_internal_zzmk.zzSf, false);
        zzc.zza(parcel, 51, com_google_android_gms_internal_zzmk.zzSg, false);
        zzc.zza(parcel, 52, com_google_android_gms_internal_zzmk.zzSh);
        zzc.zzJ(parcel, zzaZ);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzn(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzV(i);
    }

    public zzmk[] zzV(int i) {
        return new zzmk[i];
    }

    public zzmk zzn(Parcel parcel) {
        int zzaY = zzb.zzaY(parcel);
        int i = 0;
        Bundle bundle = null;
        zzec com_google_android_gms_internal_zzec = null;
        zzeg com_google_android_gms_internal_zzeg = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzqh com_google_android_gms_internal_zzqh = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        zzhc com_google_android_gms_internal_zzhc = null;
        List list3 = null;
        long j2 = 0;
        zzmr com_google_android_gms_internal_zzmr = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        zzfc com_google_android_gms_internal_zzfc = null;
        boolean z6 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z7 = false;
        while (parcel.dataPosition() < zzaY) {
            int zzaX = zzb.zzaX(parcel);
            switch (zzb.zzdc(zzaX)) {
                case 1:
                    i = zzb.zzg(parcel, zzaX);
                    break;
                case 2:
                    bundle = zzb.zzs(parcel, zzaX);
                    break;
                case 3:
                    com_google_android_gms_internal_zzec = (zzec) zzb.zza(parcel, zzaX, zzec.CREATOR);
                    break;
                case 4:
                    com_google_android_gms_internal_zzeg = (zzeg) zzb.zza(parcel, zzaX, zzeg.CREATOR);
                    break;
                case 5:
                    str = zzb.zzq(parcel, zzaX);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) zzb.zza(parcel, zzaX, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) zzb.zza(parcel, zzaX, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = zzb.zzq(parcel, zzaX);
                    break;
                case 9:
                    str3 = zzb.zzq(parcel, zzaX);
                    break;
                case 10:
                    str4 = zzb.zzq(parcel, zzaX);
                    break;
                case 11:
                    com_google_android_gms_internal_zzqh = (zzqh) zzb.zza(parcel, zzaX, zzqh.CREATOR);
                    break;
                case 12:
                    bundle2 = zzb.zzs(parcel, zzaX);
                    break;
                case 13:
                    i2 = zzb.zzg(parcel, zzaX);
                    break;
                case 14:
                    list = zzb.zzE(parcel, zzaX);
                    break;
                case 15:
                    bundle3 = zzb.zzs(parcel, zzaX);
                    break;
                case 16:
                    z = zzb.zzc(parcel, zzaX);
                    break;
                case 18:
                    i3 = zzb.zzg(parcel, zzaX);
                    break;
                case 19:
                    i4 = zzb.zzg(parcel, zzaX);
                    break;
                case 20:
                    f = zzb.zzl(parcel, zzaX);
                    break;
                case 21:
                    str5 = zzb.zzq(parcel, zzaX);
                    break;
                case 25:
                    j = zzb.zzi(parcel, zzaX);
                    break;
                case 26:
                    str6 = zzb.zzq(parcel, zzaX);
                    break;
                case 27:
                    list2 = zzb.zzE(parcel, zzaX);
                    break;
                case 28:
                    str7 = zzb.zzq(parcel, zzaX);
                    break;
                case 29:
                    com_google_android_gms_internal_zzhc = (zzhc) zzb.zza(parcel, zzaX, zzhc.CREATOR);
                    break;
                case 30:
                    list3 = zzb.zzE(parcel, zzaX);
                    break;
                case 31:
                    j2 = zzb.zzi(parcel, zzaX);
                    break;
                case 32:
                    com_google_android_gms_internal_zzmr = (zzmr) zzb.zza(parcel, zzaX, zzmr.CREATOR);
                    break;
                case 33:
                    str8 = zzb.zzq(parcel, zzaX);
                    break;
                case 34:
                    f2 = zzb.zzl(parcel, zzaX);
                    break;
                case 35:
                    i5 = zzb.zzg(parcel, zzaX);
                    break;
                case 36:
                    i6 = zzb.zzg(parcel, zzaX);
                    break;
                case 37:
                    z3 = zzb.zzc(parcel, zzaX);
                    break;
                case 38:
                    z4 = zzb.zzc(parcel, zzaX);
                    break;
                case 39:
                    str9 = zzb.zzq(parcel, zzaX);
                    break;
                case 40:
                    z2 = zzb.zzc(parcel, zzaX);
                    break;
                case 41:
                    str10 = zzb.zzq(parcel, zzaX);
                    break;
                case 42:
                    z5 = zzb.zzc(parcel, zzaX);
                    break;
                case 43:
                    i7 = zzb.zzg(parcel, zzaX);
                    break;
                case 44:
                    bundle4 = zzb.zzs(parcel, zzaX);
                    break;
                case 45:
                    str11 = zzb.zzq(parcel, zzaX);
                    break;
                case 46:
                    com_google_android_gms_internal_zzfc = (zzfc) zzb.zza(parcel, zzaX, zzfc.CREATOR);
                    break;
                case 47:
                    z6 = zzb.zzc(parcel, zzaX);
                    break;
                case 48:
                    bundle5 = zzb.zzs(parcel, zzaX);
                    break;
                case 49:
                    str12 = zzb.zzq(parcel, zzaX);
                    break;
                case 50:
                    str13 = zzb.zzq(parcel, zzaX);
                    break;
                case 51:
                    str14 = zzb.zzq(parcel, zzaX);
                    break;
                case 52:
                    z7 = zzb.zzc(parcel, zzaX);
                    break;
                default:
                    zzb.zzb(parcel, zzaX);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaY) {
            return new zzmk(i, bundle, com_google_android_gms_internal_zzec, com_google_android_gms_internal_zzeg, str, applicationInfo, packageInfo, str2, str3, str4, com_google_android_gms_internal_zzqh, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, com_google_android_gms_internal_zzhc, list3, j2, com_google_android_gms_internal_zzmr, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, com_google_android_gms_internal_zzfc, z6, bundle5, str12, str13, str14, z7);
        }
        throw new zza("Overread allowed size end=" + zzaY, parcel);
    }
}
