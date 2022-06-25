package com.lbo.code.timeqinsociety.persistence;

import com.lbo.code.timeqinsociety.domain.Subject;
import com.lbo.code.timeqinsociety.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SubjectMapper extends BaseMapper<Subject> {

}
