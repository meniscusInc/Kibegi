package com.lytpay.kibegi.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;
import com.lytpay.kibegi.R;

public class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
    public ImageView categoryImage;
    public ShapeableImageView catSelectorIcon;
    public TextView categoryName, catSelectorName;
    public View categoryCard;
    public View catOption;





    public ProductCategoryViewHolder(@NonNull View itemView) {
        super(itemView);






        //holder1
        categoryImage = itemView.findViewById(R.id.categoryImage);
        categoryName = itemView.findViewById(R.id.categoryName);
        categoryCard = itemView.findViewById(R.id.categoryCard);

        //holder2
        catOption = itemView.findViewById(R.id.viewOpt);
        catSelectorName = itemView.findViewById(R.id.catName);
        catSelectorIcon = itemView.findViewById(R.id.catIcon);

    }
}
