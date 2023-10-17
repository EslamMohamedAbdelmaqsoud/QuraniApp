package com.example.quraniapp.activities.home;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quraniapp.R;
import com.skyfishjy.library.RippleBackground;

public class SplashActivity extends AppCompatActivity {

    ProgressBar splashProgress;
    int SPLASH_TIME = 3000; //This is 4600 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content);
        if (!rippleBackground.isRippleAnimationRunning()) {
            //phone_icon.setColorFilter(Color.argb(255, 255, 255, 255)); //change the logo color while staring animation
            rippleBackground.startRippleAnimation(); //starting the animation
        }

        splashProgress = findViewById(R.id.splashProgress);
//        splashProgress.setProgressTintList(ColorStateList.valueOf(Color.WHITE));
        playProgress();

        //Code to start timer and take action after the timer ends
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(SplashActivity.this, OnBordingActivity.class);
                startActivity(mySuperIntent);

                //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
                finish();

            }
        }, SPLASH_TIME);
    }

    //Method to run progress bar for 5 seconds
    private void playProgress() {

        ObjectAnimator.ofInt(splashProgress, "progress", 100)
                .setDuration(3000)
                .start();
    }
}