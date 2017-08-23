package com.example.mvpmultiplecomponents.feature2;


import com.example.mvpmultiplecomponents.data.local.dummy2.Dummy2Repository;

public class Feature2Model implements Feature2Contract.Model {
    Dummy2Repository repository;

    public Feature2Model(Dummy2Repository repository) {
        this.repository = repository;
    }

    @Override
    public String getData() {
        String data = repository.getDummyString();
        return data;
    }
}
