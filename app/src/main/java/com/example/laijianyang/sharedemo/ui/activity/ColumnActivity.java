package com.example.laijianyang.sharedemo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.API;

/**
 * Created by laijianyang on 2016/11/23.
 */

public class ColumnActivity extends ContainerActivity {

  private static final String EXTRA_KEY_COLUMN_URL = "EXTRA_KEY_COLUMN_URL";

  public static void start(Context context, String columnUrl) {
    Intent intent = new Intent(context, ColumnActivity.class);
    intent.putExtra(EXTRA_KEY_COLUMN_URL, columnUrl);
    context.startActivity(intent);
  }

  @Override
  protected int getActivityContentId() {
    return R.layout.layout_column;
  }

  @Override
  protected void doOnCreate(Bundle savedInstanceState) {
    String columnUrl = API.COLUMN_BASE_URL + getIntent().getStringExtra(EXTRA_KEY_COLUMN_URL);

    WebView webView = (WebView) findViewById(R.id.web_view_column);
    webView.loadUrl(columnUrl);
  }
}
