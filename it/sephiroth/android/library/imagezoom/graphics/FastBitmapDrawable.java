package it.sephiroth.android.library.imagezoom.graphics;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

public class FastBitmapDrawable extends Drawable implements IBitmapDrawable {
    protected Bitmap mBitmap;
    protected int mIntrinsicHeight;
    protected int mIntrinsicWidth;
    protected Paint mPaint;

    public FastBitmapDrawable(Bitmap b) {
        this.mBitmap = b;
        if (this.mBitmap != null) {
            this.mIntrinsicWidth = this.mBitmap.getWidth();
            this.mIntrinsicHeight = this.mBitmap.getHeight();
        } else {
            this.mIntrinsicWidth = 0;
            this.mIntrinsicHeight = 0;
        }
        this.mPaint = new Paint();
        this.mPaint.setDither(true);
        this.mPaint.setFilterBitmap(true);
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public FastBitmapDrawable(Resources res, InputStream is) {
        this(BitmapFactory.decodeStream(is));
    }

    public void draw(Canvas canvas) {
        if (this.mBitmap != null && !this.mBitmap.isRecycled()) {
            Rect bounds = getBounds();
            if (bounds.isEmpty()) {
                canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
            } else {
                canvas.drawBitmap(this.mBitmap, null, bounds, this.mPaint);
            }
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int alpha) {
        this.mPaint.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.mPaint.setColorFilter(cf);
    }

    public int getIntrinsicWidth() {
        return this.mIntrinsicWidth;
    }

    public int getIntrinsicHeight() {
        return this.mIntrinsicHeight;
    }

    public int getMinimumWidth() {
        return this.mIntrinsicWidth;
    }

    public int getMinimumHeight() {
        return this.mIntrinsicHeight;
    }

    public void setAntiAlias(boolean value) {
        this.mPaint.setAntiAlias(value);
        invalidateSelf();
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Paint getPaint() {
        return this.mPaint;
    }
}
