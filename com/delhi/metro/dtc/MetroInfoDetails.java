package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.Arrays;

public class MetroInfoDetails extends Activity {
    protected static final String STATION_NAME = "Station Name";
    public static final Integer[] images = new Integer[]{Integer.valueOf(C0322R.drawable.blueline), Integer.valueOf(C0322R.drawable.greenline), Integer.valueOf(C0322R.drawable.redline), Integer.valueOf(C0322R.drawable.voiletline), Integer.valueOf(C0322R.drawable.yellowline), Integer.valueOf(C0322R.drawable.brownline), Integer.valueOf(C0322R.drawable.airportline), Integer.valueOf(C0322R.drawable.greenbluesmall), Integer.valueOf(C0322R.drawable.blueyellowsmall), Integer.valueOf(C0322R.drawable.voiletyellowsmall), Integer.valueOf(C0322R.drawable.voiletbluesmall), Integer.valueOf(C0322R.drawable.redyellowsmall), Integer.valueOf(C0322R.drawable.greenredsmall), Integer.valueOf(C0322R.drawable.airportbluesmall), Integer.valueOf(C0322R.drawable.airportyellowsmall)};
    ArrayAdapter<String> listAdapter;
    Metro_Map metro = new Metro_Map();
    String[] metrobus = new String[]{"Adarsh Nagar", "Aiims", "Pushta Crossing", "Anand Vihar", "Aya Nagar", "Punjabi Bagh", "Azadpur", "Badarpur", "Statesman", "Noida Sector 28 29", "Krishi Bhawan", "Fatehpuri", "Fatehpuri", "Chattarpur Modh", "Ip College", "Dilshad Garden", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Dwarka Modh", "Dwarka ", "Dwarka Sector 10 11 Crossing", "Dwarka Sector 10 11 Crossing", "Dwarka Sector 11 12 Crossing", "Dwarka Sector 13 14 Crossing", "Dwarka Sector 13 14 Crossing", "Dwarka Sector 21", "Dwarka Sector 8 Metro Station", "Dwarka Sector 8 Metro Station", "Ghitorni Village", "Not available", "Govindpuri", "Green Park", "Gtb Nagar", "Not available", "Hauz Khas", "Not available", "Not available", "Ina", "Inderlok Metro Station", "Ip Depot", "Ito", "Jahangirpuri", "Janakpuri", "Janakpuri", "Jln Stadium", "Janpath", "Okhla Tank", "Meghdoot Bhawan", "Jhilmil Colony Crossing", "Jln Stadium", "Jorbagh Sj Madarsa", "Kailash Colony", "Kalkaji Mandir", "Kanhaiya Nagar", "Karkardooma", "Karol Bagh Metro Station", "Isbt Kashmiri Gate", "Not available", "Keshav Puram", "Delhi Golf Course", "Kirti Nagar", "Kohat Enclave", "Lajpat Nagar", "Laxmi Nagar", "Madipur", "Malviya Nagar Block F", "Mandi House", "Mansrovar Garden", "Samachar Apartment", "Mayur Vihar Phase 1", "Not available", "Model Town Phase 2", "Ali Village", "Moolchand Hospital", "Moti Nagar", "Mundka", "Nangloi", "Nangloi Jj Colony", "Nawada", "Nehru Place", "Kohat Enclave", "New Ashok Nagar", "New Delhi", "Nirman Vihar", "Noida Sector 34 Up Roadways Bus Terminal", "Atta Chowk", "Atta Chowk", "Atta Chowk", "Okhla", "Peeragarhi", "Peeragarhi", "Patel Chowk", "Patel Nagar", "PeeraGarhi", "Pitampura", "Pragati Maidan", "Pratap Nagar", "Preet Vihar", "Roshanara Road", "Punjabi Bagh", "Qutab", "Race Course", "Mundka", "Telephone Exchange", "Palika Kendra", "Rajouri Garden", "Ramesh Nagar", "Rithala", "Rk Ashram Marg", "Rohini Sector 6 Metro Station", "Rohini Sector 7 8", "Saket", "Sarita Vihar", "Daya Basti", "Seelampur", "Shadipur", "Shahdara", "Shastri Nagar", "Shastri Park", "Shivaji Park", "Not available", "Rajouri GardenEXTension", "Sultanpur", "Nangloi Jj Colony", "Tagore Garden", "Tilak Nagar", "Tis Hazari", "Tughlakabad Village", "Sunehari Masjid Block G", "Nangloi Jj Colony No 3", "Uttam Nagar Terminal", "Uttam Nagar Terminal", "Not available", "Ip College", "Ip College", "Welcome", "Not available", "Shivaji Stadium", "Dhaula Kuan", "Not available", "Igi Airport", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available", "Not available"};
    MetroStationExpand metroexpand;
    ArrayList<String> platForms;
    String stnpst = "";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.metroinfodetail);
        String[] Metroinfo = new String[]{"Station Contact", "Gate & Platform", "Train Timing", "Parking", "Nearest Bus", "Nearest Spots"};
        Bundle recieve = getIntent().getExtras();
        String[] metroStn = getResources().getStringArray(C0322R.array.Station_arrays);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        final String stn_name = recieve.getString("stnpostiton");
        this.platForms = getPlatform(stn_name);
        TextView testb = (TextView) findViewById(C0322R.id.testbox);
        TextView platfrm1 = (TextView) findViewById(C0322R.id.platstart);
        ((ImageView) findViewById(C0322R.id.imageline)).setImageResource(getimage(stn_name));
        TextView platfrm2 = (TextView) findViewById(C0322R.id.platend);
        platfrm1.setText((CharSequence) this.platForms.get(0));
        platfrm2.setText((CharSequence) this.platForms.get(1));
        testb.setText(stn_name);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Station Information");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        ArrayList<String> Metroinfols = new ArrayList();
        Metroinfols.addAll(Arrays.asList(Metroinfo));
        ArrayList<String> stn_list = new ArrayList();
        stn_list.addAll(Arrays.asList(metroStn));
        this.stnpst = Integer.toString(stn_list.indexOf(stn_name));
        final int posn = stn_list.indexOf(stn_name);
        this.metroexpand = new MetroStationExpand(this, Metroinfols, stn_name);
        ListView mainlist1 = (ListView) findViewById(C0322R.id.metroInfodetail);
        mainlist1.setVisibility(0);
        mainlist1.setAdapter(this.metroexpand);
        mainlist1.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent nextscreen = new Intent(MetroInfoDetails.this.getApplicationContext(), ShowContact.class);
                    nextscreen.putExtra("Sendst", MetroInfoDetails.this.stnpst);
                    MetroInfoDetails.this.startActivity(nextscreen);
                } else if (position == 1) {
                    intent = new Intent(MetroInfoDetails.this.getApplicationContext(), Gates_Platform_Activity.class);
                    intent.putExtra(MetroInfoDetails.STATION_NAME, stn_name);
                    MetroInfoDetails.this.startActivity(intent);
                } else if (position == 2) {
                    intent = new Intent(MetroInfoDetails.this.getApplicationContext(), TrainTiming.class);
                    intent.putExtra(MetroInfoDetails.STATION_NAME, stn_name);
                    MetroInfoDetails.this.startActivity(intent);
                } else if (position == 3 && !stn_name.contains("DLF_")) {
                    MetroInfoDetails.this.startActivity(new Intent(MetroInfoDetails.this.getApplicationContext(), Parking.class));
                } else if (position == 4 && MetroInfoDetails.this.metrobus[posn] != "Not available") {
                    intent = new Intent(MetroInfoDetails.this.getApplicationContext(), MetroBus.class);
                    intent.putExtra("Sendst", MetroInfoDetails.this.metrobus[posn]);
                    intent.putExtra("Sendstname", stn_name);
                    MetroInfoDetails.this.startActivity(intent);
                } else if (position == 5) {
                    String address = stn_name + " Metro Station";
                    address.replace(" ", "+");
                    intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + address));
                    if (intent.resolveActivity(MetroInfoDetails.this.getPackageManager()) != null) {
                        MetroInfoDetails.this.startActivity(intent);
                        return;
                    }
                    MetroInfoDetails.this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("http://maps.google.com/maps?q=" + address)));
                }
            }

            private ArrayAdapter<String> getListAdapter() {
                return null;
            }
        });
    }

    public ArrayList<String> getPlatform(String stn) {
        ArrayList<String> arr = new ArrayList();
        if (stn.contains("Rajiv Chowk")) {
            arr.add(" Junction of Yellow Line");
            arr.add("Blue Line");
        } else if (stn.contains("Dwarka Sector - 21")) {
            arr.add("Junction of  Airport Line");
            arr.add("Blue Line");
        } else if (stn.contains("Kashmere")) {
            arr.add("Junction of  Yellow Line");
            arr.add("Red Line");
        } else if (stn.contains("Inder Lok")) {
            arr.add("Junction of  Green Line");
            arr.add("Red Line");
        } else if (stn.contains("Yamuna Bank")) {
            arr.add("Junction of Dwarka Sector 21");
            arr.add("Noida City Center/Vaishali");
        } else if (stn.contains("Mandi House")) {
            arr.add("Junction of Voilet Line");
            arr.add("Blue Line");
        } else if (stn.contains("Central Secretariat")) {
            arr.add("Junction of Yellow Line");
            arr.add("Voilet Line");
        } else if (stn.contains("NewDelhi")) {
            arr.add("Junction of Airport Line");
            arr.add("Yellow Line");
        } else if (stn.contains("Kirti Nagar")) {
            arr.add("Junction of Green Line");
            arr.add("Blue Line");
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
            arr.add("DLF_Sikanderpur");
            arr.add("DLF_Phase 2");
        } else if (this.metro.getLine(stn) == Line.MAGENTA) {
            arr.add("Kalkaji Mandir");
            arr.add("Botanical Garden");
        }
        return arr;
    }

    public int getimage(String station) {
        if (station.contains("Kirti Nagar")) {
            return images[7].intValue();
        }
        if (station.contains("Rajiv Chowk")) {
            return images[8].intValue();
        }
        if (station.contains("Mandi House")) {
            return images[10].intValue();
        }
        if (station.contains("Central")) {
            return images[9].intValue();
        }
        if (station.contains("Inder Lok")) {
            return images[12].intValue();
        }
        if (station.contains("Kashmere")) {
            return images[11].intValue();
        }
        if (station.contains("NewDelhi")) {
            return images[14].intValue();
        }
        if (station.contains("Dwarka Sector - 21")) {
            return images[13].intValue();
        }
        if (this.metro.getLine(station) == Line.BLUE || this.metro.getLine(station) == Line.BLUE_1) {
            return images[0].intValue();
        }
        if (this.metro.getLine(station) == Line.GREEN || this.metro.getLine(station) == Line.GREEN_1) {
            return images[1].intValue();
        }
        if (this.metro.getLine(station) == Line.RED) {
            return images[2].intValue();
        }
        if (this.metro.getLine(station) == Line.VIOLET) {
            return images[3].intValue();
        }
        if (this.metro.getLine(station) == Line.YELLOW) {
            return images[4].intValue();
        }
        if (this.metro.getLine(station) == Line.BROWN) {
            return images[5].intValue();
        }
        if (this.metro.getLine(station) == Line.AIRPORT) {
            return images[6].intValue();
        }
        return 0;
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
