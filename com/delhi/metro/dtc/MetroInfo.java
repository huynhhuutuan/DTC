package com.delhi.metro.dtc;

import android.app.ActionBar;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics.Event;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MetroInfo extends Activity implements OnQueryTextListener {
    private SearchView mSearchView;
    ListView mainlist;
    ArrayList<String> metroList;
    MetroInfoExpand metroexpand;

    class C03151 implements OnItemClickListener {
        C03151() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent nextscreen = new Intent(MetroInfo.this.getApplicationContext(), MetroInfoDetails.class);
            String sentstation = (String) MetroInfo.this.mainlist.getItemAtPosition(position);
            String stnpst = Integer.toString(position);
            nextscreen.putExtra("stnpostiton", sentstation);
            MetroInfo.this.startActivity(nextscreen);
        }

        private ArrayAdapter<String> getListAdapter() {
            return null;
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0322R.layout.metroinfo);
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Station Information");
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        ((AdView) findViewById(C0322R.id.adView)).loadAd(new Builder().build());
        String[] metroStn = getResources().getStringArray(C0322R.array.Station_arrays);
        this.metroList = new ArrayList();
        this.metroList.addAll(Arrays.asList(metroStn));
        this.metroexpand = new MetroInfoExpand(this, this.metroList);
        this.mainlist = (ListView) findViewById(C0322R.id.listViewp);
        this.mainlist.setVisibility(0);
        this.mainlist.setAdapter(this.metroexpand);
        this.mainlist.setOnItemClickListener(new C03151());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0322R.menu.searchview_menu, menu);
        MenuItem searchItem = menu.findItem(C0322R.id.action_search);
        this.mSearchView = (SearchView) searchItem.getActionView();
        setupSearchView(searchItem);
        this.mSearchView.setImeOptions(268435456);
        return true;
    }

    private void setupSearchView(MenuItem searchItem) {
        SearchManager searchManager = (SearchManager) getSystemService(Event.SEARCH);
        if (searchManager != null) {
            this.mSearchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        }
        this.mSearchView.setOnQueryTextListener(this);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 16908332:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onQueryTextChange(String arg0) {
        ArrayList searched_list = new ArrayList();
        Iterator it = this.metroList.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            if (s.toLowerCase().contains(arg0.toLowerCase())) {
                searched_list.add(s);
            }
        }
        this.metroexpand = new MetroInfoExpand(this, searched_list);
        this.mainlist.setAdapter(this.metroexpand);
        this.metroexpand.notifyDataSetChanged();
        return true;
    }

    public boolean onQueryTextSubmit(String arg0) {
        return false;
    }
}
