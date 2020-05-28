package com.example.demo.inter;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkManger {
    private String BASE_URL = "";
    private NetWorkManger() {
    }

    private static class NetWorkHolder {
        private static final NetWorkManger netWorkManger = new NetWorkManger();
    }

    public static NetWorkManger getInstance() {

        return NetWorkHolder.netWorkManger;
    }

    public void getNetWork() {
        Retrofit.Builder retrofit = new Retrofit.Builder();
        retrofit.baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }


}
