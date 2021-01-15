package com.zga.framework.controller;

import com.zga.framework.domain.WxMessagePushRecordDomain;
import com.zga.framework.facade.WxMessagePushRecordFacade;
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
    private WxMessagePushRecordFacade wxMessagePushRecordFacade;

    @RequestMapping("/pushRecord")
    public WxMessagePushRecordDomain pushRecord() {
        return wxMessagePushRecordFacade.queryById(1L);
    }
}
