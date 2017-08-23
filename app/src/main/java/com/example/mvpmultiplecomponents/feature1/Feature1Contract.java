package com.example.mvpmultiplecomponents.feature1;


public interface Feature1Contract {
    interface Model {
        String getData();
    }

    interface View {
        void showData(Feature1ViewModel viewModel);
    }

    interface Presenter {
        void loadData();
        void setView(Feature1Contract.View view);
    }
}
