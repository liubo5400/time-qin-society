package com.lbo.code.timeqinsociety.service;

import com.lbo.code.timeqinsociety.domain.TeacherInfo;

public interface TeacherService {

    Long create(TeacherInfo teacherInfo);

    void update(TeacherInfo teacherInfo);
}
