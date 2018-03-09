package com.example.asus.hdweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 2018/3/8.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;
    @SerializedName("cid")
    public String weatherId;

}
