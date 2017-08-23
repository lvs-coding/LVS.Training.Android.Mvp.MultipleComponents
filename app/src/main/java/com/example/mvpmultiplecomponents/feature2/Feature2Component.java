package com.example.mvpmultiplecomponents.feature2;

import com.example.mvpmultiplecomponents.application.AppComponent;
import com.example.mvpmultiplecomponents.util.Feature2Scope;

import dagger.Component;

@Feature2Scope
@Component(dependencies = AppComponent.class, modules = {Feature2Module.class})
public interface Feature2Component {
    void inject(Feature2Fragment target);
}
