package com.example.demo.utils;

import com.example.demo.mode.application.MyApplication;

public class DipUtils {

  public static int px2dip(float pxValue) { // NO_UCD (unused code)
    final float scale = MyApplication.mApplicationContext.getResources()
        .getDisplayMetrics().density;
    return (int) (pxValue / scale + 0.5f);
  }
}
