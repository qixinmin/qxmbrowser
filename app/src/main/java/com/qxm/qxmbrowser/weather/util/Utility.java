package com.qxm.qxmbrowser.weather.util;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.qxm.qxmbrowser.weather.db.City;
import com.qxm.qxmbrowser.weather.db.Country;
import com.qxm.qxmbrowser.weather.db.Province;
import com.qxm.qxmbrowser.weather.gson.Weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by xinmin on 15/03/2017.
 */

public class Utility {
    public static boolean hanleProvinceResponse(String response) {
        if(!TextUtils.isEmpty(response)) {
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i=0; i < allProvinces.length(); ++i) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response, int proviceId) {
        if(!TextUtils.isEmpty(response)) {
            try{
                JSONArray allCities = new JSONArray(response);
                for(int i=0; i < allCities.length(); ++i) {
                    JSONObject provinceObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(provinceObject.getString("name"));
                    city.setCityCode(provinceObject.getInt("id"));
                    city.setProvinceId(proviceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static boolean handleCountryResponse(String response, int cityId) {
        if(!TextUtils.isEmpty(response)) {
            try{
                JSONArray allCountries = new JSONArray(response);
                for(int i=0; i < allCountries.length(); ++i) {
                    JSONObject provinceObject = allCountries.getJSONObject(i);
                    Country country = new Country();
                    country.setCountryName(provinceObject.getString("name"));
                    country.setWeatherId(provinceObject.getString("weather_id"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static Weather handleWeatherResponse(String response) {
        try{
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return  new Gson().fromJson(weatherContent, Weather.class);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
