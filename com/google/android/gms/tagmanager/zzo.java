package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder.ContainerAvailableListener;

class zzo implements ContainerHolder {
    private boolean zzaLQ;
    private Status zzair;
    private Container zzbFg;
    private Container zzbFh;
    private zzb zzbFi;
    private zza zzbFj;
    private TagManager zzbFk;
    private final Looper zzrs;

    public interface zza {
        String zzQg();

        void zzQi();

        void zzgW(String str);
    }

    private class zzb extends Handler {
        private final ContainerAvailableListener zzbFl;
        final /* synthetic */ zzo zzbFm;

        public zzb(zzo com_google_android_gms_tagmanager_zzo, ContainerAvailableListener containerAvailableListener, Looper looper) {
            this.zzbFm = com_google_android_gms_tagmanager_zzo;
            super(looper);
            this.zzbFl = containerAvailableListener;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    zzgY((String) message.obj);
                    return;
                default:
                    zzbo.m11e("Don't know how to handle this message.");
                    return;
            }
        }

        public void zzgX(String str) {
            sendMessage(obtainMessage(1, str));
        }

        protected void zzgY(String str) {
            this.zzbFl.onContainerAvailable(this.zzbFm, str);
        }
    }

    public zzo(Status status) {
        this.zzair = status;
        this.zzrs = null;
    }

    public zzo(TagManager tagManager, Looper looper, Container container, zza com_google_android_gms_tagmanager_zzo_zza) {
        this.zzbFk = tagManager;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.zzrs = looper;
        this.zzbFg = container;
        this.zzbFj = com_google_android_gms_tagmanager_zzo_zza;
        this.zzair = Status.zzazx;
        tagManager.zza(this);
    }

    private void zzQh() {
        if (this.zzbFi != null) {
            this.zzbFi.zzgX(this.zzbFh.zzQe());
        }
    }

    public synchronized Container getContainer() {
        Container container = null;
        synchronized (this) {
            if (this.zzaLQ) {
                zzbo.m11e("ContainerHolder is released.");
            } else {
                if (this.zzbFh != null) {
                    this.zzbFg = this.zzbFh;
                    this.zzbFh = null;
                }
                container = this.zzbFg;
            }
        }
        return container;
    }

    String getContainerId() {
        if (!this.zzaLQ) {
            return this.zzbFg.getContainerId();
        }
        zzbo.m11e("getContainerId called on a released ContainerHolder.");
        return "";
    }

    public Status getStatus() {
        return this.zzair;
    }

    public synchronized void refresh() {
        if (this.zzaLQ) {
            zzbo.m11e("Refreshing a released ContainerHolder.");
        } else {
            this.zzbFj.zzQi();
        }
    }

    public synchronized void release() {
        if (this.zzaLQ) {
            zzbo.m11e("Releasing a released ContainerHolder.");
        } else {
            this.zzaLQ = true;
            this.zzbFk.zzb(this);
            this.zzbFg.release();
            this.zzbFg = null;
            this.zzbFh = null;
            this.zzbFj = null;
            this.zzbFi = null;
        }
    }

    public synchronized void setContainerAvailableListener(ContainerAvailableListener containerAvailableListener) {
        if (this.zzaLQ) {
            zzbo.m11e("ContainerHolder is released.");
        } else if (containerAvailableListener == null) {
            this.zzbFi = null;
        } else {
            this.zzbFi = new zzb(this, containerAvailableListener, this.zzrs);
            if (this.zzbFh != null) {
                zzQh();
            }
        }
    }

    String zzQg() {
        if (!this.zzaLQ) {
            return this.zzbFj.zzQg();
        }
        zzbo.m11e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }

    public synchronized void zza(Container container) {
        if (!this.zzaLQ) {
            if (container == null) {
                zzbo.m11e("Unexpected null container.");
            } else {
                this.zzbFh = container;
                zzQh();
            }
        }
    }

    public synchronized void zzgU(String str) {
        if (!this.zzaLQ) {
            this.zzbFg.zzgU(str);
        }
    }

    void zzgW(String str) {
        if (this.zzaLQ) {
            zzbo.m11e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.zzbFj.zzgW(str);
        }
    }
}
