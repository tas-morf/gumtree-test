package com.gumtree.android.test.controller.fragment;

import com.gumtree.android.test.R;
import com.gumtree.android.test.controller.listener.OnAdSelectedListener;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Very basic fragment that contains a list of ad examples to select from. Since this wasn't part of the test,
 * it doesn't have any bells and whistles.
 */
public class AdExamplesFragment extends Fragment implements AdapterView.OnItemClickListener {

    private OnAdSelectedListener mListener;

    public static Fragment newInstance() {
        Fragment fragment = new AdExamplesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mListener = (OnAdSelectedListener)activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ad_examples, container, false);
        ListView mainList = (ListView) rootView.findViewById(R.id.example_ads_list);
        mainList.setOnItemClickListener(this);
        mainList.setAdapter(ArrayAdapter.createFromResource(getActivity(),
                R.array.navigation_items,
                android.R.layout.simple_list_item_1));
        
        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mListener.onAdSelected(position);
    }

}
