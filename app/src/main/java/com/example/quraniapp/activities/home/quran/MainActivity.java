package com.example.quraniapp.activities.home.quran;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quraniapp.R;
import com.example.quraniapp.adapter.SurahAdapter;
import com.example.quraniapp.common.Common;
import com.example.quraniapp.activities.home.HomeActivity;
import com.example.quraniapp.listener.SurahListener;
import com.example.quraniapp.model.Surah;
import com.example.quraniapp.viewmodel.SurahViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SurahListener {

    ImageView icon_back_QuranActivity;
    private RecyclerView recyclerView;
    private SurahAdapter surahAdapter;
    private List<Surah> list;
    private SurahViewModel surahViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().hide();
//        }

        icon_back_QuranActivity = findViewById(R.id.icon_back_QuranActivity);
        icon_back_QuranActivity.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
            finish();
        });


        recyclerView = findViewById(R.id.surahRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        surahViewModel = new ViewModelProvider(this).get(SurahViewModel.class);
        surahViewModel.getSurah().observe(this, surahResponse -> {

            Log.d("iii", "onCreate: " + surahResponse.getList().size());

            for (int i = 0; i < surahResponse.getList().size(); i++) {
                list.add(new Surah(surahResponse.getList().get(i).getNumber(),
                        String.valueOf(surahResponse.getList().get(i).getName()),
                        String.valueOf(surahResponse.getList().get(i).getEnglishName()),
                        String.valueOf(surahResponse.getList().get(i).getEnglishNameTranslation()),
                        surahResponse.getList().get(i).getNumberOfAyahs(),
                        String.valueOf(surahResponse.getList().get(i).getRevelationType())

                ));
            }

            if (list.size() != 0) {
                surahAdapter = new SurahAdapter(this, list, this::onSurahListener);
                recyclerView.setAdapter(surahAdapter);
                surahAdapter.notifyDataSetChanged();
            }

        });

    }

    @Override
    public void onSurahListener(int position) {
        Intent intent = new Intent(MainActivity.this, SurahDetailActivity.class);
        intent.putExtra(Common.SURAH_NO, list.get(position).getNumber());
        intent.putExtra(Common.SURAH_NAME, list.get(position).getName());
        intent.putExtra(Common.SURAH_TOTAL_AYA, list.get(position).getNumberOfAyahs());
        intent.putExtra(Common.SURAH_TYPE, list.get(position).getRevelationType());
        intent.putExtra(Common.SURAH_TRANSLATION, list.get(position).getEnglishNameTranslation());
        startActivity(intent);
    }
}