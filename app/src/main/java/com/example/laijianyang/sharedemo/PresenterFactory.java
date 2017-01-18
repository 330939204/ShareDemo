package com.example.laijianyang.sharedemo;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2017/01/18 17:53
 */

public interface PresenterFactory<T extends BasePresenter> {
  T create();
}

