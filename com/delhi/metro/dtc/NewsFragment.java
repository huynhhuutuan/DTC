package com.delhi.metro.dtc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.delhi.notification.NewsDetailScreen;
import com.delhi.notification.NewsRecyclerViewAdapter;
import com.delhi.notification.Note;
import com.delhi.notification.RecyclerItemClickListener;
import com.delhi.notification.RecyclerItemClickListener.OnItemClickListener;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewsFragment extends Fragment {
    NewsRecyclerViewAdapter adapter;
    Button btn;
    DatabaseReference database;
    private boolean isDataLoaded;
    public Tracker mTracker = null;
    List<Note> notes;
    private ProgressBar progressBar;
    TextView tv;

    class C08822 implements OnItemClickListener {
        C08822() {
        }

        public void onItemClick(View view, int position) {
            Log.d("sandeep", "notes item touch:" + position);
            if ((position + 1) % 4 != 0) {
                Log.d("sandeep", "notes item touch inside:" + position);
                Intent intent = new Intent(NewsFragment.this.getActivity(), NewsDetailScreen.class);
                intent.putExtra(SettingsJsonConstants.PROMPT_TITLE_KEY, ((Note) NewsFragment.this.notes.get(position)).getTitle());
                intent.putExtra("description", ((Note) NewsFragment.this.notes.get(position)).getDescription());
                intent.putExtra("imageurl", ((Note) NewsFragment.this.notes.get(position)).getUrl());
                intent.putExtra("timestamp", ((Note) NewsFragment.this.notes.get(position)).getTimeStamp());
                intent.putExtra(Param.SOURCE, ((Note) NewsFragment.this.notes.get(position)).getSource());
                NewsFragment.this.startActivity(intent);
            }
        }
    }

    class C08833 implements ValueEventListener {
        C08833() {
        }

        public void onDataChange(DataSnapshot dataSnapshot) {
            NewsFragment.this.notes = new ArrayList();
            int count = 0;
            for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()) {
                count++;
                Log.d("sandeep", "count" + count);
                if (count != 0 && count % 4 == 0) {
                    Log.d("sandeep", "count inside loop:" + count);
                    NewsFragment.this.notes.add(new Note());
                    count++;
                }
                NewsFragment.this.notes.add((Note) noteDataSnapshot.getValue(Note.class));
            }
            for (Note nt : NewsFragment.this.notes) {
                Log.d("sandeep", "notes count:" + nt.getTitle());
            }
            NewsFragment.this.adapter.updateList(NewsFragment.this.notes);
            NewsFragment.this.progressBar.setVisibility(8);
            NewsFragment.this.isDataLoaded = true;
            Log.d("sandeep", "NewsFragment onDataChange is called");
        }

        public void onCancelled(DatabaseError databaseError) {
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("sandeep", "NewsFragment onAttach()");
        if (this.mTracker == null) {
            this.mTracker = GoogleAnalytics.getInstance(context).newTracker((int) C0322R.xml.global_tracker);
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(C0322R.layout.news, container, false);
        Log.d("sandeep", "NewsFragment onCreateView");
        this.database = FirebaseDatabase.getInstance().getReference();
        this.adapter = new NewsRecyclerViewAdapter(Collections.emptyList(), getActivity().getApplicationContext());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0322R.id.recyclerview);
        this.progressBar = (ProgressBar) view.findViewById(C0322R.id.progress_bar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        final int offset = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        recyclerView.addItemDecoration(new ItemDecoration() {
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, State state) {
                if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
                    outRect.bottom = offset;
                }
            }
        });
        this.progressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF6600"), Mode.SRC_ATOP);
        recyclerView.setAdapter(this.adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity().getApplicationContext(), new C08822()));
        return view;
    }

    public void onResume() {
        super.onResume();
        publishScreenViewEvent();
        Log.d("sandeep", "NewsFragment onResume is called");
        this.database.child("news").addValueEventListener(new C08833());
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.d("sandeep", "NewsFragment setUserVisibleHint is called :" + isVisibleToUser);
        publishScreenViewEvent();
    }

    private void publishScreenViewEvent() {
        if (getUserVisibleHint() && isResumed()) {
            Log.d("sandeep", "NewsFragment publishScreenViewEvent()");
            this.mTracker.setScreenName("News Listing");
            this.mTracker.send(new ScreenViewBuilder().build());
        }
    }
}
