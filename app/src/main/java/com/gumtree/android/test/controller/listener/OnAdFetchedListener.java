package com.gumtree.android.test.controller.listener;

import com.gumtree.android.test.model.bean.Ad;

/**
 * Waits for an Ad to be fetched
 */
public interface OnAdFetchedListener {

    OnAdFetchedListener NO_OP = new OnAdFetchedListener() {
        @Override
        public void onAdFetched(Ad ad) {

        }

        @Override
        public void onAdFetchFailure() {

        }
    };

    void onAdFetched(Ad ad);

    void onAdFetchFailure();
}
