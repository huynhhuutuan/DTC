package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gates_Platform_Activity extends Activity {
    protected static final String STATION_NAME = "Station Name";
    ListView gate_list;
    String[] gates;
    Metro_Map metro;
    ListView platForm_list;
    ArrayList<String> platForms;
    List<String> stations;
    Station_Gates stngates;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.gates_platform_diplay);
        TextView title = (TextView) findViewById(C0322R.id.titleheadbox);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Gates and Platform");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        Intent intent = getIntent();
        String stn_name = "";
        if (intent != null) {
            stn_name = intent.getExtras().getString(STATION_NAME);
        }
        title.setText(stn_name);
        this.metro = new Metro_Map();
        this.platForms = getPlatform(stn_name);
        this.stngates = new Station_Gates();
        this.stations = Arrays.asList(getResources().getStringArray(C0322R.array.Station_arrays));
        this.gates = this.stngates.str[this.stations.indexOf(stn_name)];
        for (int i = 0; i < this.gates.length; i++) {
            this.gates[i] = "  Gate No: " + Integer.toString(i + 1) + "\n" + "  Towards : " + this.gates[i];
        }
        for (int j = 0; j < this.platForms.size(); j++) {
            this.platForms.set(j, "  Platform No: " + Integer.toString(j + 1) + "\n" + "  Towards : " + ((String) this.platForms.get(j)));
        }
        this.gate_list = (ListView) findViewById(C0322R.id.listviewgates);
        this.platForm_list = (ListView) findViewById(C0322R.id.listViewPlatforms);
        ArrayAdapter<String> listAdapterGates = new ArrayAdapter(this, C0322R.layout.listviewgates, this.gates);
        ArrayAdapter<String> listAdapterPlatform = new ArrayAdapter(this, C0322R.layout.listviewgates, this.platForms);
        this.gate_list.setAdapter(listAdapterGates);
        LayoutInflater inflater = getLayoutInflater();
        this.platForm_list.setAdapter(listAdapterPlatform);
    }

    public ArrayList<String> getPlatform(String stn) {
        ArrayList<String> arr = new ArrayList();
        if (stn.contains("Rajiv Chowk")) {
            arr.add("Huda City Centre");
            arr.add("Jahangirpuri");
            arr.add("Vaishali/Noida City Center");
            arr.add("Dwarka");
        } else if (stn.contains("Kashmere")) {
            arr.add("Huda City Centre");
            arr.add("Jahangirpuri");
            arr.add("Rithala");
            arr.add("Dilshad");
        } else if (stn.contains("Yamuna Bank")) {
            arr.add("Noida City Center");
            arr.add("Dwarka");
            arr.add("Vaishali");
        } else if (stn.contains("Mandi House")) {
            arr.add("Vaishali/Noida City Center");
            arr.add("Dwarka");
            arr.add("Badarpur");
        } else if (stn.contains("Central Secretariat")) {
            arr.add("Huda City Centre");
            arr.add("Jahangirpuri");
            arr.add("Badarpur");
            arr.add("Mandi House");
        } else if (stn.contains("NewDelhi")) {
            arr.add("Huda City Centre");
            arr.add("Jahangirpuri/Dwarka Sector 21");
        } else if (stn.contains("Kirti Nagar")) {
            arr.add("Vaishali/Noida City Center");
            arr.add("Dwarka");
            arr.add("InderLok");
        } else if (stn.contains("Dhaula Kuan")) {
            arr.add("Dwarka Sector 21");
            arr.add("NewDelhi");
        } else if (stn.contains("Shivaji Stadium")) {
            arr.add("Dwarka Sector 21");
            arr.add("NewDelhi");
        } else if (stn.contains("Delhi Aerocity")) {
            arr.add("Dwarka Sector 21");
            arr.add("NewDelhi");
        } else if (stn.contains("IGI Airport (T-3)")) {
            arr.add("Dwarka Sector 21");
            arr.add("NewDelhi");
        } else if (stn.contains("Inder Lok")) {
            arr.add("Rithala");
            arr.add("Dilshad Garden");
            arr.add("Mundka");
        } else if (stn.contains("Ashok Park Main")) {
            arr.add("Mundka");
            arr.add("Inderlok/Kirti nagar");
        } else if (stn.contains("Sikandarpur")) {
            arr.add("Huda City Centre");
            arr.add("Jahangirpuri");
        } else if (this.metro.getLine(stn) == Line.BLUE) {
            if (this.metro.blue.indexOf(stn) > 7) {
                arr.add("Vaishali/Noida City Center");
                arr.add("Dwarka Sector 21");
            } else {
                arr.add("Vaishali");
                arr.add("Dwarka Sector 21");
            }
        } else if (this.metro.getLine(stn) == Line.BLUE_1) {
            arr.add("Noida City Center");
            arr.add("Dwarka Sector 21");
        } else if (this.metro.getLine(stn) == Line.YELLOW) {
            arr.add("Huda City Centre");
            arr.add("Jahangirpuri");
        } else if (this.metro.getLine(stn) == Line.GREEN_1) {
            arr.add("Mundka");
            arr.add("InderLok");
        } else if (this.metro.getLine(stn) == Line.GREEN) {
            arr.add("Mundka");
            arr.add("Kirti Nagar");
        } else if (this.metro.getLine(stn) == Line.VIOLET) {
            arr.add("Badarpur");
            arr.add("Mandi House");
        } else if (this.metro.getLine(stn) == Line.RED) {
            arr.add("Rithala");
            arr.add("Dilshad Garden");
        } else if (this.metro.getLine(stn) == Line.BROWN) {
            arr.add("Sikanderpur");
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
