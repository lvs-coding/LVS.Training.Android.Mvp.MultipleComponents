package com.example.mvpmultiplecomponents.feature2;



public interface Feature2Contract {
    interface Model {
        String getData();
    }

    interface View {
        void showData(Feature2ViewModel viewModel);
    }

    interface Presenter {
        void loadData();
        void setView(Feature2Contract.View view);
    }
}
