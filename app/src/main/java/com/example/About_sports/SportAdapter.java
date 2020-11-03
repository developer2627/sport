package com.example.About_sports;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportHolder>{
List<Sport>sportList;
Context context;


public SportAdapter(List<Sport>sportList, Context context)
{
    this.sportList=sportList;
    this.context=context;
}

    @NonNull
    @Override
    public SportHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SportHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.sportitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SportHolder holder, int position) {
    Sport sport=sportList.get(position);
        Glide.with(context).load(sport.getStrSportThumb()).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,SportDetails.class);
                intent.putExtra("sport",sport);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportHolder extends RecyclerView.ViewHolder {
    ImageView imageView;


        public SportHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
        }
    }


}
