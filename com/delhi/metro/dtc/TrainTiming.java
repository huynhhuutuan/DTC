package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import java.io.IOException;
import java.util.ArrayList;

public class TrainTiming extends Activity {
    protected static final String STATION_NAME = "Station Name";
    private String[] allColumns = new String[]{"StationID", "StationName"};
    private SQLiteDatabase database;
    ListView first_Train;
    ArrayList<String> first_list;
    ArrayList<String> first_list_time;
    ListView last_Train;
    ArrayList<String> last_list;
    ArrayList<String> last_list_time;
    Metro_Map metro;
    TextView title_head;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.train_timing);
        TextView title_head = (TextView) findViewById(C0322R.id.titleTiming);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Train Timings");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        Intent intent = getIntent();
        String stn_name = "";
        if (intent != null) {
            stn_name = intent.getExtras().getString(STATION_NAME);
        }
        title_head.setText(stn_name);
        this.metro = new Metro_Map();
        this.first_Train = (ListView) findViewById(C0322R.id.listviewFirstTrain);
        this.last_Train = (ListView) findViewById(C0322R.id.listViewLastTrain);
        DataBaseHelper myDbHelper = new DataBaseHelper(this);
        try {
            myDbHelper.createDataBase();
            try {
                myDbHelper.openDataBase();
                this.database = myDbHelper.getReadableDatabase();
                this.first_list = getFirstMetro(stn_name);
                this.last_list = getLastMetro(stn_name);
                TimingAdapter listAdapterFisrt = new TimingAdapter(this, this.first_list, this.metro, this.first_list_time);
                TimingAdapter listAdapterLast = new TimingAdapter(this, this.last_list, this.metro, this.last_list_time);
                this.first_Train.setAdapter(listAdapterFisrt);
                this.last_Train.setAdapter(listAdapterLast);
            } catch (SQLException sqle) {
                throw sqle;
            }
        } catch (IOException e) {
            throw new Error("Unable to create database");
        }
    }

    private ArrayList<String> getLastMetro(String stn_name) {
        ArrayList<String> arr = new ArrayList();
        this.last_list_time = new ArrayList();
        String stn_id = "";
        Cursor cursor = this.database.query("stations", this.allColumns, "StationName=?", new String[]{stn_name}, null, null, null, null);
        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            stn_id = cursor.getString(0);
            cursor.close();
        }
        Cursor cursor_time = this.database.query("timings", null, "FromStation=? AND isFirst=?", new String[]{stn_id, "1"}, null, null, null, null);
        if (cursor_time != null) {
            cursor_time.moveToFirst();
            while (!cursor_time.isAfterLast()) {
                this.last_list_time.add(cursor_time.getString(2));
                cursor = this.database.query("stations", null, "StationID=?", new String[]{cursor_time.getString(1)}, null, null, null, null);
                if (cursor != null) {
                    cursor.moveToFirst();
                    arr.add(cursor.getString(1));
                }
                cursor_time.moveToNext();
            }
            cursor.close();
            cursor_time.close();
        }
        return arr;
    }

    private ArrayList<String> getFirstMetro(String stn_name) {
        ArrayList<String> arr = new ArrayList();
        this.first_list_time = new ArrayList();
        String stn_id = "";
        Cursor cursor = this.database.query("stations", this.allColumns, "StationName=?", new String[]{stn_name}, null, null, null, null);
        if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToFirst();
            stn_id = cursor.getString(0);
            cursor.close();
        }
        Cursor cursor_time = this.database.query("timings", null, "FromStation=? AND isFirst=?", new String[]{stn_id, "0"}, null, null, null, null);
        if (cursor_time != null) {
            cursor_time.moveToFirst();
            while (!cursor_time.isAfterLast()) {
                this.first_list_time.add(cursor_time.getString(2));
                cursor = this.database.query("stations", null, "StationID=?", new String[]{cursor_time.getString(1)}, null, null, null, null);
                if (cursor != null) {
                    cursor.moveToFirst();
                    arr.add(cursor.getString(1));
                }
                cursor_time.moveToNext();
            }
            cursor.close();
            cursor_time.close();
        }
        return arr;
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
