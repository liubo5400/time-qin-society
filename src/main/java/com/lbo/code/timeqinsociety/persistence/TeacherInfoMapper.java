package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.TeacherInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TeacherInfoMapper extends BaseMapper<TeacherInfo> {

    @Select("select * from teacher_info where username = #{username} and status = 'ENABLED'")
    TeacherInfo selectByUsername(@Param("username") String username);
}
