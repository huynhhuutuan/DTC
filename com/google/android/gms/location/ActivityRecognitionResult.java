package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzd;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;
import java.util.Collections;
import java.util.List;

public class ActivityRecognitionResult extends zza implements ReflectedParcelable {
    public static final Creator<ActivityRecognitionResult> CREATOR = new zzc();
    Bundle extras;
    List<DetectedActivity> zzbju;
    long zzbjv;
    long zzbjw;
    int zzbjx;

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, null);
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, i, bundle);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this((List) list, j, j2, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        boolean z2 = list != null && list.size() > 0;
        zzac.zzb(z2, (Object) "Must have at least 1 detected activity");
        if (j <= 0 || j2 <= 0) {
            z = false;
        }
        zzac.zzb(z, (Object) "Must set times");
        this.zzbju = list;
        this.zzbjv = j;
        this.zzbjw = j2;
        this.zzbjx = i;
        this.extras = bundle;
    }

    public static ActivityRecognitionResult extractResult(Intent intent) {
        ActivityRecognitionResult zzx = zzx(intent);
        if (zzx != null) {
            return zzx;
        }
        List zzz = zzz(intent);
        return (zzz == null || zzz.isEmpty()) ? null : (ActivityRecognitionResult) zzz.get(zzz.size() - 1);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (zzw(intent)) {
            return true;
        }
        List zzz = zzz(intent);
        return (zzz == null || zzz.isEmpty()) ? false : true;
    }

    private static boolean zzc(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || (bundle != null && bundle2 == null)) {
            return false;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!zzc(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzw(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
    }

    private static ActivityRecognitionResult zzx(Intent intent) {
        if (!hasResult(intent)) {
            return null;
        }
        Object obj = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        return obj instanceof byte[] ? (ActivityRecognitionResult) zzd.zza((byte[]) obj, CREATOR) : obj instanceof ActivityRecognitionResult ? (ActivityRecognitionResult) obj : null;
    }

    public static boolean zzy(@Nullable Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
    }

    @Nullable
    public static List<ActivityRecognitionResult> zzz(Intent intent) {
        return !zzy(intent) ? null : zzd.zzb(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.zzbjv == activityRecognitionResult.zzbjv && this.zzbjw == activityRecognitionResult.zzbjw && this.zzbjx == activityRecognitionResult.zzbjx && zzaa.equal(this.zzbju, activityRecognitionResult.zzbju) && zzc(this.extras, activityRecognitionResult.extras);
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity detectedActivity : this.zzbju) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzbjw;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.zzbju.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zzbju;
    }

    public long getTime() {
        return this.zzbjv;
    }

    public int hashCode() {
        return zzaa.hashCode(Long.valueOf(this.zzbjv), Long.valueOf(this.zzbjw), Integer.valueOf(this.zzbjx), this.zzbju, this.extras);
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbju);
        long j = this.zzbjv;
        return new StringBuilder(String.valueOf(valueOf).length() + 124).append("ActivityRecognitionResult [probableActivities=").append(valueOf).append(", timeMillis=").append(j).append(", elapsedRealtimeMillis=").append(this.zzbjw).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
