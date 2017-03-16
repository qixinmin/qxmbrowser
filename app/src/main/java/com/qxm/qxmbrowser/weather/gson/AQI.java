package com.qxm.qxmbrowser.weather.gson;

/**
 * Created by xinmin on 16/03/2017.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
