package com.example.quraniapp.activities.home.tasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityTasbih1Binding;

public class Tasbih1Activity extends AppCompatActivity {

    ActivityTasbih1Binding activityTasbih1Binding;
    int count1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih1);


        activityTasbih1Binding = DataBindingUtil.setContentView(this,R.layout.activity_tasbih1);

        activityTasbih1Binding.iconBackTasbih1Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tasbih1Activity.this, TasbihActivity.class));

            }
        });

        activityTasbih1Binding.buttonCountTasbih1TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1++;
                activityTasbih1Binding.counterTasbih1.setText("" + count1);

            }
        });

        activityTasbih1Binding.buttonRefrshTasbih1TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1=0;
                activityTasbih1Binding.counterTasbih1.setText("" + count1);

            }
        });
    }
}