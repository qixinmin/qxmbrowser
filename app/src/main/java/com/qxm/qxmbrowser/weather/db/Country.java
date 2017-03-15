package com.qxm.qxmbrowser.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xinmin on 15/03/2017.
 */

//县级单位
public class Country extends DataSupport {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

}
