package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    @Select("select * from sys_role where name = #{name}")
    SysRole selectByName(@Param("name") String name);

    @Select("select * from sys_role where status = 'ENABLED'")
    List<SysRole> selectRolesWitCanUse();
}
