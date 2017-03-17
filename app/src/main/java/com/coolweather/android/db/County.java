package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/17.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherID;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
