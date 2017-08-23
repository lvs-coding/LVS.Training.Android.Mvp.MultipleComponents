package com.example.mvpmultiplecomponents.feature2;


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

public class Feature2Fragment extends Fragment implements Feature2Contract.View {
    private final static String TAG = Feature2Fragment.class.getSimpleName();

    @Inject
    Feature2Contract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feature2,container,false);


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Feature2Component feature2Component = ((App)getActivity().getApplication()).getFeature2Component();
        feature2Component.inject(this);
    }

    @Override
    public void showData(Feature2ViewModel viewModel) {
        Log.d(TAG,viewModel.getDummyData());
    }

    @Override
    public void onStart() {
        super.onStart();

        presenter.setView(this);
        presenter.loadData();
    }
}
