package com.lytpay.kibegi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lytpay.kibegi.Fragments.Account;
import com.lytpay.kibegi.Fragments.Add;
import com.lytpay.kibegi.Fragments.Cart;
import com.lytpay.kibegi.Fragments.Home;
import com.lytpay.kibegi.Fragments.Search;


public class MainActivity extends AppCompatActivity {

    private final int ID_HOME = R.id.nav_home;
    private final int ID_SEARCH = R.id.nav_search;
    private final int ID_ADD = R.id.nav_add;
    private final int ID_CART = R.id.nav_cart;
    private final int ID_ACCOUNT = R.id.nav_account;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.btmNavigation);





        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Home());
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFrag = null;
            switch (item.getItemId()){
                case ID_HOME:
                    selectedFrag = new Home();
                    break;
                case ID_ADD:
                    selectedFrag = new Add();
                    break;
                case ID_ACCOUNT:
                    selectedFrag = new Account();
                    break;
                case ID_CART:
                    selectedFrag = new Cart();
                    break;
                case ID_SEARCH:
                    selectedFrag = new Search();
                    break;
            }

            assert selectedFrag != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFrag).commit();

            return  true;
        });

        bottomNavigationView.setOnNavigationItemReselectedListener(item -> {
            Fragment selectedFrag = null;
            switch (item.getItemId()){
                case ID_HOME:
                    selectedFrag = new Home();
                    break;
                case ID_ADD:
                    selectedFrag = new Add();
                    break;
                case ID_ACCOUNT:
                    selectedFrag = new Account();
                    break;
                case ID_CART:
                    selectedFrag = new Cart();
                    break;
                case ID_SEARCH:
                    selectedFrag = new Search();
                    break;
            }

            assert selectedFrag != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFrag).commit();


        });



    }





}