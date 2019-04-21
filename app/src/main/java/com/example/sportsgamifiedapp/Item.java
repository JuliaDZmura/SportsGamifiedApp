package com.example.sportsgamifiedapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;

public class Item {

    private String itemName;
    private String locked;

    public Item(String itemName, String locked) {
        this.itemName = itemName;
        this.locked = locked;
    }

    public String getItemName() {
        return itemName;
    }

    public String getLocked() {
        return locked;
    }

    public void setItemName() {
        this.itemName = itemName;
    }

    public void setLocked() {
        this.locked = locked;
    }

    public static ArrayList<Item> getDummyItemsMain() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("YOUR PROFILE", ""));
        items.add(new Item("BASKETBALL", ""));
        items.add(new Item("SOCCER", "[locked]"));
        items.add(new Item("VOLLEYBALL", "[locked]"));
        items.add(new Item("CRICKET", "[locked]"));
        return items;
    }

    public static ArrayList<Item> getDummyItemsBasketball() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("RULES", ""));
        items.add(new Item("TEAMS & PLAYERS", ""));
        items.add(new Item("QUIZ", ""));
        items.add(new Item("LIVE SCORE", ""));
        return items;
    }
}
