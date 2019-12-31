package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.TeacherInfo;
import com.lbo.code.timeqinsociety.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Select("select * from user_info where username = #{username} and status = 'ENABLED'")
    UserInfo selectByUsername(@Param("username") String username);
}
