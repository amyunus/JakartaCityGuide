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

public class LandmarksFragment  extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create array and set some values
        final ArrayList<Attraction> aLandmarks = new ArrayList<>();
        aLandmarks.add(0, new Attraction("Monas","Jakarta Pusat",R.drawable.monas));
        aLandmarks.add(1, new Attraction("Kota Tua","Jakarta Barat",R.drawable.kotatua));
        aLandmarks.add(2, new Attraction("Taman Mini Indonesia Indah","Jakarta Timur",R.drawable.tmii));
        aLandmarks.add(3, new Attraction("Museum Nasional","Jakarta Pusat",R.drawable.munas));
        aLandmarks.add(4, new Attraction("Taman Suropati","Jakarta Pusat",R.drawable.suropati));
        aLandmarks.add(5, new Attraction("Museum Maritim","Jakarta Utara",R.drawable.maritim));
        aLandmarks.add(6, new Attraction("Masjid Istiqlal","Jakarta Pusat",R.drawable.istiqlal));
        aLandmarks.add(7, new Attraction("Ancol","Jakarta Utara",R.drawable.ancol));
        aLandmarks.add(8, new Attraction("Kebun Binatang Ragunan","Jakarta Selatan",R.drawable.ragunan));
        aLandmarks.add(9, new Attraction("Museum Tekstil","Jakarta Barat",R.drawable.museumtekstil));

        // Set the fragment view
        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        // Set each item using adapter view
        AttractionAdapter attractionList = new AttractionAdapter(getActivity(), R.layout.list_item, aLandmarks);

        // Attach the adapter view into the fragment
        ListView listView = (ListView) rootView.findViewById(R.id.fragment);
        listView.setAdapter(attractionList);

        // Display the fragment
        return rootView;
    }
}
