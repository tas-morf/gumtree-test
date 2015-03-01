package com.gumtree.android.test.view.widget;

import com.gumtree.android.test.model.bean.Metadata;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.List;


public class AdDetailsMetadataView extends LinearLayout {

    public AdDetailsMetadataView(Context context) {
        super(context);
    }

    public AdDetailsMetadataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AdDetailsMetadataView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void populateWith(List<Metadata> metadataList) {

    }
}
