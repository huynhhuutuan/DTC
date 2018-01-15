package com.delhi.metro.dtc;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.internal.view.SupportMenu;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class ShowAddress extends AppCompatActivity implements OnMapReadyCallback {
    static int NUM_METRO_STN = 172;
    private GoogleApiClient client;
    private SQLiteDatabase database;
    LatLng latLng;
    double latitude;
    double longitude;
    private GoogleMap map;

    class C08841 implements PlaceSelectionListener {
        C08841() {
        }

        public void onPlaceSelected(Place place) {
            Log.i("sandeep", "Place: " + place.getName());
            ShowAddress.this.latLng = place.getLatLng();
            StringBuilder append = new StringBuilder().append("Lat: ");
            ShowAddress showAddress = ShowAddress.this;
            double d = ShowAddress.this.latLng.latitude;
            showAddress.latitude = d;
            Log.i("sandeep", append.append(d).toString());
            append = new StringBuilder().append("Lat: ");
            showAddress = ShowAddress.this;
            d = ShowAddress.this.latLng.longitude;
            showAddress.longitude = d;
            Log.i("sandeep", append.append(d).toString());
            String address = (String) place.getAddress();
            if (!address.contains("Noida") && !address.contains("Gurgaon") && !address.contains("Faridabad") && !address.contains("Ghaziabad") && !address.contains("Delhi")) {
                Log.i("sandeep", "Address: " + place.getAddress());
                Toast.makeText(ShowAddress.this, "Address not in Delhi-NCR Region", 1).show();
            } else if (ShowAddress.this.map != null) {
                ShowAddress.this.map.moveCamera(CameraUpdateFactory.newLatLngZoom(ShowAddress.this.latLng, 10.0f));
                ShowAddress.this.map.animateCamera(CameraUpdateFactory.zoomTo(12.0f), 2000, null);
                ShowAddress.this.map.clear();
                Marker currentLoc = ShowAddress.this.map.addMarker(new MarkerOptions().position(ShowAddress.this.latLng).title((String) place.getName()));
                ShowAddress.this.database = new DataBaseHelper(ShowAddress.this).getReadableDatabase();
                double[] lat = new double[ShowAddress.NUM_METRO_STN];
                double[] lon = new double[ShowAddress.NUM_METRO_STN];
                String[] metro_Stn = new String[ShowAddress.NUM_METRO_STN];
                Cursor cursor = ShowAddress.this.database.query("stations", null, null, null, null, null, null, null);
                int i = 0;
                if (cursor != null && cursor.getCount() > 0) {
                    if (cursor.moveToFirst()) {
                        int i2;
                        while (true) {
                            metro_Stn[i] = cursor.getString(1);
                            lat[i] = cursor.getDouble(2);
                            i2 = i + 1;
                            lon[i] = cursor.getDouble(3);
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            i = i2;
                        }
                        i = i2;
                    }
                    cursor.close();
                }
                double min_2 = Double.MAX_VALUE;
                double min_1 = Double.MAX_VALUE;
                int index_2 = 0;
                int index_1 = 0;
                for (int j = 0; j < ShowAddress.NUM_METRO_STN; j++) {
                    double d2 = ShowAddress.this.CalculationByDistance(ShowAddress.this.latitude, ShowAddress.this.longitude, lat[j], lon[j]);
                    if (d2 < min_1) {
                        min_2 = min_1;
                        index_2 = index_1;
                        min_1 = d2;
                        index_1 = j;
                    } else if (d2 < min_2) {
                        min_2 = d2;
                        index_2 = j;
                    }
                }
                ShowAddress.this.database.close();
                Marker nearestFirst = ShowAddress.this.map.addMarker(new MarkerOptions().position(new LatLng(lat[index_1], lon[index_1])).icon(BitmapDescriptorFactory.fromResource(C0322R.drawable.metro_map_icon)).title(metro_Stn[index_1]));
                Marker nearestSecond = ShowAddress.this.map.addMarker(new MarkerOptions().position(new LatLng(lat[index_2], lon[index_2])).icon(BitmapDescriptorFactory.fromResource(C0322R.drawable.metro_map_icon)).title(metro_Stn[index_2]));
                Polyline line = ShowAddress.this.map.addPolyline(new PolylineOptions().add(ShowAddress.this.latLng, new LatLng(lat[index_1], lon[index_1])).width(5.0f).color(SupportMenu.CATEGORY_MASK));
                ShowAddress.this.map.addPolyline(new PolylineOptions().add(ShowAddress.this.latLng, new LatLng(lat[index_2], lon[index_2])).width(5.0f).color(SupportMenu.CATEGORY_MASK));
            }
        }

        public void onError(Status status) {
            Log.i("sandeep", "An error occurred: " + status);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0322R.layout.showaddress);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle((CharSequence) "Search Address");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(C0322R.id.map_address)).getMapAsync(this);
        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment) getFragmentManager().findFragmentById(C0322R.id.place_autocomplete_fragment);
        autocompleteFragment.setHint("Tap here to search a place");
        autocompleteFragment.setOnPlaceSelectedListener(new C08841());
    }

    public void onMapReady(GoogleMap map) {
        this.map = map;
    }

    public double CalculationByDistance(double initialLat, double initialLong, double finalLat, double finalLong) {
        double dLat = toRadians(finalLat - initialLat);
        double dLon = toRadians(finalLong - initialLong);
        double a = (Math.sin(dLat / 2.0d) * Math.sin(dLat / 2.0d)) + (((Math.sin(dLon / 2.0d) * Math.sin(dLon / 2.0d)) * Math.cos(toRadians(initialLat))) * Math.cos(toRadians(finalLat)));
        return ((double) 6371) * (2.0d * Math.atan2(Math.sqrt(a), Math.sqrt(1.0d - a)));
    }

    public double toRadians(double deg) {
        return 0.017453292519943295d * deg;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                break;
            case C0322R.id.homescr:
                Intent nextscreen = new Intent(getApplicationContext(), Mainactivity_new.class);
                nextscreen.setFlags(67108864);
                startActivity(nextscreen);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0322R.menu.homescreen_appcompact, menu);
        return true;
    }
}
