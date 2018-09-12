package com.example.android.funtour;

import android.os.Parcel;
import android.os.Parcelable;

public class Museum implements Parcelable {

    private int mImageResource;

    private String mMuseumName;

    /** Created a new Location object.*/
    public Museum(int imageResource, String museumName){
        mImageResource = imageResource;
        mMuseumName = museumName;
    }

    protected Museum(Parcel in) {
        mImageResource = in.readInt();
        mMuseumName = in.readString();
    }

    public static final Creator<Museum> CREATOR = new Creator<Museum>() {
        @Override
        public Museum createFromParcel(Parcel in) {
            return new Museum(in);
        }

        @Override
        public Museum[] newArray(int size) {
            return new Museum[size];
        }
    };

    public int getImageResource(){
        return mImageResource;
    }

    public String getMuseumName() {
        return mMuseumName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mMuseumName);
    }
}
