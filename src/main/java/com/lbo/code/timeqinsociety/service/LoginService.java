package com.lbo.code.timeqinsociety.service;

import com.lbo.code.timeqinsociety.domain.Student;
import com.lbo.code.timeqinsociety.domain.SysUser;
import com.lbo.code.timeqinsociety.domain.Teacher;

public interface LoginService {

    Student studentLogin(String username, String password);

    Teacher teacherWXLogin(String openId);

    Student studentWXLogin(String openId);

    SysUser checkTeacherUsername(String username);
}
