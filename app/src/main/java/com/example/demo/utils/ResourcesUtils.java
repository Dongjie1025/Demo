package com.example.demo.utils;

import android.graphics.drawable.Drawable;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

import com.example.demo.mode.application.MyApplication;

public class ResourcesUtils {

  public static int getColor(@ColorRes int colorId) {
    return ContextCompat.getColor(MyApplication.mApplicationContext, colorId);
  }

  public static Drawable getDrawable(@DrawableRes int drawableId) {
    return ContextCompat.getDrawable(MyApplication.mApplicationContext, drawableId);
  }

}
