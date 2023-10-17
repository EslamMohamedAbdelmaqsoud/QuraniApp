package com.example.quraniapp.activities.home.learnablution;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.activities.home.HomeActivity;
import com.example.quraniapp.databinding.ActivityLearnAblutionBinding;

public class LearnAblutionActivity extends AppCompatActivity {

    ActivityLearnAblutionBinding activityLearnAblutionBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityLearnAblutionBinding = DataBindingUtil.setContentView(this, R.layout.activity_learn_ablution);

        activityLearnAblutionBinding.iconBackLearnAblutionActivity.setOnClickListener(v -> {

            startActivity(new Intent(LearnAblutionActivity.this, HomeActivity.class));
            finish();
        });


    }
}