package com.delhi.notification;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.delhi.metro.dtc.C0322R;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import java.util.List;

public class NewsRecyclerViewAdapter extends Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    public static final int NEWS_ADS = 4;
    static Context context;
    private List<Note> notes;

    public static class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements OnClickListener {
        TextView datetime;
        ImageView imgView;
        private Note note;
        TextView titleTextView;

        public static class ViewHolderAdMob extends android.support.v7.widget.RecyclerView.ViewHolder {
            public AdView mAdView;

            public ViewHolderAdMob(View view) {
                super(view);
                this.mAdView = (AdView) view.findViewById(C0322R.id.adViewRecycler);
                this.mAdView.loadAd(new Builder().build());
            }
        }

        public ViewHolder(View itemView) {
            super(itemView);
            this.titleTextView = (TextView) itemView.findViewById(C0322R.id.note_title);
            this.imgView = (ImageView) itemView.findViewById(C0322R.id.img_url);
            this.datetime = (TextView) itemView.findViewById(C0322R.id.news_date);
            itemView.setOnClickListener(this);
        }

        public void bind(Note note) {
            this.note = note;
            this.titleTextView.setText(note.getTitle());
            this.datetime.setText(note.getTimeStamp());
            Glide.with(NewsRecyclerViewAdapter.context).load(note.getUrl()).placeholder((int) C0322R.drawable.place_holder).diskCacheStrategy(DiskCacheStrategy.SOURCE).fitCenter().override(1000, 500).into(this.imgView);
        }

        public void onClick(View view) {
        }
    }

    public NewsRecyclerViewAdapter(List<Note> notes, Context ctx) {
        this.notes = notes;
        context = ctx;
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case 1:
                return new ViewHolder(inflater.inflate(C0322R.layout.note_item, parent, false));
            case 2:
                return new ViewHolderAdMob(inflater.inflate(C0322R.layout.admob_recycler_item, parent, false));
            default:
                return null;
        }
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case 1:
                ((ViewHolder) holder).bind((Note) this.notes.get(position));
                return;
            default:
                return;
        }
    }

    public int getItemCount() {
        return this.notes.size();
    }

    public int getItemViewType(int position) {
        if ((position + 1) % 4 == 0) {
            return 2;
        }
        return 1;
    }

    public void updateList(List<Note> notes) {
        if (notes.size() != this.notes.size() || !this.notes.containsAll(notes)) {
            this.notes = notes;
            notifyDataSetChanged();
        }
    }

    public void removeItem(int position) {
        this.notes.remove(position);
        notifyItemRemoved(position);
    }

    public Note getItem(int position) {
        return (Note) this.notes.get(position);
    }
}
