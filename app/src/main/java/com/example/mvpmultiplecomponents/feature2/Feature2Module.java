package com.example.mvpmultiplecomponents.feature2;

import com.example.mvpmultiplecomponents.data.local.dummy2.Dummy2DataRepository;
import com.example.mvpmultiplecomponents.data.local.dummy2.Dummy2Repository;
import com.example.mvpmultiplecomponents.util.Feature2Scope;

import dagger.Module;
import dagger.Provides;

@Module
public class Feature2Module {

    @Feature2Scope
    @Provides
    Dummy2Repository provideRepository() {
        return new Dummy2DataRepository();
    }

    @Feature2Scope
    @Provides
    Feature2Contract.Model provideModel(Dummy2Repository repository) {
        return new Feature2Model(repository);
    }

    @Feature2Scope
    @Provides
    Feature2Contract.Presenter providePresenter(Feature2Contract.Model model) {
        return new Feature2Presenter(model);
    }
}
