package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzboq implements com.google.android.gms.internal.zzboj.zza, zzbop {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzboq.class.desiredAssertionStatus());
    private static long zzcbv = 0;
    private final zzbrn zzcaJ;
    private final ScheduledExecutorService zzcax;
    private final zzbok zzcbH;
    private final com.google.android.gms.internal.zzbop.zza zzcbO;
    private String zzcbP;
    private HashSet<String> zzcbQ = new HashSet();
    private boolean zzcbR = true;
    private long zzcbS;
    private zzboj zzcbT;
    private zzb zzcbU = zzb.Disconnected;
    private long zzcbV = 0;
    private long zzcbW = 0;
    private Map<Long, zza> zzcbX;
    private List<zzd> zzcbY;
    private Map<Long, zzf> zzcbZ;
    private final zzbon zzcbw;
    private Map<zzc, zze> zzcca;
    private String zzccb;
    private boolean zzccc;
    private final zzbol zzccd;
    private final zzbou zzcce;
    private String zzccf;
    private long zzccg = 0;
    private int zzcch = 0;
    private ScheduledFuture<?> zzcci = null;
    private long zzccj;
    private boolean zzcck;

    class C04837 implements Runnable {
        final /* synthetic */ zzboq zzccm;

        C04837(zzboq com_google_android_gms_internal_zzboq) {
            this.zzccm = com_google_android_gms_internal_zzboq;
        }

        public void run() {
            this.zzccm.zzcci = null;
            if (this.zzccm.zzXM()) {
                this.zzccm.interrupt("connection_idle");
            } else {
                this.zzccm.zzXL();
            }
        }
    }

    private interface zza {
        void zzaA(Map<String, Object> map);
    }

    private enum zzb {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    private static class zzc {
        private final List<String> zzccA;
        private final Map<String, Object> zzccB;

        public zzc(List<String> list, Map<String, Object> map) {
            this.zzccA = list;
            this.zzccB = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc com_google_android_gms_internal_zzboq_zzc = (zzc) obj;
            return this.zzccA.equals(com_google_android_gms_internal_zzboq_zzc.zzccA) ? this.zzccB.equals(com_google_android_gms_internal_zzboq_zzc.zzccB) : false;
        }

        public int hashCode() {
            return (this.zzccA.hashCode() * 31) + this.zzccB.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(zzbom.zzW(this.zzccA));
            String valueOf2 = String.valueOf(this.zzccB);
            return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(" (params: ").append(valueOf2).append(")").toString();
        }
    }

    private static class zzd {
        private final Object data;
        private final List<String> zzccA;
        private final String zzccC;
        private final zzbos zzccD;

        private zzd(String str, List<String> list, Object obj, zzbos com_google_android_gms_internal_zzbos) {
            this.zzccC = str;
            this.zzccA = list;
            this.data = obj;
            this.zzccD = com_google_android_gms_internal_zzbos;
        }

        public String getAction() {
            return this.zzccC;
        }

        public Object getData() {
            return this.data;
        }

        public List<String> zzXN() {
            return this.zzccA;
        }

        public zzbos zzXO() {
            return this.zzccD;
        }
    }

    private static class zze {
        private final zzbos zzccE;
        private final zzc zzccF;
        private final zzboo zzccG;
        private final Long zzccH;

        private zze(zzbos com_google_android_gms_internal_zzbos, zzc com_google_android_gms_internal_zzboq_zzc, Long l, zzboo com_google_android_gms_internal_zzboo) {
            this.zzccE = com_google_android_gms_internal_zzbos;
            this.zzccF = com_google_android_gms_internal_zzboq_zzc;
            this.zzccG = com_google_android_gms_internal_zzboo;
            this.zzccH = l;
        }

        public String toString() {
            String valueOf = String.valueOf(this.zzccF.toString());
            String valueOf2 = String.valueOf(this.zzccH);
            return new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(valueOf2).length()).append(valueOf).append(" (Tag: ").append(valueOf2).append(")").toString();
        }

        public zzc zzXP() {
            return this.zzccF;
        }

        public Long zzXQ() {
            return this.zzccH;
        }

        public zzboo zzXR() {
            return this.zzccG;
        }
    }

    private static class zzf {
        private String zzccC;
        private zzbos zzccD;
        private Map<String, Object> zzccI;
        private boolean zzccJ;

        private zzf(String str, Map<String, Object> map, zzbos com_google_android_gms_internal_zzbos) {
            this.zzccC = str;
            this.zzccI = map;
            this.zzccD = com_google_android_gms_internal_zzbos;
        }

        public String getAction() {
            return this.zzccC;
        }

        public zzbos zzXO() {
            return this.zzccD;
        }

        public Map<String, Object> zzXS() {
            return this.zzccI;
        }

        public void zzXT() {
            this.zzccJ = true;
        }

        public boolean zzXU() {
            return this.zzccJ;
        }
    }

    class C09676 implements zza {
        final /* synthetic */ zzboq zzccm;

        C09676(zzboq com_google_android_gms_internal_zzboq) {
            this.zzccm = com_google_android_gms_internal_zzboq;
        }

        public void zzaA(Map<String, Object> map) {
            String str = (String) map.get("s");
            if (!str.equals("ok")) {
                String str2 = (String) map.get("d");
                if (this.zzccm.zzcaJ.zzaaC()) {
                    this.zzccm.zzcaJ.zzi(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Failed to send stats: ").append(str).append(" (message: ").append(str2).append(")").toString(), new Object[0]);
                }
            }
        }
    }

    public zzboq(zzbol com_google_android_gms_internal_zzbol, zzbon com_google_android_gms_internal_zzbon, com.google.android.gms.internal.zzbop.zza com_google_android_gms_internal_zzbop_zza) {
        this.zzcbO = com_google_android_gms_internal_zzbop_zza;
        this.zzccd = com_google_android_gms_internal_zzbol;
        this.zzcax = com_google_android_gms_internal_zzbol.zzXs();
        this.zzcbH = com_google_android_gms_internal_zzbol.zzXr();
        this.zzcbw = com_google_android_gms_internal_zzbon;
        this.zzcca = new HashMap();
        this.zzcbX = new HashMap();
        this.zzcbZ = new HashMap();
        this.zzcbY = new ArrayList();
        this.zzcce = new com.google.android.gms.internal.zzbou.zza(this.zzcax, com_google_android_gms_internal_zzbol.zzXq(), "ConnectionRetryHelper").zzaL(1000).zzj(1.3d).zzaM(30000).zzk(0.7d).zzYh();
        long j = zzcbv;
        zzcbv = 1 + j;
        this.zzcaJ = new zzbrn(com_google_android_gms_internal_zzbol.zzXq(), "PersistentConnection", "pc_" + j);
        this.zzccf = null;
        zzXL();
    }

    private boolean isIdle() {
        return this.zzcca.isEmpty() && this.zzcbX.isEmpty() && !this.zzcck && this.zzcbZ.isEmpty();
    }

    private Collection<zze> zzX(List<String> list) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf = String.valueOf(list);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 29).append("removing all listens at path ").append(valueOf).toString(), new Object[0]);
        }
        Collection<zze> arrayList = new ArrayList();
        for (Entry entry : this.zzcca.entrySet()) {
            zzc com_google_android_gms_internal_zzboq_zzc = (zzc) entry.getKey();
            zze com_google_android_gms_internal_zzboq_zze = (zze) entry.getValue();
            if (com_google_android_gms_internal_zzboq_zzc.zzccA.equals(list)) {
                arrayList.add(com_google_android_gms_internal_zzboq_zze);
            }
        }
        for (zze com_google_android_gms_internal_zzboq_zze2 : arrayList) {
            this.zzcca.remove(com_google_android_gms_internal_zzboq_zze2.zzXP());
        }
        zzXL();
        return arrayList;
    }

    private boolean zzXA() {
        return this.zzcbU == zzb.Connected;
    }

    private void zzXC() {
        if (zzXB()) {
            zzbom.zzc(this.zzcbU == zzb.Disconnected, "Not in disconnected state: %s", this.zzcbU);
            final boolean z = this.zzccc;
            this.zzcaJ.zzi("Scheduling connection attempt", new Object[0]);
            this.zzccc = false;
            this.zzcce.zzr(new Runnable(this) {
                final /* synthetic */ zzboq zzccm;

                public void run() {
                    this.zzccm.zzcaJ.zzi("Trying to fetch auth token", new Object[0]);
                    zzbom.zzc(this.zzccm.zzcbU == zzb.Disconnected, "Not in disconnected state: %s", this.zzccm.zzcbU);
                    this.zzccm.zzcbU = zzb.GettingToken;
                    this.zzccm.zzccg = 1 + this.zzccm.zzccg;
                    final long zzd = this.zzccm.zzccg;
                    this.zzccm.zzcbH.zza(z, new com.google.android.gms.internal.zzbok.zza(this) {
                        final /* synthetic */ C04821 zzcco;

                        public void onError(String str) {
                            if (zzd == this.zzcco.zzccm.zzccg) {
                                this.zzcco.zzccm.zzcbU = zzb.Disconnected;
                                zzbrn zza = this.zzcco.zzccm.zzcaJ;
                                String str2 = "Error fetching token: ";
                                String valueOf = String.valueOf(str);
                                zza.zzi(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                                this.zzcco.zzccm.zzXC();
                                return;
                            }
                            this.zzcco.zzccm.zzcaJ.zzi("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                        }

                        public void zziL(String str) {
                            if (zzd != this.zzcco.zzccm.zzccg) {
                                this.zzcco.zzccm.zzcaJ.zzi("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                            } else if (this.zzcco.zzccm.zzcbU == zzb.GettingToken) {
                                this.zzcco.zzccm.zzcaJ.zzi("Successfully fetched token, opening connection", new Object[0]);
                                this.zzcco.zzccm.zziO(str);
                            } else {
                                zzbom.zzc(this.zzcco.zzccm.zzcbU == zzb.Disconnected, "Expected connection state disconnected, but was %s", this.zzcco.zzccm.zzcbU);
                                this.zzcco.zzccm.zzcaJ.zzi("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                            }
                        }
                    });
                }
            });
        }
    }

    private void zzXD() {
        Iterator it = this.zzcbZ.entrySet().iterator();
        while (it.hasNext()) {
            zzf com_google_android_gms_internal_zzboq_zzf = (zzf) ((Entry) it.next()).getValue();
            if (com_google_android_gms_internal_zzboq_zzf.zzXS().containsKey("h") && com_google_android_gms_internal_zzboq_zzf.zzXU()) {
                com_google_android_gms_internal_zzboq_zzf.zzXO().zzar("disconnected", null);
                it.remove();
            }
        }
    }

    private void zzXE() {
        zzbd(false);
    }

    private void zzXF() {
        zzbd(true);
    }

    private void zzXG() {
        zzbom.zzc(zzXz(), "Must be connected to send unauth.", new Object[0]);
        zzbom.zzc(this.zzccb == null, "Auth token must not be set.", new Object[0]);
        zza("unauth", Collections.emptyMap(), null);
    }

    private void zzXH() {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("calling restore state", new Object[0]);
        }
        zzbom.zzc(this.zzcbU == zzb.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.zzcbU);
        if (this.zzccb == null) {
            if (this.zzcaJ.zzaaC()) {
                this.zzcaJ.zzi("Not restoring auth because token is null.", new Object[0]);
            }
            this.zzcbU = zzb.Connected;
            zzXI();
            return;
        }
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Restoring auth.", new Object[0]);
        }
        this.zzcbU = zzb.Authenticating;
        zzXF();
    }

    private void zzXI() {
        zzbom.zzc(this.zzcbU == zzb.Connected, "Should be connected if we're restoring state, but we are: %s", this.zzcbU);
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Restoring outstanding listens", new Object[0]);
        }
        for (zze com_google_android_gms_internal_zzboq_zze : this.zzcca.values()) {
            if (this.zzcaJ.zzaaC()) {
                zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
                String valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zze.zzXP());
                com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Restoring listen ").append(valueOf).toString(), new Object[0]);
            }
            zzb(com_google_android_gms_internal_zzboq_zze);
        }
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Restoring writes.", new Object[0]);
        }
        Object arrayList = new ArrayList(this.zzcbZ.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzaI(((Long) it.next()).longValue());
        }
        for (zzd com_google_android_gms_internal_zzboq_zzd : this.zzcbY) {
            zza(com_google_android_gms_internal_zzboq_zzd.getAction(), com_google_android_gms_internal_zzboq_zzd.zzXN(), com_google_android_gms_internal_zzboq_zzd.getData(), com_google_android_gms_internal_zzboq_zzd.zzXO());
        }
        this.zzcbY.clear();
    }

    private void zzXJ() {
        Map hashMap = new HashMap();
        String str;
        String valueOf;
        if (zzbst.zzabF()) {
            if (this.zzccd.zzXt()) {
                hashMap.put("persistence.android.enabled", Integer.valueOf(1));
            }
            str = "sdk.android.";
            valueOf = String.valueOf(this.zzccd.zzXu().replace('.', '-'));
            hashMap.put(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.valueOf(1));
        } else if ($assertionsDisabled || !this.zzccd.zzXt()) {
            str = "sdk.java.";
            valueOf = String.valueOf(this.zzccd.zzXu().replace('.', '-'));
            hashMap.put(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.valueOf(1));
        } else {
            throw new AssertionError("Stats for persistence on JVM missing (persistence not yet supported)");
        }
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Sending first connection stats", new Object[0]);
        }
        zzaz(hashMap);
    }

    private long zzXK() {
        long j = this.zzcbW;
        this.zzcbW = 1 + j;
        return j;
    }

    private void zzXL() {
        boolean z = false;
        if (isIdle()) {
            if (this.zzcci != null) {
                this.zzcci.cancel(false);
            }
            this.zzcci = this.zzcax.schedule(new C04837(this), 60000, TimeUnit.MILLISECONDS);
        } else if (isInterrupted("connection_idle")) {
            if (!isIdle()) {
                z = true;
            }
            zzbom.zzbb(z);
            resume("connection_idle");
        }
    }

    private boolean zzXM() {
        return isIdle() && System.currentTimeMillis() > this.zzccj + 60000;
    }

    private boolean zzXz() {
        return this.zzcbU == zzb.Authenticating || this.zzcbU == zzb.Connected;
    }

    private void zzY(List<String> list) {
        for (zze zzd : zzX(list)) {
            zzd.zzccE.zzar("permission_denied", null);
        }
    }

    private zze zza(zzc com_google_android_gms_internal_zzboq_zzc) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zzc);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 15).append("removing query ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzcca.containsKey(com_google_android_gms_internal_zzboq_zzc)) {
            zze com_google_android_gms_internal_zzboq_zze = (zze) this.zzcca.get(com_google_android_gms_internal_zzboq_zzc);
            this.zzcca.remove(com_google_android_gms_internal_zzboq_zzc);
            zzXL();
            return com_google_android_gms_internal_zzboq_zze;
        }
        if (this.zzcaJ.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzcaJ;
            valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zzc);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Trying to remove listener for QuerySpec ").append(valueOf).append(" but no listener exists.").toString(), new Object[0]);
        }
        return null;
    }

    private Map<String, Object> zza(List<String> list, Object obj, String str) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("p", zzbom.zzW(list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    private void zza(zze com_google_android_gms_internal_zzboq_zze) {
        Map hashMap = new HashMap();
        hashMap.put("p", zzbom.zzW(com_google_android_gms_internal_zzboq_zze.zzccF.zzccA));
        Long zzXQ = com_google_android_gms_internal_zzboq_zze.zzXQ();
        if (zzXQ != null) {
            hashMap.put("q", com_google_android_gms_internal_zzboq_zze.zzXP().zzccB);
            hashMap.put("t", zzXQ);
        }
        zza("n", hashMap, null);
    }

    private void zza(String str, List<String> list, Object obj, final zzbos com_google_android_gms_internal_zzbos) {
        Map hashMap = new HashMap();
        hashMap.put("p", zzbom.zzW(list));
        hashMap.put("d", obj);
        zza(str, hashMap, new zza(this) {
            public void zzaA(Map<String, Object> map) {
                String str = null;
                String str2 = (String) map.get("s");
                if (str2.equals("ok")) {
                    str2 = null;
                } else {
                    str = (String) map.get("d");
                }
                if (com_google_android_gms_internal_zzbos != null) {
                    com_google_android_gms_internal_zzbos.zzar(str2, str);
                }
            }
        });
    }

    private void zza(String str, List<String> list, Object obj, String str2, zzbos com_google_android_gms_internal_zzbos) {
        Map zza = zza((List) list, obj, str2);
        long j = this.zzcbV;
        this.zzcbV = 1 + j;
        this.zzcbZ.put(Long.valueOf(j), new zzf(str, zza, com_google_android_gms_internal_zzbos));
        if (zzXA()) {
            zzaI(j);
        }
        this.zzccj = System.currentTimeMillis();
        zzXL();
    }

    private void zza(String str, Map<String, Object> map, zza com_google_android_gms_internal_zzboq_zza) {
        zza(str, false, (Map) map, com_google_android_gms_internal_zzboq_zza);
    }

    private void zza(String str, boolean z, Map<String, Object> map, zza com_google_android_gms_internal_zzboq_zza) {
        long zzXK = zzXK();
        Map hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(zzXK));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.zzcbT.zza(hashMap, z);
        this.zzcbX.put(Long.valueOf(zzXK), com_google_android_gms_internal_zzboq_zza);
    }

    private void zza(List<String> list, zzc com_google_android_gms_internal_zzboq_zzc) {
        if (list.contains("no_index")) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zzc.zzccB.get("i"));
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 14).append("\".indexOn\": \"").append(valueOf).append("\"").toString();
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf2 = String.valueOf(zzbom.zzW(com_google_android_gms_internal_zzboq_zzc.zzccA));
            com_google_android_gms_internal_zzbrn.warn(new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length()).append("Using an unspecified index. Consider adding '").append(valueOf).append("' at ").append(valueOf2).append(" to your security and Firebase Database rules for better performance").toString());
        }
    }

    private void zzaH(long j) {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        Map hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.zzcbO.zzax(hashMap);
    }

    private void zzaI(long j) {
        if ($assertionsDisabled || zzXA()) {
            final zzf com_google_android_gms_internal_zzboq_zzf = (zzf) this.zzcbZ.get(Long.valueOf(j));
            final zzbos zzXO = com_google_android_gms_internal_zzboq_zzf.zzXO();
            final String action = com_google_android_gms_internal_zzboq_zzf.getAction();
            com_google_android_gms_internal_zzboq_zzf.zzXT();
            final long j2 = j;
            zza(action, com_google_android_gms_internal_zzboq_zzf.zzXS(), new zza(this) {
                final /* synthetic */ zzboq zzccm;

                public void zzaA(Map<String, Object> map) {
                    if (this.zzccm.zzcaJ.zzaaC()) {
                        zzbrn zza = this.zzccm.zzcaJ;
                        String str = action;
                        String valueOf = String.valueOf(map);
                        zza.zzi(new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(valueOf).length()).append(str).append(" response: ").append(valueOf).toString(), new Object[0]);
                    }
                    if (((zzf) this.zzccm.zzcbZ.get(Long.valueOf(j2))) == com_google_android_gms_internal_zzboq_zzf) {
                        this.zzccm.zzcbZ.remove(Long.valueOf(j2));
                        if (zzXO != null) {
                            String str2 = (String) map.get("s");
                            if (str2.equals("ok")) {
                                zzXO.zzar(null, null);
                            } else {
                                zzXO.zzar(str2, (String) map.get("d"));
                            }
                        }
                    } else if (this.zzccm.zzcaJ.zzaaC()) {
                        this.zzccm.zzcaJ.zzi("Ignoring on complete for put " + j2 + " because it was removed already.", new Object[0]);
                    }
                    this.zzccm.zzXL();
                }
            });
            return;
        }
        throw new AssertionError("sendPut called when we can't send writes (we're disconnected or writes are paused).");
    }

    private void zzaq(String str, String str2) {
        this.zzcaJ.warn(new StringBuilder((String.valueOf(str).length() + 23) + String.valueOf(str2).length()).append("Auth token revoked: ").append(str).append(" (").append(str2).append(")").toString());
        this.zzccb = null;
        this.zzccc = true;
        this.zzcbO.zzbc(false);
        this.zzcbT.close();
    }

    private void zzay(Map<String, Object> map) {
        this.zzcaJ.info((String) map.get("msg"));
    }

    private void zzaz(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            Map hashMap = new HashMap();
            hashMap.put("c", map);
            zza("s", hashMap, new C09676(this));
        } else if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("Not sending stats because stats are empty", new Object[0]);
        }
    }

    private void zzb(final zze com_google_android_gms_internal_zzboq_zze) {
        Map hashMap = new HashMap();
        hashMap.put("p", zzbom.zzW(com_google_android_gms_internal_zzboq_zze.zzXP().zzccA));
        Long zzXQ = com_google_android_gms_internal_zzboq_zze.zzXQ();
        if (zzXQ != null) {
            hashMap.put("q", com_google_android_gms_internal_zzboq_zze.zzccF.zzccB);
            hashMap.put("t", zzXQ);
        }
        zzboo zzXR = com_google_android_gms_internal_zzboq_zze.zzXR();
        hashMap.put("h", zzXR.zzXv());
        if (zzXR.zzXw()) {
            zzboi zzXx = zzXR.zzXx();
            List arrayList = new ArrayList();
            for (List zzW : zzXx.zzXo()) {
                arrayList.add(zzbom.zzW(zzW));
            }
            Map hashMap2 = new HashMap();
            hashMap2.put("hs", zzXx.zzXp());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        zza("q", hashMap, new zza(this) {
            final /* synthetic */ zzboq zzccm;

            public void zzaA(Map<String, Object> map) {
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    Map map2 = (Map) map.get("d");
                    if (map2.containsKey("w")) {
                        this.zzccm.zza((List) map2.get("w"), com_google_android_gms_internal_zzboq_zze.zzccF);
                    }
                }
                if (((zze) this.zzccm.zzcca.get(com_google_android_gms_internal_zzboq_zze.zzXP())) != com_google_android_gms_internal_zzboq_zze) {
                    return;
                }
                if (str.equals("ok")) {
                    com_google_android_gms_internal_zzboq_zze.zzccE.zzar(null, null);
                    return;
                }
                this.zzccm.zza(com_google_android_gms_internal_zzboq_zze.zzXP());
                com_google_android_gms_internal_zzboq_zze.zzccE.zzar(str, (String) map.get("d"));
            }
        });
    }

    private void zzbd(final boolean z) {
        zzbom.zzc(zzXz(), "Must be connected to send auth, but was: %s", this.zzcbU);
        zzbom.zzc(this.zzccb != null, "Auth token must be set to authenticate!", new Object[0]);
        zza c09643 = new zza(this) {
            final /* synthetic */ zzboq zzccm;

            public void zzaA(Map<String, Object> map) {
                this.zzccm.zzcbU = zzb.Connected;
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    this.zzccm.zzcch = 0;
                    this.zzccm.zzcbO.zzbc(true);
                    if (z) {
                        this.zzccm.zzXI();
                        return;
                    }
                    return;
                }
                this.zzccm.zzccb = null;
                this.zzccm.zzccc = true;
                this.zzccm.zzcbO.zzbc(false);
                String str2 = (String) map.get("d");
                this.zzccm.zzcaJ.zzi(new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(str2).length()).append("Authentication failed: ").append(str).append(" (").append(str2).append(")").toString(), new Object[0]);
                this.zzccm.zzcbT.close();
                if (str.equals("invalid_token")) {
                    this.zzccm.zzcch = this.zzccm.zzcch + 1;
                    if (((long) this.zzccm.zzcch) >= 3) {
                        this.zzccm.zzcce.zzYg();
                        this.zzccm.zzcaJ.warn("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                    }
                }
            }
        };
        Map hashMap = new HashMap();
        zzbsu zzjd = zzbsu.zzjd(this.zzccb);
        if (zzjd != null) {
            hashMap.put("cred", zzjd.getToken());
            if (zzjd.zzabG() != null) {
                hashMap.put("authvar", zzjd.zzabG());
            }
            zza("gauth", true, hashMap, c09643);
            return;
        }
        hashMap.put("cred", this.zzccb);
        zza("auth", true, hashMap, c09643);
    }

    private void zzk(String str, Map<String, Object> map) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf = String.valueOf(map);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(valueOf).length()).append("handleServerMessage: ").append(str).append(" ").append(valueOf).toString(), new Object[0]);
        }
        String str2;
        zzbrn com_google_android_gms_internal_zzbrn2;
        String str3;
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long zzaq = zzbom.zzaq(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.zzcbO.zza(zzbom.zziM(str2), obj, equals, zzaq);
            } else if (this.zzcaJ.zzaaC()) {
                com_google_android_gms_internal_zzbrn2 = this.zzcaJ;
                str3 = "ignoring empty merge for path ";
                str2 = String.valueOf(str2);
                com_google_android_gms_internal_zzbrn2.zzi(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
            }
        } else if (str.equals("rm")) {
            str2 = (String) map.get("p");
            List zziM = zzbom.zziM(str2);
            Object obj2 = map.get("d");
            Long zzaq2 = zzbom.zzaq(map.get("t"));
            List<Map> list = (List) obj2;
            List arrayList = new ArrayList();
            for (Map map2 : list) {
                str3 = (String) map2.get("s");
                String str4 = (String) map2.get("e");
                arrayList.add(new zzbor(str3 != null ? zzbom.zziM(str3) : null, str4 != null ? zzbom.zziM(str4) : null, map2.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.zzcbO.zza(zziM, arrayList, zzaq2);
            } else if (this.zzcaJ.zzaaC()) {
                com_google_android_gms_internal_zzbrn2 = this.zzcaJ;
                str3 = "Ignoring empty range merge for path ";
                str2 = String.valueOf(str2);
                com_google_android_gms_internal_zzbrn2.zzi(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
            }
        } else if (str.equals("c")) {
            zzY(zzbom.zziM((String) map.get("p")));
        } else if (str.equals("ac")) {
            zzaq((String) map.get("s"), (String) map.get("d"));
        } else if (str.equals("sd")) {
            zzay(map);
        } else if (this.zzcaJ.zzaaC()) {
            com_google_android_gms_internal_zzbrn2 = this.zzcaJ;
            str3 = "Unrecognized action from server: ";
            str2 = String.valueOf(str);
            com_google_android_gms_internal_zzbrn2.zzi(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
        }
    }

    public void initialize() {
        zzXC();
    }

    public void interrupt(String str) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String str2 = "Connection interrupted for: ";
            String valueOf = String.valueOf(str);
            com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.zzcbQ.add(str);
        if (this.zzcbT != null) {
            this.zzcbT.close();
            this.zzcbT = null;
        } else {
            this.zzcce.cancel();
            this.zzcbU = zzb.Disconnected;
        }
        this.zzcce.zzVT();
    }

    public boolean isInterrupted(String str) {
        return this.zzcbQ.contains(str);
    }

    public void purgeOutstandingWrites() {
        for (zzf com_google_android_gms_internal_zzboq_zzf : this.zzcbZ.values()) {
            if (com_google_android_gms_internal_zzboq_zzf.zzccD != null) {
                com_google_android_gms_internal_zzboq_zzf.zzccD.zzar("write_canceled", null);
            }
        }
        for (zzd com_google_android_gms_internal_zzboq_zzd : this.zzcbY) {
            if (com_google_android_gms_internal_zzboq_zzd.zzccD != null) {
                com_google_android_gms_internal_zzboq_zzd.zzccD.zzar("write_canceled", null);
            }
        }
        this.zzcbZ.clear();
        this.zzcbY.clear();
        if (!zzXz()) {
            this.zzcck = false;
        }
        zzXL();
    }

    public void refreshAuthToken() {
        this.zzcaJ.zzi("Auth token refresh requested", new Object[0]);
        interrupt("token_refresh");
        resume("token_refresh");
    }

    public void resume(String str) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String str2 = "Connection no longer interrupted for: ";
            String valueOf = String.valueOf(str);
            com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.zzcbQ.remove(str);
        if (zzXB() && this.zzcbU == zzb.Disconnected) {
            zzXC();
        }
    }

    public void shutdown() {
        interrupt("shutdown");
    }

    boolean zzXB() {
        return this.zzcbQ.size() == 0;
    }

    public void zza(List<String> list, zzbos com_google_android_gms_internal_zzbos) {
        if (zzXA()) {
            zza("oc", (List) list, null, com_google_android_gms_internal_zzbos);
        } else {
            this.zzcbY.add(new zzd("oc", list, null, com_google_android_gms_internal_zzbos));
        }
        zzXL();
    }

    public void zza(List<String> list, Object obj, zzbos com_google_android_gms_internal_zzbos) {
        zza("p", (List) list, obj, null, com_google_android_gms_internal_zzbos);
    }

    public void zza(List<String> list, Object obj, String str, zzbos com_google_android_gms_internal_zzbos) {
        zza("p", (List) list, obj, str, com_google_android_gms_internal_zzbos);
    }

    public void zza(List<String> list, Map<String, Object> map) {
        zzc com_google_android_gms_internal_zzboq_zzc = new zzc(list, map);
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zzc);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 15).append("unlistening on ").append(valueOf).toString(), new Object[0]);
        }
        zze zza = zza(com_google_android_gms_internal_zzboq_zzc);
        if (zza != null && zzXz()) {
            zza(zza);
        }
        zzXL();
    }

    public void zza(List<String> list, Map<String, Object> map, zzboo com_google_android_gms_internal_zzboo, Long l, zzbos com_google_android_gms_internal_zzbos) {
        zzc com_google_android_gms_internal_zzboq_zzc = new zzc(list, map);
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zzc);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Listening on ").append(valueOf).toString(), new Object[0]);
        }
        zzbom.zzc(!this.zzcca.containsKey(com_google_android_gms_internal_zzboq_zzc), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.zzcaJ.zzaaC()) {
            com_google_android_gms_internal_zzbrn = this.zzcaJ;
            valueOf = String.valueOf(com_google_android_gms_internal_zzboq_zzc);
            com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Adding listen query: ").append(valueOf).toString(), new Object[0]);
        }
        zze com_google_android_gms_internal_zzboq_zze = new zze(com_google_android_gms_internal_zzbos, com_google_android_gms_internal_zzboq_zzc, l, com_google_android_gms_internal_zzboo);
        this.zzcca.put(com_google_android_gms_internal_zzboq_zzc, com_google_android_gms_internal_zzboq_zze);
        if (zzXz()) {
            zzb(com_google_android_gms_internal_zzboq_zze);
        }
        zzXL();
    }

    public void zza(List<String> list, Map<String, Object> map, zzbos com_google_android_gms_internal_zzbos) {
        zza("m", (List) list, (Object) map, null, com_google_android_gms_internal_zzbos);
    }

    public void zzau(Map<String, Object> map) {
        if (map.containsKey("r")) {
            zza com_google_android_gms_internal_zzboq_zza = (zza) this.zzcbX.remove(Long.valueOf((long) ((Integer) map.get("r")).intValue()));
            if (com_google_android_gms_internal_zzboq_zza != null) {
                com_google_android_gms_internal_zzboq_zza.zzaA((Map) map.get("b"));
            }
        } else if (!map.containsKey("error")) {
            if (map.containsKey("a")) {
                zzk((String) map.get("a"), (Map) map.get("b"));
            } else if (this.zzcaJ.zzaaC()) {
                zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
                String valueOf = String.valueOf(map);
                com_google_android_gms_internal_zzbrn.zzi(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Ignoring unknown message: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    public void zzb(com.google.android.gms.internal.zzboj.zzb com_google_android_gms_internal_zzboj_zzb) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String str = "Got on disconnect due to ";
            String valueOf = String.valueOf(com_google_android_gms_internal_zzboj_zzb.name());
            com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.zzcbU = zzb.Disconnected;
        this.zzcbT = null;
        this.zzcck = false;
        this.zzcbX.clear();
        zzXD();
        if (zzXB()) {
            boolean z = this.zzcbS > 0 ? System.currentTimeMillis() - this.zzcbS > 30000 : false;
            if (com_google_android_gms_internal_zzboj_zzb == com.google.android.gms.internal.zzboj.zzb.SERVER_RESET || r0) {
                this.zzcce.zzVT();
            }
            zzXC();
        }
        this.zzcbS = 0;
        this.zzcbO.onDisconnect();
    }

    public void zzb(List<String> list, Object obj, zzbos com_google_android_gms_internal_zzbos) {
        this.zzcck = true;
        if (zzXA()) {
            zza("o", (List) list, obj, com_google_android_gms_internal_zzbos);
        } else {
            this.zzcbY.add(new zzd("o", list, obj, com_google_android_gms_internal_zzbos));
        }
        zzXL();
    }

    public void zzb(List<String> list, Map<String, Object> map, zzbos com_google_android_gms_internal_zzbos) {
        this.zzcck = true;
        if (zzXA()) {
            zza("om", (List) list, (Object) map, com_google_android_gms_internal_zzbos);
        } else {
            this.zzcbY.add(new zzd("om", list, map, com_google_android_gms_internal_zzbos));
        }
        zzXL();
    }

    public void zziJ(String str) {
        this.zzcbP = str;
    }

    public void zziK(String str) {
        if (this.zzcaJ.zzaaC()) {
            zzbrn com_google_android_gms_internal_zzbrn = this.zzcaJ;
            String str2 = "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ";
            String valueOf = String.valueOf(str);
            com_google_android_gms_internal_zzbrn.zzi(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        interrupt("server_kill");
    }

    public void zziN(String str) {
        this.zzcaJ.zzi("Auth token refreshed.", new Object[0]);
        this.zzccb = str;
        if (!zzXz()) {
            return;
        }
        if (str != null) {
            zzXE();
        } else {
            zzXG();
        }
    }

    public void zziO(String str) {
        zzbom.zzc(this.zzcbU == zzb.GettingToken, "Trying to open network connection while in the wrong state: %s", this.zzcbU);
        if (str == null) {
            this.zzcbO.zzbc(false);
        }
        this.zzccb = str;
        this.zzcbU = zzb.Connecting;
        this.zzcbT = new zzboj(this.zzccd, this.zzcbw, this.zzcbP, this, this.zzccf);
        this.zzcbT.open();
    }

    public void zzj(long j, String str) {
        if (this.zzcaJ.zzaaC()) {
            this.zzcaJ.zzi("onReady", new Object[0]);
        }
        this.zzcbS = System.currentTimeMillis();
        zzaH(j);
        if (this.zzcbR) {
            zzXJ();
        }
        zzXH();
        this.zzcbR = false;
        this.zzccf = str;
        this.zzcbO.zzXy();
    }
}
