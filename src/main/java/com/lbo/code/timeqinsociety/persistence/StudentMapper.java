package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    @Select("select * from sys_role where name = #{name}")
    Student selectByName(@Param("name") String name);

    @Select("select * from sys_role where status = 'ENABLED'")
    List<Student> selectRolesWitCanUse();
}
