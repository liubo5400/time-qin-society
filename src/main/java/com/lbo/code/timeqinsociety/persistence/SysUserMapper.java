package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    @Select("select * from user_info where username = #{username} and status = 'ENABLED'")
    SysUser selectByUsername(@Param("username") String username);
}
