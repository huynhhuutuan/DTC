package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaj.zzf;
import com.google.android.gms.internal.zzaj.zzj;
import java.io.IOException;

public interface zzbjd {

    public static final class zza extends zzbxn<zza> {
        public long zzbNi;
        public zzj zzbNj;
        public zzf zzlr;

        public zza() {
            zzTu();
        }

        public static zza zzQ(byte[] bArr) throws zzbxs {
            return (zza) zzbxt.zza(new zza(), bArr);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_internal_zzbjd_zza = (zza) obj;
            if (this.zzbNi != com_google_android_gms_internal_zzbjd_zza.zzbNi) {
                return false;
            }
            if (this.zzlr == null) {
                if (com_google_android_gms_internal_zzbjd_zza.zzlr != null) {
                    return false;
                }
            } else if (!this.zzlr.equals(com_google_android_gms_internal_zzbjd_zza.zzlr)) {
                return false;
            }
            if (this.zzbNj == null) {
                if (com_google_android_gms_internal_zzbjd_zza.zzbNj != null) {
                    return false;
                }
            } else if (!this.zzbNj.equals(com_google_android_gms_internal_zzbjd_zza.zzbNj)) {
                return false;
            }
            return (this.zzcuA == null || this.zzcuA.isEmpty()) ? com_google_android_gms_internal_zzbjd_zza.zzcuA == null || com_google_android_gms_internal_zzbjd_zza.zzcuA.isEmpty() : this.zzcuA.equals(com_google_android_gms_internal_zzbjd_zza.zzcuA);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.zzbNj == null ? 0 : this.zzbNj.hashCode()) + (((this.zzlr == null ? 0 : this.zzlr.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.zzbNi ^ (this.zzbNi >>> 32)))) * 31)) * 31)) * 31;
            if (!(this.zzcuA == null || this.zzcuA.isEmpty())) {
                i = this.zzcuA.hashCode();
            }
            return hashCode + i;
        }

        public zza zzTu() {
            this.zzbNi = 0;
            this.zzlr = null;
            this.zzbNj = null;
            this.zzcuA = null;
            this.zzcuJ = -1;
            return this;
        }

        public zza zzW(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            while (true) {
                int zzaen = com_google_android_gms_internal_zzbxl.zzaen();
                switch (zzaen) {
                    case 0:
                        break;
                    case 8:
                        this.zzbNi = com_google_android_gms_internal_zzbxl.zzaeq();
                        continue;
                    case 18:
                        if (this.zzlr == null) {
                            this.zzlr = new zzf();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzlr);
                        continue;
                    case 26:
                        if (this.zzbNj == null) {
                            this.zzbNj = new zzj();
                        }
                        com_google_android_gms_internal_zzbxl.zza(this.zzbNj);
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

        public void zza(zzbxm com_google_android_gms_internal_zzbxm) throws IOException {
            com_google_android_gms_internal_zzbxm.zzb(1, this.zzbNi);
            if (this.zzlr != null) {
                com_google_android_gms_internal_zzbxm.zza(2, this.zzlr);
            }
            if (this.zzbNj != null) {
                com_google_android_gms_internal_zzbxm.zza(3, this.zzbNj);
            }
            super.zza(com_google_android_gms_internal_zzbxm);
        }

        public /* synthetic */ zzbxt zzb(zzbxl com_google_android_gms_internal_zzbxl) throws IOException {
            return zzW(com_google_android_gms_internal_zzbxl);
        }

        protected int zzu() {
            int zzu = super.zzu() + zzbxm.zzf(1, this.zzbNi);
            if (this.zzlr != null) {
                zzu += zzbxm.zzc(2, this.zzlr);
            }
            return this.zzbNj != null ? zzu + zzbxm.zzc(3, this.zzbNj) : zzu;
        }
    }
}
