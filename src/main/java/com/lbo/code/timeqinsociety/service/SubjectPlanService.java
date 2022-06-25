package com.lbo.code.timeqinsociety.service;

import com.github.pagehelper.Page;
import com.lbo.code.timeqinsociety.domain.SubjectPlan;

import java.util.Map;

public interface SubjectPlanService {

    Page<SubjectPlan> queryPage(Map<String, Object> params, int start, int length);

    SubjectPlan get(Long id);

    Long create(SubjectPlan subjectPlan);

    void update(SubjectPlan subjectPlan);

    void delete(Long id);
}
