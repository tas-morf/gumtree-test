package com.gumtree.android.test.module.view;

import com.gumtree.android.test.module.ResourcesModule;
import com.gumtree.android.test.view.AdDetailsIndicator;
import com.gumtree.android.test.view.AdDetailsViewIndicator;

public class AdDetailsIndicatorModule {

    public static AdDetailsIndicator adDetailsIndicator() {
        return new AdDetailsViewIndicator(ResourcesModule.resources());
    }
}
