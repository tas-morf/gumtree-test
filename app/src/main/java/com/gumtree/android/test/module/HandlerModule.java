package com.gumtree.android.test.module;

import android.os.Handler;

import static com.gumtree.android.test.module.ApplicationModule.getApplicationContext;

public class HandlerModule {

    public static Handler mainThreadHandler() {
        return new Handler(getApplicationContext().getMainLooper());
    }
}
