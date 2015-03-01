package com.gumtree.android.test.module.model;


import com.gumtree.android.test.model.FavoritesManager;
import com.gumtree.android.test.model.PreferencesFavoritesManager;

public class FavoritesManagerModule {

    public static FavoritesManager favoritesManager() {
        return new PreferencesFavoritesManager(PreferencesModule.sharedPreferences());
    }
}
