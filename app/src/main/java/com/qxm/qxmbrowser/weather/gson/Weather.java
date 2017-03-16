package com.qxm.qxmbrowser.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xinmin on 16/03/2017.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forcast")
    public List<Forcast> forecastList;
}
