package com.lbo.code.timeqinsociety.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 行为日志
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "behavior_log")
public class BehaviorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "操作时间")
    private Date postTime;

    @ApiModelProperty(value = "操作内容")
    private String content;

    @ApiModelProperty(value = "请求参数")
    private String reqParams;
}
