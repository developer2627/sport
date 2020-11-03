package com.example.About_sports;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    String Base_URL="https://www.thesportsdb.com/api/v1/json/1/";
    @GET("all_sports.php")
    Call<SportResponce>getSports();
}
