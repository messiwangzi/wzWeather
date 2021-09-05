package com.wangziyu.wzweather.db;

import org.litepal.crud.DataSupport;

import lombok.Data;

/**
 * describe: 县/区
 * author: wangziyu
 * date: 2021/9/5
 **/
@Data
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
}
