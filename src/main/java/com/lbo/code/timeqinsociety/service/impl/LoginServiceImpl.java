package com.lbo.code.timeqinsociety.service.impl;

import com.lbo.code.timeqinsociety.domain.Student;
import com.lbo.code.timeqinsociety.domain.Teacher;
import com.lbo.code.timeqinsociety.domain.SysUser;
import com.lbo.code.timeqinsociety.persistence.StudentMapper;
import com.lbo.code.timeqinsociety.persistence.SysUserMapper;
import com.lbo.code.timeqinsociety.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student studentLogin(String username, String password) {
        return null;
    }

    @Override
    public Teacher teacherWXLogin(String openId) {
        return null;
    }

    @Override
    public Student studentWXLogin(String openId) {
        return null;
    }

    @Override
    public SysUser checkTeacherUsername(String username) {
        SysUser sysUser = sysUserMapper.selectByUsername(username);
        return sysUser;
    }
}
