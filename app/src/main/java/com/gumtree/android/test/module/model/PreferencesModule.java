package com.gumtree.android.test.module.model;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import static com.gumtree.android.test.module.ApplicationModule.applicationContext;

public class PreferencesModule {

    public static SharedPreferences sharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(applicationContext());
    }
}
