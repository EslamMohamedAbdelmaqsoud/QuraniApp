package com.example.quraniapp.activities.home.Doah;

import android.animation.LayoutTransition;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.activities.home.HomeActivity;
import com.example.quraniapp.databinding.ActivityDoahBinding;

public class DoahActivity extends AppCompatActivity {

    ActivityDoahBinding activityDoahBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doah);

        activityDoahBinding = DataBindingUtil.setContentView(this, R.layout.activity_doah);

        activityDoahBinding.layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layoutt.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout7.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout8.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout9.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout10.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout11.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout12.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout13.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout14.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout15.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout16.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout17.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout18.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout19.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout20.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout21.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout22.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout23.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout24.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout25.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout26.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout27.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout28.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout29.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout30.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout31.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        activityDoahBinding.layout32.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


        activityDoahBinding.iconBackDoahrActivity.setOnClickListener(v -> {
            startActivity(new Intent(DoahActivity.this, HomeActivity.class));
            finish();
        });

        activityDoahBinding.iconCopyTextdesDoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });

        activityDoahBinding.iconCopyTextdes2DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details2.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });

        activityDoahBinding.iconCopyTextdes3DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details3.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes4DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details4.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes5DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details5.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes6DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details6.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes7DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details7.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes8DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details8.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes9DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details9.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes10DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details10.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes11DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details11.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes12DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details12.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes13DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details13.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes14DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details14.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes15DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details15.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes16DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details16.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes17DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details17.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes18DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details18.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes19DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details19.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });

        activityDoahBinding.iconCopyTextdes20DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details20.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes21DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details21.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes22DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details22.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes23DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details23.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes24DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details24.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes25DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details25.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes26DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details26.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes27DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details27.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes28DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details28.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes29DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details29.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes30DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details30.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes31DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details31.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });
        activityDoahBinding.iconCopyTextdes32DoahActivity.setOnClickListener(view -> {
            ClipboardManager clipboard = (ClipboardManager) getApplication().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("label", activityDoahBinding.details32.getText().toString());
            if (clipboard == null || clip == null) return;
            clipboard.setPrimaryClip(clip);
            Toast.makeText(getApplicationContext(), " تم النسخ " + " ❤️💕 ", Toast.LENGTH_SHORT).show();
        });

    }

    public void expand(View view) {

        int v = (activityDoahBinding.details.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int v1 = (activityDoahBinding.iconCopyTextdesDoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout1, new AutoTransition());
        activityDoahBinding.details.setVisibility(v);
        activityDoahBinding.iconCopyTextdesDoahActivity.setVisibility(v1);

    }

    public void expand2(View view) {
        int a = (activityDoahBinding.details2.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int a1 = (activityDoahBinding.iconCopyTextdes2DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layoutt, new AutoTransition());
        activityDoahBinding.details2.setVisibility(a);
        activityDoahBinding.iconCopyTextdes2DoahActivity.setVisibility(a1);
    }

    public void expand3(View view) {
        int b = (activityDoahBinding.details3.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int b1 = (activityDoahBinding.iconCopyTextdes3DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout3, new AutoTransition());
        activityDoahBinding.details3.setVisibility(b);
        activityDoahBinding.iconCopyTextdes3DoahActivity.setVisibility(b1);
    }

    public void expand4(View view) {
        int c = (activityDoahBinding.details4.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int c1 = (activityDoahBinding.iconCopyTextdes4DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout4, new AutoTransition());
        activityDoahBinding.details4.setVisibility(c);
        activityDoahBinding.iconCopyTextdes4DoahActivity.setVisibility(c1);
    }

    public void expand5(View view) {
        int d = (activityDoahBinding.details5.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int d1 = (activityDoahBinding.iconCopyTextdes5DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout5, new AutoTransition());
        activityDoahBinding.details5.setVisibility(d);
        activityDoahBinding.iconCopyTextdes5DoahActivity.setVisibility(d1);
    }

    public void expand6(View view) {
        int f = (activityDoahBinding.details6.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int f1 = (activityDoahBinding.iconCopyTextdes6DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout6, new AutoTransition());
        activityDoahBinding.details6.setVisibility(f);
        activityDoahBinding.iconCopyTextdes6DoahActivity.setVisibility(f1);
    }

    public void expand7(View view) {
        int g = (activityDoahBinding.details7.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int g1 = (activityDoahBinding.iconCopyTextdes7DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout7, new AutoTransition());
        activityDoahBinding.details7.setVisibility(g);
        activityDoahBinding.iconCopyTextdes7DoahActivity.setVisibility(g1);
    }

    public void expand8(View view) {
        int h = (activityDoahBinding.details8.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int h1 = (activityDoahBinding.iconCopyTextdes8DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout8, new AutoTransition());
        activityDoahBinding.details8.setVisibility(h);
        activityDoahBinding.iconCopyTextdes8DoahActivity.setVisibility(h1);
    }

    public void expand9(View view) {
        int e = (activityDoahBinding.details9.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int e1 = (activityDoahBinding.iconCopyTextdes9DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout9, new AutoTransition());
        activityDoahBinding.details9.setVisibility(e);
        activityDoahBinding.iconCopyTextdes9DoahActivity.setVisibility(e1);
    }

    public void expand10(View view) {
        int r = (activityDoahBinding.details10.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int r1 = (activityDoahBinding.iconCopyTextdes10DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout10, new AutoTransition());
        activityDoahBinding.details10.setVisibility(r);
        activityDoahBinding.iconCopyTextdes10DoahActivity.setVisibility(r1);
    }

    public void expand11(View view) {
        int t = (activityDoahBinding.details11.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int t1 = (activityDoahBinding.iconCopyTextdes11DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout11, new AutoTransition());
        activityDoahBinding.details11.setVisibility(t);
        activityDoahBinding.iconCopyTextdes11DoahActivity.setVisibility(t1);
    }

    public void expand12(View view) {
        int y = (activityDoahBinding.details12.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int y1 = (activityDoahBinding.iconCopyTextdes12DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout12, new AutoTransition());
        activityDoahBinding.details12.setVisibility(y);
        activityDoahBinding.iconCopyTextdes12DoahActivity.setVisibility(y1);
    }

    public void expand13(View view) {
        int u = (activityDoahBinding.details13.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int u1 = (activityDoahBinding.iconCopyTextdes13DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout13, new AutoTransition());
        activityDoahBinding.details13.setVisibility(u);
        activityDoahBinding.iconCopyTextdes13DoahActivity.setVisibility(u1);
    }

    public void expand14(View view) {
        int i = (activityDoahBinding.details14.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int i1 = (activityDoahBinding.iconCopyTextdes14DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout14, new AutoTransition());
        activityDoahBinding.details14.setVisibility(i);
        activityDoahBinding.iconCopyTextdes14DoahActivity.setVisibility(i1);
    }

    public void expand15(View view) {
        int o = (activityDoahBinding.details15.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int o1 = (activityDoahBinding.iconCopyTextdes15DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout15, new AutoTransition());
        activityDoahBinding.details15.setVisibility(o);
        activityDoahBinding.iconCopyTextdes15DoahActivity.setVisibility(o1);
    }

    public void expand16(View view) {
        int p = (activityDoahBinding.details16.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int p1 = (activityDoahBinding.iconCopyTextdes16DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout16, new AutoTransition());
        activityDoahBinding.details16.setVisibility(p);
        activityDoahBinding.iconCopyTextdes16DoahActivity.setVisibility(p1);
    }

    public void expand17(View view) {
        int j = (activityDoahBinding.details17.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int j1 = (activityDoahBinding.iconCopyTextdes17DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout17, new AutoTransition());
        activityDoahBinding.details17.setVisibility(j);
        activityDoahBinding.iconCopyTextdes17DoahActivity.setVisibility(j1);
    }

    public void expand18(View view) {
        int k = (activityDoahBinding.details18.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int k1 = (activityDoahBinding.iconCopyTextdes18DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout18, new AutoTransition());
        activityDoahBinding.details18.setVisibility(k);
        activityDoahBinding.iconCopyTextdes18DoahActivity.setVisibility(k1);
    }

    public void expand19(View view) {
        int l = (activityDoahBinding.details19.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int l1 = (activityDoahBinding.iconCopyTextdes19DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout19, new AutoTransition());
        activityDoahBinding.details19.setVisibility(l);
        activityDoahBinding.iconCopyTextdes19DoahActivity.setVisibility(l1);
    }

    public void expand20(View view) {
        int x = (activityDoahBinding.details20.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int x1 = (activityDoahBinding.iconCopyTextdes20DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout20, new AutoTransition());
        activityDoahBinding.details20.setVisibility(x);
        activityDoahBinding.iconCopyTextdes20DoahActivity.setVisibility(x1);
    }

    public void expand21(View view) {
        int c = (activityDoahBinding.details21.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int c1 = (activityDoahBinding.iconCopyTextdes21DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout21, new AutoTransition());
        activityDoahBinding.details21.setVisibility(c);
        activityDoahBinding.iconCopyTextdes21DoahActivity.setVisibility(c1);
    }

    public void expand22(View view) {
        int b = (activityDoahBinding.details22.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int b1 = (activityDoahBinding.iconCopyTextdes22DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout22, new AutoTransition());
        activityDoahBinding.details22.setVisibility(b);
        activityDoahBinding.iconCopyTextdes22DoahActivity.setVisibility(b1);
    }

    public void expand23(View view) {
        int n = (activityDoahBinding.details23.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int n1 = (activityDoahBinding.iconCopyTextdes23DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout23, new AutoTransition());
        activityDoahBinding.details23.setVisibility(n);
        activityDoahBinding.iconCopyTextdes23DoahActivity.setVisibility(n1);
    }

    public void expand24(View view) {
        int m = (activityDoahBinding.details24.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int m1 = (activityDoahBinding.iconCopyTextdes24DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout24, new AutoTransition());
        activityDoahBinding.details24.setVisibility(m);
        activityDoahBinding.iconCopyTextdes24DoahActivity.setVisibility(m1);
    }

    public void expand25(View view) {
        int qq = (activityDoahBinding.details25.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int qq1 = (activityDoahBinding.iconCopyTextdes25DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout25, new AutoTransition());
        activityDoahBinding.details25.setVisibility(qq);
        activityDoahBinding.iconCopyTextdes25DoahActivity.setVisibility(qq1);
    }

    public void expand26(View view) {
        int ff = (activityDoahBinding.details6.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int ff1 = (activityDoahBinding.iconCopyTextdes26DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout26, new AutoTransition());
        activityDoahBinding.details26.setVisibility(ff);
        activityDoahBinding.iconCopyTextdes26DoahActivity.setVisibility(ff1);
    }

    public void expand27(View view) {
        int fff = (activityDoahBinding.details27.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int fff1 = (activityDoahBinding.iconCopyTextdes27DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout27, new AutoTransition());
        activityDoahBinding.details27.setVisibility(fff);
        activityDoahBinding.iconCopyTextdes27DoahActivity.setVisibility(fff1);
    }

    public void expand28(View view) {
        int fa = (activityDoahBinding.details28.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int fa1 = (activityDoahBinding.iconCopyTextdes28DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout28, new AutoTransition());
        activityDoahBinding.details28.setVisibility(fa);
        activityDoahBinding.iconCopyTextdes28DoahActivity.setVisibility(fa1);
    }

    public void expand29(View view) {
        int fd = (activityDoahBinding.details29.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int fd1 = (activityDoahBinding.iconCopyTextdes29DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout29, new AutoTransition());
        activityDoahBinding.details29.setVisibility(fd);
        activityDoahBinding.iconCopyTextdes29DoahActivity.setVisibility(fd1);
    }

    public void expand30(View view) {
        int fg = (activityDoahBinding.details30.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int fg1 = (activityDoahBinding.iconCopyTextdes30DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout30, new AutoTransition());
        activityDoahBinding.details30.setVisibility(fg);
        activityDoahBinding.iconCopyTextdes30DoahActivity.setVisibility(fg1);
    }

    public void expand31(View view) {
        int fx = (activityDoahBinding.details31.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int fx1 = (activityDoahBinding.iconCopyTextdes31DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout31, new AutoTransition());
        activityDoahBinding.details31.setVisibility(fx);
        activityDoahBinding.iconCopyTextdes31DoahActivity.setVisibility(fx1);
    }

    public void expand32(View view) {
        int fb = (activityDoahBinding.details32.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        int fb1 = (activityDoahBinding.iconCopyTextdes32DoahActivity.getVisibility() == View.GONE) ? view.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(activityDoahBinding.layout32, new AutoTransition());
        activityDoahBinding.details32.setVisibility(fb);
        activityDoahBinding.iconCopyTextdes32DoahActivity.setVisibility(fb1);
    }
}