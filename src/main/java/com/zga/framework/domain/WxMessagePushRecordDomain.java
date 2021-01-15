package com.zga.framework.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
@Getter
@Setter
public class WxMessagePushRecordDomain extends BaseDomain {

    private Long materialLibraryId;

    private String accountId;

    private String mediaId;

    private Date scheduleTime;

    private Integer messageType;

    private Integer pushType;

    private Integer pushStatus;

    private Integer failCanResendFlg;

    private String pushResult;

    private String msgId;

    private String msgDataId;

    private String clientMsgId;

    private String wxSendStatus;

    private String wxSendErrorMsg;

    private Integer totalCount;

    private Integer filterCount;

    private Integer sentCount;

    private Integer errorCount;

    private Integer readCount;

    private Integer favCount;

    private String pushCrowd;

    private String wxNotifyResult;
    private Long id;

    private String createdBy;

    private Date dateCreated;

    private String updatedBy;

    private Date dateUpdated;
}
