package com.delhi.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.delhi.bus.BusRoot;
import com.delhi.metro.dtc.C0322R;
import com.delhi.metro.dtc.MetroInfoDetails;
import com.delhi.metro.dtc.ShowMetroBusMap;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class NearestBusAdapter extends ArrayAdapter<String> {
    Context context;
    double cur_lat;
    double cur_lon;
    ArrayList<String> dist_list;
    Boolean is_bus;
    ArrayList<LatLng> latLng;
    ArrayList<String> stop_list;

    public NearestBusAdapter(Context context, ArrayList<String> list_bus, ArrayList<String> list_dist, double lat, double lon, ArrayList<LatLng> latLng, Boolean is_bus) {
        super(context, C0322R.layout.nearestbuslist, list_bus);
        this.context = context;
        this.stop_list = list_bus;
        this.dist_list = list_dist;
        this.cur_lat = lat;
        this.cur_lon = lon;
        this.latLng = latLng;
        this.is_bus = is_bus;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.nearestbuslist, parent, false);
        final Button tvBusStop = (Button) rowView.findViewById(C0322R.id.btnViewStnName);
        final TextView tvDist = (TextView) rowView.findViewById(C0322R.id.textViewDistance);
        final Button map_button = (Button) rowView.findViewById(C0322R.id.btn_map);
        tvBusStop.setText("  " + ((String) this.stop_list.get(position)) + "  ");
        tvDist.setText((CharSequence) this.dist_list.get(position));
        tvBusStop.setTag(this.stop_list.get(position));
        map_button.setTag(this.latLng.get(position));
        tvDist.setTag(this.is_bus);
        tvBusStop.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                if (((Boolean) tvDist.getTag()).booleanValue()) {
                    Intent nextscreen = new Intent(NearestBusAdapter.this.context, BusRoot.class);
                    nextscreen.putExtra("BUS_STATION", (String) tvBusStop.getTag());
                    NearestBusAdapter.this.context.startActivity(nextscreen);
                    return;
                }
                nextscreen = new Intent(NearestBusAdapter.this.context, MetroInfoDetails.class);
                nextscreen.putExtra("stnpostiton", (String) tvBusStop.getTag());
                NearestBusAdapter.this.context.startActivity(nextscreen);
            }
        });
        map_button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Boolean is_metro = (Boolean) tvDist.getTag();
                Intent mapScreen = new Intent(NearestBusAdapter.this.context, ShowMetroBusMap.class);
                Bundle b = new Bundle();
                b.putDouble("CURRENT_LAT", NearestBusAdapter.this.cur_lat);
                b.putDouble("CURRENT_LON", NearestBusAdapter.this.cur_lon);
                LatLng latlng_btn = (LatLng) map_button.getTag();
                b.putDouble("NEAREST_LAT", latlng_btn.latitude);
                b.putDouble("NEAREST_LON", latlng_btn.longitude);
                b.putString("STN_NAME", (String) tvBusStop.getTag());
                b.putBoolean("IS_BUS", is_metro.booleanValue());
                mapScreen.putExtras(b);
                NearestBusAdapter.this.context.startActivity(mapScreen);
            }
        });
        return rowView;
    }
}
