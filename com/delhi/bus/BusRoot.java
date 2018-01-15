package com.delhi.bus;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import com.delhi.metro.dtc.FareShow;
import com.delhi.metro.dtc.Mainactivity_new;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BusRoot extends Activity {
    AutoCompleteTextView actvbus;
    BusAdpter busadpter;
    InputMethodManager imm;
    ArrayAdapter<String> listAdapterbus;
    InterstitialAd mInterstitialAd;
    private SharedPreferences sharedPreferences;
    Spinner spinnerbs;
    ArrayList<String> stopList = new ArrayList();
    TextView txtbp;

    class C08761 extends AdListener {
        C08761() {
        }

        public void onAdClosed() {
            BusRoot.this.finish();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.busroot);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("DTC Bus");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2063508739004093/7673156967");
        this.mInterstitialAd.setAdListener(new C08761());
        this.mInterstitialAd.loadAd(new Builder().build());
        this.actvbus = (AutoCompleteTextView) findViewById(C0322R.id.autoCompleteTextViewbus);
        final String[] stopsr = getResources().getStringArray(C0322R.array.Bus_arrays);
        String[] stopsp = getResources().getStringArray(C0322R.array.Bus_stops);
        this.txtbp = (TextView) findViewById(C0322R.id.textViewb);
        this.actvbus.setAdapter(new ArrayAdapter(this, 17367050, stopsr));
        final TextView textviewb = (TextView) findViewById(C0322R.id.textViewb);
        this.imm = (InputMethodManager) getSystemService("input_method");
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String bus_stn = bundle.getString("BUS_STATION");
            findBusRouteExternal(bus_stn);
            this.actvbus.clearFocus();
            this.actvbus.setText(bus_stn);
            this.actvbus.setSelection(bus_stn.length());
            this.actvbus.dismissDropDown();
            this.imm.hideSoftInputFromWindow(this.actvbus.getWindowToken(), 0);
        }
        this.actvbus.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                ArrayList<String> al = new ArrayList();
                for (String add : stopsr) {
                    al.add(add);
                }
                BusRoot.this.imm.hideSoftInputFromWindow(BusRoot.this.actvbus.getWindowToken(), 0);
                String stnbs = BusRoot.this.actvbus.getEditableText().toString();
                int index = al.indexOf(stnbs);
                String s = Integer.toString(index);
                StringBuilder text;
                InputStream instream;
                BufferedReader br;
                String line;
                final ListView mainl;
                if (index < 811) {
                    if (index < 799) {
                        stnbs = "Delhi  " + stnbs + " ";
                    } else {
                        stnbs = "Noida  " + stnbs + " ";
                    }
                    text = new StringBuilder();
                    try {
                        instream = BusRoot.this.getAssets().open("routenamenew.txt");
                        if (instream != null) {
                            br = new BufferedReader(new InputStreamReader(instream));
                            do {
                                line = br.readLine();
                                if (line != null) {
                                }
                                break;
                            } while (!line.contains(stnbs));
                            BusRoot.this.stopList.clear();
                            String[] route_names = line.split(",");
                            for (Object add2 : route_names) {
                                BusRoot.this.stopList.add(add2);
                            }
                            BusRoot.this.listAdapterbus = new ArrayAdapter(BusRoot.this, C0322R.layout.busstoplist, BusRoot.this.stopList);
                            mainl = (ListView) BusRoot.this.findViewById(C0322R.id.listViewbus);
                            mainl.setVisibility(0);
                            if (BusRoot.this.stopList.size() > 0) {
                                BusRoot.this.txtbp.setText((CharSequence) BusRoot.this.stopList.get(0));
                            }
                            BusRoot.this.txtbp.setBackgroundColor(-39424);
                            BusRoot.this.txtbp.setTextColor(-1);
                            if (BusRoot.this.stopList.size() > 0) {
                                BusRoot.this.stopList.remove(0);
                            }
                            mainl.setOnItemClickListener(new OnItemClickListener() {
                                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                                    Intent nextscreen = new Intent(BusRoot.this.getApplicationContext(), FareShow.class);
                                    String v = mainl.getItemAtPosition(position).toString();
                                }

                                private ArrayAdapter<String> getListAdapter() {
                                    return null;
                                }
                            });
                            mainl.setAdapter(BusRoot.this.listAdapterbus);
                        } else {
                            textviewb.setText("hello");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    BusRoot.this.txtbp.setText("");
                    text = new StringBuilder();
                    try {
                        instream = BusRoot.this.getAssets().open("routenamenew.txt");
                        if (instream != null) {
                            br = new BufferedReader(new InputStreamReader(instream));
                            BusRoot.this.stopList.clear();
                            while (true) {
                                line = br.readLine();
                                if (line == null) {
                                    break;
                                } else if (line.contains(stnbs) || line.toLowerCase().contains(stnbs.toLowerCase())) {
                                    String[] strn = line.split(",")[0].split("Bus route - ");
                                    BusRoot.this.stopList.add(strn[0].split("Delhi")[1] + "\n" + "Route -: " + strn[1]);
                                }
                            }
                            BusRoot.this.busadpter = new BusAdpter(BusRoot.this, BusRoot.this.stopList);
                            mainl = (ListView) BusRoot.this.findViewById(C0322R.id.listViewbus);
                            mainl.setVisibility(0);
                            BusRoot.this.txtbp.setBackgroundColor(-39424);
                            BusRoot.this.txtbp.setTextColor(-1);
                            BusRoot.this.txtbp.setText("Bus Route Passing Through \n" + stnbs);
                            mainl.setAdapter(BusRoot.this.busadpter);
                            mainl.setOnItemClickListener(new OnItemClickListener() {
                                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                                    Intent nextscreen = new Intent(BusRoot.this.getApplicationContext(), FareShow.class);
                                    String[] vedit = mainl.getItemAtPosition(position).toString().split("\n");
                                    vedit[0] = "Delhi" + vedit[0] + "Bus route";
                                    nextscreen.putExtra("SendSt", vedit[0]);
                                    nextscreen.putExtra("counter", "hello");
                                    BusRoot.this.startActivity(nextscreen);
                                }

                                private ArrayAdapter<String> getListAdapter() {
                                    return null;
                                }
                            });
                        } else {
                            textviewb.setText("hello");
                        }
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                BusRoot.this.sharedPreferences = BusRoot.this.getSharedPreferences("version", 0);
                int counter = BusRoot.this.sharedPreferences.getInt("RatingCounter", 0);
                Editor sharedPreferencesEditor = BusRoot.this.sharedPreferences.edit();
                sharedPreferencesEditor.putInt("RatingCounter", counter + 1);
                sharedPreferencesEditor.commit();
            }
        });
    }

    public void findBusRouteExternal(String bus_stn) {
        this.txtbp.setText("");
        StringBuilder text = new StringBuilder();
        try {
            InputStream instream = getAssets().open("routenamenew.txt");
            if (instream != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(instream));
                this.stopList.clear();
                while (true) {
                    String line = br.readLine();
                    if (line == null) {
                        this.busadpter = new BusAdpter(this, this.stopList);
                        final ListView mainl = (ListView) findViewById(C0322R.id.listViewbus);
                        mainl.setVisibility(0);
                        this.txtbp.setBackgroundColor(-39424);
                        this.txtbp.setTextColor(-1);
                        this.txtbp.setText("Bus Route Passing Through \n" + bus_stn);
                        mainl.setAdapter(this.busadpter);
                        mainl.setOnItemClickListener(new OnItemClickListener() {
                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                                Intent nextscreen = new Intent(BusRoot.this.getApplicationContext(), FareShow.class);
                                String[] vedit = mainl.getItemAtPosition(position).toString().split("\n");
                                vedit[0] = "Delhi" + vedit[0] + "Bus route";
                                nextscreen.putExtra("SendSt", vedit[0]);
                                nextscreen.putExtra("counter", "hello");
                                BusRoot.this.startActivity(nextscreen);
                            }

                            private ArrayAdapter<String> getListAdapter() {
                                return null;
                            }
                        });
                        return;
                    } else if (line.contains(bus_stn)) {
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

    public void onBackPressed() {
        super.onBackPressed();
        Log.d("sandeep", "onBackPressed");
        if (this.mInterstitialAd.isLoaded()) {
            Log.d("sandeep", "onBackPressed isLoaded");
            this.mInterstitialAd.show();
        }
    }
}
