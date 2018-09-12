package com.example.android.funtour;

public class Weather {
    /**
     * Temperature value
     */
    private String mTemperature;
    /**
     * image of the tourism location
     */
    private int mConditionImage;

    /**
     * condition of location
     */
    private String mCondition;

    private String mLocation;
    /**
     * Created a new Location object.
     */
    public Weather(String temperature, int conditionImage, String condition, String location) {
        mTemperature = temperature;
        mConditionImage = conditionImage;
        mCondition = condition;
        mLocation = location;
    }

    public String getTemperature() {
        return mTemperature;
    }

    public int getConditionImage() {
        return mConditionImage;
    }

    public String getCondition() {
        return mCondition;
    }

    public String getLocation() {
        return mLocation;
    }
}
