package com.gumtree.android.test.module;

import com.gumtree.android.test.GumtreeApplication;

import android.content.Context;

public class ApplicationModule {

    private static GumtreeApplication sGumtreeApplication;

    public static void setApplication(GumtreeApplication gumtreeApplication) {
        sGumtreeApplication = gumtreeApplication;
    }
    
    public static Context getApplicationContext() {
        return sGumtreeApplication;
    }
}
