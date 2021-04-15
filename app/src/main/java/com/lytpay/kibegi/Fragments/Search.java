package com.lytpay.kibegi.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.lytpay.kibegi.Adapters.ProductCategoryAdapter;
import com.lytpay.kibegi.Models.ProductCategoryModel;
import com.lytpay.kibegi.R;

import java.util.ArrayList;
import java.util.List;


public class Search extends Fragment {
    EditText searchBox;

    public Search() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search, container, false);

        RecyclerView categoryRecycler = view.findViewById(R.id.categoryRecyclerView);
        searchBox = view.findViewById(R.id.searchBox);


        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryRecycler.setHasFixedSize(true);

        List<ProductCategoryModel> categoryList = new ArrayList<>();

        categoryList.add(new ProductCategoryModel("Shoes", R.drawable.shoes_category));
        categoryList.add(new ProductCategoryModel("Hand Bags", R.drawable.hand_bag_category));
        categoryList.add(new ProductCategoryModel("Watches", R.drawable.watches_category));
        categoryList.add(new ProductCategoryModel("Sports", R.drawable.sports_category));
        categoryList.add(new ProductCategoryModel("Beauty", R.drawable.beauty_category));
        categoryList.add(new ProductCategoryModel("Electronics", R.drawable.electronics_category));
        categoryList.add(new ProductCategoryModel("Accessories", R.drawable.accessories_category));
        categoryList.add(new ProductCategoryModel("Toys", R.drawable.toys_category));
        categoryList.add(new ProductCategoryModel("Cleaning", R.drawable.cleaning_category));

        ProductCategoryAdapter categoryAdapter = new ProductCategoryAdapter(getContext(),R.layout.product_category_view,categoryList,null);
        categoryRecycler.setAdapter(categoryAdapter);
        return view;
    }
}