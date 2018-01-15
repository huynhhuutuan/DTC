package com.delhi.metro.dtc;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.text.Html;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    public static final Integer[] images = new Integer[]{Integer.valueOf(C0322R.drawable.blueicon), Integer.valueOf(C0322R.drawable.greenicon), Integer.valueOf(C0322R.drawable.redicon), Integer.valueOf(C0322R.drawable.voileticon), Integer.valueOf(C0322R.drawable.yellowicon), Integer.valueOf(C0322R.drawable.brownicon), Integer.valueOf(C0322R.drawable.airporticon), Integer.valueOf(C0322R.drawable.magentaicon)};
    private final Context context;
    String[] gates;
    ArrayList<String> items;
    Metro_Map metro;
    List<String> stations;
    Station_Gates stngates;
    ArrayList<String> strg;

    public ExpandableListAdapter(Context context, ArrayList<String> objects, Metro_Map metro) {
        this.context = context;
        this.items = objects;
        this.metro = metro;
    }

    public Object getChild(int arg0, int arg1) {
        return null;
    }

    public long getChildId(int arg0, int arg1) {
        return 0;
    }

    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String childText1 = "<b>Platform No:" + (childPosition + 1) + "</b>" + " Towards :";
        if (convertView == null) {
            convertView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.list_item_child, null);
        }
        Log.d("sandeep", "getChildView () childPosition" + childPosition);
        Log.d("sandeep", "gates size:" + this.gates.length);
        if (childPosition < this.strg.size()) {
            StyleSpan bss = new StyleSpan(1);
            childText1 = childText1 + ((String) this.strg.get(childPosition));
        } else if (childPosition - this.strg.size() < this.gates.length) {
            childText1 = ("<b>Gate No: " + ((childPosition - this.strg.size()) + 1) + " " + "</b>") + this.gates[childPosition - this.strg.size()];
        }
        ((TextView) convertView.findViewById(C0322R.id.textView1Child)).setText(Html.fromHtml(childText1));
        return convertView;
    }

    public int getChildrenCount(int groupPosition) {
        int index;
        this.stations = Arrays.asList(this.context.getResources().getStringArray(C0322R.array.Station_arrays));
        this.strg = getPlatform((String) this.items.get(groupPosition));
        this.stngates = new Station_Gates();
        if (((String) this.items.get(groupPosition)).contains("Change")) {
            index = this.stations.indexOf(((String) this.items.get(groupPosition)).substring(10).trim());
        } else {
            index = this.stations.indexOf(this.items.get(groupPosition));
        }
        Log.d("sandeep", "getChildrenCount ()" + index);
        this.gates = this.stngates.str[index];
        return getPlatform((String) this.items.get(groupPosition)).size() + this.gates.length;
    }

    public Object getGroup(int arg0) {
        return this.items.get(arg0);
    }

    public int getGroupCount() {
        return this.items.size();
    }

    public long getGroupId(int arg0) {
        return 0;
    }

    public View getGroupView(int position, boolean isExpanded, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.list_item_row, parent, false);
        ImageView iv = (ImageView) rowView.findViewById(C0322R.id.imageView1);
        TextView textView = (TextView) rowView.findViewById(C0322R.id.textView1);
        textView.setText(((String) this.items.get(position)).toString());
        if (((String) this.items.get(position)).contains("Kashmere") && position < this.items.size() - 1 && this.metro.getLine((String) this.items.get(position + 1)) == Line.RED) {
            iv.setImageResource(C0322R.drawable.redicon);
        } else if (((String) this.items.get(position)).contains("NewDelhi")) {
            iv.setImageResource(C0322R.drawable.yellowicon);
        } else if (((String) this.items.get(position)).contains("Kashmere") && position > 0 && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.RED) {
            iv.setImageResource(C0322R.drawable.redicon);
        } else if (((String) this.items.get(position)).contains("Kashmere") && position == 0 && this.metro.getLine((String) this.items.get(position + 1)) == Line.VIOLET) {
            iv.setImageResource(C0322R.drawable.voileticon);
        } else if (((String) this.items.get(position)).contains("Kashmere") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.VIOLET) {
            iv.setImageResource(C0322R.drawable.voileticon);
        } else if (((String) this.items.get(position)).contains("Rajiv") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.BLUE) {
            iv.setImageResource(C0322R.drawable.blueicon);
        } else if (((String) this.items.get(position)).contains("Rajiv") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.YELLOW) {
            iv.setImageResource(C0322R.drawable.yellowicon);
        } else if (((String) this.items.get(position)).contains("Rajiv") && ((String) this.items.get(position + 1)).contains("NewDelhi")) {
            iv.setImageResource(C0322R.drawable.yellowicon);
        } else if (((String) this.items.get(position)).contains("Rajiv") && position < this.items.size() - 1 && this.metro.getLine((String) this.items.get(position + 1)) == Line.YELLOW) {
            iv.setImageResource(C0322R.drawable.yellowicon);
        } else if (((String) this.items.get(position)).contains("Rajiv") && position > 0 && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.YELLOW) {
            iv.setImageResource(C0322R.drawable.yellowicon);
        } else if ((((String) this.items.get(position)).contains("Inder") && position < this.items.size() - 1 && this.metro.getLine((String) this.items.get(position + 1)) == Line.RED) || (((String) this.items.get(position)).contains("Inder") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.RED)) {
            iv.setImageResource(C0322R.drawable.redicon);
        } else if ((((String) this.items.get(position)).contains("Kirti") && position < this.items.size() - 1 && this.metro.getLine((String) this.items.get(position + 1)) == Line.GREEN) || (((String) this.items.get(position)).contains("Kirti") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.GREEN)) {
            iv.setImageResource(C0322R.drawable.greenicon);
        } else if ((((String) this.items.get(position)).contains("Mandi") && position < this.items.size() - 1 && this.metro.getLine((String) this.items.get(position + 1)) == Line.VIOLET) || (((String) this.items.get(position)).contains("Mandi") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.VIOLET)) {
            iv.setImageResource(C0322R.drawable.voileticon);
        } else if (((String) this.items.get(position)).contains("Central") && position < this.items.size() - 1 && this.metro.getLine((String) this.items.get(position + 1)) == Line.VIOLET) {
            iv.setImageResource(C0322R.drawable.voileticon);
        } else if (((String) this.items.get(position)).contains("Central") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.VIOLET) {
            iv.setImageResource(C0322R.drawable.voileticon);
        } else if (((String) this.items.get(position)).contains("Kalka") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.MAGENTA) {
            iv.setImageResource(C0322R.drawable.magentaicon);
        } else if (((String) this.items.get(position)).contains("Kalka") && position == 0 && this.metro.getLine((String) this.items.get(position + 1)) == Line.MAGENTA) {
            iv.setImageResource(C0322R.drawable.magentaicon);
        } else if (((String) this.items.get(position)).contains("Botanical") && position == this.items.size() - 1 && this.metro.getLine((String) this.items.get(position - 1)) == Line.MAGENTA) {
            iv.setImageResource(C0322R.drawable.magentaicon);
        } else if (((String) this.items.get(position)).contains("Botanical") && position == 0 && this.metro.getLine((String) this.items.get(position + 1)) == Line.MAGENTA) {
            iv.setImageResource(C0322R.drawable.magentaicon);
        } else if (!((String) this.items.get(position)).contains("Change")) {
            iv.setImageResource(getimage((String) this.items.get(position)));
        } else if (this.metro.getLine((String) this.items.get(position + 1)) == Line.AIRPORT) {
            iv.setImageResource(getimage((String) this.items.get(position)));
        } else {
            iv.setImageResource(getimage((String) this.items.get(position + 1)));
        }
        if (((String) this.items.get(position)).contains("Change")) {
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
        }
        if (position == this.items.size()) {
            iv.setVisibility(8);
        }
        return rowView;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int arg0, int arg1) {
        return false;
    }

    public int getimage(String station) {
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
        if (this.metro.getLine(station) == Line.BROWN || this.metro.getLine(station) == Line.BROWN_1) {
            return images[5].intValue();
        }
        if (this.metro.getLine(station) == Line.AIRPORT) {
            return images[6].intValue();
        }
        if (this.metro.getLine(station) == Line.MAGENTA) {
            return images[7].intValue();
        }
        return 0;
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

    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);
        Log.d("sandeep", "onGroupExpanded");
        Tracker mTracker = null;
        if (null == null) {
            mTracker = GoogleAnalytics.getInstance(this.context).newTracker((int) C0322R.xml.global_tracker);
        }
        mTracker.send(new EventBuilder().setCategory("MetroRouteList").setAction("Expanded").setLabel((String) this.items.get(groupPosition)).build());
    }

    public void onGroupCollapsed(int groupPosition) {
        super.onGroupCollapsed(groupPosition);
        Log.d("sandeep", "onGroupCollapsed");
        Tracker mTracker = null;
        if (null == null) {
            mTracker = GoogleAnalytics.getInstance(this.context).newTracker((int) C0322R.xml.global_tracker);
        }
        mTracker.send(new EventBuilder().setCategory("MetroRouteList").setAction("Collapsed").setLabel((String) this.items.get(groupPosition)).build());
    }
}
