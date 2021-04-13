package com.lytpay.kibegi.Models;

import android.net.Uri;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductCategoryModel implements Serializable {
    @Expose
    @SerializedName("category_name")
    private String category_name;

    @Expose
    @SerializedName("category_image")
    private int category_image;

    public ProductCategoryModel(String category_name, int category_image) {
        this.category_name = category_name;
        this.category_image = category_image;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_image() {
        return category_image;
    }

    public void setCategory_image(int category_image) {
        this.category_image = category_image;
    }
}
