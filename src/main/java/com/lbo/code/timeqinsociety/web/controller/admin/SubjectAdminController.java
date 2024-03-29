package com.lbo.code.timeqinsociety.web.controller.admin;

import com.google.common.collect.Lists;
import com.lbo.code.timeqinsociety.domain.Subject;
import com.lbo.code.timeqinsociety.web.dto.req.QuerySubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveSubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.CollectionRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 课程相关
 */
@Slf4j
@Api(tags = "课程管理相关")
@RestController
@RequestMapping(value = "/admin/subject")
public class SubjectAdminController {


    @ApiOperation(value = "课程列表", notes = "")
    @GetMapping("/list")
    public CollectionRspDto<Subject> list(@Valid @RequestBody QuerySubjectReqDto reqDto) {
        return new CollectionRspDto<>(0, Lists.newArrayList());
    }

    @ApiOperation(value = "保存课程", notes = "")
    @PostMapping
    public VoidRspDto save(@Valid @RequestBody SaveSubjectReqDto reqDto) {
        return new VoidRspDto();
    }

    @ApiOperation(value = "课程详情", notes = "")
    @GetMapping("/detail/{id}")
    public Subject detail(@PathVariable(value = "id") Long id) {
        return Subject.builder().build();
    }

    @ApiOperation(value = "操作课程", notes = "")
    @PostMapping("/operate/{id}")
    public VoidRspDto operate(@PathVariable(value = "id") Long id) {
        return new VoidRspDto();
    }

}
