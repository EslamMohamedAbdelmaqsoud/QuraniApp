package com.example.quraniapp.adapter;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quraniapp.R;
import com.example.quraniapp.model.DetailsAzkarActivityModel1;

import java.util.List;


public class DetailsazkarAdapter1 extends RecyclerView.Adapter<DetailsazkarAdapter1.MyViewHolder> {
    List<DetailsAzkarActivityModel1> seekerCycleModels;
    Activity activity;
    DetailsAzkarActivityModel1 seekerCycleModel;

    public DetailsazkarAdapter1(Activity activity, List<DetailsAzkarActivityModel1> seekerCycleModels) {
        this.activity = activity;
        this.seekerCycleModels = seekerCycleModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.azkar_layout, parent, false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        seekerCycleModel = seekerCycleModels.get(position);
        holder.descrption.setText(seekerCycleModel.getDescrption());

        //animation RecyclerView
        holder.descrption.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.anim_four));

        //نسخ نص //
        holder.icon_CopyTextdes_azkarActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", holder.descrption.getText());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(activity, " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        ////

    }

    @Override
    public int getItemCount() {
        return seekerCycleModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView descrption;

        ImageView icon_CopyTextdes_azkarActivity;
        CardView cardView_azkar;


        public MyViewHolder(View itemView) {
            super(itemView);


            descrption = (TextView) itemView.findViewById(R.id.descrption);
            icon_CopyTextdes_azkarActivity = (ImageView) itemView.findViewById(R.id.icon_CopyTextdes_azkarActivity);


            cardView_azkar = itemView.findViewById(R.id.cardView_azkar);


        }
    }
}
