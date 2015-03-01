package com.gumtree.android.test.view;

import com.gumtree.android.test.R;
import com.gumtree.android.test.controller.listener.AdDetailsEventListener;
import com.gumtree.android.test.model.bean.Ad;
import com.gumtree.android.test.view.AdDetailsIndicator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdDetailsViewIndicator implements AdDetailsIndicator {

    private AdDetailsEventListener mAdDetailsEventListener;

    @Override
    public View initialize(LayoutInflater inflater, ViewGroup container,
            AdDetailsEventListener adDetailsEventListener) {
        mAdDetailsEventListener = adDetailsEventListener;
        View rootView = inflater.inflate(R.layout.fragment_ad_details, container, false);
        return rootView;
    }

    @Override
    public void showProgress() {
        
    }

    @Override
    public void showAdData(Ad ad) {

    }

    @Override
    public void showError() {

    }
}
