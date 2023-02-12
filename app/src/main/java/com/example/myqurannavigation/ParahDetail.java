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
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ParahDetail extends AppCompatActivity {

    private TextView t1;
    ListView LVParah;

    ArrayAdapter<Integer> parahAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah_detail);
        ArrayList<Integer> arrayList= new ArrayList<>();

        LVParah=findViewById(R.id.lvparah);

        for(int  i=1; i<31; i++){
            arrayList.add(i);
        }
        parahAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        LVParah.setAdapter(parahAdapter);

        LVParah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int  num=position+1;
              //  Toast.makeText(ParahDetail.this, "You clicked on: "+num, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ParahDetail.this,MainActivity.class);
                intent.putExtra("Index", num);
                startActivity(intent);
            }
        });


    }

}

