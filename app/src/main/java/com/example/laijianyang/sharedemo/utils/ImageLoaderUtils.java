package com.example.laijianyang.sharedemo.utils;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

/**
 * Created by laijianyang on 2016/11/28.
 */

public class ImageLoaderUtils {

  public static void display(String uri, ImageView imageView) {
    display(uri, imageView, getDefaultOption(), null);
  }

  public static void displayRoundImage(String uri, ImageView imageView) {
    if (imageView != null) {
      ViewGroup.LayoutParams params = imageView.getLayoutParams();
      int radius = params == null ? 0 : params.width / 2;
      display(uri, imageView, getRoundOption(radius), null);
    }
  }

  private static void display(String uri, ImageView imageView, DisplayImageOptions options,
      ImageLoadingListener listener) {
    // 无需判断uri是否为空，如果uri为空，imageLoader会检查 options里
    // 是否设置了emptyUri resource，设置了的话会默认展示该resource
    if (imageView != null) {
      ImageLoader.getInstance().displayImage(uri, imageView, options, listener);
    }
  }

  private static DisplayImageOptions getDefaultOption() {
    return new DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).considerExifParams(true).build();
  }

  private static DisplayImageOptions getRoundOption(int radius) {
    return new DisplayImageOptions.Builder().displayer(new RoundedBitmapDisplayer(radius))
                                            .cacheInMemory(true)
                                            .cacheOnDisk(true)
                                            .considerExifParams(true)
                                            .build();
  }
}
