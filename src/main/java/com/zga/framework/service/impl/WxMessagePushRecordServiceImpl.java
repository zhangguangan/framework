package com.zga.framework.service.impl;

import com.zga.framework.domain.WxMessagePushRecordDomain;
import com.zga.framework.orm.entity.WxMessagePushRecordEntity;
import com.zga.framework.orm.mapper.WxMessagePushRecordEntityMapper;
import com.zga.framework.service.WxMessagePushRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangguangan on 2021/1/15
 * description:
 */
@Service
public class WxMessagePushRecordServiceImpl extends BaseService<WxMessagePushRecordEntity, WxMessagePushRecordDomain> implements WxMessagePushRecordService {
    @Resource
    private WxMessagePushRecordEntityMapper wxMessagePushRecordEntityMapper;

    @Override
    public WxMessagePushRecordDomain queryById(Long id) {
        return entity2Vo(wxMessagePushRecordEntityMapper.selectByPrimaryKey(id));
    }
}
