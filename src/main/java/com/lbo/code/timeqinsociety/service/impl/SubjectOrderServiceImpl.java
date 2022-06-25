package com.lbo.code.timeqinsociety.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lbo.code.timeqinsociety.domain.Subject;
import com.lbo.code.timeqinsociety.domain.SubjectOrder;
import com.lbo.code.timeqinsociety.persistence.SubjectOrderMapper;
import com.lbo.code.timeqinsociety.service.SubjectOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class SubjectOrderServiceImpl implements SubjectOrderService {

    @Autowired
    private SubjectOrderMapper mapper;

    @Override
    public Page<Subject> queryPage(Map<String, Object> params, int start, int length) {
        PageHelper.offsetPage(start, length);
        return null;
    }

    @Override
    public Subject get(Long id) {
        return null;
    }

    @Override
    public Long create(Subject subject) {
        return null;
    }

    @Override
    public void update(Subject subject) {

    }

    @Override
    public void delete(Long id) {

    }
}
