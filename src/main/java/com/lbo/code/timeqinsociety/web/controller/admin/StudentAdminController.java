package com.lbo.code.timeqinsociety.web.controller.admin;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lbo.code.timeqinsociety.domain.Student;
import com.lbo.code.timeqinsociety.domain.Teacher;
import com.lbo.code.timeqinsociety.service.StudentService;
import com.lbo.code.timeqinsociety.web.dto.req.QueryStudentReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.QueryTeacherReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveStudentReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveTeacherReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.CollectionRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * 学生相关
 */
@Slf4j
@Api(tags = "学生管理相关")
@RestController
@RequestMapping(value = "/admin/student")
public class StudentAdminController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "学生列表", notes = "")
    @GetMapping("/list")
    public CollectionRspDto<Student> list(@Valid @RequestBody QueryStudentReqDto reqDto) {

        Map<String,Object> params = Maps.newHashMap();


        return new CollectionRspDto<>(0, Lists.newArrayList());
    }

    @ApiOperation(value = "保存学生", notes = "")
    @PostMapping
    public VoidRspDto save(@Valid @RequestBody SaveStudentReqDto reqDto) {
        return new VoidRspDto();
    }

    @ApiOperation(value = "学生详情", notes = "")
    @GetMapping("/detail/{id}")
    public Student detail(@PathVariable(value = "id") Long id) {
        return Student.builder().build();
    }

    @ApiOperation(value = "操作学生", notes = "")
    @PostMapping("/operate/{id}")
    public VoidRspDto operate(@PathVariable(value = "id") Long id) {
        return new VoidRspDto();
    }

}
