package com.example.mvpmultiplecomponents.main;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mvpmultiplecomponents.R;
import com.example.mvpmultiplecomponents.application.App;
import com.example.mvpmultiplecomponents.feature1.Feature1Fragment;
import com.example.mvpmultiplecomponents.feature2.Feature2Fragment;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    // Injected from AppModule
    @Inject
    String something;
    @Inject
    SharedPreferences sharedPreferences;
    //========

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        // Injected from AppModule
        String stuff = something;
        SharedPreferences sp = sharedPreferences;
        //=============

        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment feature1Fragment = fragmentManager.findFragmentById(R.id.fl_feature1_container);
        if (feature1Fragment == null) {
            feature1Fragment = new Feature1Fragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fl_feature1_container, feature1Fragment)
                    .commit();
        }

        Fragment feature2Fragment = fragmentManager.findFragmentById(R.id.fl_feature2_container);
        if(feature2Fragment == null) {
            feature2Fragment = new Feature2Fragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fl_feature2_container, feature2Fragment)
                    .commit();
        }
    }
}
