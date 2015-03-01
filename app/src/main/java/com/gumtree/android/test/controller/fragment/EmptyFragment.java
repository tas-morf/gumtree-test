package com.gumtree.android.test.controller.fragment;

import com.gumtree.android.test.R;
import com.gumtree.android.test.controller.activity.MainActivity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class EmptyFragment extends Fragment {


    public static EmptyFragment newInstance() {
        EmptyFragment fragment = new EmptyFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_not_implemented, container, false);
    }

}
