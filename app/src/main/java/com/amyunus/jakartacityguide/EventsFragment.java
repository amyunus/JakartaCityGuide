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

public class EventsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create array and set some values
        final ArrayList<Attraction> aEvents = new ArrayList<>();
        aEvents.add(0, new Attraction("Independence Day Bazaar","Plaza Indonesia",R.drawable.aug5));
        aEvents.add(1, new Attraction("Reformusical","Taman Ismail Marzuki",R.drawable.reformusical));
        aEvents.add(2, new Attraction("Liam Gallagher","Econvention Ancol",R.drawable.liamg));
        aEvents.add(3, new Attraction("We The Fest","JIExpo Kemayoran",R.drawable.wethefest));
        aEvents.add(4, new Attraction("Video Making","Concrete Coworking",R.drawable.videmaking));
        aEvents.add(5, new Attraction("The Beatles","Hotel Indonesia Kempinski",R.drawable.beatles));

        // Set the fragment view
        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        // Set each item using adapter view
        AttractionAdapter attractionList = new AttractionAdapter(getActivity(), R.layout.list_item, aEvents);

        // Attach the adapter view into the fragment
        ListView listView = (ListView) rootView.findViewById(R.id.fragment);
        listView.setAdapter(attractionList);

        // Display the fragment
        return rootView;
    }
}
