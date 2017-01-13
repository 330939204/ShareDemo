package com.example.laijianyang.sharedemo.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 一些view相关的静态方法
 *
 * Created by laijianyang on 2016/11/23.
 */

public class ViewUtils {

  public static void toastMessage(Context context, CharSequence message) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
  }
}
