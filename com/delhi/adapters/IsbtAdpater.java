package com.delhi.adapters;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import java.util.ArrayList;

public class IsbtAdpater extends ArrayAdapter<String> {
    Context context;
    OnClickListener dialogClickListener;
    ArrayList<String> isbt_list;
    String number;
    String[] nums = new String[]{"011-23860290", "011-22148097", "011-24358343"};

    class C02711 implements OnClickListener {
        C02711() {
        }

        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                case -2:
                    dialog.dismiss();
                    return;
                case -1:
                    Intent callIntent = new Intent("android.intent.action.DIAL");
                    callIntent.setData(Uri.parse("tel:" + IsbtAdpater.this.number));
                    IsbtAdpater.this.context.startActivity(callIntent);
                    return;
                default:
                    return;
            }
        }
    }

    public IsbtAdpater(Context context, ArrayList<String> list) {
        super(context, C0322R.layout.isbt_item, list);
        this.context = context;
        this.isbt_list = list;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(C0322R.layout.isbt_item, parent, false);
        final TextView tvTitle = (TextView) rowView.findViewById(C0322R.id.titleIsbt);
        final TextView tvNum = (TextView) rowView.findViewById(C0322R.id.num_isbt);
        ImageView imNum = (ImageView) rowView.findViewById(C0322R.id.num_isbt_img);
        ImageView navigate = (ImageView) rowView.findViewById(C0322R.id.navigateisbt);
        tvTitle.setText((CharSequence) this.isbt_list.get(position));
        tvNum.setText(this.nums[position]);
        tvNum.setTag(this.nums[position]);
        tvTitle.setTag(Integer.valueOf(position));
        navigate.setTag(Integer.valueOf(position));
        this.dialogClickListener = new C02711();
        navigate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                int pos = ((Integer) tvTitle.getTag()).intValue();
                if (pos == 0) {
                    IsbtAdpater.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_transport/Transport/Home/ISBT/Maharana+Pratap+ISBT")));
                } else if (pos == 1) {
                    IsbtAdpater.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_transport/Transport/Home/ISBT/Swami+Vivekanand+ISBT")));
                } else if (pos == 2) {
                    IsbtAdpater.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_transport/Transport/Home/ISBT/Vir+Hakikat+Rai+ISBT")));
                }
            }
        });
        tvTitle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                int pos = ((Integer) tvTitle.getTag()).intValue();
                if (pos == 0) {
                    IsbtAdpater.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_transport/Transport/Home/ISBT/Maharana+Pratap+ISBT")));
                } else if (pos == 1) {
                    IsbtAdpater.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_transport/Transport/Home/ISBT/Swami+Vivekanand+ISBT")));
                } else if (pos == 2) {
                    IsbtAdpater.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.delhi.gov.in/wps/wcm/connect/doit_transport/Transport/Home/ISBT/Vir+Hakikat+Rai+ISBT")));
                }
            }
        });
        tvNum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                IsbtAdpater.this.number = (String) tvNum.getTag();
                IsbtAdpater.this.number = IsbtAdpater.this.number.trim();
                new Builder(IsbtAdpater.this.context).setMessage("Are you sure to Call?").setPositiveButton("Yes", IsbtAdpater.this.dialogClickListener).setNegativeButton("No", IsbtAdpater.this.dialogClickListener).show();
            }
        });
        imNum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                IsbtAdpater.this.number = (String) tvNum.getTag();
                IsbtAdpater.this.number = IsbtAdpater.this.number.trim();
                new Builder(IsbtAdpater.this.context).setMessage("Are you sure to Call?").setPositiveButton("Yes", IsbtAdpater.this.dialogClickListener).setNegativeButton("No", IsbtAdpater.this.dialogClickListener).show();
            }
        });
        return rowView;
    }
}
