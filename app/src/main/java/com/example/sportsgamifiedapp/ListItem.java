package com.example.sportsgamifiedapp;

import android.graphics.drawable.Drawable;

public class ListItem {

    private String itemName;
    private String locked;

    public ListItem(String itemName, String locked) {
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

    public void setImage() {
        this.locked = locked;
    }
}
