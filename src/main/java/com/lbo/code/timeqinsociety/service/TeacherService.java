package com.lbo.code.timeqinsociety.service;

import com.github.pagehelper.Page;
import com.lbo.code.timeqinsociety.domain.Teacher;

import java.util.Map;

public interface TeacherService {

    Page<Teacher> queryPage(Map<String, Object> params, int start, int length);

    Teacher get(Long id);

    Long create(Teacher teacher);

    void update(Teacher teacher);

    void delete(Long id);
}
