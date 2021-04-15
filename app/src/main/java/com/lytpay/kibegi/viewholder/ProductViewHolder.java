package com.lytpay.kibegi.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.lytpay.kibegi.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageViewHolder;
    public TextView nameViewHolder,brandViewHolder,priceViewHolder;
    public LinearLayout linearLayout;
    public ToggleButton likeToggleButton;



    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageViewHolder = itemView.findViewById(R.id.product_imageId);
        nameViewHolder = itemView.findViewById(R.id.product_nameId);
        brandViewHolder = itemView.findViewById(R.id.product_brandId);
        priceViewHolder = itemView.findViewById(R.id.product_priceId);
        linearLayout = itemView.findViewById(R.id.item_linearLayout);
        likeToggleButton = itemView.findViewById(R.id.toggle_likeButton);
    }
}
