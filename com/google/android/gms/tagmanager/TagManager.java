package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RawRes;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.PendingResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    private static TagManager zzbIy;
    private final Context mContext;
    private final DataLayer zzbEZ;
    private final zzt zzbHy;
    private final zza zzbIv;
    private final zzdb zzbIw;
    private final ConcurrentMap<String, zzo> zzbIx;

    class C06933 implements ComponentCallbacks2 {
        final /* synthetic */ TagManager zzbIz;

        C06933(TagManager tagManager) {
            this.zzbIz = tagManager;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i == 20) {
                this.zzbIz.dispatch();
            }
        }
    }

    public interface zza {
        zzp zza(Context context, TagManager tagManager, Looper looper, String str, int i, zzt com_google_android_gms_tagmanager_zzt);
    }

    class C11331 implements zzb {
        final /* synthetic */ TagManager zzbIz;

        C11331(TagManager tagManager) {
            this.zzbIz = tagManager;
        }

        public void zzaa(Map<String, Object> map) {
            Object obj = map.get("event");
            if (obj != null) {
                this.zzbIz.zzhs(obj.toString());
            }
        }
    }

    class C11342 implements zza {
        C11342() {
        }

        public zzp zza(Context context, TagManager tagManager, Looper looper, String str, int i, zzt com_google_android_gms_tagmanager_zzt) {
            return new zzp(context, tagManager, looper, str, i, com_google_android_gms_tagmanager_zzt);
        }
    }

    TagManager(Context context, zza com_google_android_gms_tagmanager_TagManager_zza, DataLayer dataLayer, zzdb com_google_android_gms_tagmanager_zzdb) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.zzbIw = com_google_android_gms_tagmanager_zzdb;
        this.zzbIv = com_google_android_gms_tagmanager_TagManager_zza;
        this.zzbIx = new ConcurrentHashMap();
        this.zzbEZ = dataLayer;
        this.zzbEZ.zza(new C11331(this));
        this.zzbEZ.zza(new zzd(this.mContext));
        this.zzbHy = new zzt();
        zzRD();
        zzRE();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (zzbIy == null) {
                if (context == null) {
                    zzbo.m11e("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                zzbIy = new TagManager(context, new C11342(), new DataLayer(new zzx(context)), zzdc.zzRx());
            }
            tagManager = zzbIy;
        }
        return tagManager;
    }

    @TargetApi(14)
    private void zzRD() {
        int i = VERSION.SDK_INT;
        this.mContext.registerComponentCallbacks(new C06933(this));
    }

    private void zzRE() {
        zza.zzbS(this.mContext);
    }

    private void zzhs(String str) {
        for (zzo zzgU : this.zzbIx.values()) {
            zzgU.zzgU(str);
        }
    }

    public void dispatch() {
        this.zzbIw.dispatch();
    }

    public DataLayer getDataLayer() {
        return this.zzbEZ;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, @RawRes int i) {
        PendingResult zza = this.zzbIv.zza(this.mContext, this, null, str, i, this.zzbHy);
        zza.zzQj();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, @RawRes int i, Handler handler) {
        PendingResult zza = this.zzbIv.zza(this.mContext, this, handler.getLooper(), str, i, this.zzbHy);
        zza.zzQj();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, @RawRes int i) {
        PendingResult zza = this.zzbIv.zza(this.mContext, this, null, str, i, this.zzbHy);
        zza.zzQl();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, @RawRes int i, Handler handler) {
        PendingResult zza = this.zzbIv.zza(this.mContext, this, handler.getLooper(), str, i, this.zzbHy);
        zza.zzQl();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, @RawRes int i) {
        PendingResult zza = this.zzbIv.zza(this.mContext, this, null, str, i, this.zzbHy);
        zza.zzQk();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, @RawRes int i, Handler handler) {
        PendingResult zza = this.zzbIv.zza(this.mContext, this, handler.getLooper(), str, i, this.zzbHy);
        zza.zzQk();
        return zza;
    }

    public void setVerboseLoggingEnabled(boolean z) {
        zzbo.setLogLevel(z ? 2 : 5);
    }

    public int zza(zzo com_google_android_gms_tagmanager_zzo) {
        this.zzbIx.put(com_google_android_gms_tagmanager_zzo.getContainerId(), com_google_android_gms_tagmanager_zzo);
        return this.zzbIx.size();
    }

    public boolean zzb(zzo com_google_android_gms_tagmanager_zzo) {
        return this.zzbIx.remove(com_google_android_gms_tagmanager_zzo.getContainerId()) != null;
    }

    synchronized boolean zzv(Uri uri) {
        boolean z;
        zzcj zzRd = zzcj.zzRd();
        if (zzRd.zzv(uri)) {
            String containerId = zzRd.getContainerId();
            switch (zzRd.zzRe()) {
                case NONE:
                    zzo com_google_android_gms_tagmanager_zzo = (zzo) this.zzbIx.get(containerId);
                    if (com_google_android_gms_tagmanager_zzo != null) {
                        com_google_android_gms_tagmanager_zzo.zzgW(null);
                        com_google_android_gms_tagmanager_zzo.refresh();
                        break;
                    }
                    break;
                case CONTAINER:
                case CONTAINER_DEBUG:
                    for (String str : this.zzbIx.keySet()) {
                        zzo com_google_android_gms_tagmanager_zzo2 = (zzo) this.zzbIx.get(str);
                        if (str.equals(containerId)) {
                            com_google_android_gms_tagmanager_zzo2.zzgW(zzRd.zzRf());
                            com_google_android_gms_tagmanager_zzo2.refresh();
                        } else if (com_google_android_gms_tagmanager_zzo2.zzQg() != null) {
                            com_google_android_gms_tagmanager_zzo2.zzgW(null);
                            com_google_android_gms_tagmanager_zzo2.refresh();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
