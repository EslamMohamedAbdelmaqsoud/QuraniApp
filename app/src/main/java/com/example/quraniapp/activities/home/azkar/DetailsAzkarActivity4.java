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

public class DetailsAzkarActivity4 extends AppCompatActivity {

    ImageView icon_back_DetailsAzkarActivity4;

    private RecyclerView.LayoutManager mLayoutManager;
    private static final String TAG = "NamesAllahActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_azkar4);


        icon_back_DetailsAzkarActivity4 = findViewById(R.id.icon_back_DetailsAzkarActivity4);
        icon_back_DetailsAzkarActivity4.setOnClickListener(v -> {
            startActivity(new Intent(DetailsAzkarActivity4.this, AzkarActivity.class));
            finish();
        });


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(DetailsAzkarActivity4.this);
        RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(la);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<DetailsAzkarActivityModel1> arrayList = new ArrayList<DetailsAzkarActivityModel1>();

        arrayList.add(new DetailsAzkarActivityModel1("بِاسْمِكَ رَبِّـي وَضَعْـتُ جَنْـبي ، وَبِكَ أَرْفَعُـه، فَإِن أَمْسَـكْتَ نَفْسـي فارْحَـمْها ، وَإِنْ أَرْسَلْتَـها فاحْفَظْـها بِمـا تَحْفَـظُ بِه عِبـادَكَ الصّـالِحـين. "));
        arrayList.add(new DetailsAzkarActivityModel1("اللّهُـمَّ إِنَّـكَ خَلَـقْتَ نَفْسـي وَأَنْـتَ تَوَفّـاهـا لَكَ ممَـاتـها وَمَحْـياها ، إِنْ أَحْيَيْـتَها فاحْفَظْـها ، وَإِنْ أَمَتَّـها فَاغْفِـرْ لَـها . اللّهُـمَّ إِنَّـي أَسْـأَلُـكَ العـافِـيَة. "));
        arrayList.add(new DetailsAzkarActivityModel1("اللّهُـمَّ قِنـي عَذابَـكَ يَـوْمَ تَبْـعَثُ عِبـادَك. "));
        arrayList.add(new DetailsAzkarActivityModel1("بِاسْـمِكَ اللّهُـمَّ أَمـوتُ وَأَحْـيا. "));
        arrayList.add(new DetailsAzkarActivityModel1("الـحَمْدُ للهِ الَّذي أَطْـعَمَنا وَسَقـانا، وَكَفـانا، وَآوانا، فَكَـمْ مِمَّـنْ لا كـافِيَ لَـهُ وَلا مُـؤْوي. "));
        arrayList.add(new DetailsAzkarActivityModel1("اللّهُـمَّ عالِـمَ الغَـيبِ وَالشّـهادةِ فاطِـرَ السّماواتِ وَالأرْضِ رَبَّ كُـلِّ شَـيءٍ وَمَليـكَه، أَشْهـدُ أَنْ لا إِلـهَ إِلاّ أَنْت، أَعـوذُ بِكَ مِن شَـرِّ نَفْسـي، وَمِن شَـرِّ الشَّيْـطانِ وَشِـرْكِه، وَأَنْ أَقْتَـرِفَ عَلـى نَفْسـي سوءاً أَوْ أَجُـرَّهُ إِلـى مُسْـلِم . "));
        arrayList.add(new DetailsAzkarActivityModel1("اللّهُـمَّ أَسْـلَمْتُ نَفْـسي إِلَـيْكَ، وَفَوَّضْـتُ أَمْـري إِلَـيْكَ، وَوَجَّـهْتُ وَجْـهي إِلَـيْكَ، وَأَلْـجَـاْتُ ظَهـري إِلَـيْكَ، رَغْبَـةً وَرَهْـبَةً إِلَـيْكَ، لا مَلْجَـأَ وَلا مَنْـجـا مِنْـكَ إِلاّ إِلَـيْكَ، آمَنْـتُ بِكِتـابِكَ الّـذي أَنْزَلْـتَ وَبِنَبِـيِّـكَ الّـذي أَرْسَلْـت. "));
        arrayList.add(new DetailsAzkarActivityModel1("سُبْحَانَ اللَّهِ, الْحَمْدُ لِلَّهِ, اللَّهُ أَكْبَرُ. "));
        arrayList.add(new DetailsAzkarActivityModel1("يجمع كفيه ثم ينفث فيهما والقراءة فيهما\u200F:\u200F \u200F{\u200Fقل هو الله أحد\u200F}\u200F و\u200F{\u200Fقل أعوذ برب الفلق\u200F}\u200F و\u200F{\u200Fقل أعوذ برب الناس\u200F}\u200F ومسح ما استطاع من الجسد يبدأ بهما على رأسه ووجه وما أقبل من جسده. "));
        arrayList.add(new DetailsAzkarActivityModel1("آية الكرسى: أَعُوذُ بِاللهِ مِنْ الشَّيْطَانِ الرَّجِيمِ\n" +
                "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَن ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلاَّ بِمَا شَاء وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ. [البقرة 255]"));
        arrayList.add(new DetailsAzkarActivityModel1("\"\u200Fأعوذ بكلمات الله التامة من غضبه وشر عباده، ومن همزات الشياطين وأن يحضرون\u200F\""));


        DetailsazkarAdapter1 adapter = new DetailsazkarAdapter1(DetailsAzkarActivity4.this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}