package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.util.zzp;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@zzme
public final class zzmv extends zza {
    public static final Creator<zzmv> CREATOR = new zzmw();
    ParcelFileDescriptor zzSQ;
    private Parcelable zzSR;
    private boolean zzSS;

    zzmv(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzSQ = parcelFileDescriptor;
        this.zzSR = null;
        this.zzSS = true;
    }

    public zzmv(SafeParcelable safeParcelable) {
        this.zzSQ = null;
        this.zzSR = safeParcelable;
        this.zzSS = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.zzSQ == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzSR.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.zzSQ = zzj(marshall);
            } finally {
                obtain.recycle();
            }
        }
        zzmw.zza(this, parcel, i);
    }

    public <T extends SafeParcelable> T zza(Creator<T> creator) {
        if (this.zzSS) {
            if (this.zzSQ == null) {
                zzqf.m9e("File descriptor is empty, returning null.");
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.zzSQ));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                zzp.zzb(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.zzSR = (SafeParcelable) creator.createFromParcel(obtain);
                    this.zzSS = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                zzp.zzb(dataInputStream);
            }
        }
        return (SafeParcelable) this.zzSR;
    }

    protected <T> ParcelFileDescriptor zzj(final byte[] bArr) {
        Throwable e;
        ParcelFileDescriptor parcelFileDescriptor = null;
        final Closeable autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new Runnable(this) {
                    public void run() {
                        Closeable dataOutputStream;
                        Throwable e;
                        try {
                            dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                zzp.zzb(dataOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    zzqf.zzb("Error transporting the ad response", e);
                                    zzw.zzcQ().zza(e, "LargeParcelTeleporter.pipeData.1");
                                    if (dataOutputStream != null) {
                                        zzp.zzb(autoCloseOutputStream);
                                    } else {
                                        zzp.zzb(dataOutputStream);
                                    }
                                } catch (Throwable th) {
                                    e = th;
                                    if (dataOutputStream != null) {
                                        zzp.zzb(autoCloseOutputStream);
                                    } else {
                                        zzp.zzb(dataOutputStream);
                                    }
                                    throw e;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            dataOutputStream = null;
                            zzqf.zzb("Error transporting the ad response", e);
                            zzw.zzcQ().zza(e, "LargeParcelTeleporter.pipeData.1");
                            if (dataOutputStream != null) {
                                zzp.zzb(dataOutputStream);
                            } else {
                                zzp.zzb(autoCloseOutputStream);
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            dataOutputStream = null;
                            if (dataOutputStream != null) {
                                zzp.zzb(dataOutputStream);
                            } else {
                                zzp.zzb(autoCloseOutputStream);
                            }
                            throw e;
                        }
                    }
                }).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = parcelFileDescriptor;
            zzqf.zzb("Error transporting the ad response", e);
            zzw.zzcQ().zza(e, "LargeParcelTeleporter.pipeData.2");
            zzp.zzb(autoCloseOutputStream);
            return parcelFileDescriptor;
        }
    }
}
