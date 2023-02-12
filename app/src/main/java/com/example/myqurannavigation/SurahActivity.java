package com.example.myqurannavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SurahActivity extends AppCompatActivity {
    ListView LVAyat;
    String suarhName;
    ArrayAdapter<String> AyatAdapter;
    ArrayList<String> arrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        suarhName=getIntent().getExtras().get("SurahName").toString();
        LVAyat=findViewById(R.id.lvAyat);
        String jsondata="";
        try {

            InputStream is = getAssets().open("QuranMetaData.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsondata = new String(buffer, "UTF-8");
            System.out.println(jsondata);

        }
        catch (Exception ex)
        {
            System.out.println("Exception ocuur");
        }


        Gson gson = new Gson();
        Type listType = new TypeToken<List<QuranModel>>(){}.getType();
        List<QuranModel> objectList = gson.fromJson(jsondata, listType);

        getSurahDetail(objectList,suarhName);

        AyatAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        LVAyat.setAdapter(AyatAdapter);

    }
    String getSurahDetail(List<QuranModel> surah, String suarhName  ){
        String str="";
        String surahNum;
        for(QuranModel obj:surah){

            if(obj.getSurah_name()==suarhName ){
                if (!str.contains(obj.getSurah_name())) {

                    str=obj.getText()+"\n\n";
                    surahNum=""+obj.getSurah_number();
                    arrayList.add(str);}
            }
        }
        return str;
    }
}