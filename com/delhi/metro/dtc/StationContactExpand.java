package com.delhi.metro.dtc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class StationContactExpand extends ArrayAdapter<String> {
    private final Context context;
    ArrayList<String> items;
    ArrayList<String> metrolist;

    public StationContactExpand(Context context, ArrayList<String> metrolist) {
        super(context, C0322R.layout.stationcontactexpand, metrolist);
        this.context = context;
        this.metrolist = metrolist;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.stationcontactexpand, parent, false);
        TextView textView = (TextView) rowView.findViewById(C0322R.id.noinfo);
        ImageView iv = (ImageView) rowView.findViewById(C0322R.id.noinfoimg);
        if (position == 0) {
            iv.setImageResource(C0322R.drawable.mobile);
        } else if (position == 1) {
            iv.setImageResource(C0322R.drawable.landline);
        }
        textView.setText((String) this.metrolist.get(position));
        return rowView;
    }

    private View findViewById(int vb1) {
        return null;
    }
}
