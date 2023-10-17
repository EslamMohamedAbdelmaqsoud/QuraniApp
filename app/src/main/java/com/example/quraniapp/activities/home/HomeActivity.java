package com.example.quraniapp.activities.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.activities.home.Doah.DoahActivity;
import com.example.quraniapp.activities.home.azkar.AzkarActivity;
import com.example.quraniapp.activities.home.learnablution.LearnAblutionActivity;
import com.example.quraniapp.activities.home.namesallah.NamesAllahActivity;
import com.example.quraniapp.activities.home.qiubla.QiablahActivity;
import com.example.quraniapp.activities.home.quran.MainActivity;
import com.example.quraniapp.activities.home.setting.SettingActivity;
import com.example.quraniapp.activities.home.tasbih.TasbihActivity;
import com.example.quraniapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding activityHomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        activityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        activityHomeBinding.cardView1HolyQuranHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

        activityHomeBinding.cardView2RemembrancesHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, AzkarActivity.class));

            }
        });

        activityHomeBinding.cardView3GodNamesHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, NamesAllahActivity.class));


            }
        });

        activityHomeBinding.cardView4LearnAblutionHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, LearnAblutionActivity.class));


            }
        });

        activityHomeBinding.cardView5TasbihHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, TasbihActivity.class));


            }
        });

        activityHomeBinding.cardView6QiblahHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, QiablahActivity.class));

            }
        });

        activityHomeBinding.cardView7DoahHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, DoahActivity.class));

            }
        });

        activityHomeBinding.cardView8SettingHomeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeActivity.this, SettingActivity.class));

            }
        });

    }
}