package net.iquesoft.iquephoto.graphics;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

public class CircleSizeDrawable extends Drawable {
    private int mSize;

    private final Paint mPaint;

    public CircleSizeDrawable(final int size) {
        mSize = size;
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStrokeWidth(2.5f);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.GRAY);
    }

    @Override
    public void draw(@NonNull final Canvas canvas) {
        final Rect bounds = getBounds();
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), mSize, mPaint);
    }

    @Override
    public void setAlpha(final int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(final ColorFilter cf) {
        mPaint.setColorFilter(cf);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}