package com.example.demo.utils;

import android.util.Log;

public class MLog {
    // TAG
    private static String TAG = "TAG";

    // 开关
    private static boolean isDeg = true;

    public static void setDeg(boolean isDeg) {
        MLog.isDeg = isDeg;
    }

    public static void v(String t,String log) {
        String tag = NullUtil.isNull(t) ? TAG : t;
        if(isDeg){
            Log.v(tag, log);
        }
    }

    public static void d(String t,String log) {
        String tag = NullUtil.isNull(t) ? TAG : t;
        if(isDeg){
            Log.d(tag, log);
        }
    }

    public static void i(String t,String log) {
        String tag = NullUtil.isNull(t) ? TAG : t;
        if(isDeg){
            Log.i(tag, log);
        }
    }

    public static void w(String t,String log) {
        String tag = NullUtil.isNull(t) ? TAG : t;
        if(isDeg){
            Log.w(tag, log);
        }
    }


    public static void e(String t,String log) {
        String tag = NullUtil.isNull(t) ? TAG : t;
        if(isDeg){
            Log.e(tag, log);
        }
    }
}
