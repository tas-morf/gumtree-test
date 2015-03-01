package com.gumtree.android.test.module;

import android.content.res.Resources;

import static com.gumtree.android.test.module.ApplicationModule.applicationContext;

public class ResourcesModule {

    public static Resources resources() {
        return applicationContext().getResources();
    }
}
