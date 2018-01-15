package com.google.android.gms.internal;

import com.google.android.gms.internal.zzbqq.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzboy implements Iterable<Entry<zzbph, zzbsc>> {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzboy.class.desiredAssertionStatus());
    private static final zzboy zzcdN = new zzboy(new zzbqq(null));
    private final zzbqq<zzbsc> zzcdO;

    private zzboy(zzbqq<zzbsc> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbsc) {
        this.zzcdO = com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbsc;
    }

    public static zzboy zzYn() {
        return zzcdN;
    }

    private zzbsc zza(zzbph com_google_android_gms_internal_zzbph, zzbqq<zzbsc> com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbsc, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbsc.getValue() != null) {
            return com_google_android_gms_internal_zzbsc.zzl(com_google_android_gms_internal_zzbph, (zzbsc) com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbsc.getValue());
        }
        zzbsc com_google_android_gms_internal_zzbsc2 = null;
        Iterator it = com_google_android_gms_internal_zzbqq_com_google_android_gms_internal_zzbsc.zzZN().iterator();
        zzbsc com_google_android_gms_internal_zzbsc3 = com_google_android_gms_internal_zzbsc;
        while (it.hasNext()) {
            zzbsc zza;
            zzbsc com_google_android_gms_internal_zzbsc4;
            Entry entry = (Entry) it.next();
            zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) entry.getValue();
            zzbrq com_google_android_gms_internal_zzbrq = (zzbrq) entry.getKey();
            if (!com_google_android_gms_internal_zzbrq.zzaaJ()) {
                zza = zza(com_google_android_gms_internal_zzbph.zza(com_google_android_gms_internal_zzbrq), com_google_android_gms_internal_zzbqq, com_google_android_gms_internal_zzbsc3);
                com_google_android_gms_internal_zzbsc4 = com_google_android_gms_internal_zzbsc2;
            } else if ($assertionsDisabled || com_google_android_gms_internal_zzbqq.getValue() != null) {
                com_google_android_gms_internal_zzbsc4 = (zzbsc) com_google_android_gms_internal_zzbqq.getValue();
                zza = com_google_android_gms_internal_zzbsc3;
            } else {
                throw new AssertionError("Priority writes must always be leaf nodes");
            }
            com_google_android_gms_internal_zzbsc2 = com_google_android_gms_internal_zzbsc4;
            com_google_android_gms_internal_zzbsc3 = zza;
        }
        return (com_google_android_gms_internal_zzbsc3.zzO(com_google_android_gms_internal_zzbph).isEmpty() || com_google_android_gms_internal_zzbsc2 == null) ? com_google_android_gms_internal_zzbsc3 : com_google_android_gms_internal_zzbsc3.zzl(com_google_android_gms_internal_zzbph.zza(zzbrq.zzaaH()), com_google_android_gms_internal_zzbsc2);
    }

    public static zzboy zzaB(Map<String, Object> map) {
        zzbqq zzZM = zzbqq.zzZM();
        zzbqq com_google_android_gms_internal_zzbqq = zzZM;
        for (Entry entry : map.entrySet()) {
            com_google_android_gms_internal_zzbqq = com_google_android_gms_internal_zzbqq.zza(new zzbph((String) entry.getKey()), new zzbqq(zzbsd.zzat(entry.getValue())));
        }
        return new zzboy(com_google_android_gms_internal_zzbqq);
    }

    public static zzboy zzaC(Map<zzbph, zzbsc> map) {
        zzbqq zzZM = zzbqq.zzZM();
        zzbqq com_google_android_gms_internal_zzbqq = zzZM;
        for (Entry entry : map.entrySet()) {
            com_google_android_gms_internal_zzbqq = com_google_android_gms_internal_zzbqq.zza((zzbph) entry.getKey(), new zzbqq((zzbsc) entry.getValue()));
        }
        return new zzboy(com_google_android_gms_internal_zzbqq);
    }

    public boolean equals(Object obj) {
        return obj == this ? true : (obj == null || obj.getClass() != getClass()) ? false : ((zzboy) obj).zzbe(true).equals(zzbe(true));
    }

    public int hashCode() {
        return zzbe(true).hashCode();
    }

    public boolean isEmpty() {
        return this.zzcdO.isEmpty();
    }

    public Iterator<Entry<zzbph, zzbsc>> iterator() {
        return this.zzcdO.iterator();
    }

    public String toString() {
        String valueOf = String.valueOf(zzbe(true).toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("CompoundWrite{").append(valueOf).append("}").toString();
    }

    public zzbsc zzYo() {
        return (zzbsc) this.zzcdO.getValue();
    }

    public List<zzbsb> zzYp() {
        List<zzbsb> arrayList = new ArrayList();
        if (this.zzcdO.getValue() != null) {
            for (zzbsb com_google_android_gms_internal_zzbsb : (zzbsc) this.zzcdO.getValue()) {
                arrayList.add(new zzbsb(com_google_android_gms_internal_zzbsb.zzabi(), com_google_android_gms_internal_zzbsb.zzWH()));
            }
        } else {
            Iterator it = this.zzcdO.zzZN().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                zzbqq com_google_android_gms_internal_zzbqq = (zzbqq) entry.getValue();
                if (com_google_android_gms_internal_zzbqq.getValue() != null) {
                    arrayList.add(new zzbsb((zzbrq) entry.getKey(), (zzbsc) com_google_android_gms_internal_zzbqq.getValue()));
                }
            }
        }
        return arrayList;
    }

    public Map<zzbrq, zzboy> zzYq() {
        Map<zzbrq, zzboy> hashMap = new HashMap();
        Iterator it = this.zzcdO.zzZN().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            hashMap.put((zzbrq) entry.getKey(), new zzboy((zzbqq) entry.getValue()));
        }
        return hashMap;
    }

    public zzboy zza(zzbrq com_google_android_gms_internal_zzbrq, zzbsc com_google_android_gms_internal_zzbsc) {
        return zze(new zzbph(com_google_android_gms_internal_zzbrq), com_google_android_gms_internal_zzbsc);
    }

    public zzboy zzb(final zzbph com_google_android_gms_internal_zzbph, zzboy com_google_android_gms_internal_zzboy) {
        return (zzboy) com_google_android_gms_internal_zzboy.zzcdO.zzb((Object) this, new zza<zzbsc, zzboy>(this) {
            public zzboy zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, zzboy com_google_android_gms_internal_zzboy) {
                return com_google_android_gms_internal_zzboy.zze(com_google_android_gms_internal_zzbph.zzh(com_google_android_gms_internal_zzbph), com_google_android_gms_internal_zzbsc);
            }
        });
    }

    public zzbsc zzb(zzbsc com_google_android_gms_internal_zzbsc) {
        return zza(zzbph.zzYO(), this.zzcdO, com_google_android_gms_internal_zzbsc);
    }

    public Map<String, Object> zzbe(final boolean z) {
        final Map<String, Object> hashMap = new HashMap();
        this.zzcdO.zza(new zza<zzbsc, Void>(this) {
            public Void zza(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc, Void voidR) {
                hashMap.put(com_google_android_gms_internal_zzbph.zzYP(), com_google_android_gms_internal_zzbsc.getValue(z));
                return null;
            }
        });
        return hashMap;
    }

    public zzboy zzd(zzbph com_google_android_gms_internal_zzbph) {
        return com_google_android_gms_internal_zzbph.isEmpty() ? zzcdN : new zzboy(this.zzcdO.zza(com_google_android_gms_internal_zzbph, zzbqq.zzZM()));
    }

    public zzboy zze(zzbph com_google_android_gms_internal_zzbph, zzbsc com_google_android_gms_internal_zzbsc) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return new zzboy(new zzbqq(com_google_android_gms_internal_zzbsc));
        }
        zzbph zzG = this.zzcdO.zzG(com_google_android_gms_internal_zzbph);
        if (zzG != null) {
            zzbph zza = zzbph.zza(zzG, com_google_android_gms_internal_zzbph);
            zzbsc com_google_android_gms_internal_zzbsc2 = (zzbsc) this.zzcdO.zzK(zzG);
            zzbrq zzYU = zza.zzYU();
            if (zzYU != null && zzYU.zzaaJ() && com_google_android_gms_internal_zzbsc2.zzO(zza.zzYT()).isEmpty()) {
                return this;
            }
            return new zzboy(this.zzcdO.zzb(zzG, com_google_android_gms_internal_zzbsc2.zzl(zza, com_google_android_gms_internal_zzbsc)));
        }
        return new zzboy(this.zzcdO.zza(com_google_android_gms_internal_zzbph, new zzbqq(com_google_android_gms_internal_zzbsc)));
    }

    public boolean zze(zzbph com_google_android_gms_internal_zzbph) {
        return zzf(com_google_android_gms_internal_zzbph) != null;
    }

    public zzbsc zzf(zzbph com_google_android_gms_internal_zzbph) {
        zzbph zzG = this.zzcdO.zzG(com_google_android_gms_internal_zzbph);
        return zzG != null ? ((zzbsc) this.zzcdO.zzK(zzG)).zzO(zzbph.zza(zzG, com_google_android_gms_internal_zzbph)) : null;
    }

    public zzboy zzg(zzbph com_google_android_gms_internal_zzbph) {
        if (com_google_android_gms_internal_zzbph.isEmpty()) {
            return this;
        }
        zzbsc zzf = zzf(com_google_android_gms_internal_zzbph);
        return zzf != null ? new zzboy(new zzbqq(zzf)) : new zzboy(this.zzcdO.zzI(com_google_android_gms_internal_zzbph));
    }
}
