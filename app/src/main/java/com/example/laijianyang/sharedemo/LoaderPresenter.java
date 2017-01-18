package com.example.laijianyang.sharedemo;

import android.content.Context;
import android.content.Loader;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2017/01/18 17:49
 */

public class LoaderPresenter<T extends BasePresenter> extends Loader<T> {
  /**
   * Stores away the application context associated with context.
   * Since Loaders can be used across multiple activities it's dangerous to
   * store the context directly; always use {@link #getContext()} to retrieve
   * the Loader's Context, don't use the constructor argument directly.
   * The Context returned by {@link #getContext} is safe to use across
   * Activity instances.
   *
   * @param context used to retrieve the application context.
   */
  public LoaderPresenter(Context context, PresenterFactory<T> factory) {
    super(context);
    this.factory = factory;
  }

  private final PresenterFactory<T> factory;
  private T presenter;

  // 省略构造方法

  @Override
  protected void onStartLoading() {

    // 如果已经有Presenter实例那就直接返回
    if (presenter != null) {
      deliverResult(presenter);
      return;
    }

    // 如果没有
    forceLoad();
  }

  @Override
  protected void onForceLoad() {
    // 通过工厂来实例化Presenter
    presenter = factory.create();

    // 返回Presenter
    deliverResult(presenter);
  }

  @Override
  protected void onReset() {
    presenter = null;
  }
}
