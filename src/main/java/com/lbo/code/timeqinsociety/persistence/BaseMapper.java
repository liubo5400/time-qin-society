package com.lbo.code.timeqinsociety.persistence;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

    // 这里可以放一些公共的方法
}
