package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Items>  itemsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Items i1 = new Items("cheese",1500,R.drawable.cheese);
        Items i2 = new Items("chocolate",1.400,R.drawable.chocolate);
        Items i3 = new Items("coffe" ,1.750,R.drawable.coffee );
        Items i4 = new Items("frise",2.00,R.drawable.fries);


        itemsArrayList.add(i1);
        itemsArrayList.add(i2);
        itemsArrayList.add(i3);
        itemsArrayList.add(i4);





        ItemAdapter itemAdapter = new ItemAdapter(this ,0 , itemsArrayList );
       ListView listView = findViewById(R.id.listview);

       listView.setAdapter(itemAdapter);


























    }
}