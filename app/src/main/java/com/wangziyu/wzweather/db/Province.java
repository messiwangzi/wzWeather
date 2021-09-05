package com.wangziyu.wzweather.db;

import org.litepal.crud.DataSupport;

import lombok.Data;


/**
 * describe: 省
 * author: wangziyu
 * date: 2021/9/5
 **/
@Data
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
}
