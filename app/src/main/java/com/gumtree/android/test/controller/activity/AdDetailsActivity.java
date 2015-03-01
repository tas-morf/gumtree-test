package com.gumtree.android.test.controller.activity;

import com.gumtree.android.test.R;
import com.gumtree.android.test.controller.fragment.AdDetailsFragment;
import com.gumtree.android.test.controller.listener.OnAdSelectedListener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AdDetailsActivity extends Activity implements OnAdSelectedListener {

    private static final String PARAM_ITEM_ID = "itemId";

    public static Intent getAdDetailsIntent(Context context, int itemId) {
        Intent intent = new Intent(context, AdDetailsActivity.class);
        intent.putExtra(PARAM_ITEM_ID, itemId);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_details);
        onAdSelected(getIntent().getIntExtra(PARAM_ITEM_ID, 0));
    }

    @Override
    public void onAdSelected(int adId) {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.details_content,
                        AdDetailsFragment.newInstance(adId))
                .commit();
    }
}
