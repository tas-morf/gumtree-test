package com.gumtree.android.test.module;

import android.content.res.Resources;

import static com.gumtree.android.test.module.ApplicationModule.getApplicationContext;

public class ResourcesModule {

    public static Resources resources() {
        return getApplicationContext().getResources();
    }
}
