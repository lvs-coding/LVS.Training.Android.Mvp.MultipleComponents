package com.example.mvpmultiplecomponents.feature1;


import com.example.mvpmultiplecomponents.data.local.dummy1.Dummy1Repository;

public class Feature1Model implements Feature1Contract.Model {
    private Dummy1Repository repository;

    public Feature1Model(Dummy1Repository repository) {
        this.repository = repository;
    }

    @Override
    public String getData() {
        String data = repository.getDummyString();
        return data;
    }
}
