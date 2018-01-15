package com.google.android.gms.location.places.internal;

import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.internal.zza.zza;
import java.util.Collections;
import java.util.List;

public class zzc extends zzab implements AutocompletePrediction {
    public zzc(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private String zzIK() {
        return zzO("ap_description", "");
    }

    private String zzIL() {
        return zzO("ap_primary_text", "");
    }

    private String zzIM() {
        return zzO("ap_secondary_text", "");
    }

    private List<zza> zzIN() {
        return zza("ap_matched_subscriptions", zza.CREATOR, Collections.emptyList());
    }

    private List<zza> zzIO() {
        return zza("ap_primary_text_matched", zza.CREATOR, Collections.emptyList());
    }

    private List<zza> zzIP() {
        return zza("ap_secondary_text_matched", zza.CREATOR, Collections.emptyList());
    }

    public /* synthetic */ Object freeze() {
        return zzII();
    }

    public CharSequence getFullText(@Nullable CharacterStyle characterStyle) {
        return zzf.zza(zzIK(), zzIN(), characterStyle);
    }

    public String getPlaceId() {
        return zzO("ap_place_id", null);
    }

    public List<Integer> getPlaceTypes() {
        return zzb("ap_place_types", Collections.emptyList());
    }

    public CharSequence getPrimaryText(@Nullable CharacterStyle characterStyle) {
        return zzf.zza(zzIL(), zzIO(), characterStyle);
    }

    public CharSequence getSecondaryText(@Nullable CharacterStyle characterStyle) {
        return zzf.zza(zzIM(), zzIP(), characterStyle);
    }

    public AutocompletePrediction zzII() {
        return zza.zza(getPlaceId(), getPlaceTypes(), zzIJ(), zzIK(), zzIN(), zzIL(), zzIO(), zzIM(), zzIP());
    }

    public int zzIJ() {
        return zzy("ap_personalization_type", 6);
    }
}
