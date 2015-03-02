package com.gumtree.android.test.view;

import com.gumtree.android.test.controller.listener.AdDetailsUserEventListener;
import com.gumtree.android.test.model.bean.Ad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Handles all UI for the Ad Details. The purpose of this is to separate UI from business logic 
 * (Fragment or Activity) 
 */
public interface AdDetailsIndicator {

    View initialize(LayoutInflater inflater, ViewGroup container,
            AdDetailsUserEventListener adDetailsUserEventListener, Bundle savedInstanceState);

    void showProgress();

    void showAdData(Ad ad);

    void showError();

    void resumeMap();

    void pauseMap();

    void destroyMap();
}
