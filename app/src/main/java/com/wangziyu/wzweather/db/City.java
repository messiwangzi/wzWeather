package com.wangziyu.wzweather.db;

import org.litepal.crud.DataSupport;

import lombok.Data;

/**
 * describe: 城市
 * author: wangziyu
 * date: 2021/9/5
 **/
@Data
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
}
