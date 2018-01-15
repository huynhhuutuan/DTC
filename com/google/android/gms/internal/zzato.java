package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Iterator;

public class zzato extends zza implements Iterable<String> {
    public static final Creator<zzato> CREATOR = new zzatp();
    private final Bundle zzbrH;

    class C04281 implements Iterator<String> {
        Iterator<String> zzbrI = this.zzbrJ.zzbrH.keySet().iterator();
        final /* synthetic */ zzato zzbrJ;

        C04281(zzato com_google_android_gms_internal_zzato) {
            this.zzbrJ = com_google_android_gms_internal_zzato;
        }

        public boolean hasNext() {
            return this.zzbrI.hasNext();
        }

        public String next() {
            return (String) this.zzbrI.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }

    zzato(Bundle bundle) {
        this.zzbrH = bundle;
    }

    Object get(String str) {
        return this.zzbrH.get(str);
    }

    public Iterator<String> iterator() {
        return new C04281(this);
    }

    public int size() {
        return this.zzbrH.size();
    }

    public String toString() {
        return this.zzbrH.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzatp.zza(this, parcel, i);
    }

    public Bundle zzLV() {
        return new Bundle(this.zzbrH);
    }
}
