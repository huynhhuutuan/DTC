package it.sephiroth.android.library.imagezoom;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewConfiguration;

public class ImageViewTouch extends ImageViewTouchBase {
    public static final long MIN_FLING_DELTA_TIME = 150;
    static final float SCROLL_DELTA_THRESHOLD = 1.0f;
    protected int mDoubleTapDirection;
    protected boolean mDoubleTapEnabled = true;
    private OnImageViewTouchDoubleTapListener mDoubleTapListener;
    protected GestureDetector mGestureDetector;
    protected OnGestureListener mGestureListener;
    long mPointerUpTime;
    protected ScaleGestureDetector mScaleDetector;
    protected boolean mScaleEnabled = true;
    private float mScaleFactor;
    protected OnScaleGestureListener mScaleListener;
    protected boolean mScrollEnabled = true;
    private OnImageViewTouchSingleTapListener mSingleTapListener;
    protected int mTouchSlop;

    public class GestureListener extends SimpleOnGestureListener {
        public boolean onSingleTapConfirmed(MotionEvent e) {
            if (ImageViewTouch.this.mSingleTapListener != null) {
                ImageViewTouch.this.mSingleTapListener.onSingleTapConfirmed();
            }
            return ImageViewTouch.this.onSingleTapConfirmed(e);
        }

        public boolean onDoubleTap(MotionEvent e) {
            if (ImageViewTouchBase.DEBUG) {
                Log.i(ImageViewTouchBase.TAG, "onDoubleTap. double tap enabled? " + ImageViewTouch.this.mDoubleTapEnabled);
            }
            if (ImageViewTouch.this.mDoubleTapEnabled) {
                if (VERSION.SDK_INT >= 19 && ImageViewTouch.this.mScaleDetector.isQuickScaleEnabled()) {
                    return true;
                }
                ImageViewTouch.this.mUserScaled = true;
                ImageViewTouch.this.zoomTo(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(ImageViewTouch.this.onDoubleTapPost(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxScale(), ImageViewTouch.this.getMinScale()), ImageViewTouch.this.getMinScale())), e.getX(), e.getY(), (long) ImageViewTouch.this.mDefaultAnimationDuration);
            }
            if (ImageViewTouch.this.mDoubleTapListener != null) {
                ImageViewTouch.this.mDoubleTapListener.onDoubleTap();
            }
            return super.onDoubleTap(e);
        }

        public void onLongPress(MotionEvent e) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.mScaleDetector.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            if (ImageViewTouch.this.mScrollEnabled && e1 != null && e2 != null && e1.getPointerCount() <= 1 && e2.getPointerCount() <= 1 && !ImageViewTouch.this.mScaleDetector.isInProgress()) {
                return ImageViewTouch.this.onScroll(e1, e2, distanceX, distanceY);
            }
            return false;
        }

        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (ImageViewTouch.this.mScrollEnabled && e1 != null && e2 != null && e1.getPointerCount() <= 1 && e2.getPointerCount() <= 1 && !ImageViewTouch.this.mScaleDetector.isInProgress() && SystemClock.uptimeMillis() - ImageViewTouch.this.mPointerUpTime > 150) {
                return ImageViewTouch.this.onFling(e1, e2, velocityX, velocityY);
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent e) {
            return ImageViewTouch.this.onSingleTapUp(e);
        }

        public boolean onDown(MotionEvent e) {
            if (ImageViewTouchBase.DEBUG) {
                Log.i(ImageViewTouchBase.TAG, "onDown");
            }
            ImageViewTouch.this.stopAllAnimations();
            return ImageViewTouch.this.onDown(e);
        }
    }

    public interface OnImageViewTouchDoubleTapListener {
        void onDoubleTap();
    }

    public interface OnImageViewTouchSingleTapListener {
        void onSingleTapConfirmed();
    }

    public class ScaleListener extends SimpleOnScaleGestureListener {
        protected boolean mScaled = false;

        public boolean onScale(ScaleGestureDetector detector) {
            float span = detector.getCurrentSpan() - detector.getPreviousSpan();
            float targetScale = ImageViewTouch.this.getScale() * detector.getScaleFactor();
            if (ImageViewTouch.this.mScaleEnabled) {
                if (this.mScaled && span != 0.0f) {
                    ImageViewTouch.this.mUserScaled = true;
                    ImageViewTouch.this.zoomTo(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(targetScale, ImageViewTouch.this.getMinScale() - ImageViewTouchBase.MIN_SCALE_DIFF)), detector.getFocusX(), detector.getFocusY());
                    ImageViewTouch.this.mDoubleTapDirection = 1;
                    ImageViewTouch.this.invalidate();
                } else if (!this.mScaled) {
                    this.mScaled = true;
                }
            }
            return true;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewTouch(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    protected void init(Context context, AttributeSet attrs, int defStyle) {
        super.init(context, attrs, defStyle);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mGestureListener = getGestureListener();
        this.mScaleListener = getScaleListener();
        this.mScaleDetector = new ScaleGestureDetector(getContext(), this.mScaleListener);
        this.mGestureDetector = new GestureDetector(getContext(), this.mGestureListener, null, true);
        this.mDoubleTapDirection = 1;
        setQuickScaleEnabled(false);
    }

    @TargetApi(19)
    public void setQuickScaleEnabled(boolean value) {
        if (VERSION.SDK_INT >= 19) {
            this.mScaleDetector.setQuickScaleEnabled(value);
        }
    }

    @TargetApi(19)
    public boolean getQuickScaleEnabled() {
        if (VERSION.SDK_INT >= 19) {
            return this.mScaleDetector.isQuickScaleEnabled();
        }
        return false;
    }

    public float getScaleFactor() {
        return this.mScaleFactor;
    }

    public void setDoubleTapListener(OnImageViewTouchDoubleTapListener listener) {
        this.mDoubleTapListener = listener;
    }

    public void setSingleTapListener(OnImageViewTouchSingleTapListener listener) {
        this.mSingleTapListener = listener;
    }

    public void setDoubleTapEnabled(boolean value) {
        this.mDoubleTapEnabled = value;
    }

    public void setScaleEnabled(boolean value) {
        this.mScaleEnabled = value;
    }

    public void setScrollEnabled(boolean value) {
        this.mScrollEnabled = value;
    }

    public boolean getDoubleTapEnabled() {
        return this.mDoubleTapEnabled;
    }

    protected OnGestureListener getGestureListener() {
        return new GestureListener();
    }

    protected OnScaleGestureListener getScaleListener() {
        return new ScaleListener();
    }

    protected void onLayoutChanged(int left, int top, int right, int bottom) {
        super.onLayoutChanged(left, top, right, bottom);
        Log.v(ImageViewTouchBase.TAG, "min: " + getMinScale() + ", max: " + getMaxScale() + ", result: " + ((getMaxScale() - getMinScale()) / 2.0f));
        this.mScaleFactor = ((getMaxScale() - getMinScale()) / 2.0f) + 0.5f;
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (getBitmapChanged()) {
            return false;
        }
        int action = event.getActionMasked();
        if (action == 6) {
            this.mPointerUpTime = event.getEventTime();
        }
        this.mScaleDetector.onTouchEvent(event);
        if (!this.mScaleDetector.isInProgress()) {
            this.mGestureDetector.onTouchEvent(event);
        }
        switch (action) {
            case 1:
                return onUp(event);
            default:
                return true;
        }
    }

    protected void onZoomAnimationCompleted(float scale) {
        if (DEBUG) {
            Log.d(ImageViewTouchBase.TAG, "onZoomAnimationCompleted. scale: " + scale + ", minZoom: " + getMinScale());
        }
        if (scale < getMinScale()) {
            zoomTo(getMinScale(), 50);
        }
    }

    protected float onDoubleTapPost(float scale, float maxZoom, float minScale) {
        if (this.mScaleFactor + scale <= maxZoom) {
            return scale + this.mScaleFactor;
        }
        return minScale;
    }

    public boolean onSingleTapConfirmed(MotionEvent e) {
        return true;
    }

    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        if (!canScroll()) {
            return false;
        }
        this.mUserScaled = true;
        scrollBy(-distanceX, -distanceY);
        invalidate();
        return true;
    }

    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (!canScroll()) {
            return false;
        }
        if (DEBUG) {
            Log.i(ImageViewTouchBase.TAG, "onFling");
        }
        if (Math.abs(velocityX) <= ((float) (this.mMinFlingVelocity * 4)) && Math.abs(velocityY) <= ((float) (this.mMinFlingVelocity * 4))) {
            return false;
        }
        if (DEBUG) {
            Log.v(ImageViewTouchBase.TAG, "velocity: " + velocityY);
            Log.v(ImageViewTouchBase.TAG, "diff: " + (e2.getY() - e1.getY()));
        }
        float scale = Math.min(Math.max(2.0f, getScale() / 2.0f), 3.0f);
        float scaledDistanceX = (velocityX / ((float) this.mMaxFlingVelocity)) * (((float) getWidth()) * scale);
        float scaledDistanceY = (velocityY / ((float) this.mMaxFlingVelocity)) * (((float) getHeight()) * scale);
        if (DEBUG) {
            Log.v(ImageViewTouchBase.TAG, "scale: " + getScale() + ", scale_final: " + scale);
            Log.v(ImageViewTouchBase.TAG, "scaledDistanceX: " + scaledDistanceX);
            Log.v(ImageViewTouchBase.TAG, "scaledDistanceY: " + scaledDistanceY);
        }
        this.mUserScaled = true;
        scrollBy(scaledDistanceX, scaledDistanceY, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow((double) scaledDistanceX, 2.0d) + Math.pow((double) scaledDistanceY, 2.0d)) / 5.0d), 800.0d));
        postInvalidate();
        return true;
    }

    public boolean onDown(MotionEvent e) {
        if (getBitmapChanged()) {
            return false;
        }
        return true;
    }

    public boolean onUp(MotionEvent e) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale() < getMinScale()) {
            zoomTo(getMinScale(), 50);
        }
        return true;
    }

    public boolean onSingleTapUp(MotionEvent e) {
        if (getBitmapChanged()) {
            return false;
        }
        return true;
    }

    public boolean canScroll() {
        if (getScale() > SCROLL_DELTA_THRESHOLD) {
            return true;
        }
        if (this.mViewPort.contains(getBitmapRect())) {
            return false;
        }
        return true;
    }

    public boolean canScroll(int direction) {
        RectF bitmapRect = getBitmapRect();
        updateRect(bitmapRect, this.mScrollPoint);
        Rect imageViewRect = new Rect();
        getGlobalVisibleRect(imageViewRect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) imageViewRect.right) || direction >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.mScrollPoint.x)) <= 1.0d) {
                return false;
            }
            return true;
        } else if (Math.abs(bitmapRect.right - ((float) imageViewRect.right)) <= SCROLL_DELTA_THRESHOLD) {
            return false;
        } else {
            return true;
        }
    }
}
