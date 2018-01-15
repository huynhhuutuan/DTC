package com.delhi.notification;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public class RecyclerItemClickListener implements OnItemTouchListener {
    GestureDetector mGestureDetector;
    private OnItemClickListener mListener;

    class C03321 extends SimpleOnGestureListener {
        C03321() {
        }

        public boolean onSingleTapUp(MotionEvent e) {
            Log.d("sandeep", "onSingleTapUp is called");
            return true;
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    public RecyclerItemClickListener(Context context, OnItemClickListener listener) {
        this.mListener = listener;
        this.mGestureDetector = new GestureDetector(context, new C03321());
    }

    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        View childView = view.findChildViewUnder(e.getX(), e.getY());
        if (!(childView == null || this.mListener == null || !this.mGestureDetector.onTouchEvent(e))) {
            this.mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
            Log.d("sandeep", "onInterceptTouchEvent is called");
        }
        return false;
    }

    public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) {
    }

    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}
