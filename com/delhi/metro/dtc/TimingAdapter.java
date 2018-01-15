package com.delhi.metro.dtc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;

public class TimingAdapter extends ArrayAdapter<String> {
    Context context;
    ArrayList<String> list;
    String stn_name;
    ArrayList<String> time_list;

    public TimingAdapter(Context context, ArrayList<String> metrolist, Metro_Map metro, ArrayList<String> time_list) {
        super(context, C0322R.layout.train_time_item, metrolist);
        this.context = context;
        this.list = metrolist;
        this.time_list = time_list;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.train_time_item, parent, false);
        TextView textTime = (TextView) rowView.findViewById(C0322R.id.textviewtime);
        ((TextView) rowView.findViewById(C0322R.id.textviewtowards)).setText((String) this.list.get(position));
        textTime.setText((CharSequence) this.time_list.get(position));
        new Date().setHours(11);
        return rowView;
    }

    private CharSequence getFirstTime(String stn_name2) {
        return null;
    }
}
