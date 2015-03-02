package com.gumtree.android.test.module;

import com.gumtree.android.test.GumtreeApplication;

import android.content.Context;

/**
 * Just like all other modules, provides an object ready for injection. This is the way i am used to
 * achieving DI in Android, but this could also be done with Dagger or Roboguice.
 */
public class ApplicationModule {

    private static GumtreeApplication sGumtreeApplication;

    public static void setApplication(GumtreeApplication gumtreeApplication) {
        sGumtreeApplication = gumtreeApplication;
    }
    
    public static Context applicationContext() {
        return sGumtreeApplication;
    }
}
