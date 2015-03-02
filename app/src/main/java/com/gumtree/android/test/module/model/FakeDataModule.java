package com.gumtree.android.test.module.model;

import com.gumtree.android.test.model.FakeData;

/**
 * Just like all other modules, provides an object ready for injection. This is the way i am used to
 * achieving DI in Android, but this could also be done with Dagger or Roboguice.
 */
public class FakeDataModule {

    public static FakeData fakeData() {
        return new FakeData();
    }
}
