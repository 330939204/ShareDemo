package com.example.laijianyang.sharedemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2017/01/17 16:45
 */

public interface ViewDelegate {

  View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

  void initView();

}
