package com.example.wx.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wx on 2017/3/28.
 */

public class Province extends DataSupport{
    private int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private String provinceName;
    private int provinceCode;

}
