package com.example.mvpmultiplecomponents.application;


import android.app.Application;

import com.example.mvpmultiplecomponents.feature1.DaggerFeature1Component;
import com.example.mvpmultiplecomponents.feature1.Feature1Component;
import com.example.mvpmultiplecomponents.feature1.Feature1Module;
import com.example.mvpmultiplecomponents.feature2.DaggerFeature2Component;
import com.example.mvpmultiplecomponents.feature2.Feature2Component;
import com.example.mvpmultiplecomponents.feature2.Feature2Module;

public class App extends Application {
    private Feature1Component feature1Component;
    private Feature2Component feature2Component;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        feature1Component = DaggerFeature1Component.builder()
                .appComponent(component)
                .feature1Module(new Feature1Module())
                .build();

        feature2Component = DaggerFeature2Component.builder()
                .appComponent(component)
                .feature2Module(new Feature2Module())
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }

    public Feature1Component getFeature1Component() {
        return feature1Component;
    }

    public Feature2Component getFeature2Component() {
        return feature2Component;
    }
}
