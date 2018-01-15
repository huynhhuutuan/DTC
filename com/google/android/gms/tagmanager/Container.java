package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaj.zzf;
import com.google.android.gms.internal.zzaj.zzi;
import com.google.android.gms.internal.zzaj.zzj;
import com.google.android.gms.internal.zzbjf;
import com.google.android.gms.internal.zzbjf.zzc;
import com.google.android.gms.internal.zzbjf.zzg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container {
    private final Context mContext;
    private final String zzbEY;
    private final DataLayer zzbEZ;
    private zzcx zzbFa;
    private Map<String, FunctionCallMacroCallback> zzbFb = new HashMap();
    private Map<String, FunctionCallTagCallback> zzbFc = new HashMap();
    private volatile long zzbFd;
    private volatile String zzbFe = "";

    public interface FunctionCallMacroCallback {
        Object getValue(String str, Map<String, Object> map);
    }

    public interface FunctionCallTagCallback {
        void execute(String str, Map<String, Object> map);
    }

    private class zza implements com.google.android.gms.tagmanager.zzu.zza {
        final /* synthetic */ Container zzbFf;

        private zza(Container container) {
            this.zzbFf = container;
        }

        public Object zze(String str, Map<String, Object> map) {
            FunctionCallMacroCallback zzgS = this.zzbFf.zzgS(str);
            return zzgS == null ? null : zzgS.getValue(str, map);
        }
    }

    private class zzb implements com.google.android.gms.tagmanager.zzu.zza {
        final /* synthetic */ Container zzbFf;

        private zzb(Container container) {
            this.zzbFf = container;
        }

        public Object zze(String str, Map<String, Object> map) {
            FunctionCallTagCallback zzgT = this.zzbFf.zzgT(str);
            if (zzgT != null) {
                zzgT.execute(str, map);
            }
            return zzdl.zzRP();
        }
    }

    Container(Context context, DataLayer dataLayer, String str, long j, zzj com_google_android_gms_internal_zzaj_zzj) {
        this.mContext = context;
        this.zzbEZ = dataLayer;
        this.zzbEY = str;
        this.zzbFd = j;
        zza(com_google_android_gms_internal_zzaj_zzj.zzlr);
        if (com_google_android_gms_internal_zzaj_zzj.zzlq != null) {
            zza(com_google_android_gms_internal_zzaj_zzj.zzlq);
        }
    }

    Container(Context context, DataLayer dataLayer, String str, long j, zzc com_google_android_gms_internal_zzbjf_zzc) {
        this.mContext = context;
        this.zzbEZ = dataLayer;
        this.zzbEY = str;
        this.zzbFd = j;
        zza(com_google_android_gms_internal_zzbjf_zzc);
    }

    private synchronized zzcx zzQf() {
        return this.zzbFa;
    }

    private void zza(zzf com_google_android_gms_internal_zzaj_zzf) {
        if (com_google_android_gms_internal_zzaj_zzf == null) {
            throw new NullPointerException();
        }
        try {
            zza(zzbjf.zzb(com_google_android_gms_internal_zzaj_zzf));
        } catch (zzg e) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzaj_zzf);
            String valueOf2 = String.valueOf(e.toString());
            zzbo.m11e(new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(valueOf2).length()).append("Not loading resource: ").append(valueOf).append(" because it is invalid: ").append(valueOf2).toString());
        }
    }

    private void zza(zzc com_google_android_gms_internal_zzbjf_zzc) {
        this.zzbFe = com_google_android_gms_internal_zzbjf_zzc.getVersion();
        zzc com_google_android_gms_internal_zzbjf_zzc2 = com_google_android_gms_internal_zzbjf_zzc;
        zza(new zzcx(this.mContext, com_google_android_gms_internal_zzbjf_zzc2, this.zzbEZ, new zza(), new zzb(), zzgV(this.zzbFe)));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzbEZ.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", this.zzbEY));
        }
    }

    private synchronized void zza(zzcx com_google_android_gms_tagmanager_zzcx) {
        this.zzbFa = com_google_android_gms_tagmanager_zzcx;
    }

    private void zza(zzi[] com_google_android_gms_internal_zzaj_zziArr) {
        List arrayList = new ArrayList();
        for (Object add : com_google_android_gms_internal_zzaj_zziArr) {
            arrayList.add(add);
        }
        zzQf().zzQ(arrayList);
    }

    public boolean getBoolean(String str) {
        zzcx zzQf = zzQf();
        if (zzQf == null) {
            zzbo.m11e("getBoolean called for closed container.");
            return zzdl.zzRN().booleanValue();
        }
        try {
            return zzdl.zzi((com.google.android.gms.internal.zzak.zza) zzQf.zzhq(str).getObject()).booleanValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbo.m11e(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Calling getBoolean() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzRN().booleanValue();
        }
    }

    public String getContainerId() {
        return this.zzbEY;
    }

    public double getDouble(String str) {
        zzcx zzQf = zzQf();
        if (zzQf == null) {
            zzbo.m11e("getDouble called for closed container.");
            return zzdl.zzRM().doubleValue();
        }
        try {
            return zzdl.zzh((com.google.android.gms.internal.zzak.zza) zzQf.zzhq(str).getObject()).doubleValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbo.m11e(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getDouble() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzRM().doubleValue();
        }
    }

    public long getLastRefreshTime() {
        return this.zzbFd;
    }

    public long getLong(String str) {
        zzcx zzQf = zzQf();
        if (zzQf == null) {
            zzbo.m11e("getLong called for closed container.");
            return zzdl.zzRL().longValue();
        }
        try {
            return zzdl.zzg((com.google.android.gms.internal.zzak.zza) zzQf.zzhq(str).getObject()).longValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbo.m11e(new StringBuilder(String.valueOf(valueOf).length() + 63).append("Calling getLong() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzRL().longValue();
        }
    }

    public String getString(String str) {
        zzcx zzQf = zzQf();
        if (zzQf == null) {
            zzbo.m11e("getString called for closed container.");
            return zzdl.zzRP();
        }
        try {
            return zzdl.zze((com.google.android.gms.internal.zzak.zza) zzQf.zzhq(str).getObject());
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbo.m11e(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getString() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return zzdl.zzRP();
        }
    }

    public boolean isDefault() {
        return getLastRefreshTime() == 0;
    }

    public void registerFunctionCallMacroCallback(String str, FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (this.zzbFb) {
            this.zzbFb.put(str, functionCallMacroCallback);
        }
    }

    public void registerFunctionCallTagCallback(String str, FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (this.zzbFc) {
            this.zzbFc.put(str, functionCallTagCallback);
        }
    }

    void release() {
        this.zzbFa = null;
    }

    public void unregisterFunctionCallMacroCallback(String str) {
        synchronized (this.zzbFb) {
            this.zzbFb.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(String str) {
        synchronized (this.zzbFc) {
            this.zzbFc.remove(str);
        }
    }

    public String zzQe() {
        return this.zzbFe;
    }

    FunctionCallMacroCallback zzgS(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zzbFb) {
            functionCallMacroCallback = (FunctionCallMacroCallback) this.zzbFb.get(str);
        }
        return functionCallMacroCallback;
    }

    public FunctionCallTagCallback zzgT(String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzbFc) {
            functionCallTagCallback = (FunctionCallTagCallback) this.zzbFc.get(str);
        }
        return functionCallTagCallback;
    }

    public void zzgU(String str) {
        zzQf().zzgU(str);
    }

    zzaj zzgV(String str) {
        zzcj.zzRd().zzRe().equals(zza.CONTAINER_DEBUG);
        return new zzbw();
    }
}
