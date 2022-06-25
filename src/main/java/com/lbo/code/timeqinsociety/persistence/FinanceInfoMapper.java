package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.FinanceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FinanceInfoMapper extends BaseMapper<FinanceInfo> {

    @Select("select * from sys_role where name = #{name}")
    FinanceInfo selectByName(@Param("name") String name);

    @Select("select * from sys_role where status = 'ENABLED'")
    List<FinanceInfo> selectRolesWitCanUse();
}
