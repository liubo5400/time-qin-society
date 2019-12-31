package com.lbo.code.timeqinsociety.service.impl;

import com.lbo.code.timeqinsociety.domain.TeacherInfo;
import com.lbo.code.timeqinsociety.persistence.TeacherInfoMapper;
import com.lbo.code.timeqinsociety.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    @Override
    public Long create(TeacherInfo teacherInfo) {
        teacherInfoMapper.insert(teacherInfo);
        return teacherInfo.getId();
    }

    @Override
    public void update(TeacherInfo teacherInfo) {
        teacherInfoMapper.updateByPrimaryKey(teacherInfo);
    }
}
