package com.example.asus.hdweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 2018/3/8.
 */

public class Forecast {
    public String date;
    public String tmp_max;
    public String tmp_min;
    @SerializedName("cond_txt_d")
    public String txt_d;
}
