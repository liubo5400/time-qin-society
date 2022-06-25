package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.SubjectPlan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SubjectPlanMapper extends BaseMapper<SubjectPlan> {

}
