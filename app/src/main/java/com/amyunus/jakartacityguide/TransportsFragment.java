package com.amyunus.jakartacityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by amyunus on 8/6/17.
 */

public class TransportsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create array and set some values
        final ArrayList<Attraction> aTransports = new ArrayList<>();
        aTransports.add(0, new Attraction("KRL","Jabodetabek",R.drawable.krl));
        aTransports.add(1, new Attraction("TransJakarta","Jakarta",R.drawable.transjakarta));
        aTransports.add(2, new Attraction("Angkot","Jabodetabek",R.drawable.angkot));
        aTransports.add(3, new Attraction("Bemo","Jabodetabek",R.drawable.bemo));

        // Set the fragment view
        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        // Set each item using adapter view
        AttractionAdapter attractionList = new AttractionAdapter(getActivity(), R.layout.list_item, aTransports);

        // Attach the adapter view into the fragment
        ListView listView = (ListView) rootView.findViewById(R.id.fragment);
        listView.setAdapter(attractionList);

        // Display the fragment
        return rootView;
    }
}
