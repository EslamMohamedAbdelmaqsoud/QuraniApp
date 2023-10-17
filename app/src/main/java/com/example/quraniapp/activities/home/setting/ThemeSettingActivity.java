package com.example.quraniapp.activities.home.setting;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityThemeSettingBinding;

public class ThemeSettingActivity extends AppCompatActivity {

    ActivityThemeSettingBinding activityThemeSettingBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityThemeSettingBinding = DataBindingUtil.setContentView(this, R.layout.activity_theme_setting);

        activityThemeSettingBinding.iconBackThemeSettingActivity.setOnClickListener(v -> {

            startActivity(new Intent(ThemeSettingActivity.this, SettingActivity.class));
            finish();

        });
    }
}