package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.zzg;
import java.util.concurrent.Callable;

@zzme
@TargetApi(17)
public class zzqc {
    private static zzqc zzYH = null;
    String zzIA;

    private zzqc() {
    }

    public static zzqc zzld() {
        if (zzYH == null) {
            zzYH = new zzqc();
        }
        return zzYH;
    }

    public void zzaa(final Context context) {
        if (TextUtils.isEmpty(this.zzIA)) {
            final Context remoteContext = zzg.getRemoteContext(context);
            this.zzIA = (String) zzqb.zzb(new Callable<String>(this) {
                public /* synthetic */ Object call() throws Exception {
                    return zzbY();
                }

                public String zzbY() {
                    SharedPreferences sharedPreferences;
                    int i = 1;
                    if (remoteContext != null) {
                        zzpk.m28v("Attempting to read user agent from Google Play Services.");
                        sharedPreferences = remoteContext.getSharedPreferences("admob_user_agent", 1);
                        i = 0;
                    } else {
                        zzpk.m28v("Attempting to read user agent from local cache.");
                        sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                    }
                    String string = sharedPreferences.getString("user_agent", "");
                    if (TextUtils.isEmpty(string)) {
                        zzpk.m28v("Reading user agent from WebSettings");
                        string = WebSettings.getDefaultUserAgent(context);
                        if (i != 0) {
                            context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", string).apply();
                            zzpk.m28v("Persisting user agent.");
                        }
                    }
                    return string;
                }
            });
        }
    }

    public void zzab(Context context) {
        zzpk.m28v("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.zzIA)) {
            if (zzg.getRemoteContext(context) == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.zzIA = defaultUserAgent;
        }
        zzpk.m28v("User agent is updated.");
    }

    public String zzac(Context context) {
        zzaa(context);
        return this.zzIA;
    }
}
