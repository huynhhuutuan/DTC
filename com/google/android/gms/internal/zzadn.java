package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class zzadn implements zzadi {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Pattern zzaII = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    private static final Pattern zzaIJ = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    static abstract class zza extends com.google.android.gms.internal.zzady.zza {
        zza() {
        }

        public void zzJ(Status status) {
            throw new UnsupportedOperationException();
        }

        public void zza(Status status, zzadw com_google_android_gms_internal_zzadw) {
            throw new UnsupportedOperationException();
        }

        public void zza(Status status, Map map) {
            throw new UnsupportedOperationException();
        }

        public void zza(Status status, byte[] bArr) {
            throw new UnsupportedOperationException();
        }
    }

    public static class zzd implements com.google.android.gms.internal.zzadi.zzb {
        private final Map<String, TreeMap<String, byte[]>> zzaIN;
        private final long zzaIO;
        private final List<byte[]> zzaIP;
        private final Status zzair;

        public zzd(Status status, Map<String, TreeMap<String, byte[]>> map) {
            this(status, (Map) map, -1);
        }

        public zzd(Status status, Map<String, TreeMap<String, byte[]>> map, long j) {
            this(status, map, j, null);
        }

        public zzd(Status status, Map<String, TreeMap<String, byte[]>> map, long j, List<byte[]> list) {
            this.zzair = status;
            this.zzaIN = map;
            this.zzaIO = j;
            this.zzaIP = list;
        }

        public zzd(Status status, Map<String, TreeMap<String, byte[]>> map, List<byte[]> list) {
            this(status, map, -1, list);
        }

        public Status getStatus() {
            return this.zzair;
        }

        public long getThrottleEndTimeMillis() {
            return this.zzaIO;
        }

        public boolean zzI(String str, String str2) {
            return (this.zzaIN == null || this.zzaIN.get(str2) == null) ? false : ((TreeMap) this.zzaIN.get(str2)).get(str) != null;
        }

        public byte[] zza(String str, byte[] bArr, String str2) {
            return zzI(str, str2) ? (byte[]) ((TreeMap) this.zzaIN.get(str2)).get(str) : bArr;
        }

        public List<byte[]> zzzD() {
            return this.zzaIP;
        }

        public Map<String, Set<String>> zzzE() {
            Map<String, Set<String>> hashMap = new HashMap();
            if (this.zzaIN != null) {
                for (String str : this.zzaIN.keySet()) {
                    Map map = (Map) this.zzaIN.get(str);
                    if (map != null) {
                        hashMap.put(str, map.keySet());
                    }
                }
            }
            return hashMap;
        }
    }

    static abstract class zzb<R extends Result> extends com.google.android.gms.internal.zzaad.zza<R, zzadp> {
        public zzb(GoogleApiClient googleApiClient) {
            super(zzadh.API, googleApiClient);
        }

        public /* synthetic */ void setResult(Object obj) {
            super.zzb((Result) obj);
        }

        protected abstract void zza(Context context, zzadz com_google_android_gms_internal_zzadz) throws RemoteException;

        protected final void zza(zzadp com_google_android_gms_internal_zzadp) throws RemoteException {
            zza(com_google_android_gms_internal_zzadp.getContext(), (zzadz) com_google_android_gms_internal_zzadp.zzxD());
        }
    }

    static abstract class zzc extends zzb<com.google.android.gms.internal.zzadi.zzb> {
        protected zzady zzaIL = new C12461(this);

        class C12461 extends zza {
            final /* synthetic */ zzc zzaIM;

            C12461(zzc com_google_android_gms_internal_zzadn_zzc) {
                this.zzaIM = com_google_android_gms_internal_zzadn_zzc;
            }

            public void zza(Status status, zzadw com_google_android_gms_internal_zzadw) {
                if (com_google_android_gms_internal_zzadw.getStatusCode() == 6502 || com_google_android_gms_internal_zzadw.getStatusCode() == 6507) {
                    this.zzaIM.zzb(new zzd(zzadn.zzdv(com_google_android_gms_internal_zzadw.getStatusCode()), zzadn.zza(com_google_android_gms_internal_zzadw), com_google_android_gms_internal_zzadw.getThrottleEndTimeMillis(), zzadn.zzb(com_google_android_gms_internal_zzadw)));
                } else {
                    this.zzaIM.zzb(new zzd(zzadn.zzdv(com_google_android_gms_internal_zzadw.getStatusCode()), zzadn.zza(com_google_android_gms_internal_zzadw), zzadn.zzb(com_google_android_gms_internal_zzadw)));
                }
            }
        }

        public zzc(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }
    }

    private static HashMap<String, TreeMap<String, byte[]>> zza(zzadw com_google_android_gms_internal_zzadw) {
        if (com_google_android_gms_internal_zzadw == null) {
            return null;
        }
        DataHolder zzzL = com_google_android_gms_internal_zzadw.zzzL();
        if (zzzL == null) {
            return null;
        }
        zzaea com_google_android_gms_internal_zzaea = (zzaea) new com.google.android.gms.common.data.zzd(zzzL, zzaea.CREATOR).get(0);
        com_google_android_gms_internal_zzadw.zzzN();
        HashMap<String, TreeMap<String, byte[]>> hashMap = new HashMap();
        for (String str : com_google_android_gms_internal_zzaea.zzzP().keySet()) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(str, treeMap);
            Bundle bundle = com_google_android_gms_internal_zzaea.zzzP().getBundle(str);
            for (String str2 : bundle.keySet()) {
                treeMap.put(str2, bundle.getByteArray(str2));
            }
        }
        return hashMap;
    }

    @Nullable
    static List<byte[]> zzb(@Nullable zzadw com_google_android_gms_internal_zzadw) {
        if (com_google_android_gms_internal_zzadw == null) {
            return null;
        }
        DataHolder zzzM = com_google_android_gms_internal_zzadw.zzzM();
        if (zzzM == null) {
            return null;
        }
        List<byte[]> arrayList = new ArrayList();
        for (zzadq payload : new com.google.android.gms.common.data.zzd(zzzM, zzadq.CREATOR)) {
            arrayList.add(payload.getPayload());
        }
        com_google_android_gms_internal_zzadw.zzzO();
        return arrayList;
    }

    private static Status zzdv(int i) {
        return new Status(i, zzadj.getStatusCodeString(i));
    }

    public PendingResult<com.google.android.gms.internal.zzadi.zzb> zza(GoogleApiClient googleApiClient, final com.google.android.gms.internal.zzadi.zza com_google_android_gms_internal_zzadi_zza) {
        return (googleApiClient == null || com_google_android_gms_internal_zzadi_zza == null) ? null : googleApiClient.zza(new zzc(this, googleApiClient) {
            protected com.google.android.gms.internal.zzadi.zzb zzI(Status status) {
                return new zzd(status, new HashMap());
            }

            protected void zza(Context context, zzadz com_google_android_gms_internal_zzadz) throws RemoteException {
                String id;
                String token;
                Throwable e;
                com.google.android.gms.common.data.DataHolder.zza zzxj = com.google.android.gms.common.data.zzd.zzxj();
                for (Entry entry : com_google_android_gms_internal_zzadi_zza.zzzy().entrySet()) {
                    com.google.android.gms.common.data.zzd.zza(zzxj, new zzads((String) entry.getKey(), (String) entry.getValue()));
                }
                DataHolder zzcK = zzxj.zzcK(0);
                String zzwQ = zzaba.zzaQ(context) == Status.zzazx ? zzaba.zzwQ() : null;
                try {
                    id = com.google.firebase.iid.zzc.zzabK().getId();
                    try {
                        token = com.google.firebase.iid.zzc.zzabK().getToken();
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (Log.isLoggable("ConfigApiImpl", 3)) {
                            Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                        }
                        token = null;
                        com_google_android_gms_internal_zzadz.zza(this.zzaIL, new zzadu(context.getPackageName(), com_google_android_gms_internal_zzadi_zza.zzzx(), zzcK, zzwQ, id, token, null, com_google_android_gms_internal_zzadi_zza.zzzz(), zzadm.zzbk(context), com_google_android_gms_internal_zzadi_zza.zzzA(), com_google_android_gms_internal_zzadi_zza.zzzB()));
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    id = null;
                    if (Log.isLoggable("ConfigApiImpl", 3)) {
                        Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                    }
                    token = null;
                    com_google_android_gms_internal_zzadz.zza(this.zzaIL, new zzadu(context.getPackageName(), com_google_android_gms_internal_zzadi_zza.zzzx(), zzcK, zzwQ, id, token, null, com_google_android_gms_internal_zzadi_zza.zzzz(), zzadm.zzbk(context), com_google_android_gms_internal_zzadi_zza.zzzA(), com_google_android_gms_internal_zzadi_zza.zzzB()));
                }
                try {
                    com_google_android_gms_internal_zzadz.zza(this.zzaIL, new zzadu(context.getPackageName(), com_google_android_gms_internal_zzadi_zza.zzzx(), zzcK, zzwQ, id, token, null, com_google_android_gms_internal_zzadi_zza.zzzz(), zzadm.zzbk(context), com_google_android_gms_internal_zzadi_zza.zzzA(), com_google_android_gms_internal_zzadi_zza.zzzB()));
                } finally {
                    zzcK.close();
                }
            }

            protected /* synthetic */ Result zzc(Status status) {
                return zzI(status);
            }
        });
    }
}
