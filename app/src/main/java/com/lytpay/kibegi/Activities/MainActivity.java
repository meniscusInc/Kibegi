package com.lytpay.kibegi.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lytpay.kibegi.Fragments.Account;
import com.lytpay.kibegi.Fragments.Add;
import com.lytpay.kibegi.Fragments.Cart;
import com.lytpay.kibegi.Fragments.Home;
import com.lytpay.kibegi.Fragments.Search;
import com.lytpay.kibegi.R;


public class MainActivity extends AppCompatActivity {

    private final int ID_HOME = R.id.nav_home;
    private final int ID_SEARCH = R.id.nav_search;
    private final int ID_ADD = R.id.nav_add;
    private final int ID_CART = R.id.nav_cart;
    private final int ID_ACCOUNT = R.id.nav_account;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btmNavigation);



        String intentAction = getIntent().getAction();
        switch (intentAction){
            case "android.Intent.action.search":
                openFragment(new Search());
                break;
            case "android.Intent.action.cart":
                openFragment(new Cart());
                break;
            case "android.Intent.action.trend":
                openFragment(new Home(1));
            case "android.Intent.action.electronics":
                openFragment(new Home(2));
            default:
                normalAction();
        }


    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,fragment).commit();
    }

    private void normalAction() {
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case ID_HOME:
                    selectedFragment = new Home(1);
                    break;
                case ID_ADD:
                    selectedFragment = new Add();
                    break;
                case ID_CART:
                    selectedFragment = new Cart();
                    break;
                case ID_ACCOUNT:
                    selectedFragment = new Account();
                    break;
                case ID_SEARCH:
                    selectedFragment = new Search();
                    break;
            }

            assert selectedFragment != null;
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit();
            return true;
        });

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,new Home(1)).commit();
    }


}