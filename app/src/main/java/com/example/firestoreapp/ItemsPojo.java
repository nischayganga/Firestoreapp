package com.example.firestoreapp;

import com.google.gson.annotations.SerializedName;

public class ItemsPojo {

    public ItemsPojo(String item_name) {
    this.itemname = item_name;
}

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String movie_name) {
        this.itemname = movie_name;
    }

    @SerializedName("itemname")
    private String itemname;


    public ItemsPojo()
    {

    }
}
