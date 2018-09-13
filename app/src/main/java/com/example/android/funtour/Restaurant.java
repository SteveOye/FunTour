package com.example.android.funtour;

import android.os.Parcel;
import android.os.Parcelable;

public class Restaurant implements Parcelable{

    private int mImageResource;

    private String mRestaurantName;

    public Restaurant(int imageResource, String restaurantName){
        mImageResource = imageResource;
        mRestaurantName = restaurantName;
    }

    protected Restaurant(Parcel in) {
        mImageResource = in.readInt();
        mRestaurantName = in.readString();
    }

    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    public int getImageResource(){
        return mImageResource;
    }

    public String getRestaurantName() {
        return mRestaurantName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mRestaurantName);
    }
}
