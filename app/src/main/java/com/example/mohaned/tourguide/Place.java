package com.example.mohaned.tourguide;

import android.util.Log;

/**
 * Created by Mohaned on 4/22/2018.
 */

public class Place {

    private String Name;
    private String Address;
    private int imageResource = NO_PROVIDING_IMAGE;
    private static final int NO_PROVIDING_IMAGE = -1;
    private float Rate;

    public Place(String placeName, String placeAddress, int placeImage, double placeRate){
        Name = placeName;
        Address = placeAddress;
        imageResource = placeImage;
        Rate = (float) placeRate;
    }

    public String getPlaceName(){
        return Name;
    }

    public String getAddress(){
        return Address;
    }

    public int getImageResource(){
        return imageResource;
    }

    public float getRate(){
        return Rate;
    }

    public boolean hasImage(){
        return imageResource != NO_PROVIDING_IMAGE;
    }
}
