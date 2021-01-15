package com.zga.framework.controller;

import com.zga.framework.orm.entity.WxMessagePushRecordEntity;
import com.zga.framework.service.WxMessagePushRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
@RestController
public class WxMessagePushRecordController {
    @Resource
    private WxMessagePushRecordService wxMessagePushRecordService;

    @RequestMapping("/pushRecord")
    public WxMessagePushRecordEntity pushRecord() {
        return wxMessagePushRecordService.queryById(1L);
    }
}
