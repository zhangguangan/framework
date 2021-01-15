package com.zga.framework.domain;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public class BaseDomain implements Serializable {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
