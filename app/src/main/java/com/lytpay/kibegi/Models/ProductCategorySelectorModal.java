package com.lytpay.kibegi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductCategorySelectorModal implements Serializable {
    @Expose
    @SerializedName("catNameSelector")
    private  String catNameSelector;

    @Expose
    @SerializedName("catIconSelector")
    private  int catIconSelector;

    public ProductCategorySelectorModal(String catNameSelector, int catIconSelector) {
        this.catNameSelector = catNameSelector;
        this.catIconSelector = catIconSelector;
    }

    public  String getCatNameSelector() {
        return catNameSelector;
    }

    public void setCatNameSelector(String catNameSelector) {
        this.catNameSelector = catNameSelector;
    }

    public  int getCatIconSelector() {
        return catIconSelector;
    }

    public void setCatIconSelector(int catIconSelector) {
        this.catIconSelector = catIconSelector;
    }
}
