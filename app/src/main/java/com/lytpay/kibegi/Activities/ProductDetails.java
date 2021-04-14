package com.lytpay.kibegi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.lytpay.kibegi.Adapters.ImagePagerAdapter;
import com.lytpay.kibegi.Models.ProductModel;
import com.lytpay.kibegi.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ProductDetails extends AppCompatActivity {

    ScrollView scrollview;


    TextView productPrice;
    TextView productName;
    TextView productDetails;
    TextView productBrand;
    TextView deliveryInfo;

    View card;
    View card2;

    ImageView expansionBtn;
    ImageView expansionDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        final Intent i = getIntent();
        final String pNAME  = i.getStringExtra("PRODUCT_NAME");
        final String pBRAND  = i.getStringExtra("PRODUCT_BRAND");
        final String pPRICE  = i.getStringExtra("PRODUCT_PRICE");
        final String pIMAGE  = i.getStringExtra("PRODUCT_IMAGE");


        scrollview =  findViewById(R.id.scrollView);
        ViewPager viewPager = findViewById(R.id.imageViewPager);
        ImageButton backButton = findViewById(R.id.backButton);
        productDetails = findViewById(R.id.hidden_delivery_details);
        deliveryInfo = findViewById(R.id.delivery_return_info);
        productPrice = findViewById(R.id.product_price);
        productName = findViewById(R.id.product_name);
        expansionBtn = findViewById(R.id.expand_details);
        expansionDelivery = findViewById(R.id.expand_info);
        productBrand = findViewById(R.id.product_brand);
        card = findViewById(R.id.card);
        card2 = findViewById(R.id.card2);




        ImagePagerAdapter adapter = new ImagePagerAdapter(this);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

        backButton.bringToFront();
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProductDetails.this,MainActivity.class);
            startActivity(intent);
            finish();
        });

        expansionBtn.setOnClickListener(v -> {
            showDetails(expansionBtn,productDetails);

        });

        expansionDelivery.setOnClickListener(v -> {
            showDetails(expansionDelivery,deliveryInfo);
        });

        productPrice.setText("TZS "+pPRICE+"/-");
        productBrand.setText(pBRAND.toUpperCase());
        productName.setText(pNAME);

    }

    private void showDetails(ImageView imageView, @NotNull TextView hiddenText) {
        if (hiddenText.getVisibility() == View.VISIBLE) {
            hiddenText.setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.down_arrow);
        }

        else {
            hiddenText.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.up_arrow);
        }
        scrollview.post(() -> scrollview.fullScroll(ScrollView.FOCUS_DOWN));
    }
}