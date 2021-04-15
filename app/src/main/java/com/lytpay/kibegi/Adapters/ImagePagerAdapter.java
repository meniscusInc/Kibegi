package com.lytpay.kibegi.Adapters;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.palette.graphics.Palette;
import androidx.viewpager.widget.PagerAdapter;

import com.lytpay.kibegi.R;

public class ImagePagerAdapter extends PagerAdapter {
   private Context context;
   Activity activity;
   private int[] imageID = new int[]{R.drawable.accessories_category,R.drawable.sports_category,R.drawable.toys_category};

    public ImagePagerAdapter(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return imageID.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);


        Bitmap icon = BitmapFactory.decodeResource(context.getResources(),
                imageID[position]);


        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(imageID[position]);
        container.addView(imageView);

        Palette.from(icon).
                generate(palette -> {
                    if (palette != null) {
                        int extColor = palette.getDarkVibrantColor(ContextCompat.getColor(context, R.color.lightgreen));
                        activity.getWindow().setStatusBarColor(extColor);
                    }
                });

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((ImageView) object );
    }
}
