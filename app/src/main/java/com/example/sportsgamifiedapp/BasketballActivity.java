package com.example.sportsgamifiedapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import java.util.ArrayList;

//Activity with the different Basketball modules displayed

public class BasketballActivity extends AppCompatActivity {

    private MyAdapterBasketball listAdapter;
    private ArrayList<ListItem> itemsList = new ArrayList<>();
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball2);

        recycler = findViewById(R.id.basketball_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        listAdapter = new MyAdapterBasketball(itemsList, this);
        recycler.setAdapter(listAdapter);

        ArrayList<Item> items = Item.getDummyItemsBasketball();
        for (Item w: items) {
            itemsList.add(new ListItem(w.getItemName(), w.getLocked()));
        }

        //allows user to navigate back to main screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //allows user to navigate back to main screen
    @Override
    public boolean onNavigateUp(){
        finish();
        return true;
    }

}
