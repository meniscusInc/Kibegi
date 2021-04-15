package com.lytpay.kibegi.viewholder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lytpay.kibegi.R;

public class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
    public ImageView categoryImage;
    public ImageButton catSelectorIcon;
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
