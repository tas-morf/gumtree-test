package com.gumtree.android.test.controller.fragment;

import com.gumtree.android.test.R;
import com.gumtree.android.test.model.AdFetcher;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.gumtree.android.test.module.model.AdFetcherModule.adFetcher;

public class AdDetailsFragment extends Fragment {

    private static final String PARAM_ITEM_ID = "itemId";
    
    private final AdFetcher mAdFetcher;

    public static AdDetailsFragment newInstance(int itemId) {
        AdDetailsFragment fragment = new AdDetailsFragment();
        Bundle args = new Bundle();
        args.putInt(PARAM_ITEM_ID, itemId);
        fragment.setArguments(args);
        return fragment;
    }
    
    public AdDetailsFragment() {
        this(adFetcher());
    }

    @SuppressLint("ValidFragment")
    public AdDetailsFragment(AdFetcher adFetcher) {
        mAdFetcher = adFetcher;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ad_details, container, false);
    }

}
