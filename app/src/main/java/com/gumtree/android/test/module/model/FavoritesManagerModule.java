package com.gumtree.android.test.module.model;


import com.gumtree.android.test.model.FavoritesManager;
import com.gumtree.android.test.model.PreferencesFavoritesManager;

import static com.gumtree.android.test.module.model.PreferencesModule.sharedPreferences;

/**
 * Just like all other modules, provides an object ready for injection. This is the way i am used to
 * achieving DI in Android, but this could also be done with Dagger or Roboguice.
 */
public class FavoritesManagerModule {

    public static FavoritesManager favoritesManager() {
        return new PreferencesFavoritesManager(sharedPreferences());
    }
}
