package com.example.mvpmultiplecomponents.application;

import com.example.mvpmultiplecomponents.main.MainActivity;
import com.example.mvpmultiplecomponents.util.AppScope;

import dagger.Component;

@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
