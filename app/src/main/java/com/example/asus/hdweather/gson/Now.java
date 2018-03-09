package com.example.asus.hdweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 2018/3/8.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String information;
    @SerializedName("wind_dir")
    public String winddir;
    @SerializedName("wind_sc")
    public String windsc;
}
