package com.example.myqurannavigation;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        LVAyat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = AyatAdapter.getItem(position);
                String currentItem=AyatAdapter.getItem(position).toString();
                Toast.makeText(SurahActivity.this, "You clicked: "+currentItem, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(SurahActivity.this,Translations.class);
                intent.putExtra("SurahName", currentItem);
                startActivity(intent);
            }
        });

    }
    String getSurahDetail(List<QuranModel> surah, String surahName  ){

        String str="";
        String surahNum;
        for(QuranModel obj:surah){

            if (surahName.trim().equals(obj.getSurah_name())){

               // Toast.makeText(SurahActivity.this, surahName, Toast.LENGTH_SHORT).show();

                    str=obj.getText();

                surahNum=""+obj.getSurah_number();
                    arrayList.add(str);
            }

        }
        return str;
    }
}