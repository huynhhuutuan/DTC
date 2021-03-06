package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.C0334R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends zza implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new zza();
    private Boolean zzboc;
    private Boolean zzbod;
    private int zzboe = -1;
    private CameraPosition zzbof;
    private Boolean zzbog;
    private Boolean zzboh;
    private Boolean zzboi;
    private Boolean zzboj;
    private Boolean zzbok;
    private Boolean zzbol;
    private Boolean zzbom;
    private Boolean zzbon;
    private Boolean zzboo;
    private Float zzbop = null;
    private Float zzboq = null;
    private LatLngBounds zzbor = null;

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.zzboc = com.google.android.gms.maps.internal.zza.zza(b);
        this.zzbod = com.google.android.gms.maps.internal.zza.zza(b2);
        this.zzboe = i;
        this.zzbof = cameraPosition;
        this.zzbog = com.google.android.gms.maps.internal.zza.zza(b3);
        this.zzboh = com.google.android.gms.maps.internal.zza.zza(b4);
        this.zzboi = com.google.android.gms.maps.internal.zza.zza(b5);
        this.zzboj = com.google.android.gms.maps.internal.zza.zza(b6);
        this.zzbok = com.google.android.gms.maps.internal.zza.zza(b7);
        this.zzbol = com.google.android.gms.maps.internal.zza.zza(b8);
        this.zzbom = com.google.android.gms.maps.internal.zza.zza(b9);
        this.zzbon = com.google.android.gms.maps.internal.zza.zza(b10);
        this.zzboo = com.google.android.gms.maps.internal.zza.zza(b11);
        this.zzbop = f;
        this.zzboq = f2;
        this.zzbor = latLngBounds;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0334R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(C0334R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(C0334R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(C0334R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(C0334R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(C0334R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.latLngBoundsForCameraTarget(LatLngBounds.createFromAttributes(context, attributeSet));
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzboo = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzbof = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzboh = Boolean.valueOf(z);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzboo;
    }

    public CameraPosition getCamera() {
        return this.zzbof;
    }

    public Boolean getCompassEnabled() {
        return this.zzboh;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzbor;
    }

    public Boolean getLiteMode() {
        return this.zzbom;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzbon;
    }

    public int getMapType() {
        return this.zzboe;
    }

    public Float getMaxZoomPreference() {
        return this.zzboq;
    }

    public Float getMinZoomPreference() {
        return this.zzbop;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzbol;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzboi;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzbok;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzbod;
    }

    public Boolean getZOrderOnTop() {
        return this.zzboc;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zzbog;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzboj;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzbor = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.zzbom = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzbon = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzboe = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f) {
        this.zzboq = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f) {
        this.zzbop = Float.valueOf(f);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzbol = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzboi = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzbok = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzbod = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzboc = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzbog = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzboj = Boolean.valueOf(z);
        return this;
    }

    byte zzJn() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzboc);
    }

    byte zzJo() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzbod);
    }

    byte zzJp() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzbog);
    }

    byte zzJq() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzboh);
    }

    byte zzJr() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzboi);
    }

    byte zzJs() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzboj);
    }

    byte zzJt() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzbok);
    }

    byte zzJu() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzbol);
    }

    byte zzJv() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzbom);
    }

    byte zzJw() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzbon);
    }

    byte zzJx() {
        return com.google.android.gms.maps.internal.zza.zzd(this.zzboo);
    }
}
