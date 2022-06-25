package com.lbo.code.timeqinsociety.service;

import com.github.pagehelper.Page;
import com.lbo.code.timeqinsociety.domain.Student;

import java.util.Map;

public interface StudentService {

    Page<Student> queryPage(Map<String, Object> params, int start, int length);

    Student get(Long id);

    Long create(Student student);

    void update(Student student);

    void delete(Long id);
}
