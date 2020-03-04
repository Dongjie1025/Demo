package com.example.demo.mode.application;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    public static Context mApplicationContext;// 全局Context
    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = getApplicationContext();
    }
}
