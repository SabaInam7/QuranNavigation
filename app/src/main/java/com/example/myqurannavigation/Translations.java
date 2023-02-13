package com.example.myqurannavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Translations extends AppCompatActivity {
    RecyclerView recyclerView;
    MyRVAdapter rvAdapter;
    String Ayat;
    ArrayList<String> arrayList= new ArrayList<>();

    private ArrayList<String> UrduTran, UrduTafs, EngTran, EngTafs,HndiTran, HindiTafs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translations);
        Ayat=getIntent().getExtras().get("SurahName").toString();


        String JSondata="";
        try {

            InputStream is = getAssets().open("QuranMetaData.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            JSondata = new String(buffer, "UTF-8");
            System.out.println(JSondata);

        }
        catch (Exception ex)
        {
            System.out.println("Exception ocuur");
        }


        Gson gson = new Gson();
        Type listType = new TypeToken<List<QuranModel>>(){}.getType();
        List<QuranModel> objectList = gson.fromJson(JSondata, listType);
       // Toast.makeText(Translations.this, "You clickeded: "+Ayat, Toast.LENGTH_SHORT).show();
        UrduTafs= new ArrayList<>();
        UrduTran = new ArrayList<>();
        EngTran = new ArrayList<>();
        HndiTran = new ArrayList<>();
        EngTafs = new ArrayList<>();
        HindiTafs = new ArrayList<>();
        getSurahDetail(objectList,Ayat);


        recyclerView = findViewById(R.id.recyclerView);
        rvAdapter= new MyRVAdapter(Translations.this,this,UrduTran, UrduTafs, EngTran, EngTafs,HndiTran, HindiTafs);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Translations.this));


    }
    String getSurahDetail(List<QuranModel> surah, String Ayat  ){

        String str="";
        String surahNum;
        for(QuranModel obj:surah){

            if (Ayat.trim().equals(obj.getText())){

                Toast.makeText(Translations.this, obj.getUrduTranslation(), Toast.LENGTH_SHORT).show();
               UrduTafs.add(obj.getUrduTafseer());
                UrduTran.add(obj.getUrduTranslation());
                EngTafs.add(obj.getEnglishTranslation());
                EngTran.add(obj.getEnglishtafseer());
                HindiTafs.add(obj.getHindiTafseer());
                HndiTran.add(obj.getHindiTranslation());

            }

        }
        return str;
    }
}