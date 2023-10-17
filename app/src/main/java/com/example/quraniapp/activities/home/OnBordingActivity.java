package com.example.quraniapp.activities.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.databinding.ActivityOnBordingBinding;

public class OnBordingActivity extends AppCompatActivity {


    //databinding
    ActivityOnBordingBinding activityOnBordingBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_on_bording);

        //databinding
        activityOnBordingBinding = DataBindingUtil.setContentView(this, R.layout.activity_on_bording);


        activityOnBordingBinding.buttonSignInOnBordingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(OnBordingActivity.this, SignInActivity.class));

                // animation layout
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });


        activityOnBordingBinding.buttonSignUpOnBordingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(OnBordingActivity.this, SignUPActivity.class));

                // animation layout
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

    }
}