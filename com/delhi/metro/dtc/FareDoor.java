package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class FareDoor extends Activity {
    ArrayList<String> airpotLine;
    private String[] allColumns = new String[]{"StationID", "StationName"};
    private SQLiteDatabase database;
    int dayOfWeek = 0;
    AutoCompleteTextView dstStn;
    InputMethodManager imm;
    InterstitialAd mInterstitialAd;
    DataBaseHelper myDbHelper;
    private SharedPreferences sharedPreferences;
    Spinner spinner1;
    Spinner spinner2;
    AutoCompleteTextView srcStn;
    String stn1;
    String stn2;
    ExpandableListView t1;

    class C08771 extends AdListener {
        C08771() {
        }

        public void onAdClosed() {
            FareDoor.this.finish();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.fare);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2063508739004093/6420409763");
        this.mInterstitialAd.setAdListener(new C08771());
        this.mInterstitialAd.loadAd(new Builder().build());
        final TextView textView1 = (TextView) findViewById(C0322R.id.textViewfare);
        final TextView textView2 = (TextView) findViewById(C0322R.id.textViewStations);
        final TextView textView3 = (TextView) findViewById(C0322R.id.textViewTime);
        final LinearLayout layout = (LinearLayout) findViewById(C0322R.id.linearLayout1);
        this.srcStn = (AutoCompleteTextView) findViewById(C0322R.id.autoCompTextsrc);
        this.dstStn = (AutoCompleteTextView) findViewById(C0322R.id.autoCompTextdst);
        this.t1 = (ExpandableListView) findViewById(C0322R.id.listView1);
        String[] metroStn = getResources().getStringArray(C0322R.array.Station_arrays);
        ArrayAdapter<String> listAdapterr1 = new ArrayAdapter(this, 17367050, metroStn);
        final List<String> list = Arrays.asList(metroStn);
        this.airpotLine = new ArrayList();
        this.airpotLine.add("Shivaji Stadium");
        this.airpotLine.add("Dhaula Kuan");
        this.airpotLine.add("Delhi Aerocity");
        this.airpotLine.add("IGI Airport (T-3)");
        final byte[][] airportFare = new byte[][]{new byte[]{(byte) 10, (byte) 20, (byte) 40, (byte) 50, (byte) 60, (byte) 60}, new byte[]{(byte) 20, (byte) 10, (byte) 20, (byte) 30, (byte) 50, (byte) 60}, new byte[]{(byte) 40, (byte) 20, (byte) 10, (byte) 20, (byte) 30, (byte) 50}, new byte[]{(byte) 50, (byte) 30, (byte) 20, (byte) 10, (byte) 20, (byte) 30}, new byte[]{(byte) 60, (byte) 50, (byte) 30, (byte) 20, (byte) 10, (byte) 20}, new byte[]{(byte) 60, (byte) 60, (byte) 50, (byte) 30, (byte) 20, (byte) 10}};
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Metro Route");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF6600")));
        this.imm = (InputMethodManager) getSystemService("input_method");
        this.srcStn.setAdapter(listAdapterr1);
        Typeface tf = Typeface.createFromAsset(getAssets(), "font/Rupee_Foradian.ttf");
        textView1.setTypeface(tf, 1);
        textView3.setTypeface(tf, 1);
        textView2.setTypeface(tf, 1);
        this.dayOfWeek = Calendar.getInstance().get(7);
        this.myDbHelper = new DataBaseHelper(this);
        this.srcStn.setOnItemClickListener(new OnItemClickListener() {

            class C02881 implements OnClickListener {
                C02881() {
                }

                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    layout.setVisibility(8);
                    FareDoor.this.t1.setVisibility(8);
                    textView1.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }

            class C02892 implements OnClickListener {
                C02892() {
                }

                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    layout.setVisibility(8);
                    FareDoor.this.t1.setVisibility(8);
                    textView1.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }

            public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                FareDoor.this.imm.hideSoftInputFromWindow(FareDoor.this.dstStn.getWindowToken(), 0);
                Editable stnr = FareDoor.this.srcStn.getEditableText();
                FareDoor.this.stn1 = stnr.toString();
                if (FareDoor.this.stn2 != null) {
                    int J = list.indexOf(FareDoor.this.stn1);
                    int k = list.indexOf(FareDoor.this.stn2);
                    AlertDialog.Builder alertDialog;
                    if (J == -1 || k == -1) {
                        alertDialog = new AlertDialog.Builder(FareDoor.this);
                        alertDialog.setCancelable(true);
                        alertDialog.setTitle("Notice");
                        alertDialog.setMessage("Please Enter the stations properly");
                        alertDialog.setPositiveButton("OK", new C02881());
                        alertDialog.show();
                    } else if (FareDoor.this.stn1.equals(FareDoor.this.stn2)) {
                        alertDialog = new AlertDialog.Builder(FareDoor.this);
                        alertDialog.setTitle("Notice");
                        alertDialog.setMessage("Both Stations Same,Fare is 10.00 Rs");
                        alertDialog.setPositiveButton("OK", new C02892());
                        alertDialog.show();
                    } else {
                        layout.setVisibility(0);
                        textView1.setVisibility(0);
                        textView2.setVisibility(0);
                        Metro_Map mp = new Metro_Map();
                        if (!FareDoor.this.airpotLine.contains(FareDoor.this.stn1) && !FareDoor.this.airpotLine.contains(FareDoor.this.stn2)) {
                            mp.findPathBFS(FareDoor.this.stn1, FareDoor.this.stn2);
                            textView1.setText("Fare\n` " + FareDoor.this.getFareAll(J, k));
                            textView3.setText("Time\n" + ((int) ((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                        } else if (FareDoor.this.airpotLine.contains(FareDoor.this.stn1) && FareDoor.this.airpotLine.contains(FareDoor.this.stn2)) {
                            int src = FareDoor.this.airpotLine.indexOf(FareDoor.this.stn1);
                            int dst = FareDoor.this.airpotLine.indexOf(FareDoor.this.stn2);
                            int ind;
                            if (src < dst) {
                                ind = src;
                                while (ind <= dst) {
                                    ind = ind + 1;
                                    mp.itemsList.add(FareDoor.this.airpotLine.get(ind));
                                    ind = ind;
                                }
                                ind = ind;
                            } else {
                                ind = src;
                                while (ind >= dst) {
                                    ind = ind - 1;
                                    mp.itemsList.add(FareDoor.this.airpotLine.get(ind));
                                    ind = ind;
                                }
                                ind = ind;
                            }
                            if (1 != FareDoor.this.dayOfWeek || airportFare[src + 1][dst + 1] <= (byte) 60) {
                                textView1.setText("Fare\n` " + FareDoor.this.getFareAll(J, k) + airportFare[src + 1][dst + 1]);
                            } else {
                                textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + 60);
                            }
                            textView3.setText("Time\n" + ((mp.itemsList.size() - 1) * 5) + " mins");
                        } else if (FareDoor.this.airpotLine.contains(FareDoor.this.stn2)) {
                            if (FareDoor.this.stn1.equals("NewDelhi")) {
                                mp.itemsList.add("NewDelhi");
                            } else {
                                mp.findPathBFS(FareDoor.this.stn1, "NewDelhi");
                            }
                            mp_air = new Metro_Map();
                            if (FareDoor.this.stn1.equals("Dwarka Sector - 21")) {
                                mp_air.itemsList.add("Dwarka Sector - 21");
                            } else {
                                mp_air.findPathBFS(FareDoor.this.stn1, "Dwarka Sector - 21");
                            }
                            if (mp.itemsList.size() < mp_air.itemsList.size()) {
                                index = 0;
                                if (mp.itemsList.size() > 1) {
                                    mp.itemsList.set(mp.itemsList.indexOf("NewDelhi"), "Change at: NewDelhi");
                                }
                                while (!FareDoor.this.stn2.equals(FareDoor.this.airpotLine.get(index))) {
                                    mp.itemsList.add(FareDoor.this.airpotLine.get(index));
                                    index++;
                                }
                                mp.itemsList.add(FareDoor.this.airpotLine.get(index));
                                k = list.indexOf("NewDelhi");
                                FareDoor.this.stn2 = "NewDelhi";
                                if (FareDoor.this.stn1.equals("NewDelhi")) {
                                    if (1 != FareDoor.this.dayOfWeek || airportFare[0][index + 1] <= (byte) 60) {
                                        textView1.setText("Fare\n` " + airportFare[0][index + 1]);
                                    } else {
                                        textView1.setText("Fare\n` 60");
                                    }
                                } else if (1 != FareDoor.this.dayOfWeek || airportFare[0][index + 1] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + airportFare[0][index + 1]);
                                } else {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + 60);
                                }
                                textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                            } else {
                                index = 3;
                                if (mp_air.itemsList.size() > 1) {
                                    mp_air.itemsList.set(mp_air.itemsList.indexOf("Dwarka Sector - 21"), "Change at: Dwarka Sector - 21");
                                }
                                while (!FareDoor.this.stn2.equals(FareDoor.this.airpotLine.get(index))) {
                                    mp_air.itemsList.add(FareDoor.this.airpotLine.get(index));
                                    index--;
                                }
                                mp_air.itemsList.add(FareDoor.this.airpotLine.get(index));
                                mp = mp_air;
                                k = list.indexOf("Dwarka Sector - 21");
                                FareDoor.this.stn2 = "Dwarka Sector - 21";
                                if (FareDoor.this.stn1.equals("Dwarka Sector - 21")) {
                                    if (1 != FareDoor.this.dayOfWeek || airportFare[0][index + 1] <= (byte) 60) {
                                        textView1.setText("Fare\n`" + airportFare[0][index + 1]);
                                    } else {
                                        textView1.setText("Fare\n` 60");
                                    }
                                } else if (1 != FareDoor.this.dayOfWeek || airportFare[5][index + 1] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + airportFare[5][index + 1]);
                                } else {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + 60);
                                }
                                textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                            }
                        } else if (FareDoor.this.airpotLine.contains(FareDoor.this.stn1)) {
                            if (FareDoor.this.stn2.equals("NewDelhi")) {
                                mp.itemsList.add("NewDelhi");
                            } else {
                                mp.findPathBFS("NewDelhi", FareDoor.this.stn2);
                            }
                            mp_air = new Metro_Map();
                            if (FareDoor.this.stn2.equals("Dwarka Sector - 21")) {
                                mp_air.itemsList.add("Dwarka Sector - 21");
                            } else {
                                mp_air.findPathBFS("Dwarka Sector - 21", FareDoor.this.stn2);
                            }
                            index = FareDoor.this.airpotLine.indexOf(FareDoor.this.stn1);
                            if (mp.itemsList.size() < mp_air.itemsList.size()) {
                                ind = 0;
                                if (mp.itemsList.size() > 1) {
                                    mp.itemsList.set(mp.itemsList.indexOf("NewDelhi"), "Change at: NewDelhi");
                                }
                                while (ind <= index) {
                                    mp.itemsList.add(0, FareDoor.this.airpotLine.get(ind));
                                    ind++;
                                }
                                J = list.indexOf("NewDelhi");
                                FareDoor.this.stn1 = "NewDelhi";
                                if (FareDoor.this.stn2.equals("NewDelhi")) {
                                    if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][0] <= (byte) 60) {
                                        textView1.setText("Fare\n`" + airportFare[index + 1][0]);
                                    } else {
                                        textView1.setText("Fare\n` 60");
                                    }
                                } else if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][0] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[index + 1][0] + "+" + FareDoor.this.getFareAll(J, k));
                                } else {
                                    textView1.setText("Fare\n`" + "60+" + FareDoor.this.getFareAll(J, k));
                                }
                                textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                            } else {
                                ind = 3;
                                if (mp_air.itemsList.size() > 1) {
                                    mp_air.itemsList.set(mp_air.itemsList.indexOf("Dwarka Sector - 21"), "Change at: Dwarka Sector - 21");
                                }
                                while (ind >= index) {
                                    mp_air.itemsList.add(0, FareDoor.this.airpotLine.get(ind));
                                    ind--;
                                }
                                mp = mp_air;
                                J = list.indexOf("Dwarka Sector - 21");
                                FareDoor.this.stn1 = "Dwarka Sector - 21";
                                if (FareDoor.this.stn2.equals("Dwarka Sector - 21")) {
                                    if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][5] <= (byte) 60) {
                                        textView1.setText("Fare\n`" + airportFare[index + 1][5]);
                                    } else {
                                        textView1.setText("Fare\n` 60");
                                    }
                                } else if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][5] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[index + 1][5] + "+" + FareDoor.this.getFareAll(J, k));
                                } else {
                                    textView1.setText("Fare\n`" + "60+" + FareDoor.this.getFareAll(J, k));
                                }
                                textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                            }
                        }
                        textView2.setText("Stations \n" + mp.itemsList.size());
                        FareDoor.this.t1.setVisibility(0);
                        FareDoor.this.t1.setAdapter(new ExpandableListAdapter(FareDoor.this, mp.itemsList, mp));
                    }
                }
            }
        });
        this.dstStn.setAdapter(listAdapterr1);
        this.dstStn.setOnItemClickListener(new OnItemClickListener() {

            class C02911 implements OnClickListener {
                C02911() {
                }

                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    layout.setVisibility(8);
                    FareDoor.this.t1.setVisibility(8);
                    textView1.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }

            class C02922 implements OnClickListener {
                C02922() {
                }

                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    FareDoor.this.t1.setVisibility(8);
                    textView1.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }

            class C02933 implements OnClickListener {
                C02933() {
                }

                public void onClick(DialogInterface dialog, int which) {
                    layout.setVisibility(8);
                    FareDoor.this.t1.setVisibility(8);
                    textView1.setVisibility(8);
                    textView2.setVisibility(8);
                    dialog.dismiss();
                }
            }

            public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                Editable stnr = FareDoor.this.dstStn.getEditableText();
                FareDoor.this.stn2 = stnr.toString();
                FareDoor.this.stn1 = FareDoor.this.srcStn.getEditableText().toString();
                int J = list.indexOf(FareDoor.this.stn1);
                int k = list.indexOf(FareDoor.this.stn2);
                FareDoor.this.imm.hideSoftInputFromWindow(FareDoor.this.dstStn.getWindowToken(), 0);
                AlertDialog.Builder alertDialog;
                if (J == -1 || k == -1) {
                    alertDialog = new AlertDialog.Builder(FareDoor.this);
                    alertDialog.setCancelable(true);
                    alertDialog.setTitle("Notice");
                    alertDialog.setMessage("Please Enter the stations properly");
                    alertDialog.setPositiveButton("OK", new C02911());
                    alertDialog.show();
                } else if (FareDoor.this.stn1 == null || FareDoor.this.stn1.length() == 0) {
                    alertDialog = new AlertDialog.Builder(FareDoor.this);
                    alertDialog.setCancelable(true);
                    alertDialog.setTitle("Notice");
                    alertDialog.setMessage("Please Enter the Starting station");
                    alertDialog.setPositiveButton("OK", new C02922());
                    alertDialog.show();
                } else if (FareDoor.this.stn1.equals(FareDoor.this.stn2)) {
                    alertDialog = new AlertDialog.Builder(FareDoor.this);
                    alertDialog.setTitle("Notice");
                    alertDialog.setMessage("Both Stations Same,Fare is 10.00 Rs");
                    alertDialog.setPositiveButton("OK", new C02933());
                    alertDialog.show();
                } else {
                    FareDoor.this.sharedPreferences = FareDoor.this.getSharedPreferences("version", 0);
                    int counter = FareDoor.this.sharedPreferences.getInt("RatingCounter", 0);
                    Editor sharedPreferencesEditor = FareDoor.this.sharedPreferences.edit();
                    sharedPreferencesEditor.putInt("RatingCounter", counter + 1);
                    sharedPreferencesEditor.commit();
                    layout.setVisibility(0);
                    textView1.setVisibility(0);
                    textView2.setVisibility(0);
                    Metro_Map mp = new Metro_Map();
                    if (!FareDoor.this.airpotLine.contains(FareDoor.this.stn1) && !FareDoor.this.airpotLine.contains(FareDoor.this.stn2)) {
                        mp.findPathBFS(FareDoor.this.stn1, FareDoor.this.stn2);
                        textView1.setText("Fare\n` " + FareDoor.this.getFareAll(J, k));
                        textView3.setText("Time\n" + ((int) ((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                    } else if (FareDoor.this.airpotLine.contains(FareDoor.this.stn1) && FareDoor.this.airpotLine.contains(FareDoor.this.stn2)) {
                        int src = FareDoor.this.airpotLine.indexOf(FareDoor.this.stn1);
                        int dst = FareDoor.this.airpotLine.indexOf(FareDoor.this.stn2);
                        int ind;
                        if (src < dst) {
                            ind = src;
                            while (ind <= dst) {
                                ind = ind + 1;
                                mp.itemsList.add(FareDoor.this.airpotLine.get(ind));
                                ind = ind;
                            }
                            ind = ind;
                        } else {
                            ind = src;
                            while (ind >= dst) {
                                ind = ind - 1;
                                mp.itemsList.add(FareDoor.this.airpotLine.get(ind));
                                ind = ind;
                            }
                            ind = ind;
                        }
                        if (1 != FareDoor.this.dayOfWeek || airportFare[src + 1][dst + 1] <= (byte) 60) {
                            textView1.setText("Fare\n` " + FareDoor.this.getFareAll(J, k) + airportFare[src + 1][dst + 1]);
                        } else {
                            textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + 60);
                        }
                        textView3.setText("Time\n" + ((mp.itemsList.size() - 1) * 5) + " mins");
                    } else if (FareDoor.this.airpotLine.contains(FareDoor.this.stn2)) {
                        if (FareDoor.this.stn1.equals("NewDelhi")) {
                            mp.itemsList.add("NewDelhi");
                        } else {
                            mp.findPathBFS(FareDoor.this.stn1, "NewDelhi");
                        }
                        mp_air = new Metro_Map();
                        if (FareDoor.this.stn1.equals("Dwarka Sector - 21")) {
                            mp_air.itemsList.add("Dwarka Sector - 21");
                        } else {
                            mp_air.findPathBFS(FareDoor.this.stn1, "Dwarka Sector - 21");
                        }
                        if (mp.itemsList.size() < mp_air.itemsList.size()) {
                            index = 0;
                            if (mp.itemsList.size() > 1) {
                                mp.itemsList.set(mp.itemsList.indexOf("NewDelhi"), "Change at: NewDelhi");
                            }
                            while (!FareDoor.this.stn2.equals(FareDoor.this.airpotLine.get(index))) {
                                mp.itemsList.add(FareDoor.this.airpotLine.get(index));
                                index++;
                            }
                            mp.itemsList.add(FareDoor.this.airpotLine.get(index));
                            k = list.indexOf("NewDelhi");
                            FareDoor.this.stn2 = "NewDelhi";
                            if (FareDoor.this.stn1.equals("NewDelhi")) {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[0][index + 1] <= (byte) 60) {
                                    textView1.setText("Fare\n` " + airportFare[0][index + 1]);
                                } else {
                                    textView1.setText("Fare\n` 60");
                                }
                            } else {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[0][index + 1] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + airportFare[0][index + 1]);
                                } else {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + 60);
                                }
                            }
                            textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                        } else {
                            index = 3;
                            if (mp_air.itemsList.size() > 1) {
                                mp_air.itemsList.set(mp_air.itemsList.indexOf("Dwarka Sector - 21"), "Change at: Dwarka Sector - 21");
                            }
                            while (!FareDoor.this.stn2.equals(FareDoor.this.airpotLine.get(index))) {
                                mp_air.itemsList.add(FareDoor.this.airpotLine.get(index));
                                index--;
                            }
                            mp_air.itemsList.add(FareDoor.this.airpotLine.get(index));
                            mp = mp_air;
                            k = list.indexOf("Dwarka Sector - 21");
                            FareDoor.this.stn2 = "Dwarka Sector - 21";
                            if (FareDoor.this.stn1.equals("Dwarka Sector - 21")) {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[0][index + 1] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[0][index + 1]);
                                } else {
                                    textView1.setText("Fare\n` 60");
                                }
                            } else {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[5][index + 1] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + airportFare[5][index + 1]);
                                } else {
                                    textView1.setText("Fare\n`" + FareDoor.this.getFareAll(J, k) + "+" + 60);
                                }
                            }
                            textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                        }
                    } else if (FareDoor.this.airpotLine.contains(FareDoor.this.stn1)) {
                        if (FareDoor.this.stn2.equals("NewDelhi")) {
                            mp.itemsList.add("NewDelhi");
                        } else {
                            mp.findPathBFS("NewDelhi", FareDoor.this.stn2);
                        }
                        mp_air = new Metro_Map();
                        if (FareDoor.this.stn2.equals("Dwarka Sector - 21")) {
                            mp_air.itemsList.add("Dwarka Sector - 21");
                        } else {
                            mp_air.findPathBFS("Dwarka Sector - 21", FareDoor.this.stn2);
                        }
                        index = FareDoor.this.airpotLine.indexOf(FareDoor.this.stn1);
                        if (mp.itemsList.size() < mp_air.itemsList.size()) {
                            ind = 0;
                            if (mp.itemsList.size() > 1) {
                                mp.itemsList.set(mp.itemsList.indexOf("NewDelhi"), "Change at: NewDelhi");
                            }
                            while (ind <= index) {
                                mp.itemsList.add(0, FareDoor.this.airpotLine.get(ind));
                                ind++;
                            }
                            J = list.indexOf("NewDelhi");
                            FareDoor.this.stn1 = "NewDelhi";
                            if (FareDoor.this.stn2.equals("NewDelhi")) {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][0] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[index + 1][0]);
                                } else {
                                    textView1.setText("Fare\n` 60");
                                }
                            } else {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][0] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[index + 1][0] + "+" + FareDoor.this.getFareAll(J, k));
                                } else {
                                    textView1.setText("Fare\n`" + "60+" + FareDoor.this.getFareAll(J, k));
                                }
                            }
                            textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                        } else {
                            ind = 3;
                            if (mp_air.itemsList.size() > 1) {
                                mp_air.itemsList.set(mp_air.itemsList.indexOf("Dwarka Sector - 21"), "Change at: Dwarka Sector - 21");
                            }
                            while (ind >= index) {
                                mp_air.itemsList.add(0, FareDoor.this.airpotLine.get(ind));
                                ind--;
                            }
                            mp = mp_air;
                            J = list.indexOf("Dwarka Sector - 21");
                            FareDoor.this.stn1 = "Dwarka Sector - 21";
                            if (FareDoor.this.stn2.equals("Dwarka Sector - 21")) {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][5] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[index + 1][5]);
                                } else {
                                    textView1.setText("Fare\n` 60");
                                }
                            } else {
                                if (1 != FareDoor.this.dayOfWeek || airportFare[index + 1][5] <= (byte) 60) {
                                    textView1.setText("Fare\n`" + airportFare[index + 1][5] + "+" + FareDoor.this.getFareAll(J, k));
                                } else {
                                    textView1.setText("Fare\n`" + "60+" + FareDoor.this.getFareAll(J, k));
                                }
                            }
                            textView3.setText("Time\n" + ((int) (((2.3d * ((double) (mp.itemsList.size() - 1))) + ((double) ((index + 1) * 3))) + ((double) FareDoor.this.getJunctionTime(mp.itemsList)))) + " mins");
                        }
                    }
                    textView2.setText("Stations \n" + mp.itemsList.size());
                    FareDoor.this.t1.setVisibility(0);
                    FareDoor.this.t1.setAdapter(new ExpandableListAdapter(FareDoor.this, mp.itemsList, mp));
                }
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        Log.d("sandeep", "onBackPressed");
        if (this.mInterstitialAd.isLoaded()) {
            Log.d("sandeep", "onBackPressed isLoaded");
            this.mInterstitialAd.show();
        }
    }

    public String getFareAll(int src, int dst) {
        this.database = this.myDbHelper.getWritableDatabase();
        String stn_id1 = "";
        Cursor cursor1 = this.database.query("stations", this.allColumns, "StationName=?", new String[]{this.stn1}, null, null, null, null);
        if (cursor1 != null && cursor1.getCount() > 0) {
            cursor1.moveToFirst();
            stn_id1 = cursor1.getString(0);
            cursor1.close();
        }
        String stn_id2 = "";
        Cursor cursor2 = this.database.query("stations", this.allColumns, "StationName=?", new String[]{this.stn2}, null, null, null, null);
        if (cursor2 != null && cursor2.getCount() > 0) {
            cursor2.moveToFirst();
            stn_id2 = cursor2.getString(0);
            cursor2.close();
        }
        Log.d("sandeep", "getFareAll : Stn1 :" + this.stn1 + "  Stn2: " + this.stn2);
        Log.d("sandeep", "getFareAll : Stn id1 :" + stn_id1 + " Stn id2: " + stn_id2);
        String fare = "";
        Cursor cursor_fare;
        Cursor cursor_fare2;
        if (1 != this.dayOfWeek) {
            cursor_fare = this.database.query("fareTbl", null, "StationID=?", new String[]{stn_id1}, null, null, null, null);
            if (cursor_fare != null && cursor_fare.getCount() > 0) {
                cursor_fare.moveToFirst();
                fare = cursor_fare.getString(cursor_fare.getColumnIndex(stn_id2));
                cursor_fare.close();
            }
            if (fare == null) {
                cursor_fare2 = this.database.query("fareTbl", null, "StationID=?", new String[]{stn_id2}, null, null, null, null);
                if (cursor_fare2 != null && cursor_fare2.getCount() > 0) {
                    cursor_fare2.moveToFirst();
                    fare = cursor_fare2.getString(cursor_fare2.getColumnIndex(stn_id1));
                    cursor_fare2.close();
                }
            }
        } else {
            cursor_fare = this.database.query("fare_sunday", null, "StationID=?", new String[]{stn_id1}, null, null, null, null);
            if (cursor_fare != null && cursor_fare.getCount() > 0) {
                cursor_fare.moveToFirst();
                fare = cursor_fare.getString(cursor_fare.getColumnIndex(stn_id2));
                cursor_fare.close();
            }
            if (fare == null) {
                cursor_fare2 = this.database.query("fare_sunday", null, "StationID=?", new String[]{stn_id2}, null, null, null, null);
                if (cursor_fare2 != null && cursor_fare2.getCount() > 0) {
                    cursor_fare2.moveToFirst();
                    fare = cursor_fare2.getString(cursor_fare2.getColumnIndex(stn_id1));
                    cursor_fare2.close();
                }
            }
        }
        Log.d("sandeep", "getFareAll : Fare :" + fare);
        if (fare == null) {
            return "NA";
        }
        return fare;
    }

    public int getJunctionTime(ArrayList<String> list) {
        int time = 0;
        if (list == null) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            if (s != null && s.contains("Change")) {
                time += 5;
            }
        }
        return time;
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

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
