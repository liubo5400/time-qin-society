package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 教师信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "教师姓名")
    private String name;

    @ApiModelProperty(value = "教师所在学校")
    private String school;

    @ApiModelProperty(value = "教师地址")
    private String address;

    @ApiModelProperty(value = "专业")
    private String speciality;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "状态")
    private Status status;

    @ApiModelProperty(value = "备注")
    private String remark;
}
