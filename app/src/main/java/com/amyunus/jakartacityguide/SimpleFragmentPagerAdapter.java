package com.amyunus.jakartacityguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by amyunus on 8/6/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    /*
    * Class constructor
     */
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /*
     * Set the fragment based on fragment position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new LandmarksFragment();
        } else if (position == 3) {
            return new TransportsFragment();
        } else {
            return new AboutFragment();
        }
    }

    /*
     * Get how many of fragments available
     */
    @Override
    public int getCount() {
        return 5;
    }

}
