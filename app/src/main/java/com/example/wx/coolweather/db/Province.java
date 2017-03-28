package com.example.wx.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wx on 2017/3/28.
 */

public class Province extends DataSupport{
    private int id;

    public String getProcinceName() {
        return procinceName;
    }

    public void setProcinceName(String procinceName) {
        this.procinceName = procinceName;
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

    private String procinceName;
    private int provinceCode;

}
