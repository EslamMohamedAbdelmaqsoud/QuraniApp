package com.example.quraniapp.activities.home.setting;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityLanguageSettingBinding;

public class LanguageSettingActivity extends AppCompatActivity {

    ActivityLanguageSettingBinding activityLanguageSettingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityLanguageSettingBinding = DataBindingUtil.setContentView(this, R.layout.activity_language_setting);

        activityLanguageSettingBinding.iconBackLanguageSettingActivity.setOnClickListener(v -> {

            startActivity(new Intent(LanguageSettingActivity.this, SettingActivity.class));
            finish();

        });
    }
}