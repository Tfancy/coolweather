package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by t_jm on 2017/9/15.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature{

        public String max;

        public String min;

    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }
}