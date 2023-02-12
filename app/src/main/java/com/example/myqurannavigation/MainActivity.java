package com.example.myqurannavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView t1;
    ListView LVsurah;
    String index;
    ArrayAdapter<String> surahAdapter;
    ArrayList<String> arrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        index=getIntent().getExtras().get("Index").toString();
        LVsurah=findViewById(R.id.lvAyat);

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

        getParahDetail(objectList,Integer.parseInt(index));
       // arrayList.add(getParahDetail(objectList,1));
        surahAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        LVsurah.setAdapter(surahAdapter);

        LVsurah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = surahAdapter.getItem(position);
                String currentItem=surahAdapter.getItem(position).toString();
                Toast.makeText(MainActivity.this, "You clicked: "+currentItem, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this,SurahActivity.class);
                intent.putExtra("SurahName", currentItem);
                startActivity(intent);
            }
        });


    }

//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        String surah=adapterView.getItemAtPosition(i).toString();
//
//        Toast.makeText(getApplicationContext(), "Clicked"+surah+(i+1), Toast.LENGTH_SHORT).show();
////
////        surahNumber=i;
////        surahStart=q.SSP[i];
//
//    }
    String getParahDetail(List<QuranModel> parahList, int num  ){
        String str="";
        String surahNum;
        for(QuranModel obj:parahList){

            if(obj.getJuz()==num ){
                if (!str.contains(obj.getSurah_name())) {

                str=obj.getSurah_name()+"\n\n";
                surahNum=""+obj.getSurah_number();
                arrayList.add(str);}
            }
        }
        return str;
    }
}