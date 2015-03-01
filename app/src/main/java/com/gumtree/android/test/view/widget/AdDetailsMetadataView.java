package com.gumtree.android.test.view.widget;

import com.gumtree.android.test.R;
import com.gumtree.android.test.model.bean.Metadata;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class AdDetailsMetadataView extends LinearLayout {

    private boolean mIsTablet;
    private LinearLayout mLinearLayoutL;
    private LinearLayout mLinearLayoutR;

    public AdDetailsMetadataView(Context context) {
        super(context);
    }

    public AdDetailsMetadataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AdDetailsMetadataView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressWarnings("ResourceType")
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mIsTablet = getResources().getBoolean(R.bool.is_tablet);
        if (mIsTablet) {
            setOrientation(HORIZONTAL);
            mLinearLayoutL = new LinearLayout(getContext());
            mLinearLayoutL.setOrientation(VERTICAL);
            addView(mLinearLayoutL, new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1));
            mLinearLayoutR = new LinearLayout(getContext());
            mLinearLayoutR.setOrientation(VERTICAL);
            addView(mLinearLayoutR, new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1));
        } else {
            setOrientation(VERTICAL);
        }

    }

    public void populateWith(List<Metadata> metadataList) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        int i = 0;
        for (Metadata data : metadataList) {
            LinearLayout container;
            if (mIsTablet) {
                if(i%2 == 0) {
                    container = mLinearLayoutL;
                } else {
                    container = mLinearLayoutR;
                }
            } else {
                container = this;
            }
            View metadataRow = inflater.inflate(R.layout.metadata_row, container, false);
            ((TextView) metadataRow.findViewById(R.id.metadata_name)).setText(data.getName());
            ((TextView) metadataRow.findViewById(R.id.metadata_value)).setText(data.getValue());
            container.addView(metadataRow);
            i++;
        }

    }
}
