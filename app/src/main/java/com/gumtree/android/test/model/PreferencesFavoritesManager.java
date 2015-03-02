package com.gumtree.android.test.model;

import android.content.SharedPreferences;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses the preferences to store the user's favorites. All the adId's are added in a single string which 
 * is stored in the preferences. Not optimal, but it works for the purposes of this test.
 */
public class PreferencesFavoritesManager implements FavoritesManager {

    private static final String KEY_FAVORITE_IDS = "favoriteIds";
    private final SharedPreferences mSharedPreferences;

    public PreferencesFavoritesManager(SharedPreferences sharedPreferences) {
        mSharedPreferences = sharedPreferences;
    }

    @Override
    public boolean isItemInFavorites(int adId) {
        String allIds = mSharedPreferences.getString(KEY_FAVORITE_IDS, "");
        String[] splitIds = allIds.split(",");
        for(String anId : splitIds) {
            if(anId.equals(String.valueOf(adId))) {
               return true;
            }
        }
        return false;
    }

    @Override
    public void addItemToFavorites(int adId) {
        String allIds = mSharedPreferences.getString(KEY_FAVORITE_IDS, "");
        if(allIds.isEmpty()) {
            allIds = String.valueOf(adId);
        } else {
            allIds += "," + adId;
        }
        mSharedPreferences.edit().putString(KEY_FAVORITE_IDS, allIds).apply();
    }

    @Override
    public void removeItemFromFavorites(int adId) {
        String allIds = mSharedPreferences.getString(KEY_FAVORITE_IDS, "");
        String[] splitIds = allIds.split(",");
        List<String> remainingIds = new ArrayList<>();
        for(String anId : splitIds) {
            if(!anId.equals(String.valueOf(adId))) {
                remainingIds.add(anId);
            }
        }
        mSharedPreferences.edit().putString(KEY_FAVORITE_IDS, TextUtils.join(",", remainingIds)).apply();
    }
}
