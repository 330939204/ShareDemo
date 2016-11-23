package com.example.laijianyang.sharedemo.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import com.example.laijianyang.sharedemo.R;

/**
 * Created by laijianyang on 2016/11/23.
 */

public abstract class ContainerActivity extends AppCompatActivity {

  @LayoutRes
  protected abstract int getActivityContentId();

  protected abstract void doOnCreate(Bundle savedInstanceState);

  @Override
  protected final void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.container_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    CoordinatorLayout root = (CoordinatorLayout) findViewById(R.id.root);
    LayoutInflater.from(this).inflate(getActivityContentId(), root, true);
    doOnCreate(savedInstanceState);
  }
}
