package com.google.android.gms.internal;

import java.io.IOException;

public interface zzak {

    public static final class zza extends zzbxn<zza> {
        private static volatile zza[] zzlt;
        public String string;
        public int type;
        public boolean zzlA;
        public zza[] zzlB;
        public int[] zzlC;
        public boolean zzlD;
        public zza[] zzlu;
        public zza[] zzlv;
        public zza[] zzlw;
        public String zzlx;
        public String zzly;
        public long zzlz;

        public zza() {
            zzM();
        }

        public static zza[] zzL() {
            if (zzlt == null) {
                synchronized (zzbxr.zzcuI) {
                    if (zzlt == null) {
                        zzlt = new zza[0];
                    }
                }
            }
            return zzlt;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzak_zza = (zza) obj;
            if (this.type != com_google_android_gms_internal_zzak_zza.type) {
                return false;
            }
            if (this.string == null) {
                if (com_google_android_gms_internal_zzak_zza.string != null) {
                    return false;
                }
            } else if (!this.string.equals(com_google_android_gms_internal_zzak_zza.string)) {
                return false;
            }
            if (!zzbxr.equals(this.zzlu, com_google_android_gms_internal_zzak_zza.zzlu) || !zzbxr.equals(this.zzlv, com_google_android_gms_internal_zzak_zza.zzlv) || !zzbxr.equals(this.zzlw, com_google_android_gms_internal_zzak_zza.zzlw)) {
                return false;
            }
            if (this.zzlx == null) {
                if (com_google_android_gms_internal_zzak_zza.zzlx != null) {
                    return false;
                }
            } else if (!this.zzlx.equals(com_google_android_gms_internal_zzak_zza.zzlx)) {
                return false;
            }
            if (this.zzly == null) {
                if (com_google_android_gms_internal_zzak_zza.zzly != null) {
                    return false;
                }
            } else if (!this.zzly.equals(com_google_android_gms_internal_zzak_zza.zzly)) {
                return false;
            }
            return (this.zzlz == com_google_android_gms_internal_zzak_zza.zzlz && this.zzlA == com_google_android_gms_internal_zzak_zza.zzlA && zzbxr.equals(this.zzlB, com_google_android_gms_internal_zzak_zza.zzlB) && zzbxr.equals(this.zzlC, com_google_android_gms_internal_zzak_zza.zzlC) && this.zzlD == com_google_android_gms_internal_zzak_zza.zzlD) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzak_zza.zzcuA == null || com_google_android_gms_internal_zzak_zza.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzak_zza.zzcuA) : false;
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            int hashCode = ((((((this.zzlA ? 1231 : 1237) + (((((this.zzly == null ? 0 : this.zzly.hashCode()) + (((this.zzlx == null ? 0 : this.zzlx.hashCode()) + (((((((((this.string == null ? 0 : this.string.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.type) * 31)) * 31) + zzbxr.hashCode(this.zzlu)) * 31) + zzbxr.hashCode(this.zzlv)) * 31) + zzbxr.hashCode(this.zzlw)) * 31)) * 31)) * 31) + ((int) (this.zzlz ^ (this.zzlz >>> 32)))) * 31)) * 31) + zzbxr.hashCode(this.zzlB)) * 31) + zzbxr.hashCode(this.zzlC)) * 31;
            if (!this.zzlD) {
                i = 1237;
            }
            hashCode = (hashCode + i) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i2 = this.zzcuA.hashCode();
            }
            return hashCode + i2;
        }

        public zza zzM() {
            this.type = 1;
            this.string = "";
            this.zzlu = zzL();
            this.zzlv = zzL();
            this.zzlw = zzL();
            this.zzlx = "";
            this.zzly = "";
            this.zzlz = 0;
            this.zzlA = false;
            this.zzlB = zzL();
            this.zzlC = zzbxw.zzcuO;
            this.zzlD = false;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            int i = 0;
            com_google_android_gms_internal_zzbxm.zzJ(1, this.type);
            if (!(this.string == null || this.string.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(2, this.string);
            }
            if (this.zzlu != null && this.zzlu.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzlu) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        com_google_android_gms_internal_zzbxm.zza(3, com_google_android_gms_internal_zzbxt);
                    }
                }
            }
            if (this.zzlv != null && this.zzlv.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt2 : this.zzlv) {
                    if (com_google_android_gms_internal_zzbxt2 != null) {
                        com_google_android_gms_internal_zzbxm.zza(4, com_google_android_gms_internal_zzbxt2);
                    }
                }
            }
            if (this.zzlw != null && this.zzlw.length > 0) {
                for (zzbxt com_google_android_gms_internal_zzbxt22 : this.zzlw) {
                    if (com_google_android_gms_internal_zzbxt22 != null) {
                        com_google_android_gms_internal_zzbxm.zza(5, com_google_android_gms_internal_zzbxt22);
                    }
                }
            }
            if (!(this.zzlx == null || this.zzlx.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(6, this.zzlx);
            }
            if (!(this.zzly == null || this.zzly.equals(""))) {
                com_google_android_gms_internal_zzbxm.zzq(7, this.zzly);
            }
            if (this.zzlz != 0) {
                com_google_android_gms_internal_zzbxm.zzb(8, this.zzlz);
            }
            if (this.zzlD) {
                com_google_android_gms_internal_zzbxm.zzg(9, this.zzlD);
            }
            if (this.zzlC != null && this.zzlC.length > 0) {
                for (int zzJ : this.zzlC) {
                    com_google_android_gms_internal_zzbxm.zzJ(10, zzJ);
                }
            }
            if (this.zzlB != null && this.zzlB.length > 0) {
                while (i < this.zzlB.length) {
                    zzbxt com_google_android_gms_internal_zzbxt3 = this.zzlB[i];
                    if (com_google_android_gms_internal_zzbxt3 != null) {
                        com_google_android_gms_internal_zzbxm.zza(11, com_google_android_gms_internal_zzbxt3);
                    }
                    i++;
                }
            }
            if (this.zzlA) {
                com_google_android_gms_internal_zzbxm.zzg(12, this.zzlA);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzx(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int i;
            int i2 = 0;
            int zzu = super.zzu() + zzbxm.zzL(1, this.type);
            if (!(this.string == null || this.string.equals(""))) {
                zzu += zzbxm.zzr(2, this.string);
            }
            if (this.zzlu != null && this.zzlu.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt : this.zzlu) {
                    if (com_google_android_gms_internal_zzbxt != null) {
                        i += zzbxm.zzc(3, com_google_android_gms_internal_zzbxt);
                    }
                }
                zzu = i;
            }
            if (this.zzlv != null && this.zzlv.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt2 : this.zzlv) {
                    if (com_google_android_gms_internal_zzbxt2 != null) {
                        i += zzbxm.zzc(4, com_google_android_gms_internal_zzbxt2);
                    }
                }
                zzu = i;
            }
            if (this.zzlw != null && this.zzlw.length > 0) {
                i = zzu;
                for (zzbxt com_google_android_gms_internal_zzbxt22 : this.zzlw) {
                    if (com_google_android_gms_internal_zzbxt22 != null) {
                        i += zzbxm.zzc(5, com_google_android_gms_internal_zzbxt22);
                    }
                }
                zzu = i;
            }
            if (!(this.zzlx == null || this.zzlx.equals(""))) {
                zzu += zzbxm.zzr(6, this.zzlx);
            }
            if (!(this.zzly == null || this.zzly.equals(""))) {
                zzu += zzbxm.zzr(7, this.zzly);
            }
            if (this.zzlz != 0) {
                zzu += zzbxm.zzf(8, this.zzlz);
            }
            if (this.zzlD) {
                zzu += zzbxm.zzh(9, this.zzlD);
            }
            if (this.zzlC != null && this.zzlC.length > 0) {
                int i3 = 0;
                for (int zzrf : this.zzlC) {
                    i3 += zzbxm.zzrf(zzrf);
                }
                zzu = (zzu + i3) + (this.zzlC.length * 1);
            }
            if (this.zzlB != null && this.zzlB.length > 0) {
                while (i2 < this.zzlB.length) {
                    zzbxt com_google_android_gms_internal_zzbxt3 = this.zzlB[i2];
                    if (com_google_android_gms_internal_zzbxt3 != null) {
                        zzu += zzbxm.zzc(11, com_google_android_gms_internal_zzbxt3);
                    }
                    i2++;
                }
            }
            return this.zzlA ? zzu + zzbxm.zzh(12, this.zzlA) : zzu;
        }

        public zza zzx(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                int zzb;
                Object obj;
                int i;
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        zzaen = com_google_android_gms_internal_zzbxl.zzaer();
                        switch (zzaen) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.type = zzaen;
                                break;
                            default:
                                continue;
                        }
                    case 18:
                        this.string = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 26:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 26);
                        zzaen = this.zzlu == null ? 0 : this.zzlu.length;
                        obj = new zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlu, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzlu = obj;
                        continue;
                    case 34:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 34);
                        zzaen = this.zzlv == null ? 0 : this.zzlv.length;
                        obj = new zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlv, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzlv = obj;
                        continue;
                    case 42:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 42);
                        zzaen = this.zzlw == null ? 0 : this.zzlw.length;
                        obj = new zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlw, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzlw = obj;
                        continue;
                    case 50:
                        this.zzlx = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 58:
                        this.zzly = com_google_android_gms_internal_zzbxl.readString();
                        continue;
                    case 64:
                        this.zzlz = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 72:
                        this.zzlD = com_google_android_gms_internal_zzbxl.zzaet();
                        continue;
                    case 80:
                        int zzb2 = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 80);
                        Object obj2 = new int[zzb2];
                        i = 0;
                        zzb = 0;
                        while (i < zzb2) {
                            if (i != 0) {
                                com_google_android_gms_internal_zzbxl.zzaen();
                            }
                            int zzaer = com_google_android_gms_internal_zzbxl.zzaer();
                            switch (zzaer) {
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
                                    zzaen = zzb + 1;
                                    obj2[zzb] = zzaer;
                                    break;
                                default:
                                    zzaen = zzb;
                                    break;
                            }
                            i++;
                            zzb = zzaen;
                        }
                        if (zzb != 0) {
                            zzaen = this.zzlC == null ? 0 : this.zzlC.length;
                            if (zzaen != 0 || zzb != obj2.length) {
                                Object obj3 = new int[(zzaen + zzb)];
                                if (zzaen != 0) {
                                    System.arraycopy(this.zzlC, 0, obj3, 0, zzaen);
                                }
                                System.arraycopy(obj2, 0, obj3, zzaen, zzb);
                                this.zzlC = obj3;
                                break;
                            }
                            this.zzlC = obj2;
                            break;
                        }
                        continue;
                    case 82:
                        i = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                        zzb = com_google_android_gms_internal_zzbxl.getPosition();
                        zzaen = 0;
                        while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                            switch (com_google_android_gms_internal_zzbxl.zzaer()) {
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
                                    zzaen++;
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (zzaen != 0) {
                            com_google_android_gms_internal_zzbxl.zzrb(zzb);
                            zzb = this.zzlC == null ? 0 : this.zzlC.length;
                            Object obj4 = new int[(zzaen + zzb)];
                            if (zzb != 0) {
                                System.arraycopy(this.zzlC, 0, obj4, 0, zzb);
                            }
                            while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                                int zzaer2 = com_google_android_gms_internal_zzbxl.zzaer();
                                switch (zzaer2) {
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
                                        zzaen = zzb + 1;
                                        obj4[zzb] = zzaer2;
                                        zzb = zzaen;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.zzlC = obj4;
                        }
                        com_google_android_gms_internal_zzbxl.zzra(i);
                        continue;
                    case 90:
                        zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 90);
                        zzaen = this.zzlB == null ? 0 : this.zzlB.length;
                        obj = new zza[(zzb + zzaen)];
                        if (zzaen != 0) {
                            System.arraycopy(this.zzlB, 0, obj, 0, zzaen);
                        }
                        while (zzaen < obj.length - 1) {
                            obj[zzaen] = new zza();
                            com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                            com_google_android_gms_internal_zzbxl.zzaen();
                            zzaen++;
                        }
                        obj[zzaen] = new zza();
                        com_google_android_gms_internal_zzbxl.zza(obj[zzaen]);
                        this.zzlB = obj;
                        continue;
                    case 96:
                        this.zzlA = com_google_android_gms_internal_zzbxl.zzaet();
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
