package com.zga.framework.domain.res;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public class DefaultCodeMsgResponse implements ResponseService {
    private String responseCode;
    private String responseMessage;

    public DefaultCodeMsgResponse(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }
}
