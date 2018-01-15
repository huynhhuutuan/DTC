package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.delhi.adapters.RailwayAdapter;

public class Railway extends Activity {
    ListView listView;
    String[] stations = new String[]{"Old Delhi Railways Station", "Hazrat Nizamudin Railway Station", "New Delhi Railway Station", "Sarai Rohilla Railway Station", "Subzi Mandi", "Anand Vihar Railway Station"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.railway);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Railway Stations");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.listView = (ListView) findViewById(C0322R.id.listView1);
        this.listView.setAdapter(new RailwayAdapter(this, this.stations));
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
