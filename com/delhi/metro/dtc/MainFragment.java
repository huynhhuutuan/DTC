package com.delhi.metro.dtc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.delhi.bus.BusAdapter;
import com.delhi.bus.BusRoot;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;

public class MainFragment extends Fragment {
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;

    class C03041 implements OnClickListener {
        C03041() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), MetroImageMap.class));
        }
    }

    class C03052 implements OnClickListener {
        C03052() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), FareDoor.class));
        }
    }

    class C03063 implements OnClickListener {
        C03063() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), MetroInfo.class));
        }
    }

    class C03074 implements OnClickListener {
        C03074() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), Nearest.class));
        }
    }

    class C03085 implements OnClickListener {
        C03085() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), BusRoot.class));
        }
    }

    class C03096 implements OnClickListener {
        C03096() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), BusAdapter.class));
        }
    }

    class C03107 implements OnClickListener {
        C03107() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), AutoFare.class));
        }
    }

    class C03118 implements OnClickListener {
        C03118() {
        }

        public void onClick(View arg0) {
            MainFragment.this.startActivity(new Intent(MainFragment.this.getActivity().getApplicationContext(), HelpActivity.class));
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("sandeep", "MainFragment onCreateView");
        View view = inflater.inflate(C0322R.layout.main_layout, container, false);
        this.iv1 = (ImageView) view.findViewById(C0322R.id.imageView1);
        this.iv2 = (ImageView) view.findViewById(C0322R.id.imageView2);
        this.iv3 = (ImageView) view.findViewById(C0322R.id.imageView3);
        this.iv4 = (ImageView) view.findViewById(C0322R.id.imageView4);
        this.iv5 = (ImageView) view.findViewById(C0322R.id.imageView5);
        this.iv6 = (ImageView) view.findViewById(C0322R.id.imageView6);
        this.iv7 = (ImageView) view.findViewById(C0322R.id.imageView7);
        this.iv8 = (ImageView) view.findViewById(C0322R.id.imageView8);
        ((AdView) view.findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        this.iv1.setOnClickListener(new C03041());
        this.iv2.setOnClickListener(new C03052());
        this.iv3.setOnClickListener(new C03063());
        this.iv5.setOnClickListener(new C03074());
        this.iv4.setOnClickListener(new C03085());
        this.iv6.setOnClickListener(new C03096());
        this.iv8.setOnClickListener(new C03107());
        this.iv7.setOnClickListener(new C03118());
        return view;
    }
}
