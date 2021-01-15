package com.zga.framework.facade.Impl;

import com.zga.framework.domain.WxMessagePushRecordDomain;
import com.zga.framework.facade.WxMessagePushRecordFacade;
import com.zga.framework.service.WxMessagePushRecordService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
@Service
@Log4j2
public class WxMessagePushRecordFacadeImpl implements WxMessagePushRecordFacade {
    @Resource
    private WxMessagePushRecordService wxMessagePushRecordService;


    @Override
    public WxMessagePushRecordDomain queryById(Long id) {

        return wxMessagePushRecordService.queryById(id);
    }
}
