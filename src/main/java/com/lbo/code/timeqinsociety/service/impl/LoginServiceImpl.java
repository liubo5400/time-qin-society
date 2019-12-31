package com.lbo.code.timeqinsociety.service.impl;

import com.lbo.code.timeqinsociety.domain.StudentInfo;
import com.lbo.code.timeqinsociety.domain.TeacherInfo;
import com.lbo.code.timeqinsociety.domain.UserInfo;
import com.lbo.code.timeqinsociety.persistence.StudentInfoMapper;
import com.lbo.code.timeqinsociety.persistence.UserInfoMapper;
import com.lbo.code.timeqinsociety.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public StudentInfo studentLogin(String username, String password) {
        return null;
    }

    @Override
    public TeacherInfo teacherWXLogin(String openId) {
        return null;
    }

    @Override
    public StudentInfo studentWXLogin(String openId) {
        return null;
    }

    @Override
    public UserInfo checkTeacherUsername(String username) {
        UserInfo userInfo = userInfoMapper.selectByUsername(username);
        return userInfo;
    }
}
