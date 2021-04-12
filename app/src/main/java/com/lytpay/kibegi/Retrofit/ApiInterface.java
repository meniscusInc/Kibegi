package com.lytpay.kibegi.Retrofit;

import com.lytpay.kibegi.Models.ProductModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    //    @Headers({"Accept: application/json"})
    @FormUrlEncoded
    @POST("addProduct.php")
    Call<ProductModel> addProduct(@Field("image_url") String image_url,
                                  @Field("product_name") String product_name,
                                  @Field("product_brand") String product_brand,
                                  @Field("product_category") String product_category,
                                  @Field("product_price") String product_price);

    @GET("retrieveProducts.php")
    Call<List<ProductModel>> getAllProducts();
}
