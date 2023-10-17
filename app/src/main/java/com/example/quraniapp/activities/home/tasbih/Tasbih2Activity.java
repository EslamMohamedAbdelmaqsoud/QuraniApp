package com.example.quraniapp.activities.home.tasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityTasbih2Binding;

public class Tasbih2Activity extends AppCompatActivity {

    ActivityTasbih2Binding activityTasbih2Binding;
    int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih1);


        activityTasbih2Binding = DataBindingUtil.setContentView(this, R.layout.activity_tasbih2);

        activityTasbih2Binding.iconBackTasbih2Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tasbih2Activity.this, TasbihActivity.class));

            }
        });

        activityTasbih2Binding.buttonCountTasbih2TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count2++;
                activityTasbih2Binding.counterTasbih2.setText("" + count2);

            }
        });

        activityTasbih2Binding.buttonRefrshTasbih2TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count2 = 0;
                activityTasbih2Binding.counterTasbih2.setText("" + count2);

            }
        });
    }
}