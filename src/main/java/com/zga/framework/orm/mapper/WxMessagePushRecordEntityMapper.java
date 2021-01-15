package com.zga.framework.orm.mapper;

import com.zga.framework.orm.entity.WxMessagePushRecordEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WxMessagePushRecordEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxMessagePushRecordEntity record);

    int insertSelective(WxMessagePushRecordEntity record);

    WxMessagePushRecordEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxMessagePushRecordEntity record);

    int updateByPrimaryKeyWithBLOBs(WxMessagePushRecordEntity record);

    int updateByPrimaryKey(WxMessagePushRecordEntity record);
}