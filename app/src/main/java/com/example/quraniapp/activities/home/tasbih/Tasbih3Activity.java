package com.example.quraniapp.activities.home.tasbih;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityTasbih3Binding;

public class Tasbih3Activity extends AppCompatActivity {

    ActivityTasbih3Binding activityTasbih3Binding;
    int count3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih3);


        activityTasbih3Binding = DataBindingUtil.setContentView(this, R.layout.activity_tasbih3);

        activityTasbih3Binding.iconBackTasbih3Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tasbih3Activity.this, TasbihActivity.class));

            }
        });

        activityTasbih3Binding.buttonCountTasbih3TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count3++;
                activityTasbih3Binding.counterTasbih3.setText("" + count3);

            }
        });

        activityTasbih3Binding.buttonRefrshTasbih3TasbihActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count3 = 0;
                activityTasbih3Binding.counterTasbih3.setText("" + count3);

            }
        });
    }
}