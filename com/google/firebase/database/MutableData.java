package com.google.firebase.database;

import com.google.android.gms.internal.zzbph;
import com.google.android.gms.internal.zzbpo;
import com.google.android.gms.internal.zzbpw;
import com.google.android.gms.internal.zzbrq;
import com.google.android.gms.internal.zzbrx;
import com.google.android.gms.internal.zzbsb;
import com.google.android.gms.internal.zzbsc;
import com.google.android.gms.internal.zzbsd;
import com.google.android.gms.internal.zzbsg;
import com.google.android.gms.internal.zzbtf;
import com.google.android.gms.internal.zzbtg;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MutableData {
    private final zzbpo zzcag;
    private final zzbph zzcah;

    class C07231 implements Iterable<MutableData> {

        class C07221 implements Iterator<MutableData> {
            C07221(C07231 c07231) {
            }

            public boolean hasNext() {
                return false;
            }

            public /* synthetic */ Object next() {
                return zzWI();
            }

            public void remove() {
                throw new UnsupportedOperationException("remove called on immutable collection");
            }

            public MutableData zzWI() {
                throw new NoSuchElementException();
            }
        }

        C07231(MutableData mutableData) {
        }

        public Iterator<MutableData> iterator() {
            return new C07221(this);
        }
    }

    private MutableData(zzbpo com_google_android_gms_internal_zzbpo, zzbph com_google_android_gms_internal_zzbph) {
        this.zzcag = com_google_android_gms_internal_zzbpo;
        this.zzcah = com_google_android_gms_internal_zzbph;
        zzbpw.zza(this.zzcah, getValue());
    }

    MutableData(zzbsc com_google_android_gms_internal_zzbsc) {
        this(new zzbpo(com_google_android_gms_internal_zzbsc), new zzbph(""));
    }

    public MutableData child(String str) {
        zzbtf.zzjl(str);
        return new MutableData(this.zzcag, this.zzcah.zzh(new zzbph(str)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableData) && this.zzcag.equals(((MutableData) obj).zzcag) && this.zzcah.equals(((MutableData) obj).zzcah);
    }

    public Iterable<MutableData> getChildren() {
        zzbsc zzWH = zzWH();
        if (zzWH.isEmpty() || zzWH.zzaaM()) {
            return new C07231(this);
        }
        final Iterator it = zzbrx.zzn(zzWH).iterator();
        return new Iterable<MutableData>(this) {
            final /* synthetic */ MutableData zzcai;

            class C07241 implements Iterator<MutableData> {
                final /* synthetic */ C07252 zzcaj;

                C07241(C07252 c07252) {
                    this.zzcaj = c07252;
                }

                public boolean hasNext() {
                    return it.hasNext();
                }

                public /* synthetic */ Object next() {
                    return zzWI();
                }

                public void remove() {
                    throw new UnsupportedOperationException("remove called on immutable collection");
                }

                public MutableData zzWI() {
                    return new MutableData(this.zzcaj.zzcai.zzcag, this.zzcaj.zzcai.zzcah.zza(((zzbsb) it.next()).zzabi()));
                }
            }

            public Iterator<MutableData> iterator() {
                return new C07241(this);
            }
        };
    }

    public long getChildrenCount() {
        return (long) zzWH().getChildCount();
    }

    public String getKey() {
        return this.zzcah.zzYU() != null ? this.zzcah.zzYU().asString() : null;
    }

    public Object getPriority() {
        return zzWH().zzaaN().getValue();
    }

    public Object getValue() {
        return zzWH().getValue();
    }

    public <T> T getValue(GenericTypeIndicator<T> genericTypeIndicator) {
        return zzbtg.zza(zzWH().getValue(), (GenericTypeIndicator) genericTypeIndicator);
    }

    public <T> T getValue(Class<T> cls) {
        return zzbtg.zza(zzWH().getValue(), (Class) cls);
    }

    public boolean hasChild(String str) {
        return !zzWH().zzO(new zzbph(str)).isEmpty();
    }

    public boolean hasChildren() {
        zzbsc zzWH = zzWH();
        return (zzWH.zzaaM() || zzWH.isEmpty()) ? false : true;
    }

    public void setPriority(Object obj) {
        this.zzcag.zzg(this.zzcah, zzWH().zzg(zzbsg.zzau(obj)));
    }

    public void setValue(Object obj) throws DatabaseException {
        zzbpw.zza(this.zzcah, obj);
        Object zzay = zzbtg.zzay(obj);
        zzbtf.zzax(zzay);
        this.zzcag.zzg(this.zzcah, zzbsd.zzat(zzay));
    }

    public String toString() {
        zzbrq zzYR = this.zzcah.zzYR();
        String asString = zzYR != null ? zzYR.asString() : "<none>";
        String valueOf = String.valueOf(this.zzcag.zzZe().getValue(true));
        return new StringBuilder((String.valueOf(asString).length() + 32) + String.valueOf(valueOf).length()).append("MutableData { key = ").append(asString).append(", value = ").append(valueOf).append(" }").toString();
    }

    zzbsc zzWH() {
        return this.zzcag.zzq(this.zzcah);
    }
}
