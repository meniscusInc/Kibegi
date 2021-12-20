package com.lytpay.kibegi.Fragments;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lytpay.kibegi.Adapters.ProductCategoryAdapter;
import com.lytpay.kibegi.Models.ProductCategoryModel;
import com.lytpay.kibegi.Models.ProductCategorySelectorModal;
import com.lytpay.kibegi.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Add extends Fragment {
    List<ProductCategorySelectorModal> catSelectorList;
    RecyclerView category_selector;
    ProductCategoryAdapter categoryAdapter;

    public Add() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);

         category_selector = view.findViewById(R.id.catOptionsRecycler);


        if(Objects.requireNonNull(getActivity()).getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            category_selector.setLayoutManager(new GridLayoutManager(getContext(),1,GridLayoutManager.VERTICAL,false));
        }else{
            category_selector.setLayoutManager(new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false));
        }
        category_selector.setHasFixedSize(true);

         catSelectorList = new ArrayList<>();

        catSelectorList.add(new ProductCategorySelectorModal("Shoes", R.drawable.shoes_category));
        catSelectorList.add(new ProductCategorySelectorModal("Hand Bags", R.drawable.hand_bag_category));
        catSelectorList.add(new ProductCategorySelectorModal("Watches", R.drawable.watches_category));
        catSelectorList.add(new ProductCategorySelectorModal("Sports", R.drawable.sports_category));
        catSelectorList.add(new ProductCategorySelectorModal("Beauty", R.drawable.beauty_category));
        catSelectorList.add(new ProductCategorySelectorModal("Electronics", R.drawable.electronics_category));
        catSelectorList.add(new ProductCategorySelectorModal("Accessories", R.drawable.accessories_category));
        catSelectorList.add(new ProductCategorySelectorModal("Toys", R.drawable.toys_category));
        catSelectorList.add(new ProductCategorySelectorModal("Cleaning", R.drawable.cleaning_category));
        catSelectorList.add(new ProductCategorySelectorModal("Shoes", R.drawable.shoes_category));
        catSelectorList.add(new ProductCategorySelectorModal("Hand Bags", R.drawable.hand_bag_category));
        catSelectorList.add(new ProductCategorySelectorModal("Watches", R.drawable.watches_category));
        catSelectorList.add(new ProductCategorySelectorModal("Sports", R.drawable.sports_category));
        catSelectorList.add(new ProductCategorySelectorModal("Beauty", R.drawable.beauty_category));
        catSelectorList.add(new ProductCategorySelectorModal("Electronics", R.drawable.electronics_category));
        catSelectorList.add(new ProductCategorySelectorModal("Accessories", R.drawable.accessories_category));
        catSelectorList.add(new ProductCategorySelectorModal("Toys", R.drawable.toys_category));
        catSelectorList.add(new ProductCategorySelectorModal("Cleaning", R.drawable.cleaning_category));

         categoryAdapter = new ProductCategoryAdapter(getContext(),R.layout.product_cat_option,null,catSelectorList);
        category_selector.setAdapter(categoryAdapter);

        return view;
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        int newOrientation = newConfig.orientation;

        if (newOrientation == Configuration.ORIENTATION_LANDSCAPE) {
            category_selector.setLayoutManager(new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false));
        }else{
            category_selector.setLayoutManager(new GridLayoutManager(getContext(),1,GridLayoutManager.VERTICAL,false));
        }

        category_selector.setHasFixedSize(true);
        categoryAdapter = new ProductCategoryAdapter(getContext(),R.layout.product_cat_option,null,catSelectorList);
        category_selector.setAdapter(categoryAdapter);
    }
}