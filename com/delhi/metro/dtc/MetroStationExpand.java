package com.delhi.metro.dtc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MetroStationExpand extends ArrayAdapter<String> {
    private final Context context;
    ArrayList<String> items;
    ArrayList<String> metrolist;
    String stnname;

    public MetroStationExpand(Context context, ArrayList<String> metrolist, String stn_name) {
        super(context, C0322R.layout.metrostnexp, metrolist);
        this.context = context;
        this.metrolist = metrolist;
        this.stnname = stn_name;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.metrostnexp, parent, false);
        TextView textView = (TextView) rowView.findViewById(C0322R.id.Stninfo);
        TextView textView1 = (TextView) rowView.findViewById(C0322R.id.Stninofavail);
        ImageView iv = (ImageView) rowView.findViewById(C0322R.id.stninfoimg);
        if (position == 0) {
            iv.setImageResource(C0322R.drawable.phoneicon);
        } else if (position == 1) {
            iv.setImageResource(C0322R.drawable.platform);
        } else if (position == 2) {
            iv.setImageResource(C0322R.drawable.timing);
        } else if (position == 3) {
            iv.setImageResource(C0322R.drawable.parking);
        } else if (position == 4) {
            iv.setImageResource(C0322R.drawable.catchbus);
        } else if (position == 5) {
            iv.setImageResource(C0322R.drawable.nearestspot);
        }
        textView.setText((String) this.metrolist.get(position));
        if ((this.stnname.contains("DLF_") || this.stnname.contains("Gurudronacharya") || this.stnname.contains("Huda City Centre") || this.stnname.contains("IFFCO Chowk") || this.stnname.contains("Kaushambi") || this.stnname.contains("MG Road") || this.stnname.contains("Sikandarpur") || this.stnname.contains("Vaishali") || this.stnname.contains("Yamuna Bank") || this.stnname.contains("Delhi Aerocity") || this.stnname.contains("Golf Course") || this.stnname.contains("Sarai") || this.stnname.contains("NHPC Chowk") || this.stnname.contains("Mewala Maharajpur") || this.stnname.contains("Sector-28") || this.stnname.contains("Badkal Mor") || this.stnname.contains("Faridabad old") || this.stnname.contains("Ajronda") || this.stnname.contains("ESCORT MUJESAR") || this.stnname.contains("Bata Chowk")) && position == 4) {
            textView1.setText("Not Available");
        }
        if (this.stnname.contains("DLF_") && position == 3) {
            textView1.setText("Not Available");
        }
        return rowView;
    }

    private View findViewById(int vb1) {
        return null;
    }
}
