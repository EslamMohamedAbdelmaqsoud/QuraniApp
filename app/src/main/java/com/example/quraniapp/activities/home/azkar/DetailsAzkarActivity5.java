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

public class DetailsAzkarActivity5 extends AppCompatActivity {

    ImageView icon_back_DetailsAzkarActivity5;

    private RecyclerView.LayoutManager mLayoutManager;
    private static final String TAG = "NamesAllahActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_azkar5);


        icon_back_DetailsAzkarActivity5 = findViewById(R.id.icon_back_DetailsAzkarActivity5);
        icon_back_DetailsAzkarActivity5.setOnClickListener(v -> {
            startActivity(new Intent(DetailsAzkarActivity5.this, AzkarActivity.class));
            finish();
        });


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(DetailsAzkarActivity5.this);
        RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(la);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<DetailsAzkarActivityModel1> arrayList = new ArrayList<DetailsAzkarActivityModel1>();

        arrayList.add(new DetailsAzkarActivityModel1("أَسْـتَغْفِرُ الله، أَسْـتَغْفِرُ الله، أَسْـتَغْفِرُ الله.\n" +
                "اللّهُـمَّ أَنْـتَ السَّلامُ ، وَمِـنْكَ السَّلام ، تَبارَكْتَ يا ذا الجَـلالِ وَالإِكْـرام . "));
        arrayList.add(new DetailsAzkarActivityModel1("لا إلهَ إلاّ اللّهُ وحدَهُ لا شريكَ لهُ، لهُ المُـلْكُ ولهُ الحَمْد، وهوَ على كلّ شَيءٍ قَدير، اللّهُـمَّ لا مانِعَ لِما أَعْطَـيْت، وَلا مُعْطِـيَ لِما مَنَـعْت، وَلا يَنْفَـعُ ذا الجَـدِّ مِنْـكَ الجَـد."));
        arrayList.add(new DetailsAzkarActivityModel1("لا إلهَ إلاّ اللّه, وحدَهُ لا شريكَ لهُ، لهُ الملكُ ولهُ الحَمد، وهوَ على كلّ شيءٍ قدير، لا حَـوْلَ وَلا قـوَّةَ إِلاّ بِاللهِ، لا إلهَ إلاّ اللّـه، وَلا نَعْـبُـدُ إِلاّ إيّـاه, لَهُ النِّعْـمَةُ وَلَهُ الفَضْل وَلَهُ الثَّـناءُ الحَـسَن، لا إلهَ إلاّ اللّهُ مخْلِصـينَ لَـهُ الدِّينَ وَلَوْ كَـرِهَ الكـافِرون."));
        arrayList.add(new DetailsAzkarActivityModel1("سُـبْحانَ اللهِ، والحَمْـدُ لله ، واللهُ أكْـبَر. "));
        arrayList.add(new DetailsAzkarActivityModel1("لا إلهَ إلاّ اللّهُ وَحْـدَهُ لا شريكَ لهُ، لهُ الملكُ ولهُ الحَمْد، وهُوَ على كُلّ شَيءٍ قَـدير. "));
        arrayList.add(new DetailsAzkarActivityModel1("بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ هُوَ ٱللَّهُ أَحَدٌ، ٱللَّهُ ٱلصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ.\n" +
                "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقِ، مِن شَرِّ مَا خَلَقَ، وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ، وَمِن شَرِّ ٱلنَّفَّٰثَٰتِ فِى ٱلْعُقَدِ، وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ.\n" +
                "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ، مَلِكِ ٱلنَّاسِ، إِلَٰهِ ٱلنَّاسِ، مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسِ، ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسِ، مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ.\n" +
                "ثلاث مرات بعد صلاتي الفجر والمغرب. ومرة بعد الصلوات الأخرى."));
        arrayList.add(new DetailsAzkarActivityModel1("أَعُوذُ بِاللهِ مِنْ الشَّيْطَانِ الرَّجِيمِ\n" +
                "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَن ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلاَّ بِمَا شَاء وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ. [آية الكرسى - البقرة 255] "));
        arrayList.add(new DetailsAzkarActivityModel1("لا إلهَ إلاّ اللّهُ وحْـدَهُ لا شريكَ لهُ، لهُ المُلكُ ولهُ الحَمْد، يُحيـي وَيُمـيتُ وهُوَ على كُلّ شيءٍ قدير. \n" +
                "عَشْر مَرّات بَعْدَ المَغْرِب وَالصّـبْح."));
        arrayList.add(new DetailsAzkarActivityModel1("اللّهُـمَّ إِنِّـي أَسْأَلُـكَ عِلْمـاً نافِعـاً وَرِزْقـاً طَيِّـباً ، وَعَمَـلاً مُتَقَـبَّلاً. \n" +
                "بَعْد السّلامِ من صَلاةِ الفَجْر."));
        arrayList.add(new DetailsAzkarActivityModel1("اللَّهُمَّ أَجِرْنِي مِنْ النَّار. \n" +
                "بعد صلاة الصبح والمغرب."));
        arrayList.add(new DetailsAzkarActivityModel1("اللَّهُمَّ أَعِنِّي عَلَى ذِكْرِكَ وَشُكْرِكَ وَحُسْنِ عِبَادَتِكَ. "));


        DetailsazkarAdapter1 adapter = new DetailsazkarAdapter1(DetailsAzkarActivity5.this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}