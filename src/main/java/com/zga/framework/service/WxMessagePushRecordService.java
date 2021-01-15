package com.zga.framework.service;

import com.zga.framework.domain.WxMessagePushRecordDomain;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public interface WxMessagePushRecordService {
    WxMessagePushRecordDomain queryById(Long id);
}
