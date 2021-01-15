package com.zga.framework.domain.res;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 3715837692826438329L;
    private String flag;
    private String code;
    private String msg;
    private T data;

    public Response() {
    }

    public Response success() {
        this.flag = RespFlagEnum.SUCCESS.getCode();
        return this;
    }

    public Response success(T data) {
        this.data = data;
        return this.success();
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Response success(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        return this.success(data);
    }

    public Response success(ResponseService responseService, T data) {
        this.code = responseService.getResponseCode();
        this.msg = responseService.getResponseMessage();
        return this.success(data);
    }

    public Response success(ResponseService responseService) {
        if (responseService == null) {
            return this.success();
        } else {
            this.code = responseService.getResponseCode();
            this.msg = responseService.getResponseMessage();
            return this.success();
        }
    }

    public boolean checkIfSuccess() {
        return RespFlagEnum.SUCCESS.getCode().equals(this.flag);
    }

    public boolean checkIfFail() {
        return !this.checkIfSuccess();
    }

    public Response fail() {
        this.flag = RespFlagEnum.FAIL.getCode();
        return this;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Response fail(String code, String msg) {
        this.code = code;
        this.msg = msg;
        return this.fail();
    }

    public Response fail(ResponseService responseService) {
        this.code = responseService.getResponseCode();
        this.msg = responseService.getResponseMessage();
        return this.fail();
    }

    public Response fail(ResponseService responseService, T data) {
        this.code = responseService.getResponseCode();
        this.msg = responseService.getResponseMessage();
        this.data = data;
        return this.fail();
    }

    public Response fail(Response response) {
        this.code = response.getCode();
        this.msg = response.getMsg();
        return this.fail();
    }

    public ResponseService genResponseService() {
        return new DefaultCodeMsgResponse(this.code, this.msg);
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}