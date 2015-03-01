package com.gumtree.android.test.view;

import com.gumtree.android.test.controller.listener.AdDetailsEventListener;
import com.gumtree.android.test.model.bean.Ad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface AdDetailsIndicator {

    View initialize(LayoutInflater inflater, ViewGroup container,
            AdDetailsEventListener adDetailsEventListener, Bundle savedInstanceState);

    void showProgress();

    void showAdData(Ad ad);

    void showError();
}
