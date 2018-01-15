package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.internal.zzblo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzab extends zzc {
    public zzab(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    protected String zzO(String str, String str2) {
        return (!zzdf(str) || zzdh(str)) ? str2 : getString(str);
    }

    protected <E extends SafeParcelable> E zza(String str, Creator<E> creator) {
        byte[] zzc = zzc(str, null);
        return zzc == null ? null : zzd.zza(zzc, creator);
    }

    protected <E extends SafeParcelable> List<E> zza(String str, Creator<E> creator, List<E> list) {
        byte[] zzc = zzc(str, null);
        if (zzc == null) {
            return list;
        }
        try {
            zzblo zzT = zzblo.zzT(zzc);
            if (zzT.zzbWD == null) {
                return list;
            }
            List<E> arrayList = new ArrayList(zzT.zzbWD.length);
            for (byte[] zza : zzT.zzbWD) {
                arrayList.add(zzd.zza(zza, creator));
            }
            return arrayList;
        } catch (Throwable e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    protected float zzb(String str, float f) {
        return (!zzdf(str) || zzdh(str)) ? f : getFloat(str);
    }

    protected List<Integer> zzb(String str, List<Integer> list) {
        byte[] zzc = zzc(str, null);
        if (zzc == null) {
            return list;
        }
        try {
            zzblo zzT = zzblo.zzT(zzc);
            if (zzT.zzbWC == null) {
                return list;
            }
            List<Integer> arrayList = new ArrayList(zzT.zzbWC.length);
            for (int valueOf : zzT.zzbWC) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            return arrayList;
        } catch (Throwable e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    protected List<String> zzc(String str, List<String> list) {
        byte[] zzc = zzc(str, null);
        if (zzc != null) {
            try {
                zzblo zzT = zzblo.zzT(zzc);
                if (zzT.zzbWB != null) {
                    list = Arrays.asList(zzT.zzbWB);
                }
            } catch (Throwable e) {
                if (Log.isLoggable("SafeDataBufferRef", 6)) {
                    Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
                }
            }
        }
        return list;
    }

    protected byte[] zzc(String str, byte[] bArr) {
        return (!zzdf(str) || zzdh(str)) ? bArr : getByteArray(str);
    }

    protected boolean zzk(String str, boolean z) {
        return (!zzdf(str) || zzdh(str)) ? z : getBoolean(str);
    }

    protected int zzy(String str, int i) {
        return (!zzdf(str) || zzdh(str)) ? i : getInteger(str);
    }
}
