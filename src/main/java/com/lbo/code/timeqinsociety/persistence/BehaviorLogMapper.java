package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.BehaviorLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BehaviorLogMapper extends BaseMapper<BehaviorLog> {

}
