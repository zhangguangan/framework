package com.zga.framework.domain.res;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public enum RespFlagEnum {
    SUCCESS("S", "成功"),
    FAIL("F", "失败");

    private String code;
    private String desc;

    private RespFlagEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
