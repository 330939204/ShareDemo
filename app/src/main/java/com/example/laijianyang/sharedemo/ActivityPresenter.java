package com.example.laijianyang.sharedemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2017/01/17 15:49
 */

public abstract class ActivityPresenter<T extends ViewDelegate> extends Activity {

  protected T viewDelegate;

  public abstract Class<T> getViewDelegateType();

  public ActivityPresenter() {
    try {
      viewDelegate = getViewDelegateType().newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException("create delegate error");
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(viewDelegate.createView(getLayoutInflater(), null, savedInstanceState));
    viewDelegate.initView();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    viewDelegate = null;
  }
}
