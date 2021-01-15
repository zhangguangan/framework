package com.zga.framework.orm;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
@Getter
@Setter
public class BaseEntity {
    private Long id;

    private String createdBy;

    private Date dateCreated;

    private String updatedBy;

    private Date dateUpdated;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
