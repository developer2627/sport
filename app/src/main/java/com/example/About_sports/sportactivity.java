package com.example.About_sports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class sportactivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SportAdapter sportAdapter;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportactivity);

        recyclerView=findViewById(R.id.RV_Recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mainViewModel= ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getResponse().observe(this, new Observer<SportResponce>() {
            @Override
            public void onChanged(SportResponce sportResponce) {

                setSportAdapter(sportResponce.getSports());



            }
        });
    }
    public void setSportAdapter(List<Sport>sportList)
    {
        sportAdapter=new SportAdapter(sportList,sportactivity.this);
        recyclerView.setAdapter(sportAdapter);
        sportAdapter.notifyDataSetChanged();
    }
}