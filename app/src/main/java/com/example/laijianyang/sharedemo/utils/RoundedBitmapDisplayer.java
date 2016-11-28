package com.example.laijianyang.sharedemo.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/03/11 下午6:34
 */

public class RoundedBitmapDisplayer implements BitmapDisplayer {

  protected final int cornerRadius;
  protected final int margin;

  public RoundedBitmapDisplayer(int cornerRadiusPixels) {
    this(cornerRadiusPixels, 0);
  }

  public RoundedBitmapDisplayer(int cornerRadiusPixels, int marginPixels) {
    this.cornerRadius = cornerRadiusPixels;
    this.margin = marginPixels;
  }

  @Override
  public void display(Bitmap bitmap, ImageAware imageAware, LoadedFrom loadedFrom) {
    if (!(imageAware instanceof ImageViewAware)) {
      throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
    }

    imageAware.setImageDrawable(new CenterCropRoundedDrawable(bitmap, cornerRadius, margin));
  }

  public static class CenterCropRoundedDrawable extends Drawable {

    protected final float cornerRadius;
    protected final int margin;

    protected final RectF mRect = new RectF(), mBitmapRect;
    protected final BitmapShader bitmapShader;
    protected final Paint paint;

    public CenterCropRoundedDrawable(Bitmap bitmap, int cornerRadius, int margin) {
      this.cornerRadius = cornerRadius;
      this.margin = margin;
      bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
      mBitmapRect = new RectF(margin, margin, bitmap.getWidth() - margin, bitmap.getHeight() - margin);

      paint = new Paint();
      paint.setAntiAlias(true);
      paint.setShader(bitmapShader);
      paint.setFilterBitmap(true);
      paint.setDither(true);
    }

    private Matrix configureMatrix(float dwidth, float dheight, float vwidth, float vheight) {
      float scale;
      float dx = 0;
      float dy = 0;
      if (dwidth * vheight > vwidth * dheight) {
        scale = vheight / dheight;
        dx = (vwidth - dwidth * scale) * 0.5f;
      } else {
        scale = vwidth / dwidth;
        dy = (vheight - dheight * scale) * 0.5f;
      }
      Matrix matrix = new Matrix();
      matrix.setScale(scale, scale);
      matrix.postTranslate(dx, dy);
      return matrix;
    }

    @Override
    protected void onBoundsChange(Rect bounds) {
      super.onBoundsChange(bounds);
      mRect.set(margin, margin, bounds.width() - margin, bounds.height() - margin);

      // Resize the original bitmap to fit the new bound
      Matrix shaderMatrix = configureMatrix(mBitmapRect.width(), mBitmapRect.height(), mRect.width(), mRect.height());

      bitmapShader.setLocalMatrix(shaderMatrix);
    }

    @Override
    public void draw(Canvas canvas) {
      canvas.drawRoundRect(mRect, cornerRadius, cornerRadius, paint);
    }

    @Override
    public int getOpacity() {
      return PixelFormat.TRANSLUCENT;
    }

    @Override
    public void setAlpha(int alpha) {
      paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
      paint.setColorFilter(cf);
    }
  }
}
