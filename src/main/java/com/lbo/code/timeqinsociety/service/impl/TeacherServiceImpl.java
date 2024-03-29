package com.lbo.code.timeqinsociety.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lbo.code.timeqinsociety.domain.Teacher;
import com.lbo.code.timeqinsociety.persistence.TeacherMapper;
import com.lbo.code.timeqinsociety.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper mapper;

    @Override
    public Page<Teacher> queryPage(Map<String, Object> params, int start, int length) {
        PageHelper.offsetPage(start, length);
        return null;
    }

    @Override
    public Teacher get(Long id) {
        return null;
    }

    @Override
    public Long create(Teacher teacher) {
        return null;
    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public void delete(Long id) {

    }
}
