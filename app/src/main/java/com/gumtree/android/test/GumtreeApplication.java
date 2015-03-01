package com.gumtree.android.test;

import com.gumtree.android.test.module.ApplicationModule;

import android.app.Application;

public class GumtreeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationModule.setApplication(this);
    }
}
