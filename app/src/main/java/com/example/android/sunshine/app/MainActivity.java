package com.example.android.sunshine.app;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            FragmentManager fragManager = getSupportFragmentManager();
            forecastFragment instance;
            instance = new forecastFragment();
            fragManager.beginTransaction().add(R.id.activity_main, instance ).commit();
        }
    }

}



