package com.delhi.bus;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import android.text.Html;
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
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import com.delhi.metro.dtc.FareShow;
import com.delhi.metro.dtc.Mainactivity_new;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusAdapter extends Activity {
    AutoCompleteTextView actv1;
    AutoCompleteTextView actv2;
    boolean busChangefound = false;
    TextView busnotfound;
    String dst;
    ArrayList<ArrayList<String>> dstLists;
    InputMethodManager imm;
    ArrayAdapter<String> listAdapter1;
    ArrayAdapter<String> listAdapter2;
    ArrayAdapter<String> listAdapterbusbp;
    ArrayAdapter<String> listAdapterbusdest;
    OnItemClickListener listener;
    InterstitialAd mInterstitialAd;
    ListView mainlp;
    ListView mainlp2;
    private SharedPreferences sharedPreferences;
    String src;
    ArrayList<ArrayList<String>> srcLists;
    ArrayList<String> stopListbusdest = new ArrayList();
    ArrayList<String> stopListbussrc = new ArrayList();
    TextView txtChangeAt;
    TextView txtbpl;
    TextView txtbpr;
    View vb1;
    View vb2;

    class C02782 implements OnItemClickListener {
        C02782() {
        }

        public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
            BusAdapter.this.imm.hideSoftInputFromWindow(BusAdapter.this.actv2.getWindowToken(), 0);
            String sp1 = BusAdapter.this.actv1.getEditableText().toString();
            BusAdapter.this.src = sp1;
            String sp2 = BusAdapter.this.actv2.getEditableText().toString();
            BusAdapter.this.dst = sp2;
            if (sp2 != null && sp2.length() != 0) {
                StringBuilder textbp = new StringBuilder();
                try {
                    InputStream instreambp = BusAdapter.this.getAssets().open("routenamenew.txt");
                    if (instreambp != null) {
                        InputStreamReader inputreaderbp = new InputStreamReader(instreambp);
                        BufferedReader brbp1 = new BufferedReader(inputreaderbp);
                        BufferedReader brbp2 = new BufferedReader(inputreaderbp);
                        BusAdapter.this.stopListbussrc.clear();
                        BusAdapter.this.stopListbusdest.clear();
                        BusAdapter.this.srcLists = new ArrayList();
                        BusAdapter.this.dstLists = new ArrayList();
                        int src_ind = 0;
                        int dst_ind = 0;
                        while (true) {
                            String line = brbp1.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] route_namesbp;
                            int i;
                            if (line.contains(sp1) || line.toLowerCase().contains(sp1.toLowerCase())) {
                                route_namesbp = line.split(",");
                                BusAdapter.this.stopListbussrc.add("Bus-" + route_namesbp[0].split("Bus route - ")[0].split("Delhi")[1]);
                                BusAdapter.this.srcLists.add(new ArrayList());
                                for (i = 1; i < route_namesbp.length; i++) {
                                    ((ArrayList) BusAdapter.this.srcLists.get(src_ind)).add(route_namesbp[i]);
                                }
                                src_ind++;
                            }
                            if (line.contains(sp2) || line.toLowerCase().contains(sp2.toLowerCase())) {
                                route_namesbp = line.split(",");
                                BusAdapter.this.stopListbusdest.add("Bus-" + route_namesbp[0].split("Bus route - ")[0].split("Delhi")[1]);
                                BusAdapter.this.dstLists.add(new ArrayList());
                                for (i = 1; i < route_namesbp.length; i++) {
                                    ((ArrayList) BusAdapter.this.dstLists.get(dst_ind)).add(route_namesbp[i]);
                                }
                                dst_ind++;
                            }
                        }
                        List<String> arrayList = new ArrayList(BusAdapter.this.stopListbussrc);
                        arrayList.retainAll(BusAdapter.this.stopListbusdest);
                        if (arrayList.size() > 0) {
                            BusAdapter.this.listAdapterbusbp = new ArrayAdapter(BusAdapter.this, C0322R.layout.busstoppath, arrayList);
                            BusAdapter.this.mainlp = (ListView) BusAdapter.this.findViewById(C0322R.id.listViewbusp1);
                            BusAdapter.this.mainlp.setVisibility(0);
                            BusAdapter.this.mainlp.setOnItemClickListener(BusAdapter.this.listener);
                            BusAdapter.this.mainlp.setAdapter(BusAdapter.this.listAdapterbusbp);
                            BusAdapter.this.mainlp2.setVisibility(8);
                            BusAdapter.this.txtbpr.setVisibility(8);
                            BusAdapter.this.mainlp.setDivider(null);
                            BusAdapter.this.busnotfound.setVisibility(8);
                            BusAdapter.this.txtChangeAt.setVisibility(8);
                            BusAdapter.this.txtbpl.setTextSize(20.0f);
                            BusAdapter.this.txtbpl.setBackgroundColor(-39424);
                            BusAdapter.this.txtbpl.setTextColor(-1);
                            BusAdapter.this.txtbpl.setText(Html.fromHtml(arrayList.size() + " Routes are found from " + "<b>" + sp1 + "</b>" + " To " + "<b>" + sp2 + "</b>"));
                            return;
                        }
                        new AsyncTaskRunner().execute(new ArrayList[]{BusAdapter.this.srcLists, BusAdapter.this.dstLists});
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private InputStream openFileInput(File file) {
            return null;
        }
    }

    class C02793 implements OnItemClickListener {
        C02793() {
        }

        public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
            BusAdapter.this.imm.hideSoftInputFromWindow(BusAdapter.this.actv2.getWindowToken(), 0);
            String sp1 = BusAdapter.this.actv1.getEditableText().toString();
            BusAdapter.this.src = sp1;
            String sp2 = BusAdapter.this.actv2.getEditableText().toString();
            BusAdapter.this.dst = sp2;
            if (sp1 != null && sp1.length() != 0) {
                StringBuilder textbp = new StringBuilder();
                try {
                    InputStream instreambp = BusAdapter.this.getAssets().open("routenamenew.txt");
                    if (instreambp != null) {
                        InputStreamReader inputreaderbp = new InputStreamReader(instreambp);
                        BufferedReader brbp1 = new BufferedReader(inputreaderbp);
                        BufferedReader brbp2 = new BufferedReader(inputreaderbp);
                        BusAdapter.this.srcLists = new ArrayList();
                        BusAdapter.this.dstLists = new ArrayList();
                        BusAdapter.this.stopListbussrc.clear();
                        BusAdapter.this.stopListbusdest.clear();
                        int src_ind = 0;
                        int dst_ind = 0;
                        while (true) {
                            String line = brbp1.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] route_namesbp;
                            int i;
                            if (line.contains(sp1) || line.toLowerCase().contains(sp1.toLowerCase())) {
                                route_namesbp = line.split(",");
                                BusAdapter.this.stopListbussrc.add("Bus-" + route_namesbp[0].split("Bus route - ")[0].split("Delhi")[1]);
                                BusAdapter.this.srcLists.add(new ArrayList());
                                for (i = 1; i < route_namesbp.length; i++) {
                                    ((ArrayList) BusAdapter.this.srcLists.get(src_ind)).add(route_namesbp[i]);
                                }
                                src_ind++;
                            }
                            if (line.contains(sp2) || line.toLowerCase().contains(sp2.toLowerCase())) {
                                route_namesbp = line.split(",");
                                BusAdapter.this.stopListbusdest.add("Bus-" + route_namesbp[0].split("Bus route - ")[0].split("Delhi")[1]);
                                BusAdapter.this.dstLists.add(new ArrayList());
                                for (i = 1; i < route_namesbp.length; i++) {
                                    ((ArrayList) BusAdapter.this.dstLists.get(dst_ind)).add(route_namesbp[i]);
                                }
                                dst_ind++;
                            }
                        }
                        List<String> arrayList = new ArrayList(BusAdapter.this.stopListbussrc);
                        arrayList.retainAll(BusAdapter.this.stopListbusdest);
                        if (arrayList.size() > 0) {
                            BusAdapter.this.listAdapterbusbp = new ArrayAdapter(BusAdapter.this, C0322R.layout.busstoppath, arrayList);
                            BusAdapter.this.mainlp = (ListView) BusAdapter.this.findViewById(C0322R.id.listViewbusp1);
                            BusAdapter.this.mainlp.setVisibility(0);
                            BusAdapter.this.mainlp.setAdapter(BusAdapter.this.listAdapterbusbp);
                            BusAdapter.this.mainlp2.setVisibility(8);
                            BusAdapter.this.txtbpr.setVisibility(8);
                            BusAdapter.this.mainlp.setDivider(null);
                            BusAdapter.this.mainlp.setOnItemClickListener(BusAdapter.this.listener);
                            BusAdapter.this.busnotfound.setVisibility(8);
                            BusAdapter.this.txtChangeAt.setVisibility(8);
                            BusAdapter.this.txtbpl.setTextSize(20.0f);
                            BusAdapter.this.txtbpl.setBackgroundColor(-39424);
                            BusAdapter.this.txtbpl.setTextColor(-1);
                            BusAdapter.this.txtbpl.setGravity(17);
                            BusAdapter.this.txtbpl.setText(Html.fromHtml(arrayList.size() + " Routes are found from " + "<b>" + sp1 + "</b>" + " To " + "<b>" + sp2 + "</b>"));
                        } else {
                            new AsyncTaskRunner().execute(new ArrayList[]{BusAdapter.this.srcLists, BusAdapter.this.dstLists});
                        }
                        BusAdapter.this.sharedPreferences = BusAdapter.this.getSharedPreferences("version", 0);
                        int counter = BusAdapter.this.sharedPreferences.getInt("RatingCounter", 0);
                        Editor sharedPreferencesEditor = BusAdapter.this.sharedPreferences.edit();
                        sharedPreferencesEditor.putInt("RatingCounter", counter + 1);
                        sharedPreferencesEditor.commit();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private InputStream openFileInput(File file) {
            return null;
        }
    }

    class C02804 implements OnItemClickListener {
        C02804() {
        }

        public void onItemClick(AdapterView<?> adapterView, View arg1, int position, long arg3) {
            Intent nextscreen = new Intent(BusAdapter.this.getApplicationContext(), FareShow.class);
            String[] vedit = BusAdapter.this.mainlp.getItemAtPosition(position).toString().split("-");
            vedit[1] = "Delhi" + vedit[1] + "Bus route";
            nextscreen.putExtra("SendSt", vedit[1]);
            nextscreen.putExtra("counter", "hello");
            BusAdapter.this.startActivity(nextscreen);
        }
    }

    class C02815 implements OnItemClickListener {
        C02815() {
        }

        public void onItemClick(AdapterView<?> adapterView, View arg1, int position, long arg3) {
            Intent nextscreen = new Intent(BusAdapter.this.getApplicationContext(), FareShow.class);
            String[] vedit = BusAdapter.this.mainlp2.getItemAtPosition(position).toString().split("-");
            vedit[1] = "Delhi" + vedit[1] + "Bus route";
            nextscreen.putExtra("SendSt", vedit[1]);
            nextscreen.putExtra("counter", "hello");
            BusAdapter.this.startActivity(nextscreen);
        }
    }

    private class AsyncTaskRunner extends AsyncTask<ArrayList<ArrayList<String>>, Void, ArrayList<ArrayList<String>>> {
        ArrayList bus1_list;
        ArrayList bus2_list;
        ArrayList bus_changeAt;
        ProgressDialog dialog;
        ArrayList<ArrayList<String>> dstLists;
        ArrayList<ArrayList<String>> srcLists;

        private AsyncTaskRunner() {
        }

        protected void onPreExecute() {
            this.dialog = new ProgressDialog(BusAdapter.this);
            this.dialog.show();
        }

        protected ArrayList<ArrayList<String>> doInBackground(ArrayList<ArrayList<String>>... params) {
            this.bus1_list = new ArrayList();
            this.bus2_list = new ArrayList();
            this.bus_changeAt = new ArrayList();
            this.srcLists = params[0];
            this.dstLists = params[1];
            int i = 0;
            ArrayList<String> total_bus_routes = new ArrayList();
            while (i < this.srcLists.size() && this.srcLists.get(i) != null) {
                Iterator it = ((ArrayList) this.srcLists.get(i)).iterator();
                while (it.hasNext()) {
                    String src = (String) it.next();
                    int j = 0;
                    while (j < this.dstLists.size() && this.dstLists.get(j) != null) {
                        Iterator it2 = ((ArrayList) this.dstLists.get(j)).iterator();
                        while (it2.hasNext()) {
                            if (src.equals((String) it2.next())) {
                                BusAdapter.this.busChangefound = true;
                                this.bus_changeAt.add(src);
                                this.bus1_list.add(((String) BusAdapter.this.stopListbussrc.get(i)).substring(5));
                                this.bus2_list.add(((String) BusAdapter.this.stopListbusdest.get(j)).substring(5));
                                Log.d("sandeep", "src is: " + src + "bus-1 :" + ((String) BusAdapter.this.stopListbussrc.get(i)).substring(5) + "bus-2:" + ((String) BusAdapter.this.stopListbusdest.get(j)).substring(5));
                                Log.d("sandeep", "src is: " + src + " " + i);
                            }
                        }
                        j++;
                    }
                }
                i++;
            }
            return null;
        }

        protected void onPostExecute(ArrayList<ArrayList<String>> arrayList) {
            this.dialog.dismiss();
            if (BusAdapter.this.busChangefound) {
                BusAdapter.this.listAdapterbusbp = new BusChangeAdapter(BusAdapter.this, this.bus1_list, this.bus2_list, this.bus_changeAt);
                BusAdapter.this.busnotfound.setBackgroundColor(-39424);
                BusAdapter.this.busnotfound.setVisibility(0);
                BusAdapter.this.txtbpl.setText("Bus No:");
                Log.d("sandeep", "bus chnage was found");
                BusAdapter.this.txtChangeAt.setVisibility(0);
                BusAdapter.this.txtChangeAt.setText("Change At");
                BusAdapter.this.txtbpr.setText("Bus No:");
                BusAdapter.this.busnotfound.setBackgroundColor(-39424);
                BusAdapter.this.mainlp.setVisibility(0);
                BusAdapter.this.mainlp.setDivider(new ColorDrawable(SupportMenu.CATEGORY_MASK));
                BusAdapter.this.mainlp.setDividerHeight(0);
                BusAdapter.this.mainlp.setOnItemClickListener(null);
                BusAdapter.this.txtbpr.setVisibility(0);
                BusAdapter.this.mainlp2.setVisibility(8);
                BusAdapter.this.busnotfound.setVisibility(0);
                BusAdapter.this.txtbpl.setBackgroundColor(0);
                BusAdapter.this.txtbpl.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                BusAdapter.this.txtbpl.setTextSize(16.0f);
                BusAdapter.this.mainlp.setAdapter(BusAdapter.this.listAdapterbusbp);
                BusAdapter.this.busnotfound.setText("Following Bus route was found for entered Stops");
            } else {
                BusAdapter.this.listAdapterbusbp = new ArrayAdapter(BusAdapter.this, C0322R.layout.busstoppath, BusAdapter.this.stopListbussrc);
                BusAdapter.this.listAdapterbusdest = new ArrayAdapter(BusAdapter.this, C0322R.layout.busstoppath, BusAdapter.this.stopListbusdest);
                BusAdapter.this.txtbpl.setText("Routes from " + BusAdapter.this.src);
                BusAdapter.this.txtbpr.setText("Routes from " + BusAdapter.this.dst);
                BusAdapter.this.busnotfound.setBackgroundColor(-39424);
                BusAdapter.this.txtChangeAt.setVisibility(8);
                BusAdapter.this.mainlp.setVisibility(0);
                BusAdapter.this.mainlp.setDivider(null);
                BusAdapter.this.txtbpr.setVisibility(0);
                BusAdapter.this.mainlp2.setVisibility(0);
                BusAdapter.this.busnotfound.setVisibility(0);
                BusAdapter.this.txtbpl.setBackgroundColor(0);
                BusAdapter.this.txtbpl.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                BusAdapter.this.txtbpl.setTextSize(16.0f);
                BusAdapter.this.mainlp.setAdapter(BusAdapter.this.listAdapterbusbp);
                BusAdapter.this.mainlp2.setAdapter(BusAdapter.this.listAdapterbusdest);
                BusAdapter.this.busnotfound.setText("No Direct Bus route was found for entered Stops");
                Log.d("sandeep", "bus chnage was NOT found");
            }
            BusAdapter.this.busChangefound = false;
        }
    }

    class C08751 extends AdListener {
        C08751() {
        }

        public void onAdClosed() {
            BusAdapter.this.finish();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.buspath);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setTitle("Bus Route");
        actionBar.setDisplayHomeAsUpEnabled(true);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2063508739004093/9568692565");
        this.mInterstitialAd.setAdListener(new C08751());
        this.mInterstitialAd.loadAd(new Builder().build());
        this.actv1 = (AutoCompleteTextView) findViewById(C0322R.id.autoCompleteTextView1);
        this.actv2 = (AutoCompleteTextView) findViewById(C0322R.id.autoCompleteTextView2);
        String[] stops1 = getResources().getStringArray(C0322R.array.Bus_stops);
        String[] stops2 = getResources().getStringArray(C0322R.array.Bus_stops);
        this.listAdapter1 = new ArrayAdapter(this, 17367050, stops1);
        this.listAdapter2 = new ArrayAdapter(this, 17367050, stops2);
        this.actv1.setAdapter(this.listAdapter1);
        this.actv2.setAdapter(this.listAdapter2);
        this.mainlp = (ListView) findViewById(C0322R.id.listViewbusp1);
        this.mainlp2 = (ListView) findViewById(C0322R.id.listViewbusp2);
        this.txtbpl = (TextView) findViewById(C0322R.id.TextView01);
        this.txtbpr = (TextView) findViewById(C0322R.id.TextView02);
        this.txtChangeAt = (TextView) findViewById(C0322R.id.TextViewChangeAt);
        this.busnotfound = (TextView) findViewById(C0322R.id.textViewBusPath);
        this.vb1 = findViewById(C0322R.id.Vbt1);
        this.vb2 = findViewById(C0322R.id.Vbt2);
        this.imm = (InputMethodManager) getSystemService("input_method");
        this.actv1.setOnItemClickListener(new C02782());
        this.actv2.setOnItemClickListener(new C02793());
        this.listener = new C02804();
        this.mainlp2.setOnItemClickListener(new C02815());
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
