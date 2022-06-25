package com.lbo.code.timeqinsociety.web.dto.req;

import com.lbo.code.timeqinsociety.domain.enums.Status;
import com.lbo.code.timeqinsociety.domain.enums.SubjectKind;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveSubjectReqDto {

    @ApiModelProperty(value = "id")
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

    @ApiModelProperty(value = "备注")
    private String remark;
}
