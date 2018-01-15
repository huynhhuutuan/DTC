package com.delhi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;

public class ParkingAdapter extends ArrayAdapter<String> {
    Context context;
    String[] park;

    public ParkingAdapter(Context context, int resource, String[] park) {
        super(context, C0322R.layout.parking_item, park);
        this.context = context;
        this.park = park;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.parking_item, parent, false);
        ImageView iv = (ImageView) rowView.findViewById(C0322R.id.imageView1);
        TextView textView6hr = (TextView) rowView.findViewById(C0322R.id.text6hr);
        TextView textView12hr = (TextView) rowView.findViewById(C0322R.id.text12hr);
        TextView textView24hr = (TextView) rowView.findViewById(C0322R.id.text24hr);
        TextView textViewMonth = (TextView) rowView.findViewById(C0322R.id.textmonth);
        if (position == 0) {
            iv.setImageResource(C0322R.drawable.cycle);
            textView6hr.setText(" " + Integer.toString(3));
            textView12hr.setText(" " + Integer.toString(4));
            textView24hr.setText(" " + Integer.toString(5));
            textViewMonth.setText(Integer.toString(45));
        } else if (position == 1) {
            iv.setImageResource(C0322R.drawable.bike);
            textView6hr.setText(" " + Integer.toString(10));
            textView12hr.setText("  " + Integer.toString(15));
            textView24hr.setText("  " + Integer.toString(20));
            textViewMonth.setText(Integer.toString(475));
        } else if (position == 2) {
            iv.setImageResource(C0322R.drawable.suv);
            textView6hr.setText("   " + Integer.toString(20));
            textView12hr.setText("   " + Integer.toString(30));
            textView24hr.setText("   " + Integer.toString(40));
            textViewMonth.setText(Integer.toString(1000));
        }
        return rowView;
    }
}
