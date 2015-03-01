package com.gumtree.android.test.view.adapter;

import com.gumtree.android.test.R;
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class ImageViewPagerAdaper  extends PagerAdapter {

    private final Context mContext;
    private final List<String> mImageUrls;

    public ImageViewPagerAdaper(Context context, List<String> imageUrls) {
        mContext = context;
        mImageUrls = imageUrls;
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
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View)object);
    }
    
}
