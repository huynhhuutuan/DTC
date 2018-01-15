package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

public interface zzbts {

    public static final class zza extends zzbxn<zza> {
        public long timestamp;
        public zzd[] zzcmi;
        public byte[][] zzcmj;

        public zza() {
            zzack();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzbts_zza = (zza) obj;
            return (zzbxr.equals(this.zzcmi, com_google_android_gms_internal_zzbts_zza.zzcmi) && this.timestamp == com_google_android_gms_internal_zzbts_zza.timestamp && zzbxr.zza(this.zzcmj, com_google_android_gms_internal_zzbts_zza.zzcmj)) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbts_zza.zzcuA == null || com_google_android_gms_internal_zzbts_zza.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbts_zza.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzcmi)) * 31) + ((int) (this.timestamp ^ (this.timestamp >>> 32)))) * 31) + zzbxr.zzb(this.zzcmj)) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzcmi != null && this.zzcmi.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcmi) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(1, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (this.timestamp != 0) {
                com_google_android_gms_internal_zzbxm.zzc(2, this.timestamp);
            }
            if (this.zzcmj != null && this.zzcmj.length > 0) {
                while (i < this.zzcmj.length) {
                    byte[] bArr = this.zzcmj[i];
                    if (bArr != null) {
                        com_google_android_gms_internal_zzbxm.zzb(3, bArr);
                    }
                    i++;
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zza zzac(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 10);
                        zzaen = this.zzcmi == null ? 0 : this.zzcmi.length;
                        obj = new zzd[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcmi, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzd();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzd();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzcmi = obj;
                        continue;
                    case 17:
                        this.timestamp = com_google_android_gms_internal_zzbxl.zzaes();
                        continue;
                    case 26:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 26);
                        zzaen = this.zzcmj == null ? 0 : this.zzcmj.length;
                        obj = new byte[(zzb + zzaen)][];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcmj, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readBytes();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readBytes();
                        this.zzcmj = obj;
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

        public zza zzack() {
            this.zzcmi = zzd.zzaco();
            this.timestamp = 0;
            this.zzcmj = zzbxw.zzcuU;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzac(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int i;
            int i2 = 0;
            int zzu = super.zzu();
            if (this.zzcmi != null && this.zzcmi.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcmi) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        i += zzbxm.zzc(1, com_google_android_gms_internal_zzbxt);
                    }
                }
                zzu = i;
            }
            if (this.timestamp != 0) {
                zzu += zzbxm.zzg(2, this.timestamp);
            }
            if (this.zzcmj == null || this.zzcmj.length <= 0) {
                return zzu;
            }
            i = 0;
            int i3 = 0;
            while (i2 < this.zzcmj.length) {
                byte[] bArr = this.zzcmj[i2];
                if (bArr != null) {
                    i3++;
                    i += zzbxm.zzai(bArr);
                }
                i2++;
            }
            return (zzu + i) + (i3 * 1);
        }
    }

    public static final class zzb extends zzbxn<zzb> {
        private static volatile zzb[] zzcmk;
        public String zzaB;
        public byte[] zzcml;

        public zzb() {
            zzacm();
        }

        public static zzb[] zzacl() {
            if (zzcmk == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzcmk == null) {
                        zzcmk = new zzb[0];
                    }
                }
            }
            return zzcmk;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzbts_zzb = (zzb) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzbts_zzb.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzbts_zzb.zzaB)) {
                return false;
            }
            return Arrays.equals(this.zzcml, com_google_android_gms_internal_zzbts_zzb.zzcml) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbts_zzb.zzcuA == null || com_google_android_gms_internal_zzbts_zzb.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbts_zzb.zzcuA) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + Arrays.hashCode(this.zzcml)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.zzaB == null || this.zzaB.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzaB);
            }
            if (!Arrays.equals(this.zzcml, zzbxw.zzcuV)) {
                com_google_android_gms_internal_zzbxm.zzb(2, this.zzcml);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzb zzacm() {
            this.zzaB = "";
            this.zzcml = zzbxw.zzcuV;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzb zzad(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        this.zzaB = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 18:
                        this.zzcml = com_google_android_gms_internal_zzbxl.readBytes();
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

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzad(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (!(this.zzaB == null || this.zzaB.equals(""))) {
                zzu += zzbxm.zzr(1, this.zzaB);
            }
            return !Arrays.equals(this.zzcml, zzbxw.zzcuV) ? zzu + zzbxm.zzc(2, this.zzcml) : zzu;
        }
    }

    public static final class zzc extends zzbxn<zzc> {
        public int zzcmm;
        public boolean zzcmn;
        public long zzcmo;

        public zzc() {
            zzacn();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzbts_zzc = (zzc) obj;
            return (this.zzcmm == com_google_android_gms_internal_zzbts_zzc.zzcmm && this.zzcmn == com_google_android_gms_internal_zzbts_zzc.zzcmn && this.zzcmo == com_google_android_gms_internal_zzbts_zzc.zzcmo) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbts_zzc.zzcuA == null || com_google_android_gms_internal_zzbts_zzc.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbts_zzc.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = ((((this.zzcmn ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.zzcmm) * 31)) * 31) + ((int) (this.zzcmo ^ (this.zzcmo >>> 32)))) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzcmm != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(1, this.zzcmm);
            }
            if (this.zzcmn) {
                com_google_android_gms_internal_zzbxm.zzg(2, this.zzcmn);
            }
            if (this.zzcmo != 0) {
                com_google_android_gms_internal_zzbxm.zzc(3, this.zzcmo);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzc zzacn() {
            this.zzcmm = 0;
            this.zzcmn = false;
            this.zzcmo = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzc zzae(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.zzcmm = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 16:
                        this.zzcmn = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 25:
                        this.zzcmo = com_google_android_gms_internal_zzbxl.zzaes();
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

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzae(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzcmm != 0) {
                zzu += zzbxm.zzL(1, this.zzcmm);
            }
            if (this.zzcmn) {
                zzu += zzbxm.zzh(2, this.zzcmn);
            }
            return this.zzcmo != 0 ? zzu + zzbxm.zzg(3, this.zzcmo) : zzu;
        }
    }

    public static final class zzd extends zzbxn<zzd> {
        private static volatile zzd[] zzcmp;
        public String zzaGP;
        public zzb[] zzcmq;

        public zzd() {
            zzacp();
        }

        public static zzd[] zzaco() {
            if (zzcmp == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzcmp == null) {
                        zzcmp = new zzd[0];
                    }
                }
            }
            return zzcmp;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzbts_zzd = (zzd) obj;
            if (this.zzaGP == null) {
                if (com_google_android_gms_internal_zzbts_zzd.zzaGP != null) {
                    return false;
                }
            } else if (!this.zzaGP.equals(com_google_android_gms_internal_zzbts_zzd.zzaGP)) {
                return false;
            }
            return zzbxr.equals(this.zzcmq, com_google_android_gms_internal_zzbts_zzd.zzcmq) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbts_zzd.zzcuA == null || com_google_android_gms_internal_zzbts_zzd.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbts_zzd.zzcuA) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzaGP == null ? 0 : this.zzaGP.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + zzbxr.hashCode(this.zzcmq)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.zzaGP == null || this.zzaGP.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzaGP);
            }
            if (this.zzcmq != null && this.zzcmq.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcmq) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(2, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzd zzacp() {
            this.zzaGP = "";
            this.zzcmq = zzb.zzacl();
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzd zzaf(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        this.zzaGP = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 18:
                        int zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 18);
                        zzaen = this.zzcmq == null ? 0 : this.zzcmq.length;
                        Object obj = new zzb[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcmq, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzb();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzb();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzcmq = obj;
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

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaf(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (!(this.zzaGP == null || this.zzaGP.equals(""))) {
                zzu += zzbxm.zzr(1, this.zzaGP);
            }
            if (this.zzcmq == null || this.zzcmq.length <= 0) {
                return zzu;
            }
            int i = zzu;
            for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcmq) {
                if (com_google_android_gms_internal_zzbxt != null) {
                    i += zzbxm.zzc(2, com_google_android_gms_internal_zzbxt);
                }
            }
            return i;
        }
    }

    public static final class zze extends zzbxn<zze> {
        public zza zzcmr;
        public zza zzcms;
        public zza zzcmt;
        public zzc zzcmu;
        public zzf[] zzcmv;

        public zze() {
            zzacq();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzbts_zze = (zze) obj;
            if (this.zzcmr == null) {
                if (com_google_android_gms_internal_zzbts_zze.zzcmr != null) {
                    return false;
                }
            } else if (!this.zzcmr.equals(com_google_android_gms_internal_zzbts_zze.zzcmr)) {
                return false;
            }
            if (this.zzcms == null) {
                if (com_google_android_gms_internal_zzbts_zze.zzcms != null) {
                    return false;
                }
            } else if (!this.zzcms.equals(com_google_android_gms_internal_zzbts_zze.zzcms)) {
                return false;
            }
            if (this.zzcmt == null) {
                if (com_google_android_gms_internal_zzbts_zze.zzcmt != null) {
                    return false;
                }
            } else if (!this.zzcmt.equals(com_google_android_gms_internal_zzbts_zze.zzcmt)) {
                return false;
            }
            if (this.zzcmu == null) {
                if (com_google_android_gms_internal_zzbts_zze.zzcmu != null) {
                    return false;
                }
            } else if (!this.zzcmu.equals(com_google_android_gms_internal_zzbts_zze.zzcmu)) {
                return false;
            }
            return zzbxr.equals(this.zzcmv, com_google_android_gms_internal_zzbts_zze.zzcmv) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbts_zze.zzcuA == null || com_google_android_gms_internal_zzbts_zze.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbts_zze.zzcuA) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.zzcmu == null ? 0 : this.zzcmu.hashCode()) + (((this.zzcmt == null ? 0 : this.zzcmt.hashCode()) + (((this.zzcms == null ? 0 : this.zzcms.hashCode()) + (((this.zzcmr == null ? 0 : this.zzcmr.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31) + zzbxr.hashCode(this.zzcmv)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzcmr != null) {
                com_google_android_gms_internal_zzbxm.zza(1, this.zzcmr);
            }
            if (this.zzcms != null) {
                com_google_android_gms_internal_zzbxm.zza(2, this.zzcms);
            }
            if (this.zzcmt != null) {
                com_google_android_gms_internal_zzbxm.zza(3, this.zzcmt);
            }
            if (this.zzcmu != null) {
                com_google_android_gms_internal_zzbxm.zza(4, this.zzcmu);
            }
            if (this.zzcmv != null && this.zzcmv.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcmv) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(5, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zze zzacq() {
            this.zzcmr = null;
            this.zzcms = null;
            this.zzcmt = null;
            this.zzcmu = null;
            this.zzcmv = zzf.zzacr();
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zze zzag(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        if (this.zzcmr == null) {
                            this.zzcmr = new zza();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcmr);
                        continue;
                    case 18:
                        if (this.zzcms == null) {
                            this.zzcms = new zza();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcms);
                        continue;
                    case 26:
                        if (this.zzcmt == null) {
                            this.zzcmt = new zza();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcmt);
                        continue;
                    case 34:
                        if (this.zzcmu == null) {
                            this.zzcmu = new zzc();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcmu);
                        continue;
                    case 42:
                        int zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 42);
                        zzaen = this.zzcmv == null ? 0 : this.zzcmv.length;
                        Object obj = new zzf[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcmv, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zzf();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zzf();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzcmv = obj;
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

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzag(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzcmr != null) {
                zzu += zzbxm.zzc(1, this.zzcmr);
            }
            if (this.zzcms != null) {
                zzu += zzbxm.zzc(2, this.zzcms);
            }
            if (this.zzcmt != null) {
                zzu += zzbxm.zzc(3, this.zzcmt);
            }
            if (this.zzcmu != null) {
                zzu += zzbxm.zzc(4, this.zzcmu);
            }
            if (this.zzcmv == null || this.zzcmv.length <= 0) {
                return zzu;
            }
            int i = zzu;
            for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcmv) {
                if (com_google_android_gms_internal_zzbxt != null) {
                    i += zzbxm.zzc(5, com_google_android_gms_internal_zzbxt);
                }
            }
            return i;
        }
    }

    public static final class zzf extends zzbxn<zzf> {
        private static volatile zzf[] zzcmw;
        public int resourceId;
        public String zzaGP;
        public long zzcmx;

        public zzf() {
            zzacs();
        }

        public static zzf[] zzacr() {
            if (zzcmw == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzcmw == null) {
                        zzcmw = new zzf[0];
                    }
                }
            }
            return zzcmw;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzbts_zzf = (zzf) obj;
            if (this.resourceId != com_google_android_gms_internal_zzbts_zzf.resourceId || this.zzcmx != com_google_android_gms_internal_zzbts_zzf.zzcmx) {
                return false;
            }
            if (this.zzaGP == null) {
                if (com_google_android_gms_internal_zzbts_zzf.zzaGP != null) {
                    return false;
                }
            } else if (!this.zzaGP.equals(com_google_android_gms_internal_zzbts_zzf.zzaGP)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbts_zzf.zzcuA == null || com_google_android_gms_internal_zzbts_zzf.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbts_zzf.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzaGP == null ? 0 : this.zzaGP.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.resourceId) * 31) + ((int) (this.zzcmx ^ (this.zzcmx >>> 32)))) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.resourceId != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(1, this.resourceId);
            }
            if (this.zzcmx != 0) {
                com_google_android_gms_internal_zzbxm.zzc(2, this.zzcmx);
            }
            if (!(this.zzaGP == null || this.zzaGP.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(3, this.zzaGP);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzf zzacs() {
            this.resourceId = 0;
            this.zzcmx = 0;
            this.zzaGP = "";
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzf zzah(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.resourceId = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 17:
                        this.zzcmx = com_google_android_gms_internal_zzbxl.zzaes();
                        continue;
                    case 26:
                        this.zzaGP = com_google_android_gms_internal_zzbxl.readString();
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

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzah(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.resourceId != 0) {
                zzu += zzbxm.zzL(1, this.resourceId);
            }
            if (this.zzcmx != 0) {
                zzu += zzbxm.zzg(2, this.zzcmx);
            }
            return (this.zzaGP == null || this.zzaGP.equals("")) ? zzu : zzu + zzbxm.zzr(3, this.zzaGP);
        }
    }
}
