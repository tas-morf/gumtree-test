package com.gumtree.android.test.module.view;

import com.gumtree.android.test.view.AdDetailsIndicator;
import com.gumtree.android.test.view.AdDetailsViewIndicator;

import static com.gumtree.android.test.module.ResourcesModule.resources;

/**
 * Just like all other modules, provides an object ready for injection. This is the way i am used to
 * achieving DI in Android, but this could also be done with Dagger or Roboguice.
 */
public class AdDetailsIndicatorModule {

    public static AdDetailsIndicator adDetailsIndicator() {
        return new AdDetailsViewIndicator(resources());
    }
}
