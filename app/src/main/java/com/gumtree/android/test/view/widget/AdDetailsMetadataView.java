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

    public AdDetailsMetadataView(Context context) {
        super(context);
    }

    public AdDetailsMetadataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AdDetailsMetadataView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(VERTICAL);
    }

    public void populateWith(List<Metadata> metadataList) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        for(Metadata data : metadataList) {
            View metadataRow = inflater.inflate(R.layout.metadata_row, this, false);
            ((TextView)metadataRow.findViewById(R.id.metadata_name)).setText(data.getName());
            ((TextView)metadataRow.findViewById(R.id.metadata_value)).setText(data.getValue());
            addView(metadataRow);
        }
    }
}
