package com.gumtree.android.test.controller.fragment;

import com.gumtree.android.test.controller.listener.AdDetailsEventListener;
import com.gumtree.android.test.controller.listener.OnAdFetchedListener;
import com.gumtree.android.test.model.AdFetcher;
import com.gumtree.android.test.model.bean.Ad;
import com.gumtree.android.test.view.AdDetailsIndicator;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import static com.gumtree.android.test.module.model.AdFetcherModule.adFetcher;
import static com.gumtree.android.test.module.view.AdDetailsIndicatorModule.adDetailsIndicator;

public class AdDetailsFragment extends Fragment implements AdDetailsEventListener,
        OnAdFetchedListener {

    private static final String PARAM_AD_ID = "adId";
    
    private final AdFetcher mAdFetcher;
    private final AdDetailsIndicator mAdDetailsIndicator;

    public static AdDetailsFragment newInstance(int adId) {
        AdDetailsFragment fragment = new AdDetailsFragment();
        Bundle args = new Bundle();
        args.putInt(PARAM_AD_ID, adId);
        fragment.setArguments(args);
        return fragment;
    }
    
    public AdDetailsFragment() {
        this(adFetcher(), adDetailsIndicator());
    }

    @SuppressLint("ValidFragment")
    public AdDetailsFragment(AdFetcher adFetcher, AdDetailsIndicator adDetailsIndicator) {
        mAdFetcher = adFetcher;
        mAdDetailsIndicator = adDetailsIndicator;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdFetcher.setListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = mAdDetailsIndicator.initialize(inflater, container, this, null);
        mAdFetcher.fetchAd(getArguments().getInt(PARAM_AD_ID));
        mAdDetailsIndicator.showProgress();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mAdFetcher.clearListener();
    }

    @Override
    public void onAdFetched(Ad ad) {
        mAdDetailsIndicator.showAdData(ad);
    }

    @Override
    public void onAdFetchFailure() {
        mAdDetailsIndicator.showError();
    }

    @Override
    public void onCallRequested(String phone) {
        String uri = "tel:" + phone;
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

    @Override
    public void onSmsRequested(String phone) {
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:" + phone));
        startActivity(sendIntent);
    }

    @Override
    public void onEmailRequested(String email) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        startActivity(Intent.createChooser(intent, "Send Email"));
    }

    @Override
    public void onFullscreenImagesRequested(List<String> imageUrls) {

    }

    @Override
    public void onGoToMapsRequested(String mapsUri) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapsUri));
        startActivity(intent);
    }
}
