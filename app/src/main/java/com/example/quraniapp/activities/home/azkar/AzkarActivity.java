package com.example.quraniapp.activities.home.azkar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityAzkarBinding;
import com.example.quraniapp.activities.home.HomeActivity;

public class AzkarActivity extends AppCompatActivity {

    ActivityAzkarBinding activityAzkarBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar);

        activityAzkarBinding = DataBindingUtil.setContentView(this, R.layout.activity_azkar);

        activityAzkarBinding.iconBackAzkarActivity.setOnClickListener(v -> {
            startActivity(new Intent(AzkarActivity.this, HomeActivity.class));
            finish();

        });

        activityAzkarBinding.buttonAzkarMorningAzkarActivity.setOnClickListener(v -> {
            startActivity(new Intent(AzkarActivity.this, DetailsAzkarActivity1.class));
        });

        activityAzkarBinding.buttonAzkareveningAzkarActivity.setOnClickListener(v -> {

            startActivity(new Intent(AzkarActivity.this, DetailsAzkarActivity2.class));
        });
        activityAzkarBinding.buttonAzkarWakingAzkarActivity.setOnClickListener(v -> {

            startActivity(new Intent(AzkarActivity.this, DetailsAzkarActivity3.class));

        });

        activityAzkarBinding.buttonAzkarSleepingAzkarActivity.setOnClickListener(v -> {

            startActivity(new Intent(AzkarActivity.this, DetailsAzkarActivity4.class));

        });

        activityAzkarBinding.buttonAzkarAfterpayerAzkarActivity.setOnClickListener(v -> {
            startActivity(new Intent(AzkarActivity.this, DetailsAzkarActivity5.class));

        });

    }
}