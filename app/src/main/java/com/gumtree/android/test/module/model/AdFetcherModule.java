package com.gumtree.android.test.module.model;

import com.gumtree.android.test.model.AdFetcher;
import com.gumtree.android.test.model.FakeAdFetcher;

public class AdFetcherModule {

    public static AdFetcher adFetcher() {
        return new FakeAdFetcher();
    }
}
