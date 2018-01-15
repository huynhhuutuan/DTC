package com.google.android.gms.internal;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

class zzbsr {
    private zzbsn zzcjY = null;
    private DataInputStream zzckt = null;
    private zzbsm zzcku = null;
    private byte[] zzckv = new byte[112];
    private zzb zzckw;
    private volatile boolean zzckx = false;

    zzbsr(zzbsm com_google_android_gms_internal_zzbsm) {
        this.zzcku = com_google_android_gms_internal_zzbsm;
    }

    private int read(byte[] bArr, int i, int i2) throws IOException {
        this.zzckt.readFully(bArr, i, i2);
        return i2;
    }

    private void zzZ(byte[] bArr) {
        if (bArr.length <= 125) {
            this.zzcku.zzY(bArr);
            return;
        }
        throw new zzbso("PING frame too long");
    }

    private void zza(boolean z, byte b, byte[] bArr) {
        if (b == (byte) 9) {
            if (z) {
                zzZ(bArr);
                return;
            }
            throw new zzbso("PING must not fragment across frames");
        } else if (this.zzckw != null && b != (byte) 0) {
            throw new zzbso("Failed to continue outstanding frame");
        } else if (this.zzckw == null && b == (byte) 0) {
            throw new zzbso("Received continuing frame, but there's nothing to continue");
        } else {
            if (this.zzckw == null) {
                this.zzckw = zzbsk.zzb(b);
            }
            if (!this.zzckw.zzW(bArr)) {
                throw new zzbso("Failed to decode frame");
            } else if (z) {
                zzbsq zzabm = this.zzckw.zzabm();
                this.zzckw = null;
                this.zzcjY.zza(zzabm);
            }
        }
    }

    private void zzc(zzbso com_google_android_gms_internal_zzbso) {
        zzabz();
        this.zzcku.zzb(com_google_android_gms_internal_zzbso);
    }

    private long zze(byte[] bArr, int i) {
        return (((((((((long) bArr[i + 0]) << 56) + (((long) (bArr[i + 1] & 255)) << 48)) + (((long) (bArr[i + 2] & 255)) << 40)) + (((long) (bArr[i + 3] & 255)) << 32)) + (((long) (bArr[i + 4] & 255)) << 24)) + ((long) ((bArr[i + 5] & 255) << 16))) + ((long) ((bArr[i + 6] & 255) << 8))) + ((long) ((bArr[i + 7] & 255) << 0));
    }

    void run() {
        this.zzcjY = this.zzcku.zzabq();
        while (!this.zzckx) {
            try {
                int read = read(this.zzckv, 0, 1) + 0;
                boolean z = (this.zzckv[0] & 128) != 0;
                if (((this.zzckv[0] & 112) != 0 ? 1 : null) != null) {
                    throw new zzbso("Invalid frame received");
                }
                byte b = (byte) (this.zzckv[0] & 15);
                int read2 = read + read(this.zzckv, read, 1);
                byte b2 = this.zzckv[1];
                long j = 0;
                if (b2 < (byte) 126) {
                    j = (long) b2;
                } else if (b2 == (byte) 126) {
                    read(this.zzckv, read2, 2);
                    j = (long) (((this.zzckv[2] & 255) << 8) | (this.zzckv[3] & 255));
                } else if (b2 == Byte.MAX_VALUE) {
                    j = zze(this.zzckv, (read(this.zzckv, read2, 8) + read2) - 8);
                }
                byte[] bArr = new byte[((int) j)];
                read(bArr, 0, (int) j);
                if (b == (byte) 8) {
                    this.zzcku.zzabr();
                } else if (b == (byte) 10) {
                    continue;
                } else if (b == (byte) 1 || b == (byte) 2 || b == (byte) 9 || b == (byte) 0) {
                    zza(z, b, bArr);
                } else {
                    throw new zzbso("Unsupported opcode: " + b);
                }
            } catch (SocketTimeoutException e) {
            } catch (Throwable e2) {
                zzc(new zzbso("IO Error", e2));
            } catch (zzbso e3) {
                zzc(e3);
            }
        }
    }

    void zza(DataInputStream dataInputStream) {
        this.zzckt = dataInputStream;
    }

    void zzabz() {
        this.zzckx = true;
    }
}
