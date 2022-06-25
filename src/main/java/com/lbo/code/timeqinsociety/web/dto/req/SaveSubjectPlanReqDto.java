package com.lbo.code.timeqinsociety.web.dto.req;

import com.lbo.code.timeqinsociety.domain.enums.SubjectStatus;
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
public class SaveSubjectPlanReqDto {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "教师id")
    private Long teacherId;

    @ApiModelProperty(value = "学生id")
    private Long studentId;

    @ApiModelProperty(value = "课程id")
    private Long subjectId;

    @ApiModelProperty(value = "预约时间")
    private Date orderTime;

    @ApiModelProperty(value = "备注")
    private String remark;
}
