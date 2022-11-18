package com.example.exptriate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.exptriate.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class slide2 extends AppCompatActivity {

    BottomNavigationView button_nivigation;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.BottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItem){

                case R.id.nav_home:
                    replacefragment(new homeFragment());
                    break;
                case R.id.nav_account:
                    replacefragment(new accountFragment());
                    break;
                case R.id.nav_favorite:
                    replacefragment(new favFragment());
                    break;




            }

            return true;

        });
    }

    private void replacefragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.frame_layout.fragment);
        fragmentTransaction.commit();


    }

}
