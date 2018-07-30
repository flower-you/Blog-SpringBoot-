package com.wjh.dao;

import xaut.wjh.entity.TArea;

public interface TAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TArea record);

    int insertSelective(TArea record);

    TArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TArea record);

    int updateByPrimaryKey(TArea record);
}