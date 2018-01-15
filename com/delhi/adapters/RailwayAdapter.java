package com.delhi.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;

public class RailwayAdapter extends ArrayAdapter<String> {
    Context context;
    String[] stations_list;

    public RailwayAdapter(Context context, String[] list) {
        super(context, C0322R.layout.listviewgates, list);
        this.context = context;
        this.stations_list = list;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.listviewgates, parent, false);
        TextView tvName = (TextView) rowView.findViewById(C0322R.id.textViewGate);
        String stn = ("<b>" + this.stations_list[position] + "</b>") + "<br> Nearest Metro Station: ";
        if (position == 0) {
            stn = (stn + "<font color='#FF6600'><b>Chandani Chowk</b></font>") + "<br> Distance: 10 mtrs";
        } else if (position == 1) {
            stn = (stn + "<font color='#FF6600'><b>Inderprastha,JungPura</b></font>") + "<br> Distance: 3.5 KM";
        } else if (position == 2) {
            stn = (stn + "<font color='#FF6600'><b>New Delhi</b></font>") + "<br> Distance: 10 mtrs";
        } else if (position == 3) {
            stn = (stn + "<font color='#FF6600'><b>Shastri Nagar</b></font>") + "<br> Distance: 1.2 KM";
        } else if (position == 4) {
            stn = (stn + "<font color='#FF6600'><b>Pratap Nagar</b></font>") + "<br> Distance: 160 mtrs";
        } else if (position == 5) {
            stn = (stn + "<font color='#FF6600'><b>Anand Vihar</b></font>") + "<br> Distance: 30 mtrs";
        }
        tvName.setText(Html.fromHtml(stn + "<br>"));
        tvName.setTextSize(18.0f);
        return rowView;
    }
}
