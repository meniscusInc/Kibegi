package com.lytpay.kibegi.Adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.lytpay.kibegi.Fragments.HomeFrags.Electronics;
import com.lytpay.kibegi.Fragments.HomeFrags.HandBag;
import com.lytpay.kibegi.Fragments.HomeFrags.Sneakers;
import com.lytpay.kibegi.Fragments.HomeFrags.Trending;
import com.lytpay.kibegi.Fragments.HomeFrags.Watches;

public class PagerHomeAdapter extends FragmentStatePagerAdapter {

    private final int fragNum;

    public PagerHomeAdapter(@NonNull FragmentManager fm, int tabNo) {
        super(fm);
        this.fragNum = tabNo;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Sneakers();
            case 1:
                return new Trending();
            case 2:
                return new Electronics();
            case 3:
                return  new Watches();
            case 4:
                return new HandBag();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return fragNum;
    }
}
