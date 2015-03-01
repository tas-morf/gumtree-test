package com.gumtree.android.test.controller.listener;

import java.util.List;

public interface AdDetailsEventListener {

    void onCallRequested(String phone);

    void onSmsRequested(String phone);

    void onEmailRequested(String email);

    void onFullscreenImagesRequested(List<String> imageUrls);

    void onGoToMapsRequested(String mapsUri);
}
