package com.delhi.notification;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper.SimpleCallback;

public class NoteItemTouchHelperCallback extends SimpleCallback {
    private static final float ALPHA_FULL = 1.0f;

    private NoteItemTouchHelperCallback(int dragDirs, int swipeDirs) {
        super(dragDirs, swipeDirs);
    }

    public boolean onMove(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder target) {
        return false;
    }

    public void onSwiped(ViewHolder viewHolder, int direction) {
    }

    public void onChildDraw(Canvas c, RecyclerView recyclerView, ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        if (actionState == 1) {
            viewHolder.itemView.setAlpha(ALPHA_FULL - (Math.abs(dX) / ((float) viewHolder.itemView.getWidth())));
            viewHolder.itemView.setTranslationX(dX);
            return;
        }
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
    }
}
