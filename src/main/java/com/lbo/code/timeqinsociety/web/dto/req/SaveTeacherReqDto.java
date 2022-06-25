package com.lbo.code.timeqinsociety.web.dto.req;

import com.lbo.code.timeqinsociety.domain.enums.Status;
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
public class SaveTeacherReqDto {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "教师姓名")
    private String name;

    @ApiModelProperty(value = "教师所在学校")
    private String school;

    @ApiModelProperty(value = "教师地址")
    private String address;

    @ApiModelProperty(value = "专业")
    private String speciality;

    @ApiModelProperty(value = "备注")
    private String remark;
}
