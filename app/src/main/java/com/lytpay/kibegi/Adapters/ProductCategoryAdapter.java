package com.lytpay.kibegi.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lytpay.kibegi.Models.ProductCategoryModel;
import com.lytpay.kibegi.Models.ProductModel;
import com.lytpay.kibegi.R;
import com.lytpay.kibegi.viewholder.ProductCategoryViewHolder;
import com.lytpay.kibegi.viewholder.ProductViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;


public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductCategoryViewHolder>{
    private final Context context;
    private final List<ProductCategoryModel> list;

    public ProductCategoryAdapter(Context context, List<ProductCategoryModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ProductCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_category_view,parent,false);
        return new ProductCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCategoryViewHolder holder, int position) {
        final ProductCategoryModel productCategoryModel = list.get(position);
        holder.categoryName.setText(productCategoryModel.getCategory_name());
//        Picasso.get().load(productCategoryModel.getCategory_image()).fit().into(holder.categoryImage);
        holder.categoryImage.setImageResource(productCategoryModel.getCategory_image());

        holder.categoryCard.setOnClickListener(v -> Toast.makeText(context, holder.categoryName.getText().toString()+ " clicked", Toast.LENGTH_SHORT).show());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
