package com.example.About_sports;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofitclient {
    private static Retrofitclient mInstance;
    private API myApi;
    private Retrofitclient()
    {
        Retrofit retrofit=new Retrofit.Builder().baseUrl(API.Base_URL).addConverterFactory(GsonConverterFactory.create()).build();
        myApi=retrofit.create(API.class);
    }
    public static synchronized Retrofitclient getInstance()
    {
        if (mInstance==null)mInstance=new Retrofitclient();
        return mInstance;

    }
    public API getMyApi()
    {
        return myApi;
    }
}
