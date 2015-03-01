package com.gumtree.android.test.model;

import com.gumtree.android.test.model.bean.Ad;

public class FakeData {
    private static final Ad[] FAKE_ADS = {};
    
    public Ad getAd(int adId) {
        if(adId < FAKE_ADS.length) {
            return FAKE_ADS[adId];
        }
        return null;
    }
}
