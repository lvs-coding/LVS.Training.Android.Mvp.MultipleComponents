package com.example.mvpmultiplecomponents.feature1;

import com.example.mvpmultiplecomponents.data.local.dummy1.Dummy1DataRepository;
import com.example.mvpmultiplecomponents.data.local.dummy1.Dummy1Repository;
import com.example.mvpmultiplecomponents.util.Feature1Scope;

import dagger.Module;
import dagger.Provides;

@Module
public class Feature1Module {

    @Feature1Scope
    @Provides
    Dummy1Repository provideRepository() {
        return new Dummy1DataRepository();
    }

    @Feature1Scope
    @Provides
    Feature1Contract.Model provideModel(Dummy1Repository repository) {
        return new Feature1Model(repository);
    }

    @Feature1Scope
    @Provides
    Feature1Contract.Presenter providePresenter(Feature1Contract.Model model) {
        return new Feature1Presenter(model);
    }
}
