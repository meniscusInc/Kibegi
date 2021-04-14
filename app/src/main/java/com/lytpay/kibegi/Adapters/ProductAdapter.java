package com.lytpay.kibegi.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lytpay.kibegi.Activities.ProductDetails;
import com.lytpay.kibegi.Models.ProductModel;
import com.lytpay.kibegi.R;
import com.lytpay.kibegi.viewholder.ProductViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private final Context context;
    private final List<ProductModel> list;

    public ProductAdapter(Context context, List<ProductModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_view,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        final ProductModel product = list.get(position);
        holder.nameViewHolder.setText(product.getProduct_name());
        holder.brandViewHolder.setText(product.getProduct_brand());
        holder.priceViewHolder.setText("TZS " +product.getProduct_price() + "/-");
        Picasso.get().load(product.getImage_url()).into(holder.imageViewHolder);

        holder.linearLayout.setOnClickListener(v -> {
                Intent intent = new Intent(context, ProductDetails.class);
                intent.putExtra("PRODUCT_NAME",product.getProduct_name());
                intent.putExtra("PRODUCT_BRAND",product.getProduct_brand());
                intent.putExtra("PRODUCT_PRICE",product.getProduct_price());
                intent.putExtra("PRODUCT_IMAGE",product.getImage_url());
                context.startActivity(intent);
                ((Activity) context).finish();
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
