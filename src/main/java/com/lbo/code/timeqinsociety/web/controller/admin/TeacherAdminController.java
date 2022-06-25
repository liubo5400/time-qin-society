package com.lbo.code.timeqinsociety.web.controller.admin;

import com.google.common.collect.Lists;
import com.lbo.code.timeqinsociety.domain.Subject;
import com.lbo.code.timeqinsociety.domain.Teacher;
import com.lbo.code.timeqinsociety.service.TeacherService;
import com.lbo.code.timeqinsociety.web.dto.req.QuerySubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.QueryTeacherReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveSubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveTeacherReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.CollectionRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 教师相关
 */
@Slf4j
@Api(tags = "教师管理相关")
@RestController
@RequestMapping(value = "/admin/teacher")
public class TeacherAdminController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "教师列表", notes = "")
    @GetMapping("/list")
    public CollectionRspDto<Teacher> list(@Valid @RequestBody QueryTeacherReqDto reqDto) {






        return new CollectionRspDto<>(0, Lists.newArrayList());
    }

    @ApiOperation(value = "保存教师", notes = "")
    @PostMapping
    public VoidRspDto save(@Valid @RequestBody SaveTeacherReqDto reqDto) {
        return new VoidRspDto();
    }

    @ApiOperation(value = "教师详情", notes = "")
    @GetMapping("/detail/{id}")
    public Teacher detail(@PathVariable(value = "id") Long id) {
        return Teacher.builder().build();
    }

    @ApiOperation(value = "操作教师", notes = "")
    @PostMapping("/operate/{id}")
    public VoidRspDto operate(@PathVariable(value = "id") Long id) {
        return new VoidRspDto();
    }

}
