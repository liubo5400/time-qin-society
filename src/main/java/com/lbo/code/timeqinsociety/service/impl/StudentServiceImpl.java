package com.lbo.code.timeqinsociety.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lbo.code.timeqinsociety.domain.Student;
import com.lbo.code.timeqinsociety.domain.Teacher;
import com.lbo.code.timeqinsociety.persistence.StudentMapper;
import com.lbo.code.timeqinsociety.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper mapper;

    @Override
    public Page<Student> queryPage(Map<String, Object> params, int start, int length) {
        PageHelper.offsetPage(start, length);
        return null;
    }

    @Override
    public Student get(Long id) {
        return null;
    }

    @Override
    public Long create(Student student) {
        return null;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Long id) {

    }
}
