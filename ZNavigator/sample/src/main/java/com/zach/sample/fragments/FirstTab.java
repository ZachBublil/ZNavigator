package com.zach.sample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zach.sample.R;
import com.zach.znavigator.ZNavigation.ZNavigation;
import com.zach.znavigator.ZNavigation.ZNavigationFragment;

/**
 * Created by Zach on 11/19/2017.
 */

public class FirstTab extends ZNavigationFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_first, null);
        TextView textView = (TextView) rootView.findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ZNavigation.openChildFragment(getFragmentManager(),new ChildFragment());
            }
        });

        return rootView;
    }

    @Override
    public void onFragmentHidden() {
        /* I care about when this fragment hidden */
    }

    @Override
    public void onFragmentShowen() {
/* I care about when this fragment shows*/
    }
}
