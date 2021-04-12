package com.lytpay.kibegi.Retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String IP_ADDRESS = "192.168.43.73";
    public static final String BASE_URL = "http://"+IP_ADDRESS+":80/kibegi/";


    public static Retrofit retrofit = null;
    private static ApiClient apiClient;



    public static Retrofit getApiClient(){

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(300, TimeUnit.SECONDS)
                .connectTimeout(300, TimeUnit.SECONDS)
                .build();

        if (retrofit == null){

            retrofit =   new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }

    public static synchronized ApiClient getInstance(){
        if (apiClient == null){
            apiClient = new ApiClient();
        }
        return apiClient;
    }

    public ApiInterface getProducts(){
        return retrofit.create(ApiInterface.class);
    }
}

