package com.delhi.bus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import java.util.ArrayList;

public class BusAdpter extends ArrayAdapter<String> {
    private final Context context;
    ArrayList<String> items;
    ArrayList<String> stoplist;

    public BusAdpter(Context context, ArrayList<String> stoplist) {
        super(context, C0322R.layout.busrowlist, stoplist);
        this.context = context;
        this.stoplist = stoplist;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.busrowlist, parent, false);
        TextView iv = (TextView) rowView.findViewById(C0322R.id.textViewb1);
        TextView textView = (TextView) rowView.findViewById(C0322R.id.textViewb2);
        String[] st1 = ((String) this.stoplist.get(position)).split("\n");
        iv.setText(st1[0]);
        textView.setText(st1[1]);
        return rowView;
    }

    private View findViewById(int vb1) {
        return null;
    }
}
