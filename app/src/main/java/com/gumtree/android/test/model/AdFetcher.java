package com.gumtree.android.test.model;

import com.gumtree.android.test.controller.listener.OnAdFetchedListener;

/**
 * Fetches Ads
 */
public interface AdFetcher {

    void fetchAd(int adId);

    void setListener(OnAdFetchedListener listener);

    void clearListener();
}
