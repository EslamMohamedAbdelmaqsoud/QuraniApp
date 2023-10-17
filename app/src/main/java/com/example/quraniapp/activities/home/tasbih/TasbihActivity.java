package com.example.quraniapp.activities.home.tasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityTasbihBinding;
import com.example.quraniapp.activities.home.HomeActivity;

public class TasbihActivity extends AppCompatActivity {

    ActivityTasbihBinding activityTasbihBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        activityTasbihBinding = DataBindingUtil.setContentView(this, R.layout.activity_tasbih);
        activityTasbihBinding.iconBackTasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TasbihActivity.this, HomeActivity.class));
                finish();

            }
        });

        activityTasbihBinding.button1Tasbih1TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TasbihActivity.this, Tasbih1Activity.class));
                finish();

            }
        });

        activityTasbihBinding.button2Tasbih2TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TasbihActivity.this, Tasbih2Activity.class));
                finish();

            }
        });

        activityTasbihBinding.button3Tasbih3TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TasbihActivity.this, Tasbih3Activity.class));
                finish();

            }
        });

        activityTasbihBinding.button4Tasbih4TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TasbihActivity.this, Tasbih4Activity.class));
                finish();

            }
        });

        activityTasbihBinding.button5Tasbih5TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TasbihActivity.this, Tasbih5Activity.class));
                finish();

            }
        });

    }
}