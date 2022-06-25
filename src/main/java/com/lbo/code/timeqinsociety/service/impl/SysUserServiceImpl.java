package com.lbo.code.timeqinsociety.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lbo.code.timeqinsociety.domain.SysUser;
import com.lbo.code.timeqinsociety.persistence.SysUserMapper;
import com.lbo.code.timeqinsociety.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper mapper;


    @Override
    public Page<SysUser> queryPage(Map<String, Object> params, int start, int length) {
        PageHelper.offsetPage(start, length);
        return null;
    }

    @Override
    public SysUser get(Long id) {
        return null;
    }

    @Override
    public Long create(SysUser sysUser) {
        return null;
    }

    @Override
    public void update(SysUser sysUser) {

    }

    @Override
    public void delete(Long id) {

    }
}
