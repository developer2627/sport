package com.example.About_sports;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private MutableLiveData<SportResponce>MutableLiveData=new MutableLiveData<>();
    private Application application;
    public Repository(Application application)
    {
     this.application=application;
    }
    public MutableLiveData<SportResponce> getSportMutableLiveData(){
        Call<SportResponce> call=Retrofitclient.getInstance().getMyApi().getSports();
        call.enqueue(new Callback<SportResponce>() {
            @Override
            public void onResponse(Call<SportResponce> call, Response<SportResponce> response) {
             SportResponce sportResponce=response.body();
             MutableLiveData.setValue(sportResponce);

            }

            @Override
            public void onFailure(Call<SportResponce> call, Throwable t) {

            }
        });
        return MutableLiveData;
    }
}
