package com.example.laijianyang.sharedemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2017/01/17 17:28
 */

public abstract class BaseViewDelegate implements ViewDelegate {

  protected View rootView;

  @Override
  public View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    rootView = inflater.inflate(getRootViewId(), container, false);
    return rootView;
  }

  @LayoutRes
  public abstract int getRootViewId();

  @SuppressWarnings("unchecked")
  public <T extends View> T getView(@IdRes int viewId) {
    return (T) rootView.findViewById(viewId);
  }

  public Context getContext(){
    return rootView.getContext();
  }
}
