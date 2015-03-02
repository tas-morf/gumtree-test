package com.gumtree.android.test.controller.listener;

import java.util.ArrayList;

/**
 * Listens for all the user inut events that can happen on the Ad details page
 */
public interface AdDetailsUserEventListener {

    void onCallRequested(String phone);

    void onSmsRequested(String phone);

    void onEmailRequested(String email);

    void onFullscreenImagesRequested(ArrayList<String> imageUrls, int selectedItem);

    void onGoToMapsRequested(String mapsUri);
}
