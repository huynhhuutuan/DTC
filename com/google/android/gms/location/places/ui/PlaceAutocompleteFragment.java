package com.google.android.gms.location.places.ui;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.C0334R;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete.IntentBuilder;
import com.google.android.gms.maps.model.LatLngBounds;

@TargetApi(12)
public class PlaceAutocompleteFragment extends Fragment {
    private View zzbnp;
    private View zzbnq;
    private EditText zzbnr;
    private boolean zzbns;
    @Nullable
    private LatLngBounds zzbnt;
    @Nullable
    private AutocompleteFilter zzbnu;
    @Nullable
    private PlaceSelectionListener zzbnv;

    class C06851 implements OnClickListener {
        final /* synthetic */ PlaceAutocompleteFragment zzbnw;

        C06851(PlaceAutocompleteFragment placeAutocompleteFragment) {
            this.zzbnw = placeAutocompleteFragment;
        }

        public void onClick(View view) {
            if (!this.zzbnw.zzbns) {
                this.zzbnw.zzJj();
            }
        }
    }

    class C06862 implements OnClickListener {
        final /* synthetic */ PlaceAutocompleteFragment zzbnw;

        C06862(PlaceAutocompleteFragment placeAutocompleteFragment) {
            this.zzbnw = placeAutocompleteFragment;
        }

        public void onClick(View view) {
            this.zzbnw.setText("");
        }
    }

    private void zzJi() {
        int i = 0;
        int i2 = !this.zzbnr.getText().toString().isEmpty() ? 1 : 0;
        View view = this.zzbnq;
        if (i2 == 0) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void zzJj() {
        int i;
        int connectionStatusCode;
        try {
            Intent build = new IntentBuilder(2).setBoundsBias(this.zzbnt).setFilter(this.zzbnu).zzeZ(this.zzbnr.getText().toString()).zzlc(1).build(getActivity());
            this.zzbns = true;
            startActivityForResult(build, 30421);
            i = -1;
        } catch (Throwable e) {
            connectionStatusCode = e.getConnectionStatusCode();
            Log.e("Places", "Could not open autocomplete activity", e);
            i = connectionStatusCode;
        } catch (Throwable e2) {
            connectionStatusCode = e2.errorCode;
            Log.e("Places", "Could not open autocomplete activity", e2);
            i = connectionStatusCode;
        }
        if (i != -1) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(getActivity(), i, 30422);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.zzbns = false;
        if (i == 30421) {
            if (i2 == -1) {
                Place place = PlaceAutocomplete.getPlace(getActivity(), intent);
                if (this.zzbnv != null) {
                    this.zzbnv.onPlaceSelected(place);
                }
                setText(place.getName().toString());
            } else if (i2 == 2) {
                Status status = PlaceAutocomplete.getStatus(getActivity(), intent);
                if (this.zzbnv != null) {
                    this.zzbnv.onError(status);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0334R.layout.place_autocomplete_fragment, viewGroup, false);
        this.zzbnp = inflate.findViewById(C0334R.id.place_autocomplete_search_button);
        this.zzbnq = inflate.findViewById(C0334R.id.place_autocomplete_clear_button);
        this.zzbnr = (EditText) inflate.findViewById(C0334R.id.place_autocomplete_search_input);
        OnClickListener c06851 = new C06851(this);
        this.zzbnp.setOnClickListener(c06851);
        this.zzbnr.setOnClickListener(c06851);
        this.zzbnq.setOnClickListener(new C06862(this));
        zzJi();
        return inflate;
    }

    public void onDestroyView() {
        this.zzbnp = null;
        this.zzbnq = null;
        this.zzbnr = null;
        super.onDestroyView();
    }

    public void setBoundsBias(@Nullable LatLngBounds latLngBounds) {
        this.zzbnt = latLngBounds;
    }

    public void setFilter(@Nullable AutocompleteFilter autocompleteFilter) {
        this.zzbnu = autocompleteFilter;
    }

    public void setHint(CharSequence charSequence) {
        this.zzbnr.setHint(charSequence);
        this.zzbnp.setContentDescription(charSequence);
    }

    public void setOnPlaceSelectedListener(PlaceSelectionListener placeSelectionListener) {
        this.zzbnv = placeSelectionListener;
    }

    public void setText(CharSequence charSequence) {
        this.zzbnr.setText(charSequence);
        zzJi();
    }
}
