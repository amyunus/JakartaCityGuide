package com.amyunus.jakartacityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amyunus on 8/6/17.
 */

public class AboutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Set the fragment view
        View rootView = inflater.inflate(R.layout.activity_about, container, false);

        // Set the dummy text
        TextView credit = (TextView) rootView.findViewById(R.id.about_credit);
        credit.setText(R.string.credit);

        // Display the fragment
        return rootView;
    }
}
