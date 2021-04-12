package com.lytpay.kibegi.Fragments.HomeFrags;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lytpay.kibegi.Adapters.ProductAdapter;
import com.lytpay.kibegi.Models.ProductModel;
import com.lytpay.kibegi.R;

import java.util.ArrayList;
import java.util.List;


public class Trending extends Fragment {


    public Trending() {
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

        View view = inflater.inflate(R.layout.fragment_trending, container, false);

        RecyclerView trendingRecyclerview = view.findViewById(R.id.trending_recyclerview);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
        trendingRecyclerview.setLayoutManager(layoutManager);
        trendingRecyclerview.setHasFixedSize(true);

        List<ProductModel> trendingList = new ArrayList<>();
//        trendingList.add(new ProductModel("https://www.solidbackgrounds.com/images/640x480/640x480-black-solid-color-background.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://photos6.spartoo.eu/photos/967/9670058/9670058_500_A.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-eu.ssl-images-amazon.com/images/I/51DsiwQwmWL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://img.kytary.com/eshop_ie/velky_v2/na/635050104540000000/4cc5fd9f/52309295/reloop-laptop-stand-flat.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-na.ssl-images-amazon.com/images/I/71hLrHn%2BEUL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5JeJhWl6wK09kgjxLf0YwDH6wDq8De8XpTA&usqp=CAU","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://www.dicota.com/media/catalog/product/cache/db2b61cd4da3695e00a6721f7c8b9b99/d/3/d31778_01_1.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://photos6.spartoo.eu/photos/967/9670058/9670058_500_A.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-eu.ssl-images-amazon.com/images/I/51DsiwQwmWL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://img.kytary.com/eshop_ie/velky_v2/na/635050104540000000/4cc5fd9f/52309295/reloop-laptop-stand-flat.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-na.ssl-images-amazon.com/images/I/71hLrHn%2BEUL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5JeJhWl6wK09kgjxLf0YwDH6wDq8De8XpTA&usqp=CAU","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://www.dicota.com/media/catalog/product/cache/db2b61cd4da3695e00a6721f7c8b9b99/d/3/d31778_01_1.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://photos6.spartoo.eu/photos/967/9670058/9670058_500_A.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-eu.ssl-images-amazon.com/images/I/51DsiwQwmWL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://img.kytary.com/eshop_ie/velky_v2/na/635050104540000000/4cc5fd9f/52309295/reloop-laptop-stand-flat.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-na.ssl-images-amazon.com/images/I/71hLrHn%2BEUL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5JeJhWl6wK09kgjxLf0YwDH6wDq8De8XpTA&usqp=CAU","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://www.dicota.com/media/catalog/product/cache/db2b61cd4da3695e00a6721f7c8b9b99/d/3/d31778_01_1.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://photos6.spartoo.eu/photos/967/9670058/9670058_500_A.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-eu.ssl-images-amazon.com/images/I/51DsiwQwmWL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://img.kytary.com/eshop_ie/velky_v2/na/635050104540000000/4cc5fd9f/52309295/reloop-laptop-stand-flat.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://images-na.ssl-images-amazon.com/images/I/71hLrHn%2BEUL.jpg","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5JeJhWl6wK09kgjxLf0YwDH6wDq8De8XpTA&usqp=CAU","Air Max","NIKE","SNEAKER","23000"));
        trendingList.add(new ProductModel("https://www.dicota.com/media/catalog/product/cache/db2b61cd4da3695e00a6721f7c8b9b99/d/3/d31778_01_1.jpg","Air Max","NIKE","SNEAKER","23000"));

        ProductAdapter productAdapter = new ProductAdapter(getContext(), trendingList);
        trendingRecyclerview.setAdapter(productAdapter);




        return view;
    }

}
