package com.lbo.code.timeqinsociety.web.controller.admin;

import com.google.common.collect.Lists;
import com.lbo.code.timeqinsociety.domain.Subject;
import com.lbo.code.timeqinsociety.domain.SubjectOrder;
import com.lbo.code.timeqinsociety.web.dto.req.QuerySubjectOrderReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.QuerySubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveSubjectOrderReqDto;
import com.lbo.code.timeqinsociety.web.dto.req.SaveSubjectReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.CollectionRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 课程订单相关
 */
@Slf4j
@Api(tags = "课程订单管理相关")
@RestController
@RequestMapping(value = "/admin/subject/order")
public class SubjectOrderAdminController {


    @ApiOperation(value = "课程订单列表", notes = "")
    @GetMapping("/list")
    public CollectionRspDto<SubjectOrder> list(@Valid @RequestBody QuerySubjectOrderReqDto reqDto) {
        return new CollectionRspDto<>(0, Lists.newArrayList());
    }

    @ApiOperation(value = "保存课程订单", notes = "")
    @PostMapping
    public VoidRspDto save(@Valid @RequestBody SaveSubjectOrderReqDto reqDto) {
        return new VoidRspDto();
    }

    @ApiOperation(value = "课程订单详情", notes = "")
    @GetMapping("/detail/{id}")
    public SubjectOrder detail(@PathVariable(value = "id") Long id) {
        return SubjectOrder.builder().build();
    }

    @ApiOperation(value = "操作课程订单", notes = "")
    @PostMapping("/operate/{id}")
    public VoidRspDto operate(@PathVariable(value = "id") Long id) {
        return new VoidRspDto();
    }

}
