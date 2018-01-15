package com.delhi.metro.dtc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MetroInfoExpand extends ArrayAdapter<String> {
    private final Context context;
    ArrayList<String> items;
    Metro_Map metro = new Metro_Map();
    ArrayList<String> metrolist;

    public MetroInfoExpand(Context context, ArrayList<String> metrolist) {
        super(context, C0322R.layout.metroinfolist, metrolist);
        this.context = context;
        this.metrolist = metrolist;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.metroinfolist, parent, false);
        TextView textView = (TextView) rowView.findViewById(C0322R.id.textViewb2);
        String st = (String) this.metrolist.get(position);
        ImageView imgView = (ImageView) rowView.findViewById(C0322R.id.imageColor);
        if (st.contains("Kashmere")) {
            imgView.setImageResource(C0322R.drawable.redyellow);
        } else if (st.contains("Rajiv")) {
            imgView.setImageResource(C0322R.drawable.blueyellow);
        } else if (st.contains("Central")) {
            imgView.setImageResource(C0322R.drawable.voiletyellow);
        } else if (st.contains("Kirti Nagar")) {
            imgView.setImageResource(C0322R.drawable.greenblue);
        } else if (st.contains("Inder Lok")) {
            imgView.setImageResource(C0322R.drawable.greenred);
        } else if (st.contains("Mandi House")) {
            imgView.setImageResource(C0322R.drawable.voiletblue);
        } else if (st.contains("NewDelhi")) {
            imgView.setImageResource(C0322R.drawable.yellowairport);
        } else if (st.contains("Dwarka Sector - 21")) {
            imgView.setImageResource(C0322R.drawable.blueairport);
        } else if (this.metro.getLine(st) == Line.BLUE || this.metro.getLine(st) == Line.BLUE_1) {
            imgView.setImageResource(C0322R.drawable.blue);
        } else if (this.metro.getLine(st) == Line.VIOLET) {
            imgView.setImageResource(C0322R.drawable.voilet);
        } else if (this.metro.getLine(st) == Line.GREEN || this.metro.getLine(st) == Line.GREEN_1) {
            imgView.setImageResource(C0322R.drawable.green);
        } else if (this.metro.getLine(st) == Line.RED) {
            imgView.setImageResource(C0322R.drawable.red);
        } else if (this.metro.getLine(st) == Line.YELLOW) {
            imgView.setImageResource(C0322R.drawable.yellow);
        } else if (this.metro.getLine(st) == Line.AIRPORT) {
            imgView.setImageResource(C0322R.drawable.airport);
        }
        textView.setText(st);
        return rowView;
    }

    private View findViewById(int vb1) {
        return null;
    }
}
