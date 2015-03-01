package com.gumtree.android.test.controller.activity;

import com.gumtree.android.test.controller.fragment.EmptyFragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AdDetailsActivity extends Activity {

    private static final String PARAM_ITEM_ID = "itemId";

    public static Intent getAdDetailsIntent(Context context, int itemId) {
        Intent intent = new Intent(context, AdDetailsActivity.class);
        intent.putExtra(PARAM_ITEM_ID, itemId);
        return intent;
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, EmptyFragment.newInstance()).commit();
    }

}
