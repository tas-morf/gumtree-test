package com.gumtree.android.test.controller.fragment;

import com.gumtree.android.test.R;
import com.gumtree.android.test.controller.activity.FullscreenImagesActivity;
import com.gumtree.android.test.controller.listener.AdDetailsEventListener;
import com.gumtree.android.test.controller.listener.OnAdFetchedListener;
import com.gumtree.android.test.model.AdFetcher;
import com.gumtree.android.test.model.FavoritesManager;
import com.gumtree.android.test.model.bean.Ad;
import com.gumtree.android.test.view.AdDetailsIndicator;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ShareActionProvider;

import java.util.ArrayList;

import static com.gumtree.android.test.module.model.AdFetcherModule.adFetcher;
import static com.gumtree.android.test.module.model.FavoritesManagerModule.favoritesManager;
import static com.gumtree.android.test.module.view.AdDetailsIndicatorModule.adDetailsIndicator;

public class AdDetailsFragment extends Fragment implements AdDetailsEventListener,
        OnAdFetchedListener {

    static final String PARAM_AD_ID = "adId";
    
    private final AdFetcher mAdFetcher;
    private final FavoritesManager mFavoritesManager;
    private final AdDetailsIndicator mAdDetailsIndicator;
    private ShareActionProvider mShareActionProvider;

    public static AdDetailsFragment newInstance(int adId) {
        AdDetailsFragment fragment = new AdDetailsFragment();
        Bundle args = new Bundle();
        args.putInt(PARAM_AD_ID, adId);
        fragment.setArguments(args);
        return fragment;
    }
    
    public AdDetailsFragment() {
        this(adFetcher(), 
                favoritesManager(),
                adDetailsIndicator());
    }

    @SuppressLint("ValidFragment")
    public AdDetailsFragment(AdFetcher adFetcher, 
            FavoritesManager favoritesManager,
            AdDetailsIndicator adDetailsIndicator) {
        mAdFetcher = adFetcher;
        mFavoritesManager = favoritesManager;
        mAdDetailsIndicator = adDetailsIndicator;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
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
    public void onResume() {
        super.onResume();
        mAdDetailsIndicator.resumeMap();
    }

    @Override
    public void onPause() {
        super.onPause();
        mAdDetailsIndicator.pauseMap();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mAdDetailsIndicator.destroyMap();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mAdFetcher.clearListener();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.ad_details_menu, menu);
        // Locate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.menu_item_share);
        mShareActionProvider = ((ShareActionProvider) item.getActionProvider());
        MenuItem addToFavoritesItem = menu.findItem(R.id.menu_item_add_to_favorites);
        if(mFavoritesManager.isItemInFavorites(getArguments().getInt(PARAM_AD_ID))) {
            addToFavoritesItem.setIcon(android.R.drawable.star_on);
        }

    }

    @Override
    public void onAdFetched(Ad ad) {
        // Fetch and store ShareActionProvider
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, ad.getShareUrl());
        mShareActionProvider.setShareIntent(shareIntent);
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
    public void onFullscreenImagesRequested(ArrayList<String> imageUrls, int selectedItem) {
        startActivity(FullscreenImagesActivity.getFullscreenImagesIntent(getActivity(), imageUrls, selectedItem));
    }

    @Override
    public void onGoToMapsRequested(String mapsUri) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapsUri));
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_item_add_to_favorites) {
            int adId = getArguments().getInt(PARAM_AD_ID);
            if(mFavoritesManager.isItemInFavorites(adId)) {
                mFavoritesManager.removeItemFromFavorites(adId);
                item.setIcon(android.R.drawable.star_off);
            } else {
                mFavoritesManager.addItemToFavorites(adId);
                item.setIcon(android.R.drawable.star_on);
            }
            return true;
        }
        return false;
    }
}
