package com.example.android.funtour;

import android.os.Parcel;
import android.os.Parcelable;

public class Location implements Parcelable{

    /** image of the tourism location*/
    private int mLocationImage;

    /** name of the tourism place */
    private String mLocationName;

    /** Created a new Location object.*/
    public Location(int locationImage, String locationName) {
        mLocationImage = locationImage;
        mLocationName = locationName;
    }

    protected Location(Parcel in) {
        mLocationImage = in.readInt();
        mLocationName = in.readString();
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    /**
     * Get the location image of the word.
     */
    public int getLocationImage() {
        return mLocationImage;
    }

    /**
     * Get the location name of the word.
     */
    public String getLocationName() {
        return mLocationName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mLocationImage);
        dest.writeString(mLocationName);
    }
}
