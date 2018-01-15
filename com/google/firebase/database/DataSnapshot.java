package com.google.firebase.database;

import com.google.android.gms.internal.zzbph;
import com.google.android.gms.internal.zzbrx;
import com.google.android.gms.internal.zzbsb;
import com.google.android.gms.internal.zzbtf;
import com.google.android.gms.internal.zzbtg;
import java.util.Iterator;

public class DataSnapshot {
    private final zzbrx zzbZH;
    private final DatabaseReference zzbZI;

    DataSnapshot(DatabaseReference databaseReference, zzbrx com_google_android_gms_internal_zzbrx) {
        this.zzbZH = com_google_android_gms_internal_zzbrx;
        this.zzbZI = databaseReference;
    }

    public DataSnapshot child(String str) {
        return new DataSnapshot(this.zzbZI.child(str), zzbrx.zzn(this.zzbZH.zzWH().zzO(new zzbph(str))));
    }

    public boolean exists() {
        return !this.zzbZH.zzWH().isEmpty();
    }

    public Iterable<DataSnapshot> getChildren() {
        final Iterator it = this.zzbZH.iterator();
        return new Iterable<DataSnapshot>(this) {
            final /* synthetic */ DataSnapshot zzbZK;

            class C07151 implements Iterator<DataSnapshot> {
                final /* synthetic */ C07161 zzbZL;

                C07151(C07161 c07161) {
                    this.zzbZL = c07161;
                }

                public boolean hasNext() {
                    return it.hasNext();
                }

                public /* synthetic */ Object next() {
                    return zzWE();
                }

                public void remove() {
                    throw new UnsupportedOperationException("remove called on immutable collection");
                }

                public DataSnapshot zzWE() {
                    zzbsb com_google_android_gms_internal_zzbsb = (zzbsb) it.next();
                    return new DataSnapshot(this.zzbZL.zzbZK.zzbZI.child(com_google_android_gms_internal_zzbsb.zzabi().asString()), zzbrx.zzn(com_google_android_gms_internal_zzbsb.zzWH()));
                }
            }

            public Iterator<DataSnapshot> iterator() {
                return new C07151(this);
            }
        };
    }

    public long getChildrenCount() {
        return (long) this.zzbZH.zzWH().getChildCount();
    }

    public String getKey() {
        return this.zzbZI.getKey();
    }

    public Object getPriority() {
        Object value = this.zzbZH.zzWH().zzaaN().getValue();
        return value instanceof Long ? Double.valueOf((double) ((Long) value).longValue()) : value;
    }

    public DatabaseReference getRef() {
        return this.zzbZI;
    }

    public Object getValue() {
        return this.zzbZH.zzWH().getValue();
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return zzbtg.zza(this.zzbZH.zzWH().getValue(), (GenericTypeIndicator) genericTypeIndicator);
    }

    public <T> T getValue(Class<T> cls) {
        return zzbtg.zza(this.zzbZH.zzWH().getValue(), (Class) cls);
    }

    public Object getValue(boolean z) {
        return this.zzbZH.zzWH().getValue(z);
    }

    public boolean hasChild(String str) {
        if (this.zzbZI.getParent() == null) {
            zzbtf.zzjm(str);
        } else {
            zzbtf.zzjl(str);
        }
        return !this.zzbZH.zzWH().zzO(new zzbph(str)).isEmpty();
    }

    public boolean hasChildren() {
        return this.zzbZH.zzWH().getChildCount() > 0;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbZI.getKey());
        String valueOf2 = String.valueOf(this.zzbZH.zzWH().getValue(true));
        return new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("DataSnapshot { key = ").append(valueOf).append(", value = ").append(valueOf2).append(" }").toString();
    }
}
