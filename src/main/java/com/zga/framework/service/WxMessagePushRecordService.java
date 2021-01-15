package com.zga.framework.service;

import com.zga.framework.orm.entity.WxMessagePushRecordEntity;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
public interface WxMessagePushRecordService {
    public WxMessagePushRecordEntity queryById(Long id);
}
