package com.example.quraniapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quraniapp.R;
import com.example.quraniapp.model.NameAllahModel;

import java.util.List;


public class NamesAllahAdapter extends RecyclerView.Adapter<NamesAllahAdapter.MyViewHolder> {
    List<NameAllahModel> seekerCycleModels;
    Activity activity;
    NameAllahModel seekerCycleModel;

    public NamesAllahAdapter(Activity activity, List<NameAllahModel> seekerCycleModels) {
        this.activity = activity;
        this.seekerCycleModels = seekerCycleModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.names_layout, parent, false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        seekerCycleModel = seekerCycleModels.get(position);
        holder.banname.setText(seekerCycleModel.getBanName());
        holder.enname.setText(seekerCycleModel.getEnName());
        holder.banglamean.setText(seekerCycleModel.getBannglamean());
        holder.englishmean.setText(seekerCycleModel.getEnglishmean());
        //animation RecyclerView
        holder.cardView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.anim_four));


    }

    @Override
    public int getItemCount() {
        return seekerCycleModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView banname;
        TextView enname;
        TextView banglamean;
        TextView englishmean;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);


            banname = (TextView) itemView.findViewById(R.id.ban);
            enname = (TextView) itemView.findViewById(R.id.eng);
            banglamean = (TextView) itemView.findViewById(R.id.banglamean);
            englishmean = (TextView) itemView.findViewById(R.id.englishMean);

            cardView = itemView.findViewById(R.id.cardView);


        }
    }
}
