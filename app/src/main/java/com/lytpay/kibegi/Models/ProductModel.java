package com.lytpay.kibegi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProductModel implements Serializable {
    @Expose
    @SerializedName("image_url")
    private String image_url;

    @Expose
    @SerializedName("product_name")
    private String product_name;

    @Expose
    @SerializedName("product_brand")
    private String product_brand;

    @Expose
    @SerializedName("product_category")
    private String product_category;

    @Expose
    @SerializedName("product_price")
    private String product_price;

    @Expose
    @SerializedName("success")
    private Boolean success;

    @Expose
    @SerializedName("message")
    private String message;

    public ProductModel(String image_url,String product_name, String product_brand, String product_category, String product_price) {
        this.product_name = product_name;
        this.product_brand = product_brand;
        this.product_category = product_category;
        this.product_price = product_price;
        this.image_url = image_url;
    }



    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
