package com.google.android.gms.internal;

import io.fabric.sdk.android.services.network.UrlUtils;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

class zzbsk {

    interface zzb {
        boolean zzW(byte[] bArr);

        zzbsq zzabm();
    }

    static class zza implements zzb {
        private List<byte[]> zzcjP = new ArrayList();
        private int zzcjQ = 0;

        zza() {
        }

        public boolean zzW(byte[] bArr) {
            this.zzcjP.add(bArr);
            this.zzcjQ += bArr.length;
            return true;
        }

        public zzbsq zzabm() {
            byte[] bArr = new byte[this.zzcjQ];
            int i = 0;
            for (int i2 = 0; i2 < this.zzcjP.size(); i2++) {
                byte[] bArr2 = (byte[]) this.zzcjP.get(i2);
                System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
                i += bArr2.length;
            }
            return new zzbsq(bArr);
        }
    }

    static class zzc implements zzb {
        private static ThreadLocal<CharsetDecoder> zzcjR = new C05201();
        private static ThreadLocal<CharsetEncoder> zzcjS = new C05212();
        private StringBuilder zzcjT = new StringBuilder();

        class C05201 extends ThreadLocal<CharsetDecoder> {
            C05201() {
            }

            protected /* synthetic */ Object initialValue() {
                return zzabn();
            }

            protected CharsetDecoder zzabn() {
                CharsetDecoder newDecoder = Charset.forName(UrlUtils.UTF8).newDecoder();
                newDecoder.onMalformedInput(CodingErrorAction.REPORT);
                newDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newDecoder;
            }
        }

        class C05212 extends ThreadLocal<CharsetEncoder> {
            C05212() {
            }

            protected /* synthetic */ Object initialValue() {
                return zzabo();
            }

            protected CharsetEncoder zzabo() {
                CharsetEncoder newEncoder = Charset.forName(UrlUtils.UTF8).newEncoder();
                newEncoder.onMalformedInput(CodingErrorAction.REPORT);
                newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
                return newEncoder;
            }
        }

        zzc() {
        }

        private String zzX(byte[] bArr) {
            try {
                return ((CharsetDecoder) zzcjR.get()).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException e) {
                return null;
            }
        }

        public boolean zzW(byte[] bArr) {
            String zzX = zzX(bArr);
            if (zzX == null) {
                return false;
            }
            this.zzcjT.append(zzX);
            return true;
        }

        public zzbsq zzabm() {
            return new zzbsq(this.zzcjT.toString());
        }
    }

    static zzb zzb(byte b) {
        return b == (byte) 2 ? new zza() : new zzc();
    }
}
