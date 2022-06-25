package com.lbo.code.timeqinsociety.web.controller.admin;

import com.google.common.collect.Lists;
import com.lbo.code.timeqinsociety.domain.Subject;
import com.lbo.code.timeqinsociety.domain.SubjectPlan;
import com.lbo.code.timeqinsociety.web.dto.req.QuerySubjectPlanReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.QuerySubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveSubjectPlanReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveSubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.CollectionRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 课程计划预约相关
 */
@Slf4j
@Api(tags = "课程计划预约管理相关")
@RestController
@RequestMapping(value = "/admin/subject/plan")
public class SubjectPlanAdminController {


    @ApiOperation(value = "课程计划预约列表", notes = "")
    @GetMapping("/list")
    public CollectionRspDto<SubjectPlan> list(@Valid @RequestBody QuerySubjectPlanReqDto reqDto) {
        return new CollectionRspDto<>(0, Lists.newArrayList());
    }

    @ApiOperation(value = "保存课程计划预约", notes = "")
    @PostMapping
    public VoidRspDto save(@Valid @RequestBody SaveSubjectPlanReqDto reqDto) {
        return new VoidRspDto();
    }

    @ApiOperation(value = "课程计划预约详情", notes = "")
    @GetMapping("/detail/{id}")
    public SubjectPlan detail(@PathVariable(value = "id") Long id) {
        return SubjectPlan.builder().build();
    }

    @ApiOperation(value = "操作课程计划预约", notes = "")
    @PostMapping("/operate/{id}")
    public VoidRspDto operate(@PathVariable(value = "id") Long id) {
        return new VoidRspDto();
    }

}
