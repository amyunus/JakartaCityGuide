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

public class TransportsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_list_item, container, false);

        TextView activityId = (TextView) rootView.findViewById(R.id.activity_id);

        activityId.setText(R.string.transports);

        return rootView;
    }
}
