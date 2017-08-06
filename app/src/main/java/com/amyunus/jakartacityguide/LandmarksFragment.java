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

        View rootView = inflater.inflate(R.layout.activity_fragment, container, false);

        final ArrayList<Attraction> aLandmarks = new ArrayList<>();

        aLandmarks.add(0, new Attraction("Monas","Jakarta Pusat",R.drawable.monas));
        aLandmarks.add(1, new Attraction("Kota Tua","Jakarta Barat",R.drawable.monas));
        aLandmarks.add(2, new Attraction("Taman Mini Indonesia Indah","Jakarta Timur",R.drawable.monas));
        aLandmarks.add(3, new Attraction("Museum Nasional","Jakarta Pusat",R.drawable.monas));
        aLandmarks.add(4, new Attraction("Taman Suropati","Jakarta Pusat",R.drawable.monas));
        aLandmarks.add(5, new Attraction("Museum Maritim","Jakarta Utara",R.drawable.monas));
        aLandmarks.add(6, new Attraction("Masjid Istiqlal","Jakarta Pusat",R.drawable.monas));
        aLandmarks.add(7, new Attraction("Ancol","Jakarta Utara",R.drawable.monas));
        aLandmarks.add(8, new Attraction("Kebun Binatang Ragunan","Jakarta Selatan",R.drawable.monas));
        aLandmarks.add(9, new Attraction("Museum Tekstil","Jakarta Barat",R.drawable.monas));

        AttractionAdapter attractionList = new AttractionAdapter(getActivity(), R.layout.list_item, aLandmarks);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment);
        listView.setAdapter(attractionList);

        return rootView;
    }
}
