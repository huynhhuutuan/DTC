package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage extends zza {
    public static final Creator<WebImage> CREATOR = new zzb();
    final int zzaiI;
    private final Uri zzata;
    private final int zzrC;
    private final int zzrD;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.zzaiI = i;
        this.zzata = uri;
        this.zzrC = i2;
        this.zzrD = i3;
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    public WebImage(JSONObject jSONObject) throws IllegalArgumentException {
        this(zzs(jSONObject), jSONObject.optInt(SettingsJsonConstants.ICON_WIDTH_KEY, 0), jSONObject.optInt(SettingsJsonConstants.ICON_HEIGHT_KEY, 0));
    }

    private static Uri zzs(JSONObject jSONObject) {
        Uri uri = null;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException e) {
            }
        }
        return uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return zzaa.equal(this.zzata, webImage.zzata) && this.zzrC == webImage.zzrC && this.zzrD == webImage.zzrD;
    }

    public int getHeight() {
        return this.zzrD;
    }

    public Uri getUrl() {
        return this.zzata;
    }

    public int getWidth() {
        return this.zzrC;
    }

    public int hashCode() {
        return zzaa.hashCode(this.zzata, Integer.valueOf(this.zzrC), Integer.valueOf(this.zzrD));
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.zzata.toString());
            jSONObject.put(SettingsJsonConstants.ICON_WIDTH_KEY, this.zzrC);
            jSONObject.put(SettingsJsonConstants.ICON_HEIGHT_KEY, this.zzrD);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zzrC), Integer.valueOf(this.zzrD), this.zzata.toString()});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
