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

public class DetailsAzkarActivity1 extends AppCompatActivity {

    ImageView icon_back_DetailsAzkarActivity1;

    private RecyclerView.LayoutManager mLayoutManager;
    private static final String TAG = "NamesAllahActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_azkar1);


        icon_back_DetailsAzkarActivity1 = findViewById(R.id.icon_back_DetailsAzkarActivity1);
        icon_back_DetailsAzkarActivity1.setOnClickListener(v -> {
            startActivity(new Intent(DetailsAzkarActivity1.this, AzkarActivity.class));
            finish();
        });


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(DetailsAzkarActivity1.this);
        RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(la);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<DetailsAzkarActivityModel1> arrayList = new ArrayList<DetailsAzkarActivityModel1>();

        arrayList.add(new DetailsAzkarActivityModel1("( أَصبَحْنا على فِطرةِ الإسلامِ، وعلى كَلِمة ِالإخلاصِ، وعلى دِينِ نَبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّمَ، وعلى مِلَّةِ أبِينا إبراهيمَ، حَنيفًا مُسلِمًا، وما كان مِنَ المُشرِكينَ )."));
        arrayList.add(new DetailsAzkarActivityModel1("( بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ ).( ثلاثُ مراتٍ )."));
        arrayList.add(new DetailsAzkarActivityModel1("( سبحانَ اللَّهِ وبحمدِه لا قوَّةَ إلَّا باللَّهِ/ ما شاءَ اللَّهُ كانَ وما لم يشأ لم يَكن/ أعلمُ أنَّ اللَّهَ على كلِّ شيءٍ قديرٌ وأنَّ اللَّهَ قد أحاطَ بِكلِّ شيءٍ علمًا )/ فإنَّهُ من قالَها حينَ يصبِحُ حُفِظَ حتَّى يمسيَ ومن قالَها حينَ يمسي حُفِظَ حتَّى يصبِحَ."));
        arrayList.add(new DetailsAzkarActivityModel1("( سبحانَ اللَّهِ وبحمدِهِ مئةَ مرَّةٍ )." ));
        arrayList.add(new DetailsAzkarActivityModel1("( اللَّهمَّ بِكَ أصبَحنا، وبِكَ أمسَينا، وبِكَ نحيا وبِكَ نموتُ وإليكَ المصيرُ، وإذا أمسَى فليقُلْ: اللَّهمَّ بِكَ أمسَينا وبِكَ أصبَحنا وبِكَ نحيا وبِكَ نموتُ وإليكَ النُّشور ُ)."));
        arrayList.add(new DetailsAzkarActivityModel1("( رَضيتُ باللَّهِ ربًّا، وبالإسلامِ دينًا، وبِمُحمَّدٍ رسولًا )، من قالها وجبت له الجنة."));
        arrayList.add(new DetailsAzkarActivityModel1("( اللَّهمَّ عالِمَ الغَيبِ والشَّهادةِ، فاطرَ السَّمواتِ والأرضِ، رَبَّ كلِّ شيءٍ ومَليكَهُ، أشهدُ أن لا إلَهَ إلَّا أنتَ، أعوذُ بِكَ مِن شرِّ نفسي وشرِّ الشَّيطانِ وشِركِهِ، قلهُ إذا أصبَحتَ، وإذا أمسَيتَ، وإذا أخَذتَ مَضجعَكَ )." ));
        arrayList.add(new DetailsAzkarActivityModel1("( سُبْحَانَ اللهِ وَبِحَمْدِهِ، عَدَدَ خَلْقِهِ وَرِضَا نَفْسِهِ وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ )، وهي تُقال ثلاث مرات."));
        arrayList.add(new DetailsAzkarActivityModel1("( حَسبيَ اللهُ لا إلهَ إلَّا هو، عليه تَوكَّلْتُ، وهو ربُّ العَرشِ العَظيم ِ)، سَبعَ مراتٍ، فمن قالها كَفاه اللهُ ما أهَمَّه من أمرِ الدُّنيا والآخِرةِ." ));
        arrayList.add(new DetailsAzkarActivityModel1(" ( اللَّهُمَّ إنِّي أصبَحتُ أُشهِدُك، وأُشهِدُ حَمَلةَ عَرشِكَ، ومَلائِكَتَك، وجميعَ خَلقِكَ: أنَّكَ أنتَ اللهُ لا إلهَ إلَّا أنتَ، وأنَّ مُحمَّدًا عبدُكَ ورسولُك َ)."));
        arrayList.add(new DetailsAzkarActivityModel1(" ( أَصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله وَالحَمدُ لله، لا إلهَ إلاّ اللّهُ وَحدَهُ لا شَريكَ لهُ، لهُ المُـلكُ ولهُ الحَمْـد، وهُوَ على كلّ شَيءٍ قدير، رَبِّ أسْـأَلُـكَ خَـيرَ ما في هـذا اليوم وَخَـيرَ ما بَعْـدَه، وَأَعـوذُ بِكَ مِنْ شَـرِّ ما في هـذا اليوم وَشَرِّ ما بَعْـدَه، رَبِّ أَعـوذُ بِكَ مِنَ الْكَسَـلِ وَسـوءِ الْكِـبَر، رَبِّ أَعـوذُ بِكَ مِنْ عَـذابٍ في النّـارِ وَعَـذابٍ في القَـبْر )."));
        arrayList.add(new DetailsAzkarActivityModel1(" اللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ على نَبِيِّنَا مُحمَّد، فقد جاء في الحديث: ( مَن صلى عَلَيَّ حين يُصْبِحُ عَشْرًا، وحين يُمْسِي عَشْرًا أَدْرَكَتْه شفاعتي يومَ القيامةِ )." ));
        arrayList.add(new DetailsAzkarActivityModel1(" ( أستغفرُ اللهَ العظيمَ الذي لا إلهَ إلَّا هو الحيَّ القيومَ وأتوبُ إليه )." ));
        arrayList.add(new DetailsAzkarActivityModel1("اللّهُمّ فِي هَذَا الصباح ارزقنَا الرِّضَا وَالقَناعة بِمَا قَسَمت لنا، وَاجْعَلنا مِن الشّاكرِين لِنعَمك عَلينَا."));
        arrayList.add(new DetailsAzkarActivityModel1(" اللهمّ يا منْ توزعتِ الأرزاق بكرمِه، وتنفس الصُبح بأمره، بلِغنا أسمى مراتب الدُنيا وأعلى منازل الآخِرة." ));
        arrayList.add(new DetailsAzkarActivityModel1(" اللهم لك الحمد حتى ترضى، ولك الحمد إذا رضيت، ولك الحمد بعد الرضى، اللهم لك الحمد عدد خلقك، ورضا نفسك، وزنة عرشك، ومداد كلماتك، اللهم لك الحمد على الإسلام، اللهم لك الحمد على أن هديتنا، اللهم لك الحمد والشكر على جميع النعم التي أنعمت بها علينا."));
        arrayList.add(new DetailsAzkarActivityModel1(" ( اللَّهمَّ إنِّي أسألُكَ خيرَ هذا اليومِ فتحَه، ونصرَه، ونورَه، وبرَكتَه، وَهدايتَهُ، وأعوذُ بِكَ من شرِّ ما فيهِ وشرِّ ما بعدَه )." ));
        arrayList.add(new DetailsAzkarActivityModel1(" ( اللَّهمَّ إنِّي أسألُكَ عِلمًا نافعًا ورزقًا طيِّبًا وعملًا متقبَّلًا )."));



        DetailsazkarAdapter1 adapter = new DetailsazkarAdapter1(DetailsAzkarActivity1.this, arrayList);
        recyclerView.setAdapter(adapter);

    }
}