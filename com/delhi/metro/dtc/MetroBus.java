package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.delhi.bus.BusAdpter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MetroBus extends Activity {
    BusAdpter busadpter;
    InputMethodManager imm;
    ArrayAdapter<String> listAdapterbus;
    ArrayList<String> stopList = new ArrayList();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.metrobus);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Nearest Bus");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        TextView txtitle = (TextView) findViewById(C0322R.id.Mertotitleb);
        Bundle recieve = getIntent().getExtras();
        String stnbs = recieve.getString("Sendst");
        txtitle.setText("Nearest Bus to " + recieve.getString("Sendstname"));
        try {
            InputStream instream = getAssets().open("routenamenew.txt");
            if (instream != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(instream));
                this.stopList.clear();
                while (true) {
                    String line = br.readLine();
                    if (line == null) {
                        this.busadpter = new BusAdpter(this, this.stopList);
                        final ListView mainl = (ListView) findViewById(C0322R.id.metroViewbus);
                        mainl.setVisibility(0);
                        mainl.setAdapter(this.busadpter);
                        mainl.setOnItemClickListener(new OnItemClickListener() {
                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                                Intent nextscreen = new Intent(MetroBus.this.getApplicationContext(), FareShow.class);
                                String[] vedit = mainl.getItemAtPosition(position).toString().split("\n");
                                vedit[0] = "Delhi" + vedit[0] + "Bus route";
                                nextscreen.putExtra("SendSt", vedit[0]);
                                nextscreen.putExtra("counter", "hello");
                                MetroBus.this.startActivity(nextscreen);
                            }

                            private ArrayAdapter<String> getListAdapter() {
                                return null;
                            }
                        });
                        return;
                    } else if (line.contains(stnbs)) {
                        String[] strn = line.split(",")[0].split("Bus route - ");
                        this.stopList.add(strn[0].split("Delhi")[1] + "\n" + "Route -: " + strn[1]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
