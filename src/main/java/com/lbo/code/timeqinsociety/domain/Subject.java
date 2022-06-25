package com.lbo.code.timeqinsociety.domain;

import com.lbo.code.timeqinsociety.domain.enums.Status;
import com.lbo.code.timeqinsociety.domain.enums.SubjectKind;
import com.lbo.code.timeqinsociety.domain.enums.SubjectStatus;
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
 * 课程
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "教师id")
    private Long teacherId;

    @ApiModelProperty(value = "课程名称")
    private String title;

    @ApiModelProperty(value = "课程描述")
    private String description;

    @ApiModelProperty(value = "课程专业")
    private String speciality;

    @ApiModelProperty(value = "课程类型，一对一|小组课",example = "SINGLE")
    private SubjectKind kind;

    @ApiModelProperty(value = "教师工资")
    private Double salary;

    @ApiModelProperty(value = "状态")
    private Status status;

    @ApiModelProperty(value = "创建时间")
    private Date create_time;

    @ApiModelProperty(value = "备注")
    private String remark;

}
