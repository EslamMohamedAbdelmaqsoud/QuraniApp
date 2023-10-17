package com.example.quraniapp.activities.home.azkar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.quraniapp.R;
import com.example.quraniapp.adapter.DetailsazkarAdapter1;
import com.example.quraniapp.model.DetailsAzkarActivityModel1;

import java.util.ArrayList;

public class DetailsAzkarActivity3 extends AppCompatActivity {

    ImageView icon_back_DetailsAzkarActivity3;

    private RecyclerView.LayoutManager mLayoutManager;
    private static final String TAG = "NamesAllahActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_azkar3);


        icon_back_DetailsAzkarActivity3 = findViewById(R.id.icon_back_DetailsAzkarActivity3);
        icon_back_DetailsAzkarActivity3.setOnClickListener(v -> {
            startActivity(new Intent(DetailsAzkarActivity3.this, AzkarActivity.class));
            finish();
        });


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(DetailsAzkarActivity3.this);
        RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(la);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<DetailsAzkarActivityModel1> arrayList = new ArrayList<DetailsAzkarActivityModel1>();

        arrayList.add(new DetailsAzkarActivityModel1("الحَمْـدُ لِلّهِ الّذي أَحْـيانا بَعْـدَ ما أَماتَـنا وَإليه النُّـشور. "));
        arrayList.add(new DetailsAzkarActivityModel1("الحمدُ للهِ الذي عافاني في جَسَدي وَرَدّ عَليّ روحي وَأَذِنَ لي بِذِكْرِه. "));
        arrayList.add(new DetailsAzkarActivityModel1("لا إلهَ إلاّ اللّهُ وَحْـدَهُ لا شَـريكَ له، لهُ المُلـكُ ولهُ الحَمـد، وهوَ على كلّ شيءٍ قدير، سُـبْحانَ اللهِ، والحمْـدُ لله ، ولا إلهَ إلاّ اللهُ واللهُ أكبَر، وَلا حَولَ وَلا قوّة إلاّ باللّهِ العليّ العظيم. رَبِّ اغْفرْ لي. "));


        DetailsazkarAdapter1 adapter = new DetailsazkarAdapter1(DetailsAzkarActivity3.this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}