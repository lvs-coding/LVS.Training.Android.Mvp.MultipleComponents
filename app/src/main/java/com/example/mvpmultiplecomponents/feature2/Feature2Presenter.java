package com.example.mvpmultiplecomponents.feature2;


public class Feature2Presenter implements Feature2Contract.Presenter {
    private Feature2Contract.Model model;
    private Feature2Contract.View view;

    public Feature2Presenter(Feature2Contract.Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {
        String data = model.getData();
        Feature2ViewModel viewModel = new Feature2ViewModel();
        viewModel.setDummyData(data);
        view.showData(viewModel);

    }

    @Override
    public void setView(Feature2Contract.View view) {
        this.view = view;
    }
}
