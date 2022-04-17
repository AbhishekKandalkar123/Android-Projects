package com.akan.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    private String murl;

    public Earthquake(double magnitude, String location, long TimeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        murl = url;
        mTimeInMilliseconds = TimeInMilliseconds;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public String getMurl() {
        return murl;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
