package com.example.laijianyang.sharedemo;

import android.app.Application;
import com.example.laijianyang.sharedemo.data.DataSource;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import lombok.Getter;

/**
 * Created by laijianyang on 2016/11/2.
 */

public class DemoApplication extends Application {

  private static DemoApplication instance;

  public static DemoApplication getInstance() {
    return instance;
  }

  @Getter
  private DataSource dataSource;

  @Override
  public void onCreate() {
    super.onCreate();

    instance = this;

    dataSource = new DataSource();
    ImageLoader.getInstance().init(new ImageLoaderConfiguration.Builder(this).build());
  }
}
