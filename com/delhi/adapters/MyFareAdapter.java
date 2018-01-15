package com.delhi.adapters;

import android.content.Context;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import java.text.DecimalFormat;

public class MyFareAdapter extends BaseAdapter {
    private final Context context;
    Double dist = Double.valueOf(2.0d);
    Double fared = Double.valueOf(25.0d);
    Double farenight = Double.valueOf(31.25d);
    String[] fareval;
    String s1;
    String s2;
    String s3;

    public MyFareAdapter(Context context, int resource) {
        DecimalFormat df = new DecimalFormat("#.##");
        this.context = context;
        this.fareval = new String[Callback.DEFAULT_DRAG_ANIMATION_DURATION];
        this.s1 = Double.toString(this.dist.doubleValue()) + "0";
        this.s2 = Double.toString(this.fared.doubleValue());
        this.s3 = Double.toString(this.farenight.doubleValue());
        this.fareval[0] = this.s1 + " " + this.s2 + " " + this.s3;
        for (int i = 1; i < Callback.DEFAULT_DRAG_ANIMATION_DURATION; i++) {
            this.dist = Double.valueOf(this.dist.doubleValue() + 0.25d);
            this.fared = Double.valueOf(this.fared.doubleValue() + 2.0d);
            this.farenight = Double.valueOf(this.farenight.doubleValue() + 2.5d);
            this.s1 = Double.toString(this.dist.doubleValue());
            if (i % 2 == 0) {
                this.s1 += "0";
            }
            this.s2 = Double.toString(this.fared.doubleValue());
            this.s3 = Double.toString(this.farenight.doubleValue());
            this.fareval[i] = this.s1 + " " + this.s2 + " " + this.s3;
        }
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.autofaredisp, parent, false);
        TextView tvKm = (TextView) rowView.findViewById(C0322R.id.rowTextViewKm);
        TextView tvFare = (TextView) rowView.findViewById(C0322R.id.rowTextViewFare);
        TextView tvFareNt = (TextView) rowView.findViewById(C0322R.id.rowTextViewFareNight);
        String[] splt = this.fareval[position].split(" ");
        tvKm.setText(splt[0]);
        tvFare.setText(splt[1]);
        tvFareNt.setText(splt[2]);
        return rowView;
    }

    public int getCount() {
        return Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    }

    public Object getItem(int arg0) {
        return null;
    }

    public long getItemId(int arg0) {
        return 0;
    }
}
