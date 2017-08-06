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

public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create array and set some values
        final ArrayList<Attraction> aRestaurants = new ArrayList<>();
        aRestaurants.add(0, new Attraction("Lara Djonggrang","Jakarta Pusat",R.drawable.larad));
        aRestaurants.add(1, new Attraction("Bandar Djakarta","Jakarta Utara",R.drawable.bandarjakarta));
        aRestaurants.add(2, new Attraction("Ikan Bakar Cianjur","Jakarta Pusat",R.drawable.ibc));
        aRestaurants.add(3, new Attraction("Harum Manis","Jakarta Pusat",R.drawable.harum));
        aRestaurants.add(4, new Attraction("Seribu Rasa","Jakarta Barat",R.drawable.seriburasa));
        aRestaurants.add(5, new Attraction("Sate Khas Senayan","Jakarta Selatan",R.drawable.satekhas));


        // Set the fragment view
        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        // Set each item using adapter view
        AttractionAdapter attractionList = new AttractionAdapter(getActivity(), R.layout.list_item, aRestaurants);

        // Attach the adapter view into the fragment
        ListView listView = (ListView) rootView.findViewById(R.id.fragment);
        listView.setAdapter(attractionList);

        // Display the fragment
        return rootView;
    }
}
