package com.amyunus.jakartacityguide;

/**
 * Created by amyunus on 8/6/17.
 */

public class Attraction {

    /*
     * Class variable
     */
    String mAttraction;

    String mLocation;

    int mThumbnail;

    /*
     * Class constructor
     * String attraction : attraction title
     * String location : attraction location
     * int thumbnail : attraction image (res id)
     */
    public Attraction(String attraction, String location, int thumbnail) {
        mAttraction = attraction;
        mLocation = location;
        mThumbnail = thumbnail;
    }

    /*
     * Get the attraction title value
     */
    public String getAttraction() {
        return mAttraction;
    }

    /*
     * Get the attraction location value
     */
    public String getLocation() {
        return mLocation;
    }

    /*
     * Get the attraction thumbnail
     */
    public int getThumbnail() {
        return mThumbnail;
    }

    /*
     * Override toString method of the object class
     */
    @Override
    public String toString() {
        return "Attraction: " + mAttraction + "\n" +
                "Location: " + mLocation + "\n" +
                "Image: " + mThumbnail;
    }
}
