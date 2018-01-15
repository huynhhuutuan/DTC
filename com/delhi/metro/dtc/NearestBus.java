package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.delhi.adapters.NearestBusAdapter;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class NearestBus extends Activity implements LocationListener, TabListener {
    private static final long MIN_DISTANCE_FOR_UPDATE = 10;
    private static final long MIN_TIME_FOR_UPDATE = 60000;
    static int NUM_METRO_STN = 172;
    String[] coln = new String[]{"Lat", "Long"};
    private SQLiteDatabase database;
    boolean is_bus;
    double latitude;
    Location location;
    protected LocationManager locationManager;
    double longitude;
    ListView lv;

    class C03191 implements OnClickListener {
        C03191() {
        }

        public void onClick(DialogInterface dialog, int which) {
            NearestBus.this.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            NearestBus.this.finish();
        }
    }

    class C03202 implements OnClickListener {
        C03202() {
        }

        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
            NearestBus.this.finish();
        }
    }

    public class NeareastBusTask extends AsyncTask<String, Void, String> {
        ArrayList<String> bus_dist;
        ArrayList<String> bus_list;
        ProgressDialog dialog;
        ArrayList<LatLng> latlng = new ArrayList();

        class C03211 implements Comparator<Entry<String, Double>> {
            C03211() {
            }

            public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
                return ((Double) o1.getValue()).compareTo((Double) o2.getValue());
            }
        }

        protected void onPreExecute() {
            this.dialog = new ProgressDialog(NearestBus.this);
            this.dialog.show();
            NearestBus.this.locationManager = (LocationManager) NearestBus.this.getSystemService(Param.LOCATION);
            if (!NearestBus.this.locationManager.isProviderEnabled("gps")) {
                NearestBus.this.showSettingsAlert();
                cancel(true);
            }
            Location gpsLocation = NearestBus.this.getLocation("gps");
            if (gpsLocation != null) {
                NearestBus.this.latitude = gpsLocation.getLatitude();
                NearestBus.this.longitude = gpsLocation.getLongitude();
            } else {
                Location nwLocation = NearestBus.this.getLocation("network");
                if (nwLocation != null) {
                    NearestBus.this.latitude = nwLocation.getLatitude();
                    NearestBus.this.longitude = nwLocation.getLongitude();
                }
            }
            Log.d("sandeep", " onPreExecute completed");
            Log.d("sandeep", " Pre Exe: lat is: " + NearestBus.this.latitude + "Lon is: " + NearestBus.this.longitude);
        }

        protected String doInBackground(String... params) {
            double[] lati = new double[1940];
            double[] longi = new double[1940];
            String[] stops1 = NearestBus.this.getResources().getStringArray(C0322R.array.Bus_stops);
            this.bus_list = new ArrayList();
            this.bus_dist = new ArrayList();
            HashMap<String, Double> hash = new HashMap();
            List<String> stop_list = Arrays.asList(stops1);
            int index = Integer.parseInt(params[0]);
            Log.d("sandeep", " doInBackground started");
            NearestBus.this.database = new DataBaseHelper(NearestBus.this).getReadableDatabase();
            Cursor cursor;
            int i;
            int i2;
            int j;
            if (index == 0) {
                cursor = NearestBus.this.database.query("busStopInfoNew", null, null, null, null, null, null, null);
                i = 0;
                if (cursor != null && cursor.getCount() > 0) {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            lati[i] = cursor.getDouble(1);
                            i2 = i + 1;
                            longi[i] = cursor.getDouble(2);
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            i = i2;
                        }
                        i = i2;
                    }
                    cursor.close();
                }
                for (j = 0; j < 1940; j++) {
                    hash.put(stops1[j], Double.valueOf(NearestBus.this.CalculationByDistance(NearestBus.this.latitude, NearestBus.this.longitude, lati[j], longi[j])));
                }
                List<Entry<String, Double>> arrayList = new ArrayList(hash.entrySet());
                Collections.sort(arrayList, new C03211());
                int loop = 0;
                for (Entry<String, Double> entry : arrayList) {
                    if (loop == 5) {
                        break;
                    }
                    loop++;
                    this.bus_list.add(entry.getKey());
                    int ind_lat = stop_list.indexOf(entry.getKey());
                    this.bus_dist.add(Double.toString(((Double) entry.getValue()).doubleValue()).substring(0, 3) + " KM");
                    System.out.println(((String) entry.getKey()) + " ==== " + entry.getValue());
                    this.latlng.add(new LatLng(lati[ind_lat], longi[ind_lat]));
                }
            } else {
                double[] lat = new double[NearestBus.NUM_METRO_STN];
                double[] lon = new double[NearestBus.NUM_METRO_STN];
                String[] metro_Stn = new String[NearestBus.NUM_METRO_STN];
                cursor = NearestBus.this.database.query("stations", null, null, null, null, null, null, null);
                i = 0;
                if (cursor != null && cursor.getCount() > 0) {
                    if (cursor.moveToFirst()) {
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
                for (j = 0; j < NearestBus.NUM_METRO_STN; j++) {
                    double d = NearestBus.this.CalculationByDistance(NearestBus.this.latitude, NearestBus.this.longitude, lat[j], lon[j]);
                    if (d < min_1) {
                        min_2 = min_1;
                        index_2 = index_1;
                        min_1 = d;
                        index_1 = j;
                    } else if (d < min_2) {
                        min_2 = d;
                        index_2 = j;
                    }
                }
                this.latlng.add(new LatLng(lat[index_1], lon[index_1]));
                this.latlng.add(new LatLng(lat[index_2], lon[index_2]));
                this.bus_list.clear();
                this.bus_dist.clear();
                this.bus_list.add(metro_Stn[index_1]);
                this.bus_list.add(metro_Stn[index_2]);
                this.bus_dist.add(Double.toString(min_1).substring(0, 3) + " Km");
                this.bus_dist.add(Double.toString(min_2).substring(0, 3) + " Km");
            }
            NearestBus.this.database.close();
            return null;
        }

        protected void onPostExecute(String result) {
            this.dialog.dismiss();
            NearestBusAdapter adapter = new NearestBusAdapter(NearestBus.this, this.bus_list, this.bus_dist, NearestBus.this.latitude, NearestBus.this.longitude, this.latlng, Boolean.valueOf(NearestBus.this.is_bus));
            NearestBus.this.lv.setVisibility(0);
            NearestBus.this.lv.setAdapter(adapter);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("   Nearest Stop");
        ActionBar bar = getActionBar();
        ((View) findViewById(16908332).getParent()).setVisibility(8);
        actionBar.setNavigationMode(2);
        for (int i = 1; i <= 2; i++) {
            Tab tab = actionBar.newTab();
            if (i == 1) {
                tab.setText(C0322R.string.nearest_bus_stops);
            } else {
                tab.setText(C0322R.string.nearest_metro_stations);
            }
            tab.setTabListener(this);
            actionBar.addTab(tab);
        }
        setContentView(C0322R.layout.nearestbus);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.lv = (ListView) findViewById(C0322R.id.listviewNearestBus);
    }

    public Location getLocation(String provider) {
        if (this.locationManager.isProviderEnabled(provider)) {
            this.locationManager.requestLocationUpdates(provider, MIN_TIME_FOR_UPDATE, 10.0f, this);
            if (this.locationManager != null) {
                this.location = this.locationManager.getLastKnownLocation(provider);
                return this.location;
            }
        }
        return null;
    }

    public void getNearest(View v) {
    }

    public void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("GPS is settings");
        alertDialog.setMessage("GPS is not enabled. Do you want to go to settings menu?");
        alertDialog.setPositiveButton("Settings", new C03191());
        alertDialog.setNegativeButton("Cancel", new C03202());
        alertDialog.show();
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

    public void onLocationChanged(Location location) {
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
    }

    public void onProviderDisabled(String provider) {
    }

    public void onProviderEnabled(String provider) {
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        if (tab.getPosition() == 0) {
            new NeareastBusTask().execute(new String[]{Integer.toString(tab.getPosition())});
            this.is_bus = true;
        } else if (tab.getPosition() == 1) {
            new NeareastBusTask().execute(new String[]{Integer.toString(tab.getPosition())});
            this.is_bus = false;
        }
    }

    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

    public void onTabReselected(Tab tab, FragmentTransaction ft) {
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
        getMenuInflater().inflate(C0322R.menu.homescrn, menu);
        return true;
    }
}
