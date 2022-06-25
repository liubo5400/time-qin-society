package com.lbo.code.timeqinsociety.web.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QueryTeacherReqDto extends PagingReqDto {

    @ApiModelProperty(value = "教师姓名")
    private String name;

    @ApiModelProperty(value = "教师所在学校")
    private String school;

    @ApiModelProperty(value = "专业")
    private String speciality;
}
