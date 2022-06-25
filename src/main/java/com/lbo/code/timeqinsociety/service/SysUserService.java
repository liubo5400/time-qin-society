package com.lbo.code.timeqinsociety.service;

import com.github.pagehelper.Page;
import com.lbo.code.timeqinsociety.domain.SysUser;

import java.util.Map;

public interface SysUserService {

    Page<SysUser> queryPage(Map<String,Object> params, int start, int length);

    SysUser get(Long id);

    Long create(SysUser sysUser);

    void update(SysUser sysUser);

    void delete(Long id);


}
