package com.sunshine.app.common.base.dao;

import com.sunshine.app.common.base.entity.MsgCodeInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgCodeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgCodeInfo record);

    int insertSelective(MsgCodeInfo record);

    MsgCodeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgCodeInfo record);

    int updateByPrimaryKey(MsgCodeInfo record);
}