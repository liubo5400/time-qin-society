package com.lbo.code.timeqinsociety.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lbo.code.timeqinsociety.domain.SubjectPlan;
import com.lbo.code.timeqinsociety.persistence.SubjectPlanMapper;
import com.lbo.code.timeqinsociety.service.SubjectPlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class SubjectPlanServiceImpl implements SubjectPlanService {

    @Autowired
    private SubjectPlanMapper mapper;

    @Override
    public Page<SubjectPlan> queryPage(Map<String, Object> params, int start, int length) {
        PageHelper.offsetPage(start, length);
        return null;
    }

    @Override
    public SubjectPlan get(Long id) {
        return null;
    }

    @Override
    public Long create(SubjectPlan subjectPlan) {
        return null;
    }

    @Override
    public void update(SubjectPlan subjectPlan) {

    }

    @Override
    public void delete(Long id) {

    }
}
