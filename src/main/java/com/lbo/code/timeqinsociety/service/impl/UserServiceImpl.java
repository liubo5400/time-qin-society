package com.lbo.code.timeqinsociety.service.impl;

import com.lbo.code.timeqinsociety.domain.UserInfo;
import com.lbo.code.timeqinsociety.persistence.UserInfoMapper;
import com.lbo.code.timeqinsociety.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }
}
