package com.example.user.latihanlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationActivity extends AppCompatActivity {
    ListView listPaket;
    List<Map<String,String>> data = new ArrayList<Map<String, String>>();
    Map<String,String> dataItem = new HashMap<String, String>(2);
    Map<String,String> dataItem2 = new HashMap<String, String>(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        String location;
        location = getIntent().getStringExtra("location");

        listPaket = (ListView) findViewById(R.id.listPaket);

        switch (location){
            case "Pantai Pandawa" :

                dataItem.put("title","Rp 500.000");
                dataItem.put("desc","Tiket Masuk - Makan Siang");
                data.add(dataItem);

                dataItem2.put("title","Rp 1000.000");
                dataItem2.put("desc","Tiket Masuk - Makan Siang - Transport");
                data.add(dataItem2);

                break;
            case "Danau Beratan" :
                dataItem.put("title","Rp 400.000");
                dataItem.put("desc","Tiket Masuk - Makan Siang");
                data.add(dataItem);
                dataItem2.put("title","Rp 800.000");
                dataItem2.put("desc","Tiket Masuk - Makan Siang - Transport");
                data.add(dataItem2);

                break;
            case "Tanah Lot" :
                dataItem.put("title","Rp 700.000");
                dataItem.put("desc","Tiket Masuk - Makan Siang");
                data.add(dataItem);
                dataItem2.put("title","Rp 1200.000");
                dataItem2.put("desc","Tiket Masuk - Makan Siang - Transport");
                data.add(dataItem2);

                break;

        }

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                data,
                android.R.layout.simple_list_item_2,
                new String[] {
                        "title","desc"
                },
                new int[] {
                        android.R.id.text1,
                        android.R.id.text2
                }
        );

        listPaket.setAdapter(adapter);


    }
}
