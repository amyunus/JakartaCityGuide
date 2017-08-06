package com.amyunus.jakartacityguide;

/**
 * Created by amyunus on 8/6/17.
 */

public class Attraction {

    String mAttraction;

    String mLocation;

    int mThumbnail;

    public Attraction(String attraction, String location, int image) {
        mAttraction = attraction;
        mLocation = location;
        mThumbnail = image;
    }

    public String getAttraction() {
        return mAttraction;
    }

    public String getLocation() {
        return mLocation;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    @Override
    public String toString() {
        return "Attraction: " + mAttraction + "\n" +
                "Location: " + mLocation + "\n" +
                "Image: " + mThumbnail;
    }
}
