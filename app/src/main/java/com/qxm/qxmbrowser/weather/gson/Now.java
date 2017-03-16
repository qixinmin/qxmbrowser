package com.qxm.qxmbrowser.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xinmin on 16/03/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
