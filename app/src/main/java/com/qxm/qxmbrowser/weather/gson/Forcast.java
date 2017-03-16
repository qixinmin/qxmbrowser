package com.qxm.qxmbrowser.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xinmin on 16/03/2017.
 */

public class Forcast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
