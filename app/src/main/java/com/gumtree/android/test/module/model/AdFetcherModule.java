package com.gumtree.android.test.module.model;

import com.gumtree.android.test.model.AdFetcher;
import com.gumtree.android.test.model.FakeAdFetcher;

import static com.gumtree.android.test.module.HandlerModule.mainThreadHandler;
import static com.gumtree.android.test.module.model.FakeDataModule.fakeData;

public class AdFetcherModule {

    public static AdFetcher adFetcher() {
        return new FakeAdFetcher(mainThreadHandler(), fakeData());
    }
}
