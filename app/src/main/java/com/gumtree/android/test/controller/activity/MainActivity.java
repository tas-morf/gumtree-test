package com.gumtree.android.test.controller.activity;

import com.gumtree.android.test.R;
import com.gumtree.android.test.controller.fragment.AdExamplesFragment;
import com.gumtree.android.test.controller.listener.OnAdSelectedListener;

import android.app.Activity;
import android.os.Bundle;

/**
 * Initial actiity that either shows a list of ads (phones), or goes straight to the details page (tablets)
 */
public class MainActivity extends Activity implements OnAdSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getBoolean(R.bool.is_tablet)) {
            //No need for this when we are looking at a tablet
            startActivity(AdDetailsActivity.getAdDetailsIntent(this, 0));
            finish();
        } else {
            getFragmentManager().beginTransaction()
                    .replace(android.R.id.content, AdExamplesFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public void onAdSelected(int adId) {
        startActivity(AdDetailsActivity.getAdDetailsIntent(this, adId));
    }
}
