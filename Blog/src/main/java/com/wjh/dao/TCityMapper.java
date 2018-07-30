package com.wjh.dao;

import xaut.wjh.entity.TCity;

public interface TCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCity record);

    int insertSelective(TCity record);

    TCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCity record);

    int updateByPrimaryKey(TCity record);
}