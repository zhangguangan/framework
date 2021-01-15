package com.zga.framework.facade;

import com.zga.framework.domain.WxMessagePushRecordDomain;

public interface WxMessagePushRecordFacade {

    WxMessagePushRecordDomain queryById(Long id);
}
