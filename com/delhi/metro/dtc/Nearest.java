package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Nearest extends Activity {
    Button bt1;
    Button bt2;

    class C03171 implements OnClickListener {
        C03171() {
        }

        public void onClick(View arg0) {
            Nearest.this.startActivity(new Intent(Nearest.this.getApplicationContext(), NearestBus.class));
        }
    }

    class C03182 implements OnClickListener {
        C03182() {
        }

        public void onClick(View arg0) {
            Nearest.this.startActivity(new Intent(Nearest.this.getApplicationContext(), ShowAddress.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.nearest);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Nearest Stops");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.bt1 = (Button) findViewById(C0322R.id.nearestmetrobus);
        this.bt2 = (Button) findViewById(C0322R.id.searchaddress);
        this.bt1.setOnClickListener(new C03171());
        this.bt2.setOnClickListener(new C03182());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                break;
            case C0322R.id.homescr:
                break;
        }
        Intent nextscreen = new Intent(getApplicationContext(), Mainactivity_new.class);
        nextscreen.setFlags(67108864);
        startActivity(nextscreen);
        finish();
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0322R.menu.homescrn, menu);
        return true;
    }
}
