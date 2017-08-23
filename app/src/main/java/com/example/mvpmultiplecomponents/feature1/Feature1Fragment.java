package com.example.mvpmultiplecomponents.feature1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvpmultiplecomponents.R;
import com.example.mvpmultiplecomponents.application.App;

import javax.inject.Inject;

public class Feature1Fragment extends Fragment implements Feature1Contract.View {
    final static String TAG = Feature1Fragment.class.getSimpleName();


    @Inject
    Feature1Contract.Presenter presenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feature2,container,false);


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Feature1Component feature1Component =  ((App)getActivity().getApplication()).getFeature1Component();
        feature1Component.inject(this);
    }

    @Override
    public void showData(Feature1ViewModel viewModel) {
        Log.d(TAG,viewModel.getDummyData());
    }

    @Override
    public void onStart() {
        super.onStart();

        presenter.setView(this);
        presenter.loadData();
    }
}
