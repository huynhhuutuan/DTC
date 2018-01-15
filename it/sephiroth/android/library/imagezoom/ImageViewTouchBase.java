package it.sephiroth.android.library.imagezoom;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import it.sephiroth.android.library.imagezoom.graphics.FastBitmapDrawable;
import it.sephiroth.android.library.imagezoom.utils.IDisposable;

public abstract class ImageViewTouchBase extends ImageView implements IDisposable {
    protected static boolean DEBUG = false;
    public static final float MIN_SCALE_DIFF = 0.1f;
    public static final String TAG = "ImageViewTouchBase";
    public static final String VERSION = "2.3.0";
    public static final float ZOOM_INVALID = -1.0f;
    protected Matrix mBaseMatrix;
    protected boolean mBitmapChanged;
    protected RectF mBitmapRect;
    protected RectF mBitmapRectTmp;
    protected PointF mCenter;
    protected RectF mCenterRect;
    private Animator mCurrentAnimation;
    protected int mDefaultAnimationDuration;
    protected final Matrix mDisplayMatrix;
    private OnDrawableChangeListener mDrawableChangeListener;
    protected Runnable mLayoutRunnable;
    protected final float[] mMatrixValues;
    protected int mMaxFlingVelocity;
    protected float mMaxZoom;
    protected boolean mMaxZoomDefined;
    protected int mMinFlingVelocity;
    protected float mMinZoom;
    protected boolean mMinZoomDefined;
    protected Matrix mNextMatrix;
    private OnLayoutChangeListener mOnLayoutChangeListener;
    protected DisplayType mScaleType;
    protected boolean mScaleTypeChanged;
    protected PointF mScrollPoint;
    protected Matrix mSuppMatrix;
    protected boolean mUserScaled;
    protected RectF mViewPort;
    protected RectF mViewPortOld;

    class C07623 implements AnimatorListener {
        C07623() {
        }

        public void onAnimationStart(Animator animation) {
        }

        public void onAnimationEnd(Animator animation) {
            RectF centerRect = ImageViewTouchBase.this.getCenter(ImageViewTouchBase.this.mSuppMatrix, true, true);
            if (centerRect.left != 0.0f || centerRect.top != 0.0f) {
                ImageViewTouchBase.this.scrollBy(centerRect.left, centerRect.top);
            }
        }

        public void onAnimationCancel(Animator animation) {
        }

        public void onAnimationRepeat(Animator animation) {
        }
    }

    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER,
        FIT_HEIGHT,
        FIT_WIDTH
    }

    public interface OnDrawableChangeListener {
        void onDrawableChanged(Drawable drawable);
    }

    public interface OnLayoutChangeListener {
        void onLayoutChanged(boolean z, int i, int i2, int i3, int i4);
    }

    public ImageViewTouchBase(Context context) {
        this(context, null);
    }

    public ImageViewTouchBase(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageViewTouchBase(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mBaseMatrix = new Matrix();
        this.mSuppMatrix = new Matrix();
        this.mLayoutRunnable = null;
        this.mUserScaled = false;
        this.mMaxZoom = -1.0f;
        this.mMinZoom = -1.0f;
        this.mDisplayMatrix = new Matrix();
        this.mMatrixValues = new float[9];
        this.mScaleType = DisplayType.FIT_IF_BIGGER;
        this.mCenter = new PointF();
        this.mBitmapRect = new RectF();
        this.mBitmapRectTmp = new RectF();
        this.mCenterRect = new RectF();
        this.mScrollPoint = new PointF();
        this.mViewPort = new RectF();
        this.mViewPortOld = new RectF();
        init(context, attrs, defStyle);
    }

    public boolean getBitmapChanged() {
        return this.mBitmapChanged;
    }

    public void setOnDrawableChangedListener(OnDrawableChangeListener listener) {
        this.mDrawableChangeListener = listener;
    }

    public void setOnLayoutChangeListener(OnLayoutChangeListener listener) {
        this.mOnLayoutChangeListener = listener;
    }

    protected void init(Context context, AttributeSet attrs, int defStyle) {
        ViewConfiguration configuration = ViewConfiguration.get(context);
        this.mMinFlingVelocity = configuration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = configuration.getScaledMaximumFlingVelocity();
        this.mDefaultAnimationDuration = getResources().getInteger(17694720);
        setScaleType(ScaleType.MATRIX);
    }

    public void clear() {
        setImageBitmap(null);
    }

    public void setDisplayType(DisplayType type) {
        if (type != this.mScaleType) {
            if (DEBUG) {
                Log.i(TAG, "setDisplayType: " + type);
            }
            this.mUserScaled = false;
            this.mScaleType = type;
            this.mScaleTypeChanged = true;
            requestLayout();
        }
    }

    public DisplayType getDisplayType() {
        return this.mScaleType;
    }

    protected void setMinScale(float value) {
        if (DEBUG) {
            Log.d(TAG, "setMinZoom: " + value);
        }
        this.mMinZoom = value;
    }

    protected void setMaxScale(float value) {
        if (DEBUG) {
            Log.d(TAG, "setMaxZoom: " + value);
        }
        this.mMaxZoom = value;
    }

    protected void onViewPortChanged(float left, float top, float right, float bottom) {
        this.mViewPort.set(left, top, right, bottom);
        this.mCenter.x = this.mViewPort.centerX();
        this.mCenter.y = this.mViewPort.centerY();
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (DEBUG) {
            Log.e(TAG, "onLayout: " + changed + ", bitmapChanged: " + this.mBitmapChanged + ", scaleChanged: " + this.mScaleTypeChanged);
        }
        float deltaX = 0.0f;
        float deltaY = 0.0f;
        if (changed) {
            this.mViewPortOld.set(this.mViewPort);
            onViewPortChanged((float) left, (float) top, (float) right, (float) bottom);
            deltaX = this.mViewPort.width() - this.mViewPortOld.width();
            deltaY = this.mViewPort.height() - this.mViewPortOld.height();
        }
        super.onLayout(changed, left, top, right, bottom);
        Runnable r = this.mLayoutRunnable;
        if (r != null) {
            this.mLayoutRunnable = null;
            r.run();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (this.mBitmapChanged) {
                onDrawableChanged(drawable);
            }
            if (changed || this.mBitmapChanged || this.mScaleTypeChanged) {
                onLayoutChanged(left, top, right, bottom);
            }
            if (this.mBitmapChanged) {
                this.mBitmapChanged = false;
            }
            if (this.mScaleTypeChanged) {
                this.mScaleTypeChanged = false;
            }
        } else if (changed || this.mScaleTypeChanged || this.mBitmapChanged) {
            if (this.mBitmapChanged) {
                this.mUserScaled = false;
                this.mBaseMatrix.reset();
                if (!this.mMinZoomDefined) {
                    this.mMinZoom = -1.0f;
                }
                if (!this.mMaxZoomDefined) {
                    this.mMaxZoom = -1.0f;
                }
            }
            float scale = 1.0f;
            float oldDefaultScale = getDefaultScale(getDisplayType());
            float oldMatrixScale = getScale(this.mBaseMatrix);
            float oldScale = getScale();
            float oldMinScale = Math.min(1.0f, 1.0f / oldMatrixScale);
            getProperBaseMatrix(drawable, this.mBaseMatrix, this.mViewPort);
            float newMatrixScale = getScale(this.mBaseMatrix);
            if (DEBUG) {
                Log.d(TAG, "old matrix scale: " + oldMatrixScale);
                Log.d(TAG, "new matrix scale: " + newMatrixScale);
                Log.d(TAG, "old min scale: " + oldMinScale);
                Log.d(TAG, "old scale: " + oldScale);
            }
            if (this.mBitmapChanged || this.mScaleTypeChanged) {
                if (DEBUG) {
                    Log.d(TAG, "display type: " + getDisplayType());
                    Log.d(TAG, "newMatrix: " + this.mNextMatrix);
                }
                if (this.mNextMatrix != null) {
                    this.mSuppMatrix.set(this.mNextMatrix);
                    this.mNextMatrix = null;
                    scale = getScale();
                } else {
                    this.mSuppMatrix.reset();
                    scale = getDefaultScale(getDisplayType());
                }
                setImageMatrix(getImageViewMatrix());
                if (scale != getScale()) {
                    if (DEBUG) {
                        Log.v(TAG, "scale != getScale: " + scale + " != " + getScale());
                    }
                    zoomTo(scale);
                }
            } else if (changed) {
                if (!this.mMinZoomDefined) {
                    this.mMinZoom = -1.0f;
                }
                if (!this.mMaxZoomDefined) {
                    this.mMaxZoom = -1.0f;
                }
                setImageMatrix(getImageViewMatrix());
                postTranslate(-deltaX, -deltaY);
                if (this.mUserScaled) {
                    if (Math.abs(oldScale - oldMinScale) > MIN_SCALE_DIFF) {
                        scale = (oldMatrixScale / newMatrixScale) * oldScale;
                    }
                    if (DEBUG) {
                        Log.v(TAG, "userScaled. scale=" + scale);
                    }
                    zoomTo(scale);
                } else {
                    scale = getDefaultScale(getDisplayType());
                    if (DEBUG) {
                        Log.v(TAG, "!userScaled. scale=" + scale);
                    }
                    zoomTo(scale);
                }
                if (DEBUG) {
                    Log.d(TAG, "old min scale: " + oldDefaultScale);
                    Log.d(TAG, "old scale: " + oldScale);
                    Log.d(TAG, "new scale: " + scale);
                }
            }
            if (scale > getMaxScale() || scale < getMinScale()) {
                zoomTo(scale);
            }
            center(true, true);
            if (this.mBitmapChanged) {
                onDrawableChanged(drawable);
            }
            if (changed || this.mBitmapChanged || this.mScaleTypeChanged) {
                onLayoutChanged(left, top, right, bottom);
            }
            if (this.mScaleTypeChanged) {
                this.mScaleTypeChanged = false;
            }
            if (this.mBitmapChanged) {
                this.mBitmapChanged = false;
            }
            if (DEBUG) {
                Log.d(TAG, "scale: " + getScale() + ", minScale: " + getMinScale() + ", maxScale: " + getMaxScale());
            }
        }
    }

    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (DEBUG) {
            Log.i(TAG, "onConfigurationChanged. scale: " + getScale() + ", minScale: " + getMinScale() + ", mUserScaled: " + this.mUserScaled);
        }
        if (this.mUserScaled) {
            this.mUserScaled = Math.abs(getScale() - getMinScale()) > MIN_SCALE_DIFF;
        }
        if (DEBUG) {
            Log.v(TAG, "mUserScaled: " + this.mUserScaled);
        }
    }

    public void resetDisplay() {
        this.mBitmapChanged = true;
        requestLayout();
    }

    public void resetMatrix() {
        if (DEBUG) {
            Log.i(TAG, "resetMatrix");
        }
        this.mSuppMatrix = new Matrix();
        float scale = getDefaultScale(getDisplayType());
        setImageMatrix(getImageViewMatrix());
        if (DEBUG) {
            Log.d(TAG, "default scale: " + scale + ", scale: " + getScale());
        }
        if (scale != getScale()) {
            zoomTo(scale);
        }
        postInvalidate();
    }

    protected float getDefaultScale(DisplayType type) {
        if (type == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (type == DisplayType.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / getScale(this.mBaseMatrix));
        }
        if (type == DisplayType.FIT_HEIGHT) {
            return ((float) getHeight()) / (getYScale(this.mBaseMatrix) * this.mBitmapRect.height());
        }
        if (type == DisplayType.FIT_WIDTH) {
            return ((float) getWidth()) / (getXScale(this.mBaseMatrix) * this.mBitmapRect.width());
        }
        return 1.0f / getScale(this.mBaseMatrix);
    }

    public void setImageResource(int resId) {
        setImageDrawable(getContext().getResources().getDrawable(resId));
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, null, -1.0f, -1.0f);
    }

    public void setImageBitmap(Bitmap bitmap, Matrix matrix, float minZoom, float maxZoom) {
        if (bitmap != null) {
            setImageDrawable(new FastBitmapDrawable(bitmap), matrix, minZoom, maxZoom);
        } else {
            setImageDrawable(null, matrix, minZoom, maxZoom);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, null, -1.0f, -1.0f);
    }

    public void setImageDrawable(Drawable drawable, Matrix initialMatrix, float minZoom, float maxZoom) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final Matrix matrix = initialMatrix;
            final float f = minZoom;
            final float f2 = maxZoom;
            this.mLayoutRunnable = new Runnable() {
                public void run() {
                    ImageViewTouchBase.this.setImageDrawable(drawable2, matrix, f, f2);
                }
            };
            return;
        }
        setImageDrawableInternal(drawable, initialMatrix, minZoom, maxZoom);
    }

    protected void setImageDrawableInternal(Drawable drawable, Matrix initialMatrix, float minZoom, float maxZoom) {
        this.mBaseMatrix.reset();
        super.setImageDrawable(drawable);
        if (minZoom == -1.0f || maxZoom == -1.0f) {
            this.mMinZoom = -1.0f;
            this.mMaxZoom = -1.0f;
            this.mMinZoomDefined = false;
            this.mMaxZoomDefined = false;
        } else {
            minZoom = Math.min(minZoom, maxZoom);
            maxZoom = Math.max(minZoom, maxZoom);
            this.mMinZoom = minZoom;
            this.mMaxZoom = maxZoom;
            this.mMinZoomDefined = true;
            this.mMaxZoomDefined = true;
            if (getDisplayType() == DisplayType.FIT_TO_SCREEN || getDisplayType() == DisplayType.FIT_IF_BIGGER) {
                if (this.mMinZoom >= 1.0f) {
                    this.mMinZoomDefined = false;
                    this.mMinZoom = -1.0f;
                }
                if (this.mMaxZoom <= 1.0f) {
                    this.mMaxZoomDefined = true;
                    this.mMaxZoom = -1.0f;
                }
            }
        }
        if (initialMatrix != null) {
            this.mNextMatrix = new Matrix(initialMatrix);
        }
        if (DEBUG) {
            Log.v(TAG, "mMinZoom: " + this.mMinZoom + ", mMaxZoom: " + this.mMaxZoom);
        }
        this.mBitmapChanged = true;
        updateDrawable(drawable);
        requestLayout();
    }

    protected void updateDrawable(Drawable newDrawable) {
        if (newDrawable != null) {
            this.mBitmapRect.set(0.0f, 0.0f, (float) newDrawable.getIntrinsicWidth(), (float) newDrawable.getIntrinsicHeight());
        } else {
            this.mBitmapRect.setEmpty();
        }
    }

    protected void onDrawableChanged(Drawable drawable) {
        if (DEBUG) {
            Log.i(TAG, "onDrawableChanged");
            Log.v(TAG, "scale: " + getScale() + ", minScale: " + getMinScale());
        }
        fireOnDrawableChangeListener(drawable);
    }

    protected void fireOnLayoutChangeListener(int left, int top, int right, int bottom) {
        if (this.mOnLayoutChangeListener != null) {
            this.mOnLayoutChangeListener.onLayoutChanged(true, left, top, right, bottom);
        }
    }

    protected void fireOnDrawableChangeListener(Drawable drawable) {
        if (this.mDrawableChangeListener != null) {
            this.mDrawableChangeListener.onDrawableChanged(drawable);
        }
    }

    protected void onLayoutChanged(int left, int top, int right, int bottom) {
        if (DEBUG) {
            Log.i(TAG, "onLayoutChanged");
        }
        fireOnLayoutChangeListener(left, top, right, bottom);
    }

    protected float computeMaxZoom() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        float scale = Math.max(this.mBitmapRect.width() / this.mViewPort.width(), this.mBitmapRect.height() / this.mViewPort.height()) * 4.0f;
        if (!DEBUG) {
            return scale;
        }
        Log.i(TAG, "computeMaxZoom: " + scale);
        return scale;
    }

    protected float computeMinZoom() {
        if (DEBUG) {
            Log.i(TAG, "computeMinZoom");
        }
        if (getDrawable() == null) {
            return 1.0f;
        }
        float scale = Math.min(1.0f, 1.0f / getScale(this.mBaseMatrix));
        if (!DEBUG) {
            return scale;
        }
        Log.i(TAG, "computeMinZoom: " + scale);
        return scale;
    }

    public float getMaxScale() {
        if (this.mMaxZoom == -1.0f) {
            this.mMaxZoom = computeMaxZoom();
        }
        return this.mMaxZoom;
    }

    public float getMinScale() {
        if (DEBUG) {
            Log.i(TAG, "getMinScale, mMinZoom: " + this.mMinZoom);
        }
        if (this.mMinZoom == -1.0f) {
            this.mMinZoom = computeMinZoom();
        }
        if (DEBUG) {
            Log.v(TAG, "mMinZoom: " + this.mMinZoom);
        }
        return this.mMinZoom;
    }

    public Matrix getImageViewMatrix() {
        return getImageViewMatrix(this.mSuppMatrix);
    }

    public Matrix getImageViewMatrix(Matrix supportMatrix) {
        this.mDisplayMatrix.set(this.mBaseMatrix);
        this.mDisplayMatrix.postConcat(supportMatrix);
        return this.mDisplayMatrix;
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix current = getImageMatrix();
        boolean needUpdate = false;
        if ((matrix == null && !current.isIdentity()) || !(matrix == null || current.equals(matrix))) {
            needUpdate = true;
        }
        super.setImageMatrix(matrix);
        if (needUpdate) {
            onImageMatrixChanged();
        }
    }

    protected void onImageMatrixChanged() {
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.mSuppMatrix);
    }

    protected void getProperBaseMatrix(Drawable drawable, Matrix matrix, RectF rect) {
        float w = this.mBitmapRect.width();
        float h = this.mBitmapRect.height();
        matrix.reset();
        float scale = Math.min(rect.width() / w, rect.height() / h);
        matrix.postScale(scale, scale);
        matrix.postTranslate(rect.left, rect.top);
        matrix.postTranslate((rect.width() - (w * scale)) / 2.0f, (rect.height() - (h * scale)) / 2.0f);
        printMatrix(matrix);
    }

    protected float getValue(Matrix matrix, int whichValue) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[whichValue];
    }

    public void printMatrix(Matrix matrix) {
        float scalex = getValue(matrix, 0);
        float scaley = getValue(matrix, 4);
        float tx = getValue(matrix, 2);
        Log.d(TAG, "matrix: { x: " + tx + ", y: " + getValue(matrix, 5) + ", scalex: " + scalex + ", scaley: " + scaley + " }");
    }

    public RectF getBitmapRect() {
        return getBitmapRect(this.mSuppMatrix);
    }

    protected RectF getBitmapRect(Matrix supportMatrix) {
        getImageViewMatrix(supportMatrix).mapRect(this.mBitmapRectTmp, this.mBitmapRect);
        return this.mBitmapRectTmp;
    }

    protected float getYScale(Matrix matrix) {
        return getValue(matrix, 4);
    }

    protected float getXScale(Matrix matrix) {
        return getValue(matrix, 0);
    }

    protected float getScale(Matrix matrix) {
        return getValue(matrix, 0);
    }

    @SuppressLint({"Override"})
    public float getRotation() {
        return 0.0f;
    }

    public float getScale() {
        return getScale(this.mSuppMatrix);
    }

    public float getBaseScale() {
        return getScale(this.mBaseMatrix);
    }

    protected void center(boolean horizontal, boolean vertical) {
        if (getDrawable() != null) {
            RectF rect = getCenter(this.mSuppMatrix, horizontal, vertical);
            if (rect.left != 0.0f || rect.top != 0.0f) {
                postTranslate(rect.left, rect.top);
            }
        }
    }

    protected RectF getCenter(Matrix supportMatrix, boolean horizontal, boolean vertical) {
        if (getDrawable() == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.mCenterRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        RectF rect = getBitmapRect(supportMatrix);
        float height = rect.height();
        float width = rect.width();
        float deltaX = 0.0f;
        float deltaY = 0.0f;
        if (vertical) {
            if (height < this.mViewPort.height()) {
                deltaY = ((this.mViewPort.height() - height) / 2.0f) - (rect.top - this.mViewPort.top);
            } else if (rect.top > this.mViewPort.top) {
                deltaY = -(rect.top - this.mViewPort.top);
            } else if (rect.bottom < this.mViewPort.bottom) {
                deltaY = this.mViewPort.bottom - rect.bottom;
            }
        }
        if (horizontal) {
            if (width < this.mViewPort.width()) {
                deltaX = ((this.mViewPort.width() - width) / 2.0f) - (rect.left - this.mViewPort.left);
            } else if (rect.left > this.mViewPort.left) {
                deltaX = -(rect.left - this.mViewPort.left);
            } else if (rect.right < this.mViewPort.right) {
                deltaX = this.mViewPort.right - rect.right;
            }
        }
        this.mCenterRect.set(deltaX, deltaY, 0.0f, 0.0f);
        return this.mCenterRect;
    }

    protected void postTranslate(float deltaX, float deltaY) {
        if (deltaX != 0.0f || deltaY != 0.0f) {
            this.mSuppMatrix.postTranslate(deltaX, deltaY);
            setImageMatrix(getImageViewMatrix());
        }
    }

    protected void postScale(float scale, float centerX, float centerY) {
        this.mSuppMatrix.postScale(scale, scale, centerX, centerY);
        setImageMatrix(getImageViewMatrix());
    }

    protected PointF getCenter() {
        return this.mCenter;
    }

    protected void zoomTo(float scale) {
        if (DEBUG) {
            Log.i(TAG, "zoomTo: " + scale);
        }
        if (scale > getMaxScale()) {
            scale = getMaxScale();
        }
        if (scale < getMinScale()) {
            scale = getMinScale();
        }
        if (DEBUG) {
            Log.d(TAG, "sanitized scale: " + scale);
        }
        PointF center = getCenter();
        zoomTo(scale, center.x, center.y);
    }

    public void zoomTo(float scale, long durationMs) {
        PointF center = getCenter();
        zoomTo(scale, center.x, center.y, durationMs);
    }

    protected void zoomTo(float scale, float centerX, float centerY) {
        if (scale > getMaxScale()) {
            scale = getMaxScale();
        }
        postScale(scale / getScale(), centerX, centerY);
        onZoom(getScale());
        center(true, true);
    }

    protected void onZoom(float scale) {
    }

    protected void onZoomAnimationCompleted(float scale) {
    }

    public void scrollBy(float x, float y) {
        panBy((double) x, (double) y);
    }

    protected void panBy(double dx, double dy) {
        RectF rect = getBitmapRect();
        this.mScrollPoint.set((float) dx, (float) dy);
        updateRect(rect, this.mScrollPoint);
        if (this.mScrollPoint.x != 0.0f || this.mScrollPoint.y != 0.0f) {
            postTranslate(this.mScrollPoint.x, this.mScrollPoint.y);
            center(true, true);
        }
    }

    protected void updateRect(RectF bitmapRect, PointF scrollRect) {
        if (bitmapRect != null) {
        }
    }

    protected void stopAllAnimations() {
        if (this.mCurrentAnimation != null) {
            this.mCurrentAnimation.cancel();
            this.mCurrentAnimation = null;
        }
    }

    protected void scrollBy(float distanceX, float distanceY, long durationMs) {
        final ValueAnimator anim1 = ValueAnimator.ofFloat(new float[]{0.0f, distanceX}).setDuration(durationMs);
        final ValueAnimator anim2 = ValueAnimator.ofFloat(new float[]{0.0f, distanceY}).setDuration(durationMs);
        stopAllAnimations();
        this.mCurrentAnimation = new AnimatorSet();
        ((AnimatorSet) this.mCurrentAnimation).playTogether(new Animator[]{anim1, anim2});
        this.mCurrentAnimation.setDuration(durationMs);
        this.mCurrentAnimation.setInterpolator(new DecelerateInterpolator());
        this.mCurrentAnimation.start();
        anim2.addUpdateListener(new AnimatorUpdateListener() {
            float oldValueX = 0.0f;
            float oldValueY = 0.0f;

            public void onAnimationUpdate(ValueAnimator animation) {
                float valueX = ((Float) anim1.getAnimatedValue()).floatValue();
                float valueY = ((Float) anim2.getAnimatedValue()).floatValue();
                ImageViewTouchBase.this.panBy((double) (valueX - this.oldValueX), (double) (valueY - this.oldValueY));
                this.oldValueX = valueX;
                this.oldValueY = valueY;
                ImageViewTouchBase.this.postInvalidateOnAnimation();
            }
        });
        this.mCurrentAnimation.addListener(new C07623());
    }

    protected void zoomTo(float scale, float centerX, float centerY, long durationMs) {
        if (scale > getMaxScale()) {
            scale = getMaxScale();
        }
        float oldScale = getScale();
        Matrix m = new Matrix(this.mSuppMatrix);
        m.postScale(scale, scale, centerX, centerY);
        RectF rect = getCenter(m, true, true);
        float finalScale = scale;
        final float destX = centerX + (rect.left * scale);
        final float destY = centerY + (rect.top * scale);
        stopAllAnimations();
        ValueAnimator animation = ValueAnimator.ofFloat(new float[]{oldScale, finalScale});
        animation.setDuration(durationMs);
        animation.setInterpolator(new DecelerateInterpolator(1.0f));
        animation.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                ImageViewTouchBase.this.zoomTo(((Float) animation.getAnimatedValue()).floatValue(), destX, destY);
                ImageViewTouchBase.this.postInvalidateOnAnimation();
            }
        });
        animation.start();
    }

    public void dispose() {
        clear();
    }

    protected void onDraw(Canvas canvas) {
        if (getScaleType() == ScaleType.FIT_XY) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }
}
