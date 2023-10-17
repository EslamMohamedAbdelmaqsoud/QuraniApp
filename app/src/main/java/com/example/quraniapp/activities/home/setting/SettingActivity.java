package com.example.quraniapp.activities.home.setting;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.activities.home.HomeActivity;
import com.example.quraniapp.activities.home.SignInActivity;
import com.example.quraniapp.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {


    AlertDialog.Builder builder;

    ActivitySettingBinding activitySettingBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        activitySettingBinding = DataBindingUtil.setContentView(this, R.layout.activity_setting);

        activitySettingBinding.iconBackSettingActivity.setOnClickListener(v -> {

            startActivity(new Intent(SettingActivity.this, HomeActivity.class));
            finish();
        });


        activitySettingBinding.cardviewLanguageSettingActivity.setOnClickListener(v -> {

            startActivity(new Intent(SettingActivity.this, LanguageSettingActivity.class));
            finish();
            Toast.makeText(getApplicationContext(), "In the next update", Toast.LENGTH_SHORT).show();

        });

        activitySettingBinding.cardviewThemeSettingActivity.setOnClickListener(v -> {

            startActivity(new Intent(SettingActivity.this, ThemeSettingActivity.class));
            finish();
            Toast.makeText(getApplicationContext(), "In the next update", Toast.LENGTH_SHORT).show();

        });


        builder = new AlertDialog.Builder(SettingActivity.this);
        activitySettingBinding.cardviewLogoutSettingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences(SignInActivity.signinCredentials, getApplication().MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                // Alert dialog Logout
                builder.setTitle("Alert!").setMessage("هل انت متاكد من تسجيل الخروج؟").setCancelable(true).setIcon(R.drawable.alert1)
                        .setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                startActivity(new Intent(SettingActivity.this, SignInActivity.class));
                                finish();

                            }
                        }).setNegativeButton("لا", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        }).show();


            }
        });

    }

}
