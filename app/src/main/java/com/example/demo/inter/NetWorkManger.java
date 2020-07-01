package com.example.demo.inter;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkManger {
    private static Retrofit retrofit;

    private NetWorkManger() {
    }

    private static class NetWorkHolder {
        private static volatile NetWorkManger netWorkManger = new NetWorkManger();
    }

    public static NetWorkManger getInstance() {
        return NetWorkHolder.netWorkManger;
    }

    public void init() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        retrofit = new Retrofit.Builder()
                .baseUrl(Request.HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
