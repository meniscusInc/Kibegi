package com.lytpay.kibegi.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

import com.lytpay.kibegi.Activities.MainActivity;
import com.lytpay.kibegi.Activities.SellItem;
import com.lytpay.kibegi.Models.ProductCategoryModel;
import com.lytpay.kibegi.Models.ProductCategorySelectorModal;
import com.lytpay.kibegi.Models.ProductModel;
import com.lytpay.kibegi.R;
import com.lytpay.kibegi.viewholder.ProductCategoryViewHolder;
import com.lytpay.kibegi.viewholder.ProductViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;


public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductCategoryViewHolder> {
    private final Context context;
    private final List<ProductCategoryModel> productCategoryModelList;
    private final List<ProductCategorySelectorModal> productCategorySelectorModalList;
    private final int layoutInflate;


    public ProductCategoryAdapter(Context context, int layoutInflate, @Nullable List<ProductCategoryModel> productCategoryModelList, @Nullable List<ProductCategorySelectorModal> productCategorySelectorModalList) {
        this.context = context;
        this.productCategoryModelList = productCategoryModelList;
        this.layoutInflate = layoutInflate;
        this.productCategorySelectorModalList = productCategorySelectorModalList;

    }

    @NonNull
    @Override
    public ProductCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layoutInflate, parent, false);
        return new ProductCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCategoryViewHolder holder, int position) {
        if(productCategoryModelList != null){
            final ProductCategoryModel productCategoryModel = productCategoryModelList.get(position);
            //holder1
            holder.categoryName.setText(productCategoryModel.getCategory_name());
            holder.categoryImage.setImageResource(productCategoryModel.getCategory_image());
            holder.categoryCard.setOnClickListener(v -> Toast.makeText(context, holder.categoryName.getText().toString() + " clicked", Toast.LENGTH_SHORT).show());

        }
        else if(productCategorySelectorModalList != null){
            final ProductCategorySelectorModal categorySelectorModel = productCategorySelectorModalList.get(position);


            Bitmap icon = BitmapFactory.decodeResource(context.getResources(),
                    categorySelectorModel.getCatIconSelector());

            //holder2
            holder.catSelectorName.setText(categorySelectorModel.getCatNameSelector());
            holder.catSelectorIcon.setImageResource(categorySelectorModel.getCatIconSelector());
            holder.catOption.setOnClickListener(v -> {
                Intent intent = new Intent(context, SellItem.class);
                context.startActivity(intent);
//                ((Activity)context).finish();
            });



        }

    }

    @Override
    public int getItemCount() {
        int size = 0;
        if (productCategorySelectorModalList==null) {
            assert productCategoryModelList != null;
            size = productCategoryModelList.size();
        }
        else if(productCategoryModelList==null){
            size = productCategorySelectorModalList.size();
        }
        return size;
    }

}
