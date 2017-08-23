package com.example.mvpmultiplecomponents.application;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.mvpmultiplecomponents.util.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @AppScope
    @Provides
    Context provideContext() {
        return this.context;
    }

    @AppScope
    @Provides
    SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @AppScope
    @Provides
    String provideSomething() {
        return "something";
    }
}
