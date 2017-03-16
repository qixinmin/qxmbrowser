package com.qxm.qxmbrowser.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xinmin on 16/03/2017.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
         @SerializedName("loc")
        public String updateTime;
    }

}

