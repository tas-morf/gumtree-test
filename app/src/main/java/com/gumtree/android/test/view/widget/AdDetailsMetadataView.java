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

/**
 * Since this is a little bit more complex than the rest of the views (shows one or two columns and
 * can handle multiple rows), it deserves to be separated from the rest of the UI, and handled in isolation.
 */
public class AdDetailsMetadataView extends LinearLayout {

    private boolean mIsTabletLandscape;
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
        mIsTabletLandscape = getResources().getBoolean(R.bool.is_tablet_land);
        if (mIsTabletLandscape) {
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
            if (mIsTabletLandscape) {
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
