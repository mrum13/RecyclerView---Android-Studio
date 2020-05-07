package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.listapp.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMain;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMain = (RecyclerView) findViewById(R.id.recycler_view_main);

        //  Pada contoh kali ini kita akan membuat 10 item di dalam RecyclerView
        ArrayList<Integer> listViewType = new ArrayList<>();

        listViewType.add(MyAdapter.TYPE_1);
        listViewType.add(MyAdapter.TYPE_1);
//        listViewType.add(MyAdapter.TYPE_3);
        listViewType.add(MyAdapter.TYPE_1);
//        listViewType.add(MyAdapter.TYPE_3);
        listViewType.add(MyAdapter.TYPE_2);
        listViewType.add(MyAdapter.TYPE_2);
//        listViewType.add(MyAdapter.TYPE_3);
        listViewType.add(MyAdapter.TYPE_2);

        //  Buat objek MyAdapter untuk recyclerViewMain
        MyAdapter adapterMain = new MyAdapter(listViewType, this);  //  this adalah mengarah ke Context (MainActivity.this)

        //  Set layout manager recyclerViewMain
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewMain.setLayoutManager(layoutManager);

        //  Set adapter recyclerViewMain
        recyclerViewMain.setAdapter(adapterMain);
    }
}
