package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzw;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzme
public class zzps {
    private String zzXT = "";
    private String zzXU = "";
    private boolean zzXV = false;
    protected String zzXW = "";
    private final Object zzrJ = new Object();

    private Uri zzb(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzY(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private void zzm(Context context, String str, String str2) {
        zzw.zzcM().zza(context, zzb(context, (String) zzgd.zzFn.get(), str, str2));
    }

    public void zzJ(boolean z) {
        synchronized (this.zzrJ) {
            this.zzXV = z;
        }
    }

    public String zzY(Context context) {
        String str;
        synchronized (this.zzrJ) {
            if (TextUtils.isEmpty(this.zzXT)) {
                this.zzXT = zzw.zzcM().zzv(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.zzXT)) {
                    this.zzXT = zzw.zzcM().zzkL();
                    zzw.zzcM().zzg(context, "debug_signals_id.txt", this.zzXT);
                }
            }
            str = this.zzXT;
        }
        return str;
    }

    public void zza(Context context, String str, String str2, String str3) {
        Builder buildUpon = zzb(context, (String) zzgd.zzFq.get(), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzw.zzcM().zzf(context, str, buildUpon.build().toString());
    }

    protected void zza(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            final Context context2 = context;
            final String str2 = str;
            final boolean z3 = z;
            final boolean z4 = z2;
            zzpo.zzXC.post(new Runnable(this) {

                class C06361 implements OnClickListener {
                    final /* synthetic */ C06371 zzYa;

                    C06361(C06371 c06371) {
                        this.zzYa = c06371;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        zzw.zzcM().zza(context2, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
                    }
                }

                public void run() {
                    AlertDialog.Builder builder = new AlertDialog.Builder(context2);
                    builder.setMessage(str2);
                    if (z3) {
                        builder.setTitle("Error");
                    } else {
                        builder.setTitle("Info");
                    }
                    if (z4) {
                        builder.setNeutralButton("Dismiss", null);
                    } else {
                        builder.setPositiveButton("Learn More", new C06361(this));
                        builder.setNegativeButton("Dismiss", null);
                    }
                    builder.create().show();
                }
            });
            return;
        }
        zzqf.zzbg("Can not create dialog without Activity Context");
    }

    public void zzbd(String str) {
        synchronized (this.zzrJ) {
            this.zzXU = str;
        }
    }

    public void zzh(Context context, String str, String str2) {
        if (!zzj(context, str, str2)) {
            zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.zzXW)) {
            zzqf.zzbf("Creative is not pushed for this device.");
            zza(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.zzXW)) {
            zzqf.zzbf("The app is not linked for creative preview.");
            zzm(context, str, str2);
        } else if ("0".equals(this.zzXW)) {
            zzqf.zzbf("Device is linked for in app preview.");
            zza(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public void zzi(Context context, String str, String str2) {
        if (zzk(context, str, str2)) {
            zzqf.zzbf("Device is linked for debug signals.");
            zza(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzm(context, str, str2);
    }

    boolean zzj(Context context, String str, String str2) {
        Object zzl = zzl(context, zzb(context, (String) zzgd.zzFo.get(), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzl)) {
            zzqf.zzbf("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzl.trim());
            String optString = jSONObject.optString("gct");
            this.zzXW = jSONObject.optString("status");
            zzbd(optString);
            return true;
        } catch (Throwable e) {
            zzqf.zzc("Fail to get in app preview response json.", e);
            return false;
        }
    }

    boolean zzk(Context context, String str, String str2) {
        Object zzl = zzl(context, zzb(context, (String) zzgd.zzFp.get(), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzl)) {
            zzqf.zzbf("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzl.trim()).optString("debug_mode"));
            zzJ(equals);
            return equals;
        } catch (Throwable e) {
            zzqf.zzc("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public String zzkY() {
        String str;
        synchronized (this.zzrJ) {
            str = this.zzXU;
        }
        return str;
    }

    public boolean zzkZ() {
        boolean z;
        synchronized (this.zzrJ) {
            z = this.zzXV;
        }
        return z;
    }

    protected String zzl(Context context, String str, String str2) {
        Throwable th;
        String str3;
        String valueOf;
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", zzw.zzcM().zzu(context, str2));
        zzqm zzc = new zzpv(context).zzc(str, hashMap);
        try {
            return (String) zzc.get((long) ((Integer) zzgd.zzFr.get()).intValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            th = e;
            str3 = "Timeout while retriving a response from: ";
            valueOf = String.valueOf(str);
            zzqf.zzb(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            zzc.cancel(true);
        } catch (Throwable e2) {
            th = e2;
            str3 = "Interrupted while retriving a response from: ";
            valueOf = String.valueOf(str);
            zzqf.zzb(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
            zzc.cancel(true);
        } catch (Throwable e22) {
            th = e22;
            String str4 = "Error retriving a response from: ";
            valueOf = String.valueOf(str);
            zzqf.zzb(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
        }
        return null;
    }
}
