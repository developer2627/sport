package com.example.About_sports;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class MainViewModel extends AndroidViewModel {
     private Repository repository;


    public MainViewModel(@NonNull Application application) {
        super(application);
        repository=new Repository(application);

    }
    public LiveData<SportResponce>getResponse()
    {
       return repository.getSportMutableLiveData();
    }
}
