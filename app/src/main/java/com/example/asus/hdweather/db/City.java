package com.example.asus.hdweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ASUS on 2018/3/8.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
