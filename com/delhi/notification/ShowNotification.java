package com.delhi.notification;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.delhi.metro.dtc.C0322R;
import com.delhi.notification.RecyclerItemClickListener.OnItemClickListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import io.fabric.sdk.android.services.settings.SettingsJsonConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShowNotification extends AppCompatActivity {
    private ProgressDialog Dialog;
    NewsRecyclerViewAdapter adapter;
    Button btn;
    DatabaseReference database;
    List<Note> notes;
    TextView tv;

    class C08872 implements OnItemClickListener {
        C08872() {
        }

        public void onItemClick(View view, int position) {
            Intent intent = new Intent(ShowNotification.this, NewsDetailScreen.class);
            intent.putExtra(SettingsJsonConstants.PROMPT_TITLE_KEY, ((Note) ShowNotification.this.notes.get(position)).getTitle());
            intent.putExtra("description", ((Note) ShowNotification.this.notes.get(position)).getDescription());
            intent.putExtra("imageurl", ((Note) ShowNotification.this.notes.get(position)).getUrl());
            ShowNotification.this.startActivity(intent);
        }
    }

    class C08883 implements ValueEventListener {
        C08883() {
        }

        public void onDataChange(DataSnapshot dataSnapshot) {
            ShowNotification.this.notes = new ArrayList();
            for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()) {
                Log.d("sandeep", "onDataChange:" + dataSnapshot.getValue());
                ShowNotification.this.notes.add((Note) noteDataSnapshot.getValue(Note.class));
            }
            ShowNotification.this.adapter.updateList(ShowNotification.this.notes);
            ShowNotification.this.Dialog.hide();
        }

        public void onCancelled(DatabaseError databaseError) {
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0322R.layout.news);
        this.database = FirebaseDatabase.getInstance().getReference();
        this.adapter = new NewsRecyclerViewAdapter(Collections.emptyList(), getApplicationContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(C0322R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        final int offset = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        recyclerView.addItemDecoration(new ItemDecoration() {
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, State state) {
                if (parent.getChildAdapterPosition(view) != parent.getAdapter().getItemCount() - 1) {
                    outRect.bottom = offset;
                }
            }
        });
        this.Dialog = new ProgressDialog(this);
        this.Dialog.setMessage("Loading ...");
        this.Dialog.show();
        recyclerView.setAdapter(this.adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), new C08872()));
    }

    protected void onResume() {
        super.onResume();
        this.database.child("news").addValueEventListener(new C08883());
    }
}
