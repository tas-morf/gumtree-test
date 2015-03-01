package com.gumtree.android.test.model;

import com.gumtree.android.test.controller.listener.OnAdFetchedListener;
import com.gumtree.android.test.model.bean.Ad;

import android.os.Handler;

/**
 * Fake implementation of an AdFetcher. Uses a Handler to simulate asynchronousness,
 * but in reality it would be using Volley, AsyncHttpclient, Retrofit,
 * or which ever library we want in order to do real http communication
 */
public class FakeAdFetcher implements AdFetcher {

    //delay for 3 seconds
    private static final long FETCH_DELAY = 3000;
    private Handler mHandler;
    private OnAdFetchedListener mListener = OnAdFetchedListener.NO_OP;
    private FakeData mFakeData;

    public FakeAdFetcher(Handler handler, FakeData fakeData) {
        mHandler = handler;
        mFakeData = fakeData;
    }

    @Override
    public void fetchAd(int adId) {
        mHandler.postDelayed(new FetchAdRunnable(adId), FETCH_DELAY);
    }

    @Override
    public void setListener(OnAdFetchedListener listener) {
        mListener = listener;
    }

    @Override
    public void clearListener() {
        mListener = OnAdFetchedListener.NO_OP;
    }

    private class FetchAdRunnable implements Runnable {

        private final int mAdId;

        public FetchAdRunnable(int adId) {
            mAdId = adId;
        }

        @Override
        public void run() {
            Ad ad = mFakeData.getAd(mAdId);
            if(ad != null) {
                mListener.onAdFetched(ad);
            } else {
                mListener.onAdFetchFailure();
            }
        }
    }
}
