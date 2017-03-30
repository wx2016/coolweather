package com.example.wx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wx on 2017/3/29.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
