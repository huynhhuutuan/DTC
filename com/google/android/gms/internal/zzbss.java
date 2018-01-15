package com.google.android.gms.internal;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.media.TransportMediator;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class zzbss {
    private final Random zzcdx = new Random();
    private WritableByteChannel zzckA;
    private final Thread zzckd = zzbsm.getThreadFactory().newThread(new C05241(this));
    private zzbsm zzcku;
    private volatile boolean zzckx = false;
    private BlockingQueue<ByteBuffer> zzcky;
    private boolean zzckz = false;

    class C05241 implements Runnable {
        final /* synthetic */ zzbss zzckB;

        C05241(zzbss com_google_android_gms_internal_zzbss) {
            this.zzckB = com_google_android_gms_internal_zzbss;
        }

        public void run() {
            this.zzckB.zzabD();
        }
    }

    zzbss(zzbsm com_google_android_gms_internal_zzbsm, String str, int i) {
        zzbsm.zzabp().zza(zzabw(), new StringBuilder(String.valueOf(str).length() + 18).append(str).append("Writer-").append(i).toString());
        this.zzcku = com_google_android_gms_internal_zzbsm;
        this.zzcky = new LinkedBlockingQueue();
    }

    private ByteBuffer zza(byte b, boolean z, byte[] bArr) throws IOException {
        int i = 2;
        if (z) {
            i = 6;
        }
        int length = bArr.length;
        if (length >= TransportMediator.KEYCODE_MEDIA_PLAY) {
            i = length <= SupportMenu.USER_MASK ? i + 2 : i + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + bArr.length);
        allocate.put((byte) (b | -128));
        if (length < TransportMediator.KEYCODE_MEDIA_PLAY) {
            allocate.put((byte) (z ? length | 128 : length));
        } else if (length <= SupportMenu.USER_MASK) {
            allocate.put((byte) (z ? 254 : TransportMediator.KEYCODE_MEDIA_PLAY));
            allocate.putShort((short) length);
        } else {
            i = TransportMediator.KEYCODE_MEDIA_PAUSE;
            if (z) {
                i = 255;
            }
            allocate.put((byte) i);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z) {
            byte[] zzabA = zzabA();
            allocate.put(zzabA);
            for (i = 0; i < bArr.length; i++) {
                allocate.put((byte) (bArr[i] ^ zzabA[i % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    private byte[] zzabA() {
        byte[] bArr = new byte[4];
        this.zzcdx.nextBytes(bArr);
        return bArr;
    }

    private void zzabB() throws InterruptedException, IOException {
        this.zzckA.write((ByteBuffer) this.zzcky.take());
    }

    private void zzabD() {
        while (!this.zzckx && !Thread.interrupted()) {
            try {
                zzabB();
            } catch (Throwable e) {
                zzc(new zzbso("IO Exception", e));
                return;
            } catch (InterruptedException e2) {
                return;
            }
        }
        for (int i = 0; i < this.zzcky.size(); i++) {
            zzabB();
        }
    }

    private void zzc(zzbso com_google_android_gms_internal_zzbso) {
        this.zzcku.zzb(com_google_android_gms_internal_zzbso);
    }

    void zzabC() {
        this.zzckx = true;
    }

    Thread zzabw() {
        return this.zzckd;
    }

    synchronized void zzb(byte b, boolean z, byte[] bArr) throws IOException {
        ByteBuffer zza = zza(b, z, bArr);
        if (!this.zzckx || (!this.zzckz && b == (byte) 8)) {
            if (b == (byte) 8) {
                this.zzckz = true;
            }
            this.zzcky.add(zza);
        } else {
            throw new zzbso("Shouldn't be sending");
        }
    }

    void zzb(OutputStream outputStream) {
        this.zzckA = Channels.newChannel(outputStream);
    }
}
