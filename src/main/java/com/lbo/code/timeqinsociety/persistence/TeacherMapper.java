package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

    @Select("select * from teacher_info where username = #{username} and status = 'ENABLED'")
    Teacher selectByUsername(@Param("username") String username);
}
