package com.example.quraniapp.activities.home.tasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityTasbih5Binding;

public class Tasbih5Activity extends AppCompatActivity {

    ActivityTasbih5Binding activityTasbih5Binding;
    int count5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih5);


        activityTasbih5Binding = DataBindingUtil.setContentView(this, R.layout.activity_tasbih5);

        activityTasbih5Binding.iconBackTasbih5Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tasbih5Activity.this, TasbihActivity.class));

            }
        });

        activityTasbih5Binding.buttonCountTasbih5TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count5++;
                activityTasbih5Binding.counterTasbih5.setText("" + count5);

            }
        });

        activityTasbih5Binding.buttonRefrshTasbih5TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count5 = 0;
                activityTasbih5Binding.counterTasbih5.setText("" + count5);

            }
        });
    }
}