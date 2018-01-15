package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import com.google.android.gms.location.places.internal.zza.zza;
import java.util.Collection;
import java.util.List;

public class zzf {
    public static CharSequence zza(String str, List<zza> list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        CharSequence spannableString = new SpannableString(str);
        for (zza com_google_android_gms_location_places_internal_zza_zza : list) {
            spannableString.setSpan(CharacterStyle.wrap(characterStyle), com_google_android_gms_location_places_internal_zza_zza.getOffset(), com_google_android_gms_location_places_internal_zza_zza.getLength() + com_google_android_gms_location_places_internal_zza_zza.getOffset(), 0);
        }
        return spannableString;
    }

    public static String zzo(Collection<String> collection) {
        return (collection == null || collection.isEmpty()) ? null : TextUtils.join(", ", collection);
    }
}
