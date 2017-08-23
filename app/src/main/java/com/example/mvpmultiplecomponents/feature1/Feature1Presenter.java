package com.example.mvpmultiplecomponents.feature1;


public class Feature1Presenter implements Feature1Contract.Presenter {
    private Feature1Contract.View view;
    private Feature1Contract.Model model;

    public Feature1Presenter(Feature1Contract.Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {
        String data = model.getData();
        Feature1ViewModel viewModel = new Feature1ViewModel();
        viewModel.setDummyData(data);

        view.showData(viewModel);
    }

    @Override
    public void setView(Feature1Contract.View view) {
        this.view = view;
    }
}
