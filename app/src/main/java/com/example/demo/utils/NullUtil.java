package com.example.demo.utils;

import android.text.TextUtils;

public class NullUtil {
    public static boolean isNull(String s){
        return TextUtils.isEmpty(s);
    }
}
