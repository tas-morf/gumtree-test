package com.gumtree.android.test.model;

/**
 * Handles the user's favorites. Could be backed by a repository, a web interface or even an inmemory map.
 */
public interface FavoritesManager {

    boolean isItemInFavorites(int adId);

    void addItemToFavorites(int adId);

    void removeItemFromFavorites(int adId);
}
