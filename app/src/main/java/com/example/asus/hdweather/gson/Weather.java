package com.example.asus.hdweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ASUS on 2018/3/8.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public Update update;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;
}
