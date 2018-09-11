package com.example.android.funtour;

import android.os.Parcel;
import android.os.Parcelable;

public class Event implements Parcelable{

    /* image for the event*/
    private int mEventImage;

    /* name for the event*/
    private String mEventName;

    public Event (int eventImage, String eventName){
        mEventImage = eventImage;
        mEventName = eventName;
    }

    protected Event(Parcel in) {
        mEventImage = in.readInt();
        mEventName = in.readString();
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };

    public int getEventImage() {
        return mEventImage;
    }

    public String getEventName() {
        return mEventName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mEventImage);
        dest.writeString(mEventName);
    }
}
