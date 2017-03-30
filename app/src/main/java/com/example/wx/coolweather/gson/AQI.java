package com.example.wx.coolweather.gson;

/**
 * Created by wx on 2017/3/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
