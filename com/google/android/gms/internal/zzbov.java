package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class zzbov extends Reader {
    private boolean closed;
    private List<String> zzcdE;
    private int zzcdF;
    private int zzcdG;
    private int zzcdH;
    private int zzcdI;
    private boolean zzcdJ;

    public zzbov() {
        this.zzcdE = null;
        this.closed = false;
        this.zzcdH = this.zzcdF;
        this.zzcdI = this.zzcdG;
        this.zzcdJ = false;
        this.zzcdE = new ArrayList();
    }

    private String zzYj() {
        return this.zzcdG < this.zzcdE.size() ? (String) this.zzcdE.get(this.zzcdG) : null;
    }

    private int zzYk() {
        String zzYj = zzYj();
        return zzYj == null ? 0 : zzYj.length() - this.zzcdF;
    }

    private void zzYl() throws IOException {
        if (this.closed) {
            throw new IOException("Stream already closed");
        } else if (!this.zzcdJ) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    private long zzaN(long j) {
        long j2 = 0;
        while (this.zzcdG < this.zzcdE.size() && j2 < j) {
            int zzYk = zzYk();
            long j3 = j - j2;
            if (j3 < ((long) zzYk)) {
                this.zzcdF = (int) (((long) this.zzcdF) + j3);
                j2 += j3;
            } else {
                j2 += (long) zzYk;
                this.zzcdF = 0;
                this.zzcdG++;
            }
        }
        return j2;
    }

    public void close() throws IOException {
        zzYl();
        this.closed = true;
    }

    public void mark(int i) throws IOException {
        zzYl();
        this.zzcdH = this.zzcdF;
        this.zzcdI = this.zzcdG;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() throws IOException {
        zzYl();
        String zzYj = zzYj();
        if (zzYj == null) {
            return -1;
        }
        char charAt = zzYj.charAt(this.zzcdF);
        zzaN(1);
        return charAt;
    }

    public int read(CharBuffer charBuffer) throws IOException {
        zzYl();
        int remaining = charBuffer.remaining();
        int i = 0;
        String zzYj = zzYj();
        while (remaining > 0 && zzYj != null) {
            int min = Math.min(zzYj.length() - this.zzcdF, remaining);
            charBuffer.put((String) this.zzcdE.get(this.zzcdG), this.zzcdF, this.zzcdF + min);
            remaining -= min;
            i += min;
            zzaN((long) min);
            zzYj = zzYj();
        }
        return (i > 0 || zzYj != null) ? i : -1;
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        zzYl();
        int i3 = 0;
        String zzYj = zzYj();
        while (zzYj != null && i3 < i2) {
            int min = Math.min(zzYk(), i2 - i3);
            zzYj.getChars(this.zzcdF, this.zzcdF + min, cArr, i + i3);
            int i4 = i3 + min;
            zzaN((long) min);
            i3 = i4;
            zzYj = zzYj();
        }
        return (i3 > 0 || zzYj != null) ? i3 : -1;
    }

    public boolean ready() throws IOException {
        zzYl();
        return true;
    }

    public void reset() throws IOException {
        this.zzcdF = this.zzcdH;
        this.zzcdG = this.zzcdI;
    }

    public long skip(long j) throws IOException {
        zzYl();
        return zzaN(j);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : this.zzcdE) {
            stringBuilder.append(append);
        }
        return stringBuilder.toString();
    }

    public void zzYi() {
        if (this.zzcdJ) {
            throw new IllegalStateException("Trying to freeze frozen StringListReader");
        }
        this.zzcdJ = true;
    }

    public void zziT(String str) {
        if (this.zzcdJ) {
            throw new IllegalStateException("Trying to add string after reading");
        } else if (str.length() > 0) {
            this.zzcdE.add(str);
        }
    }
}
