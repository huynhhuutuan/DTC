package com.google.android.gms.internal;

import android.support.v4.media.TransportMediator;
import java.io.IOException;
import java.util.Arrays;

public interface zzbxy {

    public static final class zza extends zzbxn<zza> implements Cloneable {
        public String[] zzcuY;
        public String[] zzcuZ;
        public int[] zzcva;
        public long[] zzcvb;
        public long[] zzcvc;

        public zza() {
            zzaeU();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return zzaeV();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzbxy_zza = (zza) obj;
            return (zzbxr.equals(this.zzcuY, com_google_android_gms_internal_zzbxy_zza.zzcuY) && zzbxr.equals(this.zzcuZ, com_google_android_gms_internal_zzbxy_zza.zzcuZ) && zzbxr.equals(this.zzcva, com_google_android_gms_internal_zzbxy_zza.zzcva) && zzbxr.equals(this.zzcvb, com_google_android_gms_internal_zzbxy_zza.zzcvb) && zzbxr.equals(this.zzcvc, com_google_android_gms_internal_zzbxy_zza.zzcvc)) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbxy_zza.zzcuA == null || com_google_android_gms_internal_zzbxy_zza.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbxy_zza.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzcuY)) * 31) + zzbxr.hashCode(this.zzcuZ)) * 31) + zzbxr.hashCode(this.zzcva)) * 31) + zzbxr.hashCode(this.zzcvb)) * 31) + zzbxr.hashCode(this.zzcvc)) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzcuY != null && this.zzcuY.length > 0) {
                for (String str : this.zzcuY) {
                    if (str != null) {
                        com_google_android_gms_internal_zzbxm.zzq(1, str);
                    }
                }
            }
            if (this.zzcuZ != null && this.zzcuZ.length > 0) {
                for (String str2 : this.zzcuZ) {
                    if (str2 != null) {
                        com_google_android_gms_internal_zzbxm.zzq(2, str2);
                    }
                }
            }
            if (this.zzcva != null && this.zzcva.length > 0) {
                for (int zzJ : this.zzcva) {
                    com_google_android_gms_internal_zzbxm.zzJ(3, zzJ);
                }
            }
            if (this.zzcvb != null && this.zzcvb.length > 0) {
                for (long zzb : this.zzcvb) {
                    com_google_android_gms_internal_zzbxm.zzb(4, zzb);
                }
            }
            if (this.zzcvc != null && this.zzcvc.length > 0) {
                while (i < this.zzcvc.length) {
                    com_google_android_gms_internal_zzbxm.zzb(5, this.zzcvc[i]);
                    i++;
                }
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zza zzaP(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                int zzqZ;
                Object obj2;
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 10);
                        zzaen = this.zzcuY == null ? 0 : this.zzcuY.length;
                        obj = new String[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcuY, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                        this.zzcuY = obj;
                        continue;
                    case 18:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 18);
                        zzaen = this.zzcuZ == null ? 0 : this.zzcuZ.length;
                        obj = new String[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcuZ, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                        this.zzcuZ = obj;
                        continue;
                    case 24:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 24);
                        zzaen = this.zzcva == null ? 0 : this.zzcva.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcva, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzcva = obj;
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
                        zzb = this.zzcva == null ? 0 : this.zzcva.length;
                        obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzcva, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzcva = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 32:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 32);
                        zzaen = this.zzcvb == null ? 0 : this.zzcvb.length;
                        obj = new long[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcvb, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaeq();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaeq();
                        this.zzcvb = obj;
                        continue;
                    case 34:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaeq();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzcvb == null ? 0 : this.zzcvb.length;
                        obj2 = new long[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzcvb, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaeq();
                            zzb++;
                        }
                        this.zzcvb = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 40:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 40);
                        zzaen = this.zzcvc == null ? 0 : this.zzcvc.length;
                        obj = new long[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcvc, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaeq();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaeq();
                        this.zzcvc = obj;
                        continue;
                    case 42:
                        zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaeq();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzcvc == null ? 0 : this.zzcvc.length;
                        obj2 = new long[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzcvc, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaeq();
                            zzb++;
                        }
                        this.zzcvc = obj2;
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

        public /* synthetic */ zzbxn zzaeG() throws CloneNotSupportedException {
            return (zza) clone();
        }

        public /* synthetic */ zzbxt zzaeH() throws CloneNotSupportedException {
            return (zza) clone();
        }

        public zza zzaeU() {
            this.zzcuY = zzbxw.zzcuT;
            this.zzcuZ = zzbxw.zzcuT;
            this.zzcva = zzbxw.zzcuO;
            this.zzcvb = zzbxw.zzcuP;
            this.zzcvc = zzbxw.zzcuP;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zza zzaeV() {
            try {
                zza com_google_android_gms_internal_zzbxy_zza = (zza) super.zzaeG();
                if (this.zzcuY != null && this.zzcuY.length > 0) {
                    com_google_android_gms_internal_zzbxy_zza.zzcuY = (String[]) this.zzcuY.clone();
                }
                if (this.zzcuZ != null && this.zzcuZ.length > 0) {
                    com_google_android_gms_internal_zzbxy_zza.zzcuZ = (String[]) this.zzcuZ.clone();
                }
                if (this.zzcva != null && this.zzcva.length > 0) {
                    com_google_android_gms_internal_zzbxy_zza.zzcva = (int[]) this.zzcva.clone();
                }
                if (this.zzcvb != null && this.zzcvb.length > 0) {
                    com_google_android_gms_internal_zzbxy_zza.zzcvb = (long[]) this.zzcvb.clone();
                }
                if (this.zzcvc != null && this.zzcvc.length > 0) {
                    com_google_android_gms_internal_zzbxy_zza.zzcvc = (long[]) this.zzcvc.clone();
                }
                return com_google_android_gms_internal_zzbxy_zza;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaP(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            int zzu = super.zzu();
            if (this.zzcuY == null || this.zzcuY.length <= 0) {
                i = zzu;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.zzcuY) {
                    if (str != null) {
                        i3++;
                        i2 += zzbxm.zzkb(str);
                    }
                }
                i = (zzu + i2) + (i3 * 1);
            }
            if (this.zzcuZ != null && this.zzcuZ.length > 0) {
                i3 = 0;
                zzu = 0;
                for (String str2 : this.zzcuZ) {
                    if (str2 != null) {
                        zzu++;
                        i3 += zzbxm.zzkb(str2);
                    }
                }
                i = (i + i3) + (zzu * 1);
            }
            if (this.zzcva != null && this.zzcva.length > 0) {
                i3 = 0;
                for (int zzu2 : this.zzcva) {
                    i3 += zzbxm.zzrf(zzu2);
                }
                i = (i + i3) + (this.zzcva.length * 1);
            }
            if (this.zzcvb != null && this.zzcvb.length > 0) {
                i3 = 0;
                for (long zzbf : this.zzcvb) {
                    i3 += zzbxm.zzbf(zzbf);
                }
                i = (i + i3) + (this.zzcvb.length * 1);
            }
            if (this.zzcvc == null || this.zzcvc.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i4 < this.zzcvc.length) {
                i2 += zzbxm.zzbf(this.zzcvc[i4]);
                i4++;
            }
            return (i + i2) + (this.zzcvc.length * 1);
        }
    }

    public static final class zzb extends zzbxn<zzb> implements Cloneable {
        public String version;
        public int zzcvd;
        public String zzcve;

        public zzb() {
            zzaeW();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return zzaeX();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb com_google_android_gms_internal_zzbxy_zzb = (zzb) obj;
            if (this.zzcvd != com_google_android_gms_internal_zzbxy_zzb.zzcvd) {
                return false;
            }
            if (this.zzcve == null) {
                if (com_google_android_gms_internal_zzbxy_zzb.zzcve != null) {
                    return false;
                }
            } else if (!this.zzcve.equals(com_google_android_gms_internal_zzbxy_zzb.zzcve)) {
                return false;
            }
            if (this.version == null) {
                if (com_google_android_gms_internal_zzbxy_zzb.version != null) {
                    return false;
                }
            } else if (!this.version.equals(com_google_android_gms_internal_zzbxy_zzb.version)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbxy_zzb.zzcuA == null || com_google_android_gms_internal_zzbxy_zzb.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbxy_zzb.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.version == null ? 0 : this.version.hashCode()) + (((this.zzcve == null ? 0 : this.zzcve.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.zzcvd) * 31)) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzcvd != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(1, this.zzcvd);
            }
            if (!(this.zzcve == null || this.zzcve.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(2, this.zzcve);
            }
            if (!(this.version == null || this.version.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(3, this.version);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzb zzaQ(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.zzcvd = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 18:
                        this.zzcve = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 26:
                        this.version = com_google_android_gms_internal_zzbxl.readString();
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

        public /* synthetic */ zzbxn zzaeG() throws CloneNotSupportedException {
            return (zzb) clone();
        }

        public /* synthetic */ zzbxt zzaeH() throws CloneNotSupportedException {
            return (zzb) clone();
        }

        public zzb zzaeW() {
            this.zzcvd = 0;
            this.zzcve = "";
            this.version = "";
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzb zzaeX() {
            try {
                return (zzb) super.zzaeG();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaQ(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzcvd != 0) {
                zzu += zzbxm.zzL(1, this.zzcvd);
            }
            if (!(this.zzcve == null || this.zzcve.equals(""))) {
                zzu += zzbxm.zzr(2, this.zzcve);
            }
            return (this.version == null || this.version.equals("")) ? zzu : zzu + zzbxm.zzr(3, this.version);
        }
    }

    public static final class zzc extends zzbxn<zzc> implements Cloneable {
        public byte[] zzcvf;
        public String zzcvg;
        public byte[][] zzcvh;
        public boolean zzcvi;

        public zzc() {
            zzaeY();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return zzaeZ();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzbxy_zzc = (zzc) obj;
            if (!Arrays.equals(this.zzcvf, com_google_android_gms_internal_zzbxy_zzc.zzcvf)) {
                return false;
            }
            if (this.zzcvg == null) {
                if (com_google_android_gms_internal_zzbxy_zzc.zzcvg != null) {
                    return false;
                }
            } else if (!this.zzcvg.equals(com_google_android_gms_internal_zzbxy_zzc.zzcvg)) {
                return false;
            }
            return (zzbxr.zza(this.zzcvh, com_google_android_gms_internal_zzbxy_zzc.zzcvh) && this.zzcvi == com_google_android_gms_internal_zzbxy_zzc.zzcvi) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbxy_zzc.zzcuA == null || com_google_android_gms_internal_zzbxy_zzc.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbxy_zzc.zzcuA) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzcvi ? 1231 : 1237) + (((((this.zzcvg == null ? 0 : this.zzcvg.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.zzcvf)) * 31)) * 31) + zzbxr.zzb(this.zzcvh)) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!Arrays.equals(this.zzcvf, zzbxw.zzcuV)) {
                com_google_android_gms_internal_zzbxm.zzb(1, this.zzcvf);
            }
            if (this.zzcvh != null && this.zzcvh.length > 0) {
                for (byte[] bArr : this.zzcvh) {
                    if (bArr != null) {
                        com_google_android_gms_internal_zzbxm.zzb(2, bArr);
                    }
                }
            }
            if (this.zzcvi) {
                com_google_android_gms_internal_zzbxm.zzg(3, this.zzcvi);
            }
            if (!(this.zzcvg == null || this.zzcvg.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(4, this.zzcvg);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzc zzaR(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        this.zzcvf = com_google_android_gms_internal_zzbxl.readBytes();
                        continue;
                    case 18:
                        int zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 18);
                        zzaen = this.zzcvh == null ? 0 : this.zzcvh.length;
                        Object obj = new byte[(zzb + zzaen)][];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcvh, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.readBytes();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readBytes();
                        this.zzcvh = obj;
                        continue;
                    case 24:
                        this.zzcvi = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 34:
                        this.zzcvg = com_google_android_gms_internal_zzbxl.readString();
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

        public /* synthetic */ zzbxn zzaeG() throws CloneNotSupportedException {
            return (zzc) clone();
        }

        public /* synthetic */ zzbxt zzaeH() throws CloneNotSupportedException {
            return (zzc) clone();
        }

        public zzc zzaeY() {
            this.zzcvf = zzbxw.zzcuV;
            this.zzcvg = "";
            this.zzcvh = zzbxw.zzcuU;
            this.zzcvi = false;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzc zzaeZ() {
            try {
                zzc com_google_android_gms_internal_zzbxy_zzc = (zzc) super.zzaeG();
                if (this.zzcvh != null && this.zzcvh.length > 0) {
                    com_google_android_gms_internal_zzbxy_zzc.zzcvh = (byte[][]) this.zzcvh.clone();
                }
                return com_google_android_gms_internal_zzbxy_zzc;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaR(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int i = 0;
            int zzu = super.zzu();
            if (!Arrays.equals(this.zzcvf, zzbxw.zzcuV)) {
                zzu += zzbxm.zzc(1, this.zzcvf);
            }
            if (this.zzcvh != null && this.zzcvh.length > 0) {
                int i2 = 0;
                int i3 = 0;
                while (i < this.zzcvh.length) {
                    byte[] bArr = this.zzcvh[i];
                    if (bArr != null) {
                        i3++;
                        i2 += zzbxm.zzai(bArr);
                    }
                    i++;
                }
                zzu = (zzu + i2) + (i3 * 1);
            }
            if (this.zzcvi) {
                zzu += zzbxm.zzh(3, this.zzcvi);
            }
            return (this.zzcvg == null || this.zzcvg.equals("")) ? zzu : zzu + zzbxm.zzr(4, this.zzcvg);
        }
    }

    public static final class zzd extends zzbxn<zzd> implements Cloneable {
        public String tag;
        public boolean zzceh;
        public int[] zzcvA;
        public long zzcvB;
        public zzf zzcvC;
        public long zzcvj;
        public long zzcvk;
        public long zzcvl;
        public int zzcvm;
        public zze[] zzcvn;
        public byte[] zzcvo;
        public zzb zzcvp;
        public byte[] zzcvq;
        public String zzcvr;
        public String zzcvs;
        public zza zzcvt;
        public String zzcvu;
        public long zzcvv;
        public zzc zzcvw;
        public byte[] zzcvx;
        public String zzcvy;
        public int zzcvz;
        public int zzri;

        public zzd() {
            zzafa();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return zzafb();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd com_google_android_gms_internal_zzbxy_zzd = (zzd) obj;
            if (this.zzcvj != com_google_android_gms_internal_zzbxy_zzd.zzcvj || this.zzcvk != com_google_android_gms_internal_zzbxy_zzd.zzcvk || this.zzcvl != com_google_android_gms_internal_zzbxy_zzd.zzcvl) {
                return false;
            }
            if (this.tag == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.tag != null) {
                    return false;
                }
            } else if (!this.tag.equals(com_google_android_gms_internal_zzbxy_zzd.tag)) {
                return false;
            }
            if (this.zzcvm != com_google_android_gms_internal_zzbxy_zzd.zzcvm || this.zzri != com_google_android_gms_internal_zzbxy_zzd.zzri || this.zzceh != com_google_android_gms_internal_zzbxy_zzd.zzceh || !zzbxr.equals(this.zzcvn, com_google_android_gms_internal_zzbxy_zzd.zzcvn) || !Arrays.equals(this.zzcvo, com_google_android_gms_internal_zzbxy_zzd.zzcvo)) {
                return false;
            }
            if (this.zzcvp == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvp != null) {
                    return false;
                }
            } else if (!this.zzcvp.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvp)) {
                return false;
            }
            if (!Arrays.equals(this.zzcvq, com_google_android_gms_internal_zzbxy_zzd.zzcvq)) {
                return false;
            }
            if (this.zzcvr == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvr != null) {
                    return false;
                }
            } else if (!this.zzcvr.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvr)) {
                return false;
            }
            if (this.zzcvs == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvs != null) {
                    return false;
                }
            } else if (!this.zzcvs.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvs)) {
                return false;
            }
            if (this.zzcvt == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvt != null) {
                    return false;
                }
            } else if (!this.zzcvt.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvt)) {
                return false;
            }
            if (this.zzcvu == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvu != null) {
                    return false;
                }
            } else if (!this.zzcvu.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvu)) {
                return false;
            }
            if (this.zzcvv != com_google_android_gms_internal_zzbxy_zzd.zzcvv) {
                return false;
            }
            if (this.zzcvw == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvw != null) {
                    return false;
                }
            } else if (!this.zzcvw.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvw)) {
                return false;
            }
            if (!Arrays.equals(this.zzcvx, com_google_android_gms_internal_zzbxy_zzd.zzcvx)) {
                return false;
            }
            if (this.zzcvy == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvy != null) {
                    return false;
                }
            } else if (!this.zzcvy.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvy)) {
                return false;
            }
            if (this.zzcvz != com_google_android_gms_internal_zzbxy_zzd.zzcvz || !zzbxr.equals(this.zzcvA, com_google_android_gms_internal_zzbxy_zzd.zzcvA) || this.zzcvB != com_google_android_gms_internal_zzbxy_zzd.zzcvB) {
                return false;
            }
            if (this.zzcvC == null) {
                if (com_google_android_gms_internal_zzbxy_zzd.zzcvC != null) {
                    return false;
                }
            } else if (!this.zzcvC.equals(com_google_android_gms_internal_zzbxy_zzd.zzcvC)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbxy_zzd.zzcuA == null || com_google_android_gms_internal_zzbxy_zzd.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbxy_zzd.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzcvC == null ? 0 : this.zzcvC.hashCode()) + (((((((((this.zzcvy == null ? 0 : this.zzcvy.hashCode()) + (((((this.zzcvw == null ? 0 : this.zzcvw.hashCode()) + (((((this.zzcvu == null ? 0 : this.zzcvu.hashCode()) + (((this.zzcvt == null ? 0 : this.zzcvt.hashCode()) + (((this.zzcvs == null ? 0 : this.zzcvs.hashCode()) + (((this.zzcvr == null ? 0 : this.zzcvr.hashCode()) + (((((this.zzcvp == null ? 0 : this.zzcvp.hashCode()) + (((((((this.zzceh ? 1231 : 1237) + (((((((this.tag == null ? 0 : this.tag.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzcvj ^ (this.zzcvj >>> 32)))) * 31) + ((int) (this.zzcvk ^ (this.zzcvk >>> 32)))) * 31) + ((int) (this.zzcvl ^ (this.zzcvl >>> 32)))) * 31)) * 31) + this.zzcvm) * 31) + this.zzri) * 31)) * 31) + zzbxr.hashCode(this.zzcvn)) * 31) + Arrays.hashCode(this.zzcvo)) * 31)) * 31) + Arrays.hashCode(this.zzcvq)) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) (this.zzcvv ^ (this.zzcvv >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.zzcvx)) * 31)) * 31) + this.zzcvz) * 31) + zzbxr.hashCode(this.zzcvA)) * 31) + ((int) (this.zzcvB ^ (this.zzcvB >>> 32)))) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            if (this.zzcvj != 0) {
                com_google_android_gms_internal_zzbxm.zzb(1, this.zzcvj);
            }
            if (!(this.tag == null || this.tag.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(2, this.tag);
            }
            if (this.zzcvn != null && this.zzcvn.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcvn) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(3, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (!Arrays.equals(this.zzcvo, zzbxw.zzcuV)) {
                com_google_android_gms_internal_zzbxm.zzb(4, this.zzcvo);
            }
            if (!Arrays.equals(this.zzcvq, zzbxw.zzcuV)) {
                com_google_android_gms_internal_zzbxm.zzb(6, this.zzcvq);
            }
            if (this.zzcvt != null) {
                com_google_android_gms_internal_zzbxm.zza(7, this.zzcvt);
            }
            if (!(this.zzcvr == null || this.zzcvr.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(8, this.zzcvr);
            }
            if (this.zzcvp != null) {
                com_google_android_gms_internal_zzbxm.zza(9, this.zzcvp);
            }
            if (this.zzceh) {
                com_google_android_gms_internal_zzbxm.zzg(10, this.zzceh);
            }
            if (this.zzcvm != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(11, this.zzcvm);
            }
            if (this.zzri != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(12, this.zzri);
            }
            if (!(this.zzcvs == null || this.zzcvs.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(13, this.zzcvs);
            }
            if (!(this.zzcvu == null || this.zzcvu.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(14, this.zzcvu);
            }
            if (this.zzcvv != 180000) {
                com_google_android_gms_internal_zzbxm.zzd(15, this.zzcvv);
            }
            if (this.zzcvw != null) {
                com_google_android_gms_internal_zzbxm.zza(16, this.zzcvw);
            }
            if (this.zzcvk != 0) {
                com_google_android_gms_internal_zzbxm.zzb(17, this.zzcvk);
            }
            if (!Arrays.equals(this.zzcvx, zzbxw.zzcuV)) {
                com_google_android_gms_internal_zzbxm.zzb(18, this.zzcvx);
            }
            if (this.zzcvz != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(19, this.zzcvz);
            }
            if (this.zzcvA != null && this.zzcvA.length > 0) {
                while (i < this.zzcvA.length) {
                    com_google_android_gms_internal_zzbxm.zzJ(20, this.zzcvA[i]);
                    i++;
                }
            }
            if (this.zzcvl != 0) {
                com_google_android_gms_internal_zzbxm.zzb(21, this.zzcvl);
            }
            if (this.zzcvB != 0) {
                com_google_android_gms_internal_zzbxm.zzb(22, this.zzcvB);
            }
            if (this.zzcvC != null) {
                com_google_android_gms_internal_zzbxm.zza(23, this.zzcvC);
            }
            if (!(this.zzcvy == null || this.zzcvy.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(24, this.zzcvy);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzd zzaS(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.zzcvj = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 18:
                        this.tag = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 26:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 26);
                        zzaen = this.zzcvn == null ? 0 : this.zzcvn.length;
                        obj = new zze[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcvn, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zze();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zze();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzcvn = obj;
                        continue;
                    case 34:
                        this.zzcvo = com_google_android_gms_internal_zzbxl.readBytes();
                        continue;
                    case 50:
                        this.zzcvq = com_google_android_gms_internal_zzbxl.readBytes();
                        continue;
                    case 58:
                        if (this.zzcvt == null) {
                            this.zzcvt = new zza();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcvt);
                        continue;
                    case 66:
                        this.zzcvr = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 74:
                        if (this.zzcvp == null) {
                            this.zzcvp = new zzb();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcvp);
                        continue;
                    case 80:
                        this.zzceh = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 88:
                        this.zzcvm = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 96:
                        this.zzri = com_google_android_gms_internal_zzbxl.zzaer();
                        continue;
                    case 106:
                        this.zzcvs = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 114:
                        this.zzcvu = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 120:
                        this.zzcvv = com_google_android_gms_internal_zzbxl.zzaev();
                        continue;
                    case TransportMediator.KEYCODE_MEDIA_RECORD /*130*/:
                        if (this.zzcvw == null) {
                            this.zzcvw = new zzc();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcvw);
                        continue;
                    case 136:
                        this.zzcvk = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 146:
                        this.zzcvx = com_google_android_gms_internal_zzbxl.readBytes();
                        continue;
                    case 152:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case 0:
                            case 1:
                            case 2:
                                this.zzcvz = zzaen;
                                break;
                            default:
                                continue;
                        }
                    case 160:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 160);
                        zzaen = this.zzcvA == null ? 0 : this.zzcvA.length;
                        obj = new int[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzcvA, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        this.zzcvA = obj;
                        continue;
                    case 162:
                        int zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            com_google_android_gms_internal_zzbxl.zzaer();
                            zzaen++;
                        }
                        com_google_android_gms_internal_zzbxl.zzrb(zzb);
                        zzb = this.zzcvA == null ? 0 : this.zzcvA.length;
                        Object obj2 = new int[(zzaen + zzb)];
                        if (zzb != 0) {
                            System.arraycopy(this.zzcvA, 0, obj2, 0, zzb);
                        }
                        while (zzb < obj2.length) {
                            obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                            zzb++;
                        }
                        this.zzcvA = obj2;
                        com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                        continue;
                    case 168:
                        this.zzcvl = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 176:
                        this.zzcvB = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 186:
                        if (this.zzcvC == null) {
                            this.zzcvC = new zzf();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzcvC);
                        continue;
                    case 194:
                        this.zzcvy = com_google_android_gms_internal_zzbxl.readString();
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

        public /* synthetic */ zzbxn zzaeG() throws CloneNotSupportedException {
            return (zzd) clone();
        }

        public /* synthetic */ zzbxt zzaeH() throws CloneNotSupportedException {
            return (zzd) clone();
        }

        public zzd zzafa() {
            this.zzcvj = 0;
            this.zzcvk = 0;
            this.zzcvl = 0;
            this.tag = "";
            this.zzcvm = 0;
            this.zzri = 0;
            this.zzceh = false;
            this.zzcvn = zze.zzafc();
            this.zzcvo = zzbxw.zzcuV;
            this.zzcvp = null;
            this.zzcvq = zzbxw.zzcuV;
            this.zzcvr = "";
            this.zzcvs = "";
            this.zzcvt = null;
            this.zzcvu = "";
            this.zzcvv = 180000;
            this.zzcvw = null;
            this.zzcvx = zzbxw.zzcuV;
            this.zzcvy = "";
            this.zzcvz = 0;
            this.zzcvA = zzbxw.zzcuO;
            this.zzcvB = 0;
            this.zzcvC = null;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzd zzafb() {
            try {
                zzd com_google_android_gms_internal_zzbxy_zzd = (zzd) super.zzaeG();
                if (this.zzcvn != null && this.zzcvn.length > 0) {
                    com_google_android_gms_internal_zzbxy_zzd.zzcvn = new zze[this.zzcvn.length];
                    for (int i = 0; i < this.zzcvn.length; i++) {
                        if (this.zzcvn[i] != null) {
                            com_google_android_gms_internal_zzbxy_zzd.zzcvn[i] = (zze) this.zzcvn[i].clone();
                        }
                    }
                }
                if (this.zzcvp != null) {
                    com_google_android_gms_internal_zzbxy_zzd.zzcvp = (zzb) this.zzcvp.clone();
                }
                if (this.zzcvt != null) {
                    com_google_android_gms_internal_zzbxy_zzd.zzcvt = (zza) this.zzcvt.clone();
                }
                if (this.zzcvw != null) {
                    com_google_android_gms_internal_zzbxy_zzd.zzcvw = (zzc) this.zzcvw.clone();
                }
                if (this.zzcvA != null && this.zzcvA.length > 0) {
                    com_google_android_gms_internal_zzbxy_zzd.zzcvA = (int[]) this.zzcvA.clone();
                }
                if (this.zzcvC != null) {
                    com_google_android_gms_internal_zzbxy_zzd.zzcvC = (zzf) this.zzcvC.clone();
                }
                return com_google_android_gms_internal_zzbxy_zzd;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaS(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int i;
            int i2 = 0;
            int zzu = super.zzu();
            if (this.zzcvj != 0) {
                zzu += zzbxm.zzf(1, this.zzcvj);
            }
            if (!(this.tag == null || this.tag.equals(""))) {
                zzu += zzbxm.zzr(2, this.tag);
            }
            if (this.zzcvn != null && this.zzcvn.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzcvn) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        i += zzbxm.zzc(3, com_google_android_gms_internal_zzbxt);
                    }
                }
                zzu = i;
            }
            if (!Arrays.equals(this.zzcvo, zzbxw.zzcuV)) {
                zzu += zzbxm.zzc(4, this.zzcvo);
            }
            if (!Arrays.equals(this.zzcvq, zzbxw.zzcuV)) {
                zzu += zzbxm.zzc(6, this.zzcvq);
            }
            if (this.zzcvt != null) {
                zzu += zzbxm.zzc(7, this.zzcvt);
            }
            if (!(this.zzcvr == null || this.zzcvr.equals(""))) {
                zzu += zzbxm.zzr(8, this.zzcvr);
            }
            if (this.zzcvp != null) {
                zzu += zzbxm.zzc(9, this.zzcvp);
            }
            if (this.zzceh) {
                zzu += zzbxm.zzh(10, this.zzceh);
            }
            if (this.zzcvm != 0) {
                zzu += zzbxm.zzL(11, this.zzcvm);
            }
            if (this.zzri != 0) {
                zzu += zzbxm.zzL(12, this.zzri);
            }
            if (!(this.zzcvs == null || this.zzcvs.equals(""))) {
                zzu += zzbxm.zzr(13, this.zzcvs);
            }
            if (!(this.zzcvu == null || this.zzcvu.equals(""))) {
                zzu += zzbxm.zzr(14, this.zzcvu);
            }
            if (this.zzcvv != 180000) {
                zzu += zzbxm.zzh(15, this.zzcvv);
            }
            if (this.zzcvw != null) {
                zzu += zzbxm.zzc(16, this.zzcvw);
            }
            if (this.zzcvk != 0) {
                zzu += zzbxm.zzf(17, this.zzcvk);
            }
            if (!Arrays.equals(this.zzcvx, zzbxw.zzcuV)) {
                zzu += zzbxm.zzc(18, this.zzcvx);
            }
            if (this.zzcvz != 0) {
                zzu += zzbxm.zzL(19, this.zzcvz);
            }
            if (this.zzcvA != null && this.zzcvA.length > 0) {
                i = 0;
                while (i2 < this.zzcvA.length) {
                    i += zzbxm.zzrf(this.zzcvA[i2]);
                    i2++;
                }
                zzu = (zzu + i) + (this.zzcvA.length * 2);
            }
            if (this.zzcvl != 0) {
                zzu += zzbxm.zzf(21, this.zzcvl);
            }
            if (this.zzcvB != 0) {
                zzu += zzbxm.zzf(22, this.zzcvB);
            }
            if (this.zzcvC != null) {
                zzu += zzbxm.zzc(23, this.zzcvC);
            }
            return (this.zzcvy == null || this.zzcvy.equals("")) ? zzu : zzu + zzbxm.zzr(24, this.zzcvy);
        }
    }

    public static final class zze extends zzbxn<zze> implements Cloneable {
        private static volatile zze[] zzcvD;
        public String value;
        public String zzaB;

        public zze() {
            zzafd();
        }

        public static zze[] zzafc() {
            if (zzcvD == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzcvD == null) {
                        zzcvD = new zze[0];
                    }
                }
            }
            return zzcvD;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return zzafe();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze com_google_android_gms_internal_zzbxy_zze = (zze) obj;
            if (this.zzaB == null) {
                if (com_google_android_gms_internal_zzbxy_zze.zzaB != null) {
                    return false;
                }
            } else if (!this.zzaB.equals(com_google_android_gms_internal_zzbxy_zze.zzaB)) {
                return false;
            }
            if (this.value == null) {
                if (com_google_android_gms_internal_zzbxy_zze.value != null) {
                    return false;
                }
            } else if (!this.value.equals(com_google_android_gms_internal_zzbxy_zze.value)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbxy_zze.zzcuA == null || com_google_android_gms_internal_zzbxy_zze.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbxy_zze.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.value == null ? 0 : this.value.hashCode()) + (((this.zzaB == null ? 0 : this.zzaB.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (!(this.zzaB == null || this.zzaB.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(1, this.zzaB);
            }
            if (!(this.value == null || this.value.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(2, this.value);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zze zzaT(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 10:
                        this.zzaB = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 18:
                        this.value = com_google_android_gms_internal_zzbxl.readString();
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

        public /* synthetic */ zzbxn zzaeG() throws CloneNotSupportedException {
            return (zze) clone();
        }

        public /* synthetic */ zzbxt zzaeH() throws CloneNotSupportedException {
            return (zze) clone();
        }

        public zze zzafd() {
            this.zzaB = "";
            this.value = "";
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zze zzafe() {
            try {
                return (zze) super.zzaeG();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaT(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (!(this.zzaB == null || this.zzaB.equals(""))) {
                zzu += zzbxm.zzr(1, this.zzaB);
            }
            return (this.value == null || this.value.equals("")) ? zzu : zzu + zzbxm.zzr(2, this.value);
        }
    }

    public static final class zzf extends zzbxn<zzf> implements Cloneable {
        public int zzcvE;
        public int zzcvF;

        public zzf() {
            zzaff();
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return zzafg();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf com_google_android_gms_internal_zzbxy_zzf = (zzf) obj;
            return (this.zzcvE == com_google_android_gms_internal_zzbxy_zzf.zzcvE && this.zzcvF == com_google_android_gms_internal_zzbxy_zzf.zzcvF) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbxy_zzf.zzcuA == null || com_google_android_gms_internal_zzbxy_zzf.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbxy_zzf.zzcuA) : false;
        }

        public int hashCode() {
            int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.zzcvE) * 31) + this.zzcvF) * 31;
            int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
            return hashCode2 + hashCode;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            if (this.zzcvE != -1) {
                com_google_android_gms_internal_zzbxm.zzJ(1, this.zzcvE);
            }
            if (this.zzcvF != 0) {
                com_google_android_gms_internal_zzbxm.zzJ(2, this.zzcvF);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public zzf zzaU(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case -1:
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                this.zzcvE = zzaen;
                                break;
                            default:
                                continue;
                        }
                    case 16:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 100:
                                this.zzcvF = zzaen;
                                break;
                            default:
                                continue;
                        }
                    default:
                        if (!super.zza(com_google_android_gms_internal_zzbxl, zzaen)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }

        public /* synthetic */ zzbxn zzaeG() throws CloneNotSupportedException {
            return (zzf) clone();
        }

        public /* synthetic */ zzbxt zzaeH() throws CloneNotSupportedException {
            return (zzf) clone();
        }

        public zzf zzaff() {
            this.zzcvE = -1;
            this.zzcvF = 0;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zzf zzafg() {
            try {
                return (zzf) super.zzaeG();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzaU(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu();
            if (this.zzcvE != -1) {
                zzu += zzbxm.zzL(1, this.zzcvE);
            }
            return this.zzcvF != 0 ? zzu + zzbxm.zzL(2, this.zzcvF) : zzu;
        }
    }
}
