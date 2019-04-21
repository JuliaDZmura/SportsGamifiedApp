package com.example.sportsgamifiedapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

//Activity with the home screen

public class MainActivity extends AppCompatActivity {

    private MyAdapter listAdapter;
    private ArrayList<ListItem> itemsList = new ArrayList<>();
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        listAdapter = new MyAdapter(itemsList, this);
        recycler.setAdapter(listAdapter);

        ArrayList<Item> items = Item.getDummyItemsMain();
        for (Item w: items) {
            itemsList.add(new ListItem(w.getItemName(), w.getLocked()));
        }
    }
}
