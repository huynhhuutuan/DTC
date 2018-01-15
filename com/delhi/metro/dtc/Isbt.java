package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.delhi.adapters.IsbtAdpater;
import java.util.ArrayList;

public class Isbt extends Activity {
    ArrayList<String> isbt_list;
    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.isbt);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("ISBT Information");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        init();
        this.listView = (ListView) findViewById(C0322R.id.listViewIsbt);
        this.listView.setAdapter(new IsbtAdpater(this, this.isbt_list));
    }

    public void init() {
        this.isbt_list = new ArrayList();
        this.isbt_list.add(getResources().getString(C0322R.string.kashmere_gate_isbt));
        this.isbt_list.add(getResources().getString(C0322R.string.anand_vihar_isbt) + "      ");
        this.isbt_list.add(getResources().getString(C0322R.string.kale_khan_isbt));
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
