package com.example.About_sports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SportDetails extends AppCompatActivity {
    ImageView imageView;
    TextView Name,Type,Description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_details);

        imageView=findViewById(R.id.IV_sportimage);
        Name=findViewById(R.id.TV_name);
        Type=findViewById(R.id.TV_type);
        Description=findViewById(R.id.TV_Description);

        Intent intent=getIntent();
        Sport sport= (Sport) intent.getSerializableExtra("sport");


        Glide.with(this).load(sport.getStrSportThumb()).into(imageView);
        Name.setText(sport.getStrSport());
        Type.setText(sport.getStrFormat());
        Description.setText(sport.getStrSportDescription());

    }
}