package com.jitu.retrofitsampleapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit _retrofit;
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static Retrofit get_retrofit() {
        if(_retrofit==null){
            _retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory( GsonConverterFactory.create())
                    .build();
        }
        return _retrofit;
    }
}
