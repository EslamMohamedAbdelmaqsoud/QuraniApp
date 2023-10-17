package com.example.quraniapp.activities.home.tasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityTasbih4Binding;

public class Tasbih4Activity extends AppCompatActivity {
    ActivityTasbih4Binding activityTasbih4Binding;
    int count4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih4);


        activityTasbih4Binding = DataBindingUtil.setContentView(this, R.layout.activity_tasbih4);

        activityTasbih4Binding.iconBackTasbih4Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tasbih4Activity.this, TasbihActivity.class));

            }
        });

        activityTasbih4Binding.buttonCountTasbih4TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count4++;
                activityTasbih4Binding.counterTasbih4.setText("" + count4);

            }
        });

        activityTasbih4Binding.buttonRefrshTasbih4TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count4 = 0;
                activityTasbih4Binding.counterTasbih4.setText("" + count4);

            }
        });
    }
}