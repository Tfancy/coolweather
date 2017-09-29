package com.jm.zuikuweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by t_jm on 2017/9/15.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
