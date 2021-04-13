package com.lytpay.kibegi.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lytpay.kibegi.R;

public class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
    public ImageView categoryImage;
    public TextView categoryName;
    public View categoryCard;


    public ProductCategoryViewHolder(@NonNull View itemView) {
        super(itemView);

        categoryImage = itemView.findViewById(R.id.categoryImage);
        categoryName = itemView.findViewById(R.id.categoryName);
        categoryCard = itemView.findViewById(R.id.categoryCard);

    }
}
