package com.gumtree.android.test.model;


public interface FavoritesManager {

    boolean isItemInFavorites(int adId);

    void addItemToFavorites(int adId);

    void removeItemFromFavorites(int adId);
}
