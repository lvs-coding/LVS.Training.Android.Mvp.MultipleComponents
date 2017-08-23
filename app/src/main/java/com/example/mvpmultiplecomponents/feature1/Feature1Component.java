package com.example.mvpmultiplecomponents.feature1;

import com.example.mvpmultiplecomponents.application.AppComponent;
import com.example.mvpmultiplecomponents.util.Feature1Scope;

import dagger.Component;

@Feature1Scope
@Component(dependencies = AppComponent.class, modules = {Feature1Module.class})
public interface Feature1Component {
    void inject(Feature1Fragment target);
}
