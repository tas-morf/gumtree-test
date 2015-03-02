package com.gumtree.android.test.controller.listener;

import java.util.ArrayList;

public interface AdDetailsEventListener {

    void onCallRequested(String phone);

    void onSmsRequested(String phone);

    void onEmailRequested(String email);

    void onFullscreenImagesRequested(ArrayList<String> imageUrls, int selectedItem);

    void onGoToMapsRequested(String mapsUri);
}
