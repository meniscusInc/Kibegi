package com.lytpay.kibegi.Fragments.HomeFrags;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lytpay.kibegi.Adapters.ProductAdapter;
import com.lytpay.kibegi.Models.ProductModel;
import com.lytpay.kibegi.R;
import com.lytpay.kibegi.Retrofit.ApiClient;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Watches extends Fragment {
    public List<ProductModel> list;
    RecyclerView watchesRecyclerView;

    public Watches() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_watches, container, false);

        list = new ArrayList<>();

//        getProducts(view);

        return view;
    }

    private void getProducts(View v) {
        watchesRecyclerView = v.findViewById(R.id.watches_recyclerview);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        watchesRecyclerView.setLayoutManager(layoutManager);
        watchesRecyclerView.setHasFixedSize(true);

        Call<List<ProductModel>> productList = ApiClient.getInstance().getProducts().getAllProducts();

        productList.enqueue(new Callback<List<ProductModel>>() {
            @Override
            public void onResponse(@NotNull Call<List<ProductModel>> call, @NotNull Response<List<ProductModel>> response) {
                try{
                    list = response.body();
                    ProductAdapter productAdapter = new ProductAdapter(getContext(), list);
                    watchesRecyclerView.setAdapter(productAdapter);
                }catch (Exception e){
                    Toast.makeText(getContext(), "failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<ProductModel>> call, @NotNull Throwable t) {
                Toast.makeText(getContext(), t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
