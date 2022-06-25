package com.lbo.code.timeqinsociety.web.controller.admin;

import com.google.common.collect.Lists;
import com.lbo.code.timeqinsociety.domain.FinanceInfo;
import com.lbo.code.timeqinsociety.domain.Teacher;
import com.lbo.code.timeqinsociety.web.dto.req.QueryFinanceReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.QueryTeacherReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveFinanceReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveTeacherReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.CollectionRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 财务相关
 */
@Slf4j
@Api(tags = "财务管理相关")
@RestController
@RequestMapping(value = "/admin/finance")
public class FinanceAdminController {


    @ApiOperation(value = "财务列表", notes = "")
    @GetMapping("/list")
    public CollectionRspDto<FinanceInfo> list(@Valid @RequestBody QueryFinanceReqDto reqDto) {
        return new CollectionRspDto<>(0, Lists.newArrayList());
    }

    @ApiOperation(value = "保存财务", notes = "")
    @PostMapping
    public VoidRspDto save(@Valid @RequestBody SaveFinanceReqDto reqDto) {
        return new VoidRspDto();
    }

    @ApiOperation(value = "财务详情", notes = "")
    @GetMapping("/detail/{id}")
    public FinanceInfo detail(@PathVariable(value = "id") Long id) {
        return FinanceInfo.builder().build();
    }

    @ApiOperation(value = "操作财务", notes = "")
    @PostMapping("/operate/{id}")
    public VoidRspDto operate(@PathVariable(value = "id") Long id) {
        return new VoidRspDto();
    }

}
