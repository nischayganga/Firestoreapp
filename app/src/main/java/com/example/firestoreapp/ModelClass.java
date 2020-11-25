package com.example.firestoreapp;

import android.graphics.ColorSpace;

import com.google.gson.annotations.SerializedName;

public class ModelClass {


    public ModelClass(String itemname) {
        this.itemname = itemname;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    @SerializedName("itemname")
    private String itemname;


    public ModelClass()
    {

    }
}

