package com.google.android.gms.internal;

import java.io.IOException;

public final class zzblo extends zzbxn<zzblo> {
    public String[] zzbWB;
    public int[] zzbWC;
    public byte[][] zzbWD;

    public zzblo() {
        zzUS();
    }

    public static zzblo zzT(byte[] bArr) throws zzbxs {
        return (zzblo) zzbxt.zza(new zzblo(), bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzblo)) {
            return false;
        }
        zzblo com_google_android_gms_internal_zzblo = (zzblo) obj;
        return (zzbxr.equals(this.zzbWB, com_google_android_gms_internal_zzblo.zzbWB) && zzbxr.equals(this.zzbWC, com_google_android_gms_internal_zzblo.zzbWC) && zzbxr.zza(this.zzbWD, com_google_android_gms_internal_zzblo.zzbWD)) ? (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzblo.zzcuA == null || com_google_android_gms_internal_zzblo.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzblo.zzcuA) : false;
    }

    public int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + zzbxr.hashCode(this.zzbWB)) * 31) + zzbxr.hashCode(this.zzbWC)) * 31) + zzbxr.zzb(this.zzbWD)) * 31;
        int hashCode2 = (this.zzcuA == null || this.zzcuA.isEmpty()) ? 0 : this.zzcuA.hashCode();
        return hashCode2 + hashCode;
    }

    public zzblo zzUS() {
        this.zzbWB = zzbxw.zzcuT;
        this.zzbWC = zzbxw.zzcuO;
        this.zzbWD = zzbxw.zzcuU;
        this.zzcuA = null;
        this.zzcuJ = -1;
        return this;
    }

    public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
        int i = 0;
        if (this.zzbWB != null && this.zzbWB.length > 0) {
            for (String str : this.zzbWB) {
                if (str != null) {
                    com_google_android_gms_internal_zzbxm.zzq(1, str);
                }
            }
        }
        if (this.zzbWC != null && this.zzbWC.length > 0) {
            for (int zzJ : this.zzbWC) {
                com_google_android_gms_internal_zzbxm.zzJ(2, zzJ);
            }
        }
        if (this.zzbWD != null && this.zzbWD.length > 0) {
            while (i < this.zzbWD.length) {
                byte[] bArr = this.zzbWD[i];
                if (bArr != null) {
                    com_google_android_gms_internal_zzbxm.zzb(3, bArr);
                }
                i++;
            }
        }
        super.zza(com_google_android_gms_internal_zzbxm);
    }

    public zzblo zzab(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
        while (true) {
            int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
            int zzb;
            Object obj;
            switch (zzaen) {
                case 0:
                    break;
                case 10:
                    zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 10);
                    zzaen = this.zzbWB == null ? 0 : this.zzbWB.length;
                    obj = new String[(zzb + zzaen)];
                    if (zzaen != 0) {
                        System.arraycopy(this.zzbWB, 0, obj, 0, zzaen);
                    }
                    while (zzaen < obj.length - 1) {
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                        com_google_android_gms_internal_zzbxl.zzaen();
                        zzaen++;
                    }
                    obj[zzaen] = com_google_android_gms_internal_zzbxl.readString();
                    this.zzbWB = obj;
                    continue;
                case 16:
                    zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 16);
                    zzaen = this.zzbWC == null ? 0 : this.zzbWC.length;
                    obj = new int[(zzb + zzaen)];
                    if (zzaen != 0) {
                        System.arraycopy(this.zzbWC, 0, obj, 0, zzaen);
                    }
                    while (zzaen < obj.length - 1) {
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                        com_google_android_gms_internal_zzbxl.zzaen();
                        zzaen++;
                    }
                    obj[zzaen] = com_google_android_gms_internal_zzbxl.zzaer();
                    this.zzbWC = obj;
                    continue;
                case 18:
                    int zzqZ = com_google_android_gms_internal_zzbxl.zzqZ(com_google_android_gms_internal_zzbxl.zzaew());
                    zzb = com_google_android_gms_internal_zzbxl.getPosition();
                    zzaen = 0;
                    while (com_google_android_gms_internal_zzbxl.zzaeB() > 0) {
                        com_google_android_gms_internal_zzbxl.zzaer();
                        zzaen++;
                    }
                    com_google_android_gms_internal_zzbxl.zzrb(zzb);
                    zzb = this.zzbWC == null ? 0 : this.zzbWC.length;
                    Object obj2 = new int[(zzaen + zzb)];
                    if (zzb != 0) {
                        System.arraycopy(this.zzbWC, 0, obj2, 0, zzb);
                    }
                    while (zzb < obj2.length) {
                        obj2[zzb] = com_google_android_gms_internal_zzbxl.zzaer();
                        zzb++;
                    }
                    this.zzbWC = obj2;
                    com_google_android_gms_internal_zzbxl.zzra(zzqZ);
                    continue;
                case 26:
                    zzb = zzbxw.zzb(com_google_android_gms_internal_zzbxl, 26);
                    zzaen = this.zzbWD == null ? 0 : this.zzbWD.length;
                    obj = new byte[(zzb + zzaen)][];
                    if (zzaen != 0) {
                        System.arraycopy(this.zzbWD, 0, obj, 0, zzaen);
                    }
                    while (zzaen < obj.length - 1) {
                        obj[zzaen] = com_google_android_gms_internal_zzbxl.readBytes();
                        com_google_android_gms_internal_zzbxl.zzaen();
                        zzaen++;
                    }
                    obj[zzaen] = com_google_android_gms_internal_zzbxl.readBytes();
                    this.zzbWD = obj;
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
        return zzab(com_google_android_gms_internal_zzbxl);
    }

    protected int zzu() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int zzu = super.zzu();
        if (this.zzbWB == null || this.zzbWB.length <= 0) {
            i = zzu;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.zzbWB) {
                if (str != null) {
                    i3++;
                    i2 += zzbxm.zzkb(str);
                }
            }
            i = (zzu + i2) + (i3 * 1);
        }
        if (this.zzbWC != null && this.zzbWC.length > 0) {
            i3 = 0;
            for (int zzu2 : this.zzbWC) {
                i3 += zzbxm.zzrf(zzu2);
            }
            i = (i + i3) + (this.zzbWC.length * 1);
        }
        if (this.zzbWD == null || this.zzbWD.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.zzbWD.length) {
            byte[] bArr = this.zzbWD[i4];
            if (bArr != null) {
                i3++;
                i2 += zzbxm.zzai(bArr);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }
}
