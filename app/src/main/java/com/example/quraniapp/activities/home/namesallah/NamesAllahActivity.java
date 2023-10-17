package com.example.quraniapp.activities.home.namesallah;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quraniapp.R;
import com.example.quraniapp.adapter.NamesAllahAdapter;
import com.example.quraniapp.activities.home.HomeActivity;
import com.example.quraniapp.model.NameAllahModel;

import java.util.ArrayList;

public class NamesAllahActivity extends AppCompatActivity {

    ImageView icon_back_NamesAllahActivity;

    private RecyclerView.LayoutManager mLayoutManager;
    private static final String TAG = "NamesAllahActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names_allah);

        icon_back_NamesAllahActivity = findViewById(R.id.icon_back_NamesAllahActivity);
        icon_back_NamesAllahActivity.setOnClickListener(v -> {
            startActivity(new Intent(NamesAllahActivity.this, HomeActivity.class));
            finish();
        });


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(NamesAllahActivity.this);
        /* RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);*/
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<NameAllahModel> arrayList = new ArrayList<NameAllahModel>();
        arrayList.add(new NameAllahModel("اللَّهُ", "0", "وهو الاسم الأعظم الذي تفرد به الحق سبحانه وخص به نفسه وجعله أول أسمائه، وأضافها كلها إليه فهو علم على ذاته سبحانه", "Allah"));
        arrayList.add(new NameAllahModel("الرَّحْمَنُ ", "1", "كثير الرحمة وهو اسم مقصور على الله عز وجل ولا يجوز أن يقال رحمن لغير الله، وذلك لأن رحمته وسعت كل شيء وهو أرحم الراحمين", "Ar-Rahman"));
        arrayList.add(new NameAllahModel("الرَّحِيم", "2", "هو المنعم أبدا، المتفضل دوما، فرحمته لا تنتهي", "Ar-Rahim"));
        arrayList.add(new NameAllahModel("المَلِك", "3", "هو الله، ملك الملوك، له الملك، وهو مالك يوم الدين، ومليك الخلق فهو المالك المطلق", "Al-Malik"));
        arrayList.add(new NameAllahModel("الْقُدُّوس", "4", "هو الطاهر المنزه عن العيوب والنقائص وعن كل ما تحيط به العقول", "Al-Quddus"));
        arrayList.add(new NameAllahModel("السَّلَام", "5", "هو ناشر السلام بين الأنام وهو الذي سلمت ذاته من النقص والعيب والفناء", "As-Salam"));
        arrayList.add(new NameAllahModel("المُؤْمِن", "6", "هو الذي سلم أوليائه من عذابه، والذي يصدق عباده ما وعدهم", "Al-Mu'min"));
        arrayList.add(new NameAllahModel("الْمُهَيْمِن", "7", "هو الرقيب الحافظ لكل شيء، القائم على خلقه بأعمالهم، وأرزاقهم وآجالهم، والمطلع على خفايا الأمور وخبايا الصدور", "Al-Muhaymin"));
        arrayList.add(new NameAllahModel("الْعَزِيز", "8", "هو المنفرد بالعزة، الظاهر الذي لا يقهر، القوي الممتنع فلا يغلبه شيء وهو غالب كل شيء", "Al-Aziz"));
        arrayList.add(new NameAllahModel("الْجَبَّار", "9", "هو الذي تنفذ مشيئته، ولا يخرج أحد عن تقديره، وهو القاهر لخلقه على ما أراد", "Al-Jabbar"));
        arrayList.add(new NameAllahModel("الْمُتَكَبِّر", "10", "صاحب الذات العظيمة. المتعالى عن صفات الخلق المنفرد بالعظمة والكبرياء.", "Al-Mutakabbir"));
        arrayList.add(new NameAllahModel("الْخَالِق", "11", "من يخلق كافة الموجودات في الكونالفاطر المبدع لكل شيء، والمقدر له والموجد للأشياء من العدم، فهو خالق كل صانع وصنعته.", "Al-Khaliq"));
        arrayList.add(new NameAllahModel("الْبَارِئ", "12", "خلق الخلق بقدرته لا عن مثال سابق، القادر على إبراز ما قدره إلى الوجود.", "Al-Bari'"));
        arrayList.add(new NameAllahModel("الْمُصَوِّر", "13", "صور جميع الموجودات، ورتبها فأعطى كل شيء منها صورة خاصة، وهيئة منفردة، يتميز بها على اختلافها وكثرتها.", "Al-Musawwir"));
        arrayList.add(new NameAllahModel("اَلْغَفَّار", "14", "وحده الذي يغفر الذنوب ويستر العيوب في الدنيا والآخرة.", "Al-Ghaffar"));
        arrayList.add(new NameAllahModel("الْقَهَّار", "15", "الغالب الذي قهر خلقه بسلطانه وقدرته، وخضعت له الرقاب وذلت له الجبابرة، وصرف خلقه على ما أراد طوعا وكرها، وعنت الوجوه له.", "Al-Qahhar"));
        arrayList.add(new NameAllahModel("الْوَهَّاب", "16", "المنعم على العباد، الذي يهب بغير عوض ويعطي الحاجة بغير سؤال، كثير النعم، دائم العطاء.", "Al-Wahhab"));
        arrayList.add(new NameAllahModel("الرَّزَّاق", "17", "خلق الأرزاق وأعطى كل الخلائق أرزاقها، ويمد كل كائن لما يحتاجه، ويحفظ عليه حياته ويصلحه.", "Ar-Razzaq"));
        arrayList.add(new NameAllahModel("الْفَتَّاح", "18", "يفتح مغلق الأمور، ويسهل العسير، وبيده مفاتيح السماوات والأرض.", "Al-Fattah"));
        arrayList.add(new NameAllahModel("الْعَلِيم", "19", "يعلم تفاصيل الأمور، ودقائق الأشياء وخفايا الضمائر، والنفوس، لا يعزب عنه مثقال ذرة، فعلمه يحيط بجميع الأشياء.", "Al-`Alim"));
        arrayList.add(new NameAllahModel("الْقَابِضُ", "20", "يقبض الرزق عمن يشاء من الخلق بعدله وحكمته.", "Al-Qabid"));
        arrayList.add(new NameAllahModel("الْبَاسِطُ", "21", "يوسع الرزق لمن يشاء من عباده بجوده ورحمته.", "Al-Basit"));
        arrayList.add(new NameAllahModel("الخَافِض", "22", "يخفض الأذلال لكل من طغى وتجبر وخرج على شريعته وتمرد.", "Al-Khafid"));
        arrayList.add(new NameAllahModel("الرَّافِعُ", "23", "يرفع عباده المؤمنين بالطاعات ويرفعهم على عدوهم فينصرهم وهو رافع السماوات السبع.", "Ar-Rafi"));
        arrayList.add(new NameAllahModel("المُعِز", "24", "يرفع شأن من تمسك بدينه. يهب القوة والغلبة والشدة لمن شاء فيعزه.", "Al-Muqit"));
        arrayList.add(new NameAllahModel("المُذِل", "25", "يذل الأعداء والعاصين. ينزع القوة والغلبة والشدة عمن يشاء فيذله.", "Al-Mudhill"));
        arrayList.add(new NameAllahModel("السَّمِيعُ", "26", "سمعه لجميع الأصوات الظاهرة والباطنة الخفية والجلية، وإحاطته التامة بها، ومعناه أيضًا: سمع الإجابة منه للسائلين والداعين والعابدين فيجيبهم ويثيبهم.", "As-Sami"));
        arrayList.add(new NameAllahModel("الْبَصِير", "27", "يرى الأشياء كلها ظاهرها وباطنها وهو المحيط بكل شيء علماً.", "Al-Basir"));
        arrayList.add(new NameAllahModel("الْحَكَم", "28", "يفصل بين مخلوقاته بما شاء ويفصل بين الحق والباطل لا راد لقضائه ولا معقب لحكمه.", "Al-Hakam"));
        arrayList.add(new NameAllahModel("العَدْل", "29", "حرم الظلم على نفسه، وجعله على عباده محرما، فهو المنزه عن الظلم والجور في أحكامه وأفعاله الذي يعطي كل ذي حق حقه.", "Al-`Adl"));
        arrayList.add(new NameAllahModel("اللَّطِيفُ", "30", "البر الرفيق بعباده، يرزق وييسر ويحسن إليهم، ويرفق بهم ويتفضل عليهم.", "Al-Latif"));
        arrayList.add(new NameAllahModel("الْخَبِيرُ", "31", "العليم بدقائق الأمور، لا تخفى عليه خافية، ولا يغيب عن علمه شيء فهو العالم بما كان ويكون.", "Al-Kabir"));
        arrayList.add(new NameAllahModel("الْحَلِيمُ", "32", "الصبور الذي يمهل ولا يهمل، ويستر الذنوب، ويؤخر العقوبة، فيرزق العاصي كما يرزق المطيع.", "Al-Halim"));
        arrayList.add(new NameAllahModel("الْعَظِيمُ", "33", "لعظيم في كل شئ، عظيم في ذاته وأسمائه وصفاته، عظيم في رحمته، عظيم في قدرته، عظيم في حكمته، عظيم في جبروته وكبريائه، عظيم في هبته وعطائه، عظيم في خبرته ولطفه، عظيم في بره وإحسانه، عظيم في عزته وعدله وحمده، فهو العظيم المطلق، فلا أحد يساويه، ولاعظيم يدانيه.", "Al-Azim"));
        arrayList.add(new NameAllahModel("الْغَفُورُ", "34", "الساتر لذنوب عباده المتجاوز عن خطاياهم وذنوبهم. الفرق بين هذا الاسم واسم الغفار أن اسم الغفور يكون للدلالة على مغفرة الذنب مهما عظم وأيس صاحبه من المغفرة أما الغفار فتدل على مغفرة الله المستمرة للذنوب المختلفة لأن الإنسان خطاء فالله غفار.", "Al-Ghafur"));
        arrayList.add(new NameAllahModel("الشَّكُورُ", "35", "يزكو عنده القليل من أعمال العباد، فيتقبلها ويضاعف أجرها.", "Ash-Shakur"));
        arrayList.add(new NameAllahModel("الْعَلِيُّ", "36", "الرفيع القدر فلا يحيط به وصف الواصفين المتعالي عن الأنداد والأضداد، فكل معاني العلو ثابتة له ذاتا وقهرا وشأنا.", "Al-Ali"));
        arrayList.add(new NameAllahModel("الْكَبِيرُ", "37", "لا تستطيع الحواس والعقول إدراكه. العظيم الجليل ذو الكبرياء في صفاته وأفعاله فلا يحتاج إلى شيء ولا يعجزه شيء (ليس كمثله شيء).", "Al-Khabir"));
        arrayList.add(new NameAllahModel("الْحَفِيظُ", "38", "يحفظ الكون والعباد، ونظامهم، و الأعمال من أجل الحساب. لا يغرب عن حفظه شيء ولو كمثقال الذر فحفظه لا يتبدل ولا يزول ولا يعتريه التبديل.", "Al-Hafiz"));
        arrayList.add(new NameAllahModel("المُقِيت", "39", "المتكفل بإيصال أقوات الخلق إليهم وهو الحفيظ والمقتدر والقدير والمقدر والممدد.", "Al-Mu'id"));//Doubt
        arrayList.add(new NameAllahModel("الْحَسِيبُ", "40", "الكافي الذي منه كفاية العباد وهو الذي عليه الاعتماد يكفي العباد بفضله.", "Al-Hasib"));
        arrayList.add(new NameAllahModel("الجَلِيل", "41", "العظيم المطلق المتصف بجميع صفات الكمال والمنعوت بكمالها المنزه عن كل نقص.", "Al-Jalil"));
        arrayList.add(new NameAllahModel("الْكَرِيمُ", "42", "الكثير الخير الجواد المعطي الذي لا ينفذ عطاؤه وهو الكريم المطلق الجامع لأنواع الخير والشرف والفضائل المحمود بفعاله.", "Al-Karim"));
        arrayList.add(new NameAllahModel("الرَّقِيبُ", "43", "الرقيب الذي يراقب أحوال العباد ويعلم أقوالهم ويحصي أعمالهم وهو الحافظ الذي لا يغيب عنه شيء.", "Ar-Raqib"));
        arrayList.add(new NameAllahModel("الْمُجِيبُ", "44", "يجيب دعاء من دعاه، وسؤال من سأله، ويقابله بالعطاء والقبول، ولا يسأل أحد سواه.", "Al-Mujib"));
        arrayList.add(new NameAllahModel("الْوَاسِعُ", "45", "وسع رزقه جميع خلقه، عمت رحمته كل شيء و وسع علمه كل شيء.", "Al-Wasi"));
        arrayList.add(new NameAllahModel("اَلْحَكِيمُ", "46 ", "لمحق في تدبيره اللطيف في تقديره الخبير بحقائق الأمور العليم بحكمه المقدور فجميع خلقه وقضاه خير وحكمة وعدل.", "Al-Hakim"));
        arrayList.add(new NameAllahModel("الْوَدُودُ", "47", "المحسن و المحب لعباده، والمحبوب في قلوب أوليائه.", "Al-Wadud"));
        arrayList.add(new NameAllahModel("الْمَجِيدُ", "48", "وصف نفسه بالمجيد وهو متضمن كثرة صفات كماله وسعتها، وعدم إحصاء الخلق لها، وسعة أفعاله وكثرة خيره ودوامه. وتعني أيضاً البالغ النهاية في المجد، الكثير الإحسان الجزيل العطاء العظيم البر.", "Al-Majid"));
        arrayList.add(new NameAllahModel("البَاعِث", "49", "باعث الخلق يوم القيامة، وباعث رسله و أنبيائه إلى العباد، وباعث المعونة إلى العبد.", "Al-Ba'ith"));
        arrayList.add(new NameAllahModel("الشَّهِيدُ", "50", "الحاضر الذي لا يغيب عنه شيء، فهو المطلع على كل شيء مشاهد له عليم بتفاصيله.", "Ash-Shahid"));
        arrayList.add(new NameAllahModel("الْحَقُّ", "51", "يحق الحق بكلماته ويؤيد أولياءه فهو المستحق للعبادة.", "Al-Haqq"));
        arrayList.add(new NameAllahModel("الْوَكِيلُ", "52", "الكفيل بالخلق القائم بأمورهم فمن توكل عليه تولاه وكفاه، ومن استغنى به أغناه وأرضاه.", "Al-Wakil"));
        arrayList.add(new NameAllahModel("الْقَوِيّ", "53", "صاحب القدرة التامة البالغة الكمال غالب لا يُغلب فقوته فوق كل قوة، ولايرد قضاءه راد، ينفذ أمره، ويمضي قضاؤه في خلقه، شديد عقابه لمن كفر بآياته وجحد حججه.", "Al-Qawiyy"));
        arrayList.add(new NameAllahModel("الْمَتِينُ", "54", "الشديد الذي لا يحتاج في إمضاء حكمه إلى جند أو مدد ولا إلى معين، فهو المتناهي في القوة، التي لاتلحق أفعاله مشقة، ولايمسه فيها لغوب.", "Al-Matin"));
        arrayList.add(new NameAllahModel("الْوَلِيُّ", "55", "لمحب الناصر لمن أطاعه، ينصر أولياءه، ويقهر أعداءه، والمتولي الأمور الخلائق ويحفظهم.", "Al-Waliyy"));
        arrayList.add(new NameAllahModel("الْحَمِيدُ", "56", "المستحق للحمد والثناء له منتهى الحمد وأطيبه على ذاته وصفاته وعلى نعمه التي لا تحصى.", "Al-Hamid"));
        arrayList.add(new NameAllahModel("الْـمُحْصِي", "57", "أحصى كل شيء بعلمه، فلا يفوته منها دقيق ولا جليل.", "Al-Muhsi"));
        arrayList.add(new NameAllahModel("المُعِيد", "59", "يعيد الخلق بعد الحياة إلى الممات في الدنيا، وبعد الممات إلى الحياة يوم القيامة.", "Al-Mu'id"));
        arrayList.add(new NameAllahModel("المُحيِي", "60", "خالق الحياة ومعطيها لمن شاء، يحيي الخلق من العدم ثم يحييهم بعد الموت.n", "Al-Muhyi"));
        arrayList.add(new NameAllahModel("المُمِيت", "61", "مقدر الموت على كل من أماته ولا مميت سواه، قهر عباده بالموت متى شاء وكيف شاء.", "Al-Mumit"));
        arrayList.add(new NameAllahModel("الْحَيُّ", "62", "المتصف بالحياة الأبدية التي لا بداية لها ولا نهاية فهو الباقي أزلا وأبدا وهو الحي الذي لا يموت.", "Al-Hayy"));
        arrayList.add(new NameAllahModel("الْقَيُّومُ", "63", "القائم بنفسه، الغني عن غيره، وهو القائم بتدبير أمر خلقه في إنشائهم ورزقهم.", "Al-Qayyum"));
        arrayList.add(new NameAllahModel("الوَاجِد", "64", "لا يعوزه شيء ولا يعجزه شيء يجد كل ما يطلبه، ويدرك كل ما يريده.", "Al-Wajid"));
        arrayList.add(new NameAllahModel("المَاجِد", "65", "له الكمال المتناهي والعز الباهي، له العز في الأوصاف والأفعال الذي يعامل العباد بالجود والرحمة.", "Al-Majid"));
        arrayList.add(new NameAllahModel("الْوَاحِدُ", "66", "الفرد المتفرد في ذاته وصفائه وأفعاله، واحد في ملكه لا ينازعه أحد، لا شريك له سبحانه.", "Al-Wahid"));
        arrayList.add(new NameAllahModel("ٱلْأَحَد", "67", "ليس معه غيره.", "Al-Ahad"));
        arrayList.add(new NameAllahModel("الصَّمَدُ", "68", "المطاع الذي لا يقضى دونه أمر، الذي يقصد إليه في الحوائج فهو مقصد عباده في مهمات دينهم ودنياهم.", "As-Samad"));
        arrayList.add(new NameAllahModel("الْقَادِرُ", "69", "يقدر على إيجاد المعدوم وإعدام الموجود على قدر ما تقتضي الحكمة، لا زائدا عليه ولا ناقصا عنه.", "Al-Qadir"));
        arrayList.add(new NameAllahModel("الْمُقْتَدِرُ", "70", "يقدر على إصلاح الخلائق على وجه لا يقدر عليه غيره.", "Al-Muqtadir"));
        arrayList.add(new NameAllahModel("الْمُقَدِّمُ", "71", "يقدم الأشياء ويضعها في مواضعها، فمن استحق التقديم قدمه.", "Al-Muqaddim"));
        arrayList.add(new NameAllahModel("الْمُؤَخِّرُ", "72", "يؤخر الأشياء فيضعها في مواضعها المؤخر لمن شاء من الفجار والكفار وكل من يستحق التأخير.", "Al-Mu'akhkhir"));
        arrayList.add(new NameAllahModel("الْأَوَّلُ", "73", "لم يسبقه في الوجود شيء فهو أول قبل الوجود.", "Al-Awwal"));
        arrayList.add(new NameAllahModel("الْآخِرُ", "74", "الباقي بعد فناء خلقه، البقاء الأبدي يفنى الكل وله البقاء وحده، فليس بعده شيء.", "Al-Akhir"));
        arrayList.add(new NameAllahModel("الظَّاهِرُ", "75", "ظهر فوق كل شيء وعلا عليه، الظاهر وجوده لكثرة دلائله.", "Az-Zahir"));
        arrayList.add(new NameAllahModel("الْبَاطِنُ", "76", "العالم ببواطن الأمور وخفاياها، وهو أقرب إلينا من حبل الوريد.", "Al-Batin"));
        arrayList.add(new NameAllahModel("الوَالِي", "77", "المالك للأشياء المتصرف فيها بمشيئته وحكمته، ينفذ فيها أمره، ويجري عليها حكمه.", "Al-Wali"));
        arrayList.add(new NameAllahModel("الْمُتَعَالِ", "78", "المنزه عن مشابهة خلقه. جل عن إفك المفترين، وتنزه عن وساوس المتحيرين.", "Al-Muta'ali"));
        arrayList.add(new NameAllahModel("الْبِرُّ", "79", "كثير العطايا والإحسان. العطوف على عباده ببره ولطفه، ومن على السائلين بحسن عطائه، وهو الصدق فيما وعد.", "Al-Barr"));
        arrayList.add(new NameAllahModel("التَّوَّابُ", "80", "يوفق عباده للتوبة حتى يتوب عليهم ويقبل توبتهم فيقابل الدعاء بالعطاء، والتوبة بغفران الذنوب.", "At-Tawwab"));
        arrayList.add(new NameAllahModel("الْمُنْتَقِمُ", "81", "يقصم ظهور الطغاة، ويشدد العقوبة على العصاة، وذلك بعد الإعذار والإنذار.", "Al-Muntaqim"));
        arrayList.add(new NameAllahModel("العَفُو", "82", "يعفو عمن يستغفره. يترك المؤاخدة على الذنوب ولا يذكرك بالعيوب فهو يمحو السيئات ويتجاوز عن المعاصي.", "Al-'Afuww"));
        arrayList.add(new NameAllahModel("الرَّؤُوفُ", "83", "ذو رحمة ورأفة. المتعطف على المذنبين بالتوبة، الذي جاد بلطفه ومن بتعطفه، يستر العيوب ثم يعفو عنها.", "Ar-Ra'uf"));
        arrayList.add(new NameAllahModel("مَالِكُ الْمُلْكِ", "84", "المتصرف بملكه كيف يشاء لا راد لحكمه، ولا معقب لأمره.", "Malik-al-Mulk"));
        arrayList.add(new NameAllahModel("ذُوالْجَلَال ِوالْإكْرَام", "85", "المنفرد بصفات الجلال والكمال والعظمة، المختص بالإكرام والكرامة وهو أهل لأن يجل.", "Jalal-Ikram"));
        arrayList.add(new NameAllahModel("المُقسِّط", "86", "يعطي الحقوق لأصحابها. العادل في حكمه، الذي ينتصف للمظلوم من الظالم، ثم يكمل عدله فيرضي الظالم بعد إرضاء المظلوم.", "Al-Muqsit"));
        arrayList.add(new NameAllahModel("الْجَامِعُ", "87", "جمع الكمالات كلها، ذاتا ووصفا وفعلا، الذي يجمع بين الخلائق المتماثلة والمتباينة، والذي يجمع الأولين والآخرين.", "Al-Jami'"));
        arrayList.add(new NameAllahModel("الْغَنِيُّ", "88", "ذاته غنية عن كافة الخلق. لا يحتاج إلى شيء، وهو المستغني عن كل ما سواه، المفتقر إليه كل من عاداه.", "Al-Ghani"));
        arrayList.add(new NameAllahModel("المُغنِي", "89", "المتفضل بإغناء سواه. معطي الغنى لعباده، يغني من يشاء غناه، وهو الكافي لمن شاء من عباده.", "Al-Mughni"));
        arrayList.add(new NameAllahModel("المَانِع", "90", "يمنع العطاء عن من يشاء ابتلاء أو حماية.", "Al-Mani'"));
        arrayList.add(new NameAllahModel("الضَّار", "91", "هو المقدر للضر على من أراد كيف أراد.", "Ad-Darr"));
        arrayList.add(new NameAllahModel("النَّافِع", "92", "مقدر النفع والخير لمن أراد كيف أراد كل ذلك على مقتضى حكمته سبحانه.", "An-Nafi'"));
        arrayList.add(new NameAllahModel("النُّورُ", "93", "هو الهادي الرشيد الذي يرشد بهدايته من يشاء فيبين له الحق، ويلهمه اتباعه، الظاهر في ذاته، المظهر لغيره.", "An-Nur"));
        arrayList.add(new NameAllahModel("الْهَادِي", "94", "هو المبين للخلق طريق الحق بكلامه يهدي القلوب إلى معرفته، والنفوس إلى طاعته.", "Al-Hadi"));
        arrayList.add(new NameAllahModel("الْبَدِيعُ", "95", "هو الذي لا يماثله أحد في صفاته ولا في حكم من أحكامه، أو أمر من أموره، فهو المحدث الموجد على غير مثال.", "Al-Badi"));
        arrayList.add(new NameAllahModel("الباقي", "96", "هو وحده له البقاء، الدائم الوجود الموصوف بالبقاء الأزلي، غير قابل للفناء فهو الباقي بلا انتهاء.", "Al-Baqi"));
        arrayList.add(new NameAllahModel("الْوَارِثُ", "97", "هو الأبقى الدائم الذي يرث الخلائق بعد فناء الخلق، وهو يرث الأرض ومن عليها.", "Al-Warith"));
        arrayList.add(new NameAllahModel("الرَّشِيد", "98", "هو الذي أسعد من شاء بإرشاده، وأشقى من شاء بإبعاده، عظيم الحكمة بالغ الرشاد.", "Ar-Rashid"));
        arrayList.add(new NameAllahModel("الصَّبُور", "99", "هو الحليم الذي لا يعاجل العصاة بالنقمة، بل يعفوا ويؤخر، ولا يسرع بالفعل قبل أوانه.", "As-Sabur"));


        NamesAllahAdapter adapter = new NamesAllahAdapter(NamesAllahActivity.this, arrayList);
        recyclerView.setAdapter(adapter);
    }

//    @Override
//    public void onBackPressed() {
//        AlertDialog.Builder builder =
//                new AlertDialog.Builder(NamesAllahActivity.this);
//        builder.setTitle(" 99 Names Of Allah ");
//        builder.setMessage("Do you want to exit the app?");
//
//
//        builder.setPositiveButton(" Yes ", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                NamesAllahActivity.this.finish();
//            }
//
//        });
//        builder.setNegativeButton(" No ", null);
//
//        builder.show();
//    }
}
