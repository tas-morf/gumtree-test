package com.gumtree.android.test.module.model;

import com.gumtree.android.test.model.AdFetcher;
import com.gumtree.android.test.model.FakeAdFetcher;

import static com.gumtree.android.test.module.HandlerModule.mainThreadHandler;
import static com.gumtree.android.test.module.model.FakeDataModule.fakeData;

/**
 * Just like all other modules, provides an object ready for injection. This is the way i am used to
 * achieving DI in Android, but this could also be done with Dagger or Roboguice.
 */
public class AdFetcherModule {

    public static AdFetcher adFetcher() {
        return new FakeAdFetcher(mainThreadHandler(), fakeData());
    }
}
