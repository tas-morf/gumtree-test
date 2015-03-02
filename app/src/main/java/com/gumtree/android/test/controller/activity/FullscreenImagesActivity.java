package com.gumtree.android.test.controller.activity;

import com.gumtree.android.test.R;
import com.gumtree.android.test.view.adapter.ImageViewPagerAdapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

/**
 * Simply shows the images fullscreen
 */
public class FullscreenImagesActivity extends Activity {

    private static final String PARAM_IMAGE_URLS = "imageUrls";
    private static final String PARAM_SELECTED_ITEM = "selectedItem";

    public static Intent getFullscreenImagesIntent(Context context, ArrayList<String> imageUrls,
            int selectedItem) {
        Intent intent = new Intent(context, FullscreenImagesActivity.class);
        intent.putExtra(PARAM_IMAGE_URLS, imageUrls);
        intent.putExtra(PARAM_SELECTED_ITEM, selectedItem);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_images);
        ViewPager viewPager = (ViewPager) findViewById(R.id.image_viewpager);
        Intent intent = getIntent();
        viewPager.setAdapter(new ImageViewPagerAdapter(this,
                intent.getStringArrayListExtra(PARAM_IMAGE_URLS), new NoOpOnClickListener()));
        viewPager.setCurrentItem(intent.getIntExtra(PARAM_SELECTED_ITEM, 0));
    }

    private class NoOpOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
        }
    }
}
