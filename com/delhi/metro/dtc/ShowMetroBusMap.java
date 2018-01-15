package com.delhi.metro.dtc;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class ShowMetroBusMap extends AppCompatActivity implements OnMapReadyCallback {
    LatLng avgLoc;
    double cur_lat;
    double cur_lon;
    boolean is_bus;
    private GoogleMap map;
    LatLng myLocation;
    LatLng nearestLocation;
    String nearestStn;

    class C03261 implements OnClickListener {
        C03261() {
        }

        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
            ShowMetroBusMap.this.finish();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0322R.layout.showmetrobusmap);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle((CharSequence) "Nearest Stop");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        Bundle bundle = getIntent().getExtras();
        if (!isNetworkConnected()) {
            Builder alertDialog = new Builder(this);
            alertDialog.setCancelable(true);
            alertDialog.setTitle("Notice");
            alertDialog.setMessage("Please check your internet connection");
            alertDialog.setPositiveButton("OK", new C03261());
            alertDialog.show();
        }
        this.cur_lat = bundle.getDouble("CURRENT_LAT");
        this.cur_lon = bundle.getDouble("CURRENT_LON");
        this.is_bus = bundle.getBoolean("IS_BUS");
        this.myLocation = new LatLng(this.cur_lat, this.cur_lon);
        this.nearestStn = bundle.getString("STN_NAME");
        this.nearestLocation = new LatLng(bundle.getDouble("NEAREST_LAT"), bundle.getDouble("NEAREST_LON"));
        ((SupportMapFragment) getSupportFragmentManager().findFragmentById(C0322R.id.map)).getMapAsync(this);
        this.avgLoc = new LatLng((this.myLocation.latitude + this.nearestLocation.latitude) / 2.0d, (this.myLocation.longitude + this.nearestLocation.longitude) / 2.0d);
    }

    public void onMapReady(GoogleMap map) {
        this.map = map;
        if (map != null) {
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(this.nearestLocation, 10.0f));
            if (this.is_bus) {
                map.animateCamera(CameraUpdateFactory.zoomTo(14.0f), 2000, null);
            } else {
                map.animateCamera(CameraUpdateFactory.zoomTo(12.0f), 2000, null);
            }
            Marker currentLoc = map.addMarker(new MarkerOptions().position(this.myLocation).title("You are here"));
            map.addMarker(new MarkerOptions().position(this.nearestLocation).title(this.nearestStn));
        }
    }

    private boolean isNetworkConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
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
