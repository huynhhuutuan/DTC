package com.google.android.gms.internal;

import android.support.v4.media.TransportMediator;
import java.io.IOException;

public interface zzaj {

    public static final class zza extends zzbxn<zza> {
        public int level;
        public int zzkn;
        public int zzko;

        public zza() {
            zzw();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzaj_zza = (zza) obj;
            return (this.level == com_google_android_gms_internal_zzaj_zza.level && this.zzkn == com_google_android_gms_internal_zzaj_zza.zzkn && this.zzko == com_google_android_gms_internal_zzaj_zza.zzko) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zza.zzcuA == null || com_google_android_gms_internal_zzaj_zza.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zza.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.level) * 31) + this.zzkn) * 31) + this.zzko) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.level != 1) {
                com_google_android_gms_internal_zzbxm.zzJ(1, this.level);
            }
            if (this.zzkn != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(2, this.zzkn);
            }
            if (this.zzko != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(3, this.zzko);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzn(com_google_android_gms_internal_zzbxl);
        }

        public zza zzn(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case 1:
                            case 2:
                            case 3:
                                this.level = zzaen;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        this.zzkn = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 24:
                        this.zzko = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.level != 1) {
                zzu += zzbxm.zzL(1, this.level);
            }
            if (this.zzkn != 0) {
                zzu += zzbxm.zzL(2, this.zzkn);
            }
            return this.zzko != 0 ? zzu + zzbxm.zzL(3, this.zzko) : zzu;
        }

        public zza zzw() {
            this.level = 1;
            this.zzkn = 0;
            this.zzko = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }
    }

    public static final class zzb extends zzbxn<zzb> {
        private static volatile zzb[] zzkp;
        public int name;
        public int[] zzkq;
        public int zzkr;
        public boolean zzks;
        public boolean zzkt;

        public zzb() {
            zzy();
        }

        public static zzb[] zzx() {
            if (zzkp == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzkp == null) {
                        zzkp = new zzb[0];
                    }
                }
            }
            return zzkp;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzaj_zzb = (zzb) obj;
            return (zzbxr.equals(this.zzkq, com_google_android_gms_internal_zzaj_zzb.zzkq) && this.zzkr == com_google_android_gms_internal_zzaj_zzb.zzkr && this.name == com_google_android_gms_internal_zzaj_zzb.name && this.zzks == com_google_android_gms_internal_zzaj_zzb.zzks && this.zzkt == com_google_android_gms_internal_zzaj_zzb.zzkt) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzb.zzcuA == null || com_google_android_gms_internal_zzaj_zzb.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzb.zzcuA) : false;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = ((this.zzks ? 1231 : 1237) + ((((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzkq)) * 31) + this.zzkr) * 31) + this.name) * 31)) * 31;
            if (!this.zzkt) {
                i = 1237;
            }
            i = (hashCode + i) * 31;
            hashCode = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzkt) {
                com_google_android_gms_internal_zzbxm.zzg(1, this.zzkt);
            }
            com_google_android_gms_internal_zzbxm.zzJ(2, this.zzkr);
            if (this.zzkq != null && this.zzkq.length > 0) {
                for (int zzJ : this.zzkq) {
                    com_google_android_gms_internal_zzbxm.zzJ(3, zzJ);
                }
            }
            if (this.name != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(4, this.name);
            }
            if (this.zzks) {
                com_google_android_gms_internal_zzbxm.zzg(6, this.zzks);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzo(com_google_android_gms_internal_zzbxl);
        }

        public zzb zzo(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.zzkt = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 16:
                        this.zzkr = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 24:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 24);
                        zzaen = this.zzkq == null ? 0 : this.zzkq.length;
                        Object obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkq, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkq = obj;
                        continue;
                    case 26:
                        int zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkq == null ? 0 : this.zzkq.length;
                        Object obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkq, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkq = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 32:
                        this.name = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 48:
                        this.zzks = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int i = 0;
            int zzu = super.zzu();
            if (this.zzkt) {
                zzu += zzbxm.zzh(1, this.zzkt);
            }
            int zzL = zzbxm.zzL(2, this.zzkr) + zzu;
            if (this.zzkq == null || this.zzkq.length <= 0) {
                zzu = zzL;
            } else {
                for (int zzrf : this.zzkq) {
                    i += zzbxm.zzrf(zzrf);
                }
                zzu = (zzL + i) + (this.zzkq.length * 1);
            }
            if (this.name != 0) {
                zzu += zzbxm.zzL(4, this.name);
            }
            return this.zzks ? zzu + zzbxm.zzh(6, this.zzks) : zzu;
        }

        public zzb zzy() {
            this.zzkq = zzbxw.zzcuO;
            this.zzkr = 0;
            this.name = 0;
            this.zzks = false;
            this.zzkt = false;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }
    }

    public static final class zzc extends zzbxn<zzc> {
        private static volatile zzc[] zzku;
        public String zzaB;
        public long zzkv;
        public long zzkw;
        public boolean zzkx;
        public long zzky;

        public zzc() {
            zzA();
        }

        public static zzc[] zzz() {
            if (zzku == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzku == null) {
                        zzku = new zzc[0];
                    }
                }
            }
            return zzku;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzaj_zzc = (zzc) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzaj_zzc.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzaj_zzc.zzaB)) {
                return false;
            }
            return (this.zzkv == com_google_android_gms_internal_zzaj_zzc.zzkv && this.zzkw == com_google_android_gms_internal_zzaj_zzc.zzkw && this.zzkx == com_google_android_gms_internal_zzaj_zzc.zzkx && this.zzky == com_google_android_gms_internal_zzaj_zzc.zzky) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzc.zzcuA == null || com_google_android_gms_internal_zzaj_zzc.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzc.zzcuA) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzkx ? 1231 : 1237) + (((((((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.zzkv ^ (this.zzkv >>> 32)))) * 31) + ((int) (this.zzkw ^ (this.zzkw >>> 32)))) * 31)) * 31) + ((int) (this.zzky ^ (this.zzky >>> 32)))) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public zzc zzA() {
            this.zzaB = "";
            this.zzkv = 0;
            this.zzkw = 2147483647L;
            this.zzkx = false;
            this.zzky = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.zzaB == null || this.zzaB.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzaB);
            }
            if (this.zzkv != 0) {
                com_google_android_gms_internal_zzbxm.zzb(2, this.zzkv);
            }
            if (this.zzkw != 2147483647L) {
                com_google_android_gms_internal_zzbxm.zzb(3, this.zzkw);
            }
            if (this.zzkx) {
                com_google_android_gms_internal_zzbxm.zzg(4, this.zzkx);
            }
            if (this.zzky != 0) {
                com_google_android_gms_internal_zzbxm.zzb(5, this.zzky);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzp(com_google_android_gms_internal_zzbxl);
        }

        public zzc zzp(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        this.zzaB = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 16:
                        this.zzkv = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 24:
                        this.zzkw = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 32:
                        this.zzkx = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 40:
                        this.zzky = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (!(this.zzaB == null || this.zzaB.equals(""))) {
                zzu += zzbxm.zzr(1, this.zzaB);
            }
            if (this.zzkv != 0) {
                zzu += zzbxm.zzf(2, this.zzkv);
            }
            if (this.zzkw != 2147483647L) {
                zzu += zzbxm.zzf(3, this.zzkw);
            }
            if (this.zzkx) {
                zzu += zzbxm.zzh(4, this.zzkx);
            }
            return this.zzky != 0 ? zzu + zzbxm.zzf(5, this.zzky) : zzu;
        }
    }

    public static final class zzd extends zzbxn<zzd> {
        public com.google.android.gms.internal.zzak.zza[] zzkA;
        public zzc[] zzkB;
        public com.google.android.gms.internal.zzak.zza[] zzkz;

        public zzd() {
            zzB();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzaj_zzd = (zzd) obj;
            return (zzbxr.equals(this.zzkz, com_google_android_gms_internal_zzaj_zzd.zzkz) && zzbxr.equals(this.zzkA, com_google_android_gms_internal_zzaj_zzd.zzkA) && zzbxr.equals(this.zzkB, com_google_android_gms_internal_zzaj_zzd.zzkB)) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzd.zzcuA == null || com_google_android_gms_internal_zzaj_zzd.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzd.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzkz)) * 31) + zzbxr.hashCode(this.zzkA)) * 31) + zzbxr.hashCode(this.zzkB)) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public zzd zzB() {
            this.zzkz = com.google.android.gms.internal.zzak.zza.zzL();
            this.zzkA = com.google.android.gms.internal.zzak.zza.zzL();
            this.zzkB = zzc.zzz();
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzkz != null && this.zzkz.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzkz) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(1, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (this.zzkA != null && this.zzkA.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt2 : this.zzkA) {
                    if (com_google_android_gms_internal_zzbxt2 != null) {
                        com_google_android_gms_internal_zzbxm.zza(2, com_google_android_gms_internal_zzbxt2);
                    }
                }
            }
            if (this.zzkB != null && this.zzkB.length > 0) {
                while (i < this.zzkB.length) {
                    zzbxt com_google_android_gms_internal_zzbxt3 = this.zzkB[i];
                    if (com_google_android_gms_internal_zzbxt3 != null) {
                        com_google_android_gms_internal_zzbxm.zza(3, com_google_android_gms_internal_zzbxt3);
                    }
                    i++;
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzq(com_google_android_gms_internal_zzbxl);
        }

        public zzd zzq(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 10);
                        zzaen = this.zzkz == null ? 0 : this.zzkz.length;
                        obj = new com.google.android.gms.internal.zzak.zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkz, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new com.google.android.gms.internal.zzak.zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new com.google.android.gms.internal.zzak.zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkz = obj;
                        continue;
                    case 18:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 18);
                        zzaen = this.zzkA == null ? 0 : this.zzkA.length;
                        obj = new com.google.android.gms.internal.zzak.zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkA, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new com.google.android.gms.internal.zzak.zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new com.google.android.gms.internal.zzak.zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkA = obj;
                        continue;
                    case 26:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 26);
                        zzaen = this.zzkB == null ? 0 : this.zzkB.length;
                        obj = new zzc[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkB, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzc();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzc();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkB = obj;
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int i;
            int i2 = 0;
            int zzu = super.zzu();
            if (this.zzkz != null && this.zzkz.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzkz) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        i += zzbxm.zzc(1, com_google_android_gms_internal_zzbxt);
                    }
                }
                zzu = i;
            }
            if (this.zzkA != null && this.zzkA.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt2 : this.zzkA) {
                    if (com_google_android_gms_internal_zzbxt2 != null) {
                        i += zzbxm.zzc(2, com_google_android_gms_internal_zzbxt2);
                    }
                }
                zzu = i;
            }
            if (this.zzkB != null && this.zzkB.length > 0) {
                while (i2 < this.zzkB.length) {
                    zzbxt com_google_android_gms_internal_zzbxt3 = this.zzkB[i2];
                    if (com_google_android_gms_internal_zzbxt3 != null) {
                        zzu += zzbxm.zzc(3, com_google_android_gms_internal_zzbxt3);
                    }
                    i2++;
                }
            }
            return zzu;
        }
    }

    public static final class zze extends zzbxn<zze> {
        private static volatile zze[] zzkC;
        public int key;
        public int value;

        public zze() {
            zzD();
        }

        public static zze[] zzC() {
            if (zzkC == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzkC == null) {
                        zzkC = new zze[0];
                    }
                }
            }
            return zzkC;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzaj_zze = (zze) obj;
            return (this.key == com_google_android_gms_internal_zzaj_zze.key && this.value == com_google_android_gms_internal_zzaj_zze.value) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zze.zzcuA == null || com_google_android_gms_internal_zzaj_zze.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zze.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.key) * 31) + this.value) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public zze zzD() {
            this.key = 0;
            this.value = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            com_google_android_gms_internal_zzbxm.zzJ(1, this.key);
            com_google_android_gms_internal_zzbxm.zzJ(2, this.value);
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzr(com_google_android_gms_internal_zzbxl);
        }

        public zze zzr(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.key = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 16:
                        this.value = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            return (super.zzu() + zzbxm.zzL(1, this.key)) + zzbxm.zzL(2, this.value);
        }
    }

    public static final class zzf extends zzbxn<zzf> {
        public String version;
        public String[] zzkD;
        public String[] zzkE;
        public com.google.android.gms.internal.zzak.zza[] zzkF;
        public zze[] zzkG;
        public zzb[] zzkH;
        public zzb[] zzkI;
        public zzb[] zzkJ;
        public zzg[] zzkK;
        public String zzkL;
        public String zzkM;
        public String zzkN;
        public zza zzkO;
        public float zzkP;
        public boolean zzkQ;
        public String[] zzkR;
        public int zzkS;

        public zzf() {
            zzE();
        }

        public static zzf zzf(byte[] bArr) throws zzbxs {
            return (zzf) zzbxt.zza(new zzf(), bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzaj_zzf = (zzf) obj;
            if (!zzbxr.equals(this.zzkD, com_google_android_gms_internal_zzaj_zzf.zzkD) || !zzbxr.equals(this.zzkE, com_google_android_gms_internal_zzaj_zzf.zzkE) || !zzbxr.equals(this.zzkF, com_google_android_gms_internal_zzaj_zzf.zzkF) || !zzbxr.equals(this.zzkG, com_google_android_gms_internal_zzaj_zzf.zzkG) || !zzbxr.equals(this.zzkH, com_google_android_gms_internal_zzaj_zzf.zzkH) || !zzbxr.equals(this.zzkI, com_google_android_gms_internal_zzaj_zzf.zzkI) || !zzbxr.equals(this.zzkJ, com_google_android_gms_internal_zzaj_zzf.zzkJ) || !zzbxr.equals(this.zzkK, com_google_android_gms_internal_zzaj_zzf.zzkK)) {
                return false;
            }
            if (this.zzkL == null) {
                if (com_google_android_gms_internal_zzaj_zzf.zzkL != null) {
                    return false;
                }
            } else if (!this.zzkL.equals(com_google_android_gms_internal_zzaj_zzf.zzkL)) {
                return false;
            }
            if (this.zzkM == null) {
                if (com_google_android_gms_internal_zzaj_zzf.zzkM != null) {
                    return false;
                }
            } else if (!this.zzkM.equals(com_google_android_gms_internal_zzaj_zzf.zzkM)) {
                return false;
            }
            if (this.zzkN == null) {
                if (com_google_android_gms_internal_zzaj_zzf.zzkN != null) {
                    return false;
                }
            } else if (!this.zzkN.equals(com_google_android_gms_internal_zzaj_zzf.zzkN)) {
                return false;
            }
            if (this.version == null) {
                if (com_google_android_gms_internal_zzaj_zzf.version != null) {
                    return false;
                }
            } else if (!this.version.equals(com_google_android_gms_internal_zzaj_zzf.version)) {
                return false;
            }
            if (this.zzkO == null) {
                if (com_google_android_gms_internal_zzaj_zzf.zzkO != null) {
                    return false;
                }
            } else if (!this.zzkO.equals(com_google_android_gms_internal_zzaj_zzf.zzkO)) {
                return false;
            }
            return (Float.floatToIntBits(this.zzkP) == Float.floatToIntBits(com_google_android_gms_internal_zzaj_zzf.zzkP) && this.zzkQ == com_google_android_gms_internal_zzaj_zzf.zzkQ && zzbxr.equals(this.zzkR, com_google_android_gms_internal_zzaj_zzf.zzkR) && this.zzkS == com_google_android_gms_internal_zzaj_zzf.zzkS) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzf.zzcuA == null || com_google_android_gms_internal_zzaj_zzf.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzf.zzcuA) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((this.zzkQ ? 1231 : 1237) + (((((this.zzkO == null ? 0 : this.zzkO.hashCode()) + (((this.version == null ? 0 : this.version.hashCode()) + (((this.zzkN == null ? 0 : this.zzkN.hashCode()) + (((this.zzkM == null ? 0 : this.zzkM.hashCode()) + (((this.zzkL == null ? 0 : this.zzkL.hashCode()) + ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzkD)) * 31) + zzbxr.hashCode(this.zzkE)) * 31) + zzbxr.hashCode(this.zzkF)) * 31) + zzbxr.hashCode(this.zzkG)) * 31) + zzbxr.hashCode(this.zzkH)) * 31) + zzbxr.hashCode(this.zzkI)) * 31) + zzbxr.hashCode(this.zzkJ)) * 31) + zzbxr.hashCode(this.zzkK)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + Float.floatToIntBits(this.zzkP)) * 31)) * 31) + zzbxr.hashCode(this.zzkR)) * 31) + this.zzkS) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public zzf zzE() {
            this.zzkD = zzbxw.zzcuT;
            this.zzkE = zzbxw.zzcuT;
            this.zzkF = com.google.android.gms.internal.zzak.zza.zzL();
            this.zzkG = zze.zzC();
            this.zzkH = zzb.zzx();
            this.zzkI = zzb.zzx();
            this.zzkJ = zzb.zzx();
            this.zzkK = zzg.zzF();
            this.zzkL = "";
            this.zzkM = "";
            this.zzkN = "0";
            this.version = "";
            this.zzkO = null;
            this.zzkP = 0.0f;
            this.zzkQ = false;
            this.zzkR = zzbxw.zzcuT;
            this.zzkS = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzkE != null && this.zzkE.length > 0) {
                for (String str : this.zzkE) {
                    if (str != null) {
                        com_google_android_gms_internal_zzbxm.zzq(1, str);
                    }
                }
            }
            if (this.zzkF != null && this.zzkF.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzkF) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(2, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (this.zzkG != null && this.zzkG.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt2 : this.zzkG) {
                    if (com_google_android_gms_internal_zzbxt2 != null) {
                        com_google_android_gms_internal_zzbxm.zza(3, com_google_android_gms_internal_zzbxt2);
                    }
                }
            }
            if (this.zzkH != null && this.zzkH.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt22 : this.zzkH) {
                    if (com_google_android_gms_internal_zzbxt22 != null) {
                        com_google_android_gms_internal_zzbxm.zza(4, com_google_android_gms_internal_zzbxt22);
                    }
                }
            }
            if (this.zzkI != null && this.zzkI.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt222 : this.zzkI) {
                    if (com_google_android_gms_internal_zzbxt222 != null) {
                        com_google_android_gms_internal_zzbxm.zza(5, com_google_android_gms_internal_zzbxt222);
                    }
                }
            }
            if (this.zzkJ != null && this.zzkJ.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt2222 : this.zzkJ) {
                    if (com_google_android_gms_internal_zzbxt2222 != null) {
                        com_google_android_gms_internal_zzbxm.zza(6, com_google_android_gms_internal_zzbxt2222);
                    }
                }
            }
            if (this.zzkK != null && this.zzkK.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt22222 : this.zzkK) {
                    if (com_google_android_gms_internal_zzbxt22222 != null) {
                        com_google_android_gms_internal_zzbxm.zza(7, com_google_android_gms_internal_zzbxt22222);
                    }
                }
            }
            if (!(this.zzkL == null || this.zzkL.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(9, this.zzkL);
            }
            if (!(this.zzkM == null || this.zzkM.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(10, this.zzkM);
            }
            if (!(this.zzkN == null || this.zzkN.equals("0"))) {
                com_google_android_gms_internal_zzbxm.zzq(12, this.zzkN);
            }
            if (!(this.version == null || this.version.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(13, this.version);
            }
            if (this.zzkO != null) {
                com_google_android_gms_internal_zzbxm.zza(14, this.zzkO);
            }
            if (Float.floatToIntBits(this.zzkP) != Float.floatToIntBits(0.0f)) {
                com_google_android_gms_internal_zzbxm.zzc(15, this.zzkP);
            }
            if (this.zzkR != null && this.zzkR.length > 0) {
                for (String str2 : this.zzkR) {
                    if (str2 != null) {
                        com_google_android_gms_internal_zzbxm.zzq(16, str2);
                    }
                }
            }
            if (this.zzkS != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(17, this.zzkS);
            }
            if (this.zzkQ) {
                com_google_android_gms_internal_zzbxm.zzg(18, this.zzkQ);
            }
            if (this.zzkD != null && this.zzkD.length > 0) {
                while (i < this.zzkD.length) {
                    String str3 = this.zzkD[i];
                    if (str3 != null) {
                        com_google_android_gms_internal_zzbxm.zzq(19, str3);
                    }
                    i++;
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzs(com_google_android_gms_internal_zzbxl);
        }

        public zzf zzs(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 10);
                        zzaen = this.zzkE == null ? 0 : this.zzkE.length;
                        obj = new String[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkE, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                        this.zzkE = obj;
                        continue;
                    case 18:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 18);
                        zzaen = this.zzkF == null ? 0 : this.zzkF.length;
                        obj = new com.google.android.gms.internal.zzak.zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkF, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new com.google.android.gms.internal.zzak.zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new com.google.android.gms.internal.zzak.zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkF = obj;
                        continue;
                    case 26:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 26);
                        zzaen = this.zzkG == null ? 0 : this.zzkG.length;
                        obj = new zze[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkG, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zze();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zze();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkG = obj;
                        continue;
                    case 34:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 34);
                        zzaen = this.zzkH == null ? 0 : this.zzkH.length;
                        obj = new zzb[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkH, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzb();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzb();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkH = obj;
                        continue;
                    case 42:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 42);
                        zzaen = this.zzkI == null ? 0 : this.zzkI.length;
                        obj = new zzb[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkI, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzb();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzb();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkI = obj;
                        continue;
                    case 50:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 50);
                        zzaen = this.zzkJ == null ? 0 : this.zzkJ.length;
                        obj = new zzb[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkJ, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzb();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzb();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkJ = obj;
                        continue;
                    case 58:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 58);
                        zzaen = this.zzkK == null ? 0 : this.zzkK.length;
                        obj = new zzg[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkK, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzg();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzg();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzkK = obj;
                        continue;
                    case 74:
                        this.zzkL = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 82:
                        this.zzkM = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 98:
                        this.zzkN = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 106:
                        this.version = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 114:
                        if (this.zzkO == null) {
                            this.zzkO = new zza();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzkO);
                        continue;
                    case 125:
                        this.zzkP = com_google_android_gms_internal_zzbxl.readFloat();
                        continue;
                    case TransportMediator.KEYCODE_MEDIA_RECORD /*130*/:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, TransportMediator.KEYCODE_MEDIA_RECORD);
                        zzaen = this.zzkR == null ? 0 : this.zzkR.length;
                        obj = new String[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkR, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                        this.zzkR = obj;
                        continue;
                    case 136:
                        this.zzkS = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 144:
                        this.zzkQ = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 154:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 154);
                        zzaen = this.zzkD == null ? 0 : this.zzkD.length;
                        obj = new String[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkD, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                        this.zzkD = obj;
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            int zzu = super.zzu();
            if (this.zzkE == null || this.zzkE.length <= 0) {
                i = zzu;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.zzkE) {
                    if (str != null) {
                        i3++;
                        i2 += zzbxm.zzkb(str);
                    }
                }
                i = (zzu + i2) + (i3 * 1);
            }
            if (this.zzkF != null && this.zzkF.length > 0) {
                i2 = i;
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzkF) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        i2 += zzbxm.zzc(2, com_google_android_gms_internal_zzbxt);
                    }
                }
                i = i2;
            }
            if (this.zzkG != null && this.zzkG.length > 0) {
                i2 = i;
                for (zzbxt com_google_android_gms_internal_zzbxt2 : this.zzkG) {
                    if (com_google_android_gms_internal_zzbxt2 != null) {
                        i2 += zzbxm.zzc(3, com_google_android_gms_internal_zzbxt2);
                    }
                }
                i = i2;
            }
            if (this.zzkH != null && this.zzkH.length > 0) {
                i2 = i;
                for (zzbxt com_google_android_gms_internal_zzbxt22 : this.zzkH) {
                    if (com_google_android_gms_internal_zzbxt22 != null) {
                        i2 += zzbxm.zzc(4, com_google_android_gms_internal_zzbxt22);
                    }
                }
                i = i2;
            }
            if (this.zzkI != null && this.zzkI.length > 0) {
                i2 = i;
                for (zzbxt com_google_android_gms_internal_zzbxt222 : this.zzkI) {
                    if (com_google_android_gms_internal_zzbxt222 != null) {
                        i2 += zzbxm.zzc(5, com_google_android_gms_internal_zzbxt222);
                    }
                }
                i = i2;
            }
            if (this.zzkJ != null && this.zzkJ.length > 0) {
                i2 = i;
                for (zzbxt com_google_android_gms_internal_zzbxt2222 : this.zzkJ) {
                    if (com_google_android_gms_internal_zzbxt2222 != null) {
                        i2 += zzbxm.zzc(6, com_google_android_gms_internal_zzbxt2222);
                    }
                }
                i = i2;
            }
            if (this.zzkK != null && this.zzkK.length > 0) {
                i2 = i;
                for (zzbxt com_google_android_gms_internal_zzbxt22222 : this.zzkK) {
                    if (com_google_android_gms_internal_zzbxt22222 != null) {
                        i2 += zzbxm.zzc(7, com_google_android_gms_internal_zzbxt22222);
                    }
                }
                i = i2;
            }
            if (!(this.zzkL == null || this.zzkL.equals(""))) {
                i += zzbxm.zzr(9, this.zzkL);
            }
            if (!(this.zzkM == null || this.zzkM.equals(""))) {
                i += zzbxm.zzr(10, this.zzkM);
            }
            if (!(this.zzkN == null || this.zzkN.equals("0"))) {
                i += zzbxm.zzr(12, this.zzkN);
            }
            if (!(this.version == null || this.version.equals(""))) {
                i += zzbxm.zzr(13, this.version);
            }
            if (this.zzkO != null) {
                i += zzbxm.zzc(14, this.zzkO);
            }
            if (Float.floatToIntBits(this.zzkP) != Float.floatToIntBits(0.0f)) {
                i += zzbxm.zzd(15, this.zzkP);
            }
            if (this.zzkR != null && this.zzkR.length > 0) {
                i3 = 0;
                zzu = 0;
                for (String str2 : this.zzkR) {
                    if (str2 != null) {
                        zzu++;
                        i3 += zzbxm.zzkb(str2);
                    }
                }
                i = (i + i3) + (zzu * 2);
            }
            if (this.zzkS != 0) {
                i += zzbxm.zzL(17, this.zzkS);
            }
            if (this.zzkQ) {
                i += zzbxm.zzh(18, this.zzkQ);
            }
            if (this.zzkD == null || this.zzkD.length <= 0) {
                return i;
            }
            i2 = 0;
            i3 = 0;
            while (i4 < this.zzkD.length) {
                String str3 = this.zzkD[i4];
                if (str3 != null) {
                    i3++;
                    i2 += zzbxm.zzkb(str3);
                }
                i4++;
            }
            return (i + i2) + (i3 * 2);
        }
    }

    public static final class zzg extends zzbxn<zzg> {
        private static volatile zzg[] zzkT;
        public int[] zzkU;
        public int[] zzkV;
        public int[] zzkW;
        public int[] zzkX;
        public int[] zzkY;
        public int[] zzkZ;
        public int[] zzla;
        public int[] zzlb;
        public int[] zzlc;
        public int[] zzld;

        public zzg() {
            zzG();
        }

        public static zzg[] zzF() {
            if (zzkT == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzkT == null) {
                        zzkT = new zzg[0];
                    }
                }
            }
            return zzkT;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzg)) {
                return false;
            }
            zzg com_google_android_gms_internal_zzaj_zzg = (zzg) obj;
            return (zzbxr.equals(this.zzkU, com_google_android_gms_internal_zzaj_zzg.zzkU) && zzbxr.equals(this.zzkV, com_google_android_gms_internal_zzaj_zzg.zzkV) && zzbxr.equals(this.zzkW, com_google_android_gms_internal_zzaj_zzg.zzkW) && zzbxr.equals(this.zzkX, com_google_android_gms_internal_zzaj_zzg.zzkX) && zzbxr.equals(this.zzkY, com_google_android_gms_internal_zzaj_zzg.zzkY) && zzbxr.equals(this.zzkZ, com_google_android_gms_internal_zzaj_zzg.zzkZ) && zzbxr.equals(this.zzla, com_google_android_gms_internal_zzaj_zzg.zzla) && zzbxr.equals(this.zzlb, com_google_android_gms_internal_zzaj_zzg.zzlb) && zzbxr.equals(this.zzlc, com_google_android_gms_internal_zzaj_zzg.zzlc) && zzbxr.equals(this.zzld, com_google_android_gms_internal_zzaj_zzg.zzld)) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzg.zzcuA == null || com_google_android_gms_internal_zzaj_zzg.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzg.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzkU)) * 31) + zzbxr.hashCode(this.zzkV)) * 31) + zzbxr.hashCode(this.zzkW)) * 31) + zzbxr.hashCode(this.zzkX)) * 31) + zzbxr.hashCode(this.zzkY)) * 31) + zzbxr.hashCode(this.zzkZ)) * 31) + zzbxr.hashCode(this.zzla)) * 31) + zzbxr.hashCode(this.zzlb)) * 31) + zzbxr.hashCode(this.zzlc)) * 31) + zzbxr.hashCode(this.zzld)) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public zzg zzG() {
            this.zzkU = zzbxw.zzcuO;
            this.zzkV = zzbxw.zzcuO;
            this.zzkW = zzbxw.zzcuO;
            this.zzkX = zzbxw.zzcuO;
            this.zzkY = zzbxw.zzcuO;
            this.zzkZ = zzbxw.zzcuO;
            this.zzla = zzbxw.zzcuO;
            this.zzlb = zzbxw.zzcuO;
            this.zzlc = zzbxw.zzcuO;
            this.zzld = zzbxw.zzcuO;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzkU != null && this.zzkU.length > 0) {
                for (int zzJ : this.zzkU) {
                    com_google_android_gms_internal_zzbxm.zzJ(1, zzJ);
                }
            }
            if (this.zzkV != null && this.zzkV.length > 0) {
                for (int zzJ2 : this.zzkV) {
                    com_google_android_gms_internal_zzbxm.zzJ(2, zzJ2);
                }
            }
            if (this.zzkW != null && this.zzkW.length > 0) {
                for (int zzJ22 : this.zzkW) {
                    com_google_android_gms_internal_zzbxm.zzJ(3, zzJ22);
                }
            }
            if (this.zzkX != null && this.zzkX.length > 0) {
                for (int zzJ222 : this.zzkX) {
                    com_google_android_gms_internal_zzbxm.zzJ(4, zzJ222);
                }
            }
            if (this.zzkY != null && this.zzkY.length > 0) {
                for (int zzJ2222 : this.zzkY) {
                    com_google_android_gms_internal_zzbxm.zzJ(5, zzJ2222);
                }
            }
            if (this.zzkZ != null && this.zzkZ.length > 0) {
                for (int zzJ22222 : this.zzkZ) {
                    com_google_android_gms_internal_zzbxm.zzJ(6, zzJ22222);
                }
            }
            if (this.zzla != null && this.zzla.length > 0) {
                for (int zzJ222222 : this.zzla) {
                    com_google_android_gms_internal_zzbxm.zzJ(7, zzJ222222);
                }
            }
            if (this.zzlb != null && this.zzlb.length > 0) {
                for (int zzJ2222222 : this.zzlb) {
                    com_google_android_gms_internal_zzbxm.zzJ(8, zzJ2222222);
                }
            }
            if (this.zzlc != null && this.zzlc.length > 0) {
                for (int zzJ22222222 : this.zzlc) {
                    com_google_android_gms_internal_zzbxm.zzJ(9, zzJ22222222);
                }
            }
            if (this.zzld != null && this.zzld.length > 0) {
                while (i < this.zzld.length) {
                    com_google_android_gms_internal_zzbxm.zzJ(10, this.zzld[i]);
                    i++;
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzt(com_google_android_gms_internal_zzbxl);
        }

        public zzg zzt(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                int zzqZ;
                Object obj2;
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 8);
                        zzaen = this.zzkU == null ? 0 : this.zzkU.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkU, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkU = obj;
                        continue;
                    case 10:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkU == null ? 0 : this.zzkU.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkU, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkU = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 16:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 16);
                        zzaen = this.zzkV == null ? 0 : this.zzkV.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkV, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkV = obj;
                        continue;
                    case 18:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkV == null ? 0 : this.zzkV.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkV, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkV = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 24:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 24);
                        zzaen = this.zzkW == null ? 0 : this.zzkW.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkW, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkW = obj;
                        continue;
                    case 26:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkW == null ? 0 : this.zzkW.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkW, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkW = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 32:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 32);
                        zzaen = this.zzkX == null ? 0 : this.zzkX.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkX, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkX = obj;
                        continue;
                    case 34:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkX == null ? 0 : this.zzkX.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkX, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkX = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 40:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 40);
                        zzaen = this.zzkY == null ? 0 : this.zzkY.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkY, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkY = obj;
                        continue;
                    case 42:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkY == null ? 0 : this.zzkY.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkY, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkY = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 48:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 48);
                        zzaen = this.zzkZ == null ? 0 : this.zzkZ.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzkZ, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzkZ = obj;
                        continue;
                    case 50:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzkZ == null ? 0 : this.zzkZ.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzkZ, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzkZ = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 56:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 56);
                        zzaen = this.zzla == null ? 0 : this.zzla.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzla, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzla = obj;
                        continue;
                    case 58:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzla == null ? 0 : this.zzla.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzla, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzla = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 64:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 64);
                        zzaen = this.zzlb == null ? 0 : this.zzlb.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlb, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzlb = obj;
                        continue;
                    case 66:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzlb == null ? 0 : this.zzlb.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzlb, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzlb = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 72:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 72);
                        zzaen = this.zzlc == null ? 0 : this.zzlc.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlc, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzlc = obj;
                        continue;
                    case 74:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzlc == null ? 0 : this.zzlc.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzlc, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzlc = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 80:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 80);
                        zzaen = this.zzld == null ? 0 : this.zzld.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzld, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzld = obj;
                        continue;
                    case 82:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzld == null ? 0 : this.zzld.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzld, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzld = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        protected int zzu() {
            int i;
            int i2;
            int i3 = 0;
            int zzu = super.zzu();
            if (this.zzkU == null || this.zzkU.length <= 0) {
                i = zzu;
            } else {
                i2 = 0;
                for (int zzrf : this.zzkU) {
                    i2 += zzbxm.zzrf(zzrf);
                }
                i = (zzu + i2) + (this.zzkU.length * 1);
            }
            if (this.zzkV != null && this.zzkV.length > 0) {
                zzu = 0;
                for (int zzrf2 : this.zzkV) {
                    zzu += zzbxm.zzrf(zzrf2);
                }
                i = (i + zzu) + (this.zzkV.length * 1);
            }
            if (this.zzkW != null && this.zzkW.length > 0) {
                zzu = 0;
                for (int zzrf22 : this.zzkW) {
                    zzu += zzbxm.zzrf(zzrf22);
                }
                i = (i + zzu) + (this.zzkW.length * 1);
            }
            if (this.zzkX != null && this.zzkX.length > 0) {
                zzu = 0;
                for (int zzrf222 : this.zzkX) {
                    zzu += zzbxm.zzrf(zzrf222);
                }
                i = (i + zzu) + (this.zzkX.length * 1);
            }
            if (this.zzkY != null && this.zzkY.length > 0) {
                zzu = 0;
                for (int zzrf2222 : this.zzkY) {
                    zzu += zzbxm.zzrf(zzrf2222);
                }
                i = (i + zzu) + (this.zzkY.length * 1);
            }
            if (this.zzkZ != null && this.zzkZ.length > 0) {
                zzu = 0;
                for (int zzrf22222 : this.zzkZ) {
                    zzu += zzbxm.zzrf(zzrf22222);
                }
                i = (i + zzu) + (this.zzkZ.length * 1);
            }
            if (this.zzla != null && this.zzla.length > 0) {
                zzu = 0;
                for (int zzrf222222 : this.zzla) {
                    zzu += zzbxm.zzrf(zzrf222222);
                }
                i = (i + zzu) + (this.zzla.length * 1);
            }
            if (this.zzlb != null && this.zzlb.length > 0) {
                zzu = 0;
                for (int zzrf2222222 : this.zzlb) {
                    zzu += zzbxm.zzrf(zzrf2222222);
                }
                i = (i + zzu) + (this.zzlb.length * 1);
            }
            if (this.zzlc != null && this.zzlc.length > 0) {
                zzu = 0;
                for (int zzrf22222222 : this.zzlc) {
                    zzu += zzbxm.zzrf(zzrf22222222);
                }
                i = (i + zzu) + (this.zzlc.length * 1);
            }
            if (this.zzld == null || this.zzld.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.zzld.length) {
                i2 += zzbxm.zzrf(this.zzld[i3]);
                i3++;
            }
            return (i + i2) + (this.zzld.length * 1);
        }
    }

    public static final class zzh extends zzbxn<zzh> {
        public static final zzbxo<com.google.android.gms.internal.zzak.zza, zzh> zzle = zzbxo.zza(11, zzh.class, 810);
        private static final zzh[] zzlf = new zzh[0];
        public int[] zzlg;
        public int[] zzlh;
        public int[] zzli;
        public int zzlj;
        public int[] zzlk;
        public int zzll;
        public int zzlm;

        public zzh() {
            zzH();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzh)) {
                return false;
            }
            zzh com_google_android_gms_internal_zzaj_zzh = (zzh) obj;
            return (zzbxr.equals(this.zzlg, com_google_android_gms_internal_zzaj_zzh.zzlg) && zzbxr.equals(this.zzlh, com_google_android_gms_internal_zzaj_zzh.zzlh) && zzbxr.equals(this.zzli, com_google_android_gms_internal_zzaj_zzh.zzli) && this.zzlj == com_google_android_gms_internal_zzaj_zzh.zzlj && zzbxr.equals(this.zzlk, com_google_android_gms_internal_zzaj_zzh.zzlk) && this.zzll == com_google_android_gms_internal_zzaj_zzh.zzll && this.zzlm == com_google_android_gms_internal_zzaj_zzh.zzlm) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzh.zzcuA == null || com_google_android_gms_internal_zzaj_zzh.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzh.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzlg)) * 31) + zzbxr.hashCode(this.zzlh)) * 31) + zzbxr.hashCode(this.zzli)) * 31) + this.zzlj) * 31) + zzbxr.hashCode(this.zzlk)) * 31) + this.zzll) * 31) + this.zzlm) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public zzh zzH() {
            this.zzlg = zzbxw.zzcuO;
            this.zzlh = zzbxw.zzcuO;
            this.zzli = zzbxw.zzcuO;
            this.zzlj = 0;
            this.zzlk = zzbxw.zzcuO;
            this.zzll = 0;
            this.zzlm = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzlg != null && this.zzlg.length > 0) {
                for (int zzJ : this.zzlg) {
                    com_google_android_gms_internal_zzbxm.zzJ(1, zzJ);
                }
            }
            if (this.zzlh != null && this.zzlh.length > 0) {
                for (int zzJ2 : this.zzlh) {
                    com_google_android_gms_internal_zzbxm.zzJ(2, zzJ2);
                }
            }
            if (this.zzli != null && this.zzli.length > 0) {
                for (int zzJ22 : this.zzli) {
                    com_google_android_gms_internal_zzbxm.zzJ(3, zzJ22);
                }
            }
            if (this.zzlj != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(4, this.zzlj);
            }
            if (this.zzlk != null && this.zzlk.length > 0) {
                while (i < this.zzlk.length) {
                    com_google_android_gms_internal_zzbxm.zzJ(5, this.zzlk[i]);
                    i++;
                }
            }
            if (this.zzll != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(6, this.zzll);
            }
            if (this.zzlm != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(7, this.zzlm);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzu(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int i;
            int i2;
            int i3 = 0;
            int zzu = super.zzu();
            if (this.zzlg == null || this.zzlg.length <= 0) {
                i = zzu;
            } else {
                i2 = 0;
                for (int zzrf : this.zzlg) {
                    i2 += zzbxm.zzrf(zzrf);
                }
                i = (zzu + i2) + (this.zzlg.length * 1);
            }
            if (this.zzlh != null && this.zzlh.length > 0) {
                zzu = 0;
                for (int zzrf2 : this.zzlh) {
                    zzu += zzbxm.zzrf(zzrf2);
                }
                i = (i + zzu) + (this.zzlh.length * 1);
            }
            if (this.zzli != null && this.zzli.length > 0) {
                zzu = 0;
                for (int zzrf22 : this.zzli) {
                    zzu += zzbxm.zzrf(zzrf22);
                }
                i = (i + zzu) + (this.zzli.length * 1);
            }
            if (this.zzlj != 0) {
                i += zzbxm.zzL(4, this.zzlj);
            }
            if (this.zzlk != null && this.zzlk.length > 0) {
                i2 = 0;
                while (i3 < this.zzlk.length) {
                    i2 += zzbxm.zzrf(this.zzlk[i3]);
                    i3++;
                }
                i = (i + i2) + (this.zzlk.length * 1);
            }
            if (this.zzll != 0) {
                i += zzbxm.zzL(6, this.zzll);
            }
            return this.zzlm != 0 ? i + zzbxm.zzL(7, this.zzlm) : i;
        }

        public zzh zzu(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                int zzqZ;
                Object obj2;
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 8);
                        zzaen = this.zzlg == null ? 0 : this.zzlg.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlg, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzlg = obj;
                        continue;
                    case 10:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzlg == null ? 0 : this.zzlg.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzlg, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzlg = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 16:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 16);
                        zzaen = this.zzlh == null ? 0 : this.zzlh.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlh, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzlh = obj;
                        continue;
                    case 18:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzlh == null ? 0 : this.zzlh.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzlh, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzlh = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 24:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 24);
                        zzaen = this.zzli == null ? 0 : this.zzli.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzli, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzli = obj;
                        continue;
                    case 26:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzli == null ? 0 : this.zzli.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzli, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzli = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 32:
                        this.zzlj = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 40:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 40);
                        zzaen = this.zzlk == null ? 0 : this.zzlk.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlk, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzlk = obj;
                        continue;
                    case 42:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzlk == null ? 0 : this.zzlk.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzlk, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzlk = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 48:
                        this.zzll = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 56:
                        this.zzlm = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }
    }

    public static final class zzi extends zzbxn<zzi> {
        private static volatile zzi[] zzln;
        public String name;
        public com.google.android.gms.internal.zzak.zza zzlo;
        public zzd zzlp;

        public zzi() {
            zzJ();
        }

        public static zzi[] zzI() {
            if (zzln == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzln == null) {
                        zzln = new zzi[0];
                    }
                }
            }
            return zzln;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzi)) {
                return false;
            }
            zzi com_google_android_gms_internal_zzaj_zzi = (zzi) obj;
            if (this.name == null) {
                if (com_google_android_gms_internal_zzaj_zzi.name != null) {
                    return false;
                }
            } else if (!this.name.equals(com_google_android_gms_internal_zzaj_zzi.name)) {
                return false;
            }
            if (this.zzlo == null) {
                if (com_google_android_gms_internal_zzaj_zzi.zzlo != null) {
                    return false;
                }
            } else if (!this.zzlo.equals(com_google_android_gms_internal_zzaj_zzi.zzlo)) {
                return false;
            }
            if (this.zzlp == null) {
                if (com_google_android_gms_internal_zzaj_zzi.zzlp != null) {
                    return false;
                }
            } else if (!this.zzlp.equals(com_google_android_gms_internal_zzaj_zzi.zzlp)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzi.zzcuA == null || com_google_android_gms_internal_zzaj_zzi.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzi.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzlp == null ? 0 : this.zzlp.hashCode()) + (((this.zzlo == null ? 0 : this.zzlo.hashCode()) + (((this.name == null ? 0 : this.name.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public zzi zzJ() {
            this.name = "";
            this.zzlo = null;
            this.zzlp = null;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.name == null || this.name.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.name);
            }
            if (this.zzlo != null) {
                com_google_android_gms_internal_zzbxm.zza(2, this.zzlo);
            }
            if (this.zzlp != null) {
                com_google_android_gms_internal_zzbxm.zza(3, this.zzlp);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzv(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (!(this.name == null || this.name.equals(""))) {
                zzu += zzbxm.zzr(1, this.name);
            }
            if (this.zzlo != null) {
                zzu += zzbxm.zzc(2, this.zzlo);
            }
            return this.zzlp != null ? zzu + zzbxm.zzc(3, this.zzlp) : zzu;
        }

        public zzi zzv(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        this.name = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 18:
                        if (this.zzlo == null) {
                            this.zzlo = new com.google.android.gms.internal.zzak.zza();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzlo);
                        continue;
                    case 26:
                        if (this.zzlp == null) {
                            this.zzlp = new zzd();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzlp);
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }
    }

    public static final class zzj extends zzbxn<zzj> {
        public zzi[] zzlq;
        public zzf zzlr;
        public String zzls;

        public zzj() {
            zzK();
        }

        public static zzj zzg(byte[] bArr) throws zzbxs {
            return (zzj) zzbxt.zza(new zzj(), bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzj)) {
                return false;
            }
            zzj com_google_android_gms_internal_zzaj_zzj = (zzj) obj;
            if (!zzbxr.equals(this.zzlq, com_google_android_gms_internal_zzaj_zzj.zzlq)) {
                return false;
            }
            if (this.zzlr == null) {
                if (com_google_android_gms_internal_zzaj_zzj.zzlr != null) {
                    return false;
                }
            } else if (!this.zzlr.equals(com_google_android_gms_internal_zzaj_zzj.zzlr)) {
                return false;
            }
            if (this.zzls == null) {
                if (com_google_android_gms_internal_zzaj_zzj.zzls != null) {
                    return false;
                }
            } else if (!this.zzls.equals(com_google_android_gms_internal_zzaj_zzj.zzls)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzaj_zzj.zzcuA == null || com_google_android_gms_internal_zzaj_zzj.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzaj_zzj.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzls == null ? 0 : this.zzls.hashCode()) + (((this.zzlr == null ? 0 : this.zzlr.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzlq)) * 31)) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public zzj zzK() {
            this.zzlq = zzi.zzI();
            this.zzlr = null;
            this.zzls = "";
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzlq != null && this.zzlq.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzlq) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(1, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (this.zzlr != null) {
                com_google_android_gms_internal_zzbxm.zza(2, this.zzlr);
            }
            if (!(this.zzls == null || this.zzls.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(3, this.zzls);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzw(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzlq != null && this.zzlq.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzlq) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        zzu += zzbxm.zzc(1, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (this.zzlr != null) {
                zzu += zzbxm.zzc(2, this.zzlr);
            }
            return (this.zzls == null || this.zzls.equals("")) ? zzu : zzu + zzbxm.zzr(3, this.zzls);
        }

        public zzj zzw(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        int zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 10);
                        zzaen = this.zzlq == null ? 0 : this.zzlq.length;
                        Object obj = new zzi[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlq, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzi();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzi();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzlq = obj;
                        continue;
                    case 18:
                        if (this.zzlr == null) {
                            this.zzlr = new zzf();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzlr);
                        continue;
                    case 26:
                        this.zzls = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }
    }
}
