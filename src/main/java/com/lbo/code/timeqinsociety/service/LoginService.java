package com.lbo.code.timeqinsociety.service;

import com.lbo.code.timeqinsociety.domain.StudentInfo;
import com.lbo.code.timeqinsociety.domain.TeacherInfo;
import com.lbo.code.timeqinsociety.domain.UserInfo;

public interface LoginService {

    StudentInfo studentLogin(String username, String password);

    TeacherInfo teacherWXLogin(String openId);

    StudentInfo studentWXLogin(String openId);

    UserInfo checkTeacherUsername(String username);
}
