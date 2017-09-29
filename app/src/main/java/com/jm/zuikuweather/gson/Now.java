package com.jm.zuikuweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by t_jm on 2017/9/15.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
