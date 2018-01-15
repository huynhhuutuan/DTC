package com.delhi.bus;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import com.delhi.metro.dtc.FareShow;
import java.util.ArrayList;

public class BusChangeAdapter extends ArrayAdapter<String> {
    ArrayList<String> bus1_list;
    ArrayList<String> bus2_list;
    ArrayList<String> bus_changeAt;
    Context context;

    public BusChangeAdapter(Context context, ArrayList<String> list1, ArrayList<String> list2, ArrayList<String> list3) {
        super(context, C0322R.layout.buschangeat, list1);
        this.context = context;
        this.bus1_list = list1;
        this.bus2_list = list2;
        this.bus_changeAt = list3;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.buschangeat, parent, false);
        final TextView tvBus1 = (TextView) rowView.findViewById(C0322R.id.textViewBus1);
        TextView tvChangeAt = (TextView) rowView.findViewById(C0322R.id.textViewChangeat);
        final TextView tvBus2 = (TextView) rowView.findViewById(C0322R.id.textViewBus2);
        tvBus1.setText((CharSequence) this.bus1_list.get(position));
        tvBus2.setText((CharSequence) this.bus2_list.get(position));
        tvChangeAt.setText((CharSequence) this.bus_changeAt.get(position));
        tvBus1.setTag(Integer.valueOf(position));
        tvBus2.setTag(Integer.valueOf(position));
        tvBus1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent nextscreen = new Intent(BusChangeAdapter.this.context, FareShow.class);
                nextscreen.putExtra("SendSt", (String) BusChangeAdapter.this.bus1_list.get(((Integer) tvBus1.getTag()).intValue()));
                Log.d("sandeep", "BusChangeAdapter:tv1onclick:" + ((String) BusChangeAdapter.this.bus1_list.get(((Integer) tvBus1.getTag()).intValue())));
                BusChangeAdapter.this.context.startActivity(nextscreen);
            }
        });
        tvBus2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent nextscreen = new Intent(BusChangeAdapter.this.context, FareShow.class);
                nextscreen.putExtra("SendSt", (String) BusChangeAdapter.this.bus2_list.get(((Integer) tvBus2.getTag()).intValue()));
                Log.d("sandeep", "BusChangeAdapter:tv1onclick:" + ((String) BusChangeAdapter.this.bus2_list.get(((Integer) tvBus2.getTag()).intValue())));
                BusChangeAdapter.this.context.startActivity(nextscreen);
            }
        });
        return rowView;
    }
}
